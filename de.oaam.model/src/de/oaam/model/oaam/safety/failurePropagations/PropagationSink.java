/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagation Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sink for outgoing failure modes and integrity states affecting the task.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSink#getPropagatedIntegrityStates <em>Propagated Integrity States</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSink#getPropagatedFailureModes <em>Propagated Failure Modes</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationSink()
 * @model
 * @generated
 */
public interface PropagationSink extends OaamBaseElementA, PropagatorA {
	/**
	 * Returns the value of the '<em><b>Propagated Integrity States</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All propagations of integrity states.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagated Integrity States</em>' reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationSink_PropagatedIntegrityStates()
	 * @model
	 * @generated
	 */
	EList<IntegrityStatePropagatorA> getPropagatedIntegrityStates();

	/**
	 * Returns the value of the '<em><b>Propagated Failure Modes</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All propagations of failure modes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagated Failure Modes</em>' reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationSink_PropagatedFailureModes()
	 * @model
	 * @generated
	 */
	EList<FailureModePropagatorA> getPropagatedFailureModes();

} // PropagationSink
