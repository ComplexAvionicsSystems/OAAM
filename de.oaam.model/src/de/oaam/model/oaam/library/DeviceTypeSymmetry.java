/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common._ElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Type Symmetry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines two or more device types as symmetric. A symmetric device type is usfull to describe dual-lane devices, because it enables a symmetric mapping of functions to both lanes in the same location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.DeviceTypeSymmetry#getDeviceTypes <em>Device Types</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceTypeSymmetry()
 * @model
 * @generated
 */
public interface DeviceTypeSymmetry extends _ElementA {
	/**
	 * Returns the value of the '<em><b>Device Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device types that are symmetric
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Types</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceTypeSymmetry_DeviceTypes()
	 * @model lower="2"
	 * @generated
	 */
	EList<DeviceType> getDeviceTypes();

} // DeviceTypeSymmetry
