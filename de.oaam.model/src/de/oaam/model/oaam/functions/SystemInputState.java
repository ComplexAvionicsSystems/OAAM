/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.IntegretyStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Input State</b></em>'.
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
 *   <li>{@link de.oaam.model.oaam.functions.SystemInputState#getState <em>State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.SystemInputState#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSystemInputState()
 * @model
 * @generated
 */
public interface SystemInputState extends BoolA, OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegretyStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition is fulfilled if the input is in this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @see #setState(IntegretyStateE)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSystemInputState_State()
	 * @model required="true"
	 * @generated
	 */
	IntegretyStateE getState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.SystemInputState#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @see #getState()
	 * @generated
	 */
	void setState(IntegretyStateE value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The task output related to this failure condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSystemInputState_Output()
	 * @model required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.SystemInputState#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

} // SystemInputState
