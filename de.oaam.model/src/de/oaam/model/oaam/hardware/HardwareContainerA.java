/**
 */
package de.oaam.model.oaam.hardware;

import de.oaam.model.oaam.common.OaamBaseElementA;

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
 *   <li>{@link de.oaam.model.oaam.hardware.HardwareContainerA#getBuses <em>Buses</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.hardware.HardwarePackage#getHardwareContainerA()
 * @model abstract="true"
 * @generated
 */
public interface HardwareContainerA extends OaamBaseElementA {
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
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections in this hardware model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getHardwareContainerA_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

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

	/**
	 * Returns the value of the '<em><b>Buses</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Bus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All buses in the hardware.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buses</em>' containment reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getHardwareContainerA_Buses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bus> getBuses();

} // HardwareContainerA
