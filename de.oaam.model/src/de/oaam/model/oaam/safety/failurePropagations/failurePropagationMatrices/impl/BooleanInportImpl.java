/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Inport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanInportImpl extends OaamBaseElementAImpl implements BooleanInport {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanInportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.BOOLEAN_INPORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationMatricesPackage.BOOLEAN_INPORT__INPUT, oldInput, input));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.BOOLEAN_INPORT__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT__INPUT:
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
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT__INPUT:
				setInput((BooleanPropagatorA)newValue);
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
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT__INPUT:
				setInput((BooleanPropagatorA)null);
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
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT__INPUT:
				return input != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanInportImpl
