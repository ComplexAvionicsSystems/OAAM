/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Mode Outport Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A row entry specifying an outgoing failure mode on a specific outport.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry#getOutport <em>Outport</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry#getFailureMode <em>Failure Mode</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeOutportEntry()
 * @model
 * @generated
 */
public interface FailureModeOutportEntry extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Outport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outport which this entry refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outport</em>' reference.
	 * @see #setOutport(FailureModeOutport)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeOutportEntry_Outport()
	 * @model
	 * @generated
	 */
	FailureModeOutport getOutport();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry#getOutport <em>Outport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outport</em>' reference.
	 * @see #getOutport()
	 * @generated
	 */
	void setOutport(FailureModeOutport value);

	/**
	 * Returns the value of the '<em><b>Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The failure mode this entry refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Mode</em>' reference.
	 * @see #setFailureMode(FunctionalFailureMode)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeOutportEntry_FailureMode()
	 * @model
	 * @generated
	 */
	FunctionalFailureMode getFailureMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry#getFailureMode <em>Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Mode</em>' reference.
	 * @see #getFailureMode()
	 * @generated
	 */
	void setFailureMode(FunctionalFailureMode value);

} // FailureModeOutportEntry
