/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subconnection Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A allocations of a subconnection to a device or subdevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.SubconnectionAssignment#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SubconnectionAssignment#getSubconnection <em>Subconnection</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SubconnectionAssignment#getTargetDevice <em>Target Device</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubconnectionAssignment()
 * @model
 * @generated
 */
public interface SubconnectionAssignment extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capability, which specifies the resource consumtion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(SubconnectionInDeviceCapability)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubconnectionAssignment_Capability()
	 * @model required="true"
	 * @generated
	 */
	SubconnectionInDeviceCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SubconnectionAssignment#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(SubconnectionInDeviceCapability value);

	/**
	 * Returns the value of the '<em><b>Subconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the subconnection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subconnection</em>' reference.
	 * @see #setSubconnection(Connection)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubconnectionAssignment_Subconnection()
	 * @model required="true"
	 * @generated
	 */
	Connection getSubconnection();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SubconnectionAssignment#getSubconnection <em>Subconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subconnection</em>' reference.
	 * @see #getSubconnection()
	 * @generated
	 */
	void setSubconnection(Connection value);

	/**
	 * Returns the value of the '<em><b>Target Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the host device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Device</em>' reference.
	 * @see #setTargetDevice(Device)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubconnectionAssignment_TargetDevice()
	 * @model required="true"
	 * @generated
	 */
	Device getTargetDevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SubconnectionAssignment#getTargetDevice <em>Target Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Device</em>' reference.
	 * @see #getTargetDevice()
	 * @generated
	 */
	void setTargetDevice(Device value);

} // SubconnectionAssignment
