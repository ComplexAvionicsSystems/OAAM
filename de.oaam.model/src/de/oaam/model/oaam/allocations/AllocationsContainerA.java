/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.common.SystemBelongingElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root element of the allocations model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getDeviceAssignments <em>Device Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getSubdeviceAssignments <em>Subdevice Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getConnectionAssignments <em>Connection Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getTaskAssignments <em>Task Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getSignalAssignments <em>Signal Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getSuballocations <em>Suballocations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getSubconnectionAssignments <em>Subconnection Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getAllocationsContainerA()
 * @model abstract="true"
 * @generated
 */
public interface AllocationsContainerA extends OaamBaseElementA, SystemBelongingElementA {
	/**
	 * Returns the value of the '<em><b>Device Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.DeviceAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getAllocationsContainerA_DeviceAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceAssignment> getDeviceAssignments();

	/**
	 * Returns the value of the '<em><b>Subdevice Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.SubdeviceAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All subdevice assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subdevice Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getAllocationsContainerA_SubdeviceAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubdeviceAssignment> getSubdeviceAssignments();

	/**
	 * Returns the value of the '<em><b>Connection Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.ConnectionAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connection assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getAllocationsContainerA_ConnectionAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionAssignment> getConnectionAssignments();

	/**
	 * Returns the value of the '<em><b>Task Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.TaskAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All task assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getAllocationsContainerA_TaskAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskAssignment> getTaskAssignments();

	/**
	 * Returns the value of the '<em><b>Signal Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.SignalAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signal assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getAllocationsContainerA_SignalAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalAssignment> getSignalAssignments();

	/**
	 * Returns the value of the '<em><b>Suballocations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.Suballocations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All suballocations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suballocations</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getAllocationsContainerA_Suballocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Suballocations> getSuballocations();

	/**
	 * Returns the value of the '<em><b>Subconnection Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.SubconnectionAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All subconnection assignments of the allocations package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subconnection Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getAllocationsContainerA_SubconnectionAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubconnectionAssignment> getSubconnectionAssignments();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All messages
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getAllocationsContainerA_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

} // AllocationsContainerA
