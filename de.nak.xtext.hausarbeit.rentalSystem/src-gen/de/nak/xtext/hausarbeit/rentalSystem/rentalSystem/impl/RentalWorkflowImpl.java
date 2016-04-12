/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalWorkflow;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.impl.RentalWorkflowImpl#getRentalWorkflow <em>Rental Workflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RentalWorkflowImpl extends MinimalEObjectImpl.Container implements RentalWorkflow
{
  /**
   * The cached value of the '{@link #getRentalWorkflow() <em>Rental Workflow</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRentalWorkflow()
   * @generated
   * @ordered
   */
  protected de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow rentalWorkflow;

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
    return RentalSystemPackage.Literals.RENTAL_WORKFLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow getRentalWorkflow()
  {
    if (rentalWorkflow != null && rentalWorkflow.eIsProxy())
    {
      InternalEObject oldRentalWorkflow = (InternalEObject)rentalWorkflow;
      rentalWorkflow = (de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow)eResolveProxy(oldRentalWorkflow);
      if (rentalWorkflow != oldRentalWorkflow)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalSystemPackage.RENTAL_WORKFLOW__RENTAL_WORKFLOW, oldRentalWorkflow, rentalWorkflow));
      }
    }
    return rentalWorkflow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow basicGetRentalWorkflow()
  {
    return rentalWorkflow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRentalWorkflow(de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow newRentalWorkflow)
  {
    de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow oldRentalWorkflow = rentalWorkflow;
    rentalWorkflow = newRentalWorkflow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalSystemPackage.RENTAL_WORKFLOW__RENTAL_WORKFLOW, oldRentalWorkflow, rentalWorkflow));
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
      case RentalSystemPackage.RENTAL_WORKFLOW__RENTAL_WORKFLOW:
        if (resolve) return getRentalWorkflow();
        return basicGetRentalWorkflow();
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
      case RentalSystemPackage.RENTAL_WORKFLOW__RENTAL_WORKFLOW:
        setRentalWorkflow((de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow)newValue);
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
      case RentalSystemPackage.RENTAL_WORKFLOW__RENTAL_WORKFLOW:
        setRentalWorkflow((de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow)null);
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
      case RentalSystemPackage.RENTAL_WORKFLOW__RENTAL_WORKFLOW:
        return rentalWorkflow != null;
    }
    return super.eIsSet(featureID);
  }

} //RentalWorkflowImpl
