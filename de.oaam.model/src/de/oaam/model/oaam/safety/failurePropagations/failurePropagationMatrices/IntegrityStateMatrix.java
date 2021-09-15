/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integrity State Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A propagation matrix containing only integrity states as inputs/outputs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix#getOutports <em>Outports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix#getInports <em>Inports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateMatrix()
 * @model
 * @generated
 */
public interface IntegrityStateMatrix extends OaamBaseElementA, FailurePropagationMatrixA {
	/**
	 * Returns the value of the '<em><b>Outports</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outports of the matrix. The outports propagate integrity states.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outports</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateMatrix_Outports()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegrityStateOutport> getOutports();

	/**
	 * Returns the value of the '<em><b>Inports</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inports of the matrix. The inports expect integrity states.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inports</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateMatrix_Inports()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegrityStateInport> getInports();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rows of the matrix. A row contains row entries that describe the input-output behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getIntegrityStateMatrix_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegrityStateMatrixRow> getRows();

} // IntegrityStateMatrix
