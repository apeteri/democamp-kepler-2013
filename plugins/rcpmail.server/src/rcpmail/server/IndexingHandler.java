package rcpmail.server;

import org.eclipse.emf.cdo.spi.server.ObjectWriteAccessHandler;

import org.eclipse.net4j.util.om.monitor.OMMonitor;

public class IndexingHandler extends ObjectWriteAccessHandler
{
  public static final IndexingHandler INSTANCE = new IndexingHandler();

  @Override
  protected void handleTransactionBeforeCommitting(OMMonitor monitor) throws RuntimeException
  {
    OM.LOG.info("*** handleTransactionBeforeCommitting called");
    super.handleTransactionBeforeCommitting(monitor);
  }

  @Override
  protected void handleTransactionAfterCommitted(OMMonitor monitor)
  {
    OM.LOG.info("*** handleTransactionAfterCommitted called");
    super.handleTransactionAfterCommitted(monitor);
  }
}
