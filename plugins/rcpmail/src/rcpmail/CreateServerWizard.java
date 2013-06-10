package rcpmail;

import org.eclipse.jface.wizard.Wizard;

import rcpmail.model.Folder;
import rcpmail.model.Model;
import rcpmail.model.ModelFactory;
import rcpmail.model.Server;

public class CreateServerWizard extends Wizard {
	private final Server server = ModelFactory.eINSTANCE.createServer();
	public CreateServerWizard() {
		// defaults
		addFolder(server, createFolder("Inbox"));
		addFolder(server, createFolder("Drafts"));
		addFolder(server, createFolder("Sent"));
		addFolder(server, createFolder("Junk"));
		addFolder(server, createFolder("Trash"));

		server.setHostname("localhost");
		server.setPort(23);
	}
	
	private void addFolder(Server server, Folder folder) {
		server.getFolders().add(folder);
	}
	
	private Folder createFolder(String name) {
		Folder folder = ModelFactory.eINSTANCE.createFolder();
		folder.setName(name);
		return folder;
	}
	public void addPages() {
		addPage(new CreateServerPage(server));
	}

	public String getWindowTitle() {
		return "Create Mail Server";
	}

	public boolean performFinish() {
		Model.getInstance().addServer(server);
		return true;
	}

}