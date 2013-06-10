/**
 */
package rcpmail.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import rcpmail.model.Folder;
import rcpmail.model.ModelPackage;
import rcpmail.model.Server;

import com.google.common.base.Objects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rcpmail.model.impl.ServerImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link rcpmail.model.impl.ServerImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link rcpmail.model.impl.ServerImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link rcpmail.model.impl.ServerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link rcpmail.model.impl.ServerImpl#getFolders <em>Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerImpl extends CDOObjectImpl implements Server
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServerImpl()
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
    return ModelPackage.Literals.SERVER;
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
  public String getHostname()
  {
    return (String)eGet(ModelPackage.Literals.SERVER__HOSTNAME, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostname(String newHostname)
  {
    eSet(ModelPackage.Literals.SERVER__HOSTNAME, newHostname);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsername()
  {
    return (String)eGet(ModelPackage.Literals.SERVER__USERNAME, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsername(String newUsername)
  {
    eSet(ModelPackage.Literals.SERVER__USERNAME, newUsername);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPassword()
  {
    return (String)eGet(ModelPackage.Literals.SERVER__PASSWORD, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(String newPassword)
  {
    eSet(ModelPackage.Literals.SERVER__PASSWORD, newPassword);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPort()
  {
    return (Integer)eGet(ModelPackage.Literals.SERVER__PORT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(int newPort)
  {
    eSet(ModelPackage.Literals.SERVER__PORT, newPort);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Folder> getFolders()
  {
    return (EList<Folder>)eGet(ModelPackage.Literals.SERVER__FOLDERS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Folder getDefaultSelection()
  {
    Server _this = this;
    EList<Folder> _folders = _this.getFolders();
    final Function1<Folder,Boolean> _function = new Function1<Folder,Boolean>()
    {
        public Boolean apply(final Folder f)
        {
          String _name = f.getName();
          boolean _equals = Objects.equal(_name, "Inbox");
          return Boolean.valueOf(_equals);
        }
      };
    Folder _findFirst = IterableExtensions.<Folder>findFirst(_folders, _function);
    return _findFirst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Folder getJunkFolder()
  {
    Server _this = this;
    EList<Folder> _folders = _this.getFolders();
    final Function1<Folder,Boolean> _function = new Function1<Folder,Boolean>()
    {
        public Boolean apply(final Folder f)
        {
          String _name = f.getName();
          boolean _equals = Objects.equal(_name, "Junk");
          return Boolean.valueOf(_equals);
        }
      };
    Folder _findFirst = IterableExtensions.<Folder>findFirst(_folders, _function);
    return _findFirst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case ModelPackage.SERVER___GET_DEFAULT_SELECTION:
        return getDefaultSelection();
      case ModelPackage.SERVER___GET_JUNK_FOLDER:
        return getJunkFolder();
    }
    return super.eInvoke(operationID, arguments);
  }

} //ServerImpl
