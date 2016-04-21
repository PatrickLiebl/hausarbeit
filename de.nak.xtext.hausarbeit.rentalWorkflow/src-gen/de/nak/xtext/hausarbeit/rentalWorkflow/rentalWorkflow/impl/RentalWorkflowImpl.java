/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl;

import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowImpl#getResetEvents <em>Reset Events</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.RentalWorkflowImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RentalWorkflowImpl extends MinimalEObjectImpl.Container implements RentalWorkflow
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected EList<Event> event;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * The cached value of the '{@link #getResetEvents() <em>Reset Events</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResetEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> resetEvents;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RentalWorkflowImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RentalWorkflowPackage.Literals.RENTAL_WORKFLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalWorkflowPackage.RENTAL_WORKFLOW__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvent()
  {
    if (event == null)
    {
      event = new EObjectContainmentEList<Event>(Event.class, this, RentalWorkflowPackage.RENTAL_WORKFLOW__EVENT);
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<Command>(Command.class, this, RentalWorkflowPackage.RENTAL_WORKFLOW__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getResetEvents()
  {
    if (resetEvents == null)
    {
      resetEvents = new EObjectResolvingEList<Event>(Event.class, this, RentalWorkflowPackage.RENTAL_WORKFLOW__RESET_EVENTS);
    }
    return resetEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, RentalWorkflowPackage.RENTAL_WORKFLOW__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RentalWorkflowPackage.RENTAL_WORKFLOW__EVENT:
        return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
      case RentalWorkflowPackage.RENTAL_WORKFLOW__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
      case RentalWorkflowPackage.RENTAL_WORKFLOW__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RentalWorkflowPackage.RENTAL_WORKFLOW__NAME:
        return getName();
      case RentalWorkflowPackage.RENTAL_WORKFLOW__EVENT:
        return getEvent();
      case RentalWorkflowPackage.RENTAL_WORKFLOW__COMMANDS:
        return getCommands();
      case RentalWorkflowPackage.RENTAL_WORKFLOW__RESET_EVENTS:
        return getResetEvents();
      case RentalWorkflowPackage.RENTAL_WORKFLOW__STATES:
        return getStates();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RentalWorkflowPackage.RENTAL_WORKFLOW__NAME:
        setName((String)newValue);
        return;
      case RentalWorkflowPackage.RENTAL_WORKFLOW__EVENT:
        getEvent().clear();
        getEvent().addAll((Collection<? extends Event>)newValue);
        return;
      case RentalWorkflowPackage.RENTAL_WORKFLOW__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
        return;
      case RentalWorkflowPackage.RENTAL_WORKFLOW__RESET_EVENTS:
        getResetEvents().clear();
        getResetEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case RentalWorkflowPackage.RENTAL_WORKFLOW__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RentalWorkflowPackage.RENTAL_WORKFLOW__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RentalWorkflowPackage.RENTAL_WORKFLOW__EVENT:
        getEvent().clear();
        return;
      case RentalWorkflowPackage.RENTAL_WORKFLOW__COMMANDS:
        getCommands().clear();
        return;
      case RentalWorkflowPackage.RENTAL_WORKFLOW__RESET_EVENTS:
        getResetEvents().clear();
        return;
      case RentalWorkflowPackage.RENTAL_WORKFLOW__STATES:
        getStates().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RentalWorkflowPackage.RENTAL_WORKFLOW__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RentalWorkflowPackage.RENTAL_WORKFLOW__EVENT:
        return event != null && !event.isEmpty();
      case RentalWorkflowPackage.RENTAL_WORKFLOW__COMMANDS:
        return commands != null && !commands.isEmpty();
      case RentalWorkflowPackage.RENTAL_WORKFLOW__RESET_EVENTS:
        return resetEvents != null && !resetEvents.isEmpty();
      case RentalWorkflowPackage.RENTAL_WORKFLOW__STATES:
        return states != null && !states.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RentalWorkflowImpl
