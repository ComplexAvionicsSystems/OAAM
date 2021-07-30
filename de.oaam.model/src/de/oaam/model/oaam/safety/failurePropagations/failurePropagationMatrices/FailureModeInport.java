/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Mode Inport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A matrix inport expecting failure modes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeInport()
 * @model
 * @generated
 */
public interface FailureModeInport extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upstream propagator which must propagate a failure mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(FailureModePropagatorA)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeInport_Input()
	 * @model
	 * @generated
	 */
	FailureModePropagatorA getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(FailureModePropagatorA value);

} // FailureModeInport
