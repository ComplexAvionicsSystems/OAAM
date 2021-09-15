/**
 */
package de.oaam.model.oaam.physical.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.physical.*;

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
 * @see de.oaam.model.oaam.physical.PhysicalPackage
 * @generated
 */
public class PhysicalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhysicalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalSwitch() {
		if (modelPackage == null) {
			modelPackage = PhysicalPackage.eINSTANCE;
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
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A: {
				PhysicalInteractionContainerA physicalInteractionContainerA = (PhysicalInteractionContainerA)theEObject;
				T result = casePhysicalInteractionContainerA(physicalInteractionContainerA);
				if (result == null) result = caseOaamBaseElementA(physicalInteractionContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = casePhysicalInterfaceA(sensor);
				if (result == null) result = caseOaamBaseElementA(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.EFFECTOR: {
				Effector effector = (Effector)theEObject;
				T result = caseEffector(effector);
				if (result == null) result = casePhysicalInterfaceA(effector);
				if (result == null) result = caseOaamBaseElementA(effector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.PHYSICAL_INTERFACE_A: {
				PhysicalInterfaceA physicalInterfaceA = (PhysicalInterfaceA)theEObject;
				T result = casePhysicalInterfaceA(physicalInterfaceA);
				if (result == null) result = caseOaamBaseElementA(physicalInterfaceA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.PHYSICAL_INTERACTION: {
				PhysicalInteraction physicalInteraction = (PhysicalInteraction)theEObject;
				T result = casePhysicalInteraction(physicalInteraction);
				if (result == null) result = casePhysicalInteractionContainerA(physicalInteraction);
				if (result == null) result = caseOaamBaseElementA(physicalInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.SUBPHYSICAL_INTERACTION: {
				SubphysicalInteraction subphysicalInteraction = (SubphysicalInteraction)theEObject;
				T result = caseSubphysicalInteraction(subphysicalInteraction);
				if (result == null) result = casePhysicalInteractionContainerA(subphysicalInteraction);
				if (result == null) result = caseOaamBaseElementA(subphysicalInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Container A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Container A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalInteractionContainerA(PhysicalInteractionContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffector(Effector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalInterfaceA(PhysicalInterfaceA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalInteraction(PhysicalInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subphysical Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subphysical Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubphysicalInteraction(SubphysicalInteraction object) {
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

} //PhysicalSwitch
