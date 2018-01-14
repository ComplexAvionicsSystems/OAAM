/**
 */
package de.oaam.model.oaam.mapping;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A schedule assigens periodic or non-periodic time slots to a task assignment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.Schedule#getRate <em>Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.Schedule#isIsPeriodic <em>Is Periodic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.Schedule#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.Schedule#getScheduledTimes <em>Scheduled Times</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.mapping.MappingPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends _ElementA, _ModeDependentElementA, _VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The execution rate of periodic tasks in [Hz]. Non-periodic tasks shall have a rate of 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSchedule_Rate()
	 * @model default="0.0"
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.Schedule#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

	/**
	 * Returns the value of the '<em><b>Is Periodic</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define this task as periodic or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Periodic</em>' attribute.
	 * @see #setIsPeriodic(boolean)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSchedule_IsPeriodic()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsPeriodic();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.Schedule#isIsPeriodic <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Periodic</em>' attribute.
	 * @see #isIsPeriodic()
	 * @generated
	 */
	void setIsPeriodic(boolean value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Higher values mean higher priority. Higher priority tasks are calculated before others in the same time slot in case of preemptive sheduling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSchedule_Priority()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.Schedule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Scheduled Times</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.mapping.ScheduledTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All active times of this schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduled Times</em>' containment reference list.
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSchedule_ScheduledTimes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ScheduledTime> getScheduledTimes();

} // Schedule
