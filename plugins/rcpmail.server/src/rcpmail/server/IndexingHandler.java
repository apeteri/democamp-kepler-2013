package rcpmail.server;

import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.spi.server.ObjectWriteAccessHandler;

import org.eclipse.net4j.util.om.monitor.OMMonitor;
import org.eclipse.net4j.util.om.monitor.OMMonitor.Async;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.spi.cdo.InternalCDOObject;

import proj.zoie.api.DataConsumer.DataEvent;
import proj.zoie.api.ZoieException;
import rcpmail.model.Message;
import rcpmail.model.ModelFactory;
import rcpmail.model.ModelPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IndexingHandler extends ObjectWriteAccessHandler
{
  public static final IndexingHandler INSTANCE = new IndexingHandler();

  private List<DataEvent<MessageEvent>> dataEvents;

  private List<DataEvent<MessageEvent>> getDataEvents()
  {
    if (null == dataEvents)
    {
      dataEvents = new ArrayList<>();
    }

    return dataEvents;
  }

  @Override
  protected void handleTransactionBeforeCommitting(OMMonitor monitor) throws RuntimeException
  {
    OM.LOG.info("*** handleTransactionBeforeCommitting called");
  }

  @Override
  protected void handleTransactionAfterCommitted(OMMonitor monitor)
  {
    OM.LOG.info("*** handleTransactionAfterCommitted called");

    monitor.begin();
    Async async = null;

    try
    {
      async = monitor.forkAsync();

      getDataEvents().clear();
      String version = Long.toString(getCommitContext().getBranchPoint().getTimeStamp());
      registerDataEvents(version, getNewObjects());
      registerDataEvents(version, getDirtyObjects());
      registerDeleteDataEvents(version, getCommitContext().getDetachedObjectTypes());

      try
      {
        IndexingAppExtension.getInstance().consume(getDataEvents());
      }
      catch (ZoieException ex)
      {
        // Uh-oh
        ex.printStackTrace();
      }
    }
    finally
    {
      if (null != async)
      {
        async.stop();
      }
    }
  }

  private void registerDataEvents(String version, EObject[] eObjects)
  {
    for (EObject eObject : eObjects)
    {
      if (eObject.eClass() == ModelPackage.Literals.MESSAGE)
      {
        getDataEvents().add(new DataEvent<>(new MessageEvent((Message)eObject), version));
      }
    }
  }

  private void registerDeleteDataEvents(String version, Map<CDOID, EClass> detachedObjectTypes)
  {
    if (null == detachedObjectTypes)
    {
      return;
    }

    for (Entry<CDOID, EClass> detachedObjectEntry : detachedObjectTypes.entrySet())
    {
      if (detachedObjectEntry.getValue() == ModelPackage.Literals.MESSAGE)
      {
        Message detachedMessage = ModelFactory.eINSTANCE.createMessage();
        ((InternalCDOObject)detachedMessage).cdoInternalSetID(detachedObjectEntry.getKey());
        ((InternalCDOObject)detachedMessage).cdoInternalSetState(CDOState.TRANSIENT);
        getDataEvents().add(new DataEvent<>(new MessageEvent(detachedMessage), version));
      }
    }
  }
}
