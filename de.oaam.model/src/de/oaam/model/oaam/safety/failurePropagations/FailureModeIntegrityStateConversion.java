/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Mode Integrity State Conversion</b></em>'.
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
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getOutputIntegrityState <em>Output Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getInputFailureMode <em>Input Failure Mode</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailureModeIntegrityStateConversion()
 * @model
 * @generated
 */
public interface FailureModeIntegrityStateConversion extends OaamBaseElementA, IntegrityStatePropagatorA, ConversionA {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Failure Mode Propagator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(FailureModePropagatorA)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailureModeIntegrityStateConversion_Input()
	 * @model
	 * @generated
	 */
	FailureModePropagatorA getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(FailureModePropagatorA value);

	/**
	 * Returns the value of the '<em><b>Output Integrity State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outgoing integrity state.  The propagation is stopped if the propagated failure mode is not equal to the selected input failure mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setOutputIntegrityState(IntegrityStateE)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailureModeIntegrityStateConversion_OutputIntegrityState()
	 * @model
	 * @generated
	 */
	IntegrityStateE getOutputIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getOutputIntegrityState <em>Output Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getOutputIntegrityState()
	 * @generated
	 */
	void setOutputIntegrityState(IntegrityStateE value);

	/**
	 * Returns the value of the '<em><b>Input Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming failure mode for the conversion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Failure Mode</em>' reference.
	 * @see #setInputFailureMode(FunctionalFailureMode)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailureModeIntegrityStateConversion_InputFailureMode()
	 * @model
	 * @generated
	 */
	FunctionalFailureMode getInputFailureMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getInputFailureMode <em>Input Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Failure Mode</em>' reference.
	 * @see #getInputFailureMode()
	 * @generated
	 */
	void setInputFailureMode(FunctionalFailureMode value);

} // FailureModeIntegrityStateConversion
