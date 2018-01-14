/**
 */
package de.oaam.model.oaam.mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.mapping.MappingPackage
 * @generated
 */
public interface MappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingFactory eINSTANCE = de.oaam.model.oaam.mapping.impl.MappingFactoryImpl.init();

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
	 * Returns a new object of class '<em>Sub Device Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Device Assignment</em>'.
	 * @generated
	 */
	SubDeviceAssignment createSubDeviceAssignment();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Supmapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supmapping</em>'.
	 * @generated
	 */
	Supmapping createSupmapping();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MappingPackage getMappingPackage();

} //MappingFactory
