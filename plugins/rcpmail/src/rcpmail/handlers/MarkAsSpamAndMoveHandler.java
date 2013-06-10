package rcpmail.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import rcpmail.model.Message;
import rcpmail.model.ModelManager;

public class MarkAsSpamAndMoveHandler extends AbstractHandler implements
		IHandler {
	
	public static final String MARK_AS_SPAM_COMMAND_ID = "rcpmail.markAsSpamAndMove";

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) sel;
			Iterator<?> i = selection.iterator();
			while (i.hasNext()) {
				Message msg = (Message) i.next();
				ModelManager.INSTANCE.markAndMoveMessage(msg);
			}
		}
		return null;
	}
}
