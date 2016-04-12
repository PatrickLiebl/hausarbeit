/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage
 * @generated
 */
public interface RentalSystemFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RentalSystemFactory eINSTANCE = de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Rental System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rental System</em>'.
   * @generated
   */
  RentalSystem createRentalSystem();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Rental Workflow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rental Workflow</em>'.
   * @generated
   */
  RentalWorkflow createRentalWorkflow();

  /**
   * Returns a new object of class '<em>Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Attribute</em>'.
   * @generated
   */
  TypeAttribute createTypeAttribute();

  /**
   * Returns a new object of class '<em>Customer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Customer</em>'.
   * @generated
   */
  Customer createCustomer();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RentalSystemPackage getRentalSystemPackage();

} //RentalSystemFactory
