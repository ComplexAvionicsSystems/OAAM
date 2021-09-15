/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integrity State Failure Mode Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conversion between integrity states and failure modes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getInputIntegrityState <em>Input Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getOutputFailureMode <em>Output Failure Mode</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getIntegrityStateFailureModeConversion()
 * @model
 * @generated
 */
public interface IntegrityStateFailureModeConversion extends OaamBaseElementA, FailureModePropagatorA, ConversionA {
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
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getIntegrityStateFailureModeConversion_InputIntegrityState()
	 * @model
	 * @generated
	 */
	IntegrityStateE getInputIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getInputIntegrityState <em>Input Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getInputIntegrityState()
	 * @generated
	 */
	void setInputIntegrityState(IntegrityStateE value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Integrity State Propagator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(IntegrityStatePropagatorA)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getIntegrityStateFailureModeConversion_Input()
	 * @model
	 * @generated
	 */
	IntegrityStatePropagatorA getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(IntegrityStatePropagatorA value);

	/**
	 * Returns the value of the '<em><b>Output Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outgoing failure mode.  The propagation is stopped if the propagated integrity state is not equal to the selected input integrity state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Failure Mode</em>' reference.
	 * @see #setOutputFailureMode(FunctionalFailureMode)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getIntegrityStateFailureModeConversion_OutputFailureMode()
	 * @model
	 * @generated
	 */
	FunctionalFailureMode getOutputFailureMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getOutputFailureMode <em>Output Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Failure Mode</em>' reference.
	 * @see #getOutputFailureMode()
	 * @generated
	 */
	void setOutputFailureMode(FunctionalFailureMode value);

} // IntegrityStateFailureModeConversion
