/**
 */
package de.oaam.model.oaam.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Provider Instance A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A super class for all instance of resource providers, e.g. not only device types but also devices or locations
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceProviderInstanceA#getRequiredModifiers <em>Required Modifiers</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceProviderInstanceA()
 * @model abstract="true"
 * @generated
 */
public interface ResourceProviderInstanceA extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Modifiers</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceTypeModifierLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This modifier is inherited from resource consumers mapped to this provider
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Modifiers</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceProviderInstanceA_RequiredModifiers()
	 * @model
	 * @generated
	 */
	EList<ResourceTypeModifierLevel> getRequiredModifiers();

} // ResourceProviderInstanceA
