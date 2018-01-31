/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.library.DeviceType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Device Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible mapping of a sub device to a device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.SubDeviceCapability#getSubDeviceType <em>Sub Device Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.SubDeviceCapability#getTargetDeviceType <em>Target Device Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSubDeviceCapability()
 * @model
 * @generated
 */
public interface SubDeviceCapability extends CapabilityA, ElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Sub Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device type that should be mapped to another device type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Device Type</em>' reference.
	 * @see #setSubDeviceType(DeviceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSubDeviceCapability_SubDeviceType()
	 * @model required="true"
	 * @generated
	 */
	DeviceType getSubDeviceType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SubDeviceCapability#getSubDeviceType <em>Sub Device Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Device Type</em>' reference.
	 * @see #getSubDeviceType()
	 * @generated
	 */
	void setSubDeviceType(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Target Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target device type for the subdevice capability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Device Type</em>' reference.
	 * @see #setTargetDeviceType(DeviceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSubDeviceCapability_TargetDeviceType()
	 * @model required="true"
	 * @generated
	 */
	DeviceType getTargetDeviceType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SubDeviceCapability#getTargetDeviceType <em>Target Device Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Device Type</em>' reference.
	 * @see #getTargetDeviceType()
	 * @generated
	 */
	void setTargetDeviceType(DeviceType value);

} // SubDeviceCapability
