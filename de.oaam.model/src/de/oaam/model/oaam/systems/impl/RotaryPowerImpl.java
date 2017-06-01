/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.systems.RotaryPower;
import de.oaam.model.oaam.systems.SystemsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotary Power</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.impl.RotaryPowerImpl#getMomentum <em>Momentum</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.RotaryPowerImpl#getAngularVelocity <em>Angular Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotaryPowerImpl extends PowerImpl implements RotaryPower {
	/**
	 * The default value of the '{@link #getMomentum() <em>Momentum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentum()
	 * @generated
	 * @ordered
	 */
	protected static final double MOMENTUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMomentum() <em>Momentum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentum()
	 * @generated
	 * @ordered
	 */
	protected double momentum = MOMENTUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double angularVelocity = ANGULAR_VELOCITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotaryPowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemsPackage.Literals.ROTARY_POWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMomentum() {
		return momentum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentum(double newMomentum) {
		double oldMomentum = momentum;
		momentum = newMomentum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.ROTARY_POWER__MOMENTUM, oldMomentum, momentum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngularVelocity() {
		return angularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularVelocity(double newAngularVelocity) {
		double oldAngularVelocity = angularVelocity;
		angularVelocity = newAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.ROTARY_POWER__ANGULAR_VELOCITY, oldAngularVelocity, angularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemsPackage.ROTARY_POWER__MOMENTUM:
				return getMomentum();
			case SystemsPackage.ROTARY_POWER__ANGULAR_VELOCITY:
				return getAngularVelocity();
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
			case SystemsPackage.ROTARY_POWER__MOMENTUM:
				setMomentum((Double)newValue);
				return;
			case SystemsPackage.ROTARY_POWER__ANGULAR_VELOCITY:
				setAngularVelocity((Double)newValue);
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
			case SystemsPackage.ROTARY_POWER__MOMENTUM:
				setMomentum(MOMENTUM_EDEFAULT);
				return;
			case SystemsPackage.ROTARY_POWER__ANGULAR_VELOCITY:
				setAngularVelocity(ANGULAR_VELOCITY_EDEFAULT);
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
			case SystemsPackage.ROTARY_POWER__MOMENTUM:
				return momentum != MOMENTUM_EDEFAULT;
			case SystemsPackage.ROTARY_POWER__ANGULAR_VELOCITY:
				return angularVelocity != ANGULAR_VELOCITY_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (momentum: ");
		result.append(momentum);
		result.append(", angularVelocity: ");
		result.append(angularVelocity);
		result.append(')');
		return result.toString();
	}

} //RotaryPowerImpl
