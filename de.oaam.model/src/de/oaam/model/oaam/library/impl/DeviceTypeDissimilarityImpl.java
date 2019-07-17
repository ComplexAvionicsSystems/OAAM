/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.DeviceTypeDissimilarity;
import de.oaam.model.oaam.library.LibraryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Type Dissimilarity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeDissimilarityImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeDissimilarityImpl#getPercentageOfCommonHardware <em>Percentage Of Common Hardware</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceTypeDissimilarityImpl extends OaamBaseElementAImpl implements DeviceTypeDissimilarity {
	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> devices;

	/**
	 * The default value of the '{@link #getPercentageOfCommonHardware() <em>Percentage Of Common Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfCommonHardware()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_COMMON_HARDWARE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfCommonHardware() <em>Percentage Of Common Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfCommonHardware()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfCommonHardware = PERCENTAGE_OF_COMMON_HARDWARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeDissimilarityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.DEVICE_TYPE_DISSIMILARITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList<DeviceType>(DeviceType.class, this, LibraryPackage.DEVICE_TYPE_DISSIMILARITY__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfCommonHardware() {
		return percentageOfCommonHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfCommonHardware(double newPercentageOfCommonHardware) {
		double oldPercentageOfCommonHardware = percentageOfCommonHardware;
		percentageOfCommonHardware = newPercentageOfCommonHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_HARDWARE, oldPercentageOfCommonHardware, percentageOfCommonHardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY__DEVICES:
				return getDevices();
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_HARDWARE:
				return getPercentageOfCommonHardware();
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
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends DeviceType>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_HARDWARE:
				setPercentageOfCommonHardware((Double)newValue);
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
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY__DEVICES:
				getDevices().clear();
				return;
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_HARDWARE:
				setPercentageOfCommonHardware(PERCENTAGE_OF_COMMON_HARDWARE_EDEFAULT);
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
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY__DEVICES:
				return devices != null && !devices.isEmpty();
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_HARDWARE:
				return percentageOfCommonHardware != PERCENTAGE_OF_COMMON_HARDWARE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (percentageOfCommonHardware: ");
		result.append(percentageOfCommonHardware);
		result.append(')');
		return result.toString();
	}

} //DeviceTypeDissimilarityImpl
