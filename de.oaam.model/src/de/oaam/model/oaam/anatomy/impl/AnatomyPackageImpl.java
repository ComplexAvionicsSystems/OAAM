/**
 */
package de.oaam.model.oaam.anatomy.impl;

import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl;
import de.oaam.model.oaam.anatomy.Anatomy;
import de.oaam.model.oaam.anatomy.AnatomyContainerA;
import de.oaam.model.oaam.anatomy.AnatomyFactory;
import de.oaam.model.oaam.anatomy.AnatomyPackage;
import de.oaam.model.oaam.anatomy.Area;
import de.oaam.model.oaam.anatomy.AreaSymmetry;
import de.oaam.model.oaam.anatomy.Duct;
import de.oaam.model.oaam.anatomy.DuctOpening;
import de.oaam.model.oaam.anatomy.Location;
import de.oaam.model.oaam.anatomy.LocationSymmetry;
import de.oaam.model.oaam.anatomy.Position3D;
import de.oaam.model.oaam.anatomy.Subanatomy;

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
public class AnatomyPackageImpl extends EPackageImpl implements AnatomyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anatomyContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ductOpeningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass position3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationSymmetryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaSymmetryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anatomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subanatomyEClass = null;

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
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnatomyPackageImpl() {
		super(eNS_URI, AnatomyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnatomyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnatomyPackage init() {
		if (isInited) return (AnatomyPackage)EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI);

		// Obtain or create and register package
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnatomyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnatomyPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) instanceof OaamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) : OaamPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) instanceof SystemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) : SystemsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) : CapabilitiesPackage.eINSTANCE);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) instanceof AllocationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) : AllocationsPackage.eINSTANCE);

		// Create package meta-data objects
		theAnatomyPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theSystemsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theCapabilitiesPackage.createPackageContents();
		theRestrictionsPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();

		// Initialize created meta-data
		theAnatomyPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theSystemsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theCapabilitiesPackage.initializePackageContents();
		theRestrictionsPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnatomyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnatomyPackage.eNS_URI, theAnatomyPackage);
		return theAnatomyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnatomyContainerA() {
		return anatomyContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnatomyContainerA_Locations() {
		return (EReference)anatomyContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnatomyContainerA_LocationSymmetries() {
		return (EReference)anatomyContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnatomyContainerA_Ducts() {
		return (EReference)anatomyContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnatomyContainerA_Areas() {
		return (EReference)anatomyContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnatomyContainerA_Subanatomies() {
		return (EReference)anatomyContainerAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnatomyContainerA_AreaSymmetries() {
		return (EReference)anatomyContainerAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Type() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Position() {
		return (EReference)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_DuctOpenings() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Length() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Locations() {
		return (EReference)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Ducts() {
		return (EReference)areaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuct() {
		return ductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuct_Length() {
		return (EAttribute)ductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuct_Type() {
		return (EReference)ductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuct_StartingPoint() {
		return (EReference)ductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuct_EndPoint() {
		return (EReference)ductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuctOpening() {
		return ductOpeningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuctOpening_RelativPosition() {
		return (EReference)ductOpeningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuctOpening_Declaration() {
		return (EReference)ductOpeningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition3D() {
		return position3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition3D_X() {
		return (EAttribute)position3DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition3D_Y() {
		return (EAttribute)position3DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition3D_Z() {
		return (EAttribute)position3DEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationSymmetry() {
		return locationSymmetryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationSymmetry_Locations() {
		return (EReference)locationSymmetryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaSymmetry() {
		return areaSymmetryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaSymmetry_Areas() {
		return (EReference)areaSymmetryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnatomy() {
		return anatomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubanatomy() {
		return subanatomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnatomyFactory getAnatomyFactory() {
		return (AnatomyFactory)getEFactoryInstance();
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
		anatomyContainerAEClass = createEClass(ANATOMY_CONTAINER_A);
		createEReference(anatomyContainerAEClass, ANATOMY_CONTAINER_A__LOCATIONS);
		createEReference(anatomyContainerAEClass, ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES);
		createEReference(anatomyContainerAEClass, ANATOMY_CONTAINER_A__DUCTS);
		createEReference(anatomyContainerAEClass, ANATOMY_CONTAINER_A__AREAS);
		createEReference(anatomyContainerAEClass, ANATOMY_CONTAINER_A__SUBANATOMIES);
		createEReference(anatomyContainerAEClass, ANATOMY_CONTAINER_A__AREA_SYMMETRIES);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__TYPE);
		createEReference(locationEClass, LOCATION__POSITION);
		createEReference(locationEClass, LOCATION__DUCT_OPENINGS);
		createEAttribute(locationEClass, LOCATION__LENGTH);

		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__LOCATIONS);
		createEReference(areaEClass, AREA__DUCTS);

		ductEClass = createEClass(DUCT);
		createEAttribute(ductEClass, DUCT__LENGTH);
		createEReference(ductEClass, DUCT__TYPE);
		createEReference(ductEClass, DUCT__STARTING_POINT);
		createEReference(ductEClass, DUCT__END_POINT);

		ductOpeningEClass = createEClass(DUCT_OPENING);
		createEReference(ductOpeningEClass, DUCT_OPENING__RELATIV_POSITION);
		createEReference(ductOpeningEClass, DUCT_OPENING__DECLARATION);

		position3DEClass = createEClass(POSITION3_D);
		createEAttribute(position3DEClass, POSITION3_D__X);
		createEAttribute(position3DEClass, POSITION3_D__Y);
		createEAttribute(position3DEClass, POSITION3_D__Z);

		locationSymmetryEClass = createEClass(LOCATION_SYMMETRY);
		createEReference(locationSymmetryEClass, LOCATION_SYMMETRY__LOCATIONS);

		areaSymmetryEClass = createEClass(AREA_SYMMETRY);
		createEReference(areaSymmetryEClass, AREA_SYMMETRY__AREAS);

		subanatomyEClass = createEClass(SUBANATOMY);

		anatomyEClass = createEClass(ANATOMY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		anatomyContainerAEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		locationEClass.getESuperTypes().add(theLibraryPackage.getResourceProviderInstanceA());
		locationEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		locationEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		locationEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		areaEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		areaEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		areaEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		ductEClass.getESuperTypes().add(theLibraryPackage.getResourceProviderInstanceA());
		ductEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		ductEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		ductEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		ductOpeningEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		ductOpeningEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		ductOpeningEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		position3DEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		position3DEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		position3DEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		locationSymmetryEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		locationSymmetryEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		locationSymmetryEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		areaSymmetryEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		areaSymmetryEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		areaSymmetryEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		subanatomyEClass.getESuperTypes().add(this.getAnatomyContainerA());
		subanatomyEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		subanatomyEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		anatomyEClass.getESuperTypes().add(this.getAnatomyContainerA());

		// Initialize classes, features, and operations; add parameters
		initEClass(anatomyContainerAEClass, AnatomyContainerA.class, "AnatomyContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnatomyContainerA_Locations(), this.getLocation(), null, "locations", null, 0, -1, AnatomyContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnatomyContainerA_LocationSymmetries(), this.getLocationSymmetry(), null, "locationSymmetries", null, 0, -1, AnatomyContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnatomyContainerA_Ducts(), this.getDuct(), null, "ducts", null, 0, -1, AnatomyContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnatomyContainerA_Areas(), this.getArea(), null, "areas", null, 0, -1, AnatomyContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnatomyContainerA_Subanatomies(), this.getSubanatomy(), null, "subanatomies", null, 0, -1, AnatomyContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnatomyContainerA_AreaSymmetries(), this.getAreaSymmetry(), null, "areaSymmetries", null, 0, -1, AnatomyContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Type(), theLibraryPackage.getLocationType(), null, "type", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Position(), this.getPosition3D(), null, "position", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_DuctOpenings(), this.getDuctOpening(), null, "ductOpenings", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Length(), ecorePackage.getEDouble(), "length", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_Locations(), this.getLocation(), null, "locations", null, 0, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArea_Ducts(), this.getDuct(), null, "ducts", null, 0, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ductEClass, Duct.class, "Duct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuct_Length(), ecorePackage.getEDouble(), "length", null, 1, 1, Duct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDuct_Type(), theLibraryPackage.getDuctType(), null, "type", null, 1, 1, Duct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDuct_StartingPoint(), this.getDuctOpening(), null, "startingPoint", null, 1, 1, Duct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDuct_EndPoint(), this.getDuctOpening(), null, "endPoint", null, 1, 1, Duct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ductOpeningEClass, DuctOpening.class, "DuctOpening", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDuctOpening_RelativPosition(), this.getPosition3D(), null, "relativPosition", null, 0, 1, DuctOpening.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDuctOpening_Declaration(), theLibraryPackage.getDuctOpeningDeclaration(), null, "declaration", null, 1, 1, DuctOpening.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(position3DEClass, Position3D.class, "Position3D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition3D_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Position3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition3D_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Position3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition3D_Z(), ecorePackage.getEDouble(), "z", null, 1, 1, Position3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationSymmetryEClass, LocationSymmetry.class, "LocationSymmetry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationSymmetry_Locations(), this.getLocation(), null, "locations", null, 0, -1, LocationSymmetry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaSymmetryEClass, AreaSymmetry.class, "AreaSymmetry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAreaSymmetry_Areas(), this.getArea(), null, "areas", null, 0, -1, AreaSymmetry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subanatomyEClass, Subanatomy.class, "Subanatomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anatomyEClass, Anatomy.class, "Anatomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AnatomyPackageImpl
