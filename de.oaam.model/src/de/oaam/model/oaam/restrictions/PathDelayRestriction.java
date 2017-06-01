/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Delay Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restricts a path of signal transmissions and task executions to be below a given upper time limit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.PathDelayRestriction#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPathDelayRestriction()
 * @model
 * @generated
 */
public interface PathDelayRestriction extends PathRestrictionA, _ElementA, _ModeDependentElementA, _VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed delay for the path in seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(float)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPathDelayRestriction_Delay()
	 * @model default="1" required="true"
	 * @generated
	 */
	float getDelay();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.PathDelayRestriction#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(float value);

} // PathDelayRestriction
