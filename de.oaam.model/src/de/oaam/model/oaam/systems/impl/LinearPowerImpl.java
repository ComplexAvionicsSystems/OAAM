/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.systems.LinearPower;
import de.oaam.model.oaam.systems.SystemsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Power</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.impl.LinearPowerImpl#getForce <em>Force</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.LinearPowerImpl#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearPowerImpl extends InformationPowerImpl implements LinearPower {
	/**
	 * The default value of the '{@link #getForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce()
	 * @generated
	 * @ordered
	 */
	protected static final double FORCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce()
	 * @generated
	 * @ordered
	 */
	protected double force = FORCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected double velocity = VELOCITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearPowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemsPackage.Literals.LINEAR_POWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getForce() {
		return force;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForce(double newForce) {
		double oldForce = force;
		force = newForce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.LINEAR_POWER__FORCE, oldForce, force));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(double newVelocity) {
		double oldVelocity = velocity;
		velocity = newVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.LINEAR_POWER__VELOCITY, oldVelocity, velocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemsPackage.LINEAR_POWER__FORCE:
				return getForce();
			case SystemsPackage.LINEAR_POWER__VELOCITY:
				return getVelocity();
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
			case SystemsPackage.LINEAR_POWER__FORCE:
				setForce((Double)newValue);
				return;
			case SystemsPackage.LINEAR_POWER__VELOCITY:
				setVelocity((Double)newValue);
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
			case SystemsPackage.LINEAR_POWER__FORCE:
				setForce(FORCE_EDEFAULT);
				return;
			case SystemsPackage.LINEAR_POWER__VELOCITY:
				setVelocity(VELOCITY_EDEFAULT);
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
			case SystemsPackage.LINEAR_POWER__FORCE:
				return force != FORCE_EDEFAULT;
			case SystemsPackage.LINEAR_POWER__VELOCITY:
				return velocity != VELOCITY_EDEFAULT;
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
		result.append(" (force: ");
		result.append(force);
		result.append(", velocity: ");
		result.append(velocity);
		result.append(')');
		return result.toString();
	}

} //LinearPowerImpl
