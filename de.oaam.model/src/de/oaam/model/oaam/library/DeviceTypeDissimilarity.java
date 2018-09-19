/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Type Dissimilarity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Device types are declared dissimilar to all other device types in the same dissimilarity group up to a certain factor. If more accurate dissimilarity modeling is required resource type dissimilarities can be used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.DeviceTypeDissimilarity#getDevices <em>Devices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.DeviceTypeDissimilarity#getPercentageOfCommonHardware <em>Percentage Of Common Hardware</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceTypeDissimilarity()
 * @model
 * @generated
 */
public interface DeviceTypeDissimilarity extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the devices that are dissimilar
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceTypeDissimilarity_Devices()
	 * @model
	 * @generated
	 */
	EList<DeviceType> getDevices();

	/**
	 * Returns the value of the '<em><b>Percentage Of Common Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives an approximation of the percentage of hardware that is identical to the other devices referenced as dissimilar. By default 100% dissimilarity is assumed. Additional checks for dissimilarity are carried out with the resource types, which must also be dissimilar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percentage Of Common Hardware</em>' attribute.
	 * @see #setPercentageOfCommonHardware(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceTypeDissimilarity_PercentageOfCommonHardware()
	 * @model required="true"
	 * @generated
	 */
	double getPercentageOfCommonHardware();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.DeviceTypeDissimilarity#getPercentageOfCommonHardware <em>Percentage Of Common Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Common Hardware</em>' attribute.
	 * @see #getPercentageOfCommonHardware()
	 * @generated
	 */
	void setPercentageOfCommonHardware(double value);

} // DeviceTypeDissimilarity
