/**
 */
package de.oaam.model.oaam.mapping;

import de.oaam.model.oaam.common.ElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root element of the mapping model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.MappingContainerA#getDeviceAssignments <em>Device Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.MappingContainerA#getSubDeviceAssignments <em>Sub Device Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.MappingContainerA#getConnectionAssignments <em>Connection Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.MappingContainerA#getTaskAssignments <em>Task Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.MappingContainerA#getSignalAssignments <em>Signal Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.MappingContainerA#getSupmapping <em>Supmapping</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.mapping.MappingPackage#getMappingContainerA()
 * @model abstract="true"
 * @generated
 */
public interface MappingContainerA extends ElementA {
	/**
	 * Returns the value of the '<em><b>Device Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.mapping.DeviceAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getMappingContainerA_DeviceAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceAssignment> getDeviceAssignments();

	/**
	 * Returns the value of the '<em><b>Sub Device Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.mapping.SubDeviceAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All subdevice assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Device Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getMappingContainerA_SubDeviceAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubDeviceAssignment> getSubDeviceAssignments();

	/**
	 * Returns the value of the '<em><b>Connection Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.mapping.ConnectionAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connection assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getMappingContainerA_ConnectionAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionAssignment> getConnectionAssignments();

	/**
	 * Returns the value of the '<em><b>Task Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.mapping.TaskAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All task assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getMappingContainerA_TaskAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskAssignment> getTaskAssignments();

	/**
	 * Returns the value of the '<em><b>Signal Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.mapping.SignalAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signal assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getMappingContainerA_SignalAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalAssignment> getSignalAssignments();

	/**
	 * Returns the value of the '<em><b>Supmapping</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.mapping.Supmapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All submappings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supmapping</em>' containment reference list.
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getMappingContainerA_Supmapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<Supmapping> getSupmapping();

} // MappingContainerA
