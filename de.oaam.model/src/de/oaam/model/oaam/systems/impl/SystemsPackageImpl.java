/**
 */
package de.oaam.model.oaam.systems.impl;

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

import de.oaam.model.oaam.mapping.MappingPackage;

import de.oaam.model.oaam.mapping.impl.MappingPackageImpl;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl;

import de.oaam.model.oaam.scenario.ScenarioPackage;

import de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl;

import de.oaam.model.oaam.systems.ElectricPower;
import de.oaam.model.oaam.systems.HydraulicPower;
import de.oaam.model.oaam.systems.Information;
import de.oaam.model.oaam.systems.InformationFlow;
import de.oaam.model.oaam.systems.InputSegregation;
import de.oaam.model.oaam.systems.LinearPower;
import de.oaam.model.oaam.systems.Power;
import de.oaam.model.oaam.systems.ProvidedOutputA;
import de.oaam.model.oaam.systems.RequiredInputA;
import de.oaam.model.oaam.systems.RotaryPower;
import de.oaam.model.oaam.systems.Subsystem;
import de.oaam.model.oaam.systems.Systems;
import de.oaam.model.oaam.systems.SystemsContainerA;
import de.oaam.model.oaam.systems.SystemsFactory;
import de.oaam.model.oaam.systems.SystemsPackage;

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
public class SystemsPackageImpl extends EPackageImpl implements SystemsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemsContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInputAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedOutputAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricPowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydraulicPowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotaryPowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearPowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputSegregationEClass = null;

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
	 * @see de.oaam.model.oaam.systems.SystemsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemsPackageImpl() {
		super(eNS_URI, SystemsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemsPackage init() {
		if (isInited) return (SystemsPackage)EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI);

		// Obtain or create and register package
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SystemsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SystemsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) instanceof OaamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) : OaamPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) instanceof AnatomyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) : AnatomyPackage.eINSTANCE);
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) : CapabilitiesPackage.eINSTANCE);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemsPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theAnatomyPackage.createPackageContents();
		theCapabilitiesPackage.createPackageContents();
		theRestrictionsPackage.createPackageContents();
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theSystemsPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theAnatomyPackage.initializePackageContents();
		theCapabilitiesPackage.initializePackageContents();
		theRestrictionsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemsPackage.eNS_URI, theSystemsPackage);
		return theSystemsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemsContainerA() {
		return systemsContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemsContainerA_Systems() {
		return (EReference)systemsContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemsContainerA_InformationFlows() {
		return (EReference)systemsContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemsContainerA_InputSegregations() {
		return (EReference)systemsContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemsContainerA_Subsystems() {
		return (EReference)systemsContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystems() {
		return systemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsystem() {
		return subsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ProvidedOutputs() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_RequiredInputs() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredInputA() {
		return requiredInputAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedOutputA() {
		return providedOutputAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Rate() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Latency() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Accuracy() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Resolution() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Unit() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlow() {
		return informationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_From() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_To() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricPower() {
		return electricPowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricPower_Frequency() {
		return (EAttribute)electricPowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricPower_NPhases() {
		return (EAttribute)electricPowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricPower_Voltage() {
		return (EAttribute)electricPowerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricPower_Current() {
		return (EAttribute)electricPowerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPower() {
		return powerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPower_Power() {
		return (EAttribute)powerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHydraulicPower() {
		return hydraulicPowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHydraulicPower_Pressure() {
		return (EAttribute)hydraulicPowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHydraulicPower_MassFlowRate() {
		return (EAttribute)hydraulicPowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotaryPower() {
		return rotaryPowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryPower_Momentum() {
		return (EAttribute)rotaryPowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryPower_AngularVelocity() {
		return (EAttribute)rotaryPowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearPower() {
		return linearPowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearPower_Force() {
		return (EAttribute)linearPowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearPower_Velocity() {
		return (EAttribute)linearPowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputSegregation() {
		return inputSegregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSegregation_DissimilarSource() {
		return (EAttribute)inputSegregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSegregation_DissimilarRoute() {
		return (EAttribute)inputSegregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSegregation_DissimilarTechnology() {
		return (EAttribute)inputSegregationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSegregation_GroupA() {
		return (EReference)inputSegregationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSegregation_GroupB() {
		return (EReference)inputSegregationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemsFactory getSystemsFactory() {
		return (SystemsFactory)getEFactoryInstance();
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
		systemsContainerAEClass = createEClass(SYSTEMS_CONTAINER_A);
		createEReference(systemsContainerAEClass, SYSTEMS_CONTAINER_A__SYSTEMS);
		createEReference(systemsContainerAEClass, SYSTEMS_CONTAINER_A__INFORMATION_FLOWS);
		createEReference(systemsContainerAEClass, SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS);
		createEReference(systemsContainerAEClass, SYSTEMS_CONTAINER_A__SUBSYSTEMS);

		systemsEClass = createEClass(SYSTEMS);

		subsystemEClass = createEClass(SUBSYSTEM);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__PROVIDED_OUTPUTS);
		createEReference(systemEClass, SYSTEM__REQUIRED_INPUTS);

		requiredInputAEClass = createEClass(REQUIRED_INPUT_A);

		providedOutputAEClass = createEClass(PROVIDED_OUTPUT_A);

		informationEClass = createEClass(INFORMATION);
		createEAttribute(informationEClass, INFORMATION__RATE);
		createEAttribute(informationEClass, INFORMATION__LATENCY);
		createEAttribute(informationEClass, INFORMATION__ACCURACY);
		createEAttribute(informationEClass, INFORMATION__RESOLUTION);
		createEAttribute(informationEClass, INFORMATION__UNIT);

		informationFlowEClass = createEClass(INFORMATION_FLOW);
		createEReference(informationFlowEClass, INFORMATION_FLOW__FROM);
		createEReference(informationFlowEClass, INFORMATION_FLOW__TO);

		electricPowerEClass = createEClass(ELECTRIC_POWER);
		createEAttribute(electricPowerEClass, ELECTRIC_POWER__FREQUENCY);
		createEAttribute(electricPowerEClass, ELECTRIC_POWER__NPHASES);
		createEAttribute(electricPowerEClass, ELECTRIC_POWER__VOLTAGE);
		createEAttribute(electricPowerEClass, ELECTRIC_POWER__CURRENT);

		powerEClass = createEClass(POWER);
		createEAttribute(powerEClass, POWER__POWER);

		hydraulicPowerEClass = createEClass(HYDRAULIC_POWER);
		createEAttribute(hydraulicPowerEClass, HYDRAULIC_POWER__PRESSURE);
		createEAttribute(hydraulicPowerEClass, HYDRAULIC_POWER__MASS_FLOW_RATE);

		rotaryPowerEClass = createEClass(ROTARY_POWER);
		createEAttribute(rotaryPowerEClass, ROTARY_POWER__MOMENTUM);
		createEAttribute(rotaryPowerEClass, ROTARY_POWER__ANGULAR_VELOCITY);

		linearPowerEClass = createEClass(LINEAR_POWER);
		createEAttribute(linearPowerEClass, LINEAR_POWER__FORCE);
		createEAttribute(linearPowerEClass, LINEAR_POWER__VELOCITY);

		inputSegregationEClass = createEClass(INPUT_SEGREGATION);
		createEAttribute(inputSegregationEClass, INPUT_SEGREGATION__DISSIMILAR_SOURCE);
		createEAttribute(inputSegregationEClass, INPUT_SEGREGATION__DISSIMILAR_ROUTE);
		createEAttribute(inputSegregationEClass, INPUT_SEGREGATION__DISSIMILAR_TECHNOLOGY);
		createEReference(inputSegregationEClass, INPUT_SEGREGATION__GROUP_A);
		createEReference(inputSegregationEClass, INPUT_SEGREGATION__GROUP_B);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemsContainerAEClass.getESuperTypes().add(theCommonPackage.getElementA());
		systemsEClass.getESuperTypes().add(this.getSystemsContainerA());
		subsystemEClass.getESuperTypes().add(this.getSystemsContainerA());
		subsystemEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		subsystemEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		systemEClass.getESuperTypes().add(theCommonPackage.getElementA());
		systemEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		systemEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		informationEClass.getESuperTypes().add(this.getProvidedOutputA());
		informationEClass.getESuperTypes().add(this.getRequiredInputA());
		informationEClass.getESuperTypes().add(theCommonPackage.getElementA());
		informationEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		informationEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		informationFlowEClass.getESuperTypes().add(theCommonPackage.getElementA());
		informationFlowEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		informationFlowEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		electricPowerEClass.getESuperTypes().add(this.getPower());
		powerEClass.getESuperTypes().add(this.getProvidedOutputA());
		powerEClass.getESuperTypes().add(this.getRequiredInputA());
		powerEClass.getESuperTypes().add(theCommonPackage.getElementA());
		powerEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		powerEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		hydraulicPowerEClass.getESuperTypes().add(this.getPower());
		rotaryPowerEClass.getESuperTypes().add(this.getPower());
		linearPowerEClass.getESuperTypes().add(this.getPower());
		inputSegregationEClass.getESuperTypes().add(theCommonPackage.getElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemsContainerAEClass, SystemsContainerA.class, "SystemsContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemsContainerA_Systems(), this.getSystem(), null, "systems", null, 0, -1, SystemsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemsContainerA_InformationFlows(), this.getInformationFlow(), null, "informationFlows", null, 0, -1, SystemsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemsContainerA_InputSegregations(), this.getInputSegregation(), null, "inputSegregations", null, 0, -1, SystemsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemsContainerA_Subsystems(), this.getSubsystem(), null, "subsystems", null, 0, -1, SystemsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemsEClass, Systems.class, "Systems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsystemEClass, Subsystem.class, "Subsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, de.oaam.model.oaam.systems.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_ProvidedOutputs(), this.getProvidedOutputA(), null, "providedOutputs", null, 0, -1, de.oaam.model.oaam.systems.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_RequiredInputs(), this.getRequiredInputA(), null, "requiredInputs", null, 0, -1, de.oaam.model.oaam.systems.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredInputAEClass, RequiredInputA.class, "RequiredInputA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedOutputAEClass, ProvidedOutputA.class, "ProvidedOutputA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformation_Rate(), ecorePackage.getEDouble(), "rate", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformation_Latency(), ecorePackage.getEDouble(), "latency", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformation_Accuracy(), ecorePackage.getEDouble(), "accuracy", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformation_Resolution(), ecorePackage.getEDouble(), "resolution", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformation_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationFlowEClass, InformationFlow.class, "InformationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationFlow_From(), this.getProvidedOutputA(), null, "from", null, 1, 1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationFlow_To(), this.getRequiredInputA(), null, "to", null, 1, 1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electricPowerEClass, ElectricPower.class, "ElectricPower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectricPower_Frequency(), ecorePackage.getEDouble(), "frequency", null, 1, 1, ElectricPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricPower_NPhases(), ecorePackage.getEInt(), "nPhases", "1", 1, 1, ElectricPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricPower_Voltage(), ecorePackage.getEDouble(), "voltage", null, 1, 1, ElectricPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricPower_Current(), ecorePackage.getEDouble(), "current", null, 1, 1, ElectricPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerEClass, Power.class, "Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPower_Power(), ecorePackage.getEDouble(), "power", null, 1, 1, Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hydraulicPowerEClass, HydraulicPower.class, "HydraulicPower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHydraulicPower_Pressure(), ecorePackage.getEDouble(), "pressure", "0.0", 1, 1, HydraulicPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHydraulicPower_MassFlowRate(), ecorePackage.getEDouble(), "massFlowRate", null, 1, 1, HydraulicPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotaryPowerEClass, RotaryPower.class, "RotaryPower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotaryPower_Momentum(), ecorePackage.getEDouble(), "momentum", "0.0", 1, 1, RotaryPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotaryPower_AngularVelocity(), ecorePackage.getEDouble(), "angularVelocity", null, 1, 1, RotaryPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearPowerEClass, LinearPower.class, "LinearPower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearPower_Force(), ecorePackage.getEDouble(), "force", "0.0", 1, 1, LinearPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearPower_Velocity(), ecorePackage.getEDouble(), "velocity", null, 1, 1, LinearPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputSegregationEClass, InputSegregation.class, "InputSegregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputSegregation_DissimilarSource(), ecorePackage.getEBoolean(), "dissimilarSource", null, 1, 1, InputSegregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputSegregation_DissimilarRoute(), ecorePackage.getEBoolean(), "dissimilarRoute", null, 1, 1, InputSegregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputSegregation_DissimilarTechnology(), ecorePackage.getEBooleanObject(), "dissimilarTechnology", null, 1, 1, InputSegregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputSegregation_GroupA(), this.getRequiredInputA(), null, "groupA", null, 1, -1, InputSegregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputSegregation_GroupB(), this.getRequiredInputA(), null, "groupB", null, 1, -1, InputSegregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SystemsPackageImpl
