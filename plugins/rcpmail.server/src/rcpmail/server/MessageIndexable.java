package rcpmail.server;

import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;

import proj.zoie.api.indexing.ZoieIndexable;
import rcpmail.model.Message;

public class MessageIndexable implements ZoieIndexable
{
  private Message message;

  public MessageIndexable(Message message)
  {
    this.message = message;
  }

  @Override
  public long getUID()
  {
    return CDOIDUtil.getLong(message.cdoID());
  }

  @Override
  public boolean isDeleted()
  {
    return message.cdoState() == CDOState.TRANSIENT;
  }

  @Override
  public boolean isSkip()
  {
    return false;
  }

  @Override
  public IndexingReq[] buildIndexingReqs()
  {
    Document doc = new Document();
    doc.add(new Field("from", message.getFrom(), Store.NO, Index.ANALYZED));
    doc.add(new Field("subject", message.getSubject(), Store.NO, Index.ANALYZED));
    doc.add(new Field("body", message.getBody(), Store.NO, Index.ANALYZED));

    return new IndexingReq[] { new IndexingReq(doc) };
  }

  @Override
  public boolean isStorable()
  {
    return false;
  }

  @Override
  public byte[] getStoreValue()
  {
    return null;
  }
}
