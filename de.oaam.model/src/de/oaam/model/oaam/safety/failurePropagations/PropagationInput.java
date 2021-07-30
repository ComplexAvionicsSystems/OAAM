/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.InputDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagation Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A source for incoming failure modes and integrity states from predecessor tasks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.PropagationInput#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationInput()
 * @model
 * @generated
 */
public interface PropagationInput extends OaamBaseElementA, PropagatorA, IntegrityStatePropagatorA, FailureModePropagatorA {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the input declaration of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(InputDeclaration)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationInput_Source()
	 * @model
	 * @generated
	 */
	InputDeclaration getSource();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationInput#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(InputDeclaration value);

} // PropagationInput
