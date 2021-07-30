/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.common.IntegrityStateE;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integrity State Failure Mode Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateFailureModeConversionImpl#getInputIntegrityState <em>Input Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateFailureModeConversionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateFailureModeConversionImpl#getOutputFailureMode <em>Output Failure Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrityStateFailureModeConversionImpl extends OaamBaseElementAImpl implements IntegrityStateFailureModeConversion {
	/**
	 * The default value of the '{@link #getInputIntegrityState() <em>Input Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityStateE INPUT_INTEGRITY_STATE_EDEFAULT = IntegrityStateE.OK;

	/**
	 * The cached value of the '{@link #getInputIntegrityState() <em>Input Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStateE inputIntegrityState = INPUT_INTEGRITY_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStatePropagatorA input;

	/**
	 * The cached value of the '{@link #getOutputFailureMode() <em>Output Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFailureMode()
	 * @generated
	 * @ordered
	 */
	protected FunctionalFailureMode outputFailureMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrityStateFailureModeConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationsPackage.Literals.INTEGRITY_STATE_FAILURE_MODE_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateE getInputIntegrityState() {
		return inputIntegrityState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputIntegrityState(IntegrityStateE newInputIntegrityState) {
		IntegrityStateE oldInputIntegrityState = inputIntegrityState;
		inputIntegrityState = newInputIntegrityState == null ? INPUT_INTEGRITY_STATE_EDEFAULT : newInputIntegrityState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT_INTEGRITY_STATE, oldInputIntegrityState, inputIntegrityState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStatePropagatorA getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (IntegrityStatePropagatorA)eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStatePropagatorA basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(IntegrityStatePropagatorA newInput) {
		IntegrityStatePropagatorA oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode getOutputFailureMode() {
		if (outputFailureMode != null && outputFailureMode.eIsProxy()) {
			InternalEObject oldOutputFailureMode = (InternalEObject)outputFailureMode;
			outputFailureMode = (FunctionalFailureMode)eResolveProxy(oldOutputFailureMode);
			if (outputFailureMode != oldOutputFailureMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE, oldOutputFailureMode, outputFailureMode));
			}
		}
		return outputFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode basicGetOutputFailureMode() {
		return outputFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFailureMode(FunctionalFailureMode newOutputFailureMode) {
		FunctionalFailureMode oldOutputFailureMode = outputFailureMode;
		outputFailureMode = newOutputFailureMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE, oldOutputFailureMode, outputFailureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT_INTEGRITY_STATE:
				return getInputIntegrityState();
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE:
				if (resolve) return getOutputFailureMode();
				return basicGetOutputFailureMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT_INTEGRITY_STATE:
				setInputIntegrityState((IntegrityStateE)newValue);
				return;
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT:
				setInput((IntegrityStatePropagatorA)newValue);
				return;
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE:
				setOutputFailureMode((FunctionalFailureMode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT_INTEGRITY_STATE:
				setInputIntegrityState(INPUT_INTEGRITY_STATE_EDEFAULT);
				return;
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT:
				setInput((IntegrityStatePropagatorA)null);
				return;
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE:
				setOutputFailureMode((FunctionalFailureMode)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT_INTEGRITY_STATE:
				return inputIntegrityState != INPUT_INTEGRITY_STATE_EDEFAULT;
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT:
				return input != null;
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE:
				return outputFailureMode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (inputIntegrityState: ");
		result.append(inputIntegrityState);
		result.append(')');
		return result.toString();
	}

} //IntegrityStateFailureModeConversionImpl
