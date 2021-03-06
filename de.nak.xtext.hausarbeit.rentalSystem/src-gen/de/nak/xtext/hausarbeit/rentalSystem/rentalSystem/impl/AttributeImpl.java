/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.AttributeImpl#getOfType <em>Of Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
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
  protected static final OfType OF_TYPE_EDEFAULT = OfType.INT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return RentalSystemPackage.Literals.ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RentalSystemPackage.ATTRIBUTE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RentalSystemPackage.ATTRIBUTE__OF_TYPE, oldOfType, ofType));
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
      case RentalSystemPackage.ATTRIBUTE__NAME:
        return getName();
      case RentalSystemPackage.ATTRIBUTE__OF_TYPE:
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
      case RentalSystemPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case RentalSystemPackage.ATTRIBUTE__OF_TYPE:
        setOfType((OfType)newValue);
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
      case RentalSystemPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RentalSystemPackage.ATTRIBUTE__OF_TYPE:
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
      case RentalSystemPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RentalSystemPackage.ATTRIBUTE__OF_TYPE:
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
    result.append(", ofType: ");
    result.append(ofType);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
