package rcpmail;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;

import rcpmail.model.Folder;
import rcpmail.model.Model;
import rcpmail.model.ModelPackage;
import rcpmail.model.Server;

public class MailContentProvider extends ObservableListTreeContentProvider {

	public MailContentProvider() {
		super(getObservableListFactory(), getTreeStructureAdvisor());
	}

	// This factory returns an observable list of children for the given parent.
	private static IObservableFactory getObservableListFactory() {
		return new IObservableFactory() {
			public IObservable createObservable(Object parent) {
				if (parent instanceof Model) {
					return ((Model) parent).getServers();
				}
				if (parent instanceof Server) {
					return EMFProperties.list(ModelPackage.Literals.SERVER__FOLDERS).observe(parent);
				}
				return null;
			}
		};
	}

	// The following is optional, you can pass null as the advisor, but then
	// setSelection() will not find elements that have not been expanded.
	private static TreeStructureAdvisor getTreeStructureAdvisor() {
		return new TreeStructureAdvisor() {
			public Object getParent(Object element) {
				if (element instanceof Folder) {
					return ((Folder) element).getServer();
				}
				if (element instanceof Server) {
					return Model.getInstance();
				}
				return super.getParent(element);
			}
		};
	}
}
