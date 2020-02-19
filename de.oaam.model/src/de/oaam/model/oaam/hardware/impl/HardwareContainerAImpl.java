/**
 */
package de.oaam.model.oaam.hardware.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.hardware.Bus;
import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.Device;
import de.oaam.model.oaam.hardware.DeviceSymmetry;
import de.oaam.model.oaam.hardware.HardwareContainerA;
import de.oaam.model.oaam.hardware.HardwarePackage;
import de.oaam.model.oaam.hardware.Subhardware;

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
 *   <li>{@link de.oaam.model.oaam.hardware.impl.HardwareContainerAImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.HardwareContainerAImpl#getDeviceSymmetries <em>Device Symmetries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.HardwareContainerAImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.HardwareContainerAImpl#getSubhardware <em>Subhardware</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.HardwareContainerAImpl#getBuses <em>Buses</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HardwareContainerAImpl extends OaamBaseElementAImpl implements HardwareContainerA {
	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getDeviceSymmetries() <em>Device Symmetries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSymmetries()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceSymmetry> deviceSymmetries;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getSubhardware() <em>Subhardware</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubhardware()
	 * @generated
	 * @ordered
	 */
	protected EList<Subhardware> subhardware;

	/**
	 * The cached value of the '{@link #getBuses() <em>Buses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuses()
	 * @generated
	 * @ordered
	 */
	protected EList<Bus> buses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.HARDWARE_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Device>(Device.class, this, HardwarePackage.HARDWARE_CONTAINER_A__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceSymmetry> getDeviceSymmetries() {
		if (deviceSymmetries == null) {
			deviceSymmetries = new EObjectContainmentEList<DeviceSymmetry>(DeviceSymmetry.class, this, HardwarePackage.HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES);
		}
		return deviceSymmetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, HardwarePackage.HARDWARE_CONTAINER_A__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subhardware> getSubhardware() {
		if (subhardware == null) {
			subhardware = new EObjectContainmentEList<Subhardware>(Subhardware.class, this, HardwarePackage.HARDWARE_CONTAINER_A__SUBHARDWARE);
		}
		return subhardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bus> getBuses() {
		if (buses == null) {
			buses = new EObjectContainmentEList<Bus>(Bus.class, this, HardwarePackage.HARDWARE_CONTAINER_A__BUSES);
		}
		return buses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES:
				return ((InternalEList<?>)getDeviceSymmetries()).basicRemove(otherEnd, msgs);
			case HardwarePackage.HARDWARE_CONTAINER_A__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case HardwarePackage.HARDWARE_CONTAINER_A__SUBHARDWARE:
				return ((InternalEList<?>)getSubhardware()).basicRemove(otherEnd, msgs);
			case HardwarePackage.HARDWARE_CONTAINER_A__BUSES:
				return ((InternalEList<?>)getBuses()).basicRemove(otherEnd, msgs);
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
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICES:
				return getDevices();
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES:
				return getDeviceSymmetries();
			case HardwarePackage.HARDWARE_CONTAINER_A__CONNECTIONS:
				return getConnections();
			case HardwarePackage.HARDWARE_CONTAINER_A__SUBHARDWARE:
				return getSubhardware();
			case HardwarePackage.HARDWARE_CONTAINER_A__BUSES:
				return getBuses();
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
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES:
				getDeviceSymmetries().clear();
				getDeviceSymmetries().addAll((Collection<? extends DeviceSymmetry>)newValue);
				return;
			case HardwarePackage.HARDWARE_CONTAINER_A__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case HardwarePackage.HARDWARE_CONTAINER_A__SUBHARDWARE:
				getSubhardware().clear();
				getSubhardware().addAll((Collection<? extends Subhardware>)newValue);
				return;
			case HardwarePackage.HARDWARE_CONTAINER_A__BUSES:
				getBuses().clear();
				getBuses().addAll((Collection<? extends Bus>)newValue);
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
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICES:
				getDevices().clear();
				return;
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES:
				getDeviceSymmetries().clear();
				return;
			case HardwarePackage.HARDWARE_CONTAINER_A__CONNECTIONS:
				getConnections().clear();
				return;
			case HardwarePackage.HARDWARE_CONTAINER_A__SUBHARDWARE:
				getSubhardware().clear();
				return;
			case HardwarePackage.HARDWARE_CONTAINER_A__BUSES:
				getBuses().clear();
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
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICES:
				return devices != null && !devices.isEmpty();
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES:
				return deviceSymmetries != null && !deviceSymmetries.isEmpty();
			case HardwarePackage.HARDWARE_CONTAINER_A__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case HardwarePackage.HARDWARE_CONTAINER_A__SUBHARDWARE:
				return subhardware != null && !subhardware.isEmpty();
			case HardwarePackage.HARDWARE_CONTAINER_A__BUSES:
				return buses != null && !buses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwareContainerAImpl
