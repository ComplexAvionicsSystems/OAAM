/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integrity State Inport Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A row entry specifying an incoming integrity state on a specific inport.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry#getIntegrityState <em>Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry#getInport <em>Inport</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateInportEntry()
 * @model
 * @generated
 */
public interface IntegrityStateInportEntry extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Integrity State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The integrity state this entry refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setIntegrityState(IntegrityStateE)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateInportEntry_IntegrityState()
	 * @model
	 * @generated
	 */
	IntegrityStateE getIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry#getIntegrityState <em>Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getIntegrityState()
	 * @generated
	 */
	void setIntegrityState(IntegrityStateE value);

	/**
	 * Returns the value of the '<em><b>Inport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inport which this entry refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inport</em>' reference.
	 * @see #setInport(IntegrityStateInport)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateInportEntry_Inport()
	 * @model
	 * @generated
	 */
	IntegrityStateInport getInport();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry#getInport <em>Inport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inport</em>' reference.
	 * @see #getInport()
	 * @generated
	 */
	void setInport(IntegrityStateInport value);

} // IntegrityStateInportEntry
