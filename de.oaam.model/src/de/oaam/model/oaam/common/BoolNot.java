/**
 */
package de.oaam.model.oaam.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Boolean not operation. The output is the negated input
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.BoolNot#getIn <em>In</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getBoolNot()
 * @model
 * @generated
 */
public interface BoolNot extends BoolA, OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the variable to be negated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(BoolA)
	 * @see de.oaam.model.oaam.common.CommonPackage#getBoolNot_In()
	 * @model required="true"
	 * @generated
	 */
	BoolA getIn();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.BoolNot#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(BoolA value);

} // BoolNot
