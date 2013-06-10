package rcpmail;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import rcpmail.model.Model;

public class Activator extends AbstractUIPlugin {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		Model.INSTANCE.activate();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		Model.INSTANCE.deactivate();
		super.stop(context);
	}
}
