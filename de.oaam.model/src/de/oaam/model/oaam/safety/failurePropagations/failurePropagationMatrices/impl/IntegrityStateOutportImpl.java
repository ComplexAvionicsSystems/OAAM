/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.IntegrityStateE;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integrity State Outport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportImpl#getDefaultIntegrityState <em>Default Integrity State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrityStateOutportImpl extends OaamBaseElementAImpl implements IntegrityStateOutport {
	/**
	 * The default value of the '{@link #getDefaultIntegrityState() <em>Default Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityStateE DEFAULT_INTEGRITY_STATE_EDEFAULT = IntegrityStateE.OK;

	/**
	 * The cached value of the '{@link #getDefaultIntegrityState() <em>Default Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStateE defaultIntegrityState = DEFAULT_INTEGRITY_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrityStateOutportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.INTEGRITY_STATE_OUTPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateE getDefaultIntegrityState() {
		return defaultIntegrityState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultIntegrityState(IntegrityStateE newDefaultIntegrityState) {
		IntegrityStateE oldDefaultIntegrityState = defaultIntegrityState;
		defaultIntegrityState = newDefaultIntegrityState == null ? DEFAULT_INTEGRITY_STATE_EDEFAULT : newDefaultIntegrityState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT__DEFAULT_INTEGRITY_STATE, oldDefaultIntegrityState, defaultIntegrityState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT__DEFAULT_INTEGRITY_STATE:
				return getDefaultIntegrityState();
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT__DEFAULT_INTEGRITY_STATE:
				setDefaultIntegrityState((IntegrityStateE)newValue);
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT__DEFAULT_INTEGRITY_STATE:
				setDefaultIntegrityState(DEFAULT_INTEGRITY_STATE_EDEFAULT);
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT__DEFAULT_INTEGRITY_STATE:
				return defaultIntegrityState != DEFAULT_INTEGRITY_STATE_EDEFAULT;
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
		result.append(" (defaultIntegrityState: ");
		result.append(defaultIntegrityState);
		result.append(')');
		return result.toString();
	}

} //IntegrityStateOutportImpl
