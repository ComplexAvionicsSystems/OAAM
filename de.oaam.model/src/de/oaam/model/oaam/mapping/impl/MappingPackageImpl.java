/**
 */
package de.oaam.model.oaam.mapping.impl;

import de.oaam.model.oaam.OaamPackage;

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

import de.oaam.model.oaam.mapping.ConnectionAssignment;
import de.oaam.model.oaam.mapping.ConnectionAssignmentSegment;
import de.oaam.model.oaam.mapping.DeviceAssignment;
import de.oaam.model.oaam.mapping.Mapping;
import de.oaam.model.oaam.mapping.MappingContainerA;
import de.oaam.model.oaam.mapping.MappingFactory;
import de.oaam.model.oaam.mapping.MappingPackage;
import de.oaam.model.oaam.mapping.SignalAssignment;
import de.oaam.model.oaam.mapping.SignalAssignmentSegment;
import de.oaam.model.oaam.mapping.SubDeviceAssignment;
import de.oaam.model.oaam.mapping.Supmapping;
import de.oaam.model.oaam.mapping.TaskAssignment;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl;

import de.oaam.model.oaam.scenario.ScenarioPackage;

import de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl;

import de.oaam.model.oaam.systems.SystemsPackage;

import de.oaam.model.oaam.systems.impl.SystemsPackageImpl;

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
public class MappingPackageImpl extends EPackageImpl implements MappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalAssignmentSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionAssignmentSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subDeviceAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supmappingEClass = null;

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
	 * @see de.oaam.model.oaam.mapping.MappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MappingPackageImpl() {
		super(eNS_URI, MappingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MappingPackage init() {
		if (isInited) return (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

		// Obtain or create and register package
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MappingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) instanceof OaamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) : OaamPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) instanceof SystemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) : SystemsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) instanceof AnatomyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) : AnatomyPackage.eINSTANCE);
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) : CapabilitiesPackage.eINSTANCE);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);

		// Create package meta-data objects
		theMappingPackage.createPackageContents();
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

		// Initialize created meta-data
		theMappingPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theMappingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MappingPackage.eNS_URI, theMappingPackage);
		return theMappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingContainerA() {
		return mappingContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingContainerA_DeviceAssignments() {
		return (EReference)mappingContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingContainerA_SubDeviceAssignments() {
		return (EReference)mappingContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingContainerA_ConnectionAssignments() {
		return (EReference)mappingContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingContainerA_TaskAssignments() {
		return (EReference)mappingContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingContainerA_SignalAssignments() {
		return (EReference)mappingContainerAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingContainerA_Supmapping() {
		return (EReference)mappingContainerAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskAssignment() {
		return taskAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAssignment_Capability() {
		return (EReference)taskAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAssignment_Task() {
		return (EReference)taskAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAssignment_Device() {
		return (EReference)taskAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalAssignment() {
		return signalAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignment_Segments() {
		return (EReference)signalAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignment_Signal() {
		return (EReference)signalAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionAssignment() {
		return connectionAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignment_Segments() {
		return (EReference)connectionAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignment_Connection() {
		return (EReference)connectionAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalAssignmentSegment() {
		return signalAssignmentSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignmentSegment_Capability() {
		return (EReference)signalAssignmentSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignmentSegment_Device() {
		return (EReference)signalAssignmentSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignmentSegment_Connection() {
		return (EReference)signalAssignmentSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceAssignment() {
		return deviceAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceAssignment_Device() {
		return (EReference)deviceAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceAssignment_Location() {
		return (EReference)deviceAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceAssignment_Capability() {
		return (EReference)deviceAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionAssignmentSegment() {
		return connectionAssignmentSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignmentSegment_Capability() {
		return (EReference)connectionAssignmentSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignmentSegment_Location() {
		return (EReference)connectionAssignmentSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignmentSegment_Duct() {
		return (EReference)connectionAssignmentSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubDeviceAssignment() {
		return subDeviceAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDeviceAssignment_Capability() {
		return (EReference)subDeviceAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDeviceAssignment_SubDevice() {
		return (EReference)subDeviceAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDeviceAssignment_TargetDevice() {
		return (EReference)subDeviceAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupmapping() {
		return supmappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactory getMappingFactory() {
		return (MappingFactory)getEFactoryInstance();
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
		mappingContainerAEClass = createEClass(MAPPING_CONTAINER_A);
		createEReference(mappingContainerAEClass, MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS);
		createEReference(mappingContainerAEClass, MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS);
		createEReference(mappingContainerAEClass, MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS);
		createEReference(mappingContainerAEClass, MAPPING_CONTAINER_A__TASK_ASSIGNMENTS);
		createEReference(mappingContainerAEClass, MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS);
		createEReference(mappingContainerAEClass, MAPPING_CONTAINER_A__SUPMAPPING);

		taskAssignmentEClass = createEClass(TASK_ASSIGNMENT);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__CAPABILITY);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__TASK);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__DEVICE);

		signalAssignmentEClass = createEClass(SIGNAL_ASSIGNMENT);
		createEReference(signalAssignmentEClass, SIGNAL_ASSIGNMENT__SEGMENTS);
		createEReference(signalAssignmentEClass, SIGNAL_ASSIGNMENT__SIGNAL);

		connectionAssignmentEClass = createEClass(CONNECTION_ASSIGNMENT);
		createEReference(connectionAssignmentEClass, CONNECTION_ASSIGNMENT__SEGMENTS);
		createEReference(connectionAssignmentEClass, CONNECTION_ASSIGNMENT__CONNECTION);

		signalAssignmentSegmentEClass = createEClass(SIGNAL_ASSIGNMENT_SEGMENT);
		createEReference(signalAssignmentSegmentEClass, SIGNAL_ASSIGNMENT_SEGMENT__CAPABILITY);
		createEReference(signalAssignmentSegmentEClass, SIGNAL_ASSIGNMENT_SEGMENT__DEVICE);
		createEReference(signalAssignmentSegmentEClass, SIGNAL_ASSIGNMENT_SEGMENT__CONNECTION);

		deviceAssignmentEClass = createEClass(DEVICE_ASSIGNMENT);
		createEReference(deviceAssignmentEClass, DEVICE_ASSIGNMENT__DEVICE);
		createEReference(deviceAssignmentEClass, DEVICE_ASSIGNMENT__LOCATION);
		createEReference(deviceAssignmentEClass, DEVICE_ASSIGNMENT__CAPABILITY);

		connectionAssignmentSegmentEClass = createEClass(CONNECTION_ASSIGNMENT_SEGMENT);
		createEReference(connectionAssignmentSegmentEClass, CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY);
		createEReference(connectionAssignmentSegmentEClass, CONNECTION_ASSIGNMENT_SEGMENT__LOCATION);
		createEReference(connectionAssignmentSegmentEClass, CONNECTION_ASSIGNMENT_SEGMENT__DUCT);

		subDeviceAssignmentEClass = createEClass(SUB_DEVICE_ASSIGNMENT);
		createEReference(subDeviceAssignmentEClass, SUB_DEVICE_ASSIGNMENT__CAPABILITY);
		createEReference(subDeviceAssignmentEClass, SUB_DEVICE_ASSIGNMENT__SUB_DEVICE);
		createEReference(subDeviceAssignmentEClass, SUB_DEVICE_ASSIGNMENT__TARGET_DEVICE);

		mappingEClass = createEClass(MAPPING);

		supmappingEClass = createEClass(SUPMAPPING);
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
		CapabilitiesPackage theCapabilitiesPackage = (CapabilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI);
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		HardwarePackage theHardwarePackage = (HardwarePackage)EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI);
		AnatomyPackage theAnatomyPackage = (AnatomyPackage)EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mappingContainerAEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		taskAssignmentEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		taskAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		taskAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		signalAssignmentEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		signalAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		signalAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		connectionAssignmentEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		connectionAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		connectionAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		signalAssignmentSegmentEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		signalAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		signalAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		deviceAssignmentEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		deviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		deviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		connectionAssignmentSegmentEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		connectionAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		connectionAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		subDeviceAssignmentEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		subDeviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		subDeviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		mappingEClass.getESuperTypes().add(this.getMappingContainerA());
		supmappingEClass.getESuperTypes().add(this.getMappingContainerA());
		supmappingEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		supmappingEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(mappingContainerAEClass, MappingContainerA.class, "MappingContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingContainerA_DeviceAssignments(), this.getDeviceAssignment(), null, "deviceAssignments", null, 0, -1, MappingContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingContainerA_SubDeviceAssignments(), this.getSubDeviceAssignment(), null, "subDeviceAssignments", null, 0, -1, MappingContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingContainerA_ConnectionAssignments(), this.getConnectionAssignment(), null, "connectionAssignments", null, 0, -1, MappingContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingContainerA_TaskAssignments(), this.getTaskAssignment(), null, "taskAssignments", null, 0, -1, MappingContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingContainerA_SignalAssignments(), this.getSignalAssignment(), null, "signalAssignments", null, 0, -1, MappingContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingContainerA_Supmapping(), this.getSupmapping(), null, "supmapping", null, 0, -1, MappingContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskAssignmentEClass, TaskAssignment.class, "TaskAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskAssignment_Capability(), theCapabilitiesPackage.getTaskCapability(), null, "capability", null, 1, 1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAssignment_Task(), theFunctionsPackage.getTask(), null, "task", null, 1, 1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAssignment_Device(), theHardwarePackage.getDevice(), null, "device", null, 1, 1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalAssignmentEClass, SignalAssignment.class, "SignalAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalAssignment_Segments(), this.getSignalAssignmentSegment(), null, "segments", null, 0, -1, SignalAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAssignment_Signal(), theFunctionsPackage.getSignal(), null, "signal", null, 1, 1, SignalAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionAssignmentEClass, ConnectionAssignment.class, "ConnectionAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionAssignment_Segments(), this.getConnectionAssignmentSegment(), null, "segments", null, 0, -1, ConnectionAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionAssignment_Connection(), theHardwarePackage.getConnection(), null, "connection", null, 1, 1, ConnectionAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalAssignmentSegmentEClass, SignalAssignmentSegment.class, "SignalAssignmentSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalAssignmentSegment_Capability(), theCapabilitiesPackage.getSignalCapability(), null, "capability", null, 1, 1, SignalAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAssignmentSegment_Device(), theHardwarePackage.getDevice(), null, "device", null, 0, 1, SignalAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAssignmentSegment_Connection(), theHardwarePackage.getConnection(), null, "connection", null, 0, 1, SignalAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceAssignmentEClass, DeviceAssignment.class, "DeviceAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceAssignment_Device(), theHardwarePackage.getDevice(), null, "device", null, 1, 1, DeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceAssignment_Location(), theAnatomyPackage.getLocation(), null, "location", null, 0, 1, DeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceAssignment_Capability(), theCapabilitiesPackage.getDeviceCapability(), null, "capability", null, 1, 1, DeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionAssignmentSegmentEClass, ConnectionAssignmentSegment.class, "ConnectionAssignmentSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionAssignmentSegment_Capability(), theCapabilitiesPackage.getConnectionCapability(), null, "capability", null, 1, 1, ConnectionAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionAssignmentSegment_Location(), theAnatomyPackage.getLocation(), null, "location", null, 0, 1, ConnectionAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionAssignmentSegment_Duct(), theAnatomyPackage.getDuct(), null, "duct", null, 0, 1, ConnectionAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subDeviceAssignmentEClass, SubDeviceAssignment.class, "SubDeviceAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubDeviceAssignment_Capability(), theCapabilitiesPackage.getSubDeviceCapability(), null, "capability", null, 1, 1, SubDeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubDeviceAssignment_SubDevice(), theHardwarePackage.getDevice(), null, "subDevice", null, 1, 1, SubDeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubDeviceAssignment_TargetDevice(), theHardwarePackage.getDevice(), null, "targetDevice", null, 1, 1, SubDeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supmappingEClass, Supmapping.class, "Supmapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //MappingPackageImpl
