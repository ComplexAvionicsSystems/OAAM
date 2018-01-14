/**
 */
package de.oaam.model.oaam.mapping;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Single active times within a schedule. In case the schedule is periodic, the active time slots repeat after the end of the period. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.ScheduledTime#getCycle <em>Cycle</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.ScheduledTime#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.ScheduledTime#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.ScheduledTime#isRestart <em>Restart</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.mapping.MappingPackage#getScheduledTime()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Role'"
 * @generated
 */
public interface ScheduledTime extends _ElementA, _ModeDependentElementA, _VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Cycle</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cycle id of this scheduled time. If several sheduled times for the same schedule exits, they should have consecutive ids. This enables different active times in sequential cycles of periodic tasks. Usually if only one active time is defined, the cycle should be 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cycle</em>' attribute.
	 * @see #setCycle(int)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getScheduledTime_Cycle()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getCycle();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.ScheduledTime#getCycle <em>Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle</em>' attribute.
	 * @see #getCycle()
	 * @generated
	 */
	void setCycle(int value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start time of the task relative to the period begin (periodic task) or absolute start point (non-periodic task) in [s].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(double)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getScheduledTime_StartTime()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getStartTime();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.ScheduledTime#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration of the task's active time. Enter 0 for if the task shall not be interrupted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getScheduledTime_Duration()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.ScheduledTime#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Restart</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the task is restarted at the begin of the active time or if a previously interrupted state is recovered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restart</em>' attribute.
	 * @see #setRestart(boolean)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getScheduledTime_Restart()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isRestart();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.ScheduledTime#isRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart</em>' attribute.
	 * @see #isRestart()
	 * @generated
	 */
	void setRestart(boolean value);

} // ScheduledTime
