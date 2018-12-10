/**
 */
package de.oaam.model.oaam.scenario.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.scenario.ScenarioPackage
 * @generated
 */
public class ScenarioSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScenarioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioSwitch() {
		if (modelPackage == null) {
			modelPackage = ScenarioPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ScenarioPackage.SCENARIO_PARAMETER_A: {
				ScenarioParameterA scenarioParameterA = (ScenarioParameterA)theEObject;
				T result = caseScenarioParameterA(scenarioParameterA);
				if (result == null) result = caseModeDependentElementA(scenarioParameterA);
				if (result == null) result = caseVariantDependentElementA(scenarioParameterA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A: {
				ModeDependentElementA modeDependentElementA = (ModeDependentElementA)theEObject;
				T result = caseModeDependentElementA(modeDependentElementA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A: {
				VariantDependentElementA variantDependentElementA = (VariantDependentElementA)theEObject;
				T result = caseVariantDependentElementA(variantDependentElementA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.SCENARIO_CONTAINER_A: {
				ScenarioContainerA scenarioContainerA = (ScenarioContainerA)theEObject;
				T result = caseScenarioContainerA(scenarioContainerA);
				if (result == null) result = caseOaamBaseElementA(scenarioContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.OPERATION_MODE: {
				OperationMode operationMode = (OperationMode)theEObject;
				T result = caseOperationMode(operationMode);
				if (result == null) result = caseOaamBaseElementA(operationMode);
				if (result == null) result = caseVariantDependentElementA(operationMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.SCENARIO_PARAMETER_NUMERIC: {
				ScenarioParameterNumeric scenarioParameterNumeric = (ScenarioParameterNumeric)theEObject;
				T result = caseScenarioParameterNumeric(scenarioParameterNumeric);
				if (result == null) result = caseScenarioParameterA(scenarioParameterNumeric);
				if (result == null) result = caseOaamBaseElementA(scenarioParameterNumeric);
				if (result == null) result = caseModeDependentElementA(scenarioParameterNumeric);
				if (result == null) result = caseVariantDependentElementA(scenarioParameterNumeric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.SCENARIO_PARAMETER_BOOL: {
				ScenarioParameterBool scenarioParameterBool = (ScenarioParameterBool)theEObject;
				T result = caseScenarioParameterBool(scenarioParameterBool);
				if (result == null) result = caseScenarioParameterA(scenarioParameterBool);
				if (result == null) result = caseOaamBaseElementA(scenarioParameterBool);
				if (result == null) result = caseModeDependentElementA(scenarioParameterBool);
				if (result == null) result = caseVariantDependentElementA(scenarioParameterBool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.VARIANT: {
				Variant variant = (Variant)theEObject;
				T result = caseVariant(variant);
				if (result == null) result = caseOaamBaseElementA(variant);
				if (result == null) result = caseModeDependentElementA(variant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.OPERATION_MODE_REFERENCE: {
				OperationModeReference operationModeReference = (OperationModeReference)theEObject;
				T result = caseOperationModeReference(operationModeReference);
				if (result == null) result = caseOaamBaseElementA(operationModeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = caseScenarioContainerA(scenario);
				if (result == null) result = caseOaamBaseElementA(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioPackage.SUBSCENARIO: {
				Subscenario subscenario = (Subscenario)theEObject;
				T result = caseSubscenario(subscenario);
				if (result == null) result = caseScenarioContainerA(subscenario);
				if (result == null) result = caseOaamBaseElementA(subscenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioParameterA(ScenarioParameterA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDependentElementA(ModeDependentElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantDependentElementA(VariantDependentElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioContainerA(ScenarioContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationMode(OperationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioParameterNumeric(ScenarioParameterNumeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioParameterBool(ScenarioParameterBool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariant(Variant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Mode Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Mode Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationModeReference(OperationModeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscenario(Subscenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOaamBaseElementA(OaamBaseElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ScenarioSwitch
