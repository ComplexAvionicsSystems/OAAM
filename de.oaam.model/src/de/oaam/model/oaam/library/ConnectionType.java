/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connection is a physical link between two devices. With the connection type the unambiguous properties for a connection type can be set. A connection type can represent various topologies like lines, busses and stars, but also wireless. Moreover, passive and active connections like switched networks can be modeled
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#isIsInformation <em>Is Information</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#isIsPower <em>Is Power</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getWireTypes <em>Wire Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#isIsWireless <em>Is Wireless</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#isAllowsCircles <em>Allows Circles</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getNStartingPoints <em>NStarting Points</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getStartingPointResourceTypes <em>Starting Point Resource Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getNEndPoints <em>NEnd Points</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getEndPointResourceTypes <em>End Point Resource Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getNJoints <em>NJoints</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getMaxJointBranches <em>Max Joint Branches</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getMaxInterfaceToJointDistance <em>Max Interface To Joint Distance</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getSwitchTypes <em>Switch Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#isIsSwitched <em>Is Switched</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#isDirectConnectionsAllowed <em>Direct Connections Allowed</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#isIsUnidirectional <em>Is Unidirectional</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#isRequiresMaster <em>Requires Master</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ConnectionType#getMessageType <em>Message Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType()
 * @model
 * @generated
 */
public interface ConnectionType extends ResourceProviderA, ResourceConsumerA, OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Is Information</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can this connection type transmit information?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Information</em>' attribute.
	 * @see #setIsInformation(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_IsInformation()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsInformation();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#isIsInformation <em>Is Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Information</em>' attribute.
	 * @see #isIsInformation()
	 * @generated
	 */
	void setIsInformation(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Power</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can this connection type provide or distribute power?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Power</em>' attribute.
	 * @see #setIsPower(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_IsPower()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsPower();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#isIsPower <em>Is Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Power</em>' attribute.
	 * @see #isIsPower()
	 * @generated
	 */
	void setIsPower(boolean value);

	/**
	 * Returns the value of the '<em><b>Wire Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.WireType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which wire type is used by the connection type?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wire Types</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_WireTypes()
	 * @model
	 * @generated
	 */
	EList<WireType> getWireTypes();

	/**
	 * Returns the value of the '<em><b>Is Wireless</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this a wireless connection?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Wireless</em>' attribute.
	 * @see #setIsWireless(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_IsWireless()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsWireless();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#isIsWireless <em>Is Wireless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Wireless</em>' attribute.
	 * @see #isIsWireless()
	 * @generated
	 */
	void setIsWireless(boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Circles</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does the wiring topology allow circles?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allows Circles</em>' attribute.
	 * @see #setAllowsCircles(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_AllowsCircles()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAllowsCircles();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#isAllowsCircles <em>Allows Circles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Circles</em>' attribute.
	 * @see #isAllowsCircles()
	 * @generated
	 */
	void setAllowsCircles(boolean value);

	/**
	 * Returns the value of the '<em><b>NStarting Points</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Considering a single wire without switches, how many speakers are allowed?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NStarting Points</em>' attribute.
	 * @see #setNStartingPoints(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_NStartingPoints()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNStartingPoints();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#getNStartingPoints <em>NStarting Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NStarting Points</em>' attribute.
	 * @see #getNStartingPoints()
	 * @generated
	 */
	void setNStartingPoints(int value);

	/**
	 * Returns the value of the '<em><b>Starting Point Resource Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which resource type (usualy an IO type) is required on the starting point side of the connection?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Point Resource Types</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_StartingPointResourceTypes()
	 * @model
	 * @generated
	 */
	EList<ResourceType> getStartingPointResourceTypes();

	/**
	 * Returns the value of the '<em><b>NEnd Points</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Considering a single cable without switches, how many listeners are allowed?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NEnd Points</em>' attribute.
	 * @see #setNEndPoints(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_NEndPoints()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNEndPoints();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#getNEndPoints <em>NEnd Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NEnd Points</em>' attribute.
	 * @see #getNEndPoints()
	 * @generated
	 */
	void setNEndPoints(int value);

	/**
	 * Returns the value of the '<em><b>End Point Resource Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which resource type (usualy an IO type) is required on the end point side of the connection?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Point Resource Types</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_EndPointResourceTypes()
	 * @model
	 * @generated
	 */
	EList<ResourceType> getEndPointResourceTypes();

	/**
	 * Returns the value of the '<em><b>NJoints</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an n-to-m connection, how many split or merging points can exist?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NJoints</em>' attribute.
	 * @see #setNJoints(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_NJoints()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getNJoints();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#getNJoints <em>NJoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NJoints</em>' attribute.
	 * @see #getNJoints()
	 * @generated
	 */
	void setNJoints(int value);

	/**
	 * Returns the value of the '<em><b>Max Joint Branches</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum of cables that can form a joint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Joint Branches</em>' attribute.
	 * @see #setMaxJointBranches(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_MaxJointBranches()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMaxJointBranches();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#getMaxJointBranches <em>Max Joint Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Joint Branches</em>' attribute.
	 * @see #getMaxJointBranches()
	 * @generated
	 */
	void setMaxJointBranches(int value);

	/**
	 * Returns the value of the '<em><b>Max Interface To Joint Distance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum physical distance between an interface on a device and a merging or splitting point. For instance for a CAN bus this are only a few centimeters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Interface To Joint Distance</em>' attribute.
	 * @see #setMaxInterfaceToJointDistance(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_MaxInterfaceToJointDistance()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getMaxInterfaceToJointDistance();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#getMaxInterfaceToJointDistance <em>Max Interface To Joint Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interface To Joint Distance</em>' attribute.
	 * @see #getMaxInterfaceToJointDistance()
	 * @generated
	 */
	void setMaxInterfaceToJointDistance(double value);

	/**
	 * Returns the value of the '<em><b>Switch Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device types which can be used as switches for this connection type. Switch types apply only to actively switched networks as Ethernet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Switch Types</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_SwitchTypes()
	 * @model
	 * @generated
	 */
	EList<DeviceType> getSwitchTypes();

	/**
	 * Returns the value of the '<em><b>Is Switched</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this a switched network, which needs active components to connect multiple participants?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Switched</em>' attribute.
	 * @see #setIsSwitched(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_IsSwitched()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsSwitched();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#isIsSwitched <em>Is Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Switched</em>' attribute.
	 * @see #isIsSwitched()
	 * @generated
	 */
	void setIsSwitched(boolean value);

	/**
	 * Returns the value of the '<em><b>Direct Connections Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a switched connection type this specifies if als direct point-to-point connetions are allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Connections Allowed</em>' attribute.
	 * @see #setDirectConnectionsAllowed(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_DirectConnectionsAllowed()
	 * @model required="true"
	 * @generated
	 */
	boolean isDirectConnectionsAllowed();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#isDirectConnectionsAllowed <em>Direct Connections Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Connections Allowed</em>' attribute.
	 * @see #isDirectConnectionsAllowed()
	 * @generated
	 */
	void setDirectConnectionsAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximal physical distance which can be linked with this connection type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_MaxLength()
	 * @model default="100" required="true"
	 * @generated
	 */
	double getMaxLength();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(double value);

	/**
	 * Returns the value of the '<em><b>Is Unidirectional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does power and information flow in both or only in one direction?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unidirectional</em>' attribute.
	 * @see #setIsUnidirectional(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_IsUnidirectional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsUnidirectional();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#isIsUnidirectional <em>Is Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unidirectional</em>' attribute.
	 * @see #isIsUnidirectional()
	 * @generated
	 */
	void setIsUnidirectional(boolean value);

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
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_RequiresMaster()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequiresMaster();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#isRequiresMaster <em>Requires Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Master</em>' attribute.
	 * @see #isRequiresMaster()
	 * @generated
	 */
	void setRequiresMaster(boolean value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines valid messages on this connection type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type</em>' reference.
	 * @see #setMessageType(MessageType)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getConnectionType_MessageType()
	 * @model
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ConnectionType#getMessageType <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

} // ConnectionType
