/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.IntegretyStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Input State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between a Boolean expression and the state of the input. This Boolean is considered to be true if the input has the state defined within.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.TaskInputState#getState <em>State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskInputState#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskInputState()
 * @model
 * @generated
 */
public interface TaskInputState extends BoolA, OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegretyStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of the input for which the expression is true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @see #setState(IntegretyStateE)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskInputState_State()
	 * @model required="true"
	 * @generated
	 */
	IntegretyStateE getState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskInputState#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @see #getState()
	 * @generated
	 */
	void setState(IntegretyStateE value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the input of the task type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(InputDeclaration)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskInputState_Input()
	 * @model required="true"
	 * @generated
	 */
	InputDeclaration getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskInputState#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputDeclaration value);

} // TaskInputState
