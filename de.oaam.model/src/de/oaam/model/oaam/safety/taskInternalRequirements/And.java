/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Boolean AND-Gate. The upstream expression must provide Boolean values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.And#getExprB <em>Expr B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.And#getExprA <em>Expr A</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends BooleanOperatorA {
	/**
	 * Returns the value of the '<em><b>Expr B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The second requirement component. The component must provide a Boolean value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expr B</em>' reference.
	 * @see #setExprB(RequirementComponentA)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getAnd_ExprB()
	 * @model
	 * @generated
	 */
	RequirementComponentA getExprB();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.And#getExprB <em>Expr B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr B</em>' reference.
	 * @see #getExprB()
	 * @generated
	 */
	void setExprB(RequirementComponentA value);

	/**
	 * Returns the value of the '<em><b>Expr A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first requirement component. The component must provide a Boolean value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expr A</em>' reference.
	 * @see #setExprA(RequirementComponentA)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getAnd_ExprA()
	 * @model
	 * @generated
	 */
	RequirementComponentA getExprA();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.And#getExprA <em>Expr A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr A</em>' reference.
	 * @see #getExprA()
	 * @generated
	 */
	void setExprA(RequirementComponentA value);

} // And
