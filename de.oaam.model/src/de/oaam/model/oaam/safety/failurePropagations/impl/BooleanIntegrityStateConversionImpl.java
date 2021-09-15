/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.common.IntegrityStateE;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion;
import de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Integrity State Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanIntegrityStateConversionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanIntegrityStateConversionImpl#isInputBooleanValue <em>Input Boolean Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanIntegrityStateConversionImpl#getOutputIntegrityState <em>Output Integrity State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanIntegrityStateConversionImpl extends OaamBaseElementAImpl implements BooleanIntegrityStateConversion {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanIntegrityStateConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationsPackage.Literals.BOOLEAN_INTEGRITY_STATE_CONVERSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT, oldInput, input));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT, oldInput, input));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT_BOOLEAN_VALUE, oldInputBooleanValue, inputBooleanValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE, oldOutputIntegrityState, outputIntegrityState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT_BOOLEAN_VALUE:
				return isInputBooleanValue();
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE:
				return getOutputIntegrityState();
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
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT:
				setInput((BooleanPropagatorA)newValue);
				return;
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT_BOOLEAN_VALUE:
				setInputBooleanValue((Boolean)newValue);
				return;
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE:
				setOutputIntegrityState((IntegrityStateE)newValue);
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
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT:
				setInput((BooleanPropagatorA)null);
				return;
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT_BOOLEAN_VALUE:
				setInputBooleanValue(INPUT_BOOLEAN_VALUE_EDEFAULT);
				return;
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE:
				setOutputIntegrityState(OUTPUT_INTEGRITY_STATE_EDEFAULT);
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
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT:
				return input != null;
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT_BOOLEAN_VALUE:
				return inputBooleanValue != INPUT_BOOLEAN_VALUE_EDEFAULT;
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE:
				return outputIntegrityState != OUTPUT_INTEGRITY_STATE_EDEFAULT;
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
		result.append(", outputIntegrityState: ");
		result.append(outputIntegrityState);
		result.append(')');
		return result.toString();
	}

} //BooleanIntegrityStateConversionImpl
