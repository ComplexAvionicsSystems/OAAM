/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.hardware.Connection;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connection restriction forces signals to use or avaid a certain connection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.ConnectionRestriction#getConnectionName <em>Connection Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.ConnectionRestriction#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.ConnectionRestriction#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionRestriction()
 * @model
 * @generated
 */
public interface ConnectionRestriction extends SignalRestrictionA, SubFunctionRestrictionA, _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Connection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual reference to the connection to be used or avoided. In case the connection model is not available. This can be resolved later.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Name</em>' attribute.
	 * @see #setConnectionName(String)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionRestriction_ConnectionName()
	 * @model
	 * @generated
	 */
	String getConnectionName();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.ConnectionRestriction#getConnectionName <em>Connection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Name</em>' attribute.
	 * @see #getConnectionName()
	 * @generated
	 */
	void setConnectionName(String value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * false = use only this connection. false = this connection is forbidden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionRestriction_IsForbidden()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.ConnectionRestriction#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection(s) to be used or avoided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionRestriction_Connections()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnections();

} // ConnectionRestriction
