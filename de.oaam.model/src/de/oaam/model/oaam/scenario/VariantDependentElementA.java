/**
 */
package de.oaam.model.oaam.scenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Dependent Element A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Supertype for elements that can occur in variants
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.scenario.VariantDependentElementA#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getVariantDependentElementA()
 * @model abstract="true"
 * @generated
 */
public interface VariantDependentElementA extends EObject {
	/**
	 * Returns the value of the '<em><b>Variants</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.scenario.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variants for which this element is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variants</em>' reference list.
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getVariantDependentElementA_Variants()
	 * @model
	 * @generated
	 */
	EList<Variant> getVariants();

} // VariantDependentElementA
