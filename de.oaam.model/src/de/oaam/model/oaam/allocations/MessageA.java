/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.MessageType;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A message is a virtual packaging of signals. It can be used to describe the data transportation on a bussystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.MessageA#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.MessageA#getSubmessages <em>Submessages</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.MessageA#getSignalToMessageAssignments <em>Signal To Message Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.MessageA#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.MessageA#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.MessageA#isIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.MessageA#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessageA()
 * @model abstract="true"
 * @generated
 */
public interface MessageA extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.Schedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedules for the tasks on this device. Multiple schedules are valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedules</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessageA_Schedules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schedule> getSchedules();

	/**
	 * Returns the value of the '<em><b>Submessages</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.Submessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each message can be composed of several submessages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submessages</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessageA_Submessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Submessage> getSubmessages();

	/**
	 * Returns the value of the '<em><b>Signal To Message Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.SignalToMessageAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signals that are assigned to this message with its properties
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal To Message Assignments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessageA_SignalToMessageAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalToMessageAssignment> getSignalToMessageAssignments();

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.MessageSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The schedules for this signal segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessageA_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageSegment> getSegments();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines type of this message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MessageType)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessageA_Type()
	 * @model
	 * @generated
	 */
	MessageType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.MessageA#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Is Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set, message will not be altered in any way. Typically used for messages from complex sensors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Persistent</em>' attribute.
	 * @see #setIsPersistent(boolean)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessageA_IsPersistent()
	 * @model
	 * @generated
	 */
	boolean isIsPersistent();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.MessageA#isIsPersistent <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Persistent</em>' attribute.
	 * @see #isIsPersistent()
	 * @generated
	 */
	void setIsPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines length of this message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getMessageA_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.MessageA#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // MessageA
