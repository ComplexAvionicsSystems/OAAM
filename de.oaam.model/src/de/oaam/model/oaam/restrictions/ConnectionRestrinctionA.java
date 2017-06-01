/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.hardware.Connection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Restrinction A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for connection restrictions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.ConnectionRestrinctionA#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionRestrinctionA()
 * @model abstract="true"
 * @generated
 */
public interface ConnectionRestrinctionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all allowed or connections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionRestrinctionA_Connections()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnections();

} // ConnectionRestrinctionA
