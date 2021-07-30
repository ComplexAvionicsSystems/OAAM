/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Mode Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A matrix row for failure mode entries.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow#getInportEntries <em>Inport Entries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow#getOutportEntries <em>Outport Entries</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeMatrixRow()
 * @model
 * @generated
 */
public interface FailureModeMatrixRow extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Inport Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The failure mode entries in the row for the matrix inports. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inport Entries</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeMatrixRow_InportEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureModeInportEntry> getInportEntries();

	/**
	 * Returns the value of the '<em><b>Outport Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The failure mode entries in the row for the matrix outports. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outport Entries</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getFailureModeMatrixRow_OutportEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureModeOutportEntry> getOutportEntries();

} // FailureModeMatrixRow
