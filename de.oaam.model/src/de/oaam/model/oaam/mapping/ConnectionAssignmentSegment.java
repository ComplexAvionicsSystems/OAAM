/**
 */
package de.oaam.model.oaam.mapping;

import de.oaam.model.oaam.anatomy.Duct;
import de.oaam.model.oaam.anatomy.Location;

import de.oaam.model.oaam.capabilities.ConnectionCapability;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Assignment Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connection segment is the mapping of a connection to either one location or duct. Many consecutive segment define a full connection mapping path
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getDuct <em>Duct</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.mapping.MappingPackage#getConnectionAssignmentSegment()
 * @model
 * @generated
 */
public interface ConnectionAssignmentSegment extends _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capability, which specifies the resource consumtion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(ConnectionCapability)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getConnectionAssignmentSegment_Capability()
	 * @model required="true"
	 * @generated
	 */
	ConnectionCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(ConnectionCapability value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only either a location or a duct can be set as target for connection segments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getConnectionAssignmentSegment_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Duct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only either a location or a duct can be set as target for connection segments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duct</em>' reference.
	 * @see #setDuct(Duct)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getConnectionAssignmentSegment_Duct()
	 * @model
	 * @generated
	 */
	Duct getDuct();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getDuct <em>Duct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duct</em>' reference.
	 * @see #getDuct()
	 * @generated
	 */
	void setDuct(Duct value);

} // ConnectionAssignmentSegment
