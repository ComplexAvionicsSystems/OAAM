/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.library.DeviceType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subdevice In Device Capability</b></em>'.
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
 *   <li>{@link de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability#getSubdeviceType <em>Subdevice Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability#getTargetDeviceType <em>Target Device Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSubdeviceInDeviceCapability()
 * @model
 * @generated
 */
public interface SubdeviceInDeviceCapability extends CapabilityA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Subdevice Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device type that should be mapped to another device type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subdevice Type</em>' reference.
	 * @see #setSubdeviceType(DeviceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSubdeviceInDeviceCapability_SubdeviceType()
	 * @model required="true"
	 * @generated
	 */
	DeviceType getSubdeviceType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability#getSubdeviceType <em>Subdevice Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice Type</em>' reference.
	 * @see #getSubdeviceType()
	 * @generated
	 */
	void setSubdeviceType(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Target Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target device type for the subdevice capability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Device Type</em>' reference.
	 * @see #setTargetDeviceType(DeviceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSubdeviceInDeviceCapability_TargetDeviceType()
	 * @model required="true"
	 * @generated
	 */
	DeviceType getTargetDeviceType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability#getTargetDeviceType <em>Target Device Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Device Type</em>' reference.
	 * @see #getTargetDeviceType()
	 * @generated
	 */
	void setTargetDeviceType(DeviceType value);

} // SubdeviceInDeviceCapability
