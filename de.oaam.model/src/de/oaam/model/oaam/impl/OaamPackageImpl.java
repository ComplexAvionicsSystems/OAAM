/**
 */
package de.oaam.model.oaam.impl;

import de.oaam.model.oaam.Architecture;
import de.oaam.model.oaam.OaamFactory;
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
public class OaamPackageImpl extends EPackageImpl implements OaamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureEClass = null;

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
	 * @see de.oaam.model.oaam.OaamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OaamPackageImpl() {
		super(eNS_URI, OaamFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OaamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OaamPackage init() {
		if (isInited) return (OaamPackage)EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI);

		// Obtain or create and register package
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OaamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OaamPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) instanceof SystemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) : SystemsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) instanceof AnatomyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) : AnatomyPackage.eINSTANCE);
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) : CapabilitiesPackage.eINSTANCE);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);

		// Create package meta-data objects
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
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
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
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOaamPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OaamPackage.eNS_URI, theOaamPackage);
		return theOaamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecture() {
		return architectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Include() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Library() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Scenario() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Systems() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Function() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Hardware() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Anatomy() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Capabilities() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Restrictions() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Mapping() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaamFactory getOaamFactory() {
		return (OaamFactory)getEFactoryInstance();
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
		architectureEClass = createEClass(ARCHITECTURE);
		createEReference(architectureEClass, ARCHITECTURE__INCLUDE);
		createEReference(architectureEClass, ARCHITECTURE__LIBRARY);
		createEReference(architectureEClass, ARCHITECTURE__SCENARIO);
		createEReference(architectureEClass, ARCHITECTURE__SYSTEMS);
		createEReference(architectureEClass, ARCHITECTURE__FUNCTION);
		createEReference(architectureEClass, ARCHITECTURE__HARDWARE);
		createEReference(architectureEClass, ARCHITECTURE__ANATOMY);
		createEReference(architectureEClass, ARCHITECTURE__CAPABILITIES);
		createEReference(architectureEClass, ARCHITECTURE__RESTRICTIONS);
		createEReference(architectureEClass, ARCHITECTURE__MAPPING);
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
		ScenarioPackage theScenarioPackage = (ScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI);
		SystemsPackage theSystemsPackage = (SystemsPackage)EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI);
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		HardwarePackage theHardwarePackage = (HardwarePackage)EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI);
		AnatomyPackage theAnatomyPackage = (AnatomyPackage)EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI);
		CapabilitiesPackage theCapabilitiesPackage = (CapabilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI);
		RestrictionsPackage theRestrictionsPackage = (RestrictionsPackage)EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI);
		MappingPackage theMappingPackage = (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCommonPackage);
		getESubpackages().add(theLibraryPackage);
		getESubpackages().add(theScenarioPackage);
		getESubpackages().add(theSystemsPackage);
		getESubpackages().add(theFunctionsPackage);
		getESubpackages().add(theHardwarePackage);
		getESubpackages().add(theAnatomyPackage);
		getESubpackages().add(theCapabilitiesPackage);
		getESubpackages().add(theRestrictionsPackage);
		getESubpackages().add(theMappingPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		architectureEClass.getESuperTypes().add(theCommonPackage.getElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(architectureEClass, Architecture.class, "Architecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitecture_Include(), this.getArchitecture(), null, "include", null, 0, -1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Library(), theLibraryPackage.getLibrary(), null, "library", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Scenario(), theScenarioPackage.getScenario(), null, "scenario", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Systems(), theSystemsPackage.getSystems(), null, "systems", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Function(), theFunctionsPackage.getFunctions(), null, "function", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Hardware(), theHardwarePackage.getHardware(), null, "hardware", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Anatomy(), theAnatomyPackage.getAnatomy(), null, "anatomy", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Capabilities(), theCapabilitiesPackage.getCapabilities(), null, "capabilities", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Restrictions(), theRestrictionsPackage.getRestrictions(), null, "restrictions", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Mapping(), theMappingPackage.getMapping(), null, "mapping", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OaamPackageImpl
