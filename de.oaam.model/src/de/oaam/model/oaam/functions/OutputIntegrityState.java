/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Integrity State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relates the Boolean expression of the failure event to the system's input states.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.OutputIntegrityState#getIntegrityState <em>Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.OutputIntegrityState#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getOutputIntegrityState()
 * @model
 * @generated
 */
public interface OutputIntegrityState extends BoolA, OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Integrity State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition is fulfilled if the input is in this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setIntegrityState(IntegrityStateE)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getOutputIntegrityState_IntegrityState()
	 * @model required="true"
	 * @generated
	 */
	IntegrityStateE getIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.OutputIntegrityState#getIntegrityState <em>Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getIntegrityState()
	 * @generated
	 */
	void setIntegrityState(IntegrityStateE value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The task output related to this failure condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getOutputIntegrityState_Output()
	 * @model required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.OutputIntegrityState#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

} // OutputIntegrityState
