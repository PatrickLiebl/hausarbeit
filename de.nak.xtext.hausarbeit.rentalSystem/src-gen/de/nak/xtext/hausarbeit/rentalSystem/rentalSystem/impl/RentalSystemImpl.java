/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem;
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
 * An implementation of the model object '<em><b>Rental System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemImpl#getRentalTypes <em>Rental Types</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalSystemImpl#getDeals <em>Deals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RentalSystemImpl extends MinimalEObjectImpl.Container implements RentalSystem
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
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRentalTypes() <em>Rental Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRentalTypes()
   * @generated
   * @ordered
   */
  protected EList<RentalType> rentalTypes;

  /**
   * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomers()
   * @generated
   * @ordered
   */
  protected EList<Customer> customers;

  /**
   * The cached value of the '{@link #getDeals() <em>Deals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeals()
   * @generated
   * @ordered
   */
  protected EList<Deal> deals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RentalSystemImpl()
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
    return RentalSystemPackage.Literals.RENTAL_SYSTEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RentalSystemPackage.RENTAL_SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalSystemPackage.RENTAL_SYSTEM__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RentalType> getRentalTypes()
  {
    if (rentalTypes == null)
    {
      rentalTypes = new EObjectContainmentEList<RentalType>(RentalType.class, this, RentalSystemPackage.RENTAL_SYSTEM__RENTAL_TYPES);
    }
    return rentalTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Customer> getCustomers()
  {
    if (customers == null)
    {
      customers = new EObjectContainmentEList<Customer>(Customer.class, this, RentalSystemPackage.RENTAL_SYSTEM__CUSTOMERS);
    }
    return customers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Deal> getDeals()
  {
    if (deals == null)
    {
      deals = new EObjectContainmentEList<Deal>(Deal.class, this, RentalSystemPackage.RENTAL_SYSTEM__DEALS);
    }
    return deals;
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
      case RentalSystemPackage.RENTAL_SYSTEM__RENTAL_TYPES:
        return ((InternalEList<?>)getRentalTypes()).basicRemove(otherEnd, msgs);
      case RentalSystemPackage.RENTAL_SYSTEM__CUSTOMERS:
        return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
      case RentalSystemPackage.RENTAL_SYSTEM__DEALS:
        return ((InternalEList<?>)getDeals()).basicRemove(otherEnd, msgs);
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
      case RentalSystemPackage.RENTAL_SYSTEM__NAME:
        return getName();
      case RentalSystemPackage.RENTAL_SYSTEM__TITLE:
        return getTitle();
      case RentalSystemPackage.RENTAL_SYSTEM__RENTAL_TYPES:
        return getRentalTypes();
      case RentalSystemPackage.RENTAL_SYSTEM__CUSTOMERS:
        return getCustomers();
      case RentalSystemPackage.RENTAL_SYSTEM__DEALS:
        return getDeals();
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
      case RentalSystemPackage.RENTAL_SYSTEM__NAME:
        setName((String)newValue);
        return;
      case RentalSystemPackage.RENTAL_SYSTEM__TITLE:
        setTitle((String)newValue);
        return;
      case RentalSystemPackage.RENTAL_SYSTEM__RENTAL_TYPES:
        getRentalTypes().clear();
        getRentalTypes().addAll((Collection<? extends RentalType>)newValue);
        return;
      case RentalSystemPackage.RENTAL_SYSTEM__CUSTOMERS:
        getCustomers().clear();
        getCustomers().addAll((Collection<? extends Customer>)newValue);
        return;
      case RentalSystemPackage.RENTAL_SYSTEM__DEALS:
        getDeals().clear();
        getDeals().addAll((Collection<? extends Deal>)newValue);
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
      case RentalSystemPackage.RENTAL_SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RentalSystemPackage.RENTAL_SYSTEM__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case RentalSystemPackage.RENTAL_SYSTEM__RENTAL_TYPES:
        getRentalTypes().clear();
        return;
      case RentalSystemPackage.RENTAL_SYSTEM__CUSTOMERS:
        getCustomers().clear();
        return;
      case RentalSystemPackage.RENTAL_SYSTEM__DEALS:
        getDeals().clear();
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
      case RentalSystemPackage.RENTAL_SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RentalSystemPackage.RENTAL_SYSTEM__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case RentalSystemPackage.RENTAL_SYSTEM__RENTAL_TYPES:
        return rentalTypes != null && !rentalTypes.isEmpty();
      case RentalSystemPackage.RENTAL_SYSTEM__CUSTOMERS:
        return customers != null && !customers.isEmpty();
      case RentalSystemPackage.RENTAL_SYSTEM__DEALS:
        return deals != null && !deals.isEmpty();
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
    result.append(", title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //RentalSystemImpl
