/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Integrity State Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conversion between boolen values and integrity states.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#isInputBooleanValue <em>Input Boolean Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#getOutputIntegrityState <em>Output Integrity State</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanIntegrityStateConversion()
 * @model
 * @generated
 */
public interface BooleanIntegrityStateConversion extends OaamBaseElementA, IntegrityStatePropagatorA, ConversionA {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Boolean propagator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(BooleanPropagatorA)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanIntegrityStateConversion_Input()
	 * @model
	 * @generated
	 */
	BooleanPropagatorA getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(BooleanPropagatorA value);

	/**
	 * Returns the value of the '<em><b>Input Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming Boolean value for the conversion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Boolean Value</em>' attribute.
	 * @see #setInputBooleanValue(boolean)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanIntegrityStateConversion_InputBooleanValue()
	 * @model
	 * @generated
	 */
	boolean isInputBooleanValue();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#isInputBooleanValue <em>Input Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Boolean Value</em>' attribute.
	 * @see #isInputBooleanValue()
	 * @generated
	 */
	void setInputBooleanValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Output Integrity State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outgoing integrity state.  The propagation is stopped if the propagated Boolean value is not equal to the selected input Boolean value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setOutputIntegrityState(IntegrityStateE)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanIntegrityStateConversion_OutputIntegrityState()
	 * @model
	 * @generated
	 */
	IntegrityStateE getOutputIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#getOutputIntegrityState <em>Output Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getOutputIntegrityState()
	 * @generated
	 */
	void setOutputIntegrityState(IntegrityStateE value);

} // BooleanIntegrityStateConversion
