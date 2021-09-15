/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

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

import de.oaam.model.oaam.safety.SafetyPackage;

import de.oaam.model.oaam.safety.failurePropagations.BooleanAnd;
import de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion;
import de.oaam.model.oaam.safety.failurePropagations.BooleanGateA;
import de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion;
import de.oaam.model.oaam.safety.failurePropagations.BooleanNot;
import de.oaam.model.oaam.safety.failurePropagations.BooleanOr;
import de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.BooleanXor;
import de.oaam.model.oaam.safety.failurePropagations.ConversionA;
import de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion;
import de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion;
import de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagation;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsFactory;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.PropagationInput;
import de.oaam.model.oaam.safety.failurePropagations.PropagationOutput;
import de.oaam.model.oaam.safety.failurePropagations.PropagationSink;
import de.oaam.model.oaam.safety.failurePropagations.PropagationSource;
import de.oaam.model.oaam.safety.failurePropagations.PropagatorA;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl;

import de.oaam.model.oaam.safety.impl.SafetyPackageImpl;

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
public class FailurePropagationsPackageImpl extends EPackageImpl implements FailurePropagationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failurePropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModePropagatorAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanPropagatorAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityStatePropagatorAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanGateAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanXorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityStateBooleanConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeBooleanConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanFailureModeConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityStateFailureModeConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeIntegrityStateConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanIntegrityStateConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagationInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagationOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagationSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum failurePropagationGenericTypeEEEnum = null;

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
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FailurePropagationsPackageImpl() {
		super(eNS_URI, FailurePropagationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FailurePropagationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FailurePropagationsPackage init() {
		if (isInited) return (FailurePropagationsPackage)EPackage.Registry.INSTANCE.getEPackage(FailurePropagationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFailurePropagationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FailurePropagationsPackageImpl theFailurePropagationsPackage = registeredFailurePropagationsPackage instanceof FailurePropagationsPackageImpl ? (FailurePropagationsPackageImpl)registeredFailurePropagationsPackage : new FailurePropagationsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SafetyPackage.eNS_URI);
		SafetyPackageImpl theSafetyPackage = (SafetyPackageImpl)(registeredPackage instanceof SafetyPackageImpl ? registeredPackage : SafetyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TaskInternalRequirementsPackage.eNS_URI);
		TaskInternalRequirementsPackageImpl theTaskInternalRequirementsPackage = (TaskInternalRequirementsPackageImpl)(registeredPackage instanceof TaskInternalRequirementsPackageImpl ? registeredPackage : TaskInternalRequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailurePropagationMatricesPackage.eNS_URI);
		FailurePropagationMatricesPackageImpl theFailurePropagationMatricesPackage = (FailurePropagationMatricesPackageImpl)(registeredPackage instanceof FailurePropagationMatricesPackageImpl ? registeredPackage : FailurePropagationMatricesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PhysicalPackage.eNS_URI);
		PhysicalPackageImpl thePhysicalPackage = (PhysicalPackageImpl)(registeredPackage instanceof PhysicalPackageImpl ? registeredPackage : PhysicalPackage.eINSTANCE);

		// Create package meta-data objects
		theFailurePropagationsPackage.createPackageContents();
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
		theSafetyPackage.createPackageContents();
		theTaskInternalRequirementsPackage.createPackageContents();
		theFailurePropagationMatricesPackage.createPackageContents();
		thePhysicalPackage.createPackageContents();

		// Initialize created meta-data
		theFailurePropagationsPackage.initializePackageContents();
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
		theSafetyPackage.initializePackageContents();
		theTaskInternalRequirementsPackage.initializePackageContents();
		theFailurePropagationMatricesPackage.initializePackageContents();
		thePhysicalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFailurePropagationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FailurePropagationsPackage.eNS_URI, theFailurePropagationsPackage);
		return theFailurePropagationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailurePropagation() {
		return failurePropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailurePropagation_Propagators() {
		return (EReference)failurePropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorA() {
		return propagatorAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModePropagatorA() {
		return failureModePropagatorAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanPropagatorA() {
		return booleanPropagatorAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionA() {
		return conversionAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrityStatePropagatorA() {
		return integrityStatePropagatorAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanGateA() {
		return booleanGateAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanGateA_Inputs() {
		return (EReference)booleanGateAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAnd() {
		return booleanAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOr() {
		return booleanOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanXor() {
		return booleanXorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanNot() {
		return booleanNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanNot_Input() {
		return (EReference)booleanNotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrityStateBooleanConversion() {
		return integrityStateBooleanConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrityStateBooleanConversion_InputIntegrityState() {
		return (EAttribute)integrityStateBooleanConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrityStateBooleanConversion_OutputBooleanValue() {
		return (EAttribute)integrityStateBooleanConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateBooleanConversion_Input() {
		return (EReference)integrityStateBooleanConversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModeBooleanConversion() {
		return failureModeBooleanConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeBooleanConversion_Input() {
		return (EReference)failureModeBooleanConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureModeBooleanConversion_OutputBooleanValue() {
		return (EAttribute)failureModeBooleanConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeBooleanConversion_InputFailureMode() {
		return (EReference)failureModeBooleanConversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanFailureModeConversion() {
		return booleanFailureModeConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanFailureModeConversion_InputBooleanValue() {
		return (EAttribute)booleanFailureModeConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanFailureModeConversion_Input() {
		return (EReference)booleanFailureModeConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanFailureModeConversion_OutputFailureMode() {
		return (EReference)booleanFailureModeConversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrityStateFailureModeConversion() {
		return integrityStateFailureModeConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrityStateFailureModeConversion_InputIntegrityState() {
		return (EAttribute)integrityStateFailureModeConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateFailureModeConversion_Input() {
		return (EReference)integrityStateFailureModeConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateFailureModeConversion_OutputFailureMode() {
		return (EReference)integrityStateFailureModeConversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModeIntegrityStateConversion() {
		return failureModeIntegrityStateConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeIntegrityStateConversion_Input() {
		return (EReference)failureModeIntegrityStateConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureModeIntegrityStateConversion_OutputIntegrityState() {
		return (EAttribute)failureModeIntegrityStateConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeIntegrityStateConversion_InputFailureMode() {
		return (EReference)failureModeIntegrityStateConversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanIntegrityStateConversion() {
		return booleanIntegrityStateConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanIntegrityStateConversion_Input() {
		return (EReference)booleanIntegrityStateConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanIntegrityStateConversion_InputBooleanValue() {
		return (EAttribute)booleanIntegrityStateConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanIntegrityStateConversion_OutputIntegrityState() {
		return (EAttribute)booleanIntegrityStateConversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagationInput() {
		return propagationInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationInput_Source() {
		return (EReference)propagationInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagationOutput() {
		return propagationOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationOutput_Target() {
		return (EReference)propagationOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationOutput_PropagatedIntegrityStates() {
		return (EReference)propagationOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationOutput_PropagatedFailureModes() {
		return (EReference)propagationOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagationSource() {
		return propagationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationSource_Source() {
		return (EReference)propagationSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagationSink() {
		return propagationSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationSink_PropagatedIntegrityStates() {
		return (EReference)propagationSinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationSink_PropagatedFailureModes() {
		return (EReference)propagationSinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFailurePropagationGenericTypeE() {
		return failurePropagationGenericTypeEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationsFactory getFailurePropagationsFactory() {
		return (FailurePropagationsFactory)getEFactoryInstance();
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
		failurePropagationEClass = createEClass(FAILURE_PROPAGATION);
		createEReference(failurePropagationEClass, FAILURE_PROPAGATION__PROPAGATORS);

		propagatorAEClass = createEClass(PROPAGATOR_A);

		failureModePropagatorAEClass = createEClass(FAILURE_MODE_PROPAGATOR_A);

		booleanPropagatorAEClass = createEClass(BOOLEAN_PROPAGATOR_A);

		conversionAEClass = createEClass(CONVERSION_A);

		integrityStatePropagatorAEClass = createEClass(INTEGRITY_STATE_PROPAGATOR_A);

		booleanGateAEClass = createEClass(BOOLEAN_GATE_A);
		createEReference(booleanGateAEClass, BOOLEAN_GATE_A__INPUTS);

		booleanAndEClass = createEClass(BOOLEAN_AND);

		booleanOrEClass = createEClass(BOOLEAN_OR);

		booleanXorEClass = createEClass(BOOLEAN_XOR);

		booleanNotEClass = createEClass(BOOLEAN_NOT);
		createEReference(booleanNotEClass, BOOLEAN_NOT__INPUT);

		integrityStateBooleanConversionEClass = createEClass(INTEGRITY_STATE_BOOLEAN_CONVERSION);
		createEAttribute(integrityStateBooleanConversionEClass, INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT_INTEGRITY_STATE);
		createEAttribute(integrityStateBooleanConversionEClass, INTEGRITY_STATE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE);
		createEReference(integrityStateBooleanConversionEClass, INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT);

		failureModeBooleanConversionEClass = createEClass(FAILURE_MODE_BOOLEAN_CONVERSION);
		createEReference(failureModeBooleanConversionEClass, FAILURE_MODE_BOOLEAN_CONVERSION__INPUT);
		createEAttribute(failureModeBooleanConversionEClass, FAILURE_MODE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE);
		createEReference(failureModeBooleanConversionEClass, FAILURE_MODE_BOOLEAN_CONVERSION__INPUT_FAILURE_MODE);

		booleanFailureModeConversionEClass = createEClass(BOOLEAN_FAILURE_MODE_CONVERSION);
		createEAttribute(booleanFailureModeConversionEClass, BOOLEAN_FAILURE_MODE_CONVERSION__INPUT_BOOLEAN_VALUE);
		createEReference(booleanFailureModeConversionEClass, BOOLEAN_FAILURE_MODE_CONVERSION__INPUT);
		createEReference(booleanFailureModeConversionEClass, BOOLEAN_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE);

		integrityStateFailureModeConversionEClass = createEClass(INTEGRITY_STATE_FAILURE_MODE_CONVERSION);
		createEAttribute(integrityStateFailureModeConversionEClass, INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT_INTEGRITY_STATE);
		createEReference(integrityStateFailureModeConversionEClass, INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT);
		createEReference(integrityStateFailureModeConversionEClass, INTEGRITY_STATE_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE);

		failureModeIntegrityStateConversionEClass = createEClass(FAILURE_MODE_INTEGRITY_STATE_CONVERSION);
		createEReference(failureModeIntegrityStateConversionEClass, FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT);
		createEAttribute(failureModeIntegrityStateConversionEClass, FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE);
		createEReference(failureModeIntegrityStateConversionEClass, FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE);

		booleanIntegrityStateConversionEClass = createEClass(BOOLEAN_INTEGRITY_STATE_CONVERSION);
		createEReference(booleanIntegrityStateConversionEClass, BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT);
		createEAttribute(booleanIntegrityStateConversionEClass, BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT_BOOLEAN_VALUE);
		createEAttribute(booleanIntegrityStateConversionEClass, BOOLEAN_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE);

		propagationInputEClass = createEClass(PROPAGATION_INPUT);
		createEReference(propagationInputEClass, PROPAGATION_INPUT__SOURCE);

		propagationOutputEClass = createEClass(PROPAGATION_OUTPUT);
		createEReference(propagationOutputEClass, PROPAGATION_OUTPUT__TARGET);
		createEReference(propagationOutputEClass, PROPAGATION_OUTPUT__PROPAGATED_INTEGRITY_STATES);
		createEReference(propagationOutputEClass, PROPAGATION_OUTPUT__PROPAGATED_FAILURE_MODES);

		propagationSourceEClass = createEClass(PROPAGATION_SOURCE);
		createEReference(propagationSourceEClass, PROPAGATION_SOURCE__SOURCE);

		propagationSinkEClass = createEClass(PROPAGATION_SINK);
		createEReference(propagationSinkEClass, PROPAGATION_SINK__PROPAGATED_INTEGRITY_STATES);
		createEReference(propagationSinkEClass, PROPAGATION_SINK__PROPAGATED_FAILURE_MODES);

		// Create enums
		failurePropagationGenericTypeEEEnum = createEEnum(FAILURE_PROPAGATION_GENERIC_TYPE_E);
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
		FailurePropagationMatricesPackage theFailurePropagationMatricesPackage = (FailurePropagationMatricesPackage)EPackage.Registry.INSTANCE.getEPackage(FailurePropagationMatricesPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		SafetyPackage theSafetyPackage = (SafetyPackage)EPackage.Registry.INSTANCE.getEPackage(SafetyPackage.eNS_URI);
		LibraryPackage theLibraryPackage = (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFailurePropagationMatricesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		failurePropagationEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		conversionAEClass.getESuperTypes().add(this.getPropagatorA());
		booleanGateAEClass.getESuperTypes().add(this.getBooleanPropagatorA());
		booleanGateAEClass.getESuperTypes().add(this.getPropagatorA());
		booleanAndEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanAndEClass.getESuperTypes().add(this.getBooleanGateA());
		booleanOrEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanOrEClass.getESuperTypes().add(this.getBooleanGateA());
		booleanXorEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanXorEClass.getESuperTypes().add(this.getBooleanGateA());
		booleanNotEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanNotEClass.getESuperTypes().add(this.getBooleanPropagatorA());
		booleanNotEClass.getESuperTypes().add(this.getPropagatorA());
		integrityStateBooleanConversionEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		integrityStateBooleanConversionEClass.getESuperTypes().add(this.getBooleanPropagatorA());
		integrityStateBooleanConversionEClass.getESuperTypes().add(this.getConversionA());
		failureModeBooleanConversionEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		failureModeBooleanConversionEClass.getESuperTypes().add(this.getBooleanPropagatorA());
		failureModeBooleanConversionEClass.getESuperTypes().add(this.getConversionA());
		booleanFailureModeConversionEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanFailureModeConversionEClass.getESuperTypes().add(this.getFailureModePropagatorA());
		booleanFailureModeConversionEClass.getESuperTypes().add(this.getConversionA());
		integrityStateFailureModeConversionEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		integrityStateFailureModeConversionEClass.getESuperTypes().add(this.getFailureModePropagatorA());
		integrityStateFailureModeConversionEClass.getESuperTypes().add(this.getConversionA());
		failureModeIntegrityStateConversionEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		failureModeIntegrityStateConversionEClass.getESuperTypes().add(this.getIntegrityStatePropagatorA());
		failureModeIntegrityStateConversionEClass.getESuperTypes().add(this.getConversionA());
		booleanIntegrityStateConversionEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanIntegrityStateConversionEClass.getESuperTypes().add(this.getIntegrityStatePropagatorA());
		booleanIntegrityStateConversionEClass.getESuperTypes().add(this.getConversionA());
		propagationInputEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		propagationInputEClass.getESuperTypes().add(this.getPropagatorA());
		propagationInputEClass.getESuperTypes().add(this.getIntegrityStatePropagatorA());
		propagationInputEClass.getESuperTypes().add(this.getFailureModePropagatorA());
		propagationOutputEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		propagationOutputEClass.getESuperTypes().add(this.getPropagatorA());
		propagationSourceEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		propagationSourceEClass.getESuperTypes().add(this.getPropagatorA());
		propagationSourceEClass.getESuperTypes().add(this.getIntegrityStatePropagatorA());
		propagationSourceEClass.getESuperTypes().add(this.getFailureModePropagatorA());
		propagationSinkEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		propagationSinkEClass.getESuperTypes().add(this.getPropagatorA());

		// Initialize classes, features, and operations; add parameters
		initEClass(failurePropagationEClass, FailurePropagation.class, "FailurePropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailurePropagation_Propagators(), this.getPropagatorA(), null, "propagators", null, 0, -1, FailurePropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagatorAEClass, PropagatorA.class, "PropagatorA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failureModePropagatorAEClass, FailureModePropagatorA.class, "FailureModePropagatorA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanPropagatorAEClass, BooleanPropagatorA.class, "BooleanPropagatorA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conversionAEClass, ConversionA.class, "ConversionA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integrityStatePropagatorAEClass, IntegrityStatePropagatorA.class, "IntegrityStatePropagatorA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanGateAEClass, BooleanGateA.class, "BooleanGateA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanGateA_Inputs(), this.getBooleanPropagatorA(), null, "inputs", null, 0, -1, BooleanGateA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanAndEClass, BooleanAnd.class, "BooleanAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanOrEClass, BooleanOr.class, "BooleanOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanXorEClass, BooleanXor.class, "BooleanXor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanNotEClass, BooleanNot.class, "BooleanNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanNot_Input(), this.getBooleanPropagatorA(), null, "input", null, 0, 1, BooleanNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrityStateBooleanConversionEClass, IntegrityStateBooleanConversion.class, "IntegrityStateBooleanConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegrityStateBooleanConversion_InputIntegrityState(), theCommonPackage.getIntegrityStateE(), "inputIntegrityState", null, 0, 1, IntegrityStateBooleanConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrityStateBooleanConversion_OutputBooleanValue(), ecorePackage.getEBoolean(), "outputBooleanValue", null, 0, 1, IntegrityStateBooleanConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrityStateBooleanConversion_Input(), this.getIntegrityStatePropagatorA(), null, "input", null, 0, 1, IntegrityStateBooleanConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModeBooleanConversionEClass, FailureModeBooleanConversion.class, "FailureModeBooleanConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModeBooleanConversion_Input(), this.getFailureModePropagatorA(), null, "input", null, 0, 1, FailureModeBooleanConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureModeBooleanConversion_OutputBooleanValue(), ecorePackage.getEBoolean(), "outputBooleanValue", null, 0, 1, FailureModeBooleanConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModeBooleanConversion_InputFailureMode(), theSafetyPackage.getFunctionalFailureMode(), null, "inputFailureMode", null, 0, 1, FailureModeBooleanConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanFailureModeConversionEClass, BooleanFailureModeConversion.class, "BooleanFailureModeConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanFailureModeConversion_InputBooleanValue(), ecorePackage.getEBoolean(), "inputBooleanValue", null, 0, 1, BooleanFailureModeConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanFailureModeConversion_Input(), this.getBooleanPropagatorA(), null, "input", null, 0, 1, BooleanFailureModeConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanFailureModeConversion_OutputFailureMode(), theSafetyPackage.getFunctionalFailureMode(), null, "outputFailureMode", null, 0, 1, BooleanFailureModeConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrityStateFailureModeConversionEClass, IntegrityStateFailureModeConversion.class, "IntegrityStateFailureModeConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegrityStateFailureModeConversion_InputIntegrityState(), theCommonPackage.getIntegrityStateE(), "inputIntegrityState", null, 0, 1, IntegrityStateFailureModeConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrityStateFailureModeConversion_Input(), this.getIntegrityStatePropagatorA(), null, "input", null, 0, 1, IntegrityStateFailureModeConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrityStateFailureModeConversion_OutputFailureMode(), theSafetyPackage.getFunctionalFailureMode(), null, "outputFailureMode", null, 0, 1, IntegrityStateFailureModeConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModeIntegrityStateConversionEClass, FailureModeIntegrityStateConversion.class, "FailureModeIntegrityStateConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModeIntegrityStateConversion_Input(), this.getFailureModePropagatorA(), null, "input", null, 0, 1, FailureModeIntegrityStateConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureModeIntegrityStateConversion_OutputIntegrityState(), theCommonPackage.getIntegrityStateE(), "outputIntegrityState", null, 0, 1, FailureModeIntegrityStateConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModeIntegrityStateConversion_InputFailureMode(), theSafetyPackage.getFunctionalFailureMode(), null, "inputFailureMode", null, 0, 1, FailureModeIntegrityStateConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanIntegrityStateConversionEClass, BooleanIntegrityStateConversion.class, "BooleanIntegrityStateConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanIntegrityStateConversion_Input(), this.getBooleanPropagatorA(), null, "input", null, 0, 1, BooleanIntegrityStateConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanIntegrityStateConversion_InputBooleanValue(), ecorePackage.getEBoolean(), "inputBooleanValue", null, 0, 1, BooleanIntegrityStateConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanIntegrityStateConversion_OutputIntegrityState(), theCommonPackage.getIntegrityStateE(), "outputIntegrityState", null, 0, 1, BooleanIntegrityStateConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagationInputEClass, PropagationInput.class, "PropagationInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagationInput_Source(), theLibraryPackage.getInputDeclaration(), null, "source", null, 0, 1, PropagationInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagationOutputEClass, PropagationOutput.class, "PropagationOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagationOutput_Target(), theLibraryPackage.getOutputDeclaration(), null, "target", null, 0, 1, PropagationOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagationOutput_PropagatedIntegrityStates(), this.getIntegrityStatePropagatorA(), null, "propagatedIntegrityStates", null, 0, -1, PropagationOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagationOutput_PropagatedFailureModes(), this.getFailureModePropagatorA(), null, "propagatedFailureModes", null, 0, -1, PropagationOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagationSourceEClass, PropagationSource.class, "PropagationSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagationSource_Source(), theLibraryPackage.getInputDeclaration(), null, "source", null, 0, 1, PropagationSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagationSinkEClass, PropagationSink.class, "PropagationSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagationSink_PropagatedIntegrityStates(), this.getIntegrityStatePropagatorA(), null, "propagatedIntegrityStates", null, 0, -1, PropagationSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagationSink_PropagatedFailureModes(), this.getFailureModePropagatorA(), null, "propagatedFailureModes", null, 0, -1, PropagationSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(failurePropagationGenericTypeEEEnum, FailurePropagationGenericTypeE.class, "FailurePropagationGenericTypeE");
		addEEnumLiteral(failurePropagationGenericTypeEEEnum, FailurePropagationGenericTypeE.INTEGRITY_STATE);
		addEEnumLiteral(failurePropagationGenericTypeEEEnum, FailurePropagationGenericTypeE.FAILURE_MODE);
	}

} //FailurePropagationsPackageImpl
