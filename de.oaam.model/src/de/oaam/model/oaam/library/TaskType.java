/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common._ElementA;

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
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#isIsDeterministic <em>Is Deterministic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getPreferredExecutionRate <em>Preferred Execution Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getInternalStates <em>Internal States</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskType#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType()
 * @model
 * @generated
 */
public interface TaskType extends ResourceConsumerA, _ElementA {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.OutputDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All output declarations of this tasks type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputDeclaration> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.InputDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All input declarations of this task type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputDeclaration> getInputs();

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
	 * Returns the value of the '<em><b>Internal States</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.InternalStateDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All internal state variables of a task type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal States</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_InternalStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalStateDefinition> getInternalStates();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All parameters of a tasks type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskType_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDefinition> getParameters();

} // TaskType
