/**
 */
package de.oaam.model.oaam.safety.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.*;

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
 * @see de.oaam.model.oaam.safety.SafetyPackage
 * @generated
 */
public class SafetySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SafetyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetySwitch() {
		if (modelPackage == null) {
			modelPackage = SafetyPackage.eINSTANCE;
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
			case SafetyPackage.PART_FAILURE_MODE: {
				PartFailureMode partFailureMode = (PartFailureMode)theEObject;
				T result = casePartFailureMode(partFailureMode);
				if (result == null) result = caseOaamBaseElementA(partFailureMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyPackage.FAILURE_EFFECT: {
				FailureEffect failureEffect = (FailureEffect)theEObject;
				T result = caseFailureEffect(failureEffect);
				if (result == null) result = caseOaamBaseElementA(failureEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyPackage.FAULT_PROPAGATION: {
				FaultPropagation faultPropagation = (FaultPropagation)theEObject;
				T result = caseFaultPropagation(faultPropagation);
				if (result == null) result = caseOaamBaseElementA(faultPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyPackage.FAILURE_PROVIDER_A: {
				FailureProviderA failureProviderA = (FailureProviderA)theEObject;
				T result = caseFailureProviderA(failureProviderA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE_SET: {
				FunctionalFailureModeSet functionalFailureModeSet = (FunctionalFailureModeSet)theEObject;
				T result = caseFunctionalFailureModeSet(functionalFailureModeSet);
				if (result == null) result = caseOaamBaseElementA(functionalFailureModeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE: {
				FunctionalFailureMode functionalFailureMode = (FunctionalFailureMode)theEObject;
				T result = caseFunctionalFailureMode(functionalFailureMode);
				if (result == null) result = caseOaamBaseElementA(functionalFailureMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT: {
				RequirementFailureEffect requirementFailureEffect = (RequirementFailureEffect)theEObject;
				T result = caseRequirementFailureEffect(requirementFailureEffect);
				if (result == null) result = caseOaamBaseElementA(requirementFailureEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Failure Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartFailureMode(PartFailureMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureEffect(FailureEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultPropagation(FaultPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Provider A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Provider A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureProviderA(FailureProviderA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Failure Mode Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Failure Mode Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalFailureModeSet(FunctionalFailureModeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Failure Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalFailureMode(FunctionalFailureMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Failure Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Failure Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementFailureEffect(RequirementFailureEffect object) {
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

} //SafetySwitch
