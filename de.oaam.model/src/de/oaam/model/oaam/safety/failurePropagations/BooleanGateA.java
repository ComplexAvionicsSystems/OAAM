/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Gate A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract definition of a n-input Boolean gate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.BooleanGateA#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanGateA()
 * @model abstract="true"
 * @generated
 */
public interface BooleanGateA extends BooleanPropagatorA, PropagatorA {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N-inputs of the Boolean gate. The upstream propagators must be Boolean Propagators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getBooleanGateA_Inputs()
	 * @model
	 * @generated
	 */
	EList<BooleanPropagatorA> getInputs();

} // BooleanGateA
