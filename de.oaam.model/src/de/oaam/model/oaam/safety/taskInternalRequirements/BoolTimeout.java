/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Timeout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A delayed fulfillment of the upstream requirement component. The component expresses, that a fulfillment of the upstream requirement is considered after x seconds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getBoolTimeout()
 * @model
 * @generated
 */
public interface BoolTimeout extends ComplexOperatorA {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upstream requirement component, which must provide a Boolean value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expr</em>' reference.
	 * @see #setExpr(RequirementComponentA)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getBoolTimeout_Expr()
	 * @model
	 * @generated
	 */
	RequirementComponentA getExpr();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout#getExpr <em>Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(RequirementComponentA value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timeout in seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getBoolTimeout_Timeout()
	 * @model
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

} // BoolTimeout
