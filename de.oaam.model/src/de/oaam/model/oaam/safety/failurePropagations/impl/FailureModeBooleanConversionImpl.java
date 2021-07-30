/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion;
import de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Mode Boolean Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeBooleanConversionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeBooleanConversionImpl#isOutputBooleanValue <em>Output Boolean Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeBooleanConversionImpl#getInputFailureMode <em>Input Failure Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModeBooleanConversionImpl extends OaamBaseElementAImpl implements FailureModeBooleanConversion {
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
	 * The default value of the '{@link #isOutputBooleanValue() <em>Output Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutputBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTPUT_BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutputBooleanValue() <em>Output Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutputBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected boolean outputBooleanValue = OUTPUT_BOOLEAN_VALUE_EDEFAULT;

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
	protected FailureModeBooleanConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationsPackage.Literals.FAILURE_MODE_BOOLEAN_CONVERSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT, oldInput, input));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutputBooleanValue() {
		return outputBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputBooleanValue(boolean newOutputBooleanValue) {
		boolean oldOutputBooleanValue = outputBooleanValue;
		outputBooleanValue = newOutputBooleanValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE, oldOutputBooleanValue, outputBooleanValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT_FAILURE_MODE, oldInputFailureMode, inputFailureMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT_FAILURE_MODE, oldInputFailureMode, inputFailureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE:
				return isOutputBooleanValue();
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT_FAILURE_MODE:
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
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT:
				setInput((FailureModePropagatorA)newValue);
				return;
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE:
				setOutputBooleanValue((Boolean)newValue);
				return;
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT_FAILURE_MODE:
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
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT:
				setInput((FailureModePropagatorA)null);
				return;
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE:
				setOutputBooleanValue(OUTPUT_BOOLEAN_VALUE_EDEFAULT);
				return;
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT_FAILURE_MODE:
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
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT:
				return input != null;
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE:
				return outputBooleanValue != OUTPUT_BOOLEAN_VALUE_EDEFAULT;
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION__INPUT_FAILURE_MODE:
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
		result.append(" (outputBooleanValue: ");
		result.append(outputBooleanValue);
		result.append(')');
		return result.toString();
	}

} //FailureModeBooleanConversionImpl
