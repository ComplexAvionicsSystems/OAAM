/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.MessageType;
import de.oaam.model.oaam.library.SignalType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal In Message Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible allocations of a connection to a location or duct.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.SignalInMessageCapability#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.SignalInMessageCapability#getSignalType <em>Signal Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSignalInMessageCapability()
 * @model
 * @generated
 */
public interface SignalInMessageCapability extends CapabilityA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message type of the messages for which this capability is valid (parent)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type</em>' reference.
	 * @see #setMessageType(MessageType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSignalInMessageCapability_MessageType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SignalInMessageCapability#getMessageType <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Signal Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message type of the messages for which this capability is valid (child)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Type</em>' reference.
	 * @see #setSignalType(SignalType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSignalInMessageCapability_SignalType()
	 * @model required="true"
	 * @generated
	 */
	SignalType getSignalType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SignalInMessageCapability#getSignalType <em>Signal Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Type</em>' reference.
	 * @see #getSignalType()
	 * @generated
	 */
	void setSignalType(SignalType value);

} // SignalInMessageCapability
