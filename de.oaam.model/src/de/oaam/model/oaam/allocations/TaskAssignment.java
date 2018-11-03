/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.capabilities.TaskOnDeviceCapability;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.functions.Task;

import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A allocations of a function to a device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.TaskAssignment#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.TaskAssignment#getTask <em>Task</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.TaskAssignment#getDevice <em>Device</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.TaskAssignment#getSchedules <em>Schedules</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getTaskAssignment()
 * @model
 * @generated
 */
public interface TaskAssignment extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capability, which specifies the resource consumption.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(TaskOnDeviceCapability)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getTaskAssignment_Capability()
	 * @model required="true"
	 * @generated
	 */
	TaskOnDeviceCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.TaskAssignment#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(TaskOnDeviceCapability value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getTaskAssignment_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.TaskAssignment#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getTaskAssignment_Device()
	 * @model required="true"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.TaskAssignment#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.Schedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedules for the tasks on this device. Multiple schedules are valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedules</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getTaskAssignment_Schedules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schedule> getSchedules();

} // TaskAssignment
