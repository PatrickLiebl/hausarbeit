/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalTypeImpl#isMovable <em>Movable</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalTypeImpl#isDigital <em>Digital</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalTypeImpl#isFix <em>Fix</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalTypeImpl#getTypeAttributes <em>Type Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RentalTypeImpl extends MinimalEObjectImpl.Container implements RentalType
{
  /**
   * The default value of the '{@link #isMovable() <em>Movable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMovable()
   * @generated
   * @ordered
   */
  protected static final boolean MOVABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMovable() <em>Movable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMovable()
   * @generated
   * @ordered
   */
  protected boolean movable = MOVABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isDigital() <em>Digital</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDigital()
   * @generated
   * @ordered
   */
  protected static final boolean DIGITAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDigital() <em>Digital</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDigital()
   * @generated
   * @ordered
   */
  protected boolean digital = DIGITAL_EDEFAULT;

  /**
   * The default value of the '{@link #isFix() <em>Fix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFix()
   * @generated
   * @ordered
   */
  protected static final boolean FIX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFix() <em>Fix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFix()
   * @generated
   * @ordered
   */
  protected boolean fix = FIX_EDEFAULT;

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
   * The cached value of the '{@link #getTypeAttributes() <em>Type Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> typeAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RentalTypeImpl()
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
    return RentalSystemPackage.Literals.RENTAL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMovable()
  {
    return movable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMovable(boolean newMovable)
  {
    boolean oldMovable = movable;
    movable = newMovable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalSystemPackage.RENTAL_TYPE__MOVABLE, oldMovable, movable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDigital()
  {
    return digital;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDigital(boolean newDigital)
  {
    boolean oldDigital = digital;
    digital = newDigital;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalSystemPackage.RENTAL_TYPE__DIGITAL, oldDigital, digital));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFix()
  {
    return fix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFix(boolean newFix)
  {
    boolean oldFix = fix;
    fix = newFix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalSystemPackage.RENTAL_TYPE__FIX, oldFix, fix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RentalSystemPackage.RENTAL_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getTypeAttributes()
  {
    if (typeAttributes == null)
    {
      typeAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RentalSystemPackage.RENTAL_TYPE__TYPE_ATTRIBUTES);
    }
    return typeAttributes;
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
      case RentalSystemPackage.RENTAL_TYPE__TYPE_ATTRIBUTES:
        return ((InternalEList<?>)getTypeAttributes()).basicRemove(otherEnd, msgs);
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
      case RentalSystemPackage.RENTAL_TYPE__MOVABLE:
        return isMovable();
      case RentalSystemPackage.RENTAL_TYPE__DIGITAL:
        return isDigital();
      case RentalSystemPackage.RENTAL_TYPE__FIX:
        return isFix();
      case RentalSystemPackage.RENTAL_TYPE__NAME:
        return getName();
      case RentalSystemPackage.RENTAL_TYPE__TYPE_ATTRIBUTES:
        return getTypeAttributes();
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
      case RentalSystemPackage.RENTAL_TYPE__MOVABLE:
        setMovable((Boolean)newValue);
        return;
      case RentalSystemPackage.RENTAL_TYPE__DIGITAL:
        setDigital((Boolean)newValue);
        return;
      case RentalSystemPackage.RENTAL_TYPE__FIX:
        setFix((Boolean)newValue);
        return;
      case RentalSystemPackage.RENTAL_TYPE__NAME:
        setName((String)newValue);
        return;
      case RentalSystemPackage.RENTAL_TYPE__TYPE_ATTRIBUTES:
        getTypeAttributes().clear();
        getTypeAttributes().addAll((Collection<? extends Attribute>)newValue);
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
      case RentalSystemPackage.RENTAL_TYPE__MOVABLE:
        setMovable(MOVABLE_EDEFAULT);
        return;
      case RentalSystemPackage.RENTAL_TYPE__DIGITAL:
        setDigital(DIGITAL_EDEFAULT);
        return;
      case RentalSystemPackage.RENTAL_TYPE__FIX:
        setFix(FIX_EDEFAULT);
        return;
      case RentalSystemPackage.RENTAL_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RentalSystemPackage.RENTAL_TYPE__TYPE_ATTRIBUTES:
        getTypeAttributes().clear();
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
      case RentalSystemPackage.RENTAL_TYPE__MOVABLE:
        return movable != MOVABLE_EDEFAULT;
      case RentalSystemPackage.RENTAL_TYPE__DIGITAL:
        return digital != DIGITAL_EDEFAULT;
      case RentalSystemPackage.RENTAL_TYPE__FIX:
        return fix != FIX_EDEFAULT;
      case RentalSystemPackage.RENTAL_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RentalSystemPackage.RENTAL_TYPE__TYPE_ATTRIBUTES:
        return typeAttributes != null && !typeAttributes.isEmpty();
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
    result.append(" (movable: ");
    result.append(movable);
    result.append(", digital: ");
    result.append(digital);
    result.append(", fix: ");
    result.append(fix);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RentalTypeImpl
