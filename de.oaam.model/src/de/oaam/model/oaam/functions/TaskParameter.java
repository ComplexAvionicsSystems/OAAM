/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.TaskParameterDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instance of a task types parameter definition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.TaskParameter#getDefinition <em>Definition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.TaskParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskParameter()
 * @model
 * @generated
 */
public interface TaskParameter extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the parameter definition of the referenced tasks type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(TaskParameterDeclaration)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskParameter_Definition()
	 * @model required="true"
	 * @generated
	 */
	TaskParameterDeclaration getDefinition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.TaskParameter#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(TaskParameterDeclaration value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the parameter as a string, e.g. 3.14 for a double parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskParameter_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.TaskParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TaskParameter
