/**
 */
package de.oaam.model.oaam.anatomy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage
 * @generated
 */
public interface AnatomyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnatomyFactory eINSTANCE = de.oaam.model.oaam.anatomy.impl.AnatomyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area</em>'.
	 * @generated
	 */
	Area createArea();

	/**
	 * Returns a new object of class '<em>Duct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duct</em>'.
	 * @generated
	 */
	Duct createDuct();

	/**
	 * Returns a new object of class '<em>Duct Opening</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duct Opening</em>'.
	 * @generated
	 */
	DuctOpening createDuctOpening();

	/**
	 * Returns a new object of class '<em>Position3 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position3 D</em>'.
	 * @generated
	 */
	Position3D createPosition3D();

	/**
	 * Returns a new object of class '<em>Location Symmetry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Symmetry</em>'.
	 * @generated
	 */
	LocationSymmetry createLocationSymmetry();

	/**
	 * Returns a new object of class '<em>Area Symmetry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Symmetry</em>'.
	 * @generated
	 */
	AreaSymmetry createAreaSymmetry();

	/**
	 * Returns a new object of class '<em>Anatomy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anatomy</em>'.
	 * @generated
	 */
	Anatomy createAnatomy();

	/**
	 * Returns a new object of class '<em>Subanatomy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subanatomy</em>'.
	 * @generated
	 */
	Subanatomy createSubanatomy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnatomyPackage getAnatomyPackage();

} //AnatomyFactory
