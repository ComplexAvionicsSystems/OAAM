/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integrity State Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A matrix row for integrity state entries.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow#getInportEntries <em>Inport Entries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow#getOutportEntries <em>Outport Entries</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateMatrixRow()
 * @model
 * @generated
 */
public interface IntegrityStateMatrixRow extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Inport Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The integrity state entries in the row for the matrix inports. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inport Entries</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateMatrixRow_InportEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegrityStateInportEntry> getInportEntries();

	/**
	 * Returns the value of the '<em><b>Outport Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The integrity state entries in the row for the matrix outports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outport Entries</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateMatrixRow_OutportEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegrityStateOutportEntry> getOutportEntries();

} // IntegrityStateMatrixRow
