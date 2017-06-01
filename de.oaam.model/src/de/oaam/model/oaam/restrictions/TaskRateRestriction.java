/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Rate Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restricts a task to be executed in a specified rate. Violations of that rate will be reported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.TaskRateRestriction#getRate <em>Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.TaskRateRestriction#getMaxDeviation <em>Max Deviation</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskRateRestriction()
 * @model
 * @generated
 */
public interface TaskRateRestriction extends TaskRestrictionA, _ElementA, _ModeDependentElementA, _VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixed rate, in which the output shall be calculated, given in Hz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(float)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskRateRestriction_Rate()
	 * @model default="10.0" required="true"
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.TaskRateRestriction#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

	/**
	 * Returns the value of the '<em><b>Max Deviation</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed relative deviation in the execution rate in %. Within this percentage the restriction is not violated. Default is 10% = 0.1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Deviation</em>' attribute.
	 * @see #setMaxDeviation(float)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTaskRateRestriction_MaxDeviation()
	 * @model default="0.1" required="true"
	 * @generated
	 */
	float getMaxDeviation();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.TaskRateRestriction#getMaxDeviation <em>Max Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Deviation</em>' attribute.
	 * @see #getMaxDeviation()
	 * @generated
	 */
	void setMaxDeviation(float value);

} // TaskRateRestriction
