/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.anatomy.AnatomyPackage;

import de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl;

import de.oaam.model.oaam.capabilities.CapabilitiesPackage;

import de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl;

import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.common.impl.CommonPackageImpl;

import de.oaam.model.oaam.functions.FailureCondition;
import de.oaam.model.oaam.functions.Functions;
import de.oaam.model.oaam.functions.FunctionsContainerA;
import de.oaam.model.oaam.functions.FunctionsFactory;
import de.oaam.model.oaam.functions.FunctionsPackage;
import de.oaam.model.oaam.functions.Input;
import de.oaam.model.oaam.functions.Output;
import de.oaam.model.oaam.functions.OutputLink;
import de.oaam.model.oaam.functions.Parameter;
import de.oaam.model.oaam.functions.Signal;
import de.oaam.model.oaam.functions.SignalGroup;
import de.oaam.model.oaam.functions.Subfunction;
import de.oaam.model.oaam.functions.SystemInputState;
import de.oaam.model.oaam.functions.Task;
import de.oaam.model.oaam.functions.TaskGroup;
import de.oaam.model.oaam.functions.TaskLink;
import de.oaam.model.oaam.functions.TaskRedundancy;
import de.oaam.model.oaam.functions.TaskSymmetry;

import de.oaam.model.oaam.hardware.HardwarePackage;

import de.oaam.model.oaam.hardware.impl.HardwarePackageImpl;

import de.oaam.model.oaam.impl.OaamPackageImpl;

import de.oaam.model.oaam.library.LibraryPackage;

import de.oaam.model.oaam.library.impl.LibraryPackageImpl;

import de.oaam.model.oaam.mapping.MappingPackage;

import de.oaam.model.oaam.mapping.impl.MappingPackageImpl;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl;

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
public class FunctionsPackageImpl extends EPackageImpl implements FunctionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionsContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskSymmetryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRedundancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInputStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subfunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

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
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionsPackageImpl() {
		super(eNS_URI, FunctionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FunctionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionsPackage init() {
		if (isInited) return (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);

		// Obtain or create and register package
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FunctionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) instanceof OaamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) : OaamPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) instanceof SystemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) : SystemsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) instanceof AnatomyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) : AnatomyPackage.eINSTANCE);
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) : CapabilitiesPackage.eINSTANCE);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);

		// Create package meta-data objects
		theFunctionsPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theSystemsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theAnatomyPackage.createPackageContents();
		theCapabilitiesPackage.createPackageContents();
		theRestrictionsPackage.createPackageContents();
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theFunctionsPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theSystemsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theAnatomyPackage.initializePackageContents();
		theCapabilitiesPackage.initializePackageContents();
		theRestrictionsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionsPackage.eNS_URI, theFunctionsPackage);
		return theFunctionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctions() {
		return functionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionsContainerA() {
		return functionsContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionsContainerA_IsAtomic() {
		return (EAttribute)functionsContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsContainerA_Tasks() {
		return (EReference)functionsContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsContainerA_TaskLinks() {
		return (EReference)functionsContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsContainerA_TaskGroups() {
		return (EReference)functionsContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsContainerA_TaskSymmetries() {
		return (EReference)functionsContainerAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsContainerA_TaskRedundancies() {
		return (EReference)functionsContainerAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsContainerA_Signals() {
		return (EReference)functionsContainerAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsContainerA_SignalGroups() {
		return (EReference)functionsContainerAEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsContainerA_FailureEvents() {
		return (EReference)functionsContainerAEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsContainerA_Subfunctions() {
		return (EReference)functionsContainerAEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Type() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Inputs() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outputs() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Implements() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_DeviceBinding() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_NParallels() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_FixedRate() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Parameters() {
		return (EReference)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskLink() {
		return taskLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskLink_Type() {
		return (EReference)taskLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskLink_Inputs() {
		return (EReference)taskLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskLink_Outputs() {
		return (EReference)taskLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskLink_Task() {
		return (EReference)taskLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskLink_Filter() {
		return (EAttribute)taskLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskGroup() {
		return taskGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskGroup_Tasks() {
		return (EReference)taskGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskGroup_IsAtomic() {
		return (EAttribute)taskGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskSymmetry() {
		return taskSymmetryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskSymmetry_Tasks() {
		return (EReference)taskSymmetryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRedundancy() {
		return taskRedundancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRedundancy_Tasks() {
		return (EReference)taskRedundancyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureCondition() {
		return failureConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureCondition_Logic() {
		return (EReference)failureConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureCondition_MaxOccurrenceRate() {
		return (EAttribute)failureConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureCondition_NoSingleFailure() {
		return (EAttribute)failureConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemInputState() {
		return systemInputStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemInputState_State() {
		return (EAttribute)systemInputStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInputState_Output() {
		return (EReference)systemInputStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_Source() {
		return (EReference)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_Target() {
		return (EReference)signalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_Type() {
		return (EReference)signalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignal_InIndex() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignal_OutIndex() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalGroup() {
		return signalGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalGroup_Signals() {
		return (EReference)signalGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Declaration() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Implements() {
		return (EReference)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_IoBindings() {
		return (EReference)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_QueueLength() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_OutputLink() {
		return (EReference)inputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Implements() {
		return (EReference)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Declaration() {
		return (EReference)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_IoBindings() {
		return (EReference)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_FixedRate() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputLink() {
		return outputLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputLink_Output() {
		return (EReference)outputLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputLink_Filter() {
		return (EAttribute)outputLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubfunction() {
		return subfunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubfunction_MultiplicityMin() {
		return (EAttribute)subfunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubfunction_MultiplicityMax() {
		return (EAttribute)subfunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Definition() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsFactory getFunctionsFactory() {
		return (FunctionsFactory)getEFactoryInstance();
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
		functionsEClass = createEClass(FUNCTIONS);

		functionsContainerAEClass = createEClass(FUNCTIONS_CONTAINER_A);
		createEAttribute(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__IS_ATOMIC);
		createEReference(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__TASKS);
		createEReference(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__TASK_LINKS);
		createEReference(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__TASK_GROUPS);
		createEReference(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES);
		createEReference(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES);
		createEReference(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__SIGNALS);
		createEReference(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS);
		createEReference(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__FAILURE_EVENTS);
		createEReference(functionsContainerAEClass, FUNCTIONS_CONTAINER_A__SUBFUNCTIONS);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__TYPE);
		createEReference(taskEClass, TASK__INPUTS);
		createEReference(taskEClass, TASK__OUTPUTS);
		createEReference(taskEClass, TASK__IMPLEMENTS);
		createEReference(taskEClass, TASK__DEVICE_BINDING);
		createEAttribute(taskEClass, TASK__NPARALLELS);
		createEAttribute(taskEClass, TASK__FIXED_RATE);
		createEReference(taskEClass, TASK__PARAMETERS);

		taskLinkEClass = createEClass(TASK_LINK);
		createEReference(taskLinkEClass, TASK_LINK__TYPE);
		createEReference(taskLinkEClass, TASK_LINK__INPUTS);
		createEReference(taskLinkEClass, TASK_LINK__OUTPUTS);
		createEReference(taskLinkEClass, TASK_LINK__TASK);
		createEAttribute(taskLinkEClass, TASK_LINK__FILTER);

		taskGroupEClass = createEClass(TASK_GROUP);
		createEReference(taskGroupEClass, TASK_GROUP__TASKS);
		createEAttribute(taskGroupEClass, TASK_GROUP__IS_ATOMIC);

		taskSymmetryEClass = createEClass(TASK_SYMMETRY);
		createEReference(taskSymmetryEClass, TASK_SYMMETRY__TASKS);

		taskRedundancyEClass = createEClass(TASK_REDUNDANCY);
		createEReference(taskRedundancyEClass, TASK_REDUNDANCY__TASKS);

		failureConditionEClass = createEClass(FAILURE_CONDITION);
		createEReference(failureConditionEClass, FAILURE_CONDITION__LOGIC);
		createEAttribute(failureConditionEClass, FAILURE_CONDITION__MAX_OCCURRENCE_RATE);
		createEAttribute(failureConditionEClass, FAILURE_CONDITION__NO_SINGLE_FAILURE);

		systemInputStateEClass = createEClass(SYSTEM_INPUT_STATE);
		createEAttribute(systemInputStateEClass, SYSTEM_INPUT_STATE__STATE);
		createEReference(systemInputStateEClass, SYSTEM_INPUT_STATE__OUTPUT);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__SOURCE);
		createEReference(signalEClass, SIGNAL__TARGET);
		createEReference(signalEClass, SIGNAL__TYPE);
		createEAttribute(signalEClass, SIGNAL__IN_INDEX);
		createEAttribute(signalEClass, SIGNAL__OUT_INDEX);

		signalGroupEClass = createEClass(SIGNAL_GROUP);
		createEReference(signalGroupEClass, SIGNAL_GROUP__SIGNALS);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__DECLARATION);
		createEReference(inputEClass, INPUT__IMPLEMENTS);
		createEReference(inputEClass, INPUT__IO_BINDINGS);
		createEAttribute(inputEClass, INPUT__QUEUE_LENGTH);
		createEReference(inputEClass, INPUT__OUTPUT_LINK);

		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__IMPLEMENTS);
		createEReference(outputEClass, OUTPUT__DECLARATION);
		createEReference(outputEClass, OUTPUT__IO_BINDINGS);
		createEAttribute(outputEClass, OUTPUT__FIXED_RATE);

		outputLinkEClass = createEClass(OUTPUT_LINK);
		createEReference(outputLinkEClass, OUTPUT_LINK__OUTPUT);
		createEAttribute(outputLinkEClass, OUTPUT_LINK__FILTER);

		subfunctionEClass = createEClass(SUBFUNCTION);
		createEAttribute(subfunctionEClass, SUBFUNCTION__MULTIPLICITY_MIN);
		createEAttribute(subfunctionEClass, SUBFUNCTION__MULTIPLICITY_MAX);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__DEFINITION);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
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
		ScenarioPackage theScenarioPackage = (ScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI);
		LibraryPackage theLibraryPackage = (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);
		SystemsPackage theSystemsPackage = (SystemsPackage)EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI);
		HardwarePackage theHardwarePackage = (HardwarePackage)EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionsEClass.getESuperTypes().add(this.getFunctionsContainerA());
		functionsContainerAEClass.getESuperTypes().add(theCommonPackage.getElementA());
		functionsContainerAEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		functionsContainerAEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		taskEClass.getESuperTypes().add(theCommonPackage.getElementA());
		taskEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		taskEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		taskLinkEClass.getESuperTypes().add(theCommonPackage.getElementA());
		taskLinkEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		taskLinkEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		taskGroupEClass.getESuperTypes().add(theCommonPackage.getElementA());
		taskGroupEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		taskGroupEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		taskSymmetryEClass.getESuperTypes().add(theCommonPackage.getElementA());
		taskSymmetryEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		taskSymmetryEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		taskRedundancyEClass.getESuperTypes().add(theCommonPackage.getElementA());
		taskRedundancyEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		taskRedundancyEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		failureConditionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		failureConditionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		failureConditionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		systemInputStateEClass.getESuperTypes().add(theCommonPackage.getBoolA());
		systemInputStateEClass.getESuperTypes().add(theCommonPackage.getElementA());
		systemInputStateEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		systemInputStateEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		signalEClass.getESuperTypes().add(theCommonPackage.getElementA());
		signalEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		signalEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		signalGroupEClass.getESuperTypes().add(theCommonPackage.getElementA());
		signalGroupEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		signalGroupEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		inputEClass.getESuperTypes().add(theCommonPackage.getElementA());
		inputEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		inputEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		outputEClass.getESuperTypes().add(theCommonPackage.getElementA());
		outputEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		outputEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		outputLinkEClass.getESuperTypes().add(theCommonPackage.getElementA());
		outputLinkEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		outputLinkEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		subfunctionEClass.getESuperTypes().add(this.getFunctionsContainerA());
		parameterEClass.getESuperTypes().add(theCommonPackage.getElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionsEClass, Functions.class, "Functions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionsContainerAEClass, FunctionsContainerA.class, "FunctionsContainerA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionsContainerA_IsAtomic(), ecorePackage.getEBoolean(), "isAtomic", null, 1, 1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionsContainerA_Tasks(), this.getTask(), null, "tasks", null, 0, -1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionsContainerA_TaskLinks(), this.getTaskLink(), null, "taskLinks", null, 0, -1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionsContainerA_TaskGroups(), this.getTaskGroup(), null, "taskGroups", null, 0, -1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionsContainerA_TaskSymmetries(), this.getTaskSymmetry(), null, "taskSymmetries", null, 0, -1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionsContainerA_TaskRedundancies(), this.getTaskRedundancy(), null, "taskRedundancies", null, 0, -1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionsContainerA_Signals(), this.getSignal(), null, "signals", null, 0, -1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionsContainerA_SignalGroups(), this.getSignalGroup(), null, "signalGroups", null, 0, -1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionsContainerA_FailureEvents(), this.getFailureCondition(), null, "failureEvents", null, 0, -1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionsContainerA_Subfunctions(), this.getSubfunction(), null, "subfunctions", null, 0, -1, FunctionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Type(), theLibraryPackage.getTaskType(), null, "type", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Inputs(), this.getInput(), null, "inputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Implements(), theSystemsPackage.getSystem(), null, "implements", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_DeviceBinding(), theHardwarePackage.getDevice(), null, "deviceBinding", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_NParallels(), ecorePackage.getEInt(), "nParallels", "1", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_FixedRate(), ecorePackage.getEDouble(), "fixedRate", "-1.0", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskLinkEClass, TaskLink.class, "TaskLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskLink_Type(), theLibraryPackage.getTaskType(), null, "type", null, 1, 1, TaskLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskLink_Inputs(), this.getInput(), null, "inputs", null, 0, -1, TaskLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskLink_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, TaskLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskLink_Task(), this.getTask(), null, "task", null, 0, 1, TaskLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskLink_Filter(), ecorePackage.getEString(), "filter", null, 0, 1, TaskLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskGroupEClass, TaskGroup.class, "TaskGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskGroup_Tasks(), this.getTask(), null, "tasks", null, 1, -1, TaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskGroup_IsAtomic(), ecorePackage.getEBoolean(), "isAtomic", null, 1, 1, TaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskSymmetryEClass, TaskSymmetry.class, "TaskSymmetry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskSymmetry_Tasks(), this.getTask(), null, "tasks", null, 2, -1, TaskSymmetry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskRedundancyEClass, TaskRedundancy.class, "TaskRedundancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRedundancy_Tasks(), this.getTask(), null, "tasks", null, 2, -1, TaskRedundancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureConditionEClass, FailureCondition.class, "FailureCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureCondition_Logic(), theCommonPackage.getBoolA(), null, "logic", null, 1, 1, FailureCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureCondition_MaxOccurrenceRate(), ecorePackage.getEDouble(), "maxOccurrenceRate", null, 1, 1, FailureCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureCondition_NoSingleFailure(), ecorePackage.getEBoolean(), "noSingleFailure", "false", 1, 1, FailureCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemInputStateEClass, SystemInputState.class, "SystemInputState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemInputState_State(), theCommonPackage.getIntegretyStateE(), "state", null, 1, 1, SystemInputState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemInputState_Output(), this.getOutput(), null, "output", null, 1, 1, SystemInputState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Source(), this.getOutput(), null, "source", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Target(), this.getInput(), null, "target", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Type(), theLibraryPackage.getSignalType(), null, "type", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignal_InIndex(), ecorePackage.getEInt(), "inIndex", "1", 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignal_OutIndex(), ecorePackage.getEInt(), "outIndex", "1", 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalGroupEClass, SignalGroup.class, "SignalGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalGroup_Signals(), this.getSignal(), null, "signals", null, 1, -1, SignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Declaration(), theLibraryPackage.getInputDeclaration(), null, "declaration", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Implements(), theSystemsPackage.getRequiredInputA(), null, "implements", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_IoBindings(), theHardwarePackage.getIo(), null, "ioBindings", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_QueueLength(), ecorePackage.getEInt(), "queueLength", "0", 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_OutputLink(), this.getOutputLink(), null, "outputLink", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_Implements(), theSystemsPackage.getProvidedOutputA(), null, "implements", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Declaration(), theLibraryPackage.getOutputDeclaration(), null, "declaration", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_IoBindings(), theHardwarePackage.getIo(), null, "ioBindings", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_FixedRate(), ecorePackage.getEDouble(), "fixedRate", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputLinkEClass, OutputLink.class, "OutputLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputLink_Output(), this.getOutput(), null, "output", null, 0, 1, OutputLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputLink_Filter(), ecorePackage.getEString(), "filter", null, 0, 1, OutputLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subfunctionEClass, Subfunction.class, "Subfunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubfunction_MultiplicityMin(), ecorePackage.getEInt(), "multiplicityMin", "1", 1, 1, Subfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubfunction_MultiplicityMax(), ecorePackage.getEInt(), "multiplicityMax", "1", 1, 1, Subfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Definition(), theLibraryPackage.getParameterDefinition(), null, "definition", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //FunctionsPackageImpl
