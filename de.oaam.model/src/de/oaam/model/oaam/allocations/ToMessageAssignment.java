/**
 */
package de.oaam.model.oaam.allocations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Message Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Assigns to a message
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.ToMessageAssignment#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getToMessageAssignment()
 * @model
 * @generated
 */
public interface ToMessageAssignment extends SegmentA {

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References to a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(MessageA)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getToMessageAssignment_Message()
	 * @model
	 * @generated
	 */
	MessageA getMessage();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.ToMessageAssignment#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(MessageA value);
} // ToMessageAssignment
