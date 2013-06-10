package rcpmail;

import org.eclipse.jface.wizard.Wizard;

import rcpmail.model.Model;
import rcpmail.model.Server;

public class CreateServerWizard extends Wizard {

	private final Server server = Model.INSTANCE.createServer();
	
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
		Model.INSTANCE.addServer(server);
		return true;
	}

}