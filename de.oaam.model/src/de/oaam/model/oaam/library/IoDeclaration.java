/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;

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
 *   <li>{@link de.oaam.model.oaam.library.IoDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getIoDeclaration()
 * @model
 * @generated
 */
public interface IoDeclaration extends OaamBaseElementA {
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

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to a specific type of the IO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(IoType)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getIoDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
	IoType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.IoDeclaration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(IoType value);

} // IoDeclaration
