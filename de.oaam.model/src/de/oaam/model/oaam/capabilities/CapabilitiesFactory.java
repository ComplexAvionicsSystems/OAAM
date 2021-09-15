/**
 */
package de.oaam.model.oaam.capabilities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage
 * @generated
 */
public interface CapabilitiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapabilitiesFactory eINSTANCE = de.oaam.model.oaam.capabilities.impl.CapabilitiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task On Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task On Device Capability</em>'.
	 * @generated
	 */
	TaskOnDeviceCapability createTaskOnDeviceCapability();

	/**
	 * Returns a new object of class '<em>Device In Location Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device In Location Capability</em>'.
	 * @generated
	 */
	DeviceInLocationCapability createDeviceInLocationCapability();

	/**
	 * Returns a new object of class '<em>Connection In Duct Or Location Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection In Duct Or Location Capability</em>'.
	 * @generated
	 */
	ConnectionInDuctOrLocationCapability createConnectionInDuctOrLocationCapability();

	/**
	 * Returns a new object of class '<em>Signal On Connection Or Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal On Connection Or Device Capability</em>'.
	 * @generated
	 */
	SignalOnConnectionOrDeviceCapability createSignalOnConnectionOrDeviceCapability();

	/**
	 * Returns a new object of class '<em>Subdevice In Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subdevice In Device Capability</em>'.
	 * @generated
	 */
	SubdeviceInDeviceCapability createSubdeviceInDeviceCapability();

	/**
	 * Returns a new object of class '<em>Subconnection In Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subconnection In Device Capability</em>'.
	 * @generated
	 */
	SubconnectionInDeviceCapability createSubconnectionInDeviceCapability();

	/**
	 * Returns a new object of class '<em>Resource Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Consumption</em>'.
	 * @generated
	 */
	ResourceConsumption createResourceConsumption();

	/**
	 * Returns a new object of class '<em>Message On Bus Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message On Bus Capability</em>'.
	 * @generated
	 */
	MessageOnBusCapability createMessageOnBusCapability();

	/**
	 * Returns a new object of class '<em>Message On Connection Or Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message On Connection Or Device Capability</em>'.
	 * @generated
	 */
	MessageOnConnectionOrDeviceCapability createMessageOnConnectionOrDeviceCapability();

	/**
	 * Returns a new object of class '<em>Submessage In Message Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submessage In Message Capability</em>'.
	 * @generated
	 */
	SubmessageInMessageCapability createSubmessageInMessageCapability();

	/**
	 * Returns a new object of class '<em>Signal In Message Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal In Message Capability</em>'.
	 * @generated
	 */
	SignalInMessageCapability createSignalInMessageCapability();

	/**
	 * Returns a new object of class '<em>Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capabilities</em>'.
	 * @generated
	 */
	Capabilities createCapabilities();

	/**
	 * Returns a new object of class '<em>Subcapabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subcapabilities</em>'.
	 * @generated
	 */
	Subcapabilities createSubcapabilities();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CapabilitiesPackage getCapabilitiesPackage();

} //CapabilitiesFactory
