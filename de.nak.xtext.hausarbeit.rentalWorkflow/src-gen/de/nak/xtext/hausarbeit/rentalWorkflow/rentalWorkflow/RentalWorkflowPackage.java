/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow;

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
 * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface RentalWorkflowPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rentalWorkflow";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nak.de/xtext/hausarbeit/rentalWorkflow/RentalWorkflow";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rentalWorkflow";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RentalWorkflowPackage eINSTANCE = de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl.init();

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowImpl <em>Rental Workflow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowImpl
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getRentalWorkflow()
   * @generated
   */
  int RENTAL_WORKFLOW = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_WORKFLOW__NAME = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_WORKFLOW__EVENT = 1;

  /**
   * The feature id for the '<em><b>Reset Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_WORKFLOW__RESET_EVENTS = 2;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_WORKFLOW__COMMANDS = 3;

  /**
   * The feature id for the '<em><b>Workflow Deal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_WORKFLOW__WORKFLOW_DEAL = 4;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_WORKFLOW__STATES = 5;

  /**
   * The number of structural features of the '<em>Rental Workflow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENTAL_WORKFLOW_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.EventImpl
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CODE = 1;

  /**
   * The feature id for the '<em><b>Of Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__OF_TYPE = 2;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.CommandImpl
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__CODE = 1;

  /**
   * The feature id for the '<em><b>Of Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__OF_TYPE = 2;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.StateImpl
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getState()
   * @generated
   */
  int STATE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Of Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OF_TYPE = 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ACTIONS = 2;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 3;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.TransitionImpl
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 4;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.OfType <em>Of Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.OfType
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getOfType()
   * @generated
   */
  int OF_TYPE = 5;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofEventType <em>of Event Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofEventType
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getofEventType()
   * @generated
   */
  int OF_EVENT_TYPE = 6;

  /**
   * The meta object id for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofCommandType <em>of Command Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofCommandType
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getofCommandType()
   * @generated
   */
  int OF_COMMAND_TYPE = 7;


  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow <em>Rental Workflow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rental Workflow</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow
   * @generated
   */
  EClass getRentalWorkflow();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getName()
   * @see #getRentalWorkflow()
   * @generated
   */
  EAttribute getRentalWorkflow_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getEvent()
   * @see #getRentalWorkflow()
   * @generated
   */
  EReference getRentalWorkflow_Event();

  /**
   * Returns the meta object for the reference list '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getResetEvents <em>Reset Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Reset Events</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getResetEvents()
   * @see #getRentalWorkflow()
   * @generated
   */
  EReference getRentalWorkflow_ResetEvents();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getCommands()
   * @see #getRentalWorkflow()
   * @generated
   */
  EReference getRentalWorkflow_Commands();

  /**
   * Returns the meta object for the reference '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getWorkflowDeal <em>Workflow Deal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Workflow Deal</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getWorkflowDeal()
   * @see #getRentalWorkflow()
   * @generated
   */
  EReference getRentalWorkflow_WorkflowDeal();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow#getStates()
   * @see #getRentalWorkflow()
   * @generated
   */
  EReference getRentalWorkflow_States();

  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event#getCode()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Code();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event#getOfType <em>Of Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Of Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event#getOfType()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_OfType();

  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getCode()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Code();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getOfType <em>Of Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Of Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command#getOfType()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_OfType();

  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State#getOfType <em>Of Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Of Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State#getOfType()
   * @see #getState()
   * @generated
   */
  EAttribute getState_OfType();

  /**
   * Returns the meta object for the reference list '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Actions</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State#getActions()
   * @see #getState()
   * @generated
   */
  EReference getState_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the reference '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the meta object for enum '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.OfType <em>Of Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Of Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.OfType
   * @generated
   */
  EEnum getOfType();

  /**
   * Returns the meta object for enum '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofEventType <em>of Event Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>of Event Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofEventType
   * @generated
   */
  EEnum getofEventType();

  /**
   * Returns the meta object for enum '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofCommandType <em>of Command Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>of Command Type</em>'.
   * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofCommandType
   * @generated
   */
  EEnum getofCommandType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RentalWorkflowFactory getRentalWorkflowFactory();

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
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowImpl <em>Rental Workflow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowImpl
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getRentalWorkflow()
     * @generated
     */
    EClass RENTAL_WORKFLOW = eINSTANCE.getRentalWorkflow();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENTAL_WORKFLOW__NAME = eINSTANCE.getRentalWorkflow_Name();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_WORKFLOW__EVENT = eINSTANCE.getRentalWorkflow_Event();

    /**
     * The meta object literal for the '<em><b>Reset Events</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_WORKFLOW__RESET_EVENTS = eINSTANCE.getRentalWorkflow_ResetEvents();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_WORKFLOW__COMMANDS = eINSTANCE.getRentalWorkflow_Commands();

    /**
     * The meta object literal for the '<em><b>Workflow Deal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_WORKFLOW__WORKFLOW_DEAL = eINSTANCE.getRentalWorkflow_WorkflowDeal();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENTAL_WORKFLOW__STATES = eINSTANCE.getRentalWorkflow_States();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.EventImpl
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__CODE = eINSTANCE.getEvent_Code();

    /**
     * The meta object literal for the '<em><b>Of Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__OF_TYPE = eINSTANCE.getEvent_OfType();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.CommandImpl
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__CODE = eINSTANCE.getCommand_Code();

    /**
     * The meta object literal for the '<em><b>Of Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__OF_TYPE = eINSTANCE.getCommand_OfType();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.StateImpl
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Of Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__OF_TYPE = eINSTANCE.getState_OfType();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.TransitionImpl
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.OfType <em>Of Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.OfType
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getOfType()
     * @generated
     */
    EEnum OF_TYPE = eINSTANCE.getOfType();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofEventType <em>of Event Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofEventType
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getofEventType()
     * @generated
     */
    EEnum OF_EVENT_TYPE = eINSTANCE.getofEventType();

    /**
     * The meta object literal for the '{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofCommandType <em>of Command Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofCommandType
     * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowPackageImpl#getofCommandType()
     * @generated
     */
    EEnum OF_COMMAND_TYPE = eINSTANCE.getofCommandType();

  }

} //RentalWorkflowPackage
