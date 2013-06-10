package rcpmail.model;

import org.eclipse.core.databinding.observable.list.ObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;

public class Model {
	private static Model model;
	private ObservableList/*<Server>*/ servers = WritableList.withElementType(Server.class);

	public Model() {
		Server server = ModelFactory.eINSTANCE.createServer();
		server.setHostname("My Mail Server");
		server.setPort(23);
		server.setUsername("test");
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
}
