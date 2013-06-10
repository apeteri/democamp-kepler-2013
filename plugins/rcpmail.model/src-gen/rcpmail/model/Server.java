/**
 */
package rcpmail.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rcpmail.model.Server#getHostName <em>Host Name</em>}</li>
 *   <li>{@link rcpmail.model.Server#getUserName <em>User Name</em>}</li>
 *   <li>{@link rcpmail.model.Server#getPassword <em>Password</em>}</li>
 *   <li>{@link rcpmail.model.Server#getPort <em>Port</em>}</li>
 *   <li>{@link rcpmail.model.Server#getFolders <em>Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @see rcpmail.model.ModelPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject
{
  /**
   * Returns the value of the '<em><b>Host Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host Name</em>' attribute.
   * @see #setHostName(String)
   * @see rcpmail.model.ModelPackage#getServer_HostName()
   * @model unique="false"
   * @generated
   */
  String getHostName();

  /**
   * Sets the value of the '{@link rcpmail.model.Server#getHostName <em>Host Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host Name</em>' attribute.
   * @see #getHostName()
   * @generated
   */
  void setHostName(String value);

  /**
   * Returns the value of the '<em><b>User Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Name</em>' attribute.
   * @see #setUserName(String)
   * @see rcpmail.model.ModelPackage#getServer_UserName()
   * @model unique="false"
   * @generated
   */
  String getUserName();

  /**
   * Sets the value of the '{@link rcpmail.model.Server#getUserName <em>User Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Name</em>' attribute.
   * @see #getUserName()
   * @generated
   */
  void setUserName(String value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' attribute.
   * @see #setPassword(String)
   * @see rcpmail.model.ModelPackage#getServer_Password()
   * @model unique="false"
   * @generated
   */
  String getPassword();

  /**
   * Sets the value of the '{@link rcpmail.model.Server#getPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' attribute.
   * @see #getPassword()
   * @generated
   */
  void setPassword(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see rcpmail.model.ModelPackage#getServer_Port()
   * @model unique="false"
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link rcpmail.model.Server#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

  /**
   * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
   * The list contents are of type {@link rcpmail.model.Folder}.
   * It is bidirectional and its opposite is '{@link rcpmail.model.Folder#getServer <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Folders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Folders</em>' containment reference list.
   * @see rcpmail.model.ModelPackage#getServer_Folders()
   * @see rcpmail.model.Folder#getServer
   * @model opposite="server" containment="true"
   * @generated
   */
  EList<Folder> getFolders();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%rcpmail.model.Server%> _this = this;\n<%org.eclipse.emf.common.util.EList%><<%rcpmail.model.Folder%>> _folders = _this.getFolders();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%rcpmail.model.Folder%>,<%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%rcpmail.model.Folder%>,<%java.lang.Boolean%>>()\n{\n\t\tpublic <%java.lang.Boolean%> apply(final <%rcpmail.model.Folder%> f)\n\t\t{\n\t\t\t<%java.lang.String%> _name = f.getName();\n\t\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_name, \"Inbox\");\n\t\t\treturn <%java.lang.Boolean%>.valueOf(_equals);\n\t\t}\n\t};\n<%rcpmail.model.Folder%> _findFirst = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%rcpmail.model.Folder%>>findFirst(_folders, _function);\nreturn _findFirst;'"
   * @generated
   */
  Folder getDefaultSelection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%rcpmail.model.Server%> _this = this;\n<%org.eclipse.emf.common.util.EList%><<%rcpmail.model.Folder%>> _folders = _this.getFolders();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%rcpmail.model.Folder%>,<%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%rcpmail.model.Folder%>,<%java.lang.Boolean%>>()\n{\n\t\tpublic <%java.lang.Boolean%> apply(final <%rcpmail.model.Folder%> f)\n\t\t{\n\t\t\t<%java.lang.String%> _name = f.getName();\n\t\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_name, \"Junk\");\n\t\t\treturn <%java.lang.Boolean%>.valueOf(_equals);\n\t\t}\n\t};\n<%rcpmail.model.Folder%> _findFirst = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%rcpmail.model.Folder%>>findFirst(_folders, _function);\nreturn _findFirst;'"
   * @generated
   */
  Folder getJunkFolder();

} // Server
