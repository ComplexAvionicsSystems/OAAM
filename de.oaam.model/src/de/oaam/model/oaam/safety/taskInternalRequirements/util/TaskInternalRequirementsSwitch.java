/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.taskInternalRequirements.*;

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
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage
 * @generated
 */
public class TaskInternalRequirementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaskInternalRequirementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInternalRequirementsSwitch() {
		if (modelPackage == null) {
			modelPackage = TaskInternalRequirementsPackage.eINSTANCE;
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
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT: {
				TaskInternalRequirement taskInternalRequirement = (TaskInternalRequirement)theEObject;
				T result = caseTaskInternalRequirement(taskInternalRequirement);
				if (result == null) result = caseOaamBaseElementA(taskInternalRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.REQUIREMENT_COMPONENT_A: {
				RequirementComponentA requirementComponentA = (RequirementComponentA)theEObject;
				T result = caseRequirementComponentA(requirementComponentA);
				if (result == null) result = caseOaamBaseElementA(requirementComponentA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.COMPARATOR_A: {
				ComparatorA comparatorA = (ComparatorA)theEObject;
				T result = caseComparatorA(comparatorA);
				if (result == null) result = caseRequirementComponentA(comparatorA);
				if (result == null) result = caseOaamBaseElementA(comparatorA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.AGREEMENT: {
				Agreement agreement = (Agreement)theEObject;
				T result = caseAgreement(agreement);
				if (result == null) result = caseComparatorA(agreement);
				if (result == null) result = caseRequirementComponentA(agreement);
				if (result == null) result = caseOaamBaseElementA(agreement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.BELOW: {
				Below below = (Below)theEObject;
				T result = caseBelow(below);
				if (result == null) result = caseComparatorA(below);
				if (result == null) result = caseRequirementComponentA(below);
				if (result == null) result = caseOaamBaseElementA(below);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.ABOVE: {
				Above above = (Above)theEObject;
				T result = caseAbove(above);
				if (result == null) result = caseComparatorA(above);
				if (result == null) result = caseRequirementComponentA(above);
				if (result == null) result = caseOaamBaseElementA(above);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.SOURCE_A: {
				SourceA sourceA = (SourceA)theEObject;
				T result = caseSourceA(sourceA);
				if (result == null) result = caseRequirementComponentA(sourceA);
				if (result == null) result = caseOaamBaseElementA(sourceA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.IO_SIGNAL: {
				IoSignal ioSignal = (IoSignal)theEObject;
				T result = caseIoSignal(ioSignal);
				if (result == null) result = caseSourceA(ioSignal);
				if (result == null) result = caseRequirementComponentA(ioSignal);
				if (result == null) result = caseOaamBaseElementA(ioSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseSourceA(value);
				if (result == null) result = caseRequirementComponentA(value);
				if (result == null) result = caseOaamBaseElementA(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.COMPLEX_OPERATOR_A: {
				ComplexOperatorA complexOperatorA = (ComplexOperatorA)theEObject;
				T result = caseComplexOperatorA(complexOperatorA);
				if (result == null) result = caseRequirementComponentA(complexOperatorA);
				if (result == null) result = caseOaamBaseElementA(complexOperatorA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.BOOL_TIMEOUT: {
				BoolTimeout boolTimeout = (BoolTimeout)theEObject;
				T result = caseBoolTimeout(boolTimeout);
				if (result == null) result = caseComplexOperatorA(boolTimeout);
				if (result == null) result = caseRequirementComponentA(boolTimeout);
				if (result == null) result = caseOaamBaseElementA(boolTimeout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.BOOLEAN_OPERATOR_A: {
				BooleanOperatorA booleanOperatorA = (BooleanOperatorA)theEObject;
				T result = caseBooleanOperatorA(booleanOperatorA);
				if (result == null) result = caseRequirementComponentA(booleanOperatorA);
				if (result == null) result = caseOaamBaseElementA(booleanOperatorA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBooleanOperatorA(and);
				if (result == null) result = caseRequirementComponentA(and);
				if (result == null) result = caseOaamBaseElementA(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBooleanOperatorA(or);
				if (result == null) result = caseRequirementComponentA(or);
				if (result == null) result = caseOaamBaseElementA(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseBooleanOperatorA(not);
				if (result == null) result = caseRequirementComponentA(not);
				if (result == null) result = caseOaamBaseElementA(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskInternalRequirementsPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseComplexOperatorA(contract);
				if (result == null) result = caseRequirementComponentA(contract);
				if (result == null) result = caseOaamBaseElementA(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Internal Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Internal Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInternalRequirement(TaskInternalRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Component A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Component A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementComponentA(RequirementComponentA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparator A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparator A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparatorA(ComparatorA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreement(Agreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Below</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Below</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBelow(Below object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Above</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Above</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbove(Above object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceA(SourceA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoSignal(IoSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Operator A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Operator A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexOperatorA(ComplexOperatorA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Timeout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolTimeout(BoolTimeout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operator A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operator A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperatorA(BooleanOperatorA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
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

} //TaskInternalRequirementsSwitch
