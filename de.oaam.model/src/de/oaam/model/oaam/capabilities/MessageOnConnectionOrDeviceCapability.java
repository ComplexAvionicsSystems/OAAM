/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.MessageType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message On Connection Or Device Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible allocations of a signal to a device or connection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability#getWorstCaseTransmissionTime <em>Worst Case Transmission Time</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getMessageOnConnectionOrDeviceCapability()
 * @model
 * @generated
 */
public interface MessageOnConnectionOrDeviceCapability extends CapabilityA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signal type for which this capability is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type</em>' reference.
	 * @see #setMessageType(MessageType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getMessageOnConnectionOrDeviceCapability_MessageType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability#getMessageType <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only one either a device type or a connection type can be specified as a target for signals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type</em>' reference.
	 * @see #setDeviceType(DeviceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getMessageOnConnectionOrDeviceCapability_DeviceType()
	 * @model
	 * @generated
	 */
	DeviceType getDeviceType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability#getDeviceType <em>Device Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' reference.
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only one either a device type or a connection type can be specified as a target for signals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type</em>' reference.
	 * @see #setConnectionType(ConnectionType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getMessageOnConnectionOrDeviceCapability_ConnectionType()
	 * @model
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability#getConnectionType <em>Connection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' reference.
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Worst Case Transmission Time</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worst case transmission time of the signal in s. It makes only sense, if the transmission is deterministic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Worst Case Transmission Time</em>' attribute.
	 * @see #setWorstCaseTransmissionTime(float)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getMessageOnConnectionOrDeviceCapability_WorstCaseTransmissionTime()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getWorstCaseTransmissionTime();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability#getWorstCaseTransmissionTime <em>Worst Case Transmission Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Case Transmission Time</em>' attribute.
	 * @see #getWorstCaseTransmissionTime()
	 * @generated
	 */
	void setWorstCaseTransmissionTime(float value);

} // MessageOnConnectionOrDeviceCapability
