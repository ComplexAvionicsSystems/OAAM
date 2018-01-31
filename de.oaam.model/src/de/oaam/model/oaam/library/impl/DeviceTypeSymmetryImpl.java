/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.DeviceTypeSymmetry;
import de.oaam.model.oaam.library.LibraryPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Type Symmetry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeSymmetryImpl#getDeviceTypes <em>Device Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceTypeSymmetryImpl extends ElementAImpl implements DeviceTypeSymmetry {
	/**
	 * The cached value of the '{@link #getDeviceTypes() <em>Device Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> deviceTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeSymmetryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.DEVICE_TYPE_SYMMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getDeviceTypes() {
		if (deviceTypes == null) {
			deviceTypes = new EObjectResolvingEList<DeviceType>(DeviceType.class, this, LibraryPackage.DEVICE_TYPE_SYMMETRY__DEVICE_TYPES);
		}
		return deviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.DEVICE_TYPE_SYMMETRY__DEVICE_TYPES:
				return getDeviceTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.DEVICE_TYPE_SYMMETRY__DEVICE_TYPES:
				getDeviceTypes().clear();
				getDeviceTypes().addAll((Collection<? extends DeviceType>)newValue);
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
			case LibraryPackage.DEVICE_TYPE_SYMMETRY__DEVICE_TYPES:
				getDeviceTypes().clear();
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
			case LibraryPackage.DEVICE_TYPE_SYMMETRY__DEVICE_TYPES:
				return deviceTypes != null && !deviceTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceTypeSymmetryImpl
