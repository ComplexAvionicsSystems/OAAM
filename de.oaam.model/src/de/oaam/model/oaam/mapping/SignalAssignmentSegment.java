/**
 */
package de.oaam.model.oaam.mapping;

import de.oaam.model.oaam.capabilities.SignalCapability;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Assignment Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A signal segment is the mapping of a signal to either one device or one connection. Many consecutive segment define a full signal mapping path
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment#getDevice <em>Device</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.mapping.MappingPackage#getSignalAssignmentSegment()
 * @model
 * @generated
 */
public interface SignalAssignmentSegment extends _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capabilty, which specifies the resource consumtion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(SignalCapability)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSignalAssignmentSegment_Capability()
	 * @model required="true"
	 * @generated
	 */
	SignalCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(SignalCapability value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSignalAssignmentSegment_Device()
	 * @model
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either device or connection can be filled. Not both at the same time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSignalAssignmentSegment_Connection()
	 * @model
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

} // SignalAssignmentSegment
