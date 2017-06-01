/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

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
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#getLogic <em>Logic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#getMaxOccurrenceRate <em>Max Occurrence Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FailureCondition#isNoSingleFailure <em>No Single Failure</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition()
 * @model
 * @generated
 */
public interface FailureCondition extends _ElementA, _ModeDependentElementA, _VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean expression that relates the inputs of the system. If the expression is true the failure condition is active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logic</em>' containment reference.
	 * @see #setLogic(BoolA)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition_Logic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolA getLogic();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.FailureCondition#getLogic <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' containment reference.
	 * @see #getLogic()
	 * @generated
	 */
	void setLogic(BoolA value);

	/**
	 * Returns the value of the '<em><b>Max Occurrence Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximal occurrence rate that is allowed for the occurrence of this failure condition. Typically given in [1/operation hour].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Occurrence Rate</em>' attribute.
	 * @see #setMaxOccurrenceRate(double)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFailureCondition_MaxOccurrenceRate()
	 * @model required="true"
	 * @generated
	 */
	double getMaxOccurrenceRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.FailureCondition#getMaxOccurrenceRate <em>Max Occurrence Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurrence Rate</em>' attribute.
	 * @see #getMaxOccurrenceRate()
	 * @generated
	 */
	void setMaxOccurrenceRate(double value);

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

} // FailureCondition
