/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integrity State Boolean Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conversion between integrity states and boolen values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#getInputIntegrityState <em>Input Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#isOutputBooleanValue <em>Output Boolean Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getIntegrityStateBooleanConversion()
 * @model
 * @generated
 */
public interface IntegrityStateBooleanConversion extends OaamBaseElementA, BooleanPropagatorA, ConversionA {
	/**
	 * Returns the value of the '<em><b>Input Integrity State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming integrity state for the conversion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setInputIntegrityState(IntegrityStateE)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getIntegrityStateBooleanConversion_InputIntegrityState()
	 * @model
	 * @generated
	 */
	IntegrityStateE getInputIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#getInputIntegrityState <em>Input Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getInputIntegrityState()
	 * @generated
	 */
	void setInputIntegrityState(IntegrityStateE value);

	/**
	 * Returns the value of the '<em><b>Output Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outgoing boolean value. The output is negated if the propagated integrity state does not match the selected input integrity state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Boolean Value</em>' attribute.
	 * @see #setOutputBooleanValue(boolean)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getIntegrityStateBooleanConversion_OutputBooleanValue()
	 * @model
	 * @generated
	 */
	boolean isOutputBooleanValue();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#isOutputBooleanValue <em>Output Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Boolean Value</em>' attribute.
	 * @see #isOutputBooleanValue()
	 * @generated
	 */
	void setOutputBooleanValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Integrity State Propagator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(IntegrityStatePropagatorA)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getIntegrityStateBooleanConversion_Input()
	 * @model
	 * @generated
	 */
	IntegrityStatePropagatorA getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(IntegrityStatePropagatorA value);

} // IntegrityStateBooleanConversion
