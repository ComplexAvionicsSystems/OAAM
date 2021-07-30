/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.common.IntegrityStateE;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integrity State Boolean Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateBooleanConversionImpl#getInputIntegrityState <em>Input Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateBooleanConversionImpl#isOutputBooleanValue <em>Output Boolean Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateBooleanConversionImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrityStateBooleanConversionImpl extends OaamBaseElementAImpl implements IntegrityStateBooleanConversion {
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
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStatePropagatorA input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrityStateBooleanConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationsPackage.Literals.INTEGRITY_STATE_BOOLEAN_CONVERSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT_INTEGRITY_STATE, oldInputIntegrityState, inputIntegrityState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE, oldOutputBooleanValue, outputBooleanValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT, oldInput, input));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT_INTEGRITY_STATE:
				return getInputIntegrityState();
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE:
				return isOutputBooleanValue();
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
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
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT_INTEGRITY_STATE:
				setInputIntegrityState((IntegrityStateE)newValue);
				return;
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE:
				setOutputBooleanValue((Boolean)newValue);
				return;
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT:
				setInput((IntegrityStatePropagatorA)newValue);
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
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT_INTEGRITY_STATE:
				setInputIntegrityState(INPUT_INTEGRITY_STATE_EDEFAULT);
				return;
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE:
				setOutputBooleanValue(OUTPUT_BOOLEAN_VALUE_EDEFAULT);
				return;
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT:
				setInput((IntegrityStatePropagatorA)null);
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
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT_INTEGRITY_STATE:
				return inputIntegrityState != INPUT_INTEGRITY_STATE_EDEFAULT;
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE:
				return outputBooleanValue != OUTPUT_BOOLEAN_VALUE_EDEFAULT;
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT:
				return input != null;
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
		result.append(", outputBooleanValue: ");
		result.append(outputBooleanValue);
		result.append(')');
		return result.toString();
	}

} //IntegrityStateBooleanConversionImpl
