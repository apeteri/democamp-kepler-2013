package rcpmail.server;

import org.eclipse.emf.cdo.spi.server.ObjectWriteAccessHandler;

import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.net4j.util.om.monitor.OMMonitor;

public class IndexingHandler extends ObjectWriteAccessHandler
{
  public static final IndexingHandler INSTANCE = new IndexingHandler();

  @Override
  protected void handleTransactionBeforeCommitting(OMMonitor monitor) throws RuntimeException
  {
    IOUtil.OUT().println("handleTransactionBeforeCommitting");
    super.handleTransactionBeforeCommitting(monitor);
  }

  @Override
  protected void handleTransactionAfterCommitted(OMMonitor monitor)
  {
    IOUtil.OUT().println("handleTransactionAfterCommitted");
    super.handleTransactionAfterCommitted(monitor);
  }
}
