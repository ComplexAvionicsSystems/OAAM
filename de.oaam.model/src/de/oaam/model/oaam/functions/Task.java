/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.library.TaskType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An atomic undividable piece of software that implements some system functionality and must be mapped to hardware. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.Task#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Task#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Task#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Task#getImplements <em>Implements</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Task#getDeviceBinding <em>Device Binding</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Task#getNParallels <em>NParallels</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Task#getFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Task#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the type, which defines the required resources
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TaskType)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTask_Type()
	 * @model required="true"
	 * @generated
	 */
	TaskType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Task#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TaskType value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All inputs of this function
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTask_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All outputs of this function
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTask_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a system from a systems model, which is (partially) implemented by this function 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(de.oaam.model.oaam.systems.System)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTask_Implements()
	 * @model
	 * @generated
	 */
	de.oaam.model.oaam.systems.System getImplements();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Task#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(de.oaam.model.oaam.systems.System value);

	/**
	 * Returns the value of the '<em><b>Device Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This references a unique device if this task is strictly bound to one device, i.e. atomic block of hardware and funtion, e.g a sensor. This is a so called hardware task. If a device is specified. Also the function outputs should be bound to device connectors. Do not specify a device here if this is a freely assignable function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Binding</em>' reference.
	 * @see #setDeviceBinding(Device)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTask_DeviceBinding()
	 * @model
	 * @generated
	 */
	Device getDeviceBinding();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Task#getDeviceBinding <em>Device Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Binding</em>' reference.
	 * @see #getDeviceBinding()
	 * @generated
	 */
	void setDeviceBinding(Device value);

	/**
	 * Returns the value of the '<em><b>NParallels</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of parallel instances of that task that can be created if more inputs arrive while the task is still executed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NParallels</em>' attribute.
	 * @see #setNParallels(int)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTask_NParallels()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNParallels();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Task#getNParallels <em>NParallels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NParallels</em>' attribute.
	 * @see #getNParallels()
	 * @generated
	 */
	void setNParallels(int value);

	/**
	 * Returns the value of the '<em><b>Fixed Rate</b></em>' attribute.
	 * The default value is <code>"-1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The execution rate of a periodic task in Hz. Enter -1 for inheritance. Enter 0 for non-periodic or best effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Rate</em>' attribute.
	 * @see #setFixedRate(double)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTask_FixedRate()
	 * @model default="-1.0" required="true"
	 * @generated
	 */
	double getFixedRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Task#getFixedRate <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Rate</em>' attribute.
	 * @see #getFixedRate()
	 * @generated
	 */
	void setFixedRate(double value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.TaskParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All parameters of a task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getTask_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskParameter> getParameters();

} // Task
