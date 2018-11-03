/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Output Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The trigger condition for the output. If the trigger condition is true, the output is calculated. A trigger is either a Boolean combination of available inputs or a fixed rate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.TaskOutputTrigger#getLogic <em>Logic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskOutputTrigger#getFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskOutputTrigger#isIsFixedRate <em>Is Fixed Rate</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger()
 * @model
 * @generated
 */
public interface TaskOutputTrigger extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean logic of inputs that cause the output to be calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logic</em>' containment reference.
	 * @see #setLogic(BoolA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger_Logic()
	 * @model containment="true"
	 * @generated
	 */
	BoolA getLogic();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskOutputTrigger#getLogic <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' containment reference.
	 * @see #getLogic()
	 * @generated
	 */
	void setLogic(BoolA value);

	/**
	 * Returns the value of the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixed rate, in which the output shall be calculated, given in Hz. This is only the default rate. The rate can be overwritten with the task instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Rate</em>' attribute.
	 * @see #setFixedRate(float)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger_FixedRate()
	 * @model required="true"
	 * @generated
	 */
	float getFixedRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskOutputTrigger#getFixedRate <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Rate</em>' attribute.
	 * @see #getFixedRate()
	 * @generated
	 */
	void setFixedRate(float value);

	/**
	 * Returns the value of the '<em><b>Is Fixed Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true the output is calculated at a fixed rate and the fixedRate attribute must be set. If false, the output is calculated if a certain combinations of inputs is available. In the latter case logics must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Fixed Rate</em>' attribute.
	 * @see #setIsFixedRate(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskOutputTrigger_IsFixedRate()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsFixedRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskOutputTrigger#isIsFixedRate <em>Is Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fixed Rate</em>' attribute.
	 * @see #isIsFixedRate()
	 * @generated
	 */
	void setIsFixedRate(boolean value);

} // TaskOutputTrigger
