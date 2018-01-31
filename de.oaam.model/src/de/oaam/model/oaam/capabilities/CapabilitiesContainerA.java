/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.ElementA;
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
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getFunctionCapabilties <em>Function Capabilties</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSignalCapabilities <em>Signal Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getDeviceCapabilities <em>Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubDeviceCapabilities <em>Sub Device Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getConnectionCapabilities <em>Connection Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubcapabilities <em>Subcapabilities</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA()
 * @model abstract="true"
 * @generated
 */
public interface CapabilitiesContainerA extends ElementA {
	/**
	 * Returns the value of the '<em><b>Function Capabilties</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.TaskCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All function capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Capabilties</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_FunctionCapabilties()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskCapability> getFunctionCapabilties();

	/**
	 * Returns the value of the '<em><b>Signal Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.SignalCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signal capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_SignalCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalCapability> getSignalCapabilities();

	/**
	 * Returns the value of the '<em><b>Device Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.DeviceCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_DeviceCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceCapability> getDeviceCapabilities();

	/**
	 * Returns the value of the '<em><b>Sub Device Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.SubDeviceCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All sub device capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Device Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_SubDeviceCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubDeviceCapability> getSubDeviceCapabilities();

	/**
	 * Returns the value of the '<em><b>Connection Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.ConnectionCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connection capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Capabilities</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilitiesContainerA_ConnectionCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionCapability> getConnectionCapabilities();

	/**
	 * Returns the value of the '<em><b>Subcapabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.Subcapability}.
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
	EList<Subcapability> getSubcapabilities();

} // CapabilitiesContainerA
