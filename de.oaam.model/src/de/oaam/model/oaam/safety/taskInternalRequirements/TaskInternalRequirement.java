/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Internal Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An internal requirement of a task. The internal requirement describes conditions that need to be fulfilled for the task success.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement#getComponents <em>Components</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getTaskInternalRequirement()
 * @model
 * @generated
 */
public interface TaskInternalRequirement extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The components inside the requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getTaskInternalRequirement_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementComponentA> getComponents();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The top component of the requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires</em>' reference.
	 * @see #setRequires(RequirementComponentA)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getTaskInternalRequirement_Requires()
	 * @model
	 * @generated
	 */
	RequirementComponentA getRequires();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement#getRequires <em>Requires</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' reference.
	 * @see #getRequires()
	 * @generated
	 */
	void setRequires(RequirementComponentA value);

} // TaskInternalRequirement
