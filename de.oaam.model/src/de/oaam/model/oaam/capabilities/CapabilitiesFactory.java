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
	 * Returns a new object of class '<em>Task Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Capability</em>'.
	 * @generated
	 */
	TaskCapability createTaskCapability();

	/**
	 * Returns a new object of class '<em>Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Capability</em>'.
	 * @generated
	 */
	DeviceCapability createDeviceCapability();

	/**
	 * Returns a new object of class '<em>Connection Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Capability</em>'.
	 * @generated
	 */
	ConnectionCapability createConnectionCapability();

	/**
	 * Returns a new object of class '<em>Signal Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Capability</em>'.
	 * @generated
	 */
	SignalCapability createSignalCapability();

	/**
	 * Returns a new object of class '<em>Sub Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Device Capability</em>'.
	 * @generated
	 */
	SubDeviceCapability createSubDeviceCapability();

	/**
	 * Returns a new object of class '<em>Resource Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Consumption</em>'.
	 * @generated
	 */
	ResourceConsumption createResourceConsumption();

	/**
	 * Returns a new object of class '<em>Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capabilities</em>'.
	 * @generated
	 */
	Capabilities createCapabilities();

	/**
	 * Returns a new object of class '<em>Subcapability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subcapability</em>'.
	 * @generated
	 */
	Subcapability createSubcapability();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CapabilitiesPackage getCapabilitiesPackage();

} //CapabilitiesFactory
