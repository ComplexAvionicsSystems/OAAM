/**
 */
package de.oaam.model.oaam.allocations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.allocations.AllocationsPackage
 * @generated
 */
public interface AllocationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationsFactory eINSTANCE = de.oaam.model.oaam.allocations.impl.AllocationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Assignment</em>'.
	 * @generated
	 */
	TaskAssignment createTaskAssignment();

	/**
	 * Returns a new object of class '<em>Signal Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Assignment</em>'.
	 * @generated
	 */
	SignalAssignment createSignalAssignment();

	/**
	 * Returns a new object of class '<em>Connection Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Assignment</em>'.
	 * @generated
	 */
	ConnectionAssignment createConnectionAssignment();

	/**
	 * Returns a new object of class '<em>Signal Assignment Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Assignment Segment</em>'.
	 * @generated
	 */
	SignalAssignmentSegment createSignalAssignmentSegment();

	/**
	 * Returns a new object of class '<em>Device Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Assignment</em>'.
	 * @generated
	 */
	DeviceAssignment createDeviceAssignment();

	/**
	 * Returns a new object of class '<em>Connection Assignment Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Assignment Segment</em>'.
	 * @generated
	 */
	ConnectionAssignmentSegment createConnectionAssignmentSegment();

	/**
	 * Returns a new object of class '<em>Subdevice Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subdevice Assignment</em>'.
	 * @generated
	 */
	SubdeviceAssignment createSubdeviceAssignment();

	/**
	 * Returns a new object of class '<em>Subconnection Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subconnection Assignment</em>'.
	 * @generated
	 */
	SubconnectionAssignment createSubconnectionAssignment();

	/**
	 * Returns a new object of class '<em>Allocations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocations</em>'.
	 * @generated
	 */
	Allocations createAllocations();

	/**
	 * Returns a new object of class '<em>Suballocations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suballocations</em>'.
	 * @generated
	 */
	Suballocations createSuballocations();

	/**
	 * Returns a new object of class '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule</em>'.
	 * @generated
	 */
	Schedule createSchedule();

	/**
	 * Returns a new object of class '<em>Scheduled Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Time</em>'.
	 * @generated
	 */
	ScheduledTime createScheduledTime();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Signal To Message Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal To Message Assignment</em>'.
	 * @generated
	 */
	SignalToMessageAssignment createSignalToMessageAssignment();

	/**
	 * Returns a new object of class '<em>Message Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Segment</em>'.
	 * @generated
	 */
	MessageSegment createMessageSegment();

	/**
	 * Returns a new object of class '<em>Submessage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submessage</em>'.
	 * @generated
	 */
	Submessage createSubmessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AllocationsPackage getAllocationsPackage();

} //AllocationsFactory
