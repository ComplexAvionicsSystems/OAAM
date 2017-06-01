/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common._ElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root element of the restrictions model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getDeviceTypeRestrictions <em>Device Type Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getDeviceRestrictions <em>Device Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getLocationRestrictions <em>Location Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getAreaRestrictions <em>Area Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getPowerSourceRestrictions <em>Power Source Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getTaskAtomicRestrictions <em>Task Atomic Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getTaskSymmetryRestrictions <em>Task Symmetry Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getTaskRateRestrictions <em>Task Rate Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getInputSynchronicityRestriction <em>Input Synchronicity Restriction</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getConnectionRestrictions <em>Connection Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getConnectionTypeRestrictions <em>Connection Type Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getSegregationsRestrictions <em>Segregations Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getSignalDelayRestriction <em>Signal Delay Restriction</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getSubrestrictions <em>Subrestrictions</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA()
 * @model abstract="true"
 * @generated
 */
public interface RestrictionsContainerA extends _ElementA {
	/**
	 * Returns the value of the '<em><b>Device Type Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device type restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_DeviceTypeRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceTypeRestriction> getDeviceTypeRestrictions();

	/**
	 * Returns the value of the '<em><b>Device Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.DeviceRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_DeviceRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceRestriction> getDeviceRestrictions();

	/**
	 * Returns the value of the '<em><b>Location Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.LocationRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All location restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_LocationRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocationRestriction> getLocationRestrictions();

	/**
	 * Returns the value of the '<em><b>Area Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.AreaRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All area restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_AreaRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AreaRestriction> getAreaRestrictions();

	/**
	 * Returns the value of the '<em><b>Power Source Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.PowerSourceRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All power source restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Source Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_PowerSourceRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerSourceRestriction> getPowerSourceRestrictions();

	/**
	 * Returns the value of the '<em><b>Task Atomic Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.TaskAtomicRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All atomic restrictions for tasks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Atomic Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_TaskAtomicRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskAtomicRestriction> getTaskAtomicRestrictions();

	/**
	 * Returns the value of the '<em><b>Task Symmetry Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.TaskSymmetryRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All task symmetry Restrictions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Symmetry Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_TaskSymmetryRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskSymmetryRestriction> getTaskSymmetryRestrictions();

	/**
	 * Returns the value of the '<em><b>Task Rate Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.TaskRateRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All task rate restrictions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Rate Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_TaskRateRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskRateRestriction> getTaskRateRestrictions();

	/**
	 * Returns the value of the '<em><b>Input Synchronicity Restriction</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.InputSynchronicityRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All input synchronicity restrictions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Synchronicity Restriction</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_InputSynchronicityRestriction()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputSynchronicityRestriction> getInputSynchronicityRestriction();

	/**
	 * Returns the value of the '<em><b>Connection Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.ConnectionRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connection restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_ConnectionRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionRestriction> getConnectionRestrictions();

	/**
	 * Returns the value of the '<em><b>Connection Type Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.ConectionTypeRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connection type restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_ConnectionTypeRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConectionTypeRestriction> getConnectionTypeRestrictions();

	/**
	 * Returns the value of the '<em><b>Segregations Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.SegregationRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All segregation restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segregations Restrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_SegregationsRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SegregationRestriction> getSegregationsRestrictions();

	/**
	 * Returns the value of the '<em><b>Signal Delay Restriction</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.PathDelayRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All path delay restrictions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Delay Restriction</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_SignalDelayRestriction()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathDelayRestriction> getSignalDelayRestriction();

	/**
	 * Returns the value of the '<em><b>Subrestrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.Subrestrictions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subrestrictions enable to organize restrictions like folders.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subrestrictions</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getRestrictionsContainerA_Subrestrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subrestrictions> getSubrestrictions();

} // RestrictionsContainerA
