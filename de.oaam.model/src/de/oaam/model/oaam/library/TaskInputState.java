/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.IntegrityStateE;
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
 *   <li>{@link de.oaam.model.oaam.library.TaskInputState#getIntegrityState <em>Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskInputState#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskInputState()
 * @model
 * @generated
 */
public interface TaskInputState extends BoolA, OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Integrity State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of the input for which the expression is true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setIntegrityState(IntegrityStateE)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskInputState_IntegrityState()
	 * @model required="true"
	 * @generated
	 */
	IntegrityStateE getIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskInputState#getIntegrityState <em>Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getIntegrityState()
	 * @generated
	 */
	void setIntegrityState(IntegrityStateE value);

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
