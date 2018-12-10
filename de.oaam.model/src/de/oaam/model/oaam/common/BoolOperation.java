/**
 */
package de.oaam.model.oaam.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Boolean function with two to infinit inputs. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.BoolOperation#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.BoolOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.BoolOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getBoolOperation()
 * @model
 * @generated
 */
public interface BoolOperation extends BoolA, OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.BoolOperationTypesE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the type of the Boolean operation, e.g. AND, OR, XOR, ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.oaam.model.oaam.common.BoolOperationTypesE
	 * @see #setType(BoolOperationTypesE)
	 * @see de.oaam.model.oaam.common.CommonPackage#getBoolOperation_Type()
	 * @model required="true"
	 * @generated
	 */
	BoolOperationTypesE getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.BoolOperation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.oaam.model.oaam.common.BoolOperationTypesE
	 * @see #getType()
	 * @generated
	 */
	void setType(BoolOperationTypesE value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The left hand operand of the Boolean operation. This can also be a Boolean operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(BoolA)
	 * @see de.oaam.model.oaam.common.CommonPackage#getBoolOperation_Left()
	 * @model required="true"
	 * @generated
	 */
	BoolA getLeft();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.BoolOperation#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BoolA value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The right hand operand of the Boolean operation. This can also be a Boolean operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(BoolA)
	 * @see de.oaam.model.oaam.common.CommonPackage#getBoolOperation_Right()
	 * @model required="true"
	 * @generated
	 */
	BoolA getRight();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.BoolOperation#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BoolA value);

} // BoolOperation
