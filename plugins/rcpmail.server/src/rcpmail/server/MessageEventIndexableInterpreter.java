package rcpmail.server;

import proj.zoie.api.indexing.ZoieIndexable;
import proj.zoie.api.indexing.ZoieIndexableInterpreter;

public class MessageEventIndexableInterpreter implements ZoieIndexableInterpreter<MessageEvent>
{
  @Override
  public ZoieIndexable convertAndInterpret(MessageEvent src)
  {
    return new MessageEventIndexable(src);
  }
}
