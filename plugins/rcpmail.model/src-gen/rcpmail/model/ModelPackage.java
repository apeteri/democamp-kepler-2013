/**
 */
package rcpmail.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rcpmail.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='rcpmail'"
 * @generated
 */
public interface ModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "model";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "rcpmail.model";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "model";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelPackage eINSTANCE = rcpmail.model.impl.ModelPackageImpl.init();

  /**
   * The meta object id for the '{@link rcpmail.model.impl.ServerImpl <em>Server</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rcpmail.model.impl.ServerImpl
   * @see rcpmail.model.impl.ModelPackageImpl#getServer()
   * @generated
   */
  int SERVER = 0;

  /**
   * The feature id for the '<em><b>Host Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__HOST_NAME = 0;

  /**
   * The feature id for the '<em><b>User Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__USER_NAME = 1;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__PASSWORD = 2;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__PORT = 3;

  /**
   * The feature id for the '<em><b>Folders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__FOLDERS = 4;

  /**
   * The number of structural features of the '<em>Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_FEATURE_COUNT = 5;

  /**
   * The operation id for the '<em>Get Default Selection</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER___GET_DEFAULT_SELECTION = 0;

  /**
   * The operation id for the '<em>Get Junk Folder</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER___GET_JUNK_FOLDER = 1;

  /**
   * The number of operations of the '<em>Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_OPERATION_COUNT = 2;

  /**
   * The meta object id for the '{@link rcpmail.model.impl.FolderImpl <em>Folder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rcpmail.model.impl.FolderImpl
   * @see rcpmail.model.impl.ModelPackageImpl#getFolder()
   * @generated
   */
  int FOLDER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Server</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLDER__SERVER = 1;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLDER__MESSAGES = 2;

  /**
   * The number of structural features of the '<em>Folder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLDER_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Folder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLDER_OPERATION_COUNT = 0;


  /**
   * The meta object id for the '{@link rcpmail.model.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rcpmail.model.impl.MessageImpl
   * @see rcpmail.model.impl.ModelPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 2;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link rcpmail.model.Server <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Server</em>'.
   * @see rcpmail.model.Server
   * @generated
   */
  EClass getServer();

  /**
   * Returns the meta object for the attribute '{@link rcpmail.model.Server#getHostName <em>Host Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host Name</em>'.
   * @see rcpmail.model.Server#getHostName()
   * @see #getServer()
   * @generated
   */
  EAttribute getServer_HostName();

  /**
   * Returns the meta object for the attribute '{@link rcpmail.model.Server#getUserName <em>User Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Name</em>'.
   * @see rcpmail.model.Server#getUserName()
   * @see #getServer()
   * @generated
   */
  EAttribute getServer_UserName();

  /**
   * Returns the meta object for the attribute '{@link rcpmail.model.Server#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see rcpmail.model.Server#getPassword()
   * @see #getServer()
   * @generated
   */
  EAttribute getServer_Password();

  /**
   * Returns the meta object for the attribute '{@link rcpmail.model.Server#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see rcpmail.model.Server#getPort()
   * @see #getServer()
   * @generated
   */
  EAttribute getServer_Port();

  /**
   * Returns the meta object for the containment reference list '{@link rcpmail.model.Server#getFolders <em>Folders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Folders</em>'.
   * @see rcpmail.model.Server#getFolders()
   * @see #getServer()
   * @generated
   */
  EReference getServer_Folders();

  /**
   * Returns the meta object for the '{@link rcpmail.model.Server#getDefaultSelection() <em>Get Default Selection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Default Selection</em>' operation.
   * @see rcpmail.model.Server#getDefaultSelection()
   * @generated
   */
  EOperation getServer__GetDefaultSelection();

  /**
   * Returns the meta object for the '{@link rcpmail.model.Server#getJunkFolder() <em>Get Junk Folder</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Junk Folder</em>' operation.
   * @see rcpmail.model.Server#getJunkFolder()
   * @generated
   */
  EOperation getServer__GetJunkFolder();

  /**
   * Returns the meta object for class '{@link rcpmail.model.Folder <em>Folder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Folder</em>'.
   * @see rcpmail.model.Folder
   * @generated
   */
  EClass getFolder();

  /**
   * Returns the meta object for the attribute '{@link rcpmail.model.Folder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rcpmail.model.Folder#getName()
   * @see #getFolder()
   * @generated
   */
  EAttribute getFolder_Name();

  /**
   * Returns the meta object for the container reference '{@link rcpmail.model.Folder#getServer <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Server</em>'.
   * @see rcpmail.model.Folder#getServer()
   * @see #getFolder()
   * @generated
   */
  EReference getFolder_Server();

  /**
   * Returns the meta object for the containment reference list '{@link rcpmail.model.Folder#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see rcpmail.model.Folder#getMessages()
   * @see #getFolder()
   * @generated
   */
  EReference getFolder_Messages();

  /**
   * Returns the meta object for class '{@link rcpmail.model.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see rcpmail.model.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelFactory getModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link rcpmail.model.impl.ServerImpl <em>Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rcpmail.model.impl.ServerImpl
     * @see rcpmail.model.impl.ModelPackageImpl#getServer()
     * @generated
     */
    EClass SERVER = eINSTANCE.getServer();

    /**
     * The meta object literal for the '<em><b>Host Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER__HOST_NAME = eINSTANCE.getServer_HostName();

    /**
     * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER__USER_NAME = eINSTANCE.getServer_UserName();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER__PASSWORD = eINSTANCE.getServer_Password();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER__PORT = eINSTANCE.getServer_Port();

    /**
     * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVER__FOLDERS = eINSTANCE.getServer_Folders();

    /**
     * The meta object literal for the '<em><b>Get Default Selection</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SERVER___GET_DEFAULT_SELECTION = eINSTANCE.getServer__GetDefaultSelection();

    /**
     * The meta object literal for the '<em><b>Get Junk Folder</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SERVER___GET_JUNK_FOLDER = eINSTANCE.getServer__GetJunkFolder();

    /**
     * The meta object literal for the '{@link rcpmail.model.impl.FolderImpl <em>Folder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rcpmail.model.impl.FolderImpl
     * @see rcpmail.model.impl.ModelPackageImpl#getFolder()
     * @generated
     */
    EClass FOLDER = eINSTANCE.getFolder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

    /**
     * The meta object literal for the '<em><b>Server</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOLDER__SERVER = eINSTANCE.getFolder_Server();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOLDER__MESSAGES = eINSTANCE.getFolder_Messages();

    /**
     * The meta object literal for the '{@link rcpmail.model.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rcpmail.model.impl.MessageImpl
     * @see rcpmail.model.impl.ModelPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

  }

} //ModelPackage
