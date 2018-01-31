/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.functions.Signal;
import de.oaam.model.oaam.functions.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A path segment is either a task or a signal. Do not set both in one segment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.PathSegment#getTask <em>Task</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.PathSegment#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPathSegment()
 * @model
 * @generated
 */
public interface PathSegment extends ElementA {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The task referenced by this segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPathSegment_Task()
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.PathSegment#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signal referenced by this segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPathSegment_Signal()
	 * @model
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.PathSegment#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // PathSegment
