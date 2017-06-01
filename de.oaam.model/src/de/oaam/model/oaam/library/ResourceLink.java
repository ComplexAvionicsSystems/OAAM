/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common._ElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specify how resources of a resources provider are linked. Linking is necessary to forward shared resources. This makes especially sense to express how power is forwarded through the interfaces
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceLink#getIn <em>In</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceLink#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceLink()
 * @model
 * @generated
 */
public interface ResourceLink extends _ElementA {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source resource of the resource provider
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceLink_In()
	 * @model required="true"
	 * @generated
	 */
	EList<Resource> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Destination resource of the resource provider
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceLink_Out()
	 * @model required="true"
	 * @generated
	 */
	EList<Resource> getOut();

} // ResourceLink
