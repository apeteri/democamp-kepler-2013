package rcpmail;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import rcpmail.model.ModelManager;

public class Activator extends AbstractUIPlugin {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		ModelManager.INSTANCE.activate();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		ModelManager.INSTANCE.deactivate();
		super.stop(context);
	}
}
