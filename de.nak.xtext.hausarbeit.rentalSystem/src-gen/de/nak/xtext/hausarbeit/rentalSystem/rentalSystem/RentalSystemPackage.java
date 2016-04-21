/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemFactory
 * @model kind="package"
 * @generated
 */
public interface RentalSystemPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rentalSystem";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nak.de/xtext/hausarbeit/rentalSystem/RentalSystem";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rentalSystem";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RentalSystemPackage eINSTANCE = de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl.init();

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemImpl <em>Rental System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemImpl
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getRentalSystem()
   * @generated
   */
  int RENTAL_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_SYSTEM__TITLE = 1;

  /**
   * The feature id for the '<em><b>Rental Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_SYSTEM__RENTAL_TYPES = 2;

  /**
   * The feature id for the '<em><b>Customers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_SYSTEM__CUSTOMERS = 3;

  /**
   * The feature id for the '<em><b>Deals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_SYSTEM__DEALS = 4;

  /**
   * The number of structural features of the '<em>Rental System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_SYSTEM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalTypeImpl <em>Rental Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalTypeImpl
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getRentalType()
   * @generated
   */
  int RENTAL_TYPE = 1;

  /**
   * The feature id for the '<em><b>Movable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_TYPE__MOVABLE = 0;

  /**
   * The feature id for the '<em><b>Digital</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_TYPE__DIGITAL = 1;

  /**
   * The feature id for the '<em><b>Fix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_TYPE__FIX = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_TYPE__NAME = 3;

  /**
   * The feature id for the '<em><b>Type Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_TYPE__TYPE_ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Rental Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.CustomerImpl <em>Customer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.CustomerImpl
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getCustomer()
   * @generated
   */
  int CUSTOMER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__NAME = 0;

  /**
   * The feature id for the '<em><b>Customer Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__CUSTOMER_ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Customer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.DealImpl <em>Deal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.DealImpl
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getDeal()
   * @generated
   */
  int DEAL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Customer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAL__CUSTOMER = 1;

  /**
   * The feature id for the '<em><b>Rental Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAL__RENTAL_TYPE = 2;

  /**
   * The feature id for the '<em><b>Rental Workflow</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAL__RENTAL_WORKFLOW = 3;

  /**
   * The feature id for the '<em><b>Deal Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAL__DEAL_ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Deal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.AttributeImpl
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Of Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OF_TYPE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType <em>Of Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getOfType()
   * @generated
   */
  int OF_TYPE = 5;


  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem <em>Rental System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rental System</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem
   * @generated
   */
  EClass getRentalSystem();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getName()
   * @see #getRentalSystem()
   * @generated
   */
  EAttribute getRentalSystem_Name();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getTitle()
   * @see #getRentalSystem()
   * @generated
   */
  EAttribute getRentalSystem_Title();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getRentalTypes <em>Rental Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rental Types</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getRentalTypes()
   * @see #getRentalSystem()
   * @generated
   */
  EReference getRentalSystem_RentalTypes();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getCustomers <em>Customers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Customers</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getCustomers()
   * @see #getRentalSystem()
   * @generated
   */
  EReference getRentalSystem_Customers();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getDeals <em>Deals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deals</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getDeals()
   * @see #getRentalSystem()
   * @generated
   */
  EReference getRentalSystem_Deals();

  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType <em>Rental Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rental Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType
   * @generated
   */
  EClass getRentalType();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isMovable <em>Movable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Movable</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isMovable()
   * @see #getRentalType()
   * @generated
   */
  EAttribute getRentalType_Movable();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isDigital <em>Digital</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Digital</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isDigital()
   * @see #getRentalType()
   * @generated
   */
  EAttribute getRentalType_Digital();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isFix <em>Fix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fix</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isFix()
   * @see #getRentalType()
   * @generated
   */
  EAttribute getRentalType_Fix();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#getName()
   * @see #getRentalType()
   * @generated
   */
  EAttribute getRentalType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#getTypeAttributes <em>Type Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Attributes</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#getTypeAttributes()
   * @see #getRentalType()
   * @generated
   */
  EReference getRentalType_TypeAttributes();

  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Customer</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer
   * @generated
   */
  EClass getCustomer();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer#getName()
   * @see #getCustomer()
   * @generated
   */
  EAttribute getCustomer_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer#getCustomerAttribute <em>Customer Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Customer Attribute</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer#getCustomerAttribute()
   * @see #getCustomer()
   * @generated
   */
  EReference getCustomer_CustomerAttribute();

  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal <em>Deal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deal</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal
   * @generated
   */
  EClass getDeal();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getName()
   * @see #getDeal()
   * @generated
   */
  EAttribute getDeal_Name();

  /**
   * Returns the meta object for the reference '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getCustomer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Customer</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getCustomer()
   * @see #getDeal()
   * @generated
   */
  EReference getDeal_Customer();

  /**
   * Returns the meta object for the reference '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getRentalType <em>Rental Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rental Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getRentalType()
   * @see #getDeal()
   * @generated
   */
  EReference getDeal_RentalType();

  /**
   * Returns the meta object for the reference '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getRentalWorkflow <em>Rental Workflow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rental Workflow</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getRentalWorkflow()
   * @see #getDeal()
   * @generated
   */
  EReference getDeal_RentalWorkflow();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getDealAttributes <em>Deal Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deal Attributes</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getDealAttributes()
   * @see #getDeal()
   * @generated
   */
  EReference getDeal_DealAttributes();

  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getOfType <em>Of Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Of Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getOfType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_OfType();

  /**
   * Returns the meta object for enum '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType <em>Of Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Of Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType
   * @generated
   */
  EEnum getOfType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RentalSystemFactory getRentalSystemFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemImpl <em>Rental System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemImpl
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getRentalSystem()
     * @generated
     */
    EClass RENTAL_SYSTEM = eINSTANCE.getRentalSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENTAL_SYSTEM__NAME = eINSTANCE.getRentalSystem_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENTAL_SYSTEM__TITLE = eINSTANCE.getRentalSystem_Title();

    /**
     * The meta object literal for the '<em><b>Rental Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_SYSTEM__RENTAL_TYPES = eINSTANCE.getRentalSystem_RentalTypes();

    /**
     * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_SYSTEM__CUSTOMERS = eINSTANCE.getRentalSystem_Customers();

    /**
     * The meta object literal for the '<em><b>Deals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_SYSTEM__DEALS = eINSTANCE.getRentalSystem_Deals();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalTypeImpl <em>Rental Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalTypeImpl
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getRentalType()
     * @generated
     */
    EClass RENTAL_TYPE = eINSTANCE.getRentalType();

    /**
     * The meta object literal for the '<em><b>Movable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENTAL_TYPE__MOVABLE = eINSTANCE.getRentalType_Movable();

    /**
     * The meta object literal for the '<em><b>Digital</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENTAL_TYPE__DIGITAL = eINSTANCE.getRentalType_Digital();

    /**
     * The meta object literal for the '<em><b>Fix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENTAL_TYPE__FIX = eINSTANCE.getRentalType_Fix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENTAL_TYPE__NAME = eINSTANCE.getRentalType_Name();

    /**
     * The meta object literal for the '<em><b>Type Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_TYPE__TYPE_ATTRIBUTES = eINSTANCE.getRentalType_TypeAttributes();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.CustomerImpl <em>Customer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.CustomerImpl
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getCustomer()
     * @generated
     */
    EClass CUSTOMER = eINSTANCE.getCustomer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

    /**
     * The meta object literal for the '<em><b>Customer Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOMER__CUSTOMER_ATTRIBUTE = eINSTANCE.getCustomer_CustomerAttribute();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.DealImpl <em>Deal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.DealImpl
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getDeal()
     * @generated
     */
    EClass DEAL = eINSTANCE.getDeal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEAL__NAME = eINSTANCE.getDeal_Name();

    /**
     * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEAL__CUSTOMER = eINSTANCE.getDeal_Customer();

    /**
     * The meta object literal for the '<em><b>Rental Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEAL__RENTAL_TYPE = eINSTANCE.getDeal_RentalType();

    /**
     * The meta object literal for the '<em><b>Rental Workflow</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEAL__RENTAL_WORKFLOW = eINSTANCE.getDeal_RentalWorkflow();

    /**
     * The meta object literal for the '<em><b>Deal Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEAL__DEAL_ATTRIBUTES = eINSTANCE.getDeal_DealAttributes();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.AttributeImpl
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Of Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__OF_TYPE = eINSTANCE.getAttribute_OfType();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType <em>Of Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getOfType()
     * @generated
     */
    EEnum OF_TYPE = eINSTANCE.getOfType();

  }

} //RentalSystemPackage
