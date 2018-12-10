/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subdevice Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A allocations of a sub device to a device or subdevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.SubdeviceAssignment#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SubdeviceAssignment#getSubdevice <em>Subdevice</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SubdeviceAssignment#getTargetDevice <em>Target Device</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubdeviceAssignment()
 * @model
 * @generated
 */
public interface SubdeviceAssignment extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capability, which specifies the resource consumtion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(SubdeviceInDeviceCapability)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubdeviceAssignment_Capability()
	 * @model required="true"
	 * @generated
	 */
	SubdeviceInDeviceCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SubdeviceAssignment#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(SubdeviceInDeviceCapability value);

	/**
	 * Returns the value of the '<em><b>Subdevice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the subdevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subdevice</em>' reference.
	 * @see #setSubdevice(Device)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubdeviceAssignment_Subdevice()
	 * @model required="true"
	 * @generated
	 */
	Device getSubdevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SubdeviceAssignment#getSubdevice <em>Subdevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice</em>' reference.
	 * @see #getSubdevice()
	 * @generated
	 */
	void setSubdevice(Device value);

	/**
	 * Returns the value of the '<em><b>Target Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the host device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Device</em>' reference.
	 * @see #setTargetDevice(Device)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubdeviceAssignment_TargetDevice()
	 * @model required="true"
	 * @generated
	 */
	Device getTargetDevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SubdeviceAssignment#getTargetDevice <em>Target Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Device</em>' reference.
	 * @see #getTargetDevice()
	 * @generated
	 */
	void setTargetDevice(Device value);

} // SubdeviceAssignment
