/**
 */
package rcpmail.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rcpmail.model.Folder;
import rcpmail.model.Message;
import rcpmail.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rcpmail.model.impl.MessageImpl#getId <em>Id</em>}</li>
 *   <li>{@link rcpmail.model.impl.MessageImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link rcpmail.model.impl.MessageImpl#getFrom <em>From</em>}</li>
 *   <li>{@link rcpmail.model.impl.MessageImpl#getDate <em>Date</em>}</li>
 *   <li>{@link rcpmail.model.impl.MessageImpl#isSpam <em>Spam</em>}</li>
 *   <li>{@link rcpmail.model.impl.MessageImpl#getBody <em>Body</em>}</li>
 *   <li>{@link rcpmail.model.impl.MessageImpl#getFolder <em>Folder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends CDOObjectImpl implements Message
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageImpl()
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
    return ModelPackage.Literals.MESSAGE;
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
  public int getId()
  {
    return (Integer)eGet(ModelPackage.Literals.MESSAGE__ID, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(int newId)
  {
    eSet(ModelPackage.Literals.MESSAGE__ID, newId);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubject()
  {
    return (String)eGet(ModelPackage.Literals.MESSAGE__SUBJECT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubject(String newSubject)
  {
    eSet(ModelPackage.Literals.MESSAGE__SUBJECT, newSubject);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return (String)eGet(ModelPackage.Literals.MESSAGE__FROM, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    eSet(ModelPackage.Literals.MESSAGE__FROM, newFrom);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return (String)eGet(ModelPackage.Literals.MESSAGE__DATE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    eSet(ModelPackage.Literals.MESSAGE__DATE, newDate);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSpam()
  {
    return (Boolean)eGet(ModelPackage.Literals.MESSAGE__SPAM, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpam(boolean newSpam)
  {
    eSet(ModelPackage.Literals.MESSAGE__SPAM, newSpam);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBody()
  {
    return (String)eGet(ModelPackage.Literals.MESSAGE__BODY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(String newBody)
  {
    eSet(ModelPackage.Literals.MESSAGE__BODY, newBody);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Folder getFolder()
  {
    return (Folder)eGet(ModelPackage.Literals.MESSAGE__FOLDER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFolder(Folder newFolder)
  {
    eSet(ModelPackage.Literals.MESSAGE__FOLDER, newFolder);
  }

} //MessageImpl
