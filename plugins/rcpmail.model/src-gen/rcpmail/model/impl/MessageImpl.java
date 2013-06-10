/**
 */
package rcpmail.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
public class MessageImpl extends MinimalEObjectImpl.Container implements Message
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final int ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected int id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected static final String SUBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected String subject = SUBJECT_EDEFAULT;

  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #isSpam() <em>Spam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpam()
   * @generated
   * @ordered
   */
  protected static final boolean SPAM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSpam() <em>Spam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpam()
   * @generated
   * @ordered
   */
  protected boolean spam = SPAM_EDEFAULT;

  /**
   * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected static final String BODY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected String body = BODY_EDEFAULT;

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
  public int getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(int newId)
  {
    int oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubject()
  {
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubject(String newSubject)
  {
    String oldSubject = subject;
    subject = newSubject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE__SUBJECT, oldSubject, subject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSpam()
  {
    return spam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpam(boolean newSpam)
  {
    boolean oldSpam = spam;
    spam = newSpam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE__SPAM, oldSpam, spam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(String newBody)
  {
    String oldBody = body;
    body = newBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE__BODY, oldBody, body));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Folder getFolder()
  {
    if (eContainerFeatureID() != ModelPackage.MESSAGE__FOLDER) return null;
    return (Folder)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFolder(Folder newFolder, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newFolder, ModelPackage.MESSAGE__FOLDER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFolder(Folder newFolder)
  {
    if (newFolder != eInternalContainer() || (eContainerFeatureID() != ModelPackage.MESSAGE__FOLDER && newFolder != null))
    {
      if (EcoreUtil.isAncestor(this, newFolder))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newFolder != null)
        msgs = ((InternalEObject)newFolder).eInverseAdd(this, ModelPackage.FOLDER__MESSAGES, Folder.class, msgs);
      msgs = basicSetFolder(newFolder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE__FOLDER, newFolder, newFolder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.MESSAGE__FOLDER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetFolder((Folder)otherEnd, msgs);
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
      case ModelPackage.MESSAGE__FOLDER:
        return basicSetFolder(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case ModelPackage.MESSAGE__FOLDER:
        return eInternalContainer().eInverseRemove(this, ModelPackage.FOLDER__MESSAGES, Folder.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case ModelPackage.MESSAGE__ID:
        return getId();
      case ModelPackage.MESSAGE__SUBJECT:
        return getSubject();
      case ModelPackage.MESSAGE__FROM:
        return getFrom();
      case ModelPackage.MESSAGE__DATE:
        return getDate();
      case ModelPackage.MESSAGE__SPAM:
        return isSpam();
      case ModelPackage.MESSAGE__BODY:
        return getBody();
      case ModelPackage.MESSAGE__FOLDER:
        return getFolder();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.MESSAGE__ID:
        setId((Integer)newValue);
        return;
      case ModelPackage.MESSAGE__SUBJECT:
        setSubject((String)newValue);
        return;
      case ModelPackage.MESSAGE__FROM:
        setFrom((String)newValue);
        return;
      case ModelPackage.MESSAGE__DATE:
        setDate((String)newValue);
        return;
      case ModelPackage.MESSAGE__SPAM:
        setSpam((Boolean)newValue);
        return;
      case ModelPackage.MESSAGE__BODY:
        setBody((String)newValue);
        return;
      case ModelPackage.MESSAGE__FOLDER:
        setFolder((Folder)newValue);
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
      case ModelPackage.MESSAGE__ID:
        setId(ID_EDEFAULT);
        return;
      case ModelPackage.MESSAGE__SUBJECT:
        setSubject(SUBJECT_EDEFAULT);
        return;
      case ModelPackage.MESSAGE__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case ModelPackage.MESSAGE__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case ModelPackage.MESSAGE__SPAM:
        setSpam(SPAM_EDEFAULT);
        return;
      case ModelPackage.MESSAGE__BODY:
        setBody(BODY_EDEFAULT);
        return;
      case ModelPackage.MESSAGE__FOLDER:
        setFolder((Folder)null);
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
      case ModelPackage.MESSAGE__ID:
        return id != ID_EDEFAULT;
      case ModelPackage.MESSAGE__SUBJECT:
        return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
      case ModelPackage.MESSAGE__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case ModelPackage.MESSAGE__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case ModelPackage.MESSAGE__SPAM:
        return spam != SPAM_EDEFAULT;
      case ModelPackage.MESSAGE__BODY:
        return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
      case ModelPackage.MESSAGE__FOLDER:
        return getFolder() != null;
    }
    return super.eIsSet(featureID);
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
    result.append(" (id: ");
    result.append(id);
    result.append(", subject: ");
    result.append(subject);
    result.append(", from: ");
    result.append(from);
    result.append(", date: ");
    result.append(date);
    result.append(", spam: ");
    result.append(spam);
    result.append(", body: ");
    result.append(body);
    result.append(')');
    return result.toString();
  }

} //MessageImpl
