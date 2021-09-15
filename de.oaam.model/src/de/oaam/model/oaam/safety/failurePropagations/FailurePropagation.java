/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A failure propagation container.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagation#getPropagators <em>Propagators</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailurePropagation()
 * @model
 * @generated
 */
public interface FailurePropagation extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Propagators</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.PropagatorA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The propagators contained in the failure propagation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagators</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailurePropagation_Propagators()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropagatorA> getPropagators();

} // FailurePropagation
