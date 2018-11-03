/**
 */
package de.oaam.model.oaam.scenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.scenario.ScenarioPackage
 * @generated
 */
public interface ScenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioFactory eINSTANCE = de.oaam.model.oaam.scenario.impl.ScenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Mode</em>'.
	 * @generated
	 */
	OperationMode createOperationMode();

	/**
	 * Returns a new object of class '<em>Parameter Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Numeric</em>'.
	 * @generated
	 */
	ScenarioParameterNumeric createScenarioParameterNumeric();

	/**
	 * Returns a new object of class '<em>Parameter Bool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Bool</em>'.
	 * @generated
	 */
	ScenarioParameterBool createScenarioParameterBool();

	/**
	 * Returns a new object of class '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant</em>'.
	 * @generated
	 */
	Variant createVariant();

	/**
	 * Returns a new object of class '<em>Operation Mode Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Mode Reference</em>'.
	 * @generated
	 */
	OperationModeReference createOperationModeReference();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Subscenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscenario</em>'.
	 * @generated
	 */
	Subscenario createSubscenario();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScenarioPackage getScenarioPackage();

} //ScenarioFactory
