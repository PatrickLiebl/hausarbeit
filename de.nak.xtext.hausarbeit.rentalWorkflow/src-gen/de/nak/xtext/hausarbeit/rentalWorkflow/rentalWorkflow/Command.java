/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getCode <em>Code</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getOfType <em>Of Type</em>}</li>
 * </ul>
 *
 * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
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
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getCommand_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getCommand_Code()
   * @model
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

  /**
   * Returns the value of the '<em><b>Of Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofCommandType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Of Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Of Type</em>' attribute.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofCommandType
   * @see #setOfType(ofCommandType)
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getCommand_OfType()
   * @model
   * @generated
   */
  ofCommandType getOfType();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getOfType <em>Of Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Of Type</em>' attribute.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofCommandType
   * @see #getOfType()
   * @generated
   */
  void setOfType(ofCommandType value);

} // Command
