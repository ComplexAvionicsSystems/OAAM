/**
 */
package de.oaam.model.oaam.hardware;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.ResourceProviderInstanceA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connection is a communication line between two devices. It can be a single wire, a bus or even wireless depending on the connection type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.hardware.Connection#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.Connection#getEndPoints <em>End Points</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.hardware.HardwarePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends ResourceProviderInstanceA, ElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the type of the connection. The type specifies the properties, like topology and provided resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ConnectionType)
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getConnection_Type()
	 * @model
	 * @generated
	 */
	ConnectionType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.hardware.Connection#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>End Points</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Io}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All endpoints of the connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Points</em>' reference list.
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getConnection_EndPoints()
	 * @model
	 * @generated
	 */
	EList<Io> getEndPoints();

} // Connection
