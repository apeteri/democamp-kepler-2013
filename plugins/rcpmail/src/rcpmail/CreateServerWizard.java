package rcpmail;

import org.eclipse.jface.wizard.Wizard;

import rcpmail.model.ModelManager;
import rcpmail.model.Server;

public class CreateServerWizard extends Wizard {

	private final Server server = ModelManager.INSTANCE.createServer();
	
	public CreateServerWizard() {
		server.setHostname("localhost");
		server.setPort(23);
	}
	
	public void addPages() {
		addPage(new CreateServerPage(server));
	}

	public String getWindowTitle() {
		return "Create Mail Server";
	}

	public boolean performFinish() {
		ModelManager.INSTANCE.addServer(server);
		return true;
	}

}