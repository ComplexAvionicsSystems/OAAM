/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.ElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The declaration of an I/O. An I/O is a physical communication device
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.IoDeclaration#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getIoDeclaration()
 * @model
 * @generated
 */
public interface IoDeclaration extends ElementA {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References connecting resources of the device itself. More than one connecting resource can be referenced. Moreover, a connecting resource can be referenced by more than one connector. These are typically shared I/Os
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getIoDeclaration_Resources()
	 * @model required="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // IoDeclaration
