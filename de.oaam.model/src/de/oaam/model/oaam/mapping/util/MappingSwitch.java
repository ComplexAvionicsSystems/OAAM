/**
 */
package de.oaam.model.oaam.mapping.util;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.mapping.*;

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
 * @see de.oaam.model.oaam.mapping.MappingPackage
 * @generated
 */
public class MappingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSwitch() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
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
			case MappingPackage.MAPPING_CONTAINER_A: {
				MappingContainerA mappingContainerA = (MappingContainerA)theEObject;
				T result = caseMappingContainerA(mappingContainerA);
				if (result == null) result = case_ElementA(mappingContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.TASK_ASSIGNMENT: {
				TaskAssignment taskAssignment = (TaskAssignment)theEObject;
				T result = caseTaskAssignment(taskAssignment);
				if (result == null) result = case_ElementA(taskAssignment);
				if (result == null) result = case_VariantDependentElementA(taskAssignment);
				if (result == null) result = case_ModeDependentElementA(taskAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.SIGNAL_ASSIGNMENT: {
				SignalAssignment signalAssignment = (SignalAssignment)theEObject;
				T result = caseSignalAssignment(signalAssignment);
				if (result == null) result = case_ElementA(signalAssignment);
				if (result == null) result = case_VariantDependentElementA(signalAssignment);
				if (result == null) result = case_ModeDependentElementA(signalAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.CONNECTION_ASSIGNMENT: {
				ConnectionAssignment connectionAssignment = (ConnectionAssignment)theEObject;
				T result = caseConnectionAssignment(connectionAssignment);
				if (result == null) result = case_ElementA(connectionAssignment);
				if (result == null) result = case_VariantDependentElementA(connectionAssignment);
				if (result == null) result = case_ModeDependentElementA(connectionAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.SIGNAL_ASSIGNMENT_SEGMENT: {
				SignalAssignmentSegment signalAssignmentSegment = (SignalAssignmentSegment)theEObject;
				T result = caseSignalAssignmentSegment(signalAssignmentSegment);
				if (result == null) result = case_ElementA(signalAssignmentSegment);
				if (result == null) result = case_VariantDependentElementA(signalAssignmentSegment);
				if (result == null) result = case_ModeDependentElementA(signalAssignmentSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.DEVICE_ASSIGNMENT: {
				DeviceAssignment deviceAssignment = (DeviceAssignment)theEObject;
				T result = caseDeviceAssignment(deviceAssignment);
				if (result == null) result = case_ElementA(deviceAssignment);
				if (result == null) result = case_VariantDependentElementA(deviceAssignment);
				if (result == null) result = case_ModeDependentElementA(deviceAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.CONNECTION_ASSIGNMENT_SEGMENT: {
				ConnectionAssignmentSegment connectionAssignmentSegment = (ConnectionAssignmentSegment)theEObject;
				T result = caseConnectionAssignmentSegment(connectionAssignmentSegment);
				if (result == null) result = case_ElementA(connectionAssignmentSegment);
				if (result == null) result = case_VariantDependentElementA(connectionAssignmentSegment);
				if (result == null) result = case_ModeDependentElementA(connectionAssignmentSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.SUB_DEVICE_ASSIGNMENT: {
				SubDeviceAssignment subDeviceAssignment = (SubDeviceAssignment)theEObject;
				T result = caseSubDeviceAssignment(subDeviceAssignment);
				if (result == null) result = case_ElementA(subDeviceAssignment);
				if (result == null) result = case_VariantDependentElementA(subDeviceAssignment);
				if (result == null) result = case_ModeDependentElementA(subDeviceAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = caseMappingContainerA(mapping);
				if (result == null) result = case_ElementA(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.SUPMAPPING: {
				Supmapping supmapping = (Supmapping)theEObject;
				T result = caseSupmapping(supmapping);
				if (result == null) result = caseMappingContainerA(supmapping);
				if (result == null) result = case_ModeDependentElementA(supmapping);
				if (result == null) result = case_VariantDependentElementA(supmapping);
				if (result == null) result = case_ElementA(supmapping);
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
	public T caseMappingContainerA(MappingContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskAssignment(TaskAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalAssignment(SignalAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionAssignment(ConnectionAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Assignment Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Assignment Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalAssignmentSegment(SignalAssignmentSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceAssignment(DeviceAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Assignment Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Assignment Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionAssignmentSegment(ConnectionAssignmentSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Device Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Device Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubDeviceAssignment(SubDeviceAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supmapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supmapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupmapping(Supmapping object) {
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

} //MappingSwitch
