/**
 */
package de.oaam.model.oaam.safety.impl;

import de.oaam.model.oaam.common.IntegrityStateE;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FailureEffect;
import de.oaam.model.oaam.safety.FunctionalFailureMode;
import de.oaam.model.oaam.safety.SafetyPackage;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FailureEffectImpl#getPropagationFailureMode <em>Propagation Failure Mode</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FailureEffectImpl#getPropagationIntegrityState <em>Propagation Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FailureEffectImpl#getFailureEffectProbability <em>Failure Effect Probability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FailureEffectImpl#getPropagates <em>Propagates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureEffectImpl extends OaamBaseElementAImpl implements FailureEffect {
	/**
	 * The cached value of the '{@link #getPropagationFailureMode() <em>Propagation Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationFailureMode()
	 * @generated
	 * @ordered
	 */
	protected FunctionalFailureMode propagationFailureMode;

	/**
	 * The default value of the '{@link #getPropagationIntegrityState() <em>Propagation Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityStateE PROPAGATION_INTEGRITY_STATE_EDEFAULT = IntegrityStateE.OK;

	/**
	 * The cached value of the '{@link #getPropagationIntegrityState() <em>Propagation Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStateE propagationIntegrityState = PROPAGATION_INTEGRITY_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureEffectProbability() <em>Failure Effect Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureEffectProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double FAILURE_EFFECT_PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFailureEffectProbability() <em>Failure Effect Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureEffectProbability()
	 * @generated
	 * @ordered
	 */
	protected double failureEffectProbability = FAILURE_EFFECT_PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropagates() <em>Propagates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagates()
	 * @generated
	 * @ordered
	 */
	protected static final FailurePropagationGenericTypeE PROPAGATES_EDEFAULT = FailurePropagationGenericTypeE.INTEGRITY_STATE;

	/**
	 * The cached value of the '{@link #getPropagates() <em>Propagates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagates()
	 * @generated
	 * @ordered
	 */
	protected FailurePropagationGenericTypeE propagates = PROPAGATES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyPackage.Literals.FAILURE_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode getPropagationFailureMode() {
		if (propagationFailureMode != null && propagationFailureMode.eIsProxy()) {
			InternalEObject oldPropagationFailureMode = (InternalEObject)propagationFailureMode;
			propagationFailureMode = (FunctionalFailureMode)eResolveProxy(oldPropagationFailureMode);
			if (propagationFailureMode != oldPropagationFailureMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SafetyPackage.FAILURE_EFFECT__PROPAGATION_FAILURE_MODE, oldPropagationFailureMode, propagationFailureMode));
			}
		}
		return propagationFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode basicGetPropagationFailureMode() {
		return propagationFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagationFailureMode(FunctionalFailureMode newPropagationFailureMode) {
		FunctionalFailureMode oldPropagationFailureMode = propagationFailureMode;
		propagationFailureMode = newPropagationFailureMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.FAILURE_EFFECT__PROPAGATION_FAILURE_MODE, oldPropagationFailureMode, propagationFailureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateE getPropagationIntegrityState() {
		return propagationIntegrityState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagationIntegrityState(IntegrityStateE newPropagationIntegrityState) {
		IntegrityStateE oldPropagationIntegrityState = propagationIntegrityState;
		propagationIntegrityState = newPropagationIntegrityState == null ? PROPAGATION_INTEGRITY_STATE_EDEFAULT : newPropagationIntegrityState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.FAILURE_EFFECT__PROPAGATION_INTEGRITY_STATE, oldPropagationIntegrityState, propagationIntegrityState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFailureEffectProbability() {
		return failureEffectProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureEffectProbability(double newFailureEffectProbability) {
		double oldFailureEffectProbability = failureEffectProbability;
		failureEffectProbability = newFailureEffectProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.FAILURE_EFFECT__FAILURE_EFFECT_PROBABILITY, oldFailureEffectProbability, failureEffectProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationGenericTypeE getPropagates() {
		return propagates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagates(FailurePropagationGenericTypeE newPropagates) {
		FailurePropagationGenericTypeE oldPropagates = propagates;
		propagates = newPropagates == null ? PROPAGATES_EDEFAULT : newPropagates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.FAILURE_EFFECT__PROPAGATES, oldPropagates, propagates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SafetyPackage.FAILURE_EFFECT__PROPAGATION_FAILURE_MODE:
				if (resolve) return getPropagationFailureMode();
				return basicGetPropagationFailureMode();
			case SafetyPackage.FAILURE_EFFECT__PROPAGATION_INTEGRITY_STATE:
				return getPropagationIntegrityState();
			case SafetyPackage.FAILURE_EFFECT__FAILURE_EFFECT_PROBABILITY:
				return getFailureEffectProbability();
			case SafetyPackage.FAILURE_EFFECT__PROPAGATES:
				return getPropagates();
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
			case SafetyPackage.FAILURE_EFFECT__PROPAGATION_FAILURE_MODE:
				setPropagationFailureMode((FunctionalFailureMode)newValue);
				return;
			case SafetyPackage.FAILURE_EFFECT__PROPAGATION_INTEGRITY_STATE:
				setPropagationIntegrityState((IntegrityStateE)newValue);
				return;
			case SafetyPackage.FAILURE_EFFECT__FAILURE_EFFECT_PROBABILITY:
				setFailureEffectProbability((Double)newValue);
				return;
			case SafetyPackage.FAILURE_EFFECT__PROPAGATES:
				setPropagates((FailurePropagationGenericTypeE)newValue);
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
			case SafetyPackage.FAILURE_EFFECT__PROPAGATION_FAILURE_MODE:
				setPropagationFailureMode((FunctionalFailureMode)null);
				return;
			case SafetyPackage.FAILURE_EFFECT__PROPAGATION_INTEGRITY_STATE:
				setPropagationIntegrityState(PROPAGATION_INTEGRITY_STATE_EDEFAULT);
				return;
			case SafetyPackage.FAILURE_EFFECT__FAILURE_EFFECT_PROBABILITY:
				setFailureEffectProbability(FAILURE_EFFECT_PROBABILITY_EDEFAULT);
				return;
			case SafetyPackage.FAILURE_EFFECT__PROPAGATES:
				setPropagates(PROPAGATES_EDEFAULT);
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
			case SafetyPackage.FAILURE_EFFECT__PROPAGATION_FAILURE_MODE:
				return propagationFailureMode != null;
			case SafetyPackage.FAILURE_EFFECT__PROPAGATION_INTEGRITY_STATE:
				return propagationIntegrityState != PROPAGATION_INTEGRITY_STATE_EDEFAULT;
			case SafetyPackage.FAILURE_EFFECT__FAILURE_EFFECT_PROBABILITY:
				return failureEffectProbability != FAILURE_EFFECT_PROBABILITY_EDEFAULT;
			case SafetyPackage.FAILURE_EFFECT__PROPAGATES:
				return propagates != PROPAGATES_EDEFAULT;
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
		result.append(" (propagationIntegrityState: ");
		result.append(propagationIntegrityState);
		result.append(", failureEffectProbability: ");
		result.append(failureEffectProbability);
		result.append(", propagates: ");
		result.append(propagates);
		result.append(')');
		return result.toString();
	}

} //FailureEffectImpl
