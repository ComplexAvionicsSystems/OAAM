/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Input Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A linking class between inputs and output trigger Boolean expressions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.FunctionInputTrigger#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getFunctionInputTrigger()
 * @model
 * @generated
 */
public interface FunctionInputTrigger extends BoolA, OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input that must be available that this expression becomes true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(InputDeclaration)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getFunctionInputTrigger_Input()
	 * @model required="true"
	 * @generated
	 */
	InputDeclaration getInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.FunctionInputTrigger#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputDeclaration value);

} // FunctionInputTrigger
