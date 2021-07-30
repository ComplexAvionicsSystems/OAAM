/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion;
import de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Failure Mode Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanFailureModeConversionImpl#isInputBooleanValue <em>Input Boolean Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanFailureModeConversionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanFailureModeConversionImpl#getOutputFailureMode <em>Output Failure Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanFailureModeConversionImpl extends OaamBaseElementAImpl implements BooleanFailureModeConversion {
	/**
	 * The default value of the '{@link #isInputBooleanValue() <em>Input Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INPUT_BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInputBooleanValue() <em>Input Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected boolean inputBooleanValue = INPUT_BOOLEAN_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropagatorA input;

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
	protected BooleanFailureModeConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationsPackage.Literals.BOOLEAN_FAILURE_MODE_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInputBooleanValue() {
		return inputBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputBooleanValue(boolean newInputBooleanValue) {
		boolean oldInputBooleanValue = inputBooleanValue;
		inputBooleanValue = newInputBooleanValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT_BOOLEAN_VALUE, oldInputBooleanValue, inputBooleanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanPropagatorA getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (BooleanPropagatorA)eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanPropagatorA basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(BooleanPropagatorA newInput) {
		BooleanPropagatorA oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT, oldInput, input));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE, oldOutputFailureMode, outputFailureMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE, oldOutputFailureMode, outputFailureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT_BOOLEAN_VALUE:
				return isInputBooleanValue();
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE:
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
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT_BOOLEAN_VALUE:
				setInputBooleanValue((Boolean)newValue);
				return;
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT:
				setInput((BooleanPropagatorA)newValue);
				return;
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE:
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
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT_BOOLEAN_VALUE:
				setInputBooleanValue(INPUT_BOOLEAN_VALUE_EDEFAULT);
				return;
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT:
				setInput((BooleanPropagatorA)null);
				return;
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE:
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
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT_BOOLEAN_VALUE:
				return inputBooleanValue != INPUT_BOOLEAN_VALUE_EDEFAULT;
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__INPUT:
				return input != null;
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE:
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
		result.append(" (inputBooleanValue: ");
		result.append(inputBooleanValue);
		result.append(')');
		return result.toString();
	}

} //BooleanFailureModeConversionImpl
