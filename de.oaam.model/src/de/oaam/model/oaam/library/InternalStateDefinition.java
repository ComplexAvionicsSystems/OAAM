/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.DataTypeA;
import de.oaam.model.oaam.common.ElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal State Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The internal state of a task. An internal state is a memory in which results are saved that are persitent between two invocations, i.e. the I of a PID controller.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.InternalStateDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getInternalStateDefinition()
 * @model
 * @generated
 */
public interface InternalStateDefinition extends ElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of an internal state variable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataTypeA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getInternalStateDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	DataTypeA getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.InternalStateDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypeA value);

} // InternalStateDefinition
