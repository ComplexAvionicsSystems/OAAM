/**
 */
package de.oaam.model.oaam.safety.impl;

import de.oaam.model.oaam.safety.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class SafetyFactoryImpl extends EFactoryImpl implements SafetyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SafetyFactory init() {
		try {
			SafetyFactory theSafetyFactory = (SafetyFactory)EPackage.Registry.INSTANCE.getEFactory(SafetyPackage.eNS_URI);
			if (theSafetyFactory != null) {
				return theSafetyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SafetyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyFactoryImpl() {
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
			case SafetyPackage.PART_FAILURE_MODE: return createPartFailureMode();
			case SafetyPackage.FAILURE_EFFECT: return createFailureEffect();
			case SafetyPackage.FAULT_PROPAGATION: return createFaultPropagation();
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE_SET: return createFunctionalFailureModeSet();
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE: return createFunctionalFailureMode();
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT: return createRequirementFailureEffect();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT_TARGETS_E:
				return createRequirementFailureEffectTargetsEFromString(eDataType, initialValue);
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT_TYPES_E:
				return createRequirementFailureEffectTypesEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT_TARGETS_E:
				return convertRequirementFailureEffectTargetsEToString(eDataType, instanceValue);
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT_TYPES_E:
				return convertRequirementFailureEffectTypesEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartFailureMode createPartFailureMode() {
		PartFailureModeImpl partFailureMode = new PartFailureModeImpl();
		return partFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureEffect createFailureEffect() {
		FailureEffectImpl failureEffect = new FailureEffectImpl();
		return failureEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultPropagation createFaultPropagation() {
		FaultPropagationImpl faultPropagation = new FaultPropagationImpl();
		return faultPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureModeSet createFunctionalFailureModeSet() {
		FunctionalFailureModeSetImpl functionalFailureModeSet = new FunctionalFailureModeSetImpl();
		return functionalFailureModeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode createFunctionalFailureMode() {
		FunctionalFailureModeImpl functionalFailureMode = new FunctionalFailureModeImpl();
		return functionalFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFailureEffect createRequirementFailureEffect() {
		RequirementFailureEffectImpl requirementFailureEffect = new RequirementFailureEffectImpl();
		return requirementFailureEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFailureEffectTargetsE createRequirementFailureEffectTargetsEFromString(EDataType eDataType, String initialValue) {
		RequirementFailureEffectTargetsE result = RequirementFailureEffectTargetsE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequirementFailureEffectTargetsEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFailureEffectTypesE createRequirementFailureEffectTypesEFromString(EDataType eDataType, String initialValue) {
		RequirementFailureEffectTypesE result = RequirementFailureEffectTypesE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequirementFailureEffectTypesEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyPackage getSafetyPackage() {
		return (SafetyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SafetyPackage getPackage() {
		return SafetyPackage.eINSTANCE;
	}

} //SafetyFactoryImpl
