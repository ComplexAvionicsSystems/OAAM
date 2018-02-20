/**
 */
package de.oaam.model.oaam.restrictions.impl;

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

import de.oaam.model.oaam.restrictions.AreaRestriction;
import de.oaam.model.oaam.restrictions.ConectionTypeRestriction;
import de.oaam.model.oaam.restrictions.ConnectionRestriction;
import de.oaam.model.oaam.restrictions.ConnectionRestrinctionA;
import de.oaam.model.oaam.restrictions.DeviceRestriction;
import de.oaam.model.oaam.restrictions.DeviceRestrictionA;
import de.oaam.model.oaam.restrictions.DeviceTypeRestriction;
import de.oaam.model.oaam.restrictions.LocationRestriction;
import de.oaam.model.oaam.restrictions.PowerSourceRestriction;
import de.oaam.model.oaam.restrictions.Restrictions;
import de.oaam.model.oaam.restrictions.RestrictionsContainerA;
import de.oaam.model.oaam.restrictions.RestrictionsFactory;
import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.SegregationRestriction;
import de.oaam.model.oaam.restrictions.SignalRestrictionA;
import de.oaam.model.oaam.restrictions.SubFunctionRestrictionA;
import de.oaam.model.oaam.restrictions.Subrestrictions;
import de.oaam.model.oaam.restrictions.SymmetryTypesE;
import de.oaam.model.oaam.restrictions.SynchronicityRestriction;
import de.oaam.model.oaam.restrictions.TaskAtomicRestriction;
import de.oaam.model.oaam.restrictions.TaskGroupRestrictionA;
import de.oaam.model.oaam.restrictions.TaskRestrictionA;
import de.oaam.model.oaam.restrictions.TaskSymmetryRestriction;

import de.oaam.model.oaam.restrictions.TimeDelayRestriction;
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
public class RestrictionsPackageImpl extends EPackageImpl implements RestrictionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionsContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrestrictionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceRestrictionAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionRestrinctionAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRestrictionAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalRestrictionAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subFunctionRestrictionAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskGroupRestrictionAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSourceRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conectionTypeRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segregationRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronicityRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskAtomicRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskSymmetryRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeDelayRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum symmetryTypesEEEnum = null;

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
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestrictionsPackageImpl() {
		super(eNS_URI, RestrictionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RestrictionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestrictionsPackage init() {
		if (isInited) return (RestrictionsPackage)EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI);

		// Obtain or create and register package
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestrictionsPackageImpl());

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
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);

		// Create package meta-data objects
		theRestrictionsPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theSystemsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theAnatomyPackage.createPackageContents();
		theCapabilitiesPackage.createPackageContents();
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theRestrictionsPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theSystemsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theAnatomyPackage.initializePackageContents();
		theCapabilitiesPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestrictionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestrictionsPackage.eNS_URI, theRestrictionsPackage);
		return theRestrictionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionsContainerA() {
		return restrictionsContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_DeviceTypeRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_DeviceRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_LocationRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_AreaRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_PowerSourceRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_TaskAtomicRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_TaskSymmetryRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_InputSynchronicityRestriction() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_ConnectionRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_ConnectionTypeRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_SegregationsRestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_Subrestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsContainerA_Timedelayrestrictions() {
		return (EReference)restrictionsContainerAEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictions() {
		return restrictionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrestrictions() {
		return subrestrictionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceRestrictionA() {
		return deviceRestrictionAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceRestrictionA_Devices() {
		return (EReference)deviceRestrictionAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionRestrinctionA() {
		return connectionRestrinctionAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionRestrinctionA_Connections() {
		return (EReference)connectionRestrinctionAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRestrictionA() {
		return taskRestrictionAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRestrictionA_Tasks() {
		return (EReference)taskRestrictionAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalRestrictionA() {
		return signalRestrictionAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalRestrictionA_Signals() {
		return (EReference)signalRestrictionAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubFunctionRestrictionA() {
		return subFunctionRestrictionAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubFunctionRestrictionA_SubFunctions() {
		return (EReference)subFunctionRestrictionAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskGroupRestrictionA() {
		return taskGroupRestrictionAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskGroupRestrictionA_TaskGroups() {
		return (EReference)taskGroupRestrictionAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationRestriction() {
		return locationRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationRestriction_LocationName() {
		return (EAttribute)locationRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationRestriction_IsForbidden() {
		return (EAttribute)locationRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationRestriction_Locations() {
		return (EReference)locationRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaRestriction() {
		return areaRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRestriction_AreaName() {
		return (EAttribute)areaRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRestriction_IsForbidden() {
		return (EAttribute)areaRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaRestriction_Areas() {
		return (EReference)areaRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSourceRestriction() {
		return powerSourceRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerSourceRestriction_PowerSourceName() {
		return (EAttribute)powerSourceRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerSourceRestriction_IsForbidden() {
		return (EAttribute)powerSourceRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSourceRestriction_PowerSources() {
		return (EReference)powerSourceRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceRestriction() {
		return deviceRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRestriction_DeviceName() {
		return (EAttribute)deviceRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRestriction_IsForbidden() {
		return (EAttribute)deviceRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceRestriction_Devices() {
		return (EReference)deviceRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceTypeRestriction() {
		return deviceTypeRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceTypeRestriction_DeviceTypeName() {
		return (EAttribute)deviceTypeRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceTypeRestriction_IsForbidden() {
		return (EAttribute)deviceTypeRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceTypeRestriction_DeviceTypes() {
		return (EReference)deviceTypeRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConectionTypeRestriction() {
		return conectionTypeRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConectionTypeRestriction_ConnectionTypeName() {
		return (EAttribute)conectionTypeRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConectionTypeRestriction_IsForbidden() {
		return (EAttribute)conectionTypeRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConectionTypeRestriction_ConnectionTypes() {
		return (EReference)conectionTypeRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionRestriction() {
		return connectionRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionRestriction_ConnectionName() {
		return (EAttribute)connectionRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionRestriction_IsForbidden() {
		return (EAttribute)connectionRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionRestriction_Connections() {
		return (EReference)connectionRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegregationRestriction() {
		return segregationRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_TasksA() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_TasksB() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegregationRestriction_DissimilarTechnology() {
		return (EAttribute)segregationRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegregationRestriction_DissimilarLocation() {
		return (EAttribute)segregationRestrictionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_SubFunctionsA() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_SubFunctionsB() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegregationRestriction_DissimilarArea() {
		return (EAttribute)segregationRestrictionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegregationRestriction_DissimilarPowerSource() {
		return (EAttribute)segregationRestrictionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_SignalsA() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_SignalsB() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_TaskGroupsA() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_TaskGroupsB() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_SignalGroupsB() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_SignalGroupsA() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_DevicesA() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_DevicesB() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_ConnectionsA() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegregationRestriction_ConnectionsB() {
		return (EReference)segregationRestrictionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronicityRestriction() {
		return synchronicityRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronicityRestriction_MaxJitter() {
		return (EAttribute)synchronicityRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskAtomicRestriction() {
		return taskAtomicRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskSymmetryRestriction() {
		return taskSymmetryRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskSymmetryRestriction_Type() {
		return (EAttribute)taskSymmetryRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeDelayRestriction() {
		return timeDelayRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeDelayRestriction_Delay() {
		return (EAttribute)timeDelayRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeDelayRestriction_StartTask() {
		return (EReference)timeDelayRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeDelayRestriction_EndTask() {
		return (EReference)timeDelayRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSymmetryTypesE() {
		return symmetryTypesEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsFactory getRestrictionsFactory() {
		return (RestrictionsFactory)getEFactoryInstance();
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
		restrictionsContainerAEClass = createEClass(RESTRICTIONS_CONTAINER_A);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS);
		createEReference(restrictionsContainerAEClass, RESTRICTIONS_CONTAINER_A__TIMEDELAYRESTRICTIONS);

		restrictionsEClass = createEClass(RESTRICTIONS);

		deviceRestrictionAEClass = createEClass(DEVICE_RESTRICTION_A);
		createEReference(deviceRestrictionAEClass, DEVICE_RESTRICTION_A__DEVICES);

		connectionRestrinctionAEClass = createEClass(CONNECTION_RESTRINCTION_A);
		createEReference(connectionRestrinctionAEClass, CONNECTION_RESTRINCTION_A__CONNECTIONS);

		taskRestrictionAEClass = createEClass(TASK_RESTRICTION_A);
		createEReference(taskRestrictionAEClass, TASK_RESTRICTION_A__TASKS);

		signalRestrictionAEClass = createEClass(SIGNAL_RESTRICTION_A);
		createEReference(signalRestrictionAEClass, SIGNAL_RESTRICTION_A__SIGNALS);

		subFunctionRestrictionAEClass = createEClass(SUB_FUNCTION_RESTRICTION_A);
		createEReference(subFunctionRestrictionAEClass, SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS);

		taskGroupRestrictionAEClass = createEClass(TASK_GROUP_RESTRICTION_A);
		createEReference(taskGroupRestrictionAEClass, TASK_GROUP_RESTRICTION_A__TASK_GROUPS);

		locationRestrictionEClass = createEClass(LOCATION_RESTRICTION);
		createEAttribute(locationRestrictionEClass, LOCATION_RESTRICTION__LOCATION_NAME);
		createEAttribute(locationRestrictionEClass, LOCATION_RESTRICTION__IS_FORBIDDEN);
		createEReference(locationRestrictionEClass, LOCATION_RESTRICTION__LOCATIONS);

		areaRestrictionEClass = createEClass(AREA_RESTRICTION);
		createEAttribute(areaRestrictionEClass, AREA_RESTRICTION__AREA_NAME);
		createEAttribute(areaRestrictionEClass, AREA_RESTRICTION__IS_FORBIDDEN);
		createEReference(areaRestrictionEClass, AREA_RESTRICTION__AREAS);

		powerSourceRestrictionEClass = createEClass(POWER_SOURCE_RESTRICTION);
		createEAttribute(powerSourceRestrictionEClass, POWER_SOURCE_RESTRICTION__POWER_SOURCE_NAME);
		createEAttribute(powerSourceRestrictionEClass, POWER_SOURCE_RESTRICTION__IS_FORBIDDEN);
		createEReference(powerSourceRestrictionEClass, POWER_SOURCE_RESTRICTION__POWER_SOURCES);

		deviceRestrictionEClass = createEClass(DEVICE_RESTRICTION);
		createEAttribute(deviceRestrictionEClass, DEVICE_RESTRICTION__DEVICE_NAME);
		createEAttribute(deviceRestrictionEClass, DEVICE_RESTRICTION__IS_FORBIDDEN);
		createEReference(deviceRestrictionEClass, DEVICE_RESTRICTION__DEVICES);

		deviceTypeRestrictionEClass = createEClass(DEVICE_TYPE_RESTRICTION);
		createEAttribute(deviceTypeRestrictionEClass, DEVICE_TYPE_RESTRICTION__DEVICE_TYPE_NAME);
		createEAttribute(deviceTypeRestrictionEClass, DEVICE_TYPE_RESTRICTION__IS_FORBIDDEN);
		createEReference(deviceTypeRestrictionEClass, DEVICE_TYPE_RESTRICTION__DEVICE_TYPES);

		conectionTypeRestrictionEClass = createEClass(CONECTION_TYPE_RESTRICTION);
		createEAttribute(conectionTypeRestrictionEClass, CONECTION_TYPE_RESTRICTION__CONNECTION_TYPE_NAME);
		createEAttribute(conectionTypeRestrictionEClass, CONECTION_TYPE_RESTRICTION__IS_FORBIDDEN);
		createEReference(conectionTypeRestrictionEClass, CONECTION_TYPE_RESTRICTION__CONNECTION_TYPES);

		connectionRestrictionEClass = createEClass(CONNECTION_RESTRICTION);
		createEAttribute(connectionRestrictionEClass, CONNECTION_RESTRICTION__CONNECTION_NAME);
		createEAttribute(connectionRestrictionEClass, CONNECTION_RESTRICTION__IS_FORBIDDEN);
		createEReference(connectionRestrictionEClass, CONNECTION_RESTRICTION__CONNECTIONS);

		segregationRestrictionEClass = createEClass(SEGREGATION_RESTRICTION);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__TASKS_A);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__TASKS_B);
		createEAttribute(segregationRestrictionEClass, SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY);
		createEAttribute(segregationRestrictionEClass, SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__SUB_FUNCTIONS_A);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__SUB_FUNCTIONS_B);
		createEAttribute(segregationRestrictionEClass, SEGREGATION_RESTRICTION__DISSIMILAR_AREA);
		createEAttribute(segregationRestrictionEClass, SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__SIGNALS_A);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__SIGNALS_B);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__TASK_GROUPS_A);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__TASK_GROUPS_B);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__SIGNAL_GROUPS_B);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__SIGNAL_GROUPS_A);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__DEVICES_A);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__DEVICES_B);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__CONNECTIONS_A);
		createEReference(segregationRestrictionEClass, SEGREGATION_RESTRICTION__CONNECTIONS_B);

		synchronicityRestrictionEClass = createEClass(SYNCHRONICITY_RESTRICTION);
		createEAttribute(synchronicityRestrictionEClass, SYNCHRONICITY_RESTRICTION__MAX_JITTER);

		taskAtomicRestrictionEClass = createEClass(TASK_ATOMIC_RESTRICTION);

		taskSymmetryRestrictionEClass = createEClass(TASK_SYMMETRY_RESTRICTION);
		createEAttribute(taskSymmetryRestrictionEClass, TASK_SYMMETRY_RESTRICTION__TYPE);

		timeDelayRestrictionEClass = createEClass(TIME_DELAY_RESTRICTION);
		createEAttribute(timeDelayRestrictionEClass, TIME_DELAY_RESTRICTION__DELAY);
		createEReference(timeDelayRestrictionEClass, TIME_DELAY_RESTRICTION__START_TASK);
		createEReference(timeDelayRestrictionEClass, TIME_DELAY_RESTRICTION__END_TASK);

		subrestrictionsEClass = createEClass(SUBRESTRICTIONS);

		// Create enums
		symmetryTypesEEEnum = createEEnum(SYMMETRY_TYPES_E);
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
		HardwarePackage theHardwarePackage = (HardwarePackage)EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI);
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		ScenarioPackage theScenarioPackage = (ScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI);
		AnatomyPackage theAnatomyPackage = (AnatomyPackage)EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI);
		LibraryPackage theLibraryPackage = (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		restrictionsContainerAEClass.getESuperTypes().add(theCommonPackage.getElementA());
		restrictionsEClass.getESuperTypes().add(this.getRestrictionsContainerA());
		locationRestrictionEClass.getESuperTypes().add(this.getTaskRestrictionA());
		locationRestrictionEClass.getESuperTypes().add(this.getSignalRestrictionA());
		locationRestrictionEClass.getESuperTypes().add(this.getSubFunctionRestrictionA());
		locationRestrictionEClass.getESuperTypes().add(this.getDeviceRestrictionA());
		locationRestrictionEClass.getESuperTypes().add(this.getConnectionRestrinctionA());
		locationRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		locationRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		locationRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		areaRestrictionEClass.getESuperTypes().add(this.getTaskRestrictionA());
		areaRestrictionEClass.getESuperTypes().add(this.getSignalRestrictionA());
		areaRestrictionEClass.getESuperTypes().add(this.getSubFunctionRestrictionA());
		areaRestrictionEClass.getESuperTypes().add(this.getDeviceRestrictionA());
		areaRestrictionEClass.getESuperTypes().add(this.getConnectionRestrinctionA());
		areaRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		areaRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		areaRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		powerSourceRestrictionEClass.getESuperTypes().add(this.getTaskRestrictionA());
		powerSourceRestrictionEClass.getESuperTypes().add(this.getDeviceRestrictionA());
		powerSourceRestrictionEClass.getESuperTypes().add(this.getSignalRestrictionA());
		powerSourceRestrictionEClass.getESuperTypes().add(this.getSubFunctionRestrictionA());
		powerSourceRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		powerSourceRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		powerSourceRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		deviceRestrictionEClass.getESuperTypes().add(this.getTaskRestrictionA());
		deviceRestrictionEClass.getESuperTypes().add(this.getSignalRestrictionA());
		deviceRestrictionEClass.getESuperTypes().add(this.getSubFunctionRestrictionA());
		deviceRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		deviceRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		deviceRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		deviceTypeRestrictionEClass.getESuperTypes().add(this.getTaskRestrictionA());
		deviceTypeRestrictionEClass.getESuperTypes().add(this.getSignalRestrictionA());
		deviceTypeRestrictionEClass.getESuperTypes().add(this.getSubFunctionRestrictionA());
		deviceTypeRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		deviceTypeRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		deviceTypeRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		conectionTypeRestrictionEClass.getESuperTypes().add(this.getSignalRestrictionA());
		conectionTypeRestrictionEClass.getESuperTypes().add(this.getSubFunctionRestrictionA());
		conectionTypeRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		conectionTypeRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		conectionTypeRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		connectionRestrictionEClass.getESuperTypes().add(this.getSignalRestrictionA());
		connectionRestrictionEClass.getESuperTypes().add(this.getSubFunctionRestrictionA());
		connectionRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		connectionRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		connectionRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		segregationRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		segregationRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		segregationRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		synchronicityRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		synchronicityRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		synchronicityRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		synchronicityRestrictionEClass.getESuperTypes().add(this.getTaskRestrictionA());
		taskAtomicRestrictionEClass.getESuperTypes().add(this.getTaskRestrictionA());
		taskAtomicRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		taskAtomicRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		taskAtomicRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		taskSymmetryRestrictionEClass.getESuperTypes().add(this.getTaskRestrictionA());
		taskSymmetryRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		taskSymmetryRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		taskSymmetryRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		timeDelayRestrictionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		timeDelayRestrictionEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		timeDelayRestrictionEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		subrestrictionsEClass.getESuperTypes().add(this.getRestrictionsContainerA());
		subrestrictionsEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		subrestrictionsEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(restrictionsContainerAEClass, RestrictionsContainerA.class, "RestrictionsContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestrictionsContainerA_DeviceTypeRestrictions(), this.getDeviceTypeRestriction(), null, "deviceTypeRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_DeviceRestrictions(), this.getDeviceRestriction(), null, "deviceRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_LocationRestrictions(), this.getLocationRestriction(), null, "locationRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_AreaRestrictions(), this.getAreaRestriction(), null, "areaRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_PowerSourceRestrictions(), this.getPowerSourceRestriction(), null, "powerSourceRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_TaskAtomicRestrictions(), this.getTaskAtomicRestriction(), null, "taskAtomicRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_TaskSymmetryRestrictions(), this.getTaskSymmetryRestriction(), null, "taskSymmetryRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_InputSynchronicityRestriction(), this.getSynchronicityRestriction(), null, "inputSynchronicityRestriction", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_ConnectionRestrictions(), this.getConnectionRestriction(), null, "connectionRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_ConnectionTypeRestrictions(), this.getConectionTypeRestriction(), null, "connectionTypeRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_SegregationsRestrictions(), this.getSegregationRestriction(), null, "segregationsRestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_Subrestrictions(), this.getSubrestrictions(), null, "subrestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionsContainerA_Timedelayrestrictions(), this.getTimeDelayRestriction(), null, "timedelayrestrictions", null, 0, -1, RestrictionsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionsEClass, Restrictions.class, "Restrictions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceRestrictionAEClass, DeviceRestrictionA.class, "DeviceRestrictionA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceRestrictionA_Devices(), theHardwarePackage.getDevice(), null, "devices", null, 0, 1, DeviceRestrictionA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionRestrinctionAEClass, ConnectionRestrinctionA.class, "ConnectionRestrinctionA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionRestrinctionA_Connections(), theHardwarePackage.getConnection(), null, "connections", null, 0, -1, ConnectionRestrinctionA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskRestrictionAEClass, TaskRestrictionA.class, "TaskRestrictionA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRestrictionA_Tasks(), theFunctionsPackage.getTask(), null, "tasks", null, 0, -1, TaskRestrictionA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalRestrictionAEClass, SignalRestrictionA.class, "SignalRestrictionA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalRestrictionA_Signals(), theFunctionsPackage.getSignal(), null, "signals", null, 0, -1, SignalRestrictionA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subFunctionRestrictionAEClass, SubFunctionRestrictionA.class, "SubFunctionRestrictionA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubFunctionRestrictionA_SubFunctions(), theFunctionsPackage.getSubfunction(), null, "subFunctions", null, 0, -1, SubFunctionRestrictionA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskGroupRestrictionAEClass, TaskGroupRestrictionA.class, "TaskGroupRestrictionA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskGroupRestrictionA_TaskGroups(), theFunctionsPackage.getTaskGroup(), null, "taskGroups", null, 0, -1, TaskGroupRestrictionA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationRestrictionEClass, LocationRestriction.class, "LocationRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationRestriction_LocationName(), ecorePackage.getEString(), "locationName", null, 0, 1, LocationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationRestriction_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", null, 1, 1, LocationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationRestriction_Locations(), theAnatomyPackage.getLocation(), null, "locations", null, 0, -1, LocationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaRestrictionEClass, AreaRestriction.class, "AreaRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAreaRestriction_AreaName(), ecorePackage.getEString(), "areaName", null, 0, 1, AreaRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaRestriction_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", null, 1, 1, AreaRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAreaRestriction_Areas(), theAnatomyPackage.getArea(), null, "areas", null, 0, -1, AreaRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerSourceRestrictionEClass, PowerSourceRestriction.class, "PowerSourceRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerSourceRestriction_PowerSourceName(), ecorePackage.getEString(), "powerSourceName", null, 0, 1, PowerSourceRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerSourceRestriction_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", null, 1, 1, PowerSourceRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerSourceRestriction_PowerSources(), theLibraryPackage.getPowerSource(), null, "powerSources", null, 0, -1, PowerSourceRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceRestrictionEClass, DeviceRestriction.class, "DeviceRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceRestriction_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, DeviceRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceRestriction_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", null, 1, 1, DeviceRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceRestriction_Devices(), theHardwarePackage.getDevice(), null, "devices", null, 0, -1, DeviceRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceTypeRestrictionEClass, DeviceTypeRestriction.class, "DeviceTypeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceTypeRestriction_DeviceTypeName(), ecorePackage.getEString(), "deviceTypeName", null, 0, 1, DeviceTypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceTypeRestriction_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", null, 1, 1, DeviceTypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceTypeRestriction_DeviceTypes(), theLibraryPackage.getDeviceType(), null, "deviceTypes", null, 0, -1, DeviceTypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conectionTypeRestrictionEClass, ConectionTypeRestriction.class, "ConectionTypeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConectionTypeRestriction_ConnectionTypeName(), ecorePackage.getEString(), "connectionTypeName", null, 0, 1, ConectionTypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConectionTypeRestriction_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", null, 1, 1, ConectionTypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConectionTypeRestriction_ConnectionTypes(), theLibraryPackage.getConnectionType(), null, "connectionTypes", null, 0, -1, ConectionTypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionRestrictionEClass, ConnectionRestriction.class, "ConnectionRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionRestriction_ConnectionName(), ecorePackage.getEString(), "connectionName", null, 0, 1, ConnectionRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionRestriction_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", null, 1, 1, ConnectionRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionRestriction_Connections(), theHardwarePackage.getConnection(), null, "connections", null, 0, -1, ConnectionRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segregationRestrictionEClass, SegregationRestriction.class, "SegregationRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSegregationRestriction_TasksA(), theLibraryPackage.getTaskType(), null, "tasksA", null, 1, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_TasksB(), theLibraryPackage.getTaskType(), null, "tasksB", null, 1, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegregationRestriction_DissimilarTechnology(), ecorePackage.getEBoolean(), "dissimilarTechnology", null, 1, 1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegregationRestriction_DissimilarLocation(), ecorePackage.getEBoolean(), "dissimilarLocation", null, 1, 1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_SubFunctionsA(), theFunctionsPackage.getFunctionsContainerA(), null, "subFunctionsA", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_SubFunctionsB(), theFunctionsPackage.getFunctionsContainerA(), null, "subFunctionsB", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegregationRestriction_DissimilarArea(), ecorePackage.getEBoolean(), "dissimilarArea", null, 1, 1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegregationRestriction_DissimilarPowerSource(), ecorePackage.getEBoolean(), "dissimilarPowerSource", null, 1, 1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_SignalsA(), theFunctionsPackage.getSignal(), null, "signalsA", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_SignalsB(), theFunctionsPackage.getSignal(), null, "signalsB", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_TaskGroupsA(), theFunctionsPackage.getTaskGroup(), null, "taskGroupsA", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_TaskGroupsB(), theFunctionsPackage.getTaskGroup(), null, "taskGroupsB", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_SignalGroupsB(), theFunctionsPackage.getSignalGroup(), null, "signalGroupsB", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_SignalGroupsA(), theFunctionsPackage.getSignalGroup(), null, "signalGroupsA", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_DevicesA(), theHardwarePackage.getDevice(), null, "devicesA", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_DevicesB(), theHardwarePackage.getDevice(), null, "devicesB", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_ConnectionsA(), theHardwarePackage.getConnection(), null, "connectionsA", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegregationRestriction_ConnectionsB(), theHardwarePackage.getConnection(), null, "connectionsB", null, 0, -1, SegregationRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronicityRestrictionEClass, SynchronicityRestriction.class, "SynchronicityRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchronicityRestriction_MaxJitter(), ecorePackage.getEFloat(), "maxJitter", "0.001", 1, 1, SynchronicityRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskAtomicRestrictionEClass, TaskAtomicRestriction.class, "TaskAtomicRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskSymmetryRestrictionEClass, TaskSymmetryRestriction.class, "TaskSymmetryRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskSymmetryRestriction_Type(), this.getSymmetryTypesE(), "type", null, 1, 1, TaskSymmetryRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeDelayRestrictionEClass, TimeDelayRestriction.class, "TimeDelayRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeDelayRestriction_Delay(), ecorePackage.getEFloat(), "delay", "1", 1, 1, TimeDelayRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeDelayRestriction_StartTask(), theFunctionsPackage.getTask(), null, "startTask", null, 1, 1, TimeDelayRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeDelayRestriction_EndTask(), theFunctionsPackage.getTask(), null, "endTask", null, 1, 1, TimeDelayRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subrestrictionsEClass, Subrestrictions.class, "Subrestrictions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(symmetryTypesEEEnum, SymmetryTypesE.class, "SymmetryTypesE");
		addEEnumLiteral(symmetryTypesEEEnum, SymmetryTypesE.LOCATION);
		addEEnumLiteral(symmetryTypesEEEnum, SymmetryTypesE.DEVICE);
		addEEnumLiteral(symmetryTypesEEEnum, SymmetryTypesE.AREA);
		addEEnumLiteral(symmetryTypesEEEnum, SymmetryTypesE.DEVICE_TYPE);
	}

} //RestrictionsPackageImpl
