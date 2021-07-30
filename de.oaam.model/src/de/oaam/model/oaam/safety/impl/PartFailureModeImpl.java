/**
 */
package de.oaam.model.oaam.safety.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FailureEffect;
import de.oaam.model.oaam.safety.PartFailureMode;
import de.oaam.model.oaam.safety.SafetyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Failure Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.impl.PartFailureModeImpl#getFailureModeRatio <em>Failure Mode Ratio</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.PartFailureModeImpl#getFailureEffects <em>Failure Effects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartFailureModeImpl extends OaamBaseElementAImpl implements PartFailureMode {
	/**
	 * The default value of the '{@link #getFailureModeRatio() <em>Failure Mode Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModeRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double FAILURE_MODE_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFailureModeRatio() <em>Failure Mode Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModeRatio()
	 * @generated
	 * @ordered
	 */
	protected double failureModeRatio = FAILURE_MODE_RATIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailureEffects() <em>Failure Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureEffect> failureEffects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartFailureModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyPackage.Literals.PART_FAILURE_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFailureModeRatio() {
		return failureModeRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureModeRatio(double newFailureModeRatio) {
		double oldFailureModeRatio = failureModeRatio;
		failureModeRatio = newFailureModeRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.PART_FAILURE_MODE__FAILURE_MODE_RATIO, oldFailureModeRatio, failureModeRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureEffect> getFailureEffects() {
		if (failureEffects == null) {
			failureEffects = new EObjectContainmentEList<FailureEffect>(FailureEffect.class, this, SafetyPackage.PART_FAILURE_MODE__FAILURE_EFFECTS);
		}
		return failureEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SafetyPackage.PART_FAILURE_MODE__FAILURE_EFFECTS:
				return ((InternalEList<?>)getFailureEffects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SafetyPackage.PART_FAILURE_MODE__FAILURE_MODE_RATIO:
				return getFailureModeRatio();
			case SafetyPackage.PART_FAILURE_MODE__FAILURE_EFFECTS:
				return getFailureEffects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SafetyPackage.PART_FAILURE_MODE__FAILURE_MODE_RATIO:
				setFailureModeRatio((Double)newValue);
				return;
			case SafetyPackage.PART_FAILURE_MODE__FAILURE_EFFECTS:
				getFailureEffects().clear();
				getFailureEffects().addAll((Collection<? extends FailureEffect>)newValue);
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
			case SafetyPackage.PART_FAILURE_MODE__FAILURE_MODE_RATIO:
				setFailureModeRatio(FAILURE_MODE_RATIO_EDEFAULT);
				return;
			case SafetyPackage.PART_FAILURE_MODE__FAILURE_EFFECTS:
				getFailureEffects().clear();
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
			case SafetyPackage.PART_FAILURE_MODE__FAILURE_MODE_RATIO:
				return failureModeRatio != FAILURE_MODE_RATIO_EDEFAULT;
			case SafetyPackage.PART_FAILURE_MODE__FAILURE_EFFECTS:
				return failureEffects != null && !failureEffects.isEmpty();
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
		result.append(" (failureModeRatio: ");
		result.append(failureModeRatio);
		result.append(')');
		return result.toString();
	}

} //PartFailureModeImpl
