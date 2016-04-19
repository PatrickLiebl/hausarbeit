/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl;

import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Command;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.OfType;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Transition;

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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.StateImpl#getOfType <em>Of Type</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.StateImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
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
   * The default value of the '{@link #getOfType() <em>Of Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOfType()
   * @generated
   * @ordered
   */
  protected static final OfType OF_TYPE_EDEFAULT = OfType.INITIALIZING;

  /**
   * The cached value of the '{@link #getOfType() <em>Of Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOfType()
   * @generated
   * @ordered
   */
  protected OfType ofType = OF_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Command> actions;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return RentalWorkflowPackage.Literals.STATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RentalWorkflowPackage.STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfType getOfType()
  {
    return ofType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOfType(OfType newOfType)
  {
    OfType oldOfType = ofType;
    ofType = newOfType == null ? OF_TYPE_EDEFAULT : newOfType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalWorkflowPackage.STATE__OF_TYPE, oldOfType, ofType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectResolvingEList<Command>(Command.class, this, RentalWorkflowPackage.STATE__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, RentalWorkflowPackage.STATE__TRANSITIONS);
    }
    return transitions;
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
      case RentalWorkflowPackage.STATE__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
      case RentalWorkflowPackage.STATE__NAME:
        return getName();
      case RentalWorkflowPackage.STATE__OF_TYPE:
        return getOfType();
      case RentalWorkflowPackage.STATE__ACTIONS:
        return getActions();
      case RentalWorkflowPackage.STATE__TRANSITIONS:
        return getTransitions();
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
      case RentalWorkflowPackage.STATE__NAME:
        setName((String)newValue);
        return;
      case RentalWorkflowPackage.STATE__OF_TYPE:
        setOfType((OfType)newValue);
        return;
      case RentalWorkflowPackage.STATE__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Command>)newValue);
        return;
      case RentalWorkflowPackage.STATE__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
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
      case RentalWorkflowPackage.STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RentalWorkflowPackage.STATE__OF_TYPE:
        setOfType(OF_TYPE_EDEFAULT);
        return;
      case RentalWorkflowPackage.STATE__ACTIONS:
        getActions().clear();
        return;
      case RentalWorkflowPackage.STATE__TRANSITIONS:
        getTransitions().clear();
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
      case RentalWorkflowPackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RentalWorkflowPackage.STATE__OF_TYPE:
        return ofType != OF_TYPE_EDEFAULT;
      case RentalWorkflowPackage.STATE__ACTIONS:
        return actions != null && !actions.isEmpty();
      case RentalWorkflowPackage.STATE__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
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
    result.append(", ofType: ");
    result.append(ofType);
    result.append(')');
    return result.toString();
  }

} //StateImpl
