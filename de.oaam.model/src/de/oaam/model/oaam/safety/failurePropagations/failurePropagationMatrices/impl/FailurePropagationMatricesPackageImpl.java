/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

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

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesFactory;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatrixA;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry;

import de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl;

import de.oaam.model.oaam.safety.impl.SafetyPackageImpl;

import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage;

import de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl;

import de.oaam.model.oaam.scenario.ScenarioPackage;

import de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl;

import de.oaam.model.oaam.systems.SystemsPackage;

import de.oaam.model.oaam.systems.impl.SystemsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailurePropagationMatricesPackageImpl extends EPackageImpl implements FailurePropagationMatricesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failurePropagationMatrixAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityStateMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeInportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeOutportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeMatrixRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeInportEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeOutportEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityStateOutportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityStateInportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityStateMatrixRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityStateInportEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityStateOutportEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanInportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOutportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanMatrixRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanInportEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOutportEntryEClass = null;

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
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FailurePropagationMatricesPackageImpl() {
		super(eNS_URI, FailurePropagationMatricesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FailurePropagationMatricesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FailurePropagationMatricesPackage init() {
		if (isInited) return (FailurePropagationMatricesPackage)EPackage.Registry.INSTANCE.getEPackage(FailurePropagationMatricesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFailurePropagationMatricesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FailurePropagationMatricesPackageImpl theFailurePropagationMatricesPackage = registeredFailurePropagationMatricesPackage instanceof FailurePropagationMatricesPackageImpl ? (FailurePropagationMatricesPackageImpl)registeredFailurePropagationMatricesPackage : new FailurePropagationMatricesPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailurePropagationsPackage.eNS_URI);
		FailurePropagationsPackageImpl theFailurePropagationsPackage = (FailurePropagationsPackageImpl)(registeredPackage instanceof FailurePropagationsPackageImpl ? registeredPackage : FailurePropagationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PhysicalPackage.eNS_URI);
		PhysicalPackageImpl thePhysicalPackage = (PhysicalPackageImpl)(registeredPackage instanceof PhysicalPackageImpl ? registeredPackage : PhysicalPackage.eINSTANCE);

		// Create package meta-data objects
		theFailurePropagationMatricesPackage.createPackageContents();
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
		theFailurePropagationsPackage.createPackageContents();
		thePhysicalPackage.createPackageContents();

		// Initialize created meta-data
		theFailurePropagationMatricesPackage.initializePackageContents();
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
		theFailurePropagationsPackage.initializePackageContents();
		thePhysicalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFailurePropagationMatricesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FailurePropagationMatricesPackage.eNS_URI, theFailurePropagationMatricesPackage);
		return theFailurePropagationMatricesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailurePropagationMatrixA() {
		return failurePropagationMatrixAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModeMatrix() {
		return failureModeMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeMatrix_Rows() {
		return (EReference)failureModeMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeMatrix_Inports() {
		return (EReference)failureModeMatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeMatrix_Outports() {
		return (EReference)failureModeMatrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrityStateMatrix() {
		return integrityStateMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateMatrix_Outports() {
		return (EReference)integrityStateMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateMatrix_Inports() {
		return (EReference)integrityStateMatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateMatrix_Rows() {
		return (EReference)integrityStateMatrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanMatrix() {
		return booleanMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanMatrix_Outports() {
		return (EReference)booleanMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanMatrix_Inports() {
		return (EReference)booleanMatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanMatrix_Rows() {
		return (EReference)booleanMatrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModeInport() {
		return failureModeInportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeInport_Input() {
		return (EReference)failureModeInportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModeOutport() {
		return failureModeOutportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeOutport_DefaultFailureMode() {
		return (EReference)failureModeOutportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModeMatrixRow() {
		return failureModeMatrixRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeMatrixRow_InportEntries() {
		return (EReference)failureModeMatrixRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeMatrixRow_OutportEntries() {
		return (EReference)failureModeMatrixRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModeInportEntry() {
		return failureModeInportEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeInportEntry_Inport() {
		return (EReference)failureModeInportEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeInportEntry_FailureMode() {
		return (EReference)failureModeInportEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModeOutportEntry() {
		return failureModeOutportEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeOutportEntry_Outport() {
		return (EReference)failureModeOutportEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModeOutportEntry_FailureMode() {
		return (EReference)failureModeOutportEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrityStateOutport() {
		return integrityStateOutportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrityStateOutport_DefaultIntegrityState() {
		return (EAttribute)integrityStateOutportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrityStateInport() {
		return integrityStateInportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateInport_Input() {
		return (EReference)integrityStateInportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrityStateMatrixRow() {
		return integrityStateMatrixRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateMatrixRow_InportEntries() {
		return (EReference)integrityStateMatrixRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateMatrixRow_OutportEntries() {
		return (EReference)integrityStateMatrixRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrityStateInportEntry() {
		return integrityStateInportEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrityStateInportEntry_IntegrityState() {
		return (EAttribute)integrityStateInportEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateInportEntry_Inport() {
		return (EReference)integrityStateInportEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrityStateOutportEntry() {
		return integrityStateOutportEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrityStateOutportEntry_IntegrityState() {
		return (EAttribute)integrityStateOutportEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrityStateOutportEntry_Outport() {
		return (EReference)integrityStateOutportEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanInport() {
		return booleanInportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanInport_Input() {
		return (EReference)booleanInportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOutport() {
		return booleanOutportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanOutport_DefaultValue() {
		return (EAttribute)booleanOutportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanMatrixRow() {
		return booleanMatrixRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanMatrixRow_InportEntries() {
		return (EReference)booleanMatrixRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanMatrixRow_OutportEntries() {
		return (EReference)booleanMatrixRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanInportEntry() {
		return booleanInportEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanInportEntry_Value() {
		return (EAttribute)booleanInportEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanInportEntry_Inport() {
		return (EReference)booleanInportEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOutportEntry() {
		return booleanOutportEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanOutportEntry_Value() {
		return (EAttribute)booleanOutportEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanOutportEntry_Outport() {
		return (EReference)booleanOutportEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationMatricesFactory getFailurePropagationMatricesFactory() {
		return (FailurePropagationMatricesFactory)getEFactoryInstance();
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
		failurePropagationMatrixAEClass = createEClass(FAILURE_PROPAGATION_MATRIX_A);

		failureModeMatrixEClass = createEClass(FAILURE_MODE_MATRIX);
		createEReference(failureModeMatrixEClass, FAILURE_MODE_MATRIX__ROWS);
		createEReference(failureModeMatrixEClass, FAILURE_MODE_MATRIX__INPORTS);
		createEReference(failureModeMatrixEClass, FAILURE_MODE_MATRIX__OUTPORTS);

		integrityStateMatrixEClass = createEClass(INTEGRITY_STATE_MATRIX);
		createEReference(integrityStateMatrixEClass, INTEGRITY_STATE_MATRIX__OUTPORTS);
		createEReference(integrityStateMatrixEClass, INTEGRITY_STATE_MATRIX__INPORTS);
		createEReference(integrityStateMatrixEClass, INTEGRITY_STATE_MATRIX__ROWS);

		booleanMatrixEClass = createEClass(BOOLEAN_MATRIX);
		createEReference(booleanMatrixEClass, BOOLEAN_MATRIX__OUTPORTS);
		createEReference(booleanMatrixEClass, BOOLEAN_MATRIX__INPORTS);
		createEReference(booleanMatrixEClass, BOOLEAN_MATRIX__ROWS);

		failureModeInportEClass = createEClass(FAILURE_MODE_INPORT);
		createEReference(failureModeInportEClass, FAILURE_MODE_INPORT__INPUT);

		failureModeOutportEClass = createEClass(FAILURE_MODE_OUTPORT);
		createEReference(failureModeOutportEClass, FAILURE_MODE_OUTPORT__DEFAULT_FAILURE_MODE);

		failureModeMatrixRowEClass = createEClass(FAILURE_MODE_MATRIX_ROW);
		createEReference(failureModeMatrixRowEClass, FAILURE_MODE_MATRIX_ROW__INPORT_ENTRIES);
		createEReference(failureModeMatrixRowEClass, FAILURE_MODE_MATRIX_ROW__OUTPORT_ENTRIES);

		failureModeInportEntryEClass = createEClass(FAILURE_MODE_INPORT_ENTRY);
		createEReference(failureModeInportEntryEClass, FAILURE_MODE_INPORT_ENTRY__INPORT);
		createEReference(failureModeInportEntryEClass, FAILURE_MODE_INPORT_ENTRY__FAILURE_MODE);

		failureModeOutportEntryEClass = createEClass(FAILURE_MODE_OUTPORT_ENTRY);
		createEReference(failureModeOutportEntryEClass, FAILURE_MODE_OUTPORT_ENTRY__OUTPORT);
		createEReference(failureModeOutportEntryEClass, FAILURE_MODE_OUTPORT_ENTRY__FAILURE_MODE);

		integrityStateOutportEClass = createEClass(INTEGRITY_STATE_OUTPORT);
		createEAttribute(integrityStateOutportEClass, INTEGRITY_STATE_OUTPORT__DEFAULT_INTEGRITY_STATE);

		integrityStateInportEClass = createEClass(INTEGRITY_STATE_INPORT);
		createEReference(integrityStateInportEClass, INTEGRITY_STATE_INPORT__INPUT);

		integrityStateMatrixRowEClass = createEClass(INTEGRITY_STATE_MATRIX_ROW);
		createEReference(integrityStateMatrixRowEClass, INTEGRITY_STATE_MATRIX_ROW__INPORT_ENTRIES);
		createEReference(integrityStateMatrixRowEClass, INTEGRITY_STATE_MATRIX_ROW__OUTPORT_ENTRIES);

		integrityStateInportEntryEClass = createEClass(INTEGRITY_STATE_INPORT_ENTRY);
		createEAttribute(integrityStateInportEntryEClass, INTEGRITY_STATE_INPORT_ENTRY__INTEGRITY_STATE);
		createEReference(integrityStateInportEntryEClass, INTEGRITY_STATE_INPORT_ENTRY__INPORT);

		integrityStateOutportEntryEClass = createEClass(INTEGRITY_STATE_OUTPORT_ENTRY);
		createEAttribute(integrityStateOutportEntryEClass, INTEGRITY_STATE_OUTPORT_ENTRY__INTEGRITY_STATE);
		createEReference(integrityStateOutportEntryEClass, INTEGRITY_STATE_OUTPORT_ENTRY__OUTPORT);

		booleanInportEClass = createEClass(BOOLEAN_INPORT);
		createEReference(booleanInportEClass, BOOLEAN_INPORT__INPUT);

		booleanOutportEClass = createEClass(BOOLEAN_OUTPORT);
		createEAttribute(booleanOutportEClass, BOOLEAN_OUTPORT__DEFAULT_VALUE);

		booleanMatrixRowEClass = createEClass(BOOLEAN_MATRIX_ROW);
		createEReference(booleanMatrixRowEClass, BOOLEAN_MATRIX_ROW__INPORT_ENTRIES);
		createEReference(booleanMatrixRowEClass, BOOLEAN_MATRIX_ROW__OUTPORT_ENTRIES);

		booleanInportEntryEClass = createEClass(BOOLEAN_INPORT_ENTRY);
		createEAttribute(booleanInportEntryEClass, BOOLEAN_INPORT_ENTRY__VALUE);
		createEReference(booleanInportEntryEClass, BOOLEAN_INPORT_ENTRY__INPORT);

		booleanOutportEntryEClass = createEClass(BOOLEAN_OUTPORT_ENTRY);
		createEAttribute(booleanOutportEntryEClass, BOOLEAN_OUTPORT_ENTRY__VALUE);
		createEReference(booleanOutportEntryEClass, BOOLEAN_OUTPORT_ENTRY__OUTPORT);
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
		FailurePropagationsPackage theFailurePropagationsPackage = (FailurePropagationsPackage)EPackage.Registry.INSTANCE.getEPackage(FailurePropagationsPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		SafetyPackage theSafetyPackage = (SafetyPackage)EPackage.Registry.INSTANCE.getEPackage(SafetyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		failurePropagationMatrixAEClass.getESuperTypes().add(theFailurePropagationsPackage.getPropagatorA());
		failureModeMatrixEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		failureModeMatrixEClass.getESuperTypes().add(this.getFailurePropagationMatrixA());
		integrityStateMatrixEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		integrityStateMatrixEClass.getESuperTypes().add(this.getFailurePropagationMatrixA());
		booleanMatrixEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanMatrixEClass.getESuperTypes().add(this.getFailurePropagationMatrixA());
		failureModeInportEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		failureModeOutportEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		failureModeOutportEClass.getESuperTypes().add(theFailurePropagationsPackage.getFailureModePropagatorA());
		failureModeMatrixRowEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		failureModeInportEntryEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		failureModeOutportEntryEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		integrityStateOutportEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		integrityStateOutportEClass.getESuperTypes().add(theFailurePropagationsPackage.getIntegrityStatePropagatorA());
		integrityStateInportEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		integrityStateMatrixRowEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		integrityStateInportEntryEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		integrityStateOutportEntryEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanInportEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanOutportEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanOutportEClass.getESuperTypes().add(theFailurePropagationsPackage.getBooleanPropagatorA());
		booleanMatrixRowEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanInportEntryEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		booleanOutportEntryEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(failurePropagationMatrixAEClass, FailurePropagationMatrixA.class, "FailurePropagationMatrixA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failureModeMatrixEClass, FailureModeMatrix.class, "FailureModeMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModeMatrix_Rows(), this.getFailureModeMatrixRow(), null, "rows", null, 0, -1, FailureModeMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModeMatrix_Inports(), this.getFailureModeInport(), null, "inports", null, 0, -1, FailureModeMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModeMatrix_Outports(), this.getFailureModeOutport(), null, "outports", null, 0, -1, FailureModeMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrityStateMatrixEClass, IntegrityStateMatrix.class, "IntegrityStateMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegrityStateMatrix_Outports(), this.getIntegrityStateOutport(), null, "outports", null, 0, -1, IntegrityStateMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrityStateMatrix_Inports(), this.getIntegrityStateInport(), null, "inports", null, 0, -1, IntegrityStateMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrityStateMatrix_Rows(), this.getIntegrityStateMatrixRow(), null, "rows", null, 0, -1, IntegrityStateMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanMatrixEClass, BooleanMatrix.class, "BooleanMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanMatrix_Outports(), this.getBooleanOutport(), null, "outports", null, 0, -1, BooleanMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanMatrix_Inports(), this.getBooleanInport(), null, "inports", null, 0, -1, BooleanMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanMatrix_Rows(), this.getBooleanMatrixRow(), null, "rows", null, 0, -1, BooleanMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModeInportEClass, FailureModeInport.class, "FailureModeInport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModeInport_Input(), theFailurePropagationsPackage.getFailureModePropagatorA(), null, "input", null, 0, 1, FailureModeInport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModeOutportEClass, FailureModeOutport.class, "FailureModeOutport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModeOutport_DefaultFailureMode(), theSafetyPackage.getFunctionalFailureMode(), null, "defaultFailureMode", null, 0, 1, FailureModeOutport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModeMatrixRowEClass, FailureModeMatrixRow.class, "FailureModeMatrixRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModeMatrixRow_InportEntries(), this.getFailureModeInportEntry(), null, "inportEntries", null, 0, -1, FailureModeMatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModeMatrixRow_OutportEntries(), this.getFailureModeOutportEntry(), null, "outportEntries", null, 0, -1, FailureModeMatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModeInportEntryEClass, FailureModeInportEntry.class, "FailureModeInportEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModeInportEntry_Inport(), this.getFailureModeInport(), null, "inport", null, 0, 1, FailureModeInportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModeInportEntry_FailureMode(), theSafetyPackage.getFunctionalFailureMode(), null, "failureMode", null, 0, 1, FailureModeInportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModeOutportEntryEClass, FailureModeOutportEntry.class, "FailureModeOutportEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModeOutportEntry_Outport(), this.getFailureModeOutport(), null, "outport", null, 0, 1, FailureModeOutportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModeOutportEntry_FailureMode(), theSafetyPackage.getFunctionalFailureMode(), null, "failureMode", null, 0, 1, FailureModeOutportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrityStateOutportEClass, IntegrityStateOutport.class, "IntegrityStateOutport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegrityStateOutport_DefaultIntegrityState(), theCommonPackage.getIntegrityStateE(), "defaultIntegrityState", null, 0, 1, IntegrityStateOutport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrityStateInportEClass, IntegrityStateInport.class, "IntegrityStateInport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegrityStateInport_Input(), theFailurePropagationsPackage.getIntegrityStatePropagatorA(), null, "input", null, 0, 1, IntegrityStateInport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrityStateMatrixRowEClass, IntegrityStateMatrixRow.class, "IntegrityStateMatrixRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegrityStateMatrixRow_InportEntries(), this.getIntegrityStateInportEntry(), null, "inportEntries", null, 0, -1, IntegrityStateMatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrityStateMatrixRow_OutportEntries(), this.getIntegrityStateOutportEntry(), null, "outportEntries", null, 0, -1, IntegrityStateMatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrityStateInportEntryEClass, IntegrityStateInportEntry.class, "IntegrityStateInportEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegrityStateInportEntry_IntegrityState(), theCommonPackage.getIntegrityStateE(), "integrityState", null, 0, 1, IntegrityStateInportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrityStateInportEntry_Inport(), this.getIntegrityStateInport(), null, "inport", null, 0, 1, IntegrityStateInportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrityStateOutportEntryEClass, IntegrityStateOutportEntry.class, "IntegrityStateOutportEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegrityStateOutportEntry_IntegrityState(), theCommonPackage.getIntegrityStateE(), "integrityState", null, 0, 1, IntegrityStateOutportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrityStateOutportEntry_Outport(), this.getIntegrityStateOutport(), null, "outport", null, 0, 1, IntegrityStateOutportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanInportEClass, BooleanInport.class, "BooleanInport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanInport_Input(), theFailurePropagationsPackage.getBooleanPropagatorA(), null, "input", null, 0, 1, BooleanInport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanOutportEClass, BooleanOutport.class, "BooleanOutport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanOutport_DefaultValue(), ecorePackage.getEBoolean(), "defaultValue", null, 0, 1, BooleanOutport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanMatrixRowEClass, BooleanMatrixRow.class, "BooleanMatrixRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanMatrixRow_InportEntries(), this.getBooleanInportEntry(), null, "inportEntries", null, 0, -1, BooleanMatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanMatrixRow_OutportEntries(), this.getBooleanOutportEntry(), null, "outportEntries", null, 0, -1, BooleanMatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanInportEntryEClass, BooleanInportEntry.class, "BooleanInportEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanInportEntry_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanInportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanInportEntry_Inport(), this.getBooleanInport(), null, "inport", null, 0, 1, BooleanInportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanOutportEntryEClass, BooleanOutportEntry.class, "BooleanOutportEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanOutportEntry_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanOutportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanOutportEntry_Outport(), this.getBooleanOutport(), null, "outport", null, 0, 1, BooleanOutportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //FailurePropagationMatricesPackageImpl
