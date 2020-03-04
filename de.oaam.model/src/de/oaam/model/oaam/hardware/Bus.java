/**
 */
package de.oaam.model.oaam.hardware;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.BusType;
import de.oaam.model.oaam.library.ResourceProviderInstanceA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A bus is a group of devices and connections that share common properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.hardware.Bus#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.Bus#getConnections <em>Connections</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.Bus#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.hardware.HardwarePackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends ResourceProviderInstanceA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the hardware group type, which specifies the available device types and connection types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(BusType)
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getBus_Type()
	 * @model
	 * @generated
	 */
	BusType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.hardware.Bus#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(BusType value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections, which are part of this bus
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getBus_Connections()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All devices that are part of this hardware group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getBus_Devices()
	 * @model
	 * @generated
	 */
	EList<Device> getDevices();

} // Bus
