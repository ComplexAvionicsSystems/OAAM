/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.ElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An I/O group defines a set of I/Os that are in relation. For instance, all I/Os on the same physical connector.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.IoGroup#getIos <em>Ios</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getIoGroup()
 * @model
 * @generated
 */
public interface IoGroup extends ElementA {
	/**
	 * Returns the value of the '<em><b>Ios</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.IoDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all I/Os in this group. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ios</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getIoGroup_Ios()
	 * @model
	 * @generated
	 */
	EList<IoDeclaration> getIos();

} // IoGroup
