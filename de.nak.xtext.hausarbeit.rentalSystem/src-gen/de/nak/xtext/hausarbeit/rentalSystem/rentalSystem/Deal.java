/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getCustomer <em>Customer</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getRentalType <em>Rental Type</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getDeal()
 * @model
 * @generated
 */
public interface Deal extends EObject
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
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getDeal_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Customer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Customer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Customer</em>' reference.
   * @see #setCustomer(Customer)
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getDeal_Customer()
   * @model
   * @generated
   */
  Customer getCustomer();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getCustomer <em>Customer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Customer</em>' reference.
   * @see #getCustomer()
   * @generated
   */
  void setCustomer(Customer value);

  /**
   * Returns the value of the '<em><b>Rental Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rental Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rental Type</em>' reference.
   * @see #setRentalType(Type)
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getDeal_RentalType()
   * @model
   * @generated
   */
  Type getRentalType();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal#getRentalType <em>Rental Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rental Type</em>' reference.
   * @see #getRentalType()
   * @generated
   */
  void setRentalType(Type value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getDeal_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Deal
