/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A matrix row for Boolean values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow#getInportEntries <em>Inport Entries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow#getOutportEntries <em>Outport Entries</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanMatrixRow()
 * @model
 * @generated
 */
public interface BooleanMatrixRow extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Inport Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean valued entries in the row for the matrix inports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inport Entries</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanMatrixRow_InportEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanInportEntry> getInportEntries();

	/**
	 * Returns the value of the '<em><b>Outport Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean valued entries in the row for the matrix outports. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outport Entries</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanMatrixRow_OutportEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanOutportEntry> getOutportEntries();

} // BooleanMatrixRow
