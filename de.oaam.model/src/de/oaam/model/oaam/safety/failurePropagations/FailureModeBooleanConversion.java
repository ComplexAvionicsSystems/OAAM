/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Mode Boolean Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conversion between Failure Mode and Boolean values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#isOutputBooleanValue <em>Output Boolean Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#getInputFailureMode <em>Input Failure Mode</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailureModeBooleanConversion()
 * @model
 * @generated
 */
public interface FailureModeBooleanConversion extends OaamBaseElementA, BooleanPropagatorA, ConversionA {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Failure Mode Propagator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(FailureModePropagatorA)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailureModeBooleanConversion_Input()
	 * @model
	 * @generated
	 */
	FailureModePropagatorA getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(FailureModePropagatorA value);

	/**
	 * Returns the value of the '<em><b>Output Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outgoing boolean value. The output is negated if the propagated failure mode does not match the selected input failure mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Boolean Value</em>' attribute.
	 * @see #setOutputBooleanValue(boolean)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailureModeBooleanConversion_OutputBooleanValue()
	 * @model
	 * @generated
	 */
	boolean isOutputBooleanValue();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#isOutputBooleanValue <em>Output Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Boolean Value</em>' attribute.
	 * @see #isOutputBooleanValue()
	 * @generated
	 */
	void setOutputBooleanValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming failure mode for the conversion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Failure Mode</em>' reference.
	 * @see #setInputFailureMode(FunctionalFailureMode)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailureModeBooleanConversion_InputFailureMode()
	 * @model
	 * @generated
	 */
	FunctionalFailureMode getInputFailureMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#getInputFailureMode <em>Input Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Failure Mode</em>' reference.
	 * @see #getInputFailureMode()
	 * @generated
	 */
	void setInputFailureMode(FunctionalFailureMode value);

} // FailureModeBooleanConversion
