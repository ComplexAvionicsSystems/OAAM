/**
 */
package de.oaam.model.oaam.safety.impl;

import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.allocations.AllocationsPackage;

import de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl;

import de.oaam.model.oaam.anatomy.AnatomyPackage;

import de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl;

import de.oaam.model.oaam.capabilities.CapabilitiesPackage;

import de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl;

import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.common.impl.CommonPackageImpl;

import de.oaam.model.oaam.functions.FunctionsPackage;

import de.oaam.model.oaam.functions.impl.FunctionsPackageImpl;

import de.oaam.model.oaam.hardware.HardwarePackage;

import de.oaam.model.oaam.hardware.impl.HardwarePackageImpl;

import de.oaam.model.oaam.impl.OaamPackageImpl;

import de.oaam.model.oaam.library.LibraryPackage;

import de.oaam.model.oaam.library.impl.LibraryPackageImpl;

import de.oaam.model.oaam.physical.PhysicalPackage;

import de.oaam.model.oaam.physical.impl.PhysicalPackageImpl;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl;

import de.oaam.model.oaam.safety.FailureEffect;
import de.oaam.model.oaam.safety.FailureProviderA;
import de.oaam.model.oaam.safety.FaultPropagation;
import de.oaam.model.oaam.safety.FunctionalFailureMode;
import de.oaam.model.oaam.safety.FunctionalFailureModeSet;
import de.oaam.model.oaam.safety.PartFailureMode;
import de.oaam.model.oaam.safety.RequirementFailureEffect;
import de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE;
import de.oaam.model.oaam.safety.RequirementFailureEffectTypesE;
import de.oaam.model.oaam.safety.SafetyFactory;
import de.oaam.model.oaam.safety.SafetyPackage;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl;

import de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl;

import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage;

import de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl;

import de.oaam.model.oaam.scenario.ScenarioPackage;

import de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl;

import de.oaam.model.oaam.systems.SystemsPackage;

import de.oaam.model.oaam.systems.impl.SystemsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyPackageImpl extends EPackageImpl implements SafetyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partFailureModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureProviderAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalFailureModeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalFailureModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementFailureEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requirementFailureEffectTargetsEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requirementFailureEffectTypesEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.oaam.model.oaam.safety.SafetyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SafetyPackageImpl() {
		super(eNS_URI, SafetyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SafetyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SafetyPackage init() {
		if (isInited) return (SafetyPackage)EPackage.Registry.INSTANCE.getEPackage(SafetyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSafetyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SafetyPackageImpl theSafetyPackage = registeredSafetyPackage instanceof SafetyPackageImpl ? (SafetyPackageImpl)registeredSafetyPackage : new SafetyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI);
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(registeredPackage instanceof OaamPackageImpl ? registeredPackage : OaamPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : CommonPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(registeredPackage instanceof LibraryPackageImpl ? registeredPackage : LibraryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(registeredPackage instanceof ScenarioPackageImpl ? registeredPackage : ScenarioPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI);
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(registeredPackage instanceof SystemsPackageImpl ? registeredPackage : SystemsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(registeredPackage instanceof FunctionsPackageImpl ? registeredPackage : FunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(registeredPackage instanceof HardwarePackageImpl ? registeredPackage : HardwarePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI);
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(registeredPackage instanceof AnatomyPackageImpl ? registeredPackage : AnatomyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI);
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(registeredPackage instanceof CapabilitiesPackageImpl ? registeredPackage : CapabilitiesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(registeredPackage instanceof RestrictionsPackageImpl ? registeredPackage : RestrictionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(registeredPackage instanceof AllocationsPackageImpl ? registeredPackage : AllocationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TaskInternalRequirementsPackage.eNS_URI);
		TaskInternalRequirementsPackageImpl theTaskInternalRequirementsPackage = (TaskInternalRequirementsPackageImpl)(registeredPackage instanceof TaskInternalRequirementsPackageImpl ? registeredPackage : TaskInternalRequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailurePropagationsPackage.eNS_URI);
		FailurePropagationsPackageImpl theFailurePropagationsPackage = (FailurePropagationsPackageImpl)(registeredPackage instanceof FailurePropagationsPackageImpl ? registeredPackage : FailurePropagationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailurePropagationMatricesPackage.eNS_URI);
		FailurePropagationMatricesPackageImpl theFailurePropagationMatricesPackage = (FailurePropagationMatricesPackageImpl)(registeredPackage instanceof FailurePropagationMatricesPackageImpl ? registeredPackage : FailurePropagationMatricesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PhysicalPackage.eNS_URI);
		PhysicalPackageImpl thePhysicalPackage = (PhysicalPackageImpl)(registeredPackage instanceof PhysicalPackageImpl ? registeredPackage : PhysicalPackage.eINSTANCE);

		// Create package meta-data objects
		theSafetyPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theSystemsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theAnatomyPackage.createPackageContents();
		theCapabilitiesPackage.createPackageContents();
		theRestrictionsPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theTaskInternalRequirementsPackage.createPackageContents();
		theFailurePropagationsPackage.createPackageContents();
		theFailurePropagationMatricesPackage.createPackageContents();
		thePhysicalPackage.createPackageContents();

		// Initialize created meta-data
		theSafetyPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theSystemsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theAnatomyPackage.initializePackageContents();
		theCapabilitiesPackage.initializePackageContents();
		theRestrictionsPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theTaskInternalRequirementsPackage.initializePackageContents();
		theFailurePropagationsPackage.initializePackageContents();
		theFailurePropagationMatricesPackage.initializePackageContents();
		thePhysicalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSafetyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SafetyPackage.eNS_URI, theSafetyPackage);
		return theSafetyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartFailureMode() {
		return partFailureModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartFailureMode_FailureModeRatio() {
		return (EAttribute)partFailureModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartFailureMode_FailureEffects() {
		return (EReference)partFailureModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureEffect() {
		return failureEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureEffect_PropagationFailureMode() {
		return (EReference)failureEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureEffect_PropagationIntegrityState() {
		return (EAttribute)failureEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureEffect_FailureEffectProbability() {
		return (EAttribute)failureEffectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureEffect_Propagates() {
		return (EAttribute)failureEffectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultPropagation() {
		return faultPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultPropagation_OutputState() {
		return (EAttribute)faultPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultPropagation_Condition() {
		return (EReference)faultPropagationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultPropagation_BooleanOperations() {
		return (EReference)faultPropagationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultPropagation_BooleanNots() {
		return (EReference)faultPropagationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultPropagation_TaskInputStates() {
		return (EReference)faultPropagationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureProviderA() {
		return failureProviderAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureProviderA_CanFail() {
		return (EAttribute)failureProviderAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureProviderA_FailureRate() {
		return (EAttribute)failureProviderAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureProviderA_PartFailureModes() {
		return (EReference)failureProviderAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalFailureModeSet() {
		return functionalFailureModeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalFailureModeSet_FailureModes() {
		return (EReference)functionalFailureModeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalFailureMode() {
		return functionalFailureModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalFailureMode_RequirementFailureEffects() {
		return (EReference)functionalFailureModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalFailureMode_IntegrityState() {
		return (EAttribute)functionalFailureModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalFailureMode_ShortNotation() {
		return (EAttribute)functionalFailureModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementFailureEffect() {
		return requirementFailureEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementFailureEffect_Effect() {
		return (EAttribute)requirementFailureEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementFailureEffect_Target() {
		return (EAttribute)requirementFailureEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequirementFailureEffectTargetsE() {
		return requirementFailureEffectTargetsEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequirementFailureEffectTypesE() {
		return requirementFailureEffectTypesEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyFactory getSafetyFactory() {
		return (SafetyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		partFailureModeEClass = createEClass(PART_FAILURE_MODE);
		createEAttribute(partFailureModeEClass, PART_FAILURE_MODE__FAILURE_MODE_RATIO);
		createEReference(partFailureModeEClass, PART_FAILURE_MODE__FAILURE_EFFECTS);

		failureEffectEClass = createEClass(FAILURE_EFFECT);
		createEReference(failureEffectEClass, FAILURE_EFFECT__PROPAGATION_FAILURE_MODE);
		createEAttribute(failureEffectEClass, FAILURE_EFFECT__PROPAGATION_INTEGRITY_STATE);
		createEAttribute(failureEffectEClass, FAILURE_EFFECT__FAILURE_EFFECT_PROBABILITY);
		createEAttribute(failureEffectEClass, FAILURE_EFFECT__PROPAGATES);

		faultPropagationEClass = createEClass(FAULT_PROPAGATION);
		createEAttribute(faultPropagationEClass, FAULT_PROPAGATION__OUTPUT_STATE);
		createEReference(faultPropagationEClass, FAULT_PROPAGATION__CONDITION);
		createEReference(faultPropagationEClass, FAULT_PROPAGATION__BOOLEAN_OPERATIONS);
		createEReference(faultPropagationEClass, FAULT_PROPAGATION__BOOLEAN_NOTS);
		createEReference(faultPropagationEClass, FAULT_PROPAGATION__TASK_INPUT_STATES);

		failureProviderAEClass = createEClass(FAILURE_PROVIDER_A);
		createEAttribute(failureProviderAEClass, FAILURE_PROVIDER_A__CAN_FAIL);
		createEAttribute(failureProviderAEClass, FAILURE_PROVIDER_A__FAILURE_RATE);
		createEReference(failureProviderAEClass, FAILURE_PROVIDER_A__PART_FAILURE_MODES);

		functionalFailureModeSetEClass = createEClass(FUNCTIONAL_FAILURE_MODE_SET);
		createEReference(functionalFailureModeSetEClass, FUNCTIONAL_FAILURE_MODE_SET__FAILURE_MODES);

		functionalFailureModeEClass = createEClass(FUNCTIONAL_FAILURE_MODE);
		createEReference(functionalFailureModeEClass, FUNCTIONAL_FAILURE_MODE__REQUIREMENT_FAILURE_EFFECTS);
		createEAttribute(functionalFailureModeEClass, FUNCTIONAL_FAILURE_MODE__INTEGRITY_STATE);
		createEAttribute(functionalFailureModeEClass, FUNCTIONAL_FAILURE_MODE__SHORT_NOTATION);

		requirementFailureEffectEClass = createEClass(REQUIREMENT_FAILURE_EFFECT);
		createEAttribute(requirementFailureEffectEClass, REQUIREMENT_FAILURE_EFFECT__EFFECT);
		createEAttribute(requirementFailureEffectEClass, REQUIREMENT_FAILURE_EFFECT__TARGET);

		// Create enums
		requirementFailureEffectTargetsEEEnum = createEEnum(REQUIREMENT_FAILURE_EFFECT_TARGETS_E);
		requirementFailureEffectTypesEEEnum = createEEnum(REQUIREMENT_FAILURE_EFFECT_TYPES_E);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TaskInternalRequirementsPackage theTaskInternalRequirementsPackage = (TaskInternalRequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(TaskInternalRequirementsPackage.eNS_URI);
		FailurePropagationsPackage theFailurePropagationsPackage = (FailurePropagationsPackage)EPackage.Registry.INSTANCE.getEPackage(FailurePropagationsPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		LibraryPackage theLibraryPackage = (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTaskInternalRequirementsPackage);
		getESubpackages().add(theFailurePropagationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		partFailureModeEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		failureEffectEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		faultPropagationEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		functionalFailureModeSetEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		functionalFailureModeEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		requirementFailureEffectEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(partFailureModeEClass, PartFailureMode.class, "PartFailureMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartFailureMode_FailureModeRatio(), ecorePackage.getEDouble(), "failureModeRatio", null, 0, 1, PartFailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartFailureMode_FailureEffects(), this.getFailureEffect(), null, "failureEffects", null, 0, -1, PartFailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureEffectEClass, FailureEffect.class, "FailureEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureEffect_PropagationFailureMode(), this.getFunctionalFailureMode(), null, "propagationFailureMode", null, 0, 1, FailureEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureEffect_PropagationIntegrityState(), theCommonPackage.getIntegrityStateE(), "propagationIntegrityState", null, 0, 1, FailureEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureEffect_FailureEffectProbability(), ecorePackage.getEDouble(), "failureEffectProbability", null, 0, 1, FailureEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureEffect_Propagates(), theFailurePropagationsPackage.getFailurePropagationGenericTypeE(), "propagates", "INTEGRITY_STATE", 0, 1, FailureEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultPropagationEClass, FaultPropagation.class, "FaultPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaultPropagation_OutputState(), theCommonPackage.getIntegrityStateE(), "outputState", null, 1, 1, FaultPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultPropagation_Condition(), theCommonPackage.getBoolA(), null, "condition", null, 1, 1, FaultPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultPropagation_BooleanOperations(), theCommonPackage.getBoolOperation(), null, "booleanOperations", null, 0, -1, FaultPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultPropagation_BooleanNots(), theCommonPackage.getBoolNot(), null, "booleanNots", null, 0, -1, FaultPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultPropagation_TaskInputStates(), theLibraryPackage.getTaskInputState(), null, "taskInputStates", null, 0, -1, FaultPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureProviderAEClass, FailureProviderA.class, "FailureProviderA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailureProviderA_CanFail(), ecorePackage.getEBoolean(), "canFail", "true", 1, 1, FailureProviderA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureProviderA_FailureRate(), ecorePackage.getEDouble(), "failureRate", null, 1, 1, FailureProviderA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureProviderA_PartFailureModes(), this.getPartFailureMode(), null, "partFailureModes", null, 0, -1, FailureProviderA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalFailureModeSetEClass, FunctionalFailureModeSet.class, "FunctionalFailureModeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalFailureModeSet_FailureModes(), this.getFunctionalFailureMode(), null, "failureModes", null, 0, -1, FunctionalFailureModeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalFailureModeEClass, FunctionalFailureMode.class, "FunctionalFailureMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalFailureMode_RequirementFailureEffects(), this.getRequirementFailureEffect(), null, "requirementFailureEffects", null, 0, -1, FunctionalFailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalFailureMode_IntegrityState(), theCommonPackage.getIntegrityStateE(), "integrityState", null, 1, 1, FunctionalFailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalFailureMode_ShortNotation(), ecorePackage.getEString(), "shortNotation", null, 0, 1, FunctionalFailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementFailureEffectEClass, RequirementFailureEffect.class, "RequirementFailureEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementFailureEffect_Effect(), this.getRequirementFailureEffectTypesE(), "effect", null, 0, 1, RequirementFailureEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementFailureEffect_Target(), this.getRequirementFailureEffectTargetsE(), "target", null, 0, 1, RequirementFailureEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.class, "RequirementFailureEffectTargetsE");
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.NO_TARGET);
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.BELOW);
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.ABOVE);
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.SIGNAL);
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.VALUE);
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.AND);
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.OR);
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.NOT);
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.CONTRACT);
		addEEnumLiteral(requirementFailureEffectTargetsEEEnum, RequirementFailureEffectTargetsE.AGREEMENT);

		initEEnum(requirementFailureEffectTypesEEEnum, RequirementFailureEffectTypesE.class, "RequirementFailureEffectTypesE");
		addEEnumLiteral(requirementFailureEffectTypesEEEnum, RequirementFailureEffectTypesE.EARLY);
		addEEnumLiteral(requirementFailureEffectTypesEEEnum, RequirementFailureEffectTypesE.LATE);
		addEEnumLiteral(requirementFailureEffectTypesEEEnum, RequirementFailureEffectTypesE.ALWAYS);
		addEEnumLiteral(requirementFailureEffectTypesEEEnum, RequirementFailureEffectTypesE.NEVER);
	}

} //SafetyPackageImpl
