/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.anatomy.Location;

import de.oaam.model.oaam.capabilities.DeviceInLocationCapability;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A allocations of a device to a location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.DeviceAssignment#getDevice <em>Device</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.DeviceAssignment#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.DeviceAssignment#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getDeviceAssignment()
 * @model
 * @generated
 */
public interface DeviceAssignment extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getDeviceAssignment_Device()
	 * @model required="true"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.DeviceAssignment#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getDeviceAssignment_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.DeviceAssignment#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capability, which specifies the resource consumtion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(DeviceInLocationCapability)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getDeviceAssignment_Capability()
	 * @model required="true"
	 * @generated
	 */
	DeviceInLocationCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.DeviceAssignment#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(DeviceInLocationCapability value);

} // DeviceAssignment
