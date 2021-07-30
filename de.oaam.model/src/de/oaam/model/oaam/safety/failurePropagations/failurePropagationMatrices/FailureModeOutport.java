/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Mode Outport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A matrix outport propagating failure modes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport#getDefaultFailureMode <em>Default Failure Mode</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeOutport()
 * @model
 * @generated
 */
public interface FailureModeOutport extends OaamBaseElementA, FailureModePropagatorA {
	/**
	 * Returns the value of the '<em><b>Default Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default failure mode that is propagated by this outport. The default value defines the failure mode that should used if no specific output was specified by the matrix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Failure Mode</em>' reference.
	 * @see #setDefaultFailureMode(FunctionalFailureMode)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeOutport_DefaultFailureMode()
	 * @model
	 * @generated
	 */
	FunctionalFailureMode getDefaultFailureMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport#getDefaultFailureMode <em>Default Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Failure Mode</em>' reference.
	 * @see #getDefaultFailureMode()
	 * @generated
	 */
	void setDefaultFailureMode(FunctionalFailureMode value);

} // FailureModeOutport
