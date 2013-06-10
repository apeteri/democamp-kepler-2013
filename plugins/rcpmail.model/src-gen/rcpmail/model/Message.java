/**
 */
package rcpmail.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rcpmail.model.Message#getId <em>Id</em>}</li>
 *   <li>{@link rcpmail.model.Message#getSubject <em>Subject</em>}</li>
 *   <li>{@link rcpmail.model.Message#getFrom <em>From</em>}</li>
 *   <li>{@link rcpmail.model.Message#getDate <em>Date</em>}</li>
 *   <li>{@link rcpmail.model.Message#isSpam <em>Spam</em>}</li>
 *   <li>{@link rcpmail.model.Message#getBody <em>Body</em>}</li>
 *   <li>{@link rcpmail.model.Message#getFolder <em>Folder</em>}</li>
 * </ul>
 * </p>
 *
 * @see rcpmail.model.ModelPackage#getMessage()
 * @model superTypes="rcpmail.model.ModelObject"
 * @generated
 */
public interface Message extends EObject, ModelObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see rcpmail.model.ModelPackage#getMessage_Id()
   * @model unique="false"
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link rcpmail.model.Message#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

  /**
   * Returns the value of the '<em><b>Subject</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject</em>' attribute.
   * @see #setSubject(String)
   * @see rcpmail.model.ModelPackage#getMessage_Subject()
   * @model unique="false"
   * @generated
   */
  String getSubject();

  /**
   * Sets the value of the '{@link rcpmail.model.Message#getSubject <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' attribute.
   * @see #getSubject()
   * @generated
   */
  void setSubject(String value);

  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see rcpmail.model.ModelPackage#getMessage_From()
   * @model unique="false"
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link rcpmail.model.Message#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see rcpmail.model.ModelPackage#getMessage_Date()
   * @model unique="false"
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link rcpmail.model.Message#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

  /**
   * Returns the value of the '<em><b>Spam</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spam</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spam</em>' attribute.
   * @see #setSpam(boolean)
   * @see rcpmail.model.ModelPackage#getMessage_Spam()
   * @model unique="false"
   * @generated
   */
  boolean isSpam();

  /**
   * Sets the value of the '{@link rcpmail.model.Message#isSpam <em>Spam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spam</em>' attribute.
   * @see #isSpam()
   * @generated
   */
  void setSpam(boolean value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' attribute.
   * @see #setBody(String)
   * @see rcpmail.model.ModelPackage#getMessage_Body()
   * @model unique="false"
   * @generated
   */
  String getBody();

  /**
   * Sets the value of the '{@link rcpmail.model.Message#getBody <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' attribute.
   * @see #getBody()
   * @generated
   */
  void setBody(String value);

  /**
   * Returns the value of the '<em><b>Folder</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link rcpmail.model.Folder#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Folder</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Folder</em>' container reference.
   * @see #setFolder(Folder)
   * @see rcpmail.model.ModelPackage#getMessage_Folder()
   * @see rcpmail.model.Folder#getMessages
   * @model opposite="messages" transient="false"
   * @generated
   */
  Folder getFolder();

  /**
   * Sets the value of the '{@link rcpmail.model.Message#getFolder <em>Folder</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Folder</em>' container reference.
   * @see #getFolder()
   * @generated
   */
  void setFolder(Folder value);

} // Message
