/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.hardware.Device;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Restriction A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for device restrictions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.DeviceRestrictionA#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceRestrictionA()
 * @model abstract="true"
 * @generated
 */
public interface DeviceRestrictionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the allowed or not allowed devices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices</em>' reference.
	 * @see #setDevices(Device)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceRestrictionA_Devices()
	 * @model
	 * @generated
	 */
	Device getDevices();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.DeviceRestrictionA#getDevices <em>Devices</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devices</em>' reference.
	 * @see #getDevices()
	 * @generated
	 */
	void setDevices(Device value);

} // DeviceRestrictionA
