/**
 */
package de.oaam.model.oaam.safety.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.RequirementFailureEffect;
import de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE;
import de.oaam.model.oaam.safety.RequirementFailureEffectTypesE;
import de.oaam.model.oaam.safety.SafetyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Failure Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.impl.RequirementFailureEffectImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.RequirementFailureEffectImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementFailureEffectImpl extends OaamBaseElementAImpl implements RequirementFailureEffect {
	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementFailureEffectTypesE EFFECT_EDEFAULT = RequirementFailureEffectTypesE.EARLY;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected RequirementFailureEffectTypesE effect = EFFECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementFailureEffectTargetsE TARGET_EDEFAULT = RequirementFailureEffectTargetsE.NO_TARGET;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected RequirementFailureEffectTargetsE target = TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementFailureEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyPackage.Literals.REQUIREMENT_FAILURE_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFailureEffectTypesE getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(RequirementFailureEffectTypesE newEffect) {
		RequirementFailureEffectTypesE oldEffect = effect;
		effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.REQUIREMENT_FAILURE_EFFECT__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFailureEffectTargetsE getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(RequirementFailureEffectTargetsE newTarget) {
		RequirementFailureEffectTargetsE oldTarget = target;
		target = newTarget == null ? TARGET_EDEFAULT : newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.REQUIREMENT_FAILURE_EFFECT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT__EFFECT:
				return getEffect();
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT__TARGET:
				return getTarget();
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
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT__EFFECT:
				setEffect((RequirementFailureEffectTypesE)newValue);
				return;
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT__TARGET:
				setTarget((RequirementFailureEffectTargetsE)newValue);
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
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT__TARGET:
				setTarget(TARGET_EDEFAULT);
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
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT__EFFECT:
				return effect != EFFECT_EDEFAULT;
			case SafetyPackage.REQUIREMENT_FAILURE_EFFECT__TARGET:
				return target != TARGET_EDEFAULT;
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
		result.append(" (effect: ");
		result.append(effect);
		result.append(", target: ");
		result.append(target);
		result.append(')');
		return result.toString();
	}

} //RequirementFailureEffectImpl
