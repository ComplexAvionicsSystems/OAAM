/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.PropagatorA;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.*;

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
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage
 * @generated
 */
public class FailurePropagationMatricesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FailurePropagationMatricesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationMatricesSwitch() {
		if (modelPackage == null) {
			modelPackage = FailurePropagationMatricesPackage.eINSTANCE;
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
			case FailurePropagationMatricesPackage.FAILURE_PROPAGATION_MATRIX_A: {
				FailurePropagationMatrixA failurePropagationMatrixA = (FailurePropagationMatrixA)theEObject;
				T result = caseFailurePropagationMatrixA(failurePropagationMatrixA);
				if (result == null) result = casePropagatorA(failurePropagationMatrixA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX: {
				FailureModeMatrix failureModeMatrix = (FailureModeMatrix)theEObject;
				T result = caseFailureModeMatrix(failureModeMatrix);
				if (result == null) result = caseOaamBaseElementA(failureModeMatrix);
				if (result == null) result = caseFailurePropagationMatrixA(failureModeMatrix);
				if (result == null) result = casePropagatorA(failureModeMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX: {
				IntegrityStateMatrix integrityStateMatrix = (IntegrityStateMatrix)theEObject;
				T result = caseIntegrityStateMatrix(integrityStateMatrix);
				if (result == null) result = caseOaamBaseElementA(integrityStateMatrix);
				if (result == null) result = caseFailurePropagationMatrixA(integrityStateMatrix);
				if (result == null) result = casePropagatorA(integrityStateMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX: {
				BooleanMatrix booleanMatrix = (BooleanMatrix)theEObject;
				T result = caseBooleanMatrix(booleanMatrix);
				if (result == null) result = caseOaamBaseElementA(booleanMatrix);
				if (result == null) result = caseFailurePropagationMatrixA(booleanMatrix);
				if (result == null) result = casePropagatorA(booleanMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT: {
				FailureModeInport failureModeInport = (FailureModeInport)theEObject;
				T result = caseFailureModeInport(failureModeInport);
				if (result == null) result = caseOaamBaseElementA(failureModeInport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT: {
				FailureModeOutport failureModeOutport = (FailureModeOutport)theEObject;
				T result = caseFailureModeOutport(failureModeOutport);
				if (result == null) result = caseOaamBaseElementA(failureModeOutport);
				if (result == null) result = caseFailureModePropagatorA(failureModeOutport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW: {
				FailureModeMatrixRow failureModeMatrixRow = (FailureModeMatrixRow)theEObject;
				T result = caseFailureModeMatrixRow(failureModeMatrixRow);
				if (result == null) result = caseOaamBaseElementA(failureModeMatrixRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY: {
				FailureModeInportEntry failureModeInportEntry = (FailureModeInportEntry)theEObject;
				T result = caseFailureModeInportEntry(failureModeInportEntry);
				if (result == null) result = caseOaamBaseElementA(failureModeInportEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY: {
				FailureModeOutportEntry failureModeOutportEntry = (FailureModeOutportEntry)theEObject;
				T result = caseFailureModeOutportEntry(failureModeOutportEntry);
				if (result == null) result = caseOaamBaseElementA(failureModeOutportEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT: {
				IntegrityStateOutport integrityStateOutport = (IntegrityStateOutport)theEObject;
				T result = caseIntegrityStateOutport(integrityStateOutport);
				if (result == null) result = caseOaamBaseElementA(integrityStateOutport);
				if (result == null) result = caseIntegrityStatePropagatorA(integrityStateOutport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_INPORT: {
				IntegrityStateInport integrityStateInport = (IntegrityStateInport)theEObject;
				T result = caseIntegrityStateInport(integrityStateInport);
				if (result == null) result = caseOaamBaseElementA(integrityStateInport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW: {
				IntegrityStateMatrixRow integrityStateMatrixRow = (IntegrityStateMatrixRow)theEObject;
				T result = caseIntegrityStateMatrixRow(integrityStateMatrixRow);
				if (result == null) result = caseOaamBaseElementA(integrityStateMatrixRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_INPORT_ENTRY: {
				IntegrityStateInportEntry integrityStateInportEntry = (IntegrityStateInportEntry)theEObject;
				T result = caseIntegrityStateInportEntry(integrityStateInportEntry);
				if (result == null) result = caseOaamBaseElementA(integrityStateInportEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY: {
				IntegrityStateOutportEntry integrityStateOutportEntry = (IntegrityStateOutportEntry)theEObject;
				T result = caseIntegrityStateOutportEntry(integrityStateOutportEntry);
				if (result == null) result = caseOaamBaseElementA(integrityStateOutportEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT: {
				BooleanInport booleanInport = (BooleanInport)theEObject;
				T result = caseBooleanInport(booleanInport);
				if (result == null) result = caseOaamBaseElementA(booleanInport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT: {
				BooleanOutport booleanOutport = (BooleanOutport)theEObject;
				T result = caseBooleanOutport(booleanOutport);
				if (result == null) result = caseOaamBaseElementA(booleanOutport);
				if (result == null) result = caseBooleanPropagatorA(booleanOutport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW: {
				BooleanMatrixRow booleanMatrixRow = (BooleanMatrixRow)theEObject;
				T result = caseBooleanMatrixRow(booleanMatrixRow);
				if (result == null) result = caseOaamBaseElementA(booleanMatrixRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY: {
				BooleanInportEntry booleanInportEntry = (BooleanInportEntry)theEObject;
				T result = caseBooleanInportEntry(booleanInportEntry);
				if (result == null) result = caseOaamBaseElementA(booleanInportEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY: {
				BooleanOutportEntry booleanOutportEntry = (BooleanOutportEntry)theEObject;
				T result = caseBooleanOutportEntry(booleanOutportEntry);
				if (result == null) result = caseOaamBaseElementA(booleanOutportEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Propagation Matrix A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Propagation Matrix A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailurePropagationMatrixA(FailurePropagationMatrixA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModeMatrix(FailureModeMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity State Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity State Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrityStateMatrix(IntegrityStateMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanMatrix(BooleanMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode Inport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode Inport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModeInport(FailureModeInport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode Outport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode Outport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModeOutport(FailureModeOutport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode Matrix Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode Matrix Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModeMatrixRow(FailureModeMatrixRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode Inport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode Inport Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModeInportEntry(FailureModeInportEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode Outport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode Outport Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModeOutportEntry(FailureModeOutportEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity State Outport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity State Outport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrityStateOutport(IntegrityStateOutport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity State Inport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity State Inport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrityStateInport(IntegrityStateInport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity State Matrix Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity State Matrix Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrityStateMatrixRow(IntegrityStateMatrixRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity State Inport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity State Inport Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrityStateInportEntry(IntegrityStateInportEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity State Outport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity State Outport Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrityStateOutportEntry(IntegrityStateOutportEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Inport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Inport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanInport(BooleanInport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Outport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Outport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOutport(BooleanOutport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Matrix Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Matrix Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanMatrixRow(BooleanMatrixRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Inport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Inport Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanInportEntry(BooleanInportEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Outport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Outport Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOutportEntry(BooleanOutportEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorA(PropagatorA object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode Propagator A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode Propagator A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModePropagatorA(FailureModePropagatorA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity State Propagator A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity State Propagator A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrityStatePropagatorA(IntegrityStatePropagatorA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Propagator A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Propagator A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanPropagatorA(BooleanPropagatorA object) {
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

} //FailurePropagationMatricesSwitch
