/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.FailureProviderA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A hardware group is a set of devices and connections that form a common resource pool, but not a physical unit. For instance bus systems might be modeled as hardware groups
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.BusType#getDeviceTypes <em>Device Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.BusType#isIsSelfManaging <em>Is Self Managing</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.BusType#getConnectionTypes <em>Connection Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.BusType#isRequiresMaster <em>Requires Master</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.BusType#getMessagetypes <em>Messagetypes</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getBusType()
 * @model
 * @generated
 */
public interface BusType extends ResourceProviderA, OaamBaseElementA, FailureProviderA {
	/**
	 * Returns the value of the '<em><b>Device Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device types that could be member of such a resourc group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Types</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getBusType_DeviceTypes()
	 * @model
	 * @generated
	 */
	EList<DeviceType> getDeviceTypes();

	/**
	 * Returns the value of the '<em><b>Is Self Managing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines for a self-managing avionics platform, if the device type is capable of managing itself, i.e. can assign itself tasks and a shedule
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Self Managing</em>' attribute.
	 * @see #setIsSelfManaging(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getBusType_IsSelfManaging()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsSelfManaging();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.BusType#isIsSelfManaging <em>Is Self Managing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Self Managing</em>' attribute.
	 * @see #isIsSelfManaging()
	 * @generated
	 */
	void setIsSelfManaging(boolean value);

	/**
	 * Returns the value of the '<em><b>Connection Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection types that could be member of such a resourc group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Types</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getBusType_ConnectionTypes()
	 * @model
	 * @generated
	 */
	EList<ConnectionType> getConnectionTypes();

	/**
	 * Returns the value of the '<em><b>Requires Master</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is a special bus participant required to control the bus, e.g. SPI? Can also denote a multi-master bus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires Master</em>' attribute.
	 * @see #setRequiresMaster(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getBusType_RequiresMaster()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequiresMaster();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.BusType#isRequiresMaster <em>Requires Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Master</em>' attribute.
	 * @see #isRequiresMaster()
	 * @generated
	 */
	void setRequiresMaster(boolean value);

	/**
	 * Returns the value of the '<em><b>Messagetypes</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All supported message types of this bustype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Messagetypes</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getBusType_Messagetypes()
	 * @model
	 * @generated
	 */
	EList<MessageType> getMessagetypes();

} // BusType
