/**
 */
package rcpmail.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rcpmail.model.*;
import rcpmail.model.Folder;
import rcpmail.model.Message;
import rcpmail.model.ModelFactory;
import rcpmail.model.ModelPackage;
import rcpmail.model.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModelFactory init()
  {
    try
    {
      ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory("rcpmail.model"); 
      if (theModelFactory != null)
      {
        return theModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModelPackage.SERVER: return (EObject)createServer();
      case ModelPackage.FOLDER: return (EObject)createFolder();
      case ModelPackage.MESSAGE: return (EObject)createMessage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Server createServer()
  {
    ServerImpl server = new ServerImpl();
    return server;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Folder createFolder()
  {
    FolderImpl folder = new FolderImpl();
    return folder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelPackage getModelPackage()
  {
    return (ModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModelPackage getPackage()
  {
    return ModelPackage.eINSTANCE;
  }

} //ModelFactoryImpl
