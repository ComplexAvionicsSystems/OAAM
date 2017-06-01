/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.functions.Subfunction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Function Restriction A</b></em>'.
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
 *   <li>{@link de.oaam.model.oaam.restrictions.SubFunctionRestrictionA#getSubFunctions <em>Sub Functions</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSubFunctionRestrictionA()
 * @model abstract="true"
 * @generated
 */
public interface SubFunctionRestrictionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Functions</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Subfunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sub functions this constraint applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Functions</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSubFunctionRestrictionA_SubFunctions()
	 * @model
	 * @generated
	 */
	EList<Subfunction> getSubFunctions();

} // SubFunctionRestrictionA
