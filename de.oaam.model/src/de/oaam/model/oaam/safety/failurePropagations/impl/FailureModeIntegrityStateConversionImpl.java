/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.common.IntegrityStateE;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion;
import de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Mode Integrity State Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeIntegrityStateConversionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeIntegrityStateConversionImpl#getOutputIntegrityState <em>Output Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeIntegrityStateConversionImpl#getInputFailureMode <em>Input Failure Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModeIntegrityStateConversionImpl extends OaamBaseElementAImpl implements FailureModeIntegrityStateConversion {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected FailureModePropagatorA input;

	/**
	 * The default value of the '{@link #getOutputIntegrityState() <em>Output Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityStateE OUTPUT_INTEGRITY_STATE_EDEFAULT = IntegrityStateE.OK;

	/**
	 * The cached value of the '{@link #getOutputIntegrityState() <em>Output Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStateE outputIntegrityState = OUTPUT_INTEGRITY_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputFailureMode() <em>Input Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFailureMode()
	 * @generated
	 * @ordered
	 */
	protected FunctionalFailureMode inputFailureMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModeIntegrityStateConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationsPackage.Literals.FAILURE_MODE_INTEGRITY_STATE_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModePropagatorA getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (FailureModePropagatorA)eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModePropagatorA basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(FailureModePropagatorA newInput) {
		FailureModePropagatorA oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateE getOutputIntegrityState() {
		return outputIntegrityState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputIntegrityState(IntegrityStateE newOutputIntegrityState) {
		IntegrityStateE oldOutputIntegrityState = outputIntegrityState;
		outputIntegrityState = newOutputIntegrityState == null ? OUTPUT_INTEGRITY_STATE_EDEFAULT : newOutputIntegrityState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE, oldOutputIntegrityState, outputIntegrityState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode getInputFailureMode() {
		if (inputFailureMode != null && inputFailureMode.eIsProxy()) {
			InternalEObject oldInputFailureMode = (InternalEObject)inputFailureMode;
			inputFailureMode = (FunctionalFailureMode)eResolveProxy(oldInputFailureMode);
			if (inputFailureMode != oldInputFailureMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE, oldInputFailureMode, inputFailureMode));
			}
		}
		return inputFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode basicGetInputFailureMode() {
		return inputFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFailureMode(FunctionalFailureMode newInputFailureMode) {
		FunctionalFailureMode oldInputFailureMode = inputFailureMode;
		inputFailureMode = newInputFailureMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE, oldInputFailureMode, inputFailureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE:
				return getOutputIntegrityState();
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE:
				if (resolve) return getInputFailureMode();
				return basicGetInputFailureMode();
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
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT:
				setInput((FailureModePropagatorA)newValue);
				return;
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE:
				setOutputIntegrityState((IntegrityStateE)newValue);
				return;
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE:
				setInputFailureMode((FunctionalFailureMode)newValue);
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
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT:
				setInput((FailureModePropagatorA)null);
				return;
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE:
				setOutputIntegrityState(OUTPUT_INTEGRITY_STATE_EDEFAULT);
				return;
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE:
				setInputFailureMode((FunctionalFailureMode)null);
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
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT:
				return input != null;
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE:
				return outputIntegrityState != OUTPUT_INTEGRITY_STATE_EDEFAULT;
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE:
				return inputFailureMode != null;
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
		result.append(" (outputIntegrityState: ");
		result.append(outputIntegrityState);
		result.append(')');
		return result.toString();
	}

} //FailureModeIntegrityStateConversionImpl
