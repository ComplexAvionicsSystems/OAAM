/**
 */
package de.oaam.model.oaam.hardware;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Symmetry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Symmetric devices are devices that needs to be allocated symmetrically by symmetric tasks
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.hardware.DeviceSymmetry#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.hardware.HardwarePackage#getDeviceSymmetry()
 * @model
 * @generated
 */
public interface DeviceSymmetry extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the devices that are defined to be symmetric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getDeviceSymmetry_Devices()
	 * @model lower="2"
	 * @generated
	 */
	EList<Device> getDevices();

} // DeviceSymmetry
