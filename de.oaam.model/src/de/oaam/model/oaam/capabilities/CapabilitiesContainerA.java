/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root of the capabilities mode. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getTaskOnDeviceCapabilities <em>Task On Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSignalOnConnectionOrDeviceCapabilities <em>Signal On Connection Or Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getDeviceInLocationCapabilities <em>Device In Location Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubdeviceInDeviceCapabilities <em>Subdevice In Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getConnectionInDuctOrLocationCapabilities <em>Connection In Duct Or Location Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubcapabilities <em>Subcapabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubconnectionInDeviceCapabilities <em>Subconnection In Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getMessageOnBusCapabilities <em>Message On Bus Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubmessageInMessageCapabilities <em>Submessage In Message Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSignalInMessageCapabilities <em>Signal In Message Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getMessageOnConnectionOrDeviceCapabilities <em>Message On Connection Or Device Capabilities</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA()
 * @model abstract="true"
 * @generated
 */
public interface CapabilitiesContainerA extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Task On Device Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.TaskOnDeviceCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All function capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task On Device Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_TaskOnDeviceCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskOnDeviceCapability> getTaskOnDeviceCapabilities();

	/**
	 * Returns the value of the '<em><b>Signal On Connection Or Device Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signal capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal On Connection Or Device Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_SignalOnConnectionOrDeviceCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalOnConnectionOrDeviceCapability> getSignalOnConnectionOrDeviceCapabilities();

	/**
	 * Returns the value of the '<em><b>Device In Location Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.DeviceInLocationCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device In Location Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_DeviceInLocationCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceInLocationCapability> getDeviceInLocationCapabilities();

	/**
	 * Returns the value of the '<em><b>Subdevice In Device Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All sub device capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subdevice In Device Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_SubdeviceInDeviceCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubdeviceInDeviceCapability> getSubdeviceInDeviceCapabilities();

	/**
	 * Returns the value of the '<em><b>Connection In Duct Or Location Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connection capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection In Duct Or Location Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_ConnectionInDuctOrLocationCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionInDuctOrLocationCapability> getConnectionInDuctOrLocationCapabilities();

	/**
	 * Returns the value of the '<em><b>Subcapabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.Subcapabilities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All included subcapabilities
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subcapabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_Subcapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subcapabilities> getSubcapabilities();

	/**
	 * Returns the value of the '<em><b>Subconnection In Device Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All subconnection capabilities
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subconnection In Device Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_SubconnectionInDeviceCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubconnectionInDeviceCapability> getSubconnectionInDeviceCapabilities();

	/**
	 * Returns the value of the '<em><b>Message On Bus Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.MessageOnBusCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All message capabilities
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message On Bus Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_MessageOnBusCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageOnBusCapability> getMessageOnBusCapabilities();

	/**
	 * Returns the value of the '<em><b>Submessage In Message Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.SubmessageInMessageCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All submessge capabilities
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submessage In Message Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_SubmessageInMessageCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubmessageInMessageCapability> getSubmessageInMessageCapabilities();

	/**
	 * Returns the value of the '<em><b>Signal In Message Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.SignalInMessageCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signal in message capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal In Message Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_SignalInMessageCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalInMessageCapability> getSignalInMessageCapabilities();

	/**
	 * Returns the value of the '<em><b>Message On Connection Or Device Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All message on connection capabilieties
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message On Connection Or Device Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_MessageOnConnectionOrDeviceCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageOnConnectionOrDeviceCapability> getMessageOnConnectionOrDeviceCapabilities();

} // CapabilitiesContainerA
