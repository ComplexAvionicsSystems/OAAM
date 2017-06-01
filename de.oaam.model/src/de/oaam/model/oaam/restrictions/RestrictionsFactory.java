/**
 */
package de.oaam.model.oaam.restrictions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage
 * @generated
 */
public interface RestrictionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestrictionsFactory eINSTANCE = de.oaam.model.oaam.restrictions.impl.RestrictionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Restrictions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restrictions</em>'.
	 * @generated
	 */
	Restrictions createRestrictions();

	/**
	 * Returns a new object of class '<em>Subrestrictions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrestrictions</em>'.
	 * @generated
	 */
	Subrestrictions createSubrestrictions();

	/**
	 * Returns a new object of class '<em>Path Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Segment</em>'.
	 * @generated
	 */
	PathSegment createPathSegment();

	/**
	 * Returns a new object of class '<em>Location Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Restriction</em>'.
	 * @generated
	 */
	LocationRestriction createLocationRestriction();

	/**
	 * Returns a new object of class '<em>Area Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Restriction</em>'.
	 * @generated
	 */
	AreaRestriction createAreaRestriction();

	/**
	 * Returns a new object of class '<em>Power Source Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Source Restriction</em>'.
	 * @generated
	 */
	PowerSourceRestriction createPowerSourceRestriction();

	/**
	 * Returns a new object of class '<em>Device Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Restriction</em>'.
	 * @generated
	 */
	DeviceRestriction createDeviceRestriction();

	/**
	 * Returns a new object of class '<em>Device Type Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Type Restriction</em>'.
	 * @generated
	 */
	DeviceTypeRestriction createDeviceTypeRestriction();

	/**
	 * Returns a new object of class '<em>Conection Type Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conection Type Restriction</em>'.
	 * @generated
	 */
	ConectionTypeRestriction createConectionTypeRestriction();

	/**
	 * Returns a new object of class '<em>Connection Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Restriction</em>'.
	 * @generated
	 */
	ConnectionRestriction createConnectionRestriction();

	/**
	 * Returns a new object of class '<em>Segregation Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segregation Restriction</em>'.
	 * @generated
	 */
	SegregationRestriction createSegregationRestriction();

	/**
	 * Returns a new object of class '<em>Task Rate Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Rate Restriction</em>'.
	 * @generated
	 */
	TaskRateRestriction createTaskRateRestriction();

	/**
	 * Returns a new object of class '<em>Input Synchronicity Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Synchronicity Restriction</em>'.
	 * @generated
	 */
	InputSynchronicityRestriction createInputSynchronicityRestriction();

	/**
	 * Returns a new object of class '<em>Path Delay Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Delay Restriction</em>'.
	 * @generated
	 */
	PathDelayRestriction createPathDelayRestriction();

	/**
	 * Returns a new object of class '<em>Task Atomic Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Atomic Restriction</em>'.
	 * @generated
	 */
	TaskAtomicRestriction createTaskAtomicRestriction();

	/**
	 * Returns a new object of class '<em>Task Symmetry Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Symmetry Restriction</em>'.
	 * @generated
	 */
	TaskSymmetryRestriction createTaskSymmetryRestriction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RestrictionsPackage getRestrictionsPackage();

} //RestrictionsFactory
