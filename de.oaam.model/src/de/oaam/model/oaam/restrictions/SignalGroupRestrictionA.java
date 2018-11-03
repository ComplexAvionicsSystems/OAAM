/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.functions.SignalGroup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Group Restriction A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for signal group restrictions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.SignalGroupRestrictionA#getSignalGroups <em>Signal Groups</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSignalGroupRestrictionA()
 * @model abstract="true"
 * @generated
 */
public interface SignalGroupRestrictionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Signal Groups</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.SignalGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signals this constraint applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Groups</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSignalGroupRestrictionA_SignalGroups()
	 * @model
	 * @generated
	 */
	EList<SignalGroup> getSignalGroups();

} // SignalGroupRestrictionA
