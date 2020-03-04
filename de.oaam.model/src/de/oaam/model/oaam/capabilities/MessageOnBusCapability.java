/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.BusType;
import de.oaam.model.oaam.library.MessageType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message On Bus Capability</b></em>'.
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
 *   <li>{@link de.oaam.model.oaam.capabilities.MessageOnBusCapability#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.MessageOnBusCapability#getMessageType <em>Message Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getMessageOnBusCapability()
 * @model
 * @generated
 */
public interface MessageOnBusCapability extends CapabilityA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection type for which this capability is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Type</em>' reference.
	 * @see #setBusType(BusType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getMessageOnBusCapability_BusType()
	 * @model required="true"
	 * @generated
	 */
	BusType getBusType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.MessageOnBusCapability#getBusType <em>Bus Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' reference.
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(BusType value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message type of the messages for which this capability is valid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type</em>' reference.
	 * @see #setMessageType(MessageType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getMessageOnBusCapability_MessageType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.MessageOnBusCapability#getMessageType <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

} // MessageOnBusCapability
