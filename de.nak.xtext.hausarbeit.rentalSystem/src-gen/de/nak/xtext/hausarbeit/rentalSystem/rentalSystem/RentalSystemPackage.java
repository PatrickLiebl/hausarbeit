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
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_SYSTEM__TYPES = 2;

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
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.TypeImpl
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Movable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__MOVABLE = 0;

  /**
   * The feature id for the '<em><b>Digital</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DIGITAL = 1;

  /**
   * The feature id for the '<em><b>Fix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__FIX = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 3;

  /**
   * The feature id for the '<em><b>Wf</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__WF = 4;

  /**
   * The feature id for the '<em><b>Type Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE_ATTRIBUTES = 5;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.TypeAttributeImpl <em>Type Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.TypeAttributeImpl
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getTypeAttribute()
   * @generated
   */
  int TYPE_ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ATTRIBUTE__VALUE = 1;

  /**
   * The feature id for the '<em><b>Of Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ATTRIBUTE__OF_TYPE = 2;

  /**
   * The number of structural features of the '<em>Type Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ATTRIBUTE_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAL__ATTRIBUTES = 3;

  /**
   * The number of structural features of the '<em>Deal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.CustomerImpl <em>Customer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.CustomerImpl
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getCustomer()
   * @generated
   */
  int CUSTOMER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Customer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.AttributeImpl
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 1;

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
  int OF_TYPE = 6;


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
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem#getTypes()
   * @see #getRentalSystem()
   * @generated
   */
  EReference getRentalSystem_Types();

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
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#isMovable <em>Movable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Movable</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#isMovable()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Movable();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#isDigital <em>Digital</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Digital</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#isDigital()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Digital();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#isFix <em>Fix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fix</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#isFix()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Fix();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the reference '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#getWf <em>Wf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Wf</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#getWf()
   * @see #getType()
   * @generated
   */
  EReference getType_Wf();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#getTypeAttributes <em>Type Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Attributes</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Type#getTypeAttributes()
   * @see #getType()
   * @generated
   */
  EReference getType_TypeAttributes();

  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.TypeAttribute <em>Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Attribute</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.TypeAttribute
   * @generated
   */
  EClass getTypeAttribute();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.TypeAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.TypeAttribute#getName()
   * @see #getTypeAttribute()
   * @generated
   */
  EAttribute getTypeAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.TypeAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.TypeAttribute#getValue()
   * @see #getTypeAttribute()
   * @generated
   */
  EAttribute getTypeAttribute_Value();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.TypeAttribute#getOfType <em>Of Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Of Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.TypeAttribute#getOfType()
   * @see #getTypeAttribute()
   * @generated
   */
  EAttribute getTypeAttribute_OfType();

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
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getAttributes()
   * @see #getDeal()
   * @generated
   */
  EReference getDeal_Attributes();

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
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer#getAttributes()
   * @see #getCustomer()
   * @generated
   */
  EReference getCustomer_Attributes();

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
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

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
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_SYSTEM__TYPES = eINSTANCE.getRentalSystem_Types();

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
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.TypeImpl
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Movable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__MOVABLE = eINSTANCE.getType_Movable();

    /**
     * The meta object literal for the '<em><b>Digital</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__DIGITAL = eINSTANCE.getType_Digital();

    /**
     * The meta object literal for the '<em><b>Fix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__FIX = eINSTANCE.getType_Fix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '<em><b>Wf</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__WF = eINSTANCE.getType_Wf();

    /**
     * The meta object literal for the '<em><b>Type Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TYPE_ATTRIBUTES = eINSTANCE.getType_TypeAttributes();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.TypeAttributeImpl <em>Type Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.TypeAttributeImpl
     * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemPackageImpl#getTypeAttribute()
     * @generated
     */
    EClass TYPE_ATTRIBUTE = eINSTANCE.getTypeAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ATTRIBUTE__NAME = eINSTANCE.getTypeAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ATTRIBUTE__VALUE = eINSTANCE.getTypeAttribute_Value();

    /**
     * The meta object literal for the '<em><b>Of Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ATTRIBUTE__OF_TYPE = eINSTANCE.getTypeAttribute_OfType();

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
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEAL__ATTRIBUTES = eINSTANCE.getDeal_Attributes();

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
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOMER__ATTRIBUTES = eINSTANCE.getCustomer_Attributes();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

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