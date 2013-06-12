package rcpmail.server;

import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.server.IQueryContext;
import org.eclipse.emf.cdo.spi.server.IAppExtension;

import org.eclipse.net4j.util.container.IPluginContainer;

import org.apache.log4j.BasicConfigurator;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.MultiReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;

import proj.zoie.api.DataConsumer.DataEvent;
import proj.zoie.api.ZoieException;
import proj.zoie.api.ZoieIndexReader;
import proj.zoie.api.ZoieIndexReader.SubReaderAccessor;
import proj.zoie.api.ZoieIndexReader.SubReaderInfo;
import proj.zoie.api.indexing.ZoieIndexableInterpreter;
import proj.zoie.impl.indexing.ZoieConfig;
import proj.zoie.impl.indexing.ZoieSystem;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class IndexingAppExtension implements IAppExtension
{
  static IndexingAppExtension instance;

  static IndexingAppExtension getInstance()
  {
    return instance;
  }

  private ZoieSystem<IndexReader, MessageEvent> zoieSystem;

  @Override
  public void start(File configFile) throws Exception
  {
    // Add post-processor, run it on existing repository instance(s) as well
    IPluginContainer.INSTANCE.addPostProcessor(new IndexingPostProcessor(), true);

    BasicConfigurator.configure();

    // Initialize indexing subsystem
    File indexDirectory = new File("indexes");
    ZoieIndexableInterpreter<MessageEvent> interpreter = new MessageEventIndexableInterpreter();
    zoieSystem = ZoieSystem.buildDefaultInstance(indexDirectory, interpreter, new ZoieConfig());
    zoieSystem.start();

    OM.LOG.info("IndexingAppExtension started");
    instance = this;
  }

  @Override
  public void stop() throws Exception
  {
    if (null != zoieSystem)
    {
      zoieSystem.stop();
      zoieSystem = null;
    }

    instance = null;
    OM.LOG.info("IndexingAppExtension stopped");
  }

  public void consume(List<DataEvent<MessageEvent>> dataEvents) throws ZoieException
  {
    zoieSystem.consume(dataEvents);
  }

  public void search(Query query, int maxResults, IQueryContext context) throws IOException
  {
    List<ZoieIndexReader<IndexReader>> readerList = zoieSystem.getIndexReaders();
    SubReaderAccessor<ZoieIndexReader<IndexReader>> subReaderAccessor = ZoieIndexReader
        .getSubReaderAccessor(readerList);
    MultiReader reader = new MultiReader(readerList.toArray(new IndexReader[readerList.size()]), false);

    try (IndexSearcher searcher = new IndexSearcher(reader))
    {
      TopDocs topDocs = searcher.search(query, maxResults);
      ScoreDoc[] scoreDocs = topDocs.scoreDocs;

      for (ScoreDoc scoreDoc : scoreDocs)
      {
        int documentId = scoreDoc.doc;
        SubReaderInfo<ZoieIndexReader<IndexReader>> subReaderInfo = subReaderAccessor.getSubReaderInfo(documentId);
        long cdoId = subReaderInfo.subreader.getUID(documentId);
        if (cdoId != ZoieIndexReader.DELETED_UID)
        {
          context.addResult(CDOIDUtil.createLong(cdoId));
        }
      }
    }

    zoieSystem.returnIndexReaders(readerList);
  }
}
