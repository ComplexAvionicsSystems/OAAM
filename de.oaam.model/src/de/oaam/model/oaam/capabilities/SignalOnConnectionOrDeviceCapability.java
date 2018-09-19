/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.SignalType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal On Connection Or Device Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible allocations of a signal to a device or connection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getSignalType <em>Signal Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getConnectionType <em>Connection Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSignalOnConnectionOrDeviceCapability()
 * @model
 * @generated
 */
public interface SignalOnConnectionOrDeviceCapability extends CapabilityA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Signal Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signal type for which this capability is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Type</em>' reference.
	 * @see #setSignalType(SignalType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSignalOnConnectionOrDeviceCapability_SignalType()
	 * @model required="true"
	 * @generated
	 */
	SignalType getSignalType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getSignalType <em>Signal Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Type</em>' reference.
	 * @see #getSignalType()
	 * @generated
	 */
	void setSignalType(SignalType value);

	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only one either a device type or a connection type can be specified as a target for signals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type</em>' reference.
	 * @see #setDeviceType(DeviceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSignalOnConnectionOrDeviceCapability_DeviceType()
	 * @model
	 * @generated
	 */
	DeviceType getDeviceType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getDeviceType <em>Device Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' reference.
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only one either a device type or a connection type can be specified as a target for signals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type</em>' reference.
	 * @see #setConnectionType(ConnectionType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getSignalOnConnectionOrDeviceCapability_ConnectionType()
	 * @model
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getConnectionType <em>Connection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' reference.
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

} // SignalOnConnectionOrDeviceCapability
