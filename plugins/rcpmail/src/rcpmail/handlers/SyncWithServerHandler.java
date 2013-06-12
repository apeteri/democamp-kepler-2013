package rcpmail.handlers;

import static org.apache.commons.lang.StringUtils.left;
import static org.apache.commons.lang.StringUtils.lowerCase;
import static org.apache.commons.lang.StringUtils.replace;

import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import rcpmail.model.Folder;
import rcpmail.model.Message;
import rcpmail.model.ModelFactory;
import rcpmail.model.ModelManager;

public class SyncWithServerHandler extends AbstractHandler implements IHandler {

	private static int globalId = 0;
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {
			Object selected = ((IStructuredSelection) currentSelection)
					.getFirstElement();
			if (selected instanceof Folder) {
				final Folder folder = (Folder) selected;
				Job syncJob = new Job("Synchronize") {
					protected IStatus run(IProgressMonitor monitor) {
						final Random rnd = new Random();
						int messagesToGenerate = rnd.nextInt(20) + 10;
						monitor.beginTask(getName(), messagesToGenerate);
						
						for (int i = 0; i < messagesToGenerate; i++) {
							try {
								Thread.sleep(400);
							} catch (InterruptedException e) {
								Thread.currentThread().interrupt();
							}
							
							Message message = ModelFactory.eINSTANCE.createMessage();
							
							message.setId(++globalId);
							message.setDate(new Date().toString());
							message.setSpam(rnd.nextBoolean());
							
							String from = ModelManager.INSTANCE.getLine();
							String subject = ModelManager.INSTANCE.getLine();
							
							message.setFrom("\"" 
									+ WordUtils.capitalize(left(from, 15)) 
									+ "\" <" 
									+ lowerCase(replace(left(from, 7), " ", "")) 
									+ "@nosuchmail.org>");
							
							message.setSubject(StringUtils.capitalize(left(subject, 60)) + "...");
							message.setBody(ModelManager.INSTANCE.getLines(5));
							
							ModelManager.INSTANCE.addMessage(folder, message);
							monitor.worked(1);
						}
						monitor.done();
						return Status.OK_STATUS;
					}
				};
				syncJob.schedule();
			}
		}
		return null;
	}
}
