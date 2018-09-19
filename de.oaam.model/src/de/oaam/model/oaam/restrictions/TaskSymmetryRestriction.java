/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Symmetry Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restricts two tasks to be mapped to symmetric targets. Targets can be locations, devices or areas
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.TaskSymmetryRestriction#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskSymmetryRestriction()
 * @model
 * @generated
 */
public interface TaskSymmetryRestriction extends TaskRestrictionA, OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.restrictions.SymmetryTypesE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of symmetry to enforce.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.oaam.model.oaam.restrictions.SymmetryTypesE
	 * @see #setType(SymmetryTypesE)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskSymmetryRestriction_Type()
	 * @model required="true"
	 * @generated
	 */
	SymmetryTypesE getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.TaskSymmetryRestriction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.oaam.model.oaam.restrictions.SymmetryTypesE
	 * @see #getType()
	 * @generated
	 */
	void setType(SymmetryTypesE value);

} // TaskSymmetryRestriction
