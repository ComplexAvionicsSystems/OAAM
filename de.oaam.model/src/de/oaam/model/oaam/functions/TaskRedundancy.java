/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Redundancy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Declares two or more functions to be replace each other
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.TaskRedundancy#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskRedundancy()
 * @model
 * @generated
 */
public interface TaskRedundancy extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of functions being redundant counter parts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskRedundancy_Tasks()
	 * @model lower="2"
	 * @generated
	 */
	EList<Task> getTasks();

} // TaskRedundancy
