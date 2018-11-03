/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.DeviceType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subconnection In Device Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible allocations of a sub device to a device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability#getSubconnectionType <em>Subconnection Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability#getTargetDeviceType <em>Target Device Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSubconnectionInDeviceCapability()
 * @model
 * @generated
 */
public interface SubconnectionInDeviceCapability extends CapabilityA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Subconnection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device type that should be mapped to another device type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subconnection Type</em>' reference.
	 * @see #setSubconnectionType(ConnectionType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSubconnectionInDeviceCapability_SubconnectionType()
	 * @model required="true"
	 * @generated
	 */
	ConnectionType getSubconnectionType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability#getSubconnectionType <em>Subconnection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subconnection Type</em>' reference.
	 * @see #getSubconnectionType()
	 * @generated
	 */
	void setSubconnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Target Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target device type for the subdevice capability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Device Type</em>' reference.
	 * @see #setTargetDeviceType(DeviceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSubconnectionInDeviceCapability_TargetDeviceType()
	 * @model required="true"
	 * @generated
	 */
	DeviceType getTargetDeviceType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability#getTargetDeviceType <em>Target Device Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Device Type</em>' reference.
	 * @see #getTargetDeviceType()
	 * @generated
	 */
	void setTargetDeviceType(DeviceType value);

} // SubconnectionInDeviceCapability
