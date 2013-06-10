/*
 * Copyright (c) 2009-2012 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 *    András Péteri - adapted to Kepler DemoCamp demo
 *    
 *  Initial Publication:
 *    Eclipse Magazin - http://www.eclipse-magazin.de
 */
package rcpmail.model;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

/**
 * @author Eike Stepper
 * @author András Péteri
 */
public class ModelManager extends Lifecycle {

	public static final ModelManager INSTANCE = new ModelManager();

	private CDONet4jSession session;

	private CDOView view;

	private CDOResource serverResource;

	public void addServer(final Server server) {
		modify(serverResource, new ITransactionalOperation<CDOResource>() {
			@Override
			public Object execute(CDOResource object) {
				object.getContents().add(server);
				return object;
			}
		});
	}

	public void removeServer(final Server server) {
		modify(serverResource, new ITransactionalOperation<CDOResource>() {
			@Override
			public Object execute(CDOResource object) {
				object.getContents().remove(server);
				return object;
			}
		});
	}

	public void trashMessage(Message msg) {
		modify(msg, new ITransactionalOperation<Message>() {
			@Override
			public Object execute(Message object) {
				Folder trash = getTrash(object.getFolder().getServer().getFolders());
				Folder current = object.getFolder();
				if (trash != current) {
					trash.getMessages().add(object);
				} else {
					trash.getMessages().remove(object);
				}
				return object;
			}

			private Folder getTrash(List<Folder> folders) {
				for (Folder folder : folders) {
					if ("Trash".equals(folder.getName())) {
						return folder;
					}
				}
				return null;
			}
		});
	}
	
	public void markAndMoveMessage(Message msg) {
		modify(msg, new ITransactionalOperation<Message>() {
			@Override
			public Message execute(Message object) {
				object.setSpam(true);
				Folder junk = object.getFolder().getServer().getJunkFolder();
				Folder current = object.getFolder();
				if (current != junk) {
					junk.getMessages().add(object);
				}
				return object;
			}
		});
	}

	public synchronized CDOResource getServerResource() {

		if (null == serverResource) {
			String path = "/servers";
			if (!view.hasResource(path)) {
				CDOTransaction transaction = session.openTransaction();

				try {
					CDOResource resource = transaction.createResource(path);
					Server initialServer = createInitialServer();
					resource.getContents().add(initialServer);
					transaction.commit();

				} catch (CommitException ex) {
					throw WrappedException.wrap(ex);
				} finally {
					transaction.close();
				}
			}

			serverResource = view.getResource(path);
		}

		return serverResource;
	}

	private Server createInitialServer() {
		
		Server initialServer = createServer();
		initialServer.setHostname("mailserver.hu");
		initialServer.setUsername("user1");
		initialServer.setPort(25);

		Message message = ModelFactory.eINSTANCE.createMessage();

		message.setFrom("\"eBay Cash Machine\" <connectso@atechonline.net>");
		message.setDate(new Date().toString());
		message.setSpam(true);
		message.setSubject("[Spam] Quit Your Day Job Within 30 Days");
		message.setBody("Ever heard of the eBay ca$h machine ?\r\n"
				+ "\r\n"
				+ "\"How would you like an extra $250 - $1000 a week on eBay with 15 minutes of\r\n"
				+ "your time ?\"\r\n"
				+ "\r\n"
				+ " I've made it my job to help people succeed online.\r\n"
				+ "I'm constantly on the lookout for the best ways and means to make your job\r\n"
				+ "simpler, and I pass the good stuff on to you.\r\n"
				+ "\r\n"
				+ "I have developed the eBay Cash Machine - it allows everyone to make a great\r\n"
				+ "income on eBay 99% automatically. It only takes a few minutes to set up and\r\n"
				+ "once that is done you will have your own eBay Businesses that literally run\r\n"
				+ "on auto-pilot!\r\n"
				+ "You just wait for the money to come in!\r\n"
				+ "\r\n"
				+ "I have found a foolproof method how anyone can easily make an extra $250,\r\n"
				+ "$500 or even $1000 per week on eBay using my eBay Ca$h Machine.\r\n"
				+ "\r\n"
				+ "Now before I get to deep into the details let me tell you what the eBay\r\n"
				+ "Ca$h Machine ISN'T.\r\n"
				+ "\r\n"
				+ "It is NOT a promote my affiliate program to make m.oney!\r\n"
				+ "It is NOT a NOT A Get-Rich Q.uick Scheme!\r\n"
				+ "It is NOT a Face To Face Selling program of Any Kind!\r\n"
				+ "It is NOT a Trial Offer to sign up for!\r\n"
				+ "It is NOT some garbage product that refers you to purchase other garbage\r\n"
				+ "products.\r\n"
				+ "It is NOT a M.LM, a Pyramid Scheme, Gifting or anything else like that.\r\n"
				+ "It is NOT like anything you have ever seen.\r\n"
				+ "\r\n"
				+ "For Full Details please read the attached .html file\r\n"
				+ "\r\n"
				+ "To Unsubscribe please read the attached Unsubscribe.txt");

		initialServer
				.getDefaultSelection()
				.getMessages()
				.add(message);
		
		return initialServer;
	}

	public Object getDefaultSelection() {
		EList<EObject> servers = getServerResource().getContents();
		return servers.size() > 0 
				? ((Server) servers.get(0)).getDefaultSelection() 
				: null;
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

	public <T extends CDOObject> Object modify(T object,
			ITransactionalOperation<T> operation) {
		CDOTransaction transaction = session.openTransaction();

		try {
			T transactionalObject = transaction.getObject(object);
			Object result = operation.execute(transactionalObject);
			transaction.commit();

			if (result instanceof CDOObject) {
				return view.getObject((CDOObject) result);
			}

			return result;
		} catch (CommitException ex) {
			throw WrappedException.wrap(ex);
		} finally {
			transaction.close();
		}
	}

	@Override
	protected void doActivate() throws Exception {
		super.doActivate();

		IConnector connector = Net4jUtil.getConnector(
				IPluginContainer.INSTANCE, "tcp", "localhost");

		CDONet4jSessionConfiguration config = CDONet4jUtil
				.createNet4jSessionConfiguration();
		config.setConnector(connector);
		config.setRepositoryName("repo1");

		session = config.openNet4jSession();
		view = session.openView();
		view.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
	}

	@Override
	protected void doDeactivate() throws Exception {
		session.close();
		session = null;
		view = null;
		super.doDeactivate();
	}
}
