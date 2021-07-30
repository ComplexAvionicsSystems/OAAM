/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the failure of a task to specifiy failure conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.TaskFailure#getTask <em>Task</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.TaskFailure#getTaskState <em>Task State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.TaskFailure#getTaskFailureMode <em>Task Failure Mode</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.TaskFailure#getFailsWith <em>Fails With</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskFailure()
 * @model
 * @generated
 */
public interface TaskFailure extends BoolA, OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The failing task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskFailure_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.TaskFailure#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Task State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The task is considered failed, if a failure with the specified integrity state occurs. You should specify either the task integrity state or the task failure mode, but not both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setTaskState(IntegrityStateE)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskFailure_TaskState()
	 * @model required="true"
	 * @generated
	 */
	IntegrityStateE getTaskState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.TaskFailure#getTaskState <em>Task State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getTaskState()
	 * @generated
	 */
	void setTaskState(IntegrityStateE value);

	/**
	 * Returns the value of the '<em><b>Task Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The task is considered failed, if a failure with the specified failure mode occurs. You should specify either the task integrity state or the task failure mode, but not both. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Failure Mode</em>' reference.
	 * @see #setTaskFailureMode(FunctionalFailureMode)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskFailure_TaskFailureMode()
	 * @model
	 * @generated
	 */
	FunctionalFailureMode getTaskFailureMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.TaskFailure#getTaskFailureMode <em>Task Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Failure Mode</em>' reference.
	 * @see #getTaskFailureMode()
	 * @generated
	 */
	void setTaskFailureMode(FunctionalFailureMode value);

	/**
	 * Returns the value of the '<em><b>Fails With</b></em>' attribute.
	 * The default value is <code>"INTEGRITY_STATE"</code>.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selects which the failiure type should be regarded. Set failsWith to FAILURE_MODE if you want to describe a task failure based on a failure mode. Set failsWith to INTEGRITY_STATE if you want to describe a task failure based on an integrity state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fails With</em>' attribute.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE
	 * @see #setFailsWith(FailurePropagationGenericTypeE)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTaskFailure_FailsWith()
	 * @model default="INTEGRITY_STATE"
	 * @generated
	 */
	FailurePropagationGenericTypeE getFailsWith();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.TaskFailure#getFailsWith <em>Fails With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fails With</em>' attribute.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE
	 * @see #getFailsWith()
	 * @generated
	 */
	void setFailsWith(FailurePropagationGenericTypeE value);

} // TaskFailure
