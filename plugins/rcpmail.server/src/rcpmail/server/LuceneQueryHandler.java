package rcpmail.server;

import org.eclipse.emf.cdo.common.util.CDOQueryInfo;
import org.eclipse.emf.cdo.server.IQueryContext;
import org.eclipse.emf.cdo.server.IQueryHandler;
import org.eclipse.emf.cdo.spi.server.QueryHandlerFactory;

import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.factory.ProductCreationException;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.Query;
import org.apache.lucene.util.Version;

import java.io.IOException;

public class LuceneQueryHandler implements IQueryHandler
{
  @Override
  public void executeQuery(CDOQueryInfo info, IQueryContext context)
  {
    String language = info.getQueryLanguage();
    if (!"lucene".equals(language))
    {
      throw new IllegalArgumentException("Unsupported query language: " + language);
    }

    String query = info.getQueryString();
    QueryParser parser = new QueryParser(Version.LUCENE_35, "body", new StandardAnalyzer(Version.LUCENE_35));
    final Query parsedQuery;

    try
    {
      parsedQuery = parser.parse(query);
    }
    catch (ParseException ex)
    {
      throw WrappedException.wrap(ex);
    }

    int maxResults = info.getMaxResults();

    try
    {
      IndexingAppExtension.getInstance().search(parsedQuery, maxResults, context);
    }
    catch (IOException ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  public static class Factory extends QueryHandlerFactory
  {
    public Factory()
    {
      super("lucene");
    }

    @Override
    public IQueryHandler create(String description) throws ProductCreationException
    {
      return new LuceneQueryHandler();
    }
  }
}
