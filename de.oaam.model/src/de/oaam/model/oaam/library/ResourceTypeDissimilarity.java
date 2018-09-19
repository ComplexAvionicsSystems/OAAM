/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type Dissimilarity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource type is declared dissimilar to all other resource types in one dissimilarity group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceTypeDissimilarity#getResourceTypes <em>Resource Types</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceTypeDissimilarity()
 * @model
 * @generated
 */
public interface ResourceTypeDissimilarity extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Resource Types</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource types that are dissimilar
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Types</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceTypeDissimilarity_ResourceTypes()
	 * @model
	 * @generated
	 */
	EList<ResourceType> getResourceTypes();

} // ResourceTypeDissimilarity
