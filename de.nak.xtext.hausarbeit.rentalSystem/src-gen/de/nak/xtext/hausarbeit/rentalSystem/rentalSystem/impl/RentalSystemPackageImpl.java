/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemFactory;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType;

import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RentalSystemPackageImpl extends EPackageImpl implements RentalSystemPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rentalSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rentalTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dealEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ofTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RentalSystemPackageImpl()
  {
    super(eNS_URI, RentalSystemFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RentalSystemPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RentalSystemPackage init()
  {
    if (isInited) return (RentalSystemPackage)EPackage.Registry.INSTANCE.getEPackage(RentalSystemPackage.eNS_URI);

    // Obtain or create and register package
    RentalSystemPackageImpl theRentalSystemPackage = (RentalSystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RentalSystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RentalSystemPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    RentalWorkflowPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theRentalSystemPackage.createPackageContents();

    // Initialize created meta-data
    theRentalSystemPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRentalSystemPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RentalSystemPackage.eNS_URI, theRentalSystemPackage);
    return theRentalSystemPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRentalSystem()
  {
    return rentalSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRentalSystem_Name()
  {
    return (EAttribute)rentalSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRentalSystem_Title()
  {
    return (EAttribute)rentalSystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRentalSystem_RentalTypes()
  {
    return (EReference)rentalSystemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRentalSystem_Customers()
  {
    return (EReference)rentalSystemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRentalSystem_Deals()
  {
    return (EReference)rentalSystemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRentalType()
  {
    return rentalTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRentalType_Movable()
  {
    return (EAttribute)rentalTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRentalType_Digital()
  {
    return (EAttribute)rentalTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRentalType_Fix()
  {
    return (EAttribute)rentalTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRentalType_Name()
  {
    return (EAttribute)rentalTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRentalType_TypeAttributes()
  {
    return (EReference)rentalTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomer()
  {
    return customerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomer_Name()
  {
    return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomer_CustomerAttribute()
  {
    return (EReference)customerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeal()
  {
    return dealEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeal_Name()
  {
    return (EAttribute)dealEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeal_Customer()
  {
    return (EReference)dealEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeal_RentalType()
  {
    return (EReference)dealEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeal_RentalWorkflow()
  {
    return (EReference)dealEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeal_DealAttributes()
  {
    return (EReference)dealEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_OfType()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOfType()
  {
    return ofTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RentalSystemFactory getRentalSystemFactory()
  {
    return (RentalSystemFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rentalSystemEClass = createEClass(RENTAL_SYSTEM);
    createEAttribute(rentalSystemEClass, RENTAL_SYSTEM__NAME);
    createEAttribute(rentalSystemEClass, RENTAL_SYSTEM__TITLE);
    createEReference(rentalSystemEClass, RENTAL_SYSTEM__RENTAL_TYPES);
    createEReference(rentalSystemEClass, RENTAL_SYSTEM__CUSTOMERS);
    createEReference(rentalSystemEClass, RENTAL_SYSTEM__DEALS);

    rentalTypeEClass = createEClass(RENTAL_TYPE);
    createEAttribute(rentalTypeEClass, RENTAL_TYPE__MOVABLE);
    createEAttribute(rentalTypeEClass, RENTAL_TYPE__DIGITAL);
    createEAttribute(rentalTypeEClass, RENTAL_TYPE__FIX);
    createEAttribute(rentalTypeEClass, RENTAL_TYPE__NAME);
    createEReference(rentalTypeEClass, RENTAL_TYPE__TYPE_ATTRIBUTES);

    customerEClass = createEClass(CUSTOMER);
    createEAttribute(customerEClass, CUSTOMER__NAME);
    createEReference(customerEClass, CUSTOMER__CUSTOMER_ATTRIBUTE);

    dealEClass = createEClass(DEAL);
    createEAttribute(dealEClass, DEAL__NAME);
    createEReference(dealEClass, DEAL__CUSTOMER);
    createEReference(dealEClass, DEAL__RENTAL_TYPE);
    createEReference(dealEClass, DEAL__RENTAL_WORKFLOW);
    createEReference(dealEClass, DEAL__DEAL_ATTRIBUTES);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__OF_TYPE);

    // Create enums
    ofTypeEEnum = createEEnum(OF_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    RentalWorkflowPackage theRentalWorkflowPackage = (RentalWorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(RentalWorkflowPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(rentalSystemEClass, RentalSystem.class, "RentalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRentalSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, RentalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRentalSystem_Title(), ecorePackage.getEString(), "title", null, 0, 1, RentalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRentalSystem_RentalTypes(), this.getRentalType(), null, "rentalTypes", null, 0, -1, RentalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRentalSystem_Customers(), this.getCustomer(), null, "customers", null, 0, -1, RentalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRentalSystem_Deals(), this.getDeal(), null, "deals", null, 0, -1, RentalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rentalTypeEClass, RentalType.class, "RentalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRentalType_Movable(), ecorePackage.getEBoolean(), "movable", null, 0, 1, RentalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRentalType_Digital(), ecorePackage.getEBoolean(), "digital", null, 0, 1, RentalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRentalType_Fix(), ecorePackage.getEBoolean(), "fix", null, 0, 1, RentalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRentalType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RentalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRentalType_TypeAttributes(), this.getAttribute(), null, "typeAttributes", null, 0, -1, RentalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomer_CustomerAttribute(), this.getAttribute(), null, "customerAttribute", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dealEClass, Deal.class, "Deal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeal_Customer(), this.getCustomer(), null, "customer", null, 0, 1, Deal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeal_RentalType(), this.getRentalType(), null, "rentalType", null, 0, 1, Deal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeal_RentalWorkflow(), theRentalWorkflowPackage.getRentalWorkflow(), null, "rentalWorkflow", null, 0, 1, Deal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeal_DealAttributes(), this.getAttribute(), null, "dealAttributes", null, 0, -1, Deal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_OfType(), this.getOfType(), "ofType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(ofTypeEEnum, OfType.class, "OfType");
    addEEnumLiteral(ofTypeEEnum, OfType.INT);
    addEEnumLiteral(ofTypeEEnum, OfType.STRING);
    addEEnumLiteral(ofTypeEEnum, OfType.DOUBLE);
    addEEnumLiteral(ofTypeEEnum, OfType.BOOLEAN);

    // Create resource
    createResource(eNS_URI);
  }

} //RentalSystemPackageImpl
