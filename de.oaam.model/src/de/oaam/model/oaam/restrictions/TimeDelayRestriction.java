/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.functions.Task;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Delay Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Enforces a maximum transprotation delay between the start task and the end task
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.TimeDelayRestriction#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.TimeDelayRestriction#getStartTask <em>Start Task</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.TimeDelayRestriction#getEndTask <em>End Task</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTimeDelayRestriction()
 * @model
 * @generated
 */
public interface TimeDelayRestriction extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
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
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTimeDelayRestriction_Delay()
	 * @model default="1" required="true"
	 * @generated
	 */
	float getDelay();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.TimeDelayRestriction#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(float value);

	/**
	 * Returns the value of the '<em><b>Start Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Begin of the time delay: Start of this task
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Task</em>' reference.
	 * @see #setStartTask(Task)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTimeDelayRestriction_StartTask()
	 * @model required="true"
	 * @generated
	 */
	Task getStartTask();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.TimeDelayRestriction#getStartTask <em>Start Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Task</em>' reference.
	 * @see #getStartTask()
	 * @generated
	 */
	void setStartTask(Task value);

	/**
	 * Returns the value of the '<em><b>End Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End of the time delay: Start of this task
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Task</em>' reference.
	 * @see #setEndTask(Task)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getTimeDelayRestriction_EndTask()
	 * @model required="true"
	 * @generated
	 */
	Task getEndTask();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.TimeDelayRestriction#getEndTask <em>End Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Task</em>' reference.
	 * @see #getEndTask()
	 * @generated
	 */
	void setEndTask(Task value);

} // TimeDelayRestriction
