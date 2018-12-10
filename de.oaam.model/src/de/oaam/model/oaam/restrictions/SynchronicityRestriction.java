/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronicity Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Forces task to be executed in a given time interval. Can used to force synchrounous outputs or sensor reads
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.SynchronicityRestriction#getMaxJitter <em>Max Jitter</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSynchronicityRestriction()
 * @model
 * @generated
 */
public interface SynchronicityRestriction extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA, TaskRestrictionA {
	/**
	 * Returns the value of the '<em><b>Max Jitter</b></em>' attribute.
	 * The default value is <code>"0.001"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed absolute time difference between all inputs under this constraint in seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Jitter</em>' attribute.
	 * @see #setMaxJitter(float)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSynchronicityRestriction_MaxJitter()
	 * @model default="0.001" required="true"
	 * @generated
	 */
	float getMaxJitter();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.SynchronicityRestriction#getMaxJitter <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Jitter</em>' attribute.
	 * @see #getMaxJitter()
	 * @generated
	 */
	void setMaxJitter(float value);

} // SynchronicityRestriction
