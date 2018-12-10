/**
 */
package de.oaam.model.oaam.capabilities.impl;

import de.oaam.model.oaam.capabilities.CapabilitiesContainerA;
import de.oaam.model.oaam.capabilities.CapabilitiesPackage;
import de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability;
import de.oaam.model.oaam.capabilities.DeviceInLocationCapability;
import de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability;
import de.oaam.model.oaam.capabilities.Subcapabilities;
import de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability;
import de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability;
import de.oaam.model.oaam.capabilities.TaskOnDeviceCapability;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

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
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getTaskOnDeviceCapabilities <em>Task On Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getSignalOnConnectionOrDeviceCapabilities <em>Signal On Connection Or Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getDeviceInLocationCapabilities <em>Device In Location Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getSubdeviceInDeviceCapabilities <em>Subdevice In Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getConnectionInDuctOrLocationCapabilities <em>Connection In Duct Or Location Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getSubcapabilities <em>Subcapabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl#getSubconnectionInDeviceCapabilities <em>Subconnection In Device Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CapabilitiesContainerAImpl extends OaamBaseElementAImpl implements CapabilitiesContainerA {
	/**
	 * The cached value of the '{@link #getTaskOnDeviceCapabilities() <em>Task On Device Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskOnDeviceCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskOnDeviceCapability> taskOnDeviceCapabilities;

	/**
	 * The cached value of the '{@link #getSignalOnConnectionOrDeviceCapabilities() <em>Signal On Connection Or Device Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalOnConnectionOrDeviceCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalOnConnectionOrDeviceCapability> signalOnConnectionOrDeviceCapabilities;

	/**
	 * The cached value of the '{@link #getDeviceInLocationCapabilities() <em>Device In Location Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceInLocationCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceInLocationCapability> deviceInLocationCapabilities;

	/**
	 * The cached value of the '{@link #getSubdeviceInDeviceCapabilities() <em>Subdevice In Device Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdeviceInDeviceCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<SubdeviceInDeviceCapability> subdeviceInDeviceCapabilities;

	/**
	 * The cached value of the '{@link #getConnectionInDuctOrLocationCapabilities() <em>Connection In Duct Or Location Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionInDuctOrLocationCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionInDuctOrLocationCapability> connectionInDuctOrLocationCapabilities;

	/**
	 * The cached value of the '{@link #getSubcapabilities() <em>Subcapabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Subcapabilities> subcapabilities;

	/**
	 * The cached value of the '{@link #getSubconnectionInDeviceCapabilities() <em>Subconnection In Device Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubconnectionInDeviceCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<SubconnectionInDeviceCapability> subconnectionInDeviceCapabilities;

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
	public EList<TaskOnDeviceCapability> getTaskOnDeviceCapabilities() {
		if (taskOnDeviceCapabilities == null) {
			taskOnDeviceCapabilities = new EObjectContainmentEList<TaskOnDeviceCapability>(TaskOnDeviceCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES);
		}
		return taskOnDeviceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalOnConnectionOrDeviceCapability> getSignalOnConnectionOrDeviceCapabilities() {
		if (signalOnConnectionOrDeviceCapabilities == null) {
			signalOnConnectionOrDeviceCapabilities = new EObjectContainmentEList<SignalOnConnectionOrDeviceCapability>(SignalOnConnectionOrDeviceCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES);
		}
		return signalOnConnectionOrDeviceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceInLocationCapability> getDeviceInLocationCapabilities() {
		if (deviceInLocationCapabilities == null) {
			deviceInLocationCapabilities = new EObjectContainmentEList<DeviceInLocationCapability>(DeviceInLocationCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES);
		}
		return deviceInLocationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubdeviceInDeviceCapability> getSubdeviceInDeviceCapabilities() {
		if (subdeviceInDeviceCapabilities == null) {
			subdeviceInDeviceCapabilities = new EObjectContainmentEList<SubdeviceInDeviceCapability>(SubdeviceInDeviceCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES);
		}
		return subdeviceInDeviceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionInDuctOrLocationCapability> getConnectionInDuctOrLocationCapabilities() {
		if (connectionInDuctOrLocationCapabilities == null) {
			connectionInDuctOrLocationCapabilities = new EObjectContainmentEList<ConnectionInDuctOrLocationCapability>(ConnectionInDuctOrLocationCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES);
		}
		return connectionInDuctOrLocationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subcapabilities> getSubcapabilities() {
		if (subcapabilities == null) {
			subcapabilities = new EObjectContainmentEList<Subcapabilities>(Subcapabilities.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES);
		}
		return subcapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubconnectionInDeviceCapability> getSubconnectionInDeviceCapabilities() {
		if (subconnectionInDeviceCapabilities == null) {
			subconnectionInDeviceCapabilities = new EObjectContainmentEList<SubconnectionInDeviceCapability>(SubconnectionInDeviceCapability.class, this, CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES);
		}
		return subconnectionInDeviceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES:
				return ((InternalEList<?>)getTaskOnDeviceCapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES:
				return ((InternalEList<?>)getSignalOnConnectionOrDeviceCapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES:
				return ((InternalEList<?>)getDeviceInLocationCapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES:
				return ((InternalEList<?>)getSubdeviceInDeviceCapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES:
				return ((InternalEList<?>)getConnectionInDuctOrLocationCapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				return ((InternalEList<?>)getSubcapabilities()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES:
				return ((InternalEList<?>)getSubconnectionInDeviceCapabilities()).basicRemove(otherEnd, msgs);
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
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES:
				return getTaskOnDeviceCapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES:
				return getSignalOnConnectionOrDeviceCapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES:
				return getDeviceInLocationCapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES:
				return getSubdeviceInDeviceCapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES:
				return getConnectionInDuctOrLocationCapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				return getSubcapabilities();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES:
				return getSubconnectionInDeviceCapabilities();
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
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES:
				getTaskOnDeviceCapabilities().clear();
				getTaskOnDeviceCapabilities().addAll((Collection<? extends TaskOnDeviceCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES:
				getSignalOnConnectionOrDeviceCapabilities().clear();
				getSignalOnConnectionOrDeviceCapabilities().addAll((Collection<? extends SignalOnConnectionOrDeviceCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES:
				getDeviceInLocationCapabilities().clear();
				getDeviceInLocationCapabilities().addAll((Collection<? extends DeviceInLocationCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES:
				getSubdeviceInDeviceCapabilities().clear();
				getSubdeviceInDeviceCapabilities().addAll((Collection<? extends SubdeviceInDeviceCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES:
				getConnectionInDuctOrLocationCapabilities().clear();
				getConnectionInDuctOrLocationCapabilities().addAll((Collection<? extends ConnectionInDuctOrLocationCapability>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				getSubcapabilities().clear();
				getSubcapabilities().addAll((Collection<? extends Subcapabilities>)newValue);
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES:
				getSubconnectionInDeviceCapabilities().clear();
				getSubconnectionInDeviceCapabilities().addAll((Collection<? extends SubconnectionInDeviceCapability>)newValue);
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
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES:
				getTaskOnDeviceCapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES:
				getSignalOnConnectionOrDeviceCapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES:
				getDeviceInLocationCapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES:
				getSubdeviceInDeviceCapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES:
				getConnectionInDuctOrLocationCapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				getSubcapabilities().clear();
				return;
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES:
				getSubconnectionInDeviceCapabilities().clear();
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
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES:
				return taskOnDeviceCapabilities != null && !taskOnDeviceCapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES:
				return signalOnConnectionOrDeviceCapabilities != null && !signalOnConnectionOrDeviceCapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES:
				return deviceInLocationCapabilities != null && !deviceInLocationCapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES:
				return subdeviceInDeviceCapabilities != null && !subdeviceInDeviceCapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES:
				return connectionInDuctOrLocationCapabilities != null && !connectionInDuctOrLocationCapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
				return subcapabilities != null && !subcapabilities.isEmpty();
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES:
				return subconnectionInDeviceCapabilities != null && !subconnectionInDeviceCapabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilitiesContainerAImpl
