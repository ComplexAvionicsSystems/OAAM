/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.OutputDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagation Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sink for outgoing failure modes and integrity states to successor tasks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getTarget <em>Target</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getPropagatedIntegrityStates <em>Propagated Integrity States</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getPropagatedFailureModes <em>Propagated Failure Modes</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationOutput()
 * @model
 * @generated
 */
public interface PropagationOutput extends OaamBaseElementA, PropagatorA {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the ouput declaration of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OutputDeclaration)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationOutput_Target()
	 * @model
	 * @generated
	 */
	OutputDeclaration getTarget();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OutputDeclaration value);

	/**
	 * Returns the value of the '<em><b>Propagated Integrity States</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All propagations of integrity states.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagated Integrity States</em>' reference list.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationOutput_PropagatedIntegrityStates()
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
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationOutput_PropagatedFailureModes()
	 * @model
	 * @generated
	 */
	EList<FailureModePropagatorA> getPropagatedFailureModes();

} // PropagationOutput
