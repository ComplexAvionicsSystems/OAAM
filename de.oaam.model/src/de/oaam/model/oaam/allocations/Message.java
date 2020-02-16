/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.capabilities.MessageOnBusCapability;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.hardware.Bus;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A message is a virtual packaging of signals. It can be used to describe the data transportation on a bussystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.Message#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.Message#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA, MessageA {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capability, which specifies the resource consumption.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(MessageOnBusCapability)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessage_Capability()
	 * @model required="true"
	 * @generated
	 */
	MessageOnBusCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.Message#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(MessageOnBusCapability value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the bus this message is allocated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(Bus)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessage_Bus()
	 * @model required="true"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.Message#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

} // Message
