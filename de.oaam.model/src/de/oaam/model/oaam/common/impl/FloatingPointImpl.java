/**
 */
package de.oaam.model.oaam.common.impl;

import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.EndianessE;
import de.oaam.model.oaam.common.FloatingPoint;

import java.lang.Integer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floating Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.impl.FloatingPointImpl#getNBits <em>NBits</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.impl.FloatingPointImpl#getEndianess <em>Endianess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatingPointImpl extends DataTypeAImpl implements FloatingPoint {
	/**
	 * The default value of the '{@link #getNBits() <em>NBits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBits()
	 * @generated
	 * @ordered
	 */
	protected static final int NBITS_EDEFAULT = 32;

	/**
	 * The cached value of the '{@link #getNBits() <em>NBits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBits()
	 * @generated
	 * @ordered
	 */
	protected int nBits = NBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndianess() <em>Endianess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndianess()
	 * @generated
	 * @ordered
	 */
	protected static final EndianessE ENDIANESS_EDEFAULT = EndianessE.BIG;

	/**
	 * The cached value of the '{@link #getEndianess() <em>Endianess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndianess()
	 * @generated
	 * @ordered
	 */
	protected EndianessE endianess = ENDIANESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatingPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.FLOATING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNBits() {
		return nBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNBits(int newNBits) {
		int oldNBits = nBits;
		nBits = newNBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FLOATING_POINT__NBITS, oldNBits, nBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianessE getEndianess() {
		return endianess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndianess(EndianessE newEndianess) {
		EndianessE oldEndianess = endianess;
		endianess = newEndianess == null ? ENDIANESS_EDEFAULT : newEndianess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FLOATING_POINT__ENDIANESS, oldEndianess, endianess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.FLOATING_POINT__NBITS:
				return getNBits();
			case CommonPackage.FLOATING_POINT__ENDIANESS:
				return getEndianess();
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
			case CommonPackage.FLOATING_POINT__NBITS:
				setNBits((Integer)newValue);
				return;
			case CommonPackage.FLOATING_POINT__ENDIANESS:
				setEndianess((EndianessE)newValue);
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
			case CommonPackage.FLOATING_POINT__NBITS:
				setNBits(NBITS_EDEFAULT);
				return;
			case CommonPackage.FLOATING_POINT__ENDIANESS:
				setEndianess(ENDIANESS_EDEFAULT);
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
			case CommonPackage.FLOATING_POINT__NBITS:
				return nBits != NBITS_EDEFAULT;
			case CommonPackage.FLOATING_POINT__ENDIANESS:
				return endianess != ENDIANESS_EDEFAULT;
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
		result.append(" (nBits: ");
		result.append(nBits);
		result.append(", endianess: ");
		result.append(endianess);
		result.append(')');
		return result.toString();
	}

} //FloatingPointImpl
