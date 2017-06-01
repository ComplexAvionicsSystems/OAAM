/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.DuctType;
import de.oaam.model.oaam.library.LocationType;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible mapping of a connection to a location or duct.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.ConnectionCapability#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.ConnectionCapability#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.ConnectionCapability#getDuctType <em>Duct Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getConnectionCapability()
 * @model
 * @generated
 */
public interface ConnectionCapability extends CapabilityA, _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection type for which this capability is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type</em>' reference.
	 * @see #setConnectionType(ConnectionType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getConnectionCapability_ConnectionType()
	 * @model required="true"
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.ConnectionCapability#getConnectionType <em>Connection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' reference.
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either a location type or a duct type can be targets for a connection assignment. Never both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Type</em>' reference.
	 * @see #setLocationType(LocationType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getConnectionCapability_LocationType()
	 * @model
	 * @generated
	 */
	LocationType getLocationType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.ConnectionCapability#getLocationType <em>Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type</em>' reference.
	 * @see #getLocationType()
	 * @generated
	 */
	void setLocationType(LocationType value);

	/**
	 * Returns the value of the '<em><b>Duct Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either a location type or a duct type can be targets for a connection assignment. Never both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duct Type</em>' reference.
	 * @see #setDuctType(DuctType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getConnectionCapability_DuctType()
	 * @model
	 * @generated
	 */
	DuctType getDuctType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.ConnectionCapability#getDuctType <em>Duct Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duct Type</em>' reference.
	 * @see #getDuctType()
	 * @generated
	 */
	void setDuctType(DuctType value);

} // ConnectionCapability
