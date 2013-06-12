package rcpmail.server;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;

import proj.zoie.api.indexing.ZoieIndexable;

public class MessageEventIndexable implements ZoieIndexable
{
  private MessageEvent event;

  public MessageEventIndexable(MessageEvent event)
  {
    this.event = event;
  }

  @Override
  public long getUID()
  {
    return event.getUid();
  }

  @Override
  public boolean isDeleted()
  {
    return event.isDeleted();
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

    doc.add(new Field("from", event.getFrom(), Store.NO, Index.ANALYZED));
    doc.add(new Field("subject", event.getSubject(), Store.NO, Index.ANALYZED));
    doc.add(new Field("body", event.getBody(), Store.NO, Index.ANALYZED));

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
