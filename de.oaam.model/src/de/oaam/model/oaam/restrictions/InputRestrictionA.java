/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.functions.Input;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Restriction A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for task restrictions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.InputRestrictionA#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getInputRestrictionA()
 * @model abstract="true"
 * @generated
 */
public interface InputRestrictionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The task this constraint applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getInputRestrictionA_Inputs()
	 * @model
	 * @generated
	 */
	EList<Input> getInputs();

} // InputRestrictionA
