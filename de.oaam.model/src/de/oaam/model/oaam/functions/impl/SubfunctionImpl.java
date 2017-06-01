/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.functions.FunctionsPackage;
import de.oaam.model.oaam.functions.Subfunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subfunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SubfunctionImpl#getMultiplicityMin <em>Multiplicity Min</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SubfunctionImpl#getMultiplicityMax <em>Multiplicity Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubfunctionImpl extends FunctionsContainerAImpl implements Subfunction {
	/**
	 * The default value of the '{@link #getMultiplicityMin() <em>Multiplicity Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_MIN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMultiplicityMin() <em>Multiplicity Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityMin()
	 * @generated
	 * @ordered
	 */
	protected int multiplicityMin = MULTIPLICITY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityMax() <em>Multiplicity Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_MAX_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMultiplicityMax() <em>Multiplicity Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityMax()
	 * @generated
	 * @ordered
	 */
	protected int multiplicityMax = MULTIPLICITY_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubfunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SUBFUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicityMin() {
		return multiplicityMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityMin(int newMultiplicityMin) {
		int oldMultiplicityMin = multiplicityMin;
		multiplicityMin = newMultiplicityMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MIN, oldMultiplicityMin, multiplicityMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicityMax() {
		return multiplicityMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityMax(int newMultiplicityMax) {
		int oldMultiplicityMax = multiplicityMax;
		multiplicityMax = newMultiplicityMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MAX, oldMultiplicityMax, multiplicityMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MIN:
				return getMultiplicityMin();
			case FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MAX:
				return getMultiplicityMax();
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
			case FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MIN:
				setMultiplicityMin((Integer)newValue);
				return;
			case FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MAX:
				setMultiplicityMax((Integer)newValue);
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
			case FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MIN:
				setMultiplicityMin(MULTIPLICITY_MIN_EDEFAULT);
				return;
			case FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MAX:
				setMultiplicityMax(MULTIPLICITY_MAX_EDEFAULT);
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
			case FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MIN:
				return multiplicityMin != MULTIPLICITY_MIN_EDEFAULT;
			case FunctionsPackage.SUBFUNCTION__MULTIPLICITY_MAX:
				return multiplicityMax != MULTIPLICITY_MAX_EDEFAULT;
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
		result.append(" (multiplicityMin: ");
		result.append(multiplicityMin);
		result.append(", multiplicityMax: ");
		result.append(multiplicityMax);
		result.append(')');
		return result.toString();
	}

} //SubfunctionImpl
