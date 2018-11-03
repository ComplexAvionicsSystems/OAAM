/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.ConnectionType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Type Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connetion restriction force signals to use or avoid a certain connction type. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.ConnectionTypeRestriction#getConnectionTypeName <em>Connection Type Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.ConnectionTypeRestriction#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.ConnectionTypeRestriction#getConnectionTypes <em>Connection Types</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionTypeRestriction()
 * @model
 * @generated
 */
public interface ConnectionTypeRestriction extends SignalRestrictionA, SignalGroupRestrictionA, SubfunctionRestrictionA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Connection Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual reference to the connection type to be used or not used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type Name</em>' attribute.
	 * @see #setConnectionTypeName(String)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionTypeRestriction_ConnectionTypeName()
	 * @model
	 * @generated
	 */
	String getConnectionTypeName();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.ConnectionTypeRestriction#getConnectionTypeName <em>Connection Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type Name</em>' attribute.
	 * @see #getConnectionTypeName()
	 * @generated
	 */
	void setConnectionTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * false = use only this connection type. true = avoid this connection type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionTypeRestriction_IsForbidden()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.ConnectionTypeRestriction#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Connection Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection type(s) to be used or avoided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Types</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getConnectionTypeRestriction_ConnectionTypes()
	 * @model
	 * @generated
	 */
	EList<ConnectionType> getConnectionTypes();

} // ConnectionTypeRestriction
