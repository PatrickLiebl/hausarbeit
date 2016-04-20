/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getEvent <em>Event</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getResetEvents <em>Reset Events</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getCommands <em>Commands</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getWorkflowDeal <em>Workflow Deal</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getRentalWorkflow()
 * @model
 * @generated
 */
public interface RentalWorkflow extends EObject
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
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getRentalWorkflow_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference list.
   * The list contents are of type {@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference list.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getRentalWorkflow_Event()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvent();

  /**
   * Returns the value of the '<em><b>Reset Events</b></em>' reference list.
   * The list contents are of type {@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reset Events</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reset Events</em>' reference list.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getRentalWorkflow_ResetEvents()
   * @model
   * @generated
   */
  EList<Event> getResetEvents();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getRentalWorkflow_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

  /**
   * Returns the value of the '<em><b>Workflow Deal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workflow Deal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workflow Deal</em>' reference.
   * @see #setWorkflowDeal(RentalSystem)
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getRentalWorkflow_WorkflowDeal()
   * @model
   * @generated
   */
  RentalSystem getWorkflowDeal();

  /**
   * Sets the value of the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getWorkflowDeal <em>Workflow Deal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workflow Deal</em>' reference.
   * @see #getWorkflowDeal()
   * @generated
   */
  void setWorkflowDeal(RentalSystem value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getRentalWorkflow_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // RentalWorkflow
