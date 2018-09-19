/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.library.TaskType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Task Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link to an external task. This task is not part of the function model, but it is just a place holder. It must be linked from another function model.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.ExternalTaskLink#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.ExternalTaskLink#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.ExternalTaskLink#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.ExternalTaskLink#getTask <em>Task</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.ExternalTaskLink#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getExternalTaskLink()
 * @model
 * @generated
 */
public interface ExternalTaskLink extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the type, which defines the expected tasks type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TaskType)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getExternalTaskLink_Type()
	 * @model required="true"
	 * @generated
	 */
	TaskType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getType <em>Type</em>}' reference.
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
	 * A ghost representation of the inputs of the external task. This is linked to the input declarations from the task type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getExternalTaskLink_Inputs()
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
	 * A ghost representation of the outputs of the external task. This is linked to the output declarations from the task type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getExternalTaskLink_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenece to the external task if the relation is fixed at some time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getExternalTaskLink_Task()
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts the number of possible target functions by filter expressions related to model properties.
	 * Supports Boolean expression as: &&, ||, !
	 * Strings can be regular expressions.
	 * For instance:
	 * id == "valve_left33"// this would be an absolute link
	 * name == "valve_left"
	 * area == "cabin"
	 * location != "left_*"
	 * name == "outflow_valve_*"
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getExternalTaskLink_Filter()
	 * @model
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

} // ExternalTaskLink
