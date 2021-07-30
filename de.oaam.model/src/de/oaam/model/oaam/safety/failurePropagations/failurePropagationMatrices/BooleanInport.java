/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Inport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A matrix inport expecting Boolean values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanInport()
 * @model
 * @generated
 */
public interface BooleanInport extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upstream propagator which must propagate a Boolean value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(BooleanPropagatorA)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanInport_Input()
	 * @model
	 * @generated
	 */
	BooleanPropagatorA getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(BooleanPropagatorA value);

} // BooleanInport
