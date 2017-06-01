/**
 */
package de.oaam.model.oaam.capabilities.impl;

import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.anatomy.AnatomyPackage;

import de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl;

import de.oaam.model.oaam.capabilities.Capabilities;
import de.oaam.model.oaam.capabilities.CapabilitiesContainerA;
import de.oaam.model.oaam.capabilities.CapabilitiesFactory;
import de.oaam.model.oaam.capabilities.CapabilitiesPackage;
import de.oaam.model.oaam.capabilities.CapabilityA;
import de.oaam.model.oaam.capabilities.ConnectionCapability;
import de.oaam.model.oaam.capabilities.DeviceCapability;
import de.oaam.model.oaam.capabilities.ResourceConsumption;
import de.oaam.model.oaam.capabilities.SignalCapability;
import de.oaam.model.oaam.capabilities.SubDeviceCapability;
import de.oaam.model.oaam.capabilities.Subcapability;
import de.oaam.model.oaam.capabilities.TaskCapability;

import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.common.impl.CommonPackageImpl;

import de.oaam.model.oaam.functions.FunctionsPackage;

import de.oaam.model.oaam.functions.impl.FunctionsPackageImpl;

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
public class CapabilitiesPackageImpl extends EPackageImpl implements CapabilitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilitiesContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subDeviceCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subcapabilityEClass = null;

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
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapabilitiesPackageImpl() {
		super(eNS_URI, CapabilitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CapabilitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CapabilitiesPackage init() {
		if (isInited) return (CapabilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI);

		// Obtain or create and register package
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CapabilitiesPackageImpl());

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
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);

		// Create package meta-data objects
		theCapabilitiesPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theSystemsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theAnatomyPackage.createPackageContents();
		theRestrictionsPackage.createPackageContents();
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theCapabilitiesPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theSystemsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theAnatomyPackage.initializePackageContents();
		theRestrictionsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCapabilitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CapabilitiesPackage.eNS_URI, theCapabilitiesPackage);
		return theCapabilitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityA() {
		return capabilityAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityA_ResourceConsumptions() {
		return (EReference)capabilityAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilitiesContainerA() {
		return capabilitiesContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_FunctionCapabilties() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_SignalCapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_DeviceCapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_SubDeviceCapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_ConnectionCapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_Subcapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskCapability() {
		return taskCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskCapability_TaskType() {
		return (EReference)taskCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskCapability_DeviceType() {
		return (EReference)taskCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskCapability_WorstCaseExecutionTime() {
		return (EAttribute)taskCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskCapability_FailureProbability() {
		return (EAttribute)taskCapabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceCapability() {
		return deviceCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceCapability_DeviceType() {
		return (EReference)deviceCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceCapability_LocationType() {
		return (EReference)deviceCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionCapability() {
		return connectionCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionCapability_ConnectionType() {
		return (EReference)connectionCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionCapability_LocationType() {
		return (EReference)connectionCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionCapability_DuctType() {
		return (EReference)connectionCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalCapability() {
		return signalCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalCapability_SignalType() {
		return (EReference)signalCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalCapability_DeviceType() {
		return (EReference)signalCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalCapability_ConnectionType() {
		return (EReference)signalCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubDeviceCapability() {
		return subDeviceCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDeviceCapability_SubDeviceType() {
		return (EReference)subDeviceCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDeviceCapability_TargetDeviceType() {
		return (EReference)subDeviceCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceConsumption() {
		return resourceConsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceConsumption_Count() {
		return (EAttribute)resourceConsumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConsumption_OriginalResource() {
		return (EReference)resourceConsumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConsumption_Type() {
		return (EReference)resourceConsumptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilities() {
		return capabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubcapability() {
		return subcapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesFactory getCapabilitiesFactory() {
		return (CapabilitiesFactory)getEFactoryInstance();
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
		capabilityAEClass = createEClass(CAPABILITY_A);
		createEReference(capabilityAEClass, CAPABILITY_A__RESOURCE_CONSUMPTIONS);

		capabilitiesContainerAEClass = createEClass(CAPABILITIES_CONTAINER_A);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__SUBCAPABILITIES);

		taskCapabilityEClass = createEClass(TASK_CAPABILITY);
		createEReference(taskCapabilityEClass, TASK_CAPABILITY__TASK_TYPE);
		createEReference(taskCapabilityEClass, TASK_CAPABILITY__DEVICE_TYPE);
		createEAttribute(taskCapabilityEClass, TASK_CAPABILITY__WORST_CASE_EXECUTION_TIME);
		createEAttribute(taskCapabilityEClass, TASK_CAPABILITY__FAILURE_PROBABILITY);

		deviceCapabilityEClass = createEClass(DEVICE_CAPABILITY);
		createEReference(deviceCapabilityEClass, DEVICE_CAPABILITY__DEVICE_TYPE);
		createEReference(deviceCapabilityEClass, DEVICE_CAPABILITY__LOCATION_TYPE);

		connectionCapabilityEClass = createEClass(CONNECTION_CAPABILITY);
		createEReference(connectionCapabilityEClass, CONNECTION_CAPABILITY__CONNECTION_TYPE);
		createEReference(connectionCapabilityEClass, CONNECTION_CAPABILITY__LOCATION_TYPE);
		createEReference(connectionCapabilityEClass, CONNECTION_CAPABILITY__DUCT_TYPE);

		signalCapabilityEClass = createEClass(SIGNAL_CAPABILITY);
		createEReference(signalCapabilityEClass, SIGNAL_CAPABILITY__SIGNAL_TYPE);
		createEReference(signalCapabilityEClass, SIGNAL_CAPABILITY__DEVICE_TYPE);
		createEReference(signalCapabilityEClass, SIGNAL_CAPABILITY__CONNECTION_TYPE);

		subDeviceCapabilityEClass = createEClass(SUB_DEVICE_CAPABILITY);
		createEReference(subDeviceCapabilityEClass, SUB_DEVICE_CAPABILITY__SUB_DEVICE_TYPE);
		createEReference(subDeviceCapabilityEClass, SUB_DEVICE_CAPABILITY__TARGET_DEVICE_TYPE);

		resourceConsumptionEClass = createEClass(RESOURCE_CONSUMPTION);
		createEAttribute(resourceConsumptionEClass, RESOURCE_CONSUMPTION__COUNT);
		createEReference(resourceConsumptionEClass, RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE);
		createEReference(resourceConsumptionEClass, RESOURCE_CONSUMPTION__TYPE);

		capabilitiesEClass = createEClass(CAPABILITIES);

		subcapabilityEClass = createEClass(SUBCAPABILITY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		capabilitiesContainerAEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		taskCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		taskCapabilityEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		taskCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		taskCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		deviceCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		deviceCapabilityEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		deviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		deviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		connectionCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		connectionCapabilityEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		connectionCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		connectionCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		signalCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		signalCapabilityEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		signalCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		signalCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		subDeviceCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		subDeviceCapabilityEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		subDeviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());
		subDeviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		resourceConsumptionEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		capabilitiesEClass.getESuperTypes().add(this.getCapabilitiesContainerA());
		subcapabilityEClass.getESuperTypes().add(this.getCapabilitiesContainerA());
		subcapabilityEClass.getESuperTypes().add(theScenarioPackage.get_ModeDependentElementA());
		subcapabilityEClass.getESuperTypes().add(theScenarioPackage.get_VariantDependentElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(capabilityAEClass, CapabilityA.class, "CapabilityA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityA_ResourceConsumptions(), this.getResourceConsumption(), null, "resourceConsumptions", null, 0, -1, CapabilityA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilitiesContainerAEClass, CapabilitiesContainerA.class, "CapabilitiesContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilitiesContainerA_FunctionCapabilties(), this.getTaskCapability(), null, "functionCapabilties", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_SignalCapabilities(), this.getSignalCapability(), null, "signalCapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_DeviceCapabilities(), this.getDeviceCapability(), null, "deviceCapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_SubDeviceCapabilities(), this.getSubDeviceCapability(), null, "subDeviceCapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_ConnectionCapabilities(), this.getConnectionCapability(), null, "connectionCapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_Subcapabilities(), this.getSubcapability(), null, "subcapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskCapabilityEClass, TaskCapability.class, "TaskCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskCapability_TaskType(), theLibraryPackage.getTaskType(), null, "taskType", null, 1, 1, TaskCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskCapability_DeviceType(), theLibraryPackage.getDeviceType(), null, "deviceType", null, 1, 1, TaskCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCapability_WorstCaseExecutionTime(), ecorePackage.getEFloat(), "worstCaseExecutionTime", "0.0", 1, 1, TaskCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCapability_FailureProbability(), ecorePackage.getEDouble(), "failureProbability", null, 1, 1, TaskCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceCapabilityEClass, DeviceCapability.class, "DeviceCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceCapability_DeviceType(), theLibraryPackage.getDeviceType(), null, "deviceType", null, 1, 1, DeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceCapability_LocationType(), theLibraryPackage.getLocationType(), null, "locationType", null, 1, 1, DeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionCapabilityEClass, ConnectionCapability.class, "ConnectionCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionCapability_ConnectionType(), theLibraryPackage.getConnectionType(), null, "connectionType", null, 1, 1, ConnectionCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionCapability_LocationType(), theLibraryPackage.getLocationType(), null, "locationType", null, 0, 1, ConnectionCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionCapability_DuctType(), theLibraryPackage.getDuctType(), null, "ductType", null, 0, 1, ConnectionCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalCapabilityEClass, SignalCapability.class, "SignalCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalCapability_SignalType(), theLibraryPackage.getSignalType(), null, "signalType", null, 1, 1, SignalCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalCapability_DeviceType(), theLibraryPackage.getDeviceType(), null, "deviceType", null, 0, 1, SignalCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalCapability_ConnectionType(), theLibraryPackage.getConnectionType(), null, "connectionType", null, 0, 1, SignalCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subDeviceCapabilityEClass, SubDeviceCapability.class, "SubDeviceCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubDeviceCapability_SubDeviceType(), theLibraryPackage.getDeviceType(), null, "subDeviceType", null, 1, 1, SubDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubDeviceCapability_TargetDeviceType(), theLibraryPackage.getDeviceType(), null, "targetDeviceType", null, 1, 1, SubDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceConsumptionEClass, ResourceConsumption.class, "ResourceConsumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceConsumption_Count(), ecorePackage.getEDouble(), "count", null, 1, 1, ResourceConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConsumption_OriginalResource(), theLibraryPackage.getResource(), null, "originalResource", null, 0, -1, ResourceConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConsumption_Type(), theLibraryPackage.getResourceType(), null, "type", null, 1, 1, ResourceConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilitiesEClass, Capabilities.class, "Capabilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subcapabilityEClass, Subcapability.class, "Subcapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //CapabilitiesPackageImpl
