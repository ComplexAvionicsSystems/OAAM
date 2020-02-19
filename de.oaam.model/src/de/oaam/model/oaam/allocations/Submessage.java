/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.capabilities.SubmessageInMessageCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submessage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A submessage is a virtual packaging of signals within a parent message. It can be used to describe the hirachic data transportation on a bussystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.Submessage#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.Submessage#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubmessage()
 * @model
 * @generated
 */
public interface Submessage extends MessageA {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capability, which specifies the resource consumption.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(SubmessageInMessageCapability)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubmessage_Capability()
	 * @model required="true"
	 * @generated
	 */
	SubmessageInMessageCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.Submessage#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(SubmessageInMessageCapability value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start bit of this submessage inside the message. The length of and encoding is defined with the datatype of the signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSubmessage_Position()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.Submessage#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // Submessage
