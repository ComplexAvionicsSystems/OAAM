/**
 */
package de.oaam.model.oaam.mapping;

import de.oaam.model.oaam.capabilities.SubDeviceCapability;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Device Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A mapping of a sub device to a device or subdevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.SubDeviceAssignment#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.SubDeviceAssignment#getSubDevice <em>Sub Device</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.SubDeviceAssignment#getTargetDevice <em>Target Device</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.mapping.MappingPackage#getSubDeviceAssignment()
 * @model
 * @generated
 */
public interface SubDeviceAssignment extends _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capability, which specifies the resource consumtion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(SubDeviceCapability)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSubDeviceAssignment_Capability()
	 * @model required="true"
	 * @generated
	 */
	SubDeviceCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.SubDeviceAssignment#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(SubDeviceCapability value);

	/**
	 * Returns the value of the '<em><b>Sub Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the sub device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Device</em>' reference.
	 * @see #setSubDevice(Device)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSubDeviceAssignment_SubDevice()
	 * @model required="true"
	 * @generated
	 */
	Device getSubDevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.SubDeviceAssignment#getSubDevice <em>Sub Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Device</em>' reference.
	 * @see #getSubDevice()
	 * @generated
	 */
	void setSubDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Target Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the host device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Device</em>' reference.
	 * @see #setTargetDevice(Device)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSubDeviceAssignment_TargetDevice()
	 * @model required="true"
	 * @generated
	 */
	Device getTargetDevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.SubDeviceAssignment#getTargetDevice <em>Target Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Device</em>' reference.
	 * @see #getTargetDevice()
	 * @generated
	 */
	void setTargetDevice(Device value);

} // SubDeviceAssignment
