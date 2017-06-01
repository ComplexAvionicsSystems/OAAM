/**
 */
package de.oaam.model.oaam.capabilities.impl;

import de.oaam.model.oaam.capabilities.CapabilitiesContainerA;
import de.oaam.model.oaam.capabilities.CapabilitiesPackage;
import de.oaam.model.oaam.capabilities.ConnectionCapability;
import de.oaam.model.oaam.capabilities.DeviceCapability;
import de.oaam.model.oaam.capabilities.SignalCapability;
import de.oaam.model.oaam.capabilities.SubDeviceCapability;
import de.oaam.model.oaam.capabilities.Subcapability;
import de.oaam.model.oaam.capabilities.TaskCapability;

import de.oaam.model.oaam.common.impl._ElementAImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getFunctionCapabilties <em>Function Capabilties</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getSignalCapabilities <em>Signal Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getDeviceCapabilities <em>Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getSubDeviceCapabilities <em>Sub Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getConnectionCapabilities <em>Connection Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getSubcapabilities <em>Subcapabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CapabilitiesContainerAImpl extends _ElementAImpl implements CapabilitiesContainerA {
	/**
	 * The cached value of the '{@link #getFunctionCapabilties() <em>Function Capabilties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionCapabilties()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskCapability> functionCapabilties;

	/**
	 * The cached value of the '{@link #getSignalCapabilities() <em>Signal Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalCapability> signalCapabilities;

	/**
	 * The cached value of the '{@link #getDeviceCapabilities() <em>Device Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceCapability> deviceCapabilities;

	/**
	 * The cached value of the '{@link #getSubDeviceCapabilities() <em>Sub Device Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDeviceCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<SubDeviceCapability> subDeviceCapabilities;

	/**
	 * The cached value of the '{@link #getConnectionCapabilities() <em>Connection Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionCapability> connectionCapabilities;

	/**
	 * The cached value of the '{@link #getSubcapabilities() <em>Subcapabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Subcapability> subcapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilitiesContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskCapability> getFunctionCapabilties() {
		if (functionCapabilties == null) {
			functionCapabilties = new EObjectContainmentEList<TaskCapability>(TaskCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES);
		}
		return functionCapabilties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalCapability> getSignalCapabilities() {
		if (signalCapabilities == null) {
			signalCapabilities = new EObjectContainmentEList<SignalCapability>(SignalCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES);
		}
		return signalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceCapability> getDeviceCapabilities() {
		if (deviceCapabilities == null) {
			deviceCapabilities = new EObjectContainmentEList<DeviceCapability>(DeviceCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES);
		}
		return deviceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubDeviceCapability> getSubDeviceCapabilities() {
		if (subDeviceCapabilities == null) {
			subDeviceCapabilities = new EObjectContainmentEList<SubDeviceCapability>(SubDeviceCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES);
		}
		return subDeviceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionCapability> getConnectionCapabilities() {
		if (connectionCapabilities == null) {
			connectionCapabilities = new EObjectContainmentEList<ConnectionCapability>(ConnectionCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES);
		}
		return connectionCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subcapability> getSubcapabilities() {
		if (subcapabilities == null) {
			subcapabilities = new EObjectContainmentEList<Subcapability>(Subcapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES);
		}
		return subcapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES:
				return ((InternalEList<?>)getFunctionCapabilties()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES:
				return ((InternalEList<?>)getSignalCapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES:
				return ((InternalEList<?>)getDeviceCapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES:
				return ((InternalEList<?>)getSubDeviceCapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES:
				return ((InternalEList<?>)getConnectionCapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				return ((InternalEList<?>)getSubcapabilities()).basicRemove(otherEnd, msgs);
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
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES:
				return getFunctionCapabilties();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES:
				return getSignalCapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES:
				return getDeviceCapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES:
				return getSubDeviceCapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES:
				return getConnectionCapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				return getSubcapabilities();
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
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES:
				getFunctionCapabilties().clear();
				getFunctionCapabilties().addAll((Collection<? extends TaskCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES:
				getSignalCapabilities().clear();
				getSignalCapabilities().addAll((Collection<? extends SignalCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES:
				getDeviceCapabilities().clear();
				getDeviceCapabilities().addAll((Collection<? extends DeviceCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES:
				getSubDeviceCapabilities().clear();
				getSubDeviceCapabilities().addAll((Collection<? extends SubDeviceCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES:
				getConnectionCapabilities().clear();
				getConnectionCapabilities().addAll((Collection<? extends ConnectionCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				getSubcapabilities().clear();
				getSubcapabilities().addAll((Collection<? extends Subcapability>)newValue);
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
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES:
				getFunctionCapabilties().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES:
				getSignalCapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES:
				getDeviceCapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES:
				getSubDeviceCapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES:
				getConnectionCapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				getSubcapabilities().clear();
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
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES:
				return functionCapabilties != null && !functionCapabilties.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES:
				return signalCapabilities != null && !signalCapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES:
				return deviceCapabilities != null && !deviceCapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES:
				return subDeviceCapabilities != null && !subDeviceCapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES:
				return connectionCapabilities != null && !connectionCapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				return subcapabilities != null && !subcapabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilitiesContainerAImpl
