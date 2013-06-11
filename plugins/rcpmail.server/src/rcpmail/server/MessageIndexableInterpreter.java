package rcpmail.server;

import proj.zoie.api.indexing.ZoieIndexable;
import proj.zoie.api.indexing.ZoieIndexableInterpreter;
import rcpmail.model.Message;

public class MessageIndexableInterpreter implements ZoieIndexableInterpreter<Message>
{
  @Override
  public ZoieIndexable convertAndInterpret(Message src)
  {
    return new MessageIndexable(src);
  }
}
