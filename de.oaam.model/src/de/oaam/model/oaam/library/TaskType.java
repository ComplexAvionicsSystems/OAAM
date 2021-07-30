/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagation;

import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of function types which can be used in the functions model as instances. Most important a function type defines the required resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getOutputDeclarations <em>Output Declarations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getInputDeclarations <em>Input Declarations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#isIsDeterministic <em>Is Deterministic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getPreferredExecutionRate <em>Preferred Execution Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getStateDeclarations <em>State Declarations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getTaskInternalRequirements <em>Task Internal Requirements</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getFailurePropagation <em>Failure Propagation</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType()
 * @model
 * @generated
 */
public interface TaskType extends ResourceConsumerA, OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Output Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.OutputDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All output declarations of this tasks type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Declarations</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_OutputDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputDeclaration> getOutputDeclarations();

	/**
	 * Returns the value of the '<em><b>Input Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.InputDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All input declarations of this task type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Declarations</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_InputDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputDeclaration> getInputDeclarations();

	/**
	 * Returns the value of the '<em><b>Is Deterministic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this function has a deterministic limit for its execution time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Deterministic</em>' attribute.
	 * @see #setIsDeterministic(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_IsDeterministic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsDeterministic();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskType#isIsDeterministic <em>Is Deterministic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deterministic</em>' attribute.
	 * @see #isIsDeterministic()
	 * @generated
	 */
	void setIsDeterministic(boolean value);

	/**
	 * Returns the value of the '<em><b>Preferred Execution Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The execution rate for which this task was designed in Hz. It might does not work well at other execution rates. 0.0 means no preferred rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Execution Rate</em>' attribute.
	 * @see #setPreferredExecutionRate(float)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_PreferredExecutionRate()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getPreferredExecutionRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskType#getPreferredExecutionRate <em>Preferred Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Execution Rate</em>' attribute.
	 * @see #getPreferredExecutionRate()
	 * @generated
	 */
	void setPreferredExecutionRate(float value);

	/**
	 * Returns the value of the '<em><b>State Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.TaskStateDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All internal state variables of a task type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Declarations</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_StateDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskStateDeclaration> getStateDeclarations();

	/**
	 * Returns the value of the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.TaskParameterDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All parameters of a tasks type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Declarations</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_ParameterDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskParameterDeclaration> getParameterDeclarations();

	/**
	 * Returns the value of the '<em><b>Task Internal Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All internal requirements of this task type.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Internal Requirements</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_TaskInternalRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskInternalRequirement> getTaskInternalRequirements();

	/**
	 * Returns the value of the '<em><b>Failure Propagation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The failure propagation of this task type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Propagation</em>' containment reference.
	 * @see #setFailurePropagation(FailurePropagation)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_FailurePropagation()
	 * @model containment="true"
	 * @generated
	 */
	FailurePropagation getFailurePropagation();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskType#getFailurePropagation <em>Failure Propagation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Propagation</em>' containment reference.
	 * @see #getFailurePropagation()
	 * @generated
	 */
	void setFailurePropagation(FailurePropagation value);

} // TaskType
