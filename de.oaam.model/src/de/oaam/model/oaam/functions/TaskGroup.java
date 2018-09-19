/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grouping of functions for example to prevent their segregation or to assign this functions to certain routes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.TaskGroup#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskGroup()
 * @model
 * @generated
 */
public interface TaskGroup extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All functions in this group
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskGroup_Tasks()
	 * @model required="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // TaskGroup
