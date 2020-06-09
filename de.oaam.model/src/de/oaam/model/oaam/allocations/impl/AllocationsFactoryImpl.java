/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationsFactoryImpl extends EFactoryImpl implements AllocationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AllocationsFactory init() {
		try {
			AllocationsFactory theAllocationsFactory = (AllocationsFactory)EPackage.Registry.INSTANCE.getEFactory(AllocationsPackage.eNS_URI);
			if (theAllocationsFactory != null) {
				return theAllocationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AllocationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AllocationsPackage.TASK_ASSIGNMENT: return createTaskAssignment();
			case AllocationsPackage.SIGNAL_ASSIGNMENT: return createSignalAssignment();
			case AllocationsPackage.CONNECTION_ASSIGNMENT: return createConnectionAssignment();
			case AllocationsPackage.SEGMENT: return createSegment();
			case AllocationsPackage.DEVICE_ASSIGNMENT: return createDeviceAssignment();
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT: return createConnectionAssignmentSegment();
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT: return createSubdeviceAssignment();
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT: return createSubconnectionAssignment();
			case AllocationsPackage.SCHEDULE: return createSchedule();
			case AllocationsPackage.SCHEDULED_TIME: return createScheduledTime();
			case AllocationsPackage.MESSAGE_SEGMENT: return createMessageSegment();
			case AllocationsPackage.MESSAGE: return createMessage();
			case AllocationsPackage.SUBMESSAGE: return createSubmessage();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT: return createSignalToMessageAssignment();
			case AllocationsPackage.ALLOCATIONS: return createAllocations();
			case AllocationsPackage.SUBALLOCATIONS: return createSuballocations();
			case AllocationsPackage.PATH: return createPath();
			case AllocationsPackage.PATH_GROUP: return createPathGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAssignment createTaskAssignment() {
		TaskAssignmentImpl taskAssignment = new TaskAssignmentImpl();
		return taskAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalAssignment createSignalAssignment() {
		SignalAssignmentImpl signalAssignment = new SignalAssignmentImpl();
		return signalAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionAssignment createConnectionAssignment() {
		ConnectionAssignmentImpl connectionAssignment = new ConnectionAssignmentImpl();
		return connectionAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAssignment createDeviceAssignment() {
		DeviceAssignmentImpl deviceAssignment = new DeviceAssignmentImpl();
		return deviceAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionAssignmentSegment createConnectionAssignmentSegment() {
		ConnectionAssignmentSegmentImpl connectionAssignmentSegment = new ConnectionAssignmentSegmentImpl();
		return connectionAssignmentSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubdeviceAssignment createSubdeviceAssignment() {
		SubdeviceAssignmentImpl subdeviceAssignment = new SubdeviceAssignmentImpl();
		return subdeviceAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubconnectionAssignment createSubconnectionAssignment() {
		SubconnectionAssignmentImpl subconnectionAssignment = new SubconnectionAssignmentImpl();
		return subconnectionAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocations createAllocations() {
		AllocationsImpl allocations = new AllocationsImpl();
		return allocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suballocations createSuballocations() {
		SuballocationsImpl suballocations = new SuballocationsImpl();
		return suballocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathGroup createPathGroup() {
		PathGroupImpl pathGroup = new PathGroupImpl();
		return pathGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledTime createScheduledTime() {
		ScheduledTimeImpl scheduledTime = new ScheduledTimeImpl();
		return scheduledTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalToMessageAssignment createSignalToMessageAssignment() {
		SignalToMessageAssignmentImpl signalToMessageAssignment = new SignalToMessageAssignmentImpl();
		return signalToMessageAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSegment createMessageSegment() {
		MessageSegmentImpl messageSegment = new MessageSegmentImpl();
		return messageSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Submessage createSubmessage() {
		SubmessageImpl submessage = new SubmessageImpl();
		return submessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsPackage getAllocationsPackage() {
		return (AllocationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AllocationsPackage getPackage() {
		return AllocationsPackage.eINSTANCE;
	}

} //AllocationsFactoryImpl
