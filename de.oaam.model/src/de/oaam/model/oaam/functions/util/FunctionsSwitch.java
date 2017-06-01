/**
 */
package de.oaam.model.oaam.functions.util;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.functions.*;

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
 * @see de.oaam.model.oaam.functions.FunctionsPackage
 * @generated
 */
public class FunctionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FunctionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsSwitch() {
		if (modelPackage == null) {
			modelPackage = FunctionsPackage.eINSTANCE;
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
			case FunctionsPackage.FUNCTIONS: {
				Functions functions = (Functions)theEObject;
				T result = caseFunctions(functions);
				if (result == null) result = caseFunctionsContainerA(functions);
				if (result == null) result = case_ElementA(functions);
				if (result == null) result = case_VariantDependentElementA(functions);
				if (result == null) result = case_ModeDependentElementA(functions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.FUNCTIONS_CONTAINER_A: {
				FunctionsContainerA functionsContainerA = (FunctionsContainerA)theEObject;
				T result = caseFunctionsContainerA(functionsContainerA);
				if (result == null) result = case_ElementA(functionsContainerA);
				if (result == null) result = case_VariantDependentElementA(functionsContainerA);
				if (result == null) result = case_ModeDependentElementA(functionsContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = case_ElementA(task);
				if (result == null) result = case_VariantDependentElementA(task);
				if (result == null) result = case_ModeDependentElementA(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK_LINK: {
				TaskLink taskLink = (TaskLink)theEObject;
				T result = caseTaskLink(taskLink);
				if (result == null) result = case_ElementA(taskLink);
				if (result == null) result = case_ModeDependentElementA(taskLink);
				if (result == null) result = case_VariantDependentElementA(taskLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK_GROUP: {
				TaskGroup taskGroup = (TaskGroup)theEObject;
				T result = caseTaskGroup(taskGroup);
				if (result == null) result = case_ElementA(taskGroup);
				if (result == null) result = case_ModeDependentElementA(taskGroup);
				if (result == null) result = case_VariantDependentElementA(taskGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK_SYMMETRY: {
				TaskSymmetry taskSymmetry = (TaskSymmetry)theEObject;
				T result = caseTaskSymmetry(taskSymmetry);
				if (result == null) result = case_ElementA(taskSymmetry);
				if (result == null) result = case_ModeDependentElementA(taskSymmetry);
				if (result == null) result = case_VariantDependentElementA(taskSymmetry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK_REDUNDANCY: {
				TaskRedundancy taskRedundancy = (TaskRedundancy)theEObject;
				T result = caseTaskRedundancy(taskRedundancy);
				if (result == null) result = case_ElementA(taskRedundancy);
				if (result == null) result = case_ModeDependentElementA(taskRedundancy);
				if (result == null) result = case_VariantDependentElementA(taskRedundancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.FAILURE_CONDITION: {
				FailureCondition failureCondition = (FailureCondition)theEObject;
				T result = caseFailureCondition(failureCondition);
				if (result == null) result = case_ElementA(failureCondition);
				if (result == null) result = case_ModeDependentElementA(failureCondition);
				if (result == null) result = case_VariantDependentElementA(failureCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SYSTEM_INPUT_STATE: {
				SystemInputState systemInputState = (SystemInputState)theEObject;
				T result = caseSystemInputState(systemInputState);
				if (result == null) result = caseBoolA(systemInputState);
				if (result == null) result = case_ElementA(systemInputState);
				if (result == null) result = case_ModeDependentElementA(systemInputState);
				if (result == null) result = case_VariantDependentElementA(systemInputState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T result = caseSignal(signal);
				if (result == null) result = case_ElementA(signal);
				if (result == null) result = case_VariantDependentElementA(signal);
				if (result == null) result = case_ModeDependentElementA(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SIGNAL_GROUP: {
				SignalGroup signalGroup = (SignalGroup)theEObject;
				T result = caseSignalGroup(signalGroup);
				if (result == null) result = case_ElementA(signalGroup);
				if (result == null) result = case_ModeDependentElementA(signalGroup);
				if (result == null) result = case_VariantDependentElementA(signalGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = case_ElementA(input);
				if (result == null) result = case_VariantDependentElementA(input);
				if (result == null) result = case_ModeDependentElementA(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = case_ElementA(output);
				if (result == null) result = case_VariantDependentElementA(output);
				if (result == null) result = case_ModeDependentElementA(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.OUTPUT_LINK: {
				OutputLink outputLink = (OutputLink)theEObject;
				T result = caseOutputLink(outputLink);
				if (result == null) result = case_ElementA(outputLink);
				if (result == null) result = case_ModeDependentElementA(outputLink);
				if (result == null) result = case_VariantDependentElementA(outputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SUBFUNCTION: {
				Subfunction subfunction = (Subfunction)theEObject;
				T result = caseSubfunction(subfunction);
				if (result == null) result = caseFunctionsContainerA(subfunction);
				if (result == null) result = case_ElementA(subfunction);
				if (result == null) result = case_VariantDependentElementA(subfunction);
				if (result == null) result = case_ModeDependentElementA(subfunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctions(Functions object) {
		return null;
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
	public T caseFunctionsContainerA(FunctionsContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskLink(TaskLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskGroup(TaskGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Symmetry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Symmetry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskSymmetry(TaskSymmetry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Redundancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Redundancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRedundancy(TaskRedundancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureCondition(FailureCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Input State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Input State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemInputState(SystemInputState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalGroup(SignalGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputLink(OutputLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subfunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subfunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubfunction(Subfunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bool A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolA(BoolA object) {
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

} //FunctionsSwitch
