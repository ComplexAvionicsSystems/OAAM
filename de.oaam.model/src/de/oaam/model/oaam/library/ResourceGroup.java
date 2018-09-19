/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grouping of the resources on the providers. For example to assign them to grouped connectors.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceGroup#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceGroup()
 * @model
 * @generated
 */
public interface ResourceGroup extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All resources in the same resource group. All resources must be children of one resource provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceGroup_Resources()
	 * @model
	 * @generated
	 */
	EList<Resource> getResources();

} // ResourceGroup
