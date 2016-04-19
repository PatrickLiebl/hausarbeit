/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl;

import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.Event;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.ofEventType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.EventImpl#getCode <em>Code</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.impl.EventImpl#getOfType <em>Of Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
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
   * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected static final String CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected String code = CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getOfType() <em>Of Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOfType()
   * @generated
   * @ordered
   */
  protected static final ofEventType OF_TYPE_EDEFAULT = ofEventType.NEXT_CLICKED;

  /**
   * The cached value of the '{@link #getOfType() <em>Of Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOfType()
   * @generated
   * @ordered
   */
  protected ofEventType ofType = OF_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return RentalWorkflowPackage.Literals.EVENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RentalWorkflowPackage.EVENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(String newCode)
  {
    String oldCode = code;
    code = newCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalWorkflowPackage.EVENT__CODE, oldCode, code));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ofEventType getOfType()
  {
    return ofType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOfType(ofEventType newOfType)
  {
    ofEventType oldOfType = ofType;
    ofType = newOfType == null ? OF_TYPE_EDEFAULT : newOfType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalWorkflowPackage.EVENT__OF_TYPE, oldOfType, ofType));
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
      case RentalWorkflowPackage.EVENT__NAME:
        return getName();
      case RentalWorkflowPackage.EVENT__CODE:
        return getCode();
      case RentalWorkflowPackage.EVENT__OF_TYPE:
        return getOfType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RentalWorkflowPackage.EVENT__NAME:
        setName((String)newValue);
        return;
      case RentalWorkflowPackage.EVENT__CODE:
        setCode((String)newValue);
        return;
      case RentalWorkflowPackage.EVENT__OF_TYPE:
        setOfType((ofEventType)newValue);
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
      case RentalWorkflowPackage.EVENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RentalWorkflowPackage.EVENT__CODE:
        setCode(CODE_EDEFAULT);
        return;
      case RentalWorkflowPackage.EVENT__OF_TYPE:
        setOfType(OF_TYPE_EDEFAULT);
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
      case RentalWorkflowPackage.EVENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RentalWorkflowPackage.EVENT__CODE:
        return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
      case RentalWorkflowPackage.EVENT__OF_TYPE:
        return ofType != OF_TYPE_EDEFAULT;
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
    result.append(", code: ");
    result.append(code);
    result.append(", ofType: ");
    result.append(ofType);
    result.append(')');
    return result.toString();
  }

} //EventImpl
