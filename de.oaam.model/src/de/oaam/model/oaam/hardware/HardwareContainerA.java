/**
 */
package de.oaam.model.oaam.hardware;

import de.oaam.model.oaam.common._ElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root container of the hardware model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.hardware.HardwareContainerA#getDevices <em>Devices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.HardwareContainerA#getDeviceSymmetries <em>Device Symmetries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.HardwareContainerA#getConnections <em>Connections</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.HardwareContainerA#getSubhardware <em>Subhardware</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.hardware.HardwarePackage#getHardwareContainerA()
 * @model abstract="true"
 * @generated
 */
public interface HardwareContainerA extends _ElementA {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All devices in this hardware model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getHardwareContainerA_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Device Symmetries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.DeviceSymmetry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device symmetries in this hardware model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Symmetries</em>' containment reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getHardwareContainerA_DeviceSymmetries()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceSymmetry> getDeviceSymmetries();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections in this hardware model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference.
	 * @see #setConnections(Connection)
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getHardwareContainerA_Connections()
	 * @model containment="true"
	 * @generated
	 */
	Connection getConnections();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.hardware.HardwareContainerA#getConnections <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections</em>' containment reference.
	 * @see #getConnections()
	 * @generated
	 */
	void setConnections(Connection value);

	/**
	 * Returns the value of the '<em><b>Subhardware</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Subhardware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All hardware subgroups of this hardware
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subhardware</em>' containment reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getHardwareContainerA_Subhardware()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subhardware> getSubhardware();

} // HardwareContainerA
