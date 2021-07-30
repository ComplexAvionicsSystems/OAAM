/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.InputDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagation Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A source for incoming failure modes and integrity states due to running the task on a hardware device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSource#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationSource()
 * @model
 * @generated
 */
public interface PropagationSource extends OaamBaseElementA, PropagatorA, IntegrityStatePropagatorA, FailureModePropagatorA {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the input declaration of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(InputDeclaration)
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getPropagationSource_Source()
	 * @model
	 * @generated
	 */
	InputDeclaration getSource();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSource#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(InputDeclaration value);

} // PropagationSource
