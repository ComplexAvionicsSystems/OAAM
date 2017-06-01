/**
 */
package de.oaam.model.oaam.mapping;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.hardware.Connection;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A mapping of a connection to locations and ducts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.ConnectionAssignment#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.ConnectionAssignment#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.mapping.MappingPackage#getConnectionAssignment()
 * @model
 * @generated
 */
public interface ConnectionAssignment extends _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The segments of this connection mapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getConnectionAssignment_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionAssignmentSegment> getSegments();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getConnectionAssignment_Connection()
	 * @model required="true"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.ConnectionAssignment#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

} // ConnectionAssignment
