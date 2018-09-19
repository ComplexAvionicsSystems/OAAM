/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Alternatives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Alternative resources can be used to define resources types and amounts that can be used instead of the current resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceAlternatives#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceAlternatives()
 * @model
 * @generated
 */
public interface ResourceAlternatives extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of the type(s) and numbers of resources needed as alternatives 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceAlternatives_Resources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // ResourceAlternatives
