/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Failure Mode Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conversion between Boolean values and Failure Modes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#isInputBooleanValue <em>Input Boolean Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#getOutputFailureMode <em>Output Failure Mode</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanFailureModeConversion()
 * @model
 * @generated
 */
public interface BooleanFailureModeConversion extends OaamBaseElementA, FailureModePropagatorA, ConversionA {
	/**
	 * Returns the value of the '<em><b>Input Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming Boolean value for the conversion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Boolean Value</em>' attribute.
	 * @see #setInputBooleanValue(boolean)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanFailureModeConversion_InputBooleanValue()
	 * @model
	 * @generated
	 */
	boolean isInputBooleanValue();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#isInputBooleanValue <em>Input Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Boolean Value</em>' attribute.
	 * @see #isInputBooleanValue()
	 * @generated
	 */
	void setInputBooleanValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Boolean propagator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(BooleanPropagatorA)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanFailureModeConversion_Input()
	 * @model
	 * @generated
	 */
	BooleanPropagatorA getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(BooleanPropagatorA value);

	/**
	 * Returns the value of the '<em><b>Output Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outgoing failure mode.  The propagation is stopped if the propagated boolean value is not equal to the selected input boolean value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Failure Mode</em>' reference.
	 * @see #setOutputFailureMode(FunctionalFailureMode)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanFailureModeConversion_OutputFailureMode()
	 * @model
	 * @generated
	 */
	FunctionalFailureMode getOutputFailureMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#getOutputFailureMode <em>Output Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Failure Mode</em>' reference.
	 * @see #getOutputFailureMode()
	 * @generated
	 */
	void setOutputFailureMode(FunctionalFailureMode value);

} // BooleanFailureModeConversion
