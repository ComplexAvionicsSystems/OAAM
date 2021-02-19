/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.allocations.Allocations;
import de.oaam.model.oaam.allocations.AllocationsContainerA;
import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.ConnectionAssignment;
import de.oaam.model.oaam.allocations.ConnectionAssignmentSegment;
import de.oaam.model.oaam.allocations.DeviceAssignment;
import de.oaam.model.oaam.allocations.Message;
import de.oaam.model.oaam.allocations.MessageA;
import de.oaam.model.oaam.allocations.MessageSegment;
import de.oaam.model.oaam.allocations.Path;
import de.oaam.model.oaam.allocations.PathA;
import de.oaam.model.oaam.allocations.PathGroup;
import de.oaam.model.oaam.allocations.Schedule;
import de.oaam.model.oaam.allocations.ScheduledTime;
import de.oaam.model.oaam.allocations.Segment;
import de.oaam.model.oaam.allocations.SegmentA;
import de.oaam.model.oaam.allocations.SignalAssignment;
import de.oaam.model.oaam.allocations.SignalToMessageAssignment;
import de.oaam.model.oaam.allocations.Suballocations;
import de.oaam.model.oaam.allocations.SubconnectionAssignment;
import de.oaam.model.oaam.allocations.SubdeviceAssignment;
import de.oaam.model.oaam.allocations.Submessage;
import de.oaam.model.oaam.allocations.TaskAssignment;
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
public class AllocationsPackageImpl extends EPackageImpl implements AllocationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationsContainerAEClass = null;

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
	private EClass segmentEClass = null;

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
	private EClass subdeviceAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subconnectionAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suballocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduledTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalToMessageAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageAEClass = null;

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
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AllocationsPackageImpl() {
		super(eNS_URI, AllocationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AllocationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AllocationsPackage init() {
		if (isInited) return (AllocationsPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAllocationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AllocationsPackageImpl theAllocationsPackage = registeredAllocationsPackage instanceof AllocationsPackageImpl ? (AllocationsPackageImpl)registeredAllocationsPackage : new AllocationsPackageImpl();

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

		// Create package meta-data objects
		theAllocationsPackage.createPackageContents();
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
		theAllocationsPackage.initializePackageContents();
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
		theAllocationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AllocationsPackage.eNS_URI, theAllocationsPackage);
		return theAllocationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationsContainerA() {
		return allocationsContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_DeviceAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_SubdeviceAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_ConnectionAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_TaskAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_SignalAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_Suballocations() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_SubconnectionAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_Messages() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(7);
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
	public EReference getTaskAssignment_Schedules() {
		return (EReference)taskAssignmentEClass.getEStructuralFeatures().get(3);
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
	public EClass getSegment() {
		return segmentEClass;
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
	public EClass getSubdeviceAssignment() {
		return subdeviceAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubdeviceAssignment_Capability() {
		return (EReference)subdeviceAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubdeviceAssignment_Subdevice() {
		return (EReference)subdeviceAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubdeviceAssignment_TargetDevice() {
		return (EReference)subdeviceAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubconnectionAssignment() {
		return subconnectionAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubconnectionAssignment_Capability() {
		return (EReference)subconnectionAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubconnectionAssignment_Subconnection() {
		return (EReference)subconnectionAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubconnectionAssignment_TargetDevice() {
		return (EReference)subconnectionAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocations() {
		return allocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuballocations() {
		return suballocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegmentA() {
		return segmentAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentA_Capability() {
		return (EReference)segmentAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentA_Device() {
		return (EReference)segmentAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentA_Connection() {
		return (EReference)segmentAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentA_Schedules() {
		return (EReference)segmentAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Segments() {
		return (EReference)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Source() {
		return (EReference)pathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Destination() {
		return (EReference)pathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Message() {
		return (EReference)pathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_IsRedundantTo() {
		return (EReference)pathEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathGroup() {
		return pathGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathGroup_Subpaths() {
		return (EReference)pathGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathGroup_ChildrenRedundant() {
		return (EAttribute)pathGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathGroup_Sources() {
		return (EReference)pathGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathGroup_Destinations() {
		return (EReference)pathGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathA() {
		return pathAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Rate() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_IsPeriodic() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Priority() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_ScheduledTimes() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduledTime() {
		return scheduledTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledTime_Cycle() {
		return (EAttribute)scheduledTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledTime_StartTime() {
		return (EAttribute)scheduledTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledTime_Duration() {
		return (EAttribute)scheduledTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledTime_Restart() {
		return (EAttribute)scheduledTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Capability() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Bus() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_SourceDevices() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_DestinationDevices() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_IsRedundantTo() {
		return (EReference)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalToMessageAssignment() {
		return signalToMessageAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalToMessageAssignment_Signal() {
		return (EReference)signalToMessageAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalToMessageAssignment_Attributes() {
		return (EReference)signalToMessageAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalToMessageAssignment_Variants() {
		return (EReference)signalToMessageAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalToMessageAssignment_OperationModes() {
		return (EReference)signalToMessageAssignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalToMessageAssignment_DataType() {
		return (EReference)signalToMessageAssignmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalToMessageAssignment_Position() {
		return (EAttribute)signalToMessageAssignmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalToMessageAssignment_Capability() {
		return (EReference)signalToMessageAssignmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSegment() {
		return messageSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSegment_Capability() {
		return (EReference)messageSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSegment_Device() {
		return (EReference)messageSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSegment_Connection() {
		return (EReference)messageSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmessage() {
		return submessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmessage_Capability() {
		return (EReference)submessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmessage_Position() {
		return (EAttribute)submessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageA() {
		return messageAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageA_Schedules() {
		return (EReference)messageAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageA_Submessages() {
		return (EReference)messageAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageA_SignalToMessageAssignments() {
		return (EReference)messageAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageA_Segments() {
		return (EReference)messageAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageA_Type() {
		return (EReference)messageAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageA_IsPersistent() {
		return (EAttribute)messageAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageA_Length() {
		return (EAttribute)messageAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageA_Path() {
		return (EReference)messageAEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsFactory getAllocationsFactory() {
		return (AllocationsFactory)getEFactoryInstance();
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
		allocationsContainerAEClass = createEClass(ALLOCATIONS_CONTAINER_A);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__MESSAGES);

		taskAssignmentEClass = createEClass(TASK_ASSIGNMENT);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__CAPABILITY);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__TASK);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__DEVICE);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__SCHEDULES);

		signalAssignmentEClass = createEClass(SIGNAL_ASSIGNMENT);
		createEReference(signalAssignmentEClass, SIGNAL_ASSIGNMENT__SEGMENTS);
		createEReference(signalAssignmentEClass, SIGNAL_ASSIGNMENT__SIGNAL);

		connectionAssignmentEClass = createEClass(CONNECTION_ASSIGNMENT);
		createEReference(connectionAssignmentEClass, CONNECTION_ASSIGNMENT__SEGMENTS);
		createEReference(connectionAssignmentEClass, CONNECTION_ASSIGNMENT__CONNECTION);

		segmentEClass = createEClass(SEGMENT);

		deviceAssignmentEClass = createEClass(DEVICE_ASSIGNMENT);
		createEReference(deviceAssignmentEClass, DEVICE_ASSIGNMENT__DEVICE);
		createEReference(deviceAssignmentEClass, DEVICE_ASSIGNMENT__LOCATION);
		createEReference(deviceAssignmentEClass, DEVICE_ASSIGNMENT__CAPABILITY);

		connectionAssignmentSegmentEClass = createEClass(CONNECTION_ASSIGNMENT_SEGMENT);
		createEReference(connectionAssignmentSegmentEClass, CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY);
		createEReference(connectionAssignmentSegmentEClass, CONNECTION_ASSIGNMENT_SEGMENT__LOCATION);
		createEReference(connectionAssignmentSegmentEClass, CONNECTION_ASSIGNMENT_SEGMENT__DUCT);

		subdeviceAssignmentEClass = createEClass(SUBDEVICE_ASSIGNMENT);
		createEReference(subdeviceAssignmentEClass, SUBDEVICE_ASSIGNMENT__CAPABILITY);
		createEReference(subdeviceAssignmentEClass, SUBDEVICE_ASSIGNMENT__SUBDEVICE);
		createEReference(subdeviceAssignmentEClass, SUBDEVICE_ASSIGNMENT__TARGET_DEVICE);

		subconnectionAssignmentEClass = createEClass(SUBCONNECTION_ASSIGNMENT);
		createEReference(subconnectionAssignmentEClass, SUBCONNECTION_ASSIGNMENT__CAPABILITY);
		createEReference(subconnectionAssignmentEClass, SUBCONNECTION_ASSIGNMENT__SUBCONNECTION);
		createEReference(subconnectionAssignmentEClass, SUBCONNECTION_ASSIGNMENT__TARGET_DEVICE);

		scheduleEClass = createEClass(SCHEDULE);
		createEAttribute(scheduleEClass, SCHEDULE__RATE);
		createEAttribute(scheduleEClass, SCHEDULE__IS_PERIODIC);
		createEAttribute(scheduleEClass, SCHEDULE__PRIORITY);
		createEReference(scheduleEClass, SCHEDULE__SCHEDULED_TIMES);

		scheduledTimeEClass = createEClass(SCHEDULED_TIME);
		createEAttribute(scheduledTimeEClass, SCHEDULED_TIME__CYCLE);
		createEAttribute(scheduledTimeEClass, SCHEDULED_TIME__START_TIME);
		createEAttribute(scheduledTimeEClass, SCHEDULED_TIME__DURATION);
		createEAttribute(scheduledTimeEClass, SCHEDULED_TIME__RESTART);

		messageAEClass = createEClass(MESSAGE_A);
		createEReference(messageAEClass, MESSAGE_A__SCHEDULES);
		createEReference(messageAEClass, MESSAGE_A__SUBMESSAGES);
		createEReference(messageAEClass, MESSAGE_A__SIGNAL_TO_MESSAGE_ASSIGNMENTS);
		createEReference(messageAEClass, MESSAGE_A__SEGMENTS);
		createEReference(messageAEClass, MESSAGE_A__TYPE);
		createEAttribute(messageAEClass, MESSAGE_A__IS_PERSISTENT);
		createEAttribute(messageAEClass, MESSAGE_A__LENGTH);
		createEReference(messageAEClass, MESSAGE_A__PATH);

		messageSegmentEClass = createEClass(MESSAGE_SEGMENT);
		createEReference(messageSegmentEClass, MESSAGE_SEGMENT__CAPABILITY);
		createEReference(messageSegmentEClass, MESSAGE_SEGMENT__DEVICE);
		createEReference(messageSegmentEClass, MESSAGE_SEGMENT__CONNECTION);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__CAPABILITY);
		createEReference(messageEClass, MESSAGE__BUS);
		createEReference(messageEClass, MESSAGE__SOURCE_DEVICES);
		createEReference(messageEClass, MESSAGE__DESTINATION_DEVICES);
		createEReference(messageEClass, MESSAGE__IS_REDUNDANT_TO);

		submessageEClass = createEClass(SUBMESSAGE);
		createEReference(submessageEClass, SUBMESSAGE__CAPABILITY);
		createEAttribute(submessageEClass, SUBMESSAGE__POSITION);

		signalToMessageAssignmentEClass = createEClass(SIGNAL_TO_MESSAGE_ASSIGNMENT);
		createEReference(signalToMessageAssignmentEClass, SIGNAL_TO_MESSAGE_ASSIGNMENT__SIGNAL);
		createEReference(signalToMessageAssignmentEClass, SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES);
		createEReference(signalToMessageAssignmentEClass, SIGNAL_TO_MESSAGE_ASSIGNMENT__VARIANTS);
		createEReference(signalToMessageAssignmentEClass, SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES);
		createEReference(signalToMessageAssignmentEClass, SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE);
		createEAttribute(signalToMessageAssignmentEClass, SIGNAL_TO_MESSAGE_ASSIGNMENT__POSITION);
		createEReference(signalToMessageAssignmentEClass, SIGNAL_TO_MESSAGE_ASSIGNMENT__CAPABILITY);

		allocationsEClass = createEClass(ALLOCATIONS);

		suballocationsEClass = createEClass(SUBALLOCATIONS);

		segmentAEClass = createEClass(SEGMENT_A);
		createEReference(segmentAEClass, SEGMENT_A__CAPABILITY);
		createEReference(segmentAEClass, SEGMENT_A__DEVICE);
		createEReference(segmentAEClass, SEGMENT_A__CONNECTION);
		createEReference(segmentAEClass, SEGMENT_A__SCHEDULES);

		pathEClass = createEClass(PATH);
		createEReference(pathEClass, PATH__SEGMENTS);
		createEReference(pathEClass, PATH__SOURCE);
		createEReference(pathEClass, PATH__DESTINATION);
		createEReference(pathEClass, PATH__MESSAGE);
		createEReference(pathEClass, PATH__IS_REDUNDANT_TO);

		pathGroupEClass = createEClass(PATH_GROUP);
		createEReference(pathGroupEClass, PATH_GROUP__SUBPATHS);
		createEAttribute(pathGroupEClass, PATH_GROUP__CHILDREN_REDUNDANT);
		createEReference(pathGroupEClass, PATH_GROUP__SOURCES);
		createEReference(pathGroupEClass, PATH_GROUP__DESTINATIONS);

		pathAEClass = createEClass(PATH_A);
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
		LibraryPackage theLibraryPackage = (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		allocationsContainerAEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		allocationsContainerAEClass.getESuperTypes().add(theCommonPackage.getSystemBelongingElementA());
		taskAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		taskAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		taskAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		signalAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		signalAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		signalAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		connectionAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		connectionAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		connectionAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		segmentEClass.getESuperTypes().add(this.getSegmentA());
		deviceAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		deviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		deviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		connectionAssignmentSegmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		connectionAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		connectionAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		subdeviceAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		subdeviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		subdeviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		subconnectionAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		subconnectionAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		subconnectionAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		scheduleEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		scheduleEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		scheduleEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		scheduledTimeEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		scheduledTimeEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		scheduledTimeEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		messageAEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		messageAEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		messageAEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		messageSegmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		messageSegmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		messageSegmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		messageEClass.getESuperTypes().add(this.getMessageA());
		submessageEClass.getESuperTypes().add(this.getMessageA());
		allocationsEClass.getESuperTypes().add(this.getAllocationsContainerA());
		suballocationsEClass.getESuperTypes().add(this.getAllocationsContainerA());
		suballocationsEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		suballocationsEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		segmentAEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		segmentAEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		segmentAEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		pathEClass.getESuperTypes().add(this.getPathA());
		pathGroupEClass.getESuperTypes().add(this.getPathA());
		pathAEClass.getESuperTypes().add(this.getSegmentA());

		// Initialize classes, features, and operations; add parameters
		initEClass(allocationsContainerAEClass, AllocationsContainerA.class, "AllocationsContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationsContainerA_DeviceAssignments(), this.getDeviceAssignment(), null, "deviceAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_SubdeviceAssignments(), this.getSubdeviceAssignment(), null, "subdeviceAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_ConnectionAssignments(), this.getConnectionAssignment(), null, "connectionAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_TaskAssignments(), this.getTaskAssignment(), null, "taskAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_SignalAssignments(), this.getSignalAssignment(), null, "signalAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_Suballocations(), this.getSuballocations(), null, "suballocations", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_SubconnectionAssignments(), this.getSubconnectionAssignment(), null, "subconnectionAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_Messages(), this.getMessage(), null, "messages", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskAssignmentEClass, TaskAssignment.class, "TaskAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskAssignment_Capability(), theCapabilitiesPackage.getTaskOnDeviceCapability(), null, "capability", null, 1, 1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAssignment_Task(), theFunctionsPackage.getTask(), null, "task", null, 1, 1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAssignment_Device(), theHardwarePackage.getDevice(), null, "device", null, 1, 1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAssignment_Schedules(), this.getSchedule(), null, "schedules", null, 0, -1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalAssignmentEClass, SignalAssignment.class, "SignalAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalAssignment_Segments(), this.getSegmentA(), null, "segments", null, 0, -1, SignalAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAssignment_Signal(), theFunctionsPackage.getSignal(), null, "signal", null, 1, 1, SignalAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionAssignmentEClass, ConnectionAssignment.class, "ConnectionAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionAssignment_Segments(), this.getConnectionAssignmentSegment(), null, "segments", null, 0, -1, ConnectionAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionAssignment_Connection(), theHardwarePackage.getConnection(), null, "connection", null, 1, 1, ConnectionAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceAssignmentEClass, DeviceAssignment.class, "DeviceAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceAssignment_Device(), theHardwarePackage.getDevice(), null, "device", null, 1, 1, DeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceAssignment_Location(), theAnatomyPackage.getLocation(), null, "location", null, 1, 1, DeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceAssignment_Capability(), theCapabilitiesPackage.getDeviceInLocationCapability(), null, "capability", null, 1, 1, DeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionAssignmentSegmentEClass, ConnectionAssignmentSegment.class, "ConnectionAssignmentSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionAssignmentSegment_Capability(), theCapabilitiesPackage.getConnectionInDuctOrLocationCapability(), null, "capability", null, 1, 1, ConnectionAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionAssignmentSegment_Location(), theAnatomyPackage.getLocation(), null, "location", null, 0, 1, ConnectionAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionAssignmentSegment_Duct(), theAnatomyPackage.getDuct(), null, "duct", null, 0, 1, ConnectionAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subdeviceAssignmentEClass, SubdeviceAssignment.class, "SubdeviceAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubdeviceAssignment_Capability(), theCapabilitiesPackage.getSubdeviceInDeviceCapability(), null, "capability", null, 1, 1, SubdeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceAssignment_Subdevice(), theHardwarePackage.getDevice(), null, "subdevice", null, 1, 1, SubdeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceAssignment_TargetDevice(), theHardwarePackage.getDevice(), null, "targetDevice", null, 1, 1, SubdeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subconnectionAssignmentEClass, SubconnectionAssignment.class, "SubconnectionAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubconnectionAssignment_Capability(), theCapabilitiesPackage.getSubconnectionInDeviceCapability(), null, "capability", null, 1, 1, SubconnectionAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubconnectionAssignment_Subconnection(), theHardwarePackage.getConnection(), null, "subconnection", null, 1, 1, SubconnectionAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubconnectionAssignment_TargetDevice(), theHardwarePackage.getDevice(), null, "targetDevice", null, 1, 1, SubconnectionAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedule_Rate(), ecorePackage.getEDouble(), "rate", "0.0", 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_IsPeriodic(), ecorePackage.getEBoolean(), "isPeriodic", "true", 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_Priority(), ecorePackage.getEInt(), "priority", "0", 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_ScheduledTimes(), this.getScheduledTime(), null, "scheduledTimes", null, 1, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduledTimeEClass, ScheduledTime.class, "ScheduledTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledTime_Cycle(), ecorePackage.getEInt(), "cycle", "1", 1, 1, ScheduledTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledTime_StartTime(), ecorePackage.getEDouble(), "startTime", "0.0", 1, 1, ScheduledTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledTime_Duration(), ecorePackage.getEDouble(), "duration", "0.0", 1, 1, ScheduledTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledTime_Restart(), ecorePackage.getEBoolean(), "restart", "true", 1, 1, ScheduledTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageAEClass, MessageA.class, "MessageA", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageA_Schedules(), this.getSchedule(), null, "schedules", null, 0, -1, MessageA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageA_Submessages(), this.getSubmessage(), null, "submessages", null, 0, -1, MessageA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageA_SignalToMessageAssignments(), this.getSignalToMessageAssignment(), null, "signalToMessageAssignments", null, 0, -1, MessageA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageA_Segments(), this.getSegmentA(), null, "segments", null, 0, -1, MessageA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageA_Type(), theLibraryPackage.getMessageType(), null, "type", null, 0, 1, MessageA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageA_IsPersistent(), ecorePackage.getEBoolean(), "isPersistent", null, 0, 1, MessageA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageA_Length(), ecorePackage.getEInt(), "length", null, 0, 1, MessageA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageA_Path(), this.getPathA(), null, "path", null, 0, 1, MessageA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageSegmentEClass, MessageSegment.class, "MessageSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageSegment_Capability(), theCapabilitiesPackage.getMessageOnConnectionOrDeviceCapability(), null, "capability", null, 1, 1, MessageSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageSegment_Device(), theHardwarePackage.getDevice(), null, "device", null, 0, 1, MessageSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageSegment_Connection(), theHardwarePackage.getConnection(), null, "connection", null, 0, 1, MessageSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Capability(), theCapabilitiesPackage.getMessageOnBusCapability(), null, "capability", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Bus(), theHardwarePackage.getBus(), null, "bus", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_SourceDevices(), theHardwarePackage.getDevice(), null, "sourceDevices", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_DestinationDevices(), theHardwarePackage.getDevice(), null, "destinationDevices", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_IsRedundantTo(), this.getMessage(), null, "isRedundantTo", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submessageEClass, Submessage.class, "Submessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmessage_Capability(), theCapabilitiesPackage.getSubmessageInMessageCapability(), null, "capability", null, 1, 1, Submessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmessage_Position(), ecorePackage.getEInt(), "position", "0", 1, 1, Submessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalToMessageAssignmentEClass, SignalToMessageAssignment.class, "SignalToMessageAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalToMessageAssignment_Signal(), theFunctionsPackage.getSignal(), null, "signal", null, 1, 1, SignalToMessageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalToMessageAssignment_Attributes(), theCommonPackage.getAttributeA(), null, "attributes", null, 0, -1, SignalToMessageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalToMessageAssignment_Variants(), theScenarioPackage.getVariant(), null, "variants", null, 0, -1, SignalToMessageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalToMessageAssignment_OperationModes(), theScenarioPackage.getOperationModeReference(), null, "operationModes", null, 0, -1, SignalToMessageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalToMessageAssignment_DataType(), theCommonPackage.getDataTypeA(), null, "dataType", null, 0, 1, SignalToMessageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalToMessageAssignment_Position(), ecorePackage.getEInt(), "position", "0", 1, 1, SignalToMessageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalToMessageAssignment_Capability(), theCapabilitiesPackage.getSignalInMessageCapability(), null, "capability", null, 1, 1, SignalToMessageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationsEClass, Allocations.class, "Allocations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suballocationsEClass, Suballocations.class, "Suballocations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(segmentAEClass, SegmentA.class, "SegmentA", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSegmentA_Capability(), theCapabilitiesPackage.getSignalOnConnectionOrDeviceCapability(), null, "capability", null, 1, 1, SegmentA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegmentA_Device(), theHardwarePackage.getDevice(), null, "device", null, 0, 1, SegmentA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegmentA_Connection(), theHardwarePackage.getConnection(), null, "connection", null, 0, 1, SegmentA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegmentA_Schedules(), this.getSchedule(), null, "schedules", null, 0, -1, SegmentA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPath_Segments(), this.getSegment(), null, "segments", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Source(), theHardwarePackage.getDevice(), null, "source", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Destination(), theHardwarePackage.getDevice(), null, "destination", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Message(), this.getMessageA(), null, "message", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_IsRedundantTo(), this.getPath(), null, "isRedundantTo", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathGroupEClass, PathGroup.class, "PathGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathGroup_Subpaths(), this.getSegmentA(), null, "subpaths", null, 0, -1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathGroup_ChildrenRedundant(), ecorePackage.getEBoolean(), "childrenRedundant", "false", 1, 1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathGroup_Sources(), theHardwarePackage.getDevice(), null, "sources", null, 0, -1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathGroup_Destinations(), theHardwarePackage.getDevice(), null, "destinations", null, 0, -1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathAEClass, PathA.class, "PathA", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (scheduledTimeEClass,
		   source,
		   new String[] {
			   "archetype", "Role"
		   });
	}

} //AllocationsPackageImpl
