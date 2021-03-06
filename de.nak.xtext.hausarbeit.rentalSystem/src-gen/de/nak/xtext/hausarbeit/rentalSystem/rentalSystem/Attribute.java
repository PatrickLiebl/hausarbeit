/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getOfType <em>Of Type</em>}</li>
 * </ul>
 *
 * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
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
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Of Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Of Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Of Type</em>' attribute.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType
   * @see #setOfType(OfType)
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getAttribute_OfType()
   * @model
   * @generated
   */
  OfType getOfType();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute#getOfType <em>Of Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Of Type</em>' attribute.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType
   * @see #getOfType()
   * @generated
   */
  void setOfType(OfType value);

} // Attribute
