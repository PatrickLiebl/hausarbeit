/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isMovable <em>Movable</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isDigital <em>Digital</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isFix <em>Fix</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#getTypeAttributes <em>Type Attributes</em>}</li>
 * </ul>
 *
 * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getRentalType()
 * @model
 * @generated
 */
public interface RentalType extends EObject
{
  /**
   * Returns the value of the '<em><b>Movable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Movable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Movable</em>' attribute.
   * @see #setMovable(boolean)
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getRentalType_Movable()
   * @model
   * @generated
   */
  boolean isMovable();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isMovable <em>Movable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Movable</em>' attribute.
   * @see #isMovable()
   * @generated
   */
  void setMovable(boolean value);

  /**
   * Returns the value of the '<em><b>Digital</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Digital</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Digital</em>' attribute.
   * @see #setDigital(boolean)
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getRentalType_Digital()
   * @model
   * @generated
   */
  boolean isDigital();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isDigital <em>Digital</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Digital</em>' attribute.
   * @see #isDigital()
   * @generated
   */
  void setDigital(boolean value);

  /**
   * Returns the value of the '<em><b>Fix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fix</em>' attribute.
   * @see #setFix(boolean)
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getRentalType_Fix()
   * @model
   * @generated
   */
  boolean isFix();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#isFix <em>Fix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fix</em>' attribute.
   * @see #isFix()
   * @generated
   */
  void setFix(boolean value);

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
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getRentalType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Attributes</em>' containment reference list.
   * @see de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage#getRentalType_TypeAttributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getTypeAttributes();

} // RentalType
