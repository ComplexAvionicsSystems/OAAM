/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Boolean valued matrix for the implementation of truth tables. All inputs/outputs are Boolean values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix#getOutports <em>Outports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix#getInports <em>Inports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanMatrix()
 * @model
 * @generated
 */
public interface BooleanMatrix extends OaamBaseElementA, FailurePropagationMatrixA {
	/**
	 * Returns the value of the '<em><b>Outports</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outports of the matrix.  The outports propagate Boolean values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outports</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanMatrix_Outports()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanOutport> getOutports();

	/**
	 * Returns the value of the '<em><b>Inports</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inports of the matrix. The inports expect Boolean values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inports</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanMatrix_Inports()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanInport> getInports();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rows of the matrix. A row contains row entries that describe the input-output behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanMatrix_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanMatrixRow> getRows();

} // BooleanMatrix
