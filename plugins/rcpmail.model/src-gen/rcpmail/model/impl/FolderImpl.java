/**
 */
package rcpmail.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rcpmail.model.Folder;
import rcpmail.model.Message;
import rcpmail.model.ModelPackage;
import rcpmail.model.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rcpmail.model.impl.FolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link rcpmail.model.impl.FolderImpl#getServer <em>Server</em>}</li>
 *   <li>{@link rcpmail.model.impl.FolderImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link rcpmail.model.impl.FolderImpl#getMessageCount <em>Message Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FolderImpl extends CDOObjectImpl implements Folder
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FolderImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelPackage.Literals.FOLDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected int eStaticFeatureCount()
  {
    return 0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return (String)eGet(ModelPackage.Literals.FOLDER__NAME, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    eSet(ModelPackage.Literals.FOLDER__NAME, newName);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Server getServer()
  {
    return (Server)eGet(ModelPackage.Literals.FOLDER__SERVER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServer(Server newServer)
  {
    eSet(ModelPackage.Literals.FOLDER__SERVER, newServer);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Message> getMessages()
  {
    return (EList<Message>)eGet(ModelPackage.Literals.FOLDER__MESSAGES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public int getMessageCount()
  {
    return getMessages().size();
  }

} //FolderImpl
