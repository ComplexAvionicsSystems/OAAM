/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of common location properties and resources
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.LocationType#isIsJoint <em>Is Joint</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LocationType#getDuctOpeningDeclarations <em>Duct Opening Declarations</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getLocationType()
 * @model
 * @generated
 */
public interface LocationType extends ResourceProviderA, OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Is Joint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true this stated that this is not a real location for devices, but a cable route joint point only
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Joint</em>' attribute.
	 * @see #setIsJoint(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLocationType_IsJoint()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsJoint();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.LocationType#isIsJoint <em>Is Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Joint</em>' attribute.
	 * @see #isIsJoint()
	 * @generated
	 */
	void setIsJoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Duct Opening Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DuctOpeningDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A duct opening is the point where connection cables can enter or leave a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duct Opening Declarations</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLocationType_DuctOpeningDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DuctOpeningDeclaration> getDuctOpeningDeclarations();

} // LocationType
