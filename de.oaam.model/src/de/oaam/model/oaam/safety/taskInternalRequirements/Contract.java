/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A contract specifies a conditional requirement fullfillment. The contract is fulfillable if (1) the invariant is fulfillable and (2) the post-condition is fulfillable when the pre-condition is fulfillable. If the pre-condition is not fulfillable the contract is not evaluatable, i.e. the contract needs not to be fulfillable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getInvariant <em>Invariant</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends ComplexOperatorA {
	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pre-condition of the contract. If fulfillable, the post-condition must also be fulfillable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Condition</em>' reference.
	 * @see #setPreCondition(RequirementComponentA)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getContract_PreCondition()
	 * @model
	 * @generated
	 */
	RequirementComponentA getPreCondition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getPreCondition <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(RequirementComponentA value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The post-condition which must be fulfillable if the pre-condition is met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Condition</em>' reference.
	 * @see #setPostCondition(RequirementComponentA)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getContract_PostCondition()
	 * @model
	 * @generated
	 */
	RequirementComponentA getPostCondition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getPostCondition <em>Post Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(RequirementComponentA value);

	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The invariant that must always hold i.e. must always be fulfillable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariant</em>' reference.
	 * @see #setInvariant(RequirementComponentA)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getContract_Invariant()
	 * @model
	 * @generated
	 */
	RequirementComponentA getInvariant();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getInvariant <em>Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' reference.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(RequirementComponentA value);

} // Contract
