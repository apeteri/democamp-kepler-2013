package rcpmail;

import java.util.List;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.masterdetail.MasterDetailObservables;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapCellLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.part.ViewPart;

import rcpmail.model.Folder;
import rcpmail.model.Message;
import rcpmail.model.ModelManager;
import rcpmail.model.ModelPackage;

public class MessageTableView extends ViewPart implements ISelectionListener {

	private Table table;
	private TableViewer tableViewer;
	private final WritableValue selectedFolder = new WritableValue();
	private LocalResourceManager resourceManager = new LocalResourceManager(
			JFaceResources.getResources());
	private Color gray;
	private Font italics;

	public static final String ID = "rcpmail.MessageTableView";

	/**
	 * Create contents of the view part
	 * 
	 * @param parent
	 */
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));

		Text searchField = new Text(container, SWT.BORDER);
		searchField.setLayoutData(GridDataFactory.fillDefaults().align(SWT.FILL, SWT.BEGINNING).grab(true, false).create());
		
		tableViewer = new TableViewer(container, SWT.FULL_SELECTION
				| SWT.MULTI | SWT.BORDER) {
			// The following is a workaround for bug 269264.
			public void remove(Object[] elements) {
				int oldIndex = -1;
				Table table = tableViewer.getTable();
				int[] selectionIndices = table.getSelectionIndices();
				if (selectionIndices.length > 0) {
					oldIndex = selectionIndices[0];
				}
				super.remove(elements);
				if (oldIndex != -1) {
					if (table.getItemCount() > oldIndex) {
						table.setSelection(oldIndex);
					} else if (table.getItemCount() > 0) {
						table.setSelection(table.getItemCount() - 1);
					}
				}
				setSelection(getSelection(), false);
			}
		};
		table = tableViewer.getTable();
		table.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		TableViewerColumn columnFrom = new TableViewerColumn(tableViewer, SWT.NONE);
		columnFrom.getColumn().setWidth(95);
		columnFrom.getColumn().setText("From");
		
		TableViewerColumn columnSubject = new TableViewerColumn(tableViewer, SWT.NONE);
		columnSubject.getColumn().setWidth(300);
		columnSubject.getColumn().setText("Subject");
		
		TableViewerColumn columnDate = new TableViewerColumn(tableViewer, SWT.NONE);
		columnDate.getColumn().setWidth(85);
		columnDate.getColumn().setText("Date");
		
		initializeToolBar();
		initializeMenu();
		initializeContextMenu();

		final IObservableList messagesOfSelectedFolder = MasterDetailObservables.detailList(
				selectedFolder, 
				EMFProperties
						.list(ModelPackage.Literals.FOLDER__MESSAGES)
						.listFactory(), 
				null);
		
		ISWTObservableValue searchText = SWTObservables.observeText(searchField, SWT.Modify);
		ISWTObservableValue delayedText = SWTObservables.observeDelayedValue(500, searchText);
		delayedText.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				if (((String) event.diff.getNewValue()).isEmpty()) {
					tableViewer.setInput(messagesOfSelectedFolder);
					tableViewer.refresh();
					updateSelection(messagesOfSelectedFolder);
				} else {
					WritableList searchResults = new WritableList(ModelManager.INSTANCE.query((String) event.diff.getNewValue()), Message.class);
					tableViewer.setInput(searchResults);
					tableViewer.refresh();
					updateSelection(searchResults);
				}
			}
		});

		gray = resourceManager.createColor(new RGB(100, 100, 100));
		italics = resourceManager.createFont(FontDescriptor.createFrom(
				JFaceResources.getDialogFont()).setStyle(SWT.ITALIC));

		ObservableListContentProvider contentProvider = new ObservableListContentProvider();
		tableViewer.setContentProvider(contentProvider);
		initLabelProvider(columnFrom, ModelPackage.Literals.MESSAGE__FROM, contentProvider);
		initLabelProvider(columnSubject, ModelPackage.Literals.MESSAGE__SUBJECT, contentProvider);
		initLabelProvider(columnDate, ModelPackage.Literals.MESSAGE__DATE, contentProvider);
		
		tableViewer.setInput(messagesOfSelectedFolder);
		
		ISelectionService selectionService = (ISelectionService) getSite()
				.getService(ISelectionService.class);
		selectionService.addSelectionListener(this);

		getSite().setSelectionProvider(tableViewer);

		IContextService contextService = (IContextService) getSite()
				.getService(IContextService.class);
		contextService.activateContext("rcpmail.context.messages");
	}

	private void initLabelProvider(TableViewerColumn column,
			EStructuralFeature feature, ObservableListContentProvider contentProvider) {
		
		column.setLabelProvider(new ObservableMapCellLabelProvider(
				Properties.observeEach(
						contentProvider.getKnownElements(), 
						EMFProperties.values(feature, ModelPackage.Literals.MESSAGE__SPAM))){

			public void update(ViewerCell cell) {
				super.update(cell);
				if (((Message)cell.getElement()).isSpam()) {
					cell.setForeground(gray);
					cell.setFont(italics);
				} else {
					cell.setFont(tableViewer.getTable().getFont());
					cell.setForeground(tableViewer.getTable().getForeground());
				}
			}
		});
	}

	private void initializeContextMenu() {
		MenuManager manager = new MenuManager();
		manager.setRemoveAllWhenShown(true);
		manager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				manager.add(new GroupMarker(
						IWorkbenchActionConstants.MB_ADDITIONS));
			}
		});
		Menu contextMenu = manager.createContextMenu(table);
		table.setMenu(contextMenu);
		getSite().registerContextMenu(manager, tableViewer);
	}

	private void initializeToolBar() {
		getViewSite().getActionBars().getToolBarManager();
	}

	private void initializeMenu() {
		getViewSite().getActionBars().getMenuManager();
	}

	// it is important to implement setFocus()!
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object element = structuredSelection.getFirstElement();
			if (element instanceof Folder) {
				Folder folder = (Folder) element;
				selectedFolder.setValue(folder);
				EList<Message> messages = folder.getMessages();
				updateSelection(messages);
			}
		}
	}

	private void updateSelection(List<?> messages) {
		if (messages.size() > 0) {
			tableViewer.setSelection(new StructuredSelection(messages.get(0)));
		}
	}
	
	public void dispose() {
		super.dispose();
		resourceManager.dispose();
	}
}
