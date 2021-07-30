/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.impl;

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

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl;

import de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl;

import de.oaam.model.oaam.safety.impl.SafetyPackageImpl;

import de.oaam.model.oaam.safety.taskInternalRequirements.Above;
import de.oaam.model.oaam.safety.taskInternalRequirements.Agreement;
import de.oaam.model.oaam.safety.taskInternalRequirements.And;
import de.oaam.model.oaam.safety.taskInternalRequirements.Below;
import de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout;
import de.oaam.model.oaam.safety.taskInternalRequirements.BooleanOperatorA;
import de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA;
import de.oaam.model.oaam.safety.taskInternalRequirements.ComplexOperatorA;
import de.oaam.model.oaam.safety.taskInternalRequirements.Contract;
import de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal;
import de.oaam.model.oaam.safety.taskInternalRequirements.Not;
import de.oaam.model.oaam.safety.taskInternalRequirements.Or;
import de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA;
import de.oaam.model.oaam.safety.taskInternalRequirements.SourceA;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsFactory;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage;
import de.oaam.model.oaam.safety.taskInternalRequirements.Value;

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
public class TaskInternalRequirementsPackageImpl extends EPackageImpl implements TaskInternalRequirementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskInternalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementComponentAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparatorAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass belowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aboveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexOperatorAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolTimeoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

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
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaskInternalRequirementsPackageImpl() {
		super(eNS_URI, TaskInternalRequirementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TaskInternalRequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaskInternalRequirementsPackage init() {
		if (isInited) return (TaskInternalRequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(TaskInternalRequirementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTaskInternalRequirementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TaskInternalRequirementsPackageImpl theTaskInternalRequirementsPackage = registeredTaskInternalRequirementsPackage instanceof TaskInternalRequirementsPackageImpl ? (TaskInternalRequirementsPackageImpl)registeredTaskInternalRequirementsPackage : new TaskInternalRequirementsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailurePropagationsPackage.eNS_URI);
		FailurePropagationsPackageImpl theFailurePropagationsPackage = (FailurePropagationsPackageImpl)(registeredPackage instanceof FailurePropagationsPackageImpl ? registeredPackage : FailurePropagationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailurePropagationMatricesPackage.eNS_URI);
		FailurePropagationMatricesPackageImpl theFailurePropagationMatricesPackage = (FailurePropagationMatricesPackageImpl)(registeredPackage instanceof FailurePropagationMatricesPackageImpl ? registeredPackage : FailurePropagationMatricesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PhysicalPackage.eNS_URI);
		PhysicalPackageImpl thePhysicalPackage = (PhysicalPackageImpl)(registeredPackage instanceof PhysicalPackageImpl ? registeredPackage : PhysicalPackage.eINSTANCE);

		// Create package meta-data objects
		theTaskInternalRequirementsPackage.createPackageContents();
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
		theFailurePropagationsPackage.createPackageContents();
		theFailurePropagationMatricesPackage.createPackageContents();
		thePhysicalPackage.createPackageContents();

		// Initialize created meta-data
		theTaskInternalRequirementsPackage.initializePackageContents();
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
		theFailurePropagationsPackage.initializePackageContents();
		theFailurePropagationMatricesPackage.initializePackageContents();
		thePhysicalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaskInternalRequirementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaskInternalRequirementsPackage.eNS_URI, theTaskInternalRequirementsPackage);
		return theTaskInternalRequirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskInternalRequirement() {
		return taskInternalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskInternalRequirement_Components() {
		return (EReference)taskInternalRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskInternalRequirement_Requires() {
		return (EReference)taskInternalRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementComponentA() {
		return requirementComponentAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparatorA() {
		return comparatorAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparatorA_CompA() {
		return (EReference)comparatorAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparatorA_CompB() {
		return (EReference)comparatorAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreement() {
		return agreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBelow() {
		return belowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbove() {
		return aboveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceA() {
		return sourceAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoSignal() {
		return ioSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoSignal_DeclaredInput() {
		return (EReference)ioSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoSignal_DeclaredOutput() {
		return (EReference)ioSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexOperatorA() {
		return complexOperatorAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolTimeout() {
		return boolTimeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoolTimeout_Expr() {
		return (EReference)boolTimeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolTimeout_Timeout() {
		return (EAttribute)boolTimeoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOperatorA() {
		return booleanOperatorAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_ExprB() {
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_ExprA() {
		return (EReference)andEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_ExprB() {
		return (EReference)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_ExprA() {
		return (EReference)orEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Expr() {
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_PreCondition() {
		return (EReference)contractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_PostCondition() {
		return (EReference)contractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Invariant() {
		return (EReference)contractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInternalRequirementsFactory getTaskInternalRequirementsFactory() {
		return (TaskInternalRequirementsFactory)getEFactoryInstance();
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
		taskInternalRequirementEClass = createEClass(TASK_INTERNAL_REQUIREMENT);
		createEReference(taskInternalRequirementEClass, TASK_INTERNAL_REQUIREMENT__COMPONENTS);
		createEReference(taskInternalRequirementEClass, TASK_INTERNAL_REQUIREMENT__REQUIRES);

		requirementComponentAEClass = createEClass(REQUIREMENT_COMPONENT_A);

		comparatorAEClass = createEClass(COMPARATOR_A);
		createEReference(comparatorAEClass, COMPARATOR_A__COMP_A);
		createEReference(comparatorAEClass, COMPARATOR_A__COMP_B);

		agreementEClass = createEClass(AGREEMENT);

		belowEClass = createEClass(BELOW);

		aboveEClass = createEClass(ABOVE);

		sourceAEClass = createEClass(SOURCE_A);

		ioSignalEClass = createEClass(IO_SIGNAL);
		createEReference(ioSignalEClass, IO_SIGNAL__DECLARED_INPUT);
		createEReference(ioSignalEClass, IO_SIGNAL__DECLARED_OUTPUT);

		valueEClass = createEClass(VALUE);

		complexOperatorAEClass = createEClass(COMPLEX_OPERATOR_A);

		boolTimeoutEClass = createEClass(BOOL_TIMEOUT);
		createEReference(boolTimeoutEClass, BOOL_TIMEOUT__EXPR);
		createEAttribute(boolTimeoutEClass, BOOL_TIMEOUT__TIMEOUT);

		booleanOperatorAEClass = createEClass(BOOLEAN_OPERATOR_A);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__EXPR_B);
		createEReference(andEClass, AND__EXPR_A);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__EXPR_B);
		createEReference(orEClass, OR__EXPR_A);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__EXPR);

		contractEClass = createEClass(CONTRACT);
		createEReference(contractEClass, CONTRACT__PRE_CONDITION);
		createEReference(contractEClass, CONTRACT__POST_CONDITION);
		createEReference(contractEClass, CONTRACT__INVARIANT);
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
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		LibraryPackage theLibraryPackage = (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskInternalRequirementEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		requirementComponentAEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		comparatorAEClass.getESuperTypes().add(this.getRequirementComponentA());
		agreementEClass.getESuperTypes().add(this.getComparatorA());
		belowEClass.getESuperTypes().add(this.getComparatorA());
		aboveEClass.getESuperTypes().add(this.getComparatorA());
		sourceAEClass.getESuperTypes().add(this.getRequirementComponentA());
		ioSignalEClass.getESuperTypes().add(this.getSourceA());
		valueEClass.getESuperTypes().add(this.getSourceA());
		complexOperatorAEClass.getESuperTypes().add(this.getRequirementComponentA());
		boolTimeoutEClass.getESuperTypes().add(this.getComplexOperatorA());
		booleanOperatorAEClass.getESuperTypes().add(this.getRequirementComponentA());
		andEClass.getESuperTypes().add(this.getBooleanOperatorA());
		orEClass.getESuperTypes().add(this.getBooleanOperatorA());
		notEClass.getESuperTypes().add(this.getBooleanOperatorA());
		contractEClass.getESuperTypes().add(this.getComplexOperatorA());

		// Initialize classes, features, and operations; add parameters
		initEClass(taskInternalRequirementEClass, TaskInternalRequirement.class, "TaskInternalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskInternalRequirement_Components(), this.getRequirementComponentA(), null, "components", null, 0, -1, TaskInternalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskInternalRequirement_Requires(), this.getRequirementComponentA(), null, "requires", null, 0, 1, TaskInternalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementComponentAEClass, RequirementComponentA.class, "RequirementComponentA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comparatorAEClass, ComparatorA.class, "ComparatorA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparatorA_CompA(), this.getRequirementComponentA(), null, "compA", null, 0, 1, ComparatorA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparatorA_CompB(), this.getRequirementComponentA(), null, "compB", null, 0, 1, ComparatorA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementEClass, Agreement.class, "Agreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(belowEClass, Below.class, "Below", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aboveEClass, Above.class, "Above", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceAEClass, SourceA.class, "SourceA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ioSignalEClass, IoSignal.class, "IoSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoSignal_DeclaredInput(), theLibraryPackage.getInputDeclaration(), null, "declaredInput", null, 0, 1, IoSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIoSignal_DeclaredOutput(), theLibraryPackage.getOutputDeclaration(), null, "declaredOutput", null, 0, 1, IoSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexOperatorAEClass, ComplexOperatorA.class, "ComplexOperatorA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolTimeoutEClass, BoolTimeout.class, "BoolTimeout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoolTimeout_Expr(), this.getRequirementComponentA(), null, "expr", null, 0, 1, BoolTimeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolTimeout_Timeout(), ecorePackage.getEInt(), "timeout", null, 0, 1, BoolTimeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanOperatorAEClass, BooleanOperatorA.class, "BooleanOperatorA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_ExprB(), this.getRequirementComponentA(), null, "exprB", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnd_ExprA(), this.getRequirementComponentA(), null, "exprA", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_ExprB(), this.getRequirementComponentA(), null, "exprB", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOr_ExprA(), this.getRequirementComponentA(), null, "exprA", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Expr(), this.getRequirementComponentA(), null, "expr", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContract_PreCondition(), this.getRequirementComponentA(), null, "preCondition", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_PostCondition(), this.getRequirementComponentA(), null, "postCondition", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Invariant(), this.getRequirementComponentA(), null, "invariant", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TaskInternalRequirementsPackageImpl
