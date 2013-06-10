package rcpmail.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import rcpmail.model.Message;
import rcpmail.model.ModelManager;

public class DeleteMessageHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) sel;
			if (selection.getFirstElement() instanceof Message) {
				Message msg = (Message) selection.getFirstElement();
				ModelManager.INSTANCE.trashMessage(msg);
			}
		}
		return null;
	}
}
