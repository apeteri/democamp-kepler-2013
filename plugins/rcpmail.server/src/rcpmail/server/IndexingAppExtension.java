package rcpmail.server;

import org.eclipse.emf.cdo.spi.server.IAppExtension;

import org.eclipse.net4j.util.io.IOUtil;

import java.io.File;

public class IndexingAppExtension implements IAppExtension
{

  public IndexingAppExtension()
  {
  }

  @Override
  public void start(File configFile) throws Exception
  {
    IOUtil.OUT().println("IndexingAppExtension.start()");
  }

  @Override
  public void stop() throws Exception
  {
    IOUtil.OUT().println("IndexingAppExtension.stop()");
  }

}
