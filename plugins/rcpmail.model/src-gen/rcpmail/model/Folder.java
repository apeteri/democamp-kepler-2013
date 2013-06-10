/**
 */
package rcpmail.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rcpmail.model.Folder#getName <em>Name</em>}</li>
 *   <li>{@link rcpmail.model.Folder#getServer <em>Server</em>}</li>
 *   <li>{@link rcpmail.model.Folder#getMessages <em>Messages</em>}</li>
 *   <li>{@link rcpmail.model.Folder#getMessageCount <em>Message Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see rcpmail.model.ModelPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rcpmail.model.ModelPackage#getFolder_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rcpmail.model.Folder#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Server</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link rcpmail.model.Server#getFolders <em>Folders</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server</em>' container reference.
   * @see #setServer(Server)
   * @see rcpmail.model.ModelPackage#getFolder_Server()
   * @see rcpmail.model.Server#getFolders
   * @model opposite="folders" transient="false"
   * @generated
   */
  Server getServer();

  /**
   * Sets the value of the '{@link rcpmail.model.Folder#getServer <em>Server</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server</em>' container reference.
   * @see #getServer()
   * @generated
   */
  void setServer(Server value);

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link rcpmail.model.Message}.
   * It is bidirectional and its opposite is '{@link rcpmail.model.Message#getFolder <em>Folder</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see rcpmail.model.ModelPackage#getFolder_Messages()
   * @see rcpmail.model.Message#getFolder
   * @model opposite="folder" containment="true"
   * @generated
   */
  EList<Message> getMessages();

  /**
   * Returns the value of the '<em><b>Message Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Count</em>' attribute.
   * @see rcpmail.model.ModelPackage#getFolder_MessageCount()
   * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%rcpmail.model.Message%>> _messages = this.getMessages();\nint _size = _messages.size();\nreturn _size;'"
   * @generated
   */
  int getMessageCount();

} // Folder
