/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparator A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract definition of comparator. A comparator compares two incoming valued requirement components A and B.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA#getCompA <em>Comp A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA#getCompB <em>Comp B</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getComparatorA()
 * @model abstract="true"
 * @generated
 */
public interface ComparatorA extends RequirementComponentA {
	/**
	 * Returns the value of the '<em><b>Comp A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A upstream requirements component providing of any type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comp A</em>' reference.
	 * @see #setCompA(RequirementComponentA)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getComparatorA_CompA()
	 * @model
	 * @generated
	 */
	RequirementComponentA getCompA();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA#getCompA <em>Comp A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp A</em>' reference.
	 * @see #getCompA()
	 * @generated
	 */
	void setCompA(RequirementComponentA value);

	/**
	 * Returns the value of the '<em><b>Comp B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A upstream requirements component providing of any type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comp B</em>' reference.
	 * @see #setCompB(RequirementComponentA)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getComparatorA_CompB()
	 * @model
	 * @generated
	 */
	RequirementComponentA getCompB();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA#getCompB <em>Comp B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp B</em>' reference.
	 * @see #getCompB()
	 * @generated
	 */
	void setCompB(RequirementComponentA value);

} // ComparatorA
