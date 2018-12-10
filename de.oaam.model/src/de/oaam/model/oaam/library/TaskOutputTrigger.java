/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.BoolNot;
import de.oaam.model.oaam.common.BoolOperation;
import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Output Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The trigger condition for the output. If the trigger condition is true, the output is calculated. A trigger is either a Boolean combination of available inputs or a fixed rate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.TaskOutputTrigger#getFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskOutputTrigger#isIsFixedRate <em>Is Fixed Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskOutputTrigger#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskOutputTrigger#getBooleanOperations <em>Boolean Operations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskOutputTrigger#getBooleanNots <em>Boolean Nots</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskOutputTrigger#getTaskInputTriggers <em>Task Input Triggers</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger()
 * @model
 * @generated
 */
public interface TaskOutputTrigger extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixed rate, in which the output shall be calculated, given in Hz. This is only the default rate. The rate can be overwritten with the task instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Rate</em>' attribute.
	 * @see #setFixedRate(float)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger_FixedRate()
	 * @model required="true"
	 * @generated
	 */
	float getFixedRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskOutputTrigger#getFixedRate <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Rate</em>' attribute.
	 * @see #getFixedRate()
	 * @generated
	 */
	void setFixedRate(float value);

	/**
	 * Returns the value of the '<em><b>Is Fixed Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true the output is calculated at a fixed rate and the fixedRate attribute must be set. If false, the output is calculated if a certain combinations of inputs is available. In the latter case logics must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Fixed Rate</em>' attribute.
	 * @see #setIsFixedRate(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger_IsFixedRate()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsFixedRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskOutputTrigger#isIsFixedRate <em>Is Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fixed Rate</em>' attribute.
	 * @see #isIsFixedRate()
	 * @generated
	 */
	void setIsFixedRate(boolean value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean expression which defines the relation to the input. This can be an TaskInputTrigger or a Boolean operation, which relates same TaskInputTriggers. If the rate is set to fixed that this contition is ommitted and not necessary to be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(BoolA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger_Condition()
	 * @model
	 * @generated
	 */
	BoolA getCondition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskOutputTrigger#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BoolA value);

	/**
	 * Returns the value of the '<em><b>Boolean Operations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.common.BoolOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean operations, which define the relation to the input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Operations</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger_BooleanOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoolOperation> getBooleanOperations();

	/**
	 * Returns the value of the '<em><b>Boolean Nots</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.common.BoolNot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean NOT operations which define the relation to the input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Nots</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger_BooleanNots()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoolNot> getBooleanNots();

	/**
	 * Returns the value of the '<em><b>Task Input Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.TaskInputTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of all relevant input triggers for this fault propagation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Input Triggers</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger_TaskInputTriggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskInputTrigger> getTaskInputTriggers();

} // TaskOutputTrigger
