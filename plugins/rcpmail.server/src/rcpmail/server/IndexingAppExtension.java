package rcpmail.server;

import org.eclipse.emf.cdo.spi.server.IAppExtension;

import org.eclipse.net4j.util.container.IPluginContainer;

import java.io.File;

public class IndexingAppExtension implements IAppExtension
{

  @Override
  public void start(File configFile) throws Exception
  {
    // Run the post-processor on the existing repository instance as well
    IPluginContainer.INSTANCE.addPostProcessor(new IndexingPostProcessor(), true);
  }

  @Override
  public void stop() throws Exception
  {
    // No-op
  }
}
