/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Atomic Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tasks referenced by this restriction must be hosted on the same hardware.
 * <!-- end-model-doc -->
 *
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskAtomicRestriction()
 * @model
 * @generated
 */
public interface TaskAtomicRestriction extends TaskRestrictionA, TaskGroupRestrictionA, SubfunctionRestrictionA, OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
} // TaskAtomicRestriction
