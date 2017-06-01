/**
 */
package de.oaam.model.oaam.capabilities.impl;

import de.oaam.model.oaam.capabilities.CapabilitiesPackage;
import de.oaam.model.oaam.capabilities.CapabilityA;
import de.oaam.model.oaam.capabilities.ResourceConsumption;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilityAImpl#getResourceConsumptions <em>Resource Consumptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CapabilityAImpl extends MinimalEObjectImpl.Container implements CapabilityA {
	/**
	 * The cached value of the '{@link #getResourceConsumptions() <em>Resource Consumptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceConsumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceConsumption> resourceConsumptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilitiesPackage.Literals.CAPABILITY_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceConsumption> getResourceConsumptions() {
		if (resourceConsumptions == null) {
			resourceConsumptions = new EObjectContainmentEList<ResourceConsumption>(ResourceConsumption.class, this, CapabilitiesPackage.CAPABILITY_A__RESOURCE_CONSUMPTIONS);
		}
		return resourceConsumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilitiesPackage.CAPABILITY_A__RESOURCE_CONSUMPTIONS:
				return ((InternalEList<?>)getResourceConsumptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilitiesPackage.CAPABILITY_A__RESOURCE_CONSUMPTIONS:
				return getResourceConsumptions();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CapabilitiesPackage.CAPABILITY_A__RESOURCE_CONSUMPTIONS:
				getResourceConsumptions().clear();
				getResourceConsumptions().addAll((Collection<? extends ResourceConsumption>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CapabilitiesPackage.CAPABILITY_A__RESOURCE_CONSUMPTIONS:
				getResourceConsumptions().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CapabilitiesPackage.CAPABILITY_A__RESOURCE_CONSUMPTIONS:
				return resourceConsumptions != null && !resourceConsumptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityAImpl
