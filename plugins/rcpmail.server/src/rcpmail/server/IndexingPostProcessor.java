package rcpmail.server;

import org.eclipse.emf.cdo.server.IRepository;

import org.eclipse.net4j.util.container.IElementProcessor;
import org.eclipse.net4j.util.container.IManagedContainer;

public class IndexingPostProcessor implements IElementProcessor
{
  @Override
  public Object process(IManagedContainer container, String productGroup, String factoryType, String description,
      Object element)
  {
    if (element instanceof IRepository)
    {
      IRepository repository = (IRepository)element;
      repository.addHandler(IndexingHandler.INSTANCE);
    }

    return element;
  }
}
