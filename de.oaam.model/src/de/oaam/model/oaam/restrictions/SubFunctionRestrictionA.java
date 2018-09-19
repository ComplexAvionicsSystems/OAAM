/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.functions.Subfunctions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subfunction Restriction A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class of sub-function restrictions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.SubfunctionRestrictionA#getSubfunctions <em>Subfunctions</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSubfunctionRestrictionA()
 * @model abstract="true"
 * @generated
 */
public interface SubfunctionRestrictionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Subfunctions</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Subfunctions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sub functions this constraint applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subfunctions</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSubfunctionRestrictionA_Subfunctions()
	 * @model
	 * @generated
	 */
	EList<Subfunctions> getSubfunctions();

} // SubfunctionRestrictionA
