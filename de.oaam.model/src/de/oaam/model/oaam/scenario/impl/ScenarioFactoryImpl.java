/**
 */
package de.oaam.model.oaam.scenario.impl;

import de.oaam.model.oaam.scenario.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioFactoryImpl extends EFactoryImpl implements ScenarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScenarioFactory init() {
		try {
			ScenarioFactory theScenarioFactory = (ScenarioFactory)EPackage.Registry.INSTANCE.getEFactory(ScenarioPackage.eNS_URI);
			if (theScenarioFactory != null) {
				return theScenarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScenarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScenarioPackage.OPERATION_MODE: return createOperationMode();
			case ScenarioPackage.SCENARIO_PARAMETER_NUMERIC: return createScenarioParameterNumeric();
			case ScenarioPackage.SCENARIO_PARAMETER_BOOL: return createScenarioParameterBool();
			case ScenarioPackage.VARIANT: return createVariant();
			case ScenarioPackage.OPERATION_MODE_REFERENCE: return createOperationModeReference();
			case ScenarioPackage.SCENARIO: return createScenario();
			case ScenarioPackage.SUBSCENARIO: return createSubscenario();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationMode createOperationMode() {
		OperationModeImpl operationMode = new OperationModeImpl();
		return operationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioParameterNumeric createScenarioParameterNumeric() {
		ScenarioParameterNumericImpl scenarioParameterNumeric = new ScenarioParameterNumericImpl();
		return scenarioParameterNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioParameterBool createScenarioParameterBool() {
		ScenarioParameterBoolImpl scenarioParameterBool = new ScenarioParameterBoolImpl();
		return scenarioParameterBool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant createVariant() {
		VariantImpl variant = new VariantImpl();
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationModeReference createOperationModeReference() {
		OperationModeReferenceImpl operationModeReference = new OperationModeReferenceImpl();
		return operationModeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscenario createSubscenario() {
		SubscenarioImpl subscenario = new SubscenarioImpl();
		return subscenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioPackage getScenarioPackage() {
		return (ScenarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScenarioPackage getPackage() {
		return ScenarioPackage.eINSTANCE;
	}

} //ScenarioFactoryImpl
