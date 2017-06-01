/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.functions.TaskGroup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Group Restriction A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for task group restrictions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.TaskGroupRestrictionA#getTaskGroups <em>Task Groups</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskGroupRestrictionA()
 * @model abstract="true"
 * @generated
 */
public interface TaskGroupRestrictionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Groups</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.TaskGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The task groups this constraint applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Groups</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskGroupRestrictionA_TaskGroups()
	 * @model
	 * @generated
	 */
	EList<TaskGroup> getTaskGroups();

} // TaskGroupRestrictionA
