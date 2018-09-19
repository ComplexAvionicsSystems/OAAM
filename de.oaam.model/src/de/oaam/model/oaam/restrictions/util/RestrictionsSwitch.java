/**
 */
package de.oaam.model.oaam.restrictions.util;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.restrictions.*;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage
 * @generated
 */
public class RestrictionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestrictionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsSwitch() {
		if (modelPackage == null) {
			modelPackage = RestrictionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A: {
				RestrictionsContainerA restrictionsContainerA = (RestrictionsContainerA)theEObject;
				T result = caseRestrictionsContainerA(restrictionsContainerA);
				if (result == null) result = caseOaamBaseElementA(restrictionsContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.RESTRICTIONS: {
				Restrictions restrictions = (Restrictions)theEObject;
				T result = caseRestrictions(restrictions);
				if (result == null) result = caseRestrictionsContainerA(restrictions);
				if (result == null) result = caseOaamBaseElementA(restrictions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.DEVICE_RESTRICTION_A: {
				DeviceRestrictionA deviceRestrictionA = (DeviceRestrictionA)theEObject;
				T result = caseDeviceRestrictionA(deviceRestrictionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.CONNECTION_RESTRINCTION_A: {
				ConnectionRestrinctionA connectionRestrinctionA = (ConnectionRestrinctionA)theEObject;
				T result = caseConnectionRestrinctionA(connectionRestrinctionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.TASK_RESTRICTION_A: {
				TaskRestrictionA taskRestrictionA = (TaskRestrictionA)theEObject;
				T result = caseTaskRestrictionA(taskRestrictionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.SIGNAL_RESTRICTION_A: {
				SignalRestrictionA signalRestrictionA = (SignalRestrictionA)theEObject;
				T result = caseSignalRestrictionA(signalRestrictionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.SUBFUNCTION_RESTRICTION_A: {
				SubfunctionRestrictionA subfunctionRestrictionA = (SubfunctionRestrictionA)theEObject;
				T result = caseSubfunctionRestrictionA(subfunctionRestrictionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.TASK_GROUP_RESTRICTION_A: {
				TaskGroupRestrictionA taskGroupRestrictionA = (TaskGroupRestrictionA)theEObject;
				T result = caseTaskGroupRestrictionA(taskGroupRestrictionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.LOCATION_RESTRICTION: {
				LocationRestriction locationRestriction = (LocationRestriction)theEObject;
				T result = caseLocationRestriction(locationRestriction);
				if (result == null) result = caseTaskRestrictionA(locationRestriction);
				if (result == null) result = caseSignalRestrictionA(locationRestriction);
				if (result == null) result = caseSubfunctionRestrictionA(locationRestriction);
				if (result == null) result = caseDeviceRestrictionA(locationRestriction);
				if (result == null) result = caseConnectionRestrinctionA(locationRestriction);
				if (result == null) result = caseOaamBaseElementA(locationRestriction);
				if (result == null) result = caseVariantDependentElementA(locationRestriction);
				if (result == null) result = caseModeDependentElementA(locationRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.AREA_RESTRICTION: {
				AreaRestriction areaRestriction = (AreaRestriction)theEObject;
				T result = caseAreaRestriction(areaRestriction);
				if (result == null) result = caseTaskRestrictionA(areaRestriction);
				if (result == null) result = caseSignalRestrictionA(areaRestriction);
				if (result == null) result = caseSubfunctionRestrictionA(areaRestriction);
				if (result == null) result = caseDeviceRestrictionA(areaRestriction);
				if (result == null) result = caseConnectionRestrinctionA(areaRestriction);
				if (result == null) result = caseOaamBaseElementA(areaRestriction);
				if (result == null) result = caseVariantDependentElementA(areaRestriction);
				if (result == null) result = caseModeDependentElementA(areaRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.POWER_SOURCE_RESTRICTION: {
				PowerSourceRestriction powerSourceRestriction = (PowerSourceRestriction)theEObject;
				T result = casePowerSourceRestriction(powerSourceRestriction);
				if (result == null) result = caseTaskRestrictionA(powerSourceRestriction);
				if (result == null) result = caseDeviceRestrictionA(powerSourceRestriction);
				if (result == null) result = caseSignalRestrictionA(powerSourceRestriction);
				if (result == null) result = caseSubfunctionRestrictionA(powerSourceRestriction);
				if (result == null) result = caseOaamBaseElementA(powerSourceRestriction);
				if (result == null) result = caseVariantDependentElementA(powerSourceRestriction);
				if (result == null) result = caseModeDependentElementA(powerSourceRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.DEVICE_RESTRICTION: {
				DeviceRestriction deviceRestriction = (DeviceRestriction)theEObject;
				T result = caseDeviceRestriction(deviceRestriction);
				if (result == null) result = caseTaskRestrictionA(deviceRestriction);
				if (result == null) result = caseSignalRestrictionA(deviceRestriction);
				if (result == null) result = caseSubfunctionRestrictionA(deviceRestriction);
				if (result == null) result = caseOaamBaseElementA(deviceRestriction);
				if (result == null) result = caseVariantDependentElementA(deviceRestriction);
				if (result == null) result = caseModeDependentElementA(deviceRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.DEVICE_TYPE_RESTRICTION: {
				DeviceTypeRestriction deviceTypeRestriction = (DeviceTypeRestriction)theEObject;
				T result = caseDeviceTypeRestriction(deviceTypeRestriction);
				if (result == null) result = caseTaskRestrictionA(deviceTypeRestriction);
				if (result == null) result = caseSignalRestrictionA(deviceTypeRestriction);
				if (result == null) result = caseSubfunctionRestrictionA(deviceTypeRestriction);
				if (result == null) result = caseOaamBaseElementA(deviceTypeRestriction);
				if (result == null) result = caseVariantDependentElementA(deviceTypeRestriction);
				if (result == null) result = caseModeDependentElementA(deviceTypeRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.CONECTION_TYPE_RESTRICTION: {
				ConectionTypeRestriction conectionTypeRestriction = (ConectionTypeRestriction)theEObject;
				T result = caseConectionTypeRestriction(conectionTypeRestriction);
				if (result == null) result = caseSignalRestrictionA(conectionTypeRestriction);
				if (result == null) result = caseSubfunctionRestrictionA(conectionTypeRestriction);
				if (result == null) result = caseOaamBaseElementA(conectionTypeRestriction);
				if (result == null) result = caseVariantDependentElementA(conectionTypeRestriction);
				if (result == null) result = caseModeDependentElementA(conectionTypeRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.CONNECTION_RESTRICTION: {
				ConnectionRestriction connectionRestriction = (ConnectionRestriction)theEObject;
				T result = caseConnectionRestriction(connectionRestriction);
				if (result == null) result = caseSignalRestrictionA(connectionRestriction);
				if (result == null) result = caseSubfunctionRestrictionA(connectionRestriction);
				if (result == null) result = caseOaamBaseElementA(connectionRestriction);
				if (result == null) result = caseVariantDependentElementA(connectionRestriction);
				if (result == null) result = caseModeDependentElementA(connectionRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.SEGREGATION_RESTRICTION: {
				SegregationRestriction segregationRestriction = (SegregationRestriction)theEObject;
				T result = caseSegregationRestriction(segregationRestriction);
				if (result == null) result = caseOaamBaseElementA(segregationRestriction);
				if (result == null) result = caseModeDependentElementA(segregationRestriction);
				if (result == null) result = caseVariantDependentElementA(segregationRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION: {
				SynchronicityRestriction synchronicityRestriction = (SynchronicityRestriction)theEObject;
				T result = caseSynchronicityRestriction(synchronicityRestriction);
				if (result == null) result = caseOaamBaseElementA(synchronicityRestriction);
				if (result == null) result = caseModeDependentElementA(synchronicityRestriction);
				if (result == null) result = caseVariantDependentElementA(synchronicityRestriction);
				if (result == null) result = caseTaskRestrictionA(synchronicityRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.TASK_ATOMIC_RESTRICTION: {
				TaskAtomicRestriction taskAtomicRestriction = (TaskAtomicRestriction)theEObject;
				T result = caseTaskAtomicRestriction(taskAtomicRestriction);
				if (result == null) result = caseTaskRestrictionA(taskAtomicRestriction);
				if (result == null) result = caseOaamBaseElementA(taskAtomicRestriction);
				if (result == null) result = caseModeDependentElementA(taskAtomicRestriction);
				if (result == null) result = caseVariantDependentElementA(taskAtomicRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.TASK_SYMMETRY_RESTRICTION: {
				TaskSymmetryRestriction taskSymmetryRestriction = (TaskSymmetryRestriction)theEObject;
				T result = caseTaskSymmetryRestriction(taskSymmetryRestriction);
				if (result == null) result = caseTaskRestrictionA(taskSymmetryRestriction);
				if (result == null) result = caseOaamBaseElementA(taskSymmetryRestriction);
				if (result == null) result = caseModeDependentElementA(taskSymmetryRestriction);
				if (result == null) result = caseVariantDependentElementA(taskSymmetryRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.TIME_DELAY_RESTRICTION: {
				TimeDelayRestriction timeDelayRestriction = (TimeDelayRestriction)theEObject;
				T result = caseTimeDelayRestriction(timeDelayRestriction);
				if (result == null) result = caseOaamBaseElementA(timeDelayRestriction);
				if (result == null) result = caseModeDependentElementA(timeDelayRestriction);
				if (result == null) result = caseVariantDependentElementA(timeDelayRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.SUBRESTRICTIONS: {
				Subrestrictions subrestrictions = (Subrestrictions)theEObject;
				T result = caseSubrestrictions(subrestrictions);
				if (result == null) result = caseRestrictionsContainerA(subrestrictions);
				if (result == null) result = caseVariantDependentElementA(subrestrictions);
				if (result == null) result = caseModeDependentElementA(subrestrictions);
				if (result == null) result = caseOaamBaseElementA(subrestrictions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionsContainerA(RestrictionsContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restrictions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restrictions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictions(Restrictions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Restriction A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Restriction A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceRestrictionA(DeviceRestrictionA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Restrinction A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Restrinction A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionRestrinctionA(ConnectionRestrinctionA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Restriction A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Restriction A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRestrictionA(TaskRestrictionA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Restriction A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Restriction A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalRestrictionA(SignalRestrictionA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subfunction Restriction A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subfunction Restriction A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubfunctionRestrictionA(SubfunctionRestrictionA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Group Restriction A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Group Restriction A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskGroupRestrictionA(TaskGroupRestrictionA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationRestriction(LocationRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaRestriction(AreaRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Source Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Source Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSourceRestriction(PowerSourceRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceRestriction(DeviceRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Type Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Type Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceTypeRestriction(DeviceTypeRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conection Type Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conection Type Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConectionTypeRestriction(ConectionTypeRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionRestriction(ConnectionRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segregation Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segregation Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegregationRestriction(SegregationRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronicity Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronicity Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronicityRestriction(SynchronicityRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Atomic Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Atomic Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskAtomicRestriction(TaskAtomicRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Symmetry Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Symmetry Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskSymmetryRestriction(TaskSymmetryRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Delay Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Delay Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeDelayRestriction(TimeDelayRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrestrictions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrestrictions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrestrictions(Subrestrictions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOaamBaseElementA(OaamBaseElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantDependentElementA(VariantDependentElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDependentElementA(ModeDependentElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RestrictionsSwitch
