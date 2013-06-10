/**
 */
package rcpmail.model.impl;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import rcpmail.model.Folder;
import rcpmail.model.ModelPackage;
import rcpmail.model.Server;

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
public class ServerImpl extends MinimalEObjectImpl.Container implements Server
{
  /**
   * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected static final String HOSTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected String hostname = HOSTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected static final String USERNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected String username = USERNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected static final String PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected String password = PASSWORD_EDEFAULT;

  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final int PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected int port = PORT_EDEFAULT;

  /**
   * The cached value of the '{@link #getFolders() <em>Folders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFolders()
   * @generated
   * @ordered
   */
  protected EList<Folder> folders;

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
  public String getHostname()
  {
    return hostname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostname(String newHostname)
  {
    String oldHostname = hostname;
    hostname = newHostname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVER__HOSTNAME, oldHostname, hostname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsername(String newUsername)
  {
    String oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVER__USERNAME, oldUsername, username));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(String newPassword)
  {
    String oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVER__PASSWORD, oldPassword, password));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(int newPort)
  {
    int oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVER__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Folder> getFolders()
  {
    if (folders == null)
    {
      folders = new EObjectContainmentWithInverseEList<Folder>(Folder.class, this, ModelPackage.SERVER__FOLDERS, ModelPackage.FOLDER__SERVER);
    }
    return folders;
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
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.SERVER__FOLDERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getFolders()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.SERVER__FOLDERS:
        return ((InternalEList<?>)getFolders()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelPackage.SERVER__HOSTNAME:
        return getHostname();
      case ModelPackage.SERVER__USERNAME:
        return getUsername();
      case ModelPackage.SERVER__PASSWORD:
        return getPassword();
      case ModelPackage.SERVER__PORT:
        return getPort();
      case ModelPackage.SERVER__FOLDERS:
        return getFolders();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.SERVER__HOSTNAME:
        setHostname((String)newValue);
        return;
      case ModelPackage.SERVER__USERNAME:
        setUsername((String)newValue);
        return;
      case ModelPackage.SERVER__PASSWORD:
        setPassword((String)newValue);
        return;
      case ModelPackage.SERVER__PORT:
        setPort((Integer)newValue);
        return;
      case ModelPackage.SERVER__FOLDERS:
        getFolders().clear();
        getFolders().addAll((Collection<? extends Folder>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.SERVER__HOSTNAME:
        setHostname(HOSTNAME_EDEFAULT);
        return;
      case ModelPackage.SERVER__USERNAME:
        setUsername(USERNAME_EDEFAULT);
        return;
      case ModelPackage.SERVER__PASSWORD:
        setPassword(PASSWORD_EDEFAULT);
        return;
      case ModelPackage.SERVER__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case ModelPackage.SERVER__FOLDERS:
        getFolders().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.SERVER__HOSTNAME:
        return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
      case ModelPackage.SERVER__USERNAME:
        return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
      case ModelPackage.SERVER__PASSWORD:
        return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
      case ModelPackage.SERVER__PORT:
        return port != PORT_EDEFAULT;
      case ModelPackage.SERVER__FOLDERS:
        return folders != null && !folders.isEmpty();
    }
    return super.eIsSet(featureID);
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

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (hostname: ");
    result.append(hostname);
    result.append(", username: ");
    result.append(username);
    result.append(", password: ");
    result.append(password);
    result.append(", port: ");
    result.append(port);
    result.append(')');
    return result.toString();
  }

} //ServerImpl
