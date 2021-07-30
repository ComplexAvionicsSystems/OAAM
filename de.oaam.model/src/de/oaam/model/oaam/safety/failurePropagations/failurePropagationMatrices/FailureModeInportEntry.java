/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Mode Inport Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A row entry specifying an incoming failure mode on a specific inport.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry#getInport <em>Inport</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry#getFailureMode <em>Failure Mode</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeInportEntry()
 * @model
 * @generated
 */
public interface FailureModeInportEntry extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Inport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inport which this entry refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inport</em>' reference.
	 * @see #setInport(FailureModeInport)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeInportEntry_Inport()
	 * @model
	 * @generated
	 */
	FailureModeInport getInport();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry#getInport <em>Inport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inport</em>' reference.
	 * @see #getInport()
	 * @generated
	 */
	void setInport(FailureModeInport value);

	/**
	 * Returns the value of the '<em><b>Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The failure mode this entry refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Mode</em>' reference.
	 * @see #setFailureMode(FunctionalFailureMode)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeInportEntry_FailureMode()
	 * @model
	 * @generated
	 */
	FunctionalFailureMode getFailureMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry#getFailureMode <em>Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Mode</em>' reference.
	 * @see #getFailureMode()
	 * @generated
	 */
	void setFailureMode(FunctionalFailureMode value);

} // FailureModeInportEntry
