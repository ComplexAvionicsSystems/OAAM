/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.functions.Task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Restriction A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for task restrictions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.TaskRestrictionA#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskRestrictionA()
 * @model abstract="true"
 * @generated
 */
public interface TaskRestrictionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The task this constraint applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskRestrictionA_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

} // TaskRestrictionA
