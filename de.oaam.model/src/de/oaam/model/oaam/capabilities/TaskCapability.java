/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.TaskType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible mapping of a task to a device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.TaskCapability#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.TaskCapability#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.TaskCapability#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.TaskCapability#getFailureProbability <em>Failure Probability</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getTaskCapability()
 * @model
 * @generated
 */
public interface TaskCapability extends CapabilityA, ElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Task Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function type this capability is valid for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Type</em>' reference.
	 * @see #setTaskType(TaskType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getTaskCapability_TaskType()
	 * @model required="true"
	 * @generated
	 */
	TaskType getTaskType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.TaskCapability#getTaskType <em>Task Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Type</em>' reference.
	 * @see #getTaskType()
	 * @generated
	 */
	void setTaskType(TaskType value);

	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target device type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type</em>' reference.
	 * @see #setDeviceType(DeviceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getTaskCapability_DeviceType()
	 * @model required="true"
	 * @generated
	 */
	DeviceType getDeviceType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.TaskCapability#getDeviceType <em>Device Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' reference.
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Worst Case Execution Time</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worst case execution time of the tasks in s. This time must be independent from the inputs and makes only sense, if the task behaves deterministic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Worst Case Execution Time</em>' attribute.
	 * @see #setWorstCaseExecutionTime(float)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getTaskCapability_WorstCaseExecutionTime()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getWorstCaseExecutionTime();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.TaskCapability#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Case Execution Time</em>' attribute.
	 * @see #getWorstCaseExecutionTime()
	 * @generated
	 */
	void setWorstCaseExecutionTime(float value);

	/**
	 * Returns the value of the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expected failure probability. Commonly this depends on the design assurance level (DAL) used to create this function. I.e. DAL a would be 10E-9
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Probability</em>' attribute.
	 * @see #setFailureProbability(double)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getTaskCapability_FailureProbability()
	 * @model required="true"
	 * @generated
	 */
	double getFailureProbability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.TaskCapability#getFailureProbability <em>Failure Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Probability</em>' attribute.
	 * @see #getFailureProbability()
	 * @generated
	 */
	void setFailureProbability(double value);

} // TaskCapability
