/**
 */
package de.oaam.model.oaam.systems;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An information flow from a systems input to a systems output
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.InformationFlow#getFrom <em>From</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.InformationFlow#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformationFlow()
 * @model
 * @generated
 */
public interface InformationFlow extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single source of this input
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ProvidedInformationA)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformationFlow_From()
	 * @model required="true"
	 * @generated
	 */
	ProvidedInformationA getFrom();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.InformationFlow#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ProvidedInformationA value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References to the receipients of this output
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(RequiredInformationA)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformationFlow_To()
	 * @model required="true"
	 * @generated
	 */
	RequiredInformationA getTo();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.InformationFlow#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(RequiredInformationA value);

} // InformationFlow
