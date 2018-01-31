/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Synchronicity Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Forces inputs to arrive within a given time interval. This is necessary for instance for voter tasks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.InputSynchronicityRestriction#getMaxJitter <em>Max Jitter</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getInputSynchronicityRestriction()
 * @model
 * @generated
 */
public interface InputSynchronicityRestriction extends InputRestrictionA, ElementA, ModeDependentElementA, VariantDependentElementA {
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
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getInputSynchronicityRestriction_MaxJitter()
	 * @model default="0.001" required="true"
	 * @generated
	 */
	float getMaxJitter();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.InputSynchronicityRestriction#getMaxJitter <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Jitter</em>' attribute.
	 * @see #getMaxJitter()
	 * @generated
	 */
	void setMaxJitter(float value);

} // InputSynchronicityRestriction
