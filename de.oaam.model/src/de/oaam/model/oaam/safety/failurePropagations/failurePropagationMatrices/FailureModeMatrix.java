/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Mode Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A propagation matrix containing only failure modes as inputs/outputs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix#getRows <em>Rows</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix#getInports <em>Inports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix#getOutports <em>Outports</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeMatrix()
 * @model
 * @generated
 */
public interface FailureModeMatrix extends OaamBaseElementA, FailurePropagationMatrixA {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rows of the matrix. A row contains row entries that describe the input-output behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeMatrix_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureModeMatrixRow> getRows();

	/**
	 * Returns the value of the '<em><b>Inports</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inports of the matrix. The inports expect failure modes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inports</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeMatrix_Inports()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureModeInport> getInports();

	/**
	 * Returns the value of the '<em><b>Outports</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outports of the matrix. The outports propagate failure modes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outports</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeMatrix_Outports()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureModeOutport> getOutports();

} // FailureModeMatrix
