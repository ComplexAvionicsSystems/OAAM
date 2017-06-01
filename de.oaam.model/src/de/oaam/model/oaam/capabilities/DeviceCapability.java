/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.LocationType;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible mapping of a device to a location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.DeviceCapability#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.DeviceCapability#getLocationType <em>Location Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getDeviceCapability()
 * @model
 * @generated
 */
public interface DeviceCapability extends CapabilityA, _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device type for which this capability is valid for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type</em>' reference.
	 * @see #setDeviceType(DeviceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getDeviceCapability_DeviceType()
	 * @model required="true"
	 * @generated
	 */
	DeviceType getDeviceType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.DeviceCapability#getDeviceType <em>Device Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' reference.
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target location type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Type</em>' reference.
	 * @see #setLocationType(LocationType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getDeviceCapability_LocationType()
	 * @model required="true"
	 * @generated
	 */
	LocationType getLocationType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.DeviceCapability#getLocationType <em>Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type</em>' reference.
	 * @see #getLocationType()
	 * @generated
	 */
	void setLocationType(LocationType value);

} // DeviceCapability
