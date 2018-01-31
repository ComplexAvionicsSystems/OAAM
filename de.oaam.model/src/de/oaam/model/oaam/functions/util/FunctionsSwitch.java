/**
 */
package de.oaam.model.oaam.functions.util;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.functions.*;

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
				if (result == null) result = caseElementA(functions);
				if (result == null) result = caseVariantDependentElementA(functions);
				if (result == null) result = caseModeDependentElementA(functions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.FUNCTIONS_CONTAINER_A: {
				FunctionsContainerA functionsContainerA = (FunctionsContainerA)theEObject;
				T result = caseFunctionsContainerA(functionsContainerA);
				if (result == null) result = caseElementA(functionsContainerA);
				if (result == null) result = caseVariantDependentElementA(functionsContainerA);
				if (result == null) result = caseModeDependentElementA(functionsContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseElementA(task);
				if (result == null) result = caseVariantDependentElementA(task);
				if (result == null) result = caseModeDependentElementA(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK_LINK: {
				TaskLink taskLink = (TaskLink)theEObject;
				T result = caseTaskLink(taskLink);
				if (result == null) result = caseElementA(taskLink);
				if (result == null) result = caseModeDependentElementA(taskLink);
				if (result == null) result = caseVariantDependentElementA(taskLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK_GROUP: {
				TaskGroup taskGroup = (TaskGroup)theEObject;
				T result = caseTaskGroup(taskGroup);
				if (result == null) result = caseElementA(taskGroup);
				if (result == null) result = caseModeDependentElementA(taskGroup);
				if (result == null) result = caseVariantDependentElementA(taskGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK_SYMMETRY: {
				TaskSymmetry taskSymmetry = (TaskSymmetry)theEObject;
				T result = caseTaskSymmetry(taskSymmetry);
				if (result == null) result = caseElementA(taskSymmetry);
				if (result == null) result = caseModeDependentElementA(taskSymmetry);
				if (result == null) result = caseVariantDependentElementA(taskSymmetry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TASK_REDUNDANCY: {
				TaskRedundancy taskRedundancy = (TaskRedundancy)theEObject;
				T result = caseTaskRedundancy(taskRedundancy);
				if (result == null) result = caseElementA(taskRedundancy);
				if (result == null) result = caseModeDependentElementA(taskRedundancy);
				if (result == null) result = caseVariantDependentElementA(taskRedundancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.FAILURE_CONDITION: {
				FailureCondition failureCondition = (FailureCondition)theEObject;
				T result = caseFailureCondition(failureCondition);
				if (result == null) result = caseElementA(failureCondition);
				if (result == null) result = caseModeDependentElementA(failureCondition);
				if (result == null) result = caseVariantDependentElementA(failureCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SYSTEM_INPUT_STATE: {
				SystemInputState systemInputState = (SystemInputState)theEObject;
				T result = caseSystemInputState(systemInputState);
				if (result == null) result = caseBoolA(systemInputState);
				if (result == null) result = caseElementA(systemInputState);
				if (result == null) result = caseModeDependentElementA(systemInputState);
				if (result == null) result = caseVariantDependentElementA(systemInputState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T result = caseSignal(signal);
				if (result == null) result = caseElementA(signal);
				if (result == null) result = caseVariantDependentElementA(signal);
				if (result == null) result = caseModeDependentElementA(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SIGNAL_GROUP: {
				SignalGroup signalGroup = (SignalGroup)theEObject;
				T result = caseSignalGroup(signalGroup);
				if (result == null) result = caseElementA(signalGroup);
				if (result == null) result = caseModeDependentElementA(signalGroup);
				if (result == null) result = caseVariantDependentElementA(signalGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseElementA(input);
				if (result == null) result = caseVariantDependentElementA(input);
				if (result == null) result = caseModeDependentElementA(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseElementA(output);
				if (result == null) result = caseVariantDependentElementA(output);
				if (result == null) result = caseModeDependentElementA(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.OUTPUT_LINK: {
				OutputLink outputLink = (OutputLink)theEObject;
				T result = caseOutputLink(outputLink);
				if (result == null) result = caseElementA(outputLink);
				if (result == null) result = caseModeDependentElementA(outputLink);
				if (result == null) result = caseVariantDependentElementA(outputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SUBFUNCTION: {
				Subfunction subfunction = (Subfunction)theEObject;
				T result = caseSubfunction(subfunction);
				if (result == null) result = caseFunctionsContainerA(subfunction);
				if (result == null) result = caseElementA(subfunction);
				if (result == null) result = caseVariantDependentElementA(subfunction);
				if (result == null) result = caseModeDependentElementA(subfunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseElementA(parameter);
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
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
	public T caseElementA(ElementA object) {
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
