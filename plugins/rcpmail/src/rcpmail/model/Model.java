package rcpmail.model;

import java.util.Date;

import org.eclipse.core.databinding.observable.list.ObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;

public class Model {
	private static Model model;
	private ObservableList/*<Server>*/ servers = WritableList.withElementType(Server.class);

	public Model() {
		Server server = createServer();
		
		server.setHostname("My Mail Server");
		server.setPort(23);
		server.setUsername("test");
		
		Message message = ModelFactory.eINSTANCE.createMessage();
		
		message.setFrom("\"eBay Cash Machine\" <connectso@atechonline.net>");
		message.setDate(new Date().toString());
		message.setSpam(true);
		message.setSubject("[Spam] Quit Your Day Job Within 30 Days");
		message.setBody("Ever heard of the eBay ca$h machine ?\r\n" + 
					"\r\n" + 
					"\"How would you like an extra $250 - $1000 a week on eBay with 15 minutes of\r\n" + 
					"your time ?\"\r\n" + 
					"\r\n" + 
					" I've made it my job to help people succeed online.\r\n" + 
					"I'm constantly on the lookout for the best ways and means to make your job\r\n" + 
					"simpler, and I pass the good stuff on to you.\r\n" + 
					"\r\n" + 
					"I have developed the eBay Cash Machine - it allows everyone to make a great\r\n" + 
					"income on eBay 99% automatically. It only takes a few minutes to set up and\r\n" + 
					"once that is done you will have your own eBay Businesses that literally run\r\n" + 
					"on auto-pilot!\r\n" + 
					"You just wait for the money to come in!\r\n" + 
					"\r\n" + 
					"I have found a foolproof method how anyone can easily make an extra $250,\r\n" + 
					"$500 or even $1000 per week on eBay using my eBay Ca$h Machine.\r\n" + 
					"\r\n" + 
					"Now before I get to deep into the details let me tell you what the eBay\r\n" + 
					"Ca$h Machine ISN'T.\r\n" + 
					"\r\n" + 
					"It is NOT a promote my affiliate program to make m.oney!\r\n" + 
					"It is NOT a NOT A Get-Rich Q.uick Scheme!\r\n" + 
					"It is NOT a Face To Face Selling program of Any Kind!\r\n" + 
					"It is NOT a Trial Offer to sign up for!\r\n" + 
					"It is NOT some garbage product that refers you to purchase other garbage\r\n" + 
					"products.\r\n" + 
					"It is NOT a M.LM, a Pyramid Scheme, Gifting or anything else like that.\r\n" + 
					"It is NOT like anything you have ever seen.\r\n" + 
					"\r\n" + 
					"For Full Details please read the attached .html file\r\n" + 
					"\r\n" + 
					"To Unsubscribe please read the attached Unsubscribe.txt");

		server.getDefaultSelection().getMessages().add(message);
		
		addServer(server);
	}
	
	public void addServer(final Server server) {
		servers.add(server);
	}

	public void removeServer(Server child) {
		servers.remove(child);
	}

	public ObservableList/*<Server>*/ getServers() {
		return servers;
	}
	
	public Object getDefaultSelection() {
		return servers.size() > 0 ? ((Server) servers.get(0)).getDefaultSelection() : null;
	}

	public static Model getInstance() {
		if (model == null) {
			model = new Model();
		}
		return model;
	}

	public Server createServer() {
		Server server = ModelFactory.eINSTANCE.createServer();
				
		addFolder(server, createFolder("Inbox"));
		addFolder(server, createFolder("Drafts"));
		addFolder(server, createFolder("Sent"));
		addFolder(server, createFolder("Junk"));
		addFolder(server, createFolder("Trash"));
		
		return server;
	}
	
	private void addFolder(Server server, Folder folder) {
		server.getFolders().add(folder);
	}
	
	private Folder createFolder(String name) {
		Folder folder = ModelFactory.eINSTANCE.createFolder();
		folder.setName(name);
		return folder;
	}
}
