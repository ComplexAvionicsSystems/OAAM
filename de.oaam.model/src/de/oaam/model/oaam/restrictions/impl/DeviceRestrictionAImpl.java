/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.restrictions.DeviceRestrictionA;
import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Restriction A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionAImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeviceRestrictionAImpl extends MinimalEObjectImpl.Container implements DeviceRestrictionA {
	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected Device devices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceRestrictionAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.DEVICE_RESTRICTION_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevices() {
		if (devices != null && devices.eIsProxy()) {
			InternalEObject oldDevices = (InternalEObject)devices;
			devices = (Device)eResolveProxy(oldDevices);
			if (devices != oldDevices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestrictionsPackage.DEVICE_RESTRICTION_A__DEVICES, oldDevices, devices));
			}
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDevices() {
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevices(Device newDevices) {
		Device oldDevices = devices;
		devices = newDevices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION_A__DEVICES, oldDevices, devices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestrictionsPackage.DEVICE_RESTRICTION_A__DEVICES:
				if (resolve) return getDevices();
				return basicGetDevices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestrictionsPackage.DEVICE_RESTRICTION_A__DEVICES:
				setDevices((Device)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RestrictionsPackage.DEVICE_RESTRICTION_A__DEVICES:
				setDevices((Device)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestrictionsPackage.DEVICE_RESTRICTION_A__DEVICES:
				return devices != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceRestrictionAImpl
