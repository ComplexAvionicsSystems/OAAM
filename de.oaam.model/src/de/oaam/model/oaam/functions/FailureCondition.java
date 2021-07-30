/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.BoolNot;
import de.oaam.model.oaam.common.BoolOperation;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A failure condition is a top event that can happen to the system and has effect on the vehicle. It relates the output states of tasks to the occurrence of this failure. The platform shall guarantee that the maximum occurrence rate is not exceeded.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#getMaxOccurrenceProbability <em>Max Occurrence Probability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#isNoSingleFailure <em>No Single Failure</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#getBooleanOperations <em>Boolean Operations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#getBooleanNots <em>Boolean Nots</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#getOutputIntegrityStates <em>Output Integrity States</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#getTaskFailures <em>Task Failures</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition()
 * @model
 * @generated
 */
public interface FailureCondition extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean expression that relates the inputs of the system. If the expression is true the failure condition is active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(BoolA)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition_Condition()
	 * @model required="true"
	 * @generated
	 */
	BoolA getCondition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.FailureCondition#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BoolA value);

	/**
	 * Returns the value of the '<em><b>Max Occurrence Probability</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximal occurrence probability that is allowed for the occurrence of this failure condition. Typically given for one operation hour.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Occurrence Probability</em>' attribute.
	 * @see #setMaxOccurrenceProbability(double)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition_MaxOccurrenceProbability()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getMaxOccurrenceProbability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.FailureCondition#getMaxOccurrenceProbability <em>Max Occurrence Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurrence Probability</em>' attribute.
	 * @see #getMaxOccurrenceProbability()
	 * @generated
	 */
	void setMaxOccurrenceProbability(double value);

	/**
	 * Returns the value of the '<em><b>No Single Failure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * States if this failure condition is allowed to be caused by a single failure event or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Single Failure</em>' attribute.
	 * @see #setNoSingleFailure(boolean)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition_NoSingleFailure()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNoSingleFailure();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.FailureCondition#isNoSingleFailure <em>No Single Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Single Failure</em>' attribute.
	 * @see #isNoSingleFailure()
	 * @generated
	 */
	void setNoSingleFailure(boolean value);

	/**
	 * Returns the value of the '<em><b>Boolean Operations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.common.BoolOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean operations, which define the relation to the failure condition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Operations</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition_BooleanOperations()
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
	 * The Boolean NOT operations which define the relation to the failure condition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Nots</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition_BooleanNots()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoolNot> getBooleanNots();

	/**
	 * Returns the value of the '<em><b>Output Integrity States</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.OutputIntegrityState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of all relevant output states for this failure condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Integrity States</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition_OutputIntegrityStates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputIntegrityState> getOutputIntegrityStates();

	/**
	 * Returns the value of the '<em><b>Task Failures</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.TaskFailure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of all relevant task losses for this failure condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Failures</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition_TaskFailures()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TaskFailure> getTaskFailures();

} // FailureCondition
