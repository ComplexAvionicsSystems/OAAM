/**
 */
package de.oaam.model.oaam.common.impl;

import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.EndianessE;

import java.lang.Boolean;
import java.lang.Integer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.impl.IntegerImpl#isSigned <em>Signed</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.impl.IntegerImpl#getNBits <em>NBits</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.impl.IntegerImpl#getEndianess <em>Endianess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerImpl extends DataTypeAImpl implements de.oaam.model.oaam.common.Integer {
	/**
	 * The default value of the '{@link #isSigned() <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGNED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSigned() <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSigned()
	 * @generated
	 * @ordered
	 */
	protected boolean signed = SIGNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNBits() <em>NBits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBits()
	 * @generated
	 * @ordered
	 */
	protected static final int NBITS_EDEFAULT = 16;

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
	protected IntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.INTEGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSigned() {
		return signed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigned(boolean newSigned) {
		boolean oldSigned = signed;
		signed = newSigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.INTEGER__SIGNED, oldSigned, signed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.INTEGER__NBITS, oldNBits, nBits));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.INTEGER__ENDIANESS, oldEndianess, endianess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.INTEGER__SIGNED:
				return isSigned();
			case CommonPackage.INTEGER__NBITS:
				return getNBits();
			case CommonPackage.INTEGER__ENDIANESS:
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
			case CommonPackage.INTEGER__SIGNED:
				setSigned((Boolean)newValue);
				return;
			case CommonPackage.INTEGER__NBITS:
				setNBits((Integer)newValue);
				return;
			case CommonPackage.INTEGER__ENDIANESS:
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
			case CommonPackage.INTEGER__SIGNED:
				setSigned(SIGNED_EDEFAULT);
				return;
			case CommonPackage.INTEGER__NBITS:
				setNBits(NBITS_EDEFAULT);
				return;
			case CommonPackage.INTEGER__ENDIANESS:
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
			case CommonPackage.INTEGER__SIGNED:
				return signed != SIGNED_EDEFAULT;
			case CommonPackage.INTEGER__NBITS:
				return nBits != NBITS_EDEFAULT;
			case CommonPackage.INTEGER__ENDIANESS:
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
		result.append(" (signed: ");
		result.append(signed);
		result.append(", nBits: ");
		result.append(nBits);
		result.append(", endianess: ");
		result.append(endianess);
		result.append(')');
		return result.toString();
	}

} //IntegerImpl
