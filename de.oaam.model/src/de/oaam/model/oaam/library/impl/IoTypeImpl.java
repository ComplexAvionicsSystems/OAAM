/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.IoDirectionE;
import de.oaam.model.oaam.library.IoType;
import de.oaam.model.oaam.library.LibraryPackage;

import de.oaam.model.oaam.safety.FailureProviderA;
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
 * An implementation of the model object '<em><b>Io Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.IoTypeImpl#isCanFail <em>Can Fail</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.IoTypeImpl#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.IoTypeImpl#getPartFailureModes <em>Part Failure Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.IoTypeImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTypeImpl extends OaamBaseElementAImpl implements IoType {
	/**
	 * The default value of the '{@link #isCanFail() <em>Can Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanFail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_FAIL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCanFail() <em>Can Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanFail()
	 * @generated
	 * @ordered
	 */
	protected boolean canFail = CAN_FAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected static final double FAILURE_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected double failureRate = FAILURE_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartFailureModes() <em>Part Failure Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartFailureModes()
	 * @generated
	 * @ordered
	 */
	protected EList<PartFailureMode> partFailureModes;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final IoDirectionE DIRECTION_EDEFAULT = IoDirectionE.NONE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected IoDirectionE direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.IO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanFail() {
		return canFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanFail(boolean newCanFail) {
		boolean oldCanFail = canFail;
		canFail = newCanFail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.IO_TYPE__CAN_FAIL, oldCanFail, canFail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFailureRate() {
		return failureRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureRate(double newFailureRate) {
		double oldFailureRate = failureRate;
		failureRate = newFailureRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.IO_TYPE__FAILURE_RATE, oldFailureRate, failureRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartFailureMode> getPartFailureModes() {
		if (partFailureModes == null) {
			partFailureModes = new EObjectContainmentEList<PartFailureMode>(PartFailureMode.class, this, LibraryPackage.IO_TYPE__PART_FAILURE_MODES);
		}
		return partFailureModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoDirectionE getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(IoDirectionE newDirection) {
		IoDirectionE oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.IO_TYPE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.IO_TYPE__PART_FAILURE_MODES:
				return ((InternalEList<?>)getPartFailureModes()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.IO_TYPE__CAN_FAIL:
				return isCanFail();
			case LibraryPackage.IO_TYPE__FAILURE_RATE:
				return getFailureRate();
			case LibraryPackage.IO_TYPE__PART_FAILURE_MODES:
				return getPartFailureModes();
			case LibraryPackage.IO_TYPE__DIRECTION:
				return getDirection();
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
			case LibraryPackage.IO_TYPE__CAN_FAIL:
				setCanFail((Boolean)newValue);
				return;
			case LibraryPackage.IO_TYPE__FAILURE_RATE:
				setFailureRate((Double)newValue);
				return;
			case LibraryPackage.IO_TYPE__PART_FAILURE_MODES:
				getPartFailureModes().clear();
				getPartFailureModes().addAll((Collection<? extends PartFailureMode>)newValue);
				return;
			case LibraryPackage.IO_TYPE__DIRECTION:
				setDirection((IoDirectionE)newValue);
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
			case LibraryPackage.IO_TYPE__CAN_FAIL:
				setCanFail(CAN_FAIL_EDEFAULT);
				return;
			case LibraryPackage.IO_TYPE__FAILURE_RATE:
				setFailureRate(FAILURE_RATE_EDEFAULT);
				return;
			case LibraryPackage.IO_TYPE__PART_FAILURE_MODES:
				getPartFailureModes().clear();
				return;
			case LibraryPackage.IO_TYPE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case LibraryPackage.IO_TYPE__CAN_FAIL:
				return canFail != CAN_FAIL_EDEFAULT;
			case LibraryPackage.IO_TYPE__FAILURE_RATE:
				return failureRate != FAILURE_RATE_EDEFAULT;
			case LibraryPackage.IO_TYPE__PART_FAILURE_MODES:
				return partFailureModes != null && !partFailureModes.isEmpty();
			case LibraryPackage.IO_TYPE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FailureProviderA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.IO_TYPE__CAN_FAIL: return SafetyPackage.FAILURE_PROVIDER_A__CAN_FAIL;
				case LibraryPackage.IO_TYPE__FAILURE_RATE: return SafetyPackage.FAILURE_PROVIDER_A__FAILURE_RATE;
				case LibraryPackage.IO_TYPE__PART_FAILURE_MODES: return SafetyPackage.FAILURE_PROVIDER_A__PART_FAILURE_MODES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FailureProviderA.class) {
			switch (baseFeatureID) {
				case SafetyPackage.FAILURE_PROVIDER_A__CAN_FAIL: return LibraryPackage.IO_TYPE__CAN_FAIL;
				case SafetyPackage.FAILURE_PROVIDER_A__FAILURE_RATE: return LibraryPackage.IO_TYPE__FAILURE_RATE;
				case SafetyPackage.FAILURE_PROVIDER_A__PART_FAILURE_MODES: return LibraryPackage.IO_TYPE__PART_FAILURE_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (canFail: ");
		result.append(canFail);
		result.append(", failureRate: ");
		result.append(failureRate);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //IoTypeImpl
