/**
 */
package de.oaam.model.oaam.safety.failurePropagations.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.failurePropagations.*;

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
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage
 * @generated
 */
public class FailurePropagationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FailurePropagationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationsSwitch() {
		if (modelPackage == null) {
			modelPackage = FailurePropagationsPackage.eINSTANCE;
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
			case FailurePropagationsPackage.FAILURE_PROPAGATION: {
				FailurePropagation failurePropagation = (FailurePropagation)theEObject;
				T result = caseFailurePropagation(failurePropagation);
				if (result == null) result = caseOaamBaseElementA(failurePropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.PROPAGATOR_A: {
				PropagatorA propagatorA = (PropagatorA)theEObject;
				T result = casePropagatorA(propagatorA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.FAILURE_MODE_PROPAGATOR_A: {
				FailureModePropagatorA failureModePropagatorA = (FailureModePropagatorA)theEObject;
				T result = caseFailureModePropagatorA(failureModePropagatorA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.BOOLEAN_PROPAGATOR_A: {
				BooleanPropagatorA booleanPropagatorA = (BooleanPropagatorA)theEObject;
				T result = caseBooleanPropagatorA(booleanPropagatorA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.CONVERSION_A: {
				ConversionA conversionA = (ConversionA)theEObject;
				T result = caseConversionA(conversionA);
				if (result == null) result = casePropagatorA(conversionA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.INTEGRITY_STATE_PROPAGATOR_A: {
				IntegrityStatePropagatorA integrityStatePropagatorA = (IntegrityStatePropagatorA)theEObject;
				T result = caseIntegrityStatePropagatorA(integrityStatePropagatorA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.BOOLEAN_GATE_A: {
				BooleanGateA booleanGateA = (BooleanGateA)theEObject;
				T result = caseBooleanGateA(booleanGateA);
				if (result == null) result = caseBooleanPropagatorA(booleanGateA);
				if (result == null) result = casePropagatorA(booleanGateA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.BOOLEAN_AND: {
				BooleanAnd booleanAnd = (BooleanAnd)theEObject;
				T result = caseBooleanAnd(booleanAnd);
				if (result == null) result = caseOaamBaseElementA(booleanAnd);
				if (result == null) result = caseBooleanGateA(booleanAnd);
				if (result == null) result = caseBooleanPropagatorA(booleanAnd);
				if (result == null) result = casePropagatorA(booleanAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.BOOLEAN_OR: {
				BooleanOr booleanOr = (BooleanOr)theEObject;
				T result = caseBooleanOr(booleanOr);
				if (result == null) result = caseOaamBaseElementA(booleanOr);
				if (result == null) result = caseBooleanGateA(booleanOr);
				if (result == null) result = caseBooleanPropagatorA(booleanOr);
				if (result == null) result = casePropagatorA(booleanOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.BOOLEAN_XOR: {
				BooleanXor booleanXor = (BooleanXor)theEObject;
				T result = caseBooleanXor(booleanXor);
				if (result == null) result = caseOaamBaseElementA(booleanXor);
				if (result == null) result = caseBooleanGateA(booleanXor);
				if (result == null) result = caseBooleanPropagatorA(booleanXor);
				if (result == null) result = casePropagatorA(booleanXor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.BOOLEAN_NOT: {
				BooleanNot booleanNot = (BooleanNot)theEObject;
				T result = caseBooleanNot(booleanNot);
				if (result == null) result = caseOaamBaseElementA(booleanNot);
				if (result == null) result = caseBooleanPropagatorA(booleanNot);
				if (result == null) result = casePropagatorA(booleanNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION: {
				IntegrityStateBooleanConversion integrityStateBooleanConversion = (IntegrityStateBooleanConversion)theEObject;
				T result = caseIntegrityStateBooleanConversion(integrityStateBooleanConversion);
				if (result == null) result = caseOaamBaseElementA(integrityStateBooleanConversion);
				if (result == null) result = caseBooleanPropagatorA(integrityStateBooleanConversion);
				if (result == null) result = caseConversionA(integrityStateBooleanConversion);
				if (result == null) result = casePropagatorA(integrityStateBooleanConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION: {
				FailureModeBooleanConversion failureModeBooleanConversion = (FailureModeBooleanConversion)theEObject;
				T result = caseFailureModeBooleanConversion(failureModeBooleanConversion);
				if (result == null) result = caseOaamBaseElementA(failureModeBooleanConversion);
				if (result == null) result = caseBooleanPropagatorA(failureModeBooleanConversion);
				if (result == null) result = caseConversionA(failureModeBooleanConversion);
				if (result == null) result = casePropagatorA(failureModeBooleanConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION: {
				BooleanFailureModeConversion booleanFailureModeConversion = (BooleanFailureModeConversion)theEObject;
				T result = caseBooleanFailureModeConversion(booleanFailureModeConversion);
				if (result == null) result = caseOaamBaseElementA(booleanFailureModeConversion);
				if (result == null) result = caseFailureModePropagatorA(booleanFailureModeConversion);
				if (result == null) result = caseConversionA(booleanFailureModeConversion);
				if (result == null) result = casePropagatorA(booleanFailureModeConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION: {
				IntegrityStateFailureModeConversion integrityStateFailureModeConversion = (IntegrityStateFailureModeConversion)theEObject;
				T result = caseIntegrityStateFailureModeConversion(integrityStateFailureModeConversion);
				if (result == null) result = caseOaamBaseElementA(integrityStateFailureModeConversion);
				if (result == null) result = caseFailureModePropagatorA(integrityStateFailureModeConversion);
				if (result == null) result = caseConversionA(integrityStateFailureModeConversion);
				if (result == null) result = casePropagatorA(integrityStateFailureModeConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION: {
				FailureModeIntegrityStateConversion failureModeIntegrityStateConversion = (FailureModeIntegrityStateConversion)theEObject;
				T result = caseFailureModeIntegrityStateConversion(failureModeIntegrityStateConversion);
				if (result == null) result = caseOaamBaseElementA(failureModeIntegrityStateConversion);
				if (result == null) result = caseIntegrityStatePropagatorA(failureModeIntegrityStateConversion);
				if (result == null) result = caseConversionA(failureModeIntegrityStateConversion);
				if (result == null) result = casePropagatorA(failureModeIntegrityStateConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION: {
				BooleanIntegrityStateConversion booleanIntegrityStateConversion = (BooleanIntegrityStateConversion)theEObject;
				T result = caseBooleanIntegrityStateConversion(booleanIntegrityStateConversion);
				if (result == null) result = caseOaamBaseElementA(booleanIntegrityStateConversion);
				if (result == null) result = caseIntegrityStatePropagatorA(booleanIntegrityStateConversion);
				if (result == null) result = caseConversionA(booleanIntegrityStateConversion);
				if (result == null) result = casePropagatorA(booleanIntegrityStateConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.PROPAGATION_INPUT: {
				PropagationInput propagationInput = (PropagationInput)theEObject;
				T result = casePropagationInput(propagationInput);
				if (result == null) result = caseOaamBaseElementA(propagationInput);
				if (result == null) result = casePropagatorA(propagationInput);
				if (result == null) result = caseIntegrityStatePropagatorA(propagationInput);
				if (result == null) result = caseFailureModePropagatorA(propagationInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.PROPAGATION_OUTPUT: {
				PropagationOutput propagationOutput = (PropagationOutput)theEObject;
				T result = casePropagationOutput(propagationOutput);
				if (result == null) result = caseOaamBaseElementA(propagationOutput);
				if (result == null) result = casePropagatorA(propagationOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.PROPAGATION_SOURCE: {
				PropagationSource propagationSource = (PropagationSource)theEObject;
				T result = casePropagationSource(propagationSource);
				if (result == null) result = caseOaamBaseElementA(propagationSource);
				if (result == null) result = casePropagatorA(propagationSource);
				if (result == null) result = caseIntegrityStatePropagatorA(propagationSource);
				if (result == null) result = caseFailureModePropagatorA(propagationSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailurePropagationsPackage.PROPAGATION_SINK: {
				PropagationSink propagationSink = (PropagationSink)theEObject;
				T result = casePropagationSink(propagationSink);
				if (result == null) result = caseOaamBaseElementA(propagationSink);
				if (result == null) result = casePropagatorA(propagationSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailurePropagation(FailurePropagation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Conversion A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionA(ConversionA object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Gate A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Gate A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanGateA(BooleanGateA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanAnd(BooleanAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOr(BooleanOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanXor(BooleanXor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanNot(BooleanNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity State Boolean Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity State Boolean Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrityStateBooleanConversion(IntegrityStateBooleanConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode Boolean Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode Boolean Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModeBooleanConversion(FailureModeBooleanConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Failure Mode Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Failure Mode Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanFailureModeConversion(BooleanFailureModeConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity State Failure Mode Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity State Failure Mode Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrityStateFailureModeConversion(IntegrityStateFailureModeConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode Integrity State Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode Integrity State Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModeIntegrityStateConversion(FailureModeIntegrityStateConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Integrity State Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Integrity State Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanIntegrityStateConversion(BooleanIntegrityStateConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagation Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagation Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagationInput(PropagationInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagation Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagation Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagationOutput(PropagationOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagation Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagation Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagationSource(PropagationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagation Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagation Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagationSink(PropagationSink object) {
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

} //FailurePropagationsSwitch
