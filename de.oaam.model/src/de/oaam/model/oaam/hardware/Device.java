/**
 */
package de.oaam.model.oaam.hardware;

import de.oaam.model.oaam.anatomy.Location;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.PowerSource;
import de.oaam.model.oaam.library.ResourceProviderInstanceA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A device is a hardware unit which is a standalone box or a subdevice in another device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.hardware.Device#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.Device#getIos <em>Ios</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.Device#getSubdevices <em>Subdevices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.Device#getLocationBinding <em>Location Binding</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.Device#getPowerSources <em>Power Sources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.Device#getSubconnections <em>Subconnections</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.hardware.HardwarePackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends ResourceProviderInstanceA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the device type, which specifies the available resources and I/Os.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DeviceType)
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getDevice_Type()
	 * @model
	 * @generated
	 */
	DeviceType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.hardware.Device#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Ios</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Io}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All I/Os of this device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ios</em>' containment reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getDevice_Ios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Io> getIos();

	/**
	 * Returns the value of the '<em><b>Subdevices</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subdevices of this device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subdevices</em>' containment reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getDevice_Subdevices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getSubdevices();

	/**
	 * Returns the value of the '<em><b>Location Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a device - like a sensor - is bound to a fixed location this can be done by this reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Binding</em>' reference.
	 * @see #setLocationBinding(Location)
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getDevice_LocationBinding()
	 * @model
	 * @generated
	 */
	Location getLocationBinding();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.hardware.Device#getLocationBinding <em>Location Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Binding</em>' reference.
	 * @see #getLocationBinding()
	 * @generated
	 */
	void setLocationBinding(Location value);

	/**
	 * Returns the value of the '<em><b>Power Sources</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.PowerSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The power source(s) of this device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Sources</em>' reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getDevice_PowerSources()
	 * @model
	 * @generated
	 */
	EList<PowerSource> getPowerSources();

	/**
	 * Returns the value of the '<em><b>Subconnections</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connections only existing within this device. The go from one subdevice to another.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subconnections</em>' containment reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getDevice_Subconnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getSubconnections();

} // Device
