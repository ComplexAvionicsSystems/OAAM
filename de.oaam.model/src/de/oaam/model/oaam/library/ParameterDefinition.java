/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.DataTypeA;
import de.oaam.model.oaam.common.ElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Static parameters that change the behavior of a function, e.g. the P, I, and D scalars of a PID controller 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ParameterDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getParameterDefinition()
 * @model
 * @generated
 */
public interface ParameterDefinition extends ElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of a parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataTypeA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getParameterDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	DataTypeA getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ParameterDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypeA value);

} // ParameterDefinition
