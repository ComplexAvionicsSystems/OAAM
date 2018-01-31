/**
 */
package de.oaam.model.oaam.scenario;

import de.oaam.model.oaam.common.ElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Mode Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the link between temporary objects and time frames. This allows to define a probability of the element of being active during certain time frames.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.scenario.OperationModeReference#getOperationMode <em>Operation Mode</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.OperationModeReference#getActiveProbability <em>Active Probability</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getOperationModeReference()
 * @model
 * @generated
 */
public interface OperationModeReference extends ElementA {
	/**
	 * Returns the value of the '<em><b>Operation Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced time frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Mode</em>' reference.
	 * @see #setOperationMode(OperationMode)
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getOperationModeReference_OperationMode()
	 * @model required="true"
	 * @generated
	 */
	OperationMode getOperationMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.scenario.OperationModeReference#getOperationMode <em>Operation Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Mode</em>' reference.
	 * @see #getOperationMode()
	 * @generated
	 */
	void setOperationMode(OperationMode value);

	/**
	 * Returns the value of the '<em><b>Active Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ranges from 0 to 1. It is the probability that the element is active in the given operation mode. If it is active the full time frame 1 has to be specified, which is also the default value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Probability</em>' attribute.
	 * @see #setActiveProbability(double)
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getOperationModeReference_ActiveProbability()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getActiveProbability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.scenario.OperationModeReference#getActiveProbability <em>Active Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Probability</em>' attribute.
	 * @see #getActiveProbability()
	 * @generated
	 */
	void setActiveProbability(double value);

} // OperationModeReference
