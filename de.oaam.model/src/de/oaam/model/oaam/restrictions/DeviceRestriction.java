/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A device restriction forces functions and signals to use or not use a certain device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.DeviceRestriction#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.DeviceRestriction#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.DeviceRestriction#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceRestriction()
 * @model
 * @generated
 */
public interface DeviceRestriction extends TaskRestrictionA, TaskGroupRestrictionA, SignalRestrictionA, SignalGroupRestrictionA, SubfunctionRestrictionA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the device are not included in the model a textual notation of the device can be given which is later resolved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceRestriction_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.DeviceRestriction#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * false = use only the given device. true = do not use the given device. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceRestriction_IsForbidden()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.DeviceRestriction#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device(s) to be used or avoided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceRestriction_Devices()
	 * @model
	 * @generated
	 */
	EList<Device> getDevices();

} // DeviceRestriction
