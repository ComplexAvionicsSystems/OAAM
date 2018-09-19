/**
 */
package de.oaam.model.oaam.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Provider A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for resource providing elements, e.g. devices, locations, ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceProviderA#getProvidedBundles <em>Provided Bundles</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceProviderA#getPossibleResourceProvisions <em>Possible Resource Provisions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceProviderA#getProvidedGroups <em>Provided Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceProviderA#getResourceLinks <em>Resource Links</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceProviderA()
 * @model abstract="true"
 * @generated
 */
public interface ResourceProviderA extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceBundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources are provided in bundles. A bundle can contain one or more instance of a resource type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Bundles</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceProviderA_ProvidedBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceBundle> getProvidedBundles();

	/**
	 * Returns the value of the '<em><b>Possible Resource Provisions</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A possibility to declare possible resource types for this resource provider before the actual resource instances are declared
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible Resource Provisions</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceProviderA_PossibleResourceProvisions()
	 * @model
	 * @generated
	 */
	EList<ResourceType> getPossibleResourceProvisions();

	/**
	 * Returns the value of the '<em><b>Provided Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource groups can organize the resource of a provider, e.g. to represent connectors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Groups</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceProviderA_ProvidedGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceGroup> getProvidedGroups();

	/**
	 * Returns the value of the '<em><b>Resource Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource dependencies specify the interconnection of resources in the resource provider, e.g. to represent power distribution and galvanic isolation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Links</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceProviderA_ResourceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceLink> getResourceLinks();

} // ResourceProviderA
