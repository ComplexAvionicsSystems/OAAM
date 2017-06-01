/**
 */
package de.oaam.model.oaam.restrictions.util;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.restrictions.*;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

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
				if (result == null) result = case_ElementA(restrictionsContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.RESTRICTIONS: {
				Restrictions restrictions = (Restrictions)theEObject;
				T result = caseRestrictions(restrictions);
				if (result == null) result = caseRestrictionsContainerA(restrictions);
				if (result == null) result = case_ElementA(restrictions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.SUBRESTRICTIONS: {
				Subrestrictions subrestrictions = (Subrestrictions)theEObject;
				T result = caseSubrestrictions(subrestrictions);
				if (result == null) result = caseRestrictionsContainerA(subrestrictions);
				if (result == null) result = case_VariantDependentElementA(subrestrictions);
				if (result == null) result = case_ModeDependentElementA(subrestrictions);
				if (result == null) result = case_ElementA(subrestrictions);
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
			case RestrictionsPackage.SUB_FUNCTION_RESTRICTION_A: {
				SubFunctionRestrictionA subFunctionRestrictionA = (SubFunctionRestrictionA)theEObject;
				T result = caseSubFunctionRestrictionA(subFunctionRestrictionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.PATH_RESTRICTION_A: {
				PathRestrictionA pathRestrictionA = (PathRestrictionA)theEObject;
				T result = casePathRestrictionA(pathRestrictionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.PATH_SEGMENT: {
				PathSegment pathSegment = (PathSegment)theEObject;
				T result = casePathSegment(pathSegment);
				if (result == null) result = case_ElementA(pathSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.TASK_GROUP_RESTRICTION_A: {
				TaskGroupRestrictionA taskGroupRestrictionA = (TaskGroupRestrictionA)theEObject;
				T result = caseTaskGroupRestrictionA(taskGroupRestrictionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.INPUT_RESTRICTION_A: {
				InputRestrictionA inputRestrictionA = (InputRestrictionA)theEObject;
				T result = caseInputRestrictionA(inputRestrictionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.LOCATION_RESTRICTION: {
				LocationRestriction locationRestriction = (LocationRestriction)theEObject;
				T result = caseLocationRestriction(locationRestriction);
				if (result == null) result = caseTaskRestrictionA(locationRestriction);
				if (result == null) result = caseSignalRestrictionA(locationRestriction);
				if (result == null) result = caseSubFunctionRestrictionA(locationRestriction);
				if (result == null) result = caseDeviceRestrictionA(locationRestriction);
				if (result == null) result = caseConnectionRestrinctionA(locationRestriction);
				if (result == null) result = case_ElementA(locationRestriction);
				if (result == null) result = case_VariantDependentElementA(locationRestriction);
				if (result == null) result = case_ModeDependentElementA(locationRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.AREA_RESTRICTION: {
				AreaRestriction areaRestriction = (AreaRestriction)theEObject;
				T result = caseAreaRestriction(areaRestriction);
				if (result == null) result = caseTaskRestrictionA(areaRestriction);
				if (result == null) result = caseSignalRestrictionA(areaRestriction);
				if (result == null) result = caseSubFunctionRestrictionA(areaRestriction);
				if (result == null) result = caseDeviceRestrictionA(areaRestriction);
				if (result == null) result = caseConnectionRestrinctionA(areaRestriction);
				if (result == null) result = case_ElementA(areaRestriction);
				if (result == null) result = case_VariantDependentElementA(areaRestriction);
				if (result == null) result = case_ModeDependentElementA(areaRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.POWER_SOURCE_RESTRICTION: {
				PowerSourceRestriction powerSourceRestriction = (PowerSourceRestriction)theEObject;
				T result = casePowerSourceRestriction(powerSourceRestriction);
				if (result == null) result = caseTaskRestrictionA(powerSourceRestriction);
				if (result == null) result = caseDeviceRestrictionA(powerSourceRestriction);
				if (result == null) result = caseSignalRestrictionA(powerSourceRestriction);
				if (result == null) result = caseSubFunctionRestrictionA(powerSourceRestriction);
				if (result == null) result = case_ElementA(powerSourceRestriction);
				if (result == null) result = case_VariantDependentElementA(powerSourceRestriction);
				if (result == null) result = case_ModeDependentElementA(powerSourceRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.DEVICE_RESTRICTION: {
				DeviceRestriction deviceRestriction = (DeviceRestriction)theEObject;
				T result = caseDeviceRestriction(deviceRestriction);
				if (result == null) result = caseTaskRestrictionA(deviceRestriction);
				if (result == null) result = caseSignalRestrictionA(deviceRestriction);
				if (result == null) result = caseSubFunctionRestrictionA(deviceRestriction);
				if (result == null) result = case_ElementA(deviceRestriction);
				if (result == null) result = case_VariantDependentElementA(deviceRestriction);
				if (result == null) result = case_ModeDependentElementA(deviceRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.DEVICE_TYPE_RESTRICTION: {
				DeviceTypeRestriction deviceTypeRestriction = (DeviceTypeRestriction)theEObject;
				T result = caseDeviceTypeRestriction(deviceTypeRestriction);
				if (result == null) result = caseTaskRestrictionA(deviceTypeRestriction);
				if (result == null) result = caseSignalRestrictionA(deviceTypeRestriction);
				if (result == null) result = caseSubFunctionRestrictionA(deviceTypeRestriction);
				if (result == null) result = case_ElementA(deviceTypeRestriction);
				if (result == null) result = case_VariantDependentElementA(deviceTypeRestriction);
				if (result == null) result = case_ModeDependentElementA(deviceTypeRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.CONECTION_TYPE_RESTRICTION: {
				ConectionTypeRestriction conectionTypeRestriction = (ConectionTypeRestriction)theEObject;
				T result = caseConectionTypeRestriction(conectionTypeRestriction);
				if (result == null) result = caseSignalRestrictionA(conectionTypeRestriction);
				if (result == null) result = caseSubFunctionRestrictionA(conectionTypeRestriction);
				if (result == null) result = case_ElementA(conectionTypeRestriction);
				if (result == null) result = case_VariantDependentElementA(conectionTypeRestriction);
				if (result == null) result = case_ModeDependentElementA(conectionTypeRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.CONNECTION_RESTRICTION: {
				ConnectionRestriction connectionRestriction = (ConnectionRestriction)theEObject;
				T result = caseConnectionRestriction(connectionRestriction);
				if (result == null) result = caseSignalRestrictionA(connectionRestriction);
				if (result == null) result = caseSubFunctionRestrictionA(connectionRestriction);
				if (result == null) result = case_ElementA(connectionRestriction);
				if (result == null) result = case_VariantDependentElementA(connectionRestriction);
				if (result == null) result = case_ModeDependentElementA(connectionRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.SEGREGATION_RESTRICTION: {
				SegregationRestriction segregationRestriction = (SegregationRestriction)theEObject;
				T result = caseSegregationRestriction(segregationRestriction);
				if (result == null) result = case_ElementA(segregationRestriction);
				if (result == null) result = case_ModeDependentElementA(segregationRestriction);
				if (result == null) result = case_VariantDependentElementA(segregationRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.TASK_RATE_RESTRICTION: {
				TaskRateRestriction taskRateRestriction = (TaskRateRestriction)theEObject;
				T result = caseTaskRateRestriction(taskRateRestriction);
				if (result == null) result = caseTaskRestrictionA(taskRateRestriction);
				if (result == null) result = case_ElementA(taskRateRestriction);
				if (result == null) result = case_ModeDependentElementA(taskRateRestriction);
				if (result == null) result = case_VariantDependentElementA(taskRateRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.INPUT_SYNCHRONICITY_RESTRICTION: {
				InputSynchronicityRestriction inputSynchronicityRestriction = (InputSynchronicityRestriction)theEObject;
				T result = caseInputSynchronicityRestriction(inputSynchronicityRestriction);
				if (result == null) result = caseInputRestrictionA(inputSynchronicityRestriction);
				if (result == null) result = case_ElementA(inputSynchronicityRestriction);
				if (result == null) result = case_ModeDependentElementA(inputSynchronicityRestriction);
				if (result == null) result = case_VariantDependentElementA(inputSynchronicityRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.PATH_DELAY_RESTRICTION: {
				PathDelayRestriction pathDelayRestriction = (PathDelayRestriction)theEObject;
				T result = casePathDelayRestriction(pathDelayRestriction);
				if (result == null) result = casePathRestrictionA(pathDelayRestriction);
				if (result == null) result = case_ElementA(pathDelayRestriction);
				if (result == null) result = case_ModeDependentElementA(pathDelayRestriction);
				if (result == null) result = case_VariantDependentElementA(pathDelayRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.TASK_ATOMIC_RESTRICTION: {
				TaskAtomicRestriction taskAtomicRestriction = (TaskAtomicRestriction)theEObject;
				T result = caseTaskAtomicRestriction(taskAtomicRestriction);
				if (result == null) result = caseTaskRestrictionA(taskAtomicRestriction);
				if (result == null) result = case_ElementA(taskAtomicRestriction);
				if (result == null) result = case_ModeDependentElementA(taskAtomicRestriction);
				if (result == null) result = case_VariantDependentElementA(taskAtomicRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestrictionsPackage.TASK_SYMMETRY_RESTRICTION: {
				TaskSymmetryRestriction taskSymmetryRestriction = (TaskSymmetryRestriction)theEObject;
				T result = caseTaskSymmetryRestriction(taskSymmetryRestriction);
				if (result == null) result = caseTaskRestrictionA(taskSymmetryRestriction);
				if (result == null) result = case_ElementA(taskSymmetryRestriction);
				if (result == null) result = case_ModeDependentElementA(taskSymmetryRestriction);
				if (result == null) result = case_VariantDependentElementA(taskSymmetryRestriction);
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
	 * Returns the result of interpreting the object as an instance of '<em>Sub Function Restriction A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Function Restriction A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubFunctionRestrictionA(SubFunctionRestrictionA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Restriction A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Restriction A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathRestrictionA(PathRestrictionA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathSegment(PathSegment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Input Restriction A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Restriction A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputRestrictionA(InputRestrictionA object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Task Rate Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Rate Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRateRestriction(TaskRateRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Synchronicity Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Synchronicity Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputSynchronicityRestriction(InputSynchronicityRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Delay Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Delay Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathDelayRestriction(PathDelayRestriction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_ElementA(_ElementA object) {
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
	public T case_VariantDependentElementA(_VariantDependentElementA object) {
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
	public T case_ModeDependentElementA(_ModeDependentElementA object) {
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
