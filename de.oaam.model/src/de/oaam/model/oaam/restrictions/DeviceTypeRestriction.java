/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.library.DeviceType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Type Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Device type restrictions force functions and device to use or not a certain device type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction#getDeviceTypeName <em>Device Type Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction#getDeviceTypes <em>Device Types</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceTypeRestriction()
 * @model
 * @generated
 */
public interface DeviceTypeRestriction extends TaskRestrictionA, SignalRestrictionA, SubFunctionRestrictionA, ElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Device Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual reference to the device type if the model of device types is not available. This can be resolved later.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type Name</em>' attribute.
	 * @see #setDeviceTypeName(String)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceTypeRestriction_DeviceTypeName()
	 * @model
	 * @generated
	 */
	String getDeviceTypeName();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction#getDeviceTypeName <em>Device Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type Name</em>' attribute.
	 * @see #getDeviceTypeName()
	 * @generated
	 */
	void setDeviceTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * false = use only this device type. true = do not use the given device type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceTypeRestriction_IsForbidden()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Device Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device type(s) to be used or avoided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Types</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getDeviceTypeRestriction_DeviceTypes()
	 * @model
	 * @generated
	 */
	EList<DeviceType> getDeviceTypes();

} // DeviceTypeRestriction
