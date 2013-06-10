package rcpmail.model.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rcpmail.model.ModelPackage;

public final class FolderAdapter extends AdapterImpl {
	
	private final class NonTouchNotification extends ENotificationImpl {
		
		private NonTouchNotification(InternalEObject notifier, 
				int eventType, 
				EStructuralFeature feature) {
			
			super(notifier, eventType, feature, null, null);
		}

		@Override
		public boolean isTouch() {
			return false;
		}
	}

	@Override
	public void notifyChanged(Notification msg) {
		if (isMessagesChange(msg.getFeature()) && isListChange(msg.getEventType())) {
			InternalEObject eObject = (InternalEObject) getTarget();
			NotificationImpl impl = new NonTouchNotification(
					eObject, 
					Notification.SET,
					ModelPackage.Literals.FOLDER__MESSAGE_COUNT);
			
			impl.dispatch();
		} else {
			super.notifyChanged(msg);
		}
	}

	private boolean isMessagesChange(Object feature) {
		return (ModelPackage.Literals.FOLDER__MESSAGES == feature);
	}

	private boolean isListChange(int eventType) {
		return (Notification.ADD == eventType) || (Notification.REMOVE == eventType);
	}
}