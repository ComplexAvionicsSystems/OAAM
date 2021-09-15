/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integrity State Outport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A matrix outport propagating integrity states.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport#getDefaultIntegrityState <em>Default Integrity State</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateOutport()
 * @model
 * @generated
 */
public interface IntegrityStateOutport extends OaamBaseElementA, IntegrityStatePropagatorA {
	/**
	 * Returns the value of the '<em><b>Default Integrity State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default integriy state that is propagated by this outport. The default value defines the integrity state that should used if no specific output was specified by the matrix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setDefaultIntegrityState(IntegrityStateE)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateOutport_DefaultIntegrityState()
	 * @model
	 * @generated
	 */
	IntegrityStateE getDefaultIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport#getDefaultIntegrityState <em>Default Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getDefaultIntegrityState()
	 * @generated
	 */
	void setDefaultIntegrityState(IntegrityStateE value);

} // IntegrityStateOutport
