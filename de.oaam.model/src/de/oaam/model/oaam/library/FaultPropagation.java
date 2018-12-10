/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.BoolNot;
import de.oaam.model.oaam.common.BoolOperation;
import de.oaam.model.oaam.common.IntegretyStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies how the state of the inputs transfers to the outputs. An arbitrary Boolean logic can be created.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.FaultPropagation#getOutputState <em>Output State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.FaultPropagation#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.FaultPropagation#getBooleanOperations <em>Boolean Operations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.FaultPropagation#getBooleanNots <em>Boolean Nots</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.FaultPropagation#getTaskInputStates <em>Task Input States</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getFaultPropagation()
 * @model
 * @generated
 */
public interface FaultPropagation extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Output State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegretyStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the desired output state for that the logic is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @see #setOutputState(IntegretyStateE)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getFaultPropagation_OutputState()
	 * @model required="true"
	 * @generated
	 */
	IntegretyStateE getOutputState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.FaultPropagation#getOutputState <em>Output State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @see #getOutputState()
	 * @generated
	 */
	void setOutputState(IntegretyStateE value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean expression which define the relation to the input. This can be an TaskInputState or a Boolean operation, which relates same TaskInputStates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(BoolA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getFaultPropagation_Condition()
	 * @model required="true"
	 * @generated
	 */
	BoolA getCondition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.FaultPropagation#getCondition <em>Condition</em>}' reference.
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
	 * @see de.oaam.model.oaam.library.LibraryPackage#getFaultPropagation_BooleanOperations()
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
	 * @see de.oaam.model.oaam.library.LibraryPackage#getFaultPropagation_BooleanNots()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoolNot> getBooleanNots();

	/**
	 * Returns the value of the '<em><b>Task Input States</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.TaskInputState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of all relevant input states for this fault propagation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Input States</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getFaultPropagation_TaskInputStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskInputState> getTaskInputStates();

} // FaultPropagation
