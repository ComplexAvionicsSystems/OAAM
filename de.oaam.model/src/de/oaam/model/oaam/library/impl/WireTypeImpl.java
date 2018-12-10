/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.WireType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.WireTypeImpl#getSpecificWeight <em>Specific Weight</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.WireTypeImpl#getSpecificPrice <em>Specific Price</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.WireTypeImpl#getNConductors <em>NConductors</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.WireTypeImpl#getMinBendingRadius <em>Min Bending Radius</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.WireTypeImpl#getNShields <em>NShields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WireTypeImpl extends OaamBaseElementAImpl implements WireType {
	/**
	 * The default value of the '{@link #getSpecificWeight() <em>Specific Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double SPECIFIC_WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpecificWeight() <em>Specific Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificWeight()
	 * @generated
	 * @ordered
	 */
	protected double specificWeight = SPECIFIC_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecificPrice() <em>Specific Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double SPECIFIC_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpecificPrice() <em>Specific Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificPrice()
	 * @generated
	 * @ordered
	 */
	protected double specificPrice = SPECIFIC_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNConductors() <em>NConductors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNConductors()
	 * @generated
	 * @ordered
	 */
	protected static final int NCONDUCTORS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNConductors() <em>NConductors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNConductors()
	 * @generated
	 * @ordered
	 */
	protected int nConductors = NCONDUCTORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinBendingRadius() <em>Min Bending Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBendingRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_BENDING_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinBendingRadius() <em>Min Bending Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBendingRadius()
	 * @generated
	 * @ordered
	 */
	protected double minBendingRadius = MIN_BENDING_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNShields() <em>NShields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNShields()
	 * @generated
	 * @ordered
	 */
	protected static final int NSHIELDS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNShields() <em>NShields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNShields()
	 * @generated
	 * @ordered
	 */
	protected int nShields = NSHIELDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.WIRE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpecificWeight() {
		return specificWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificWeight(double newSpecificWeight) {
		double oldSpecificWeight = specificWeight;
		specificWeight = newSpecificWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.WIRE_TYPE__SPECIFIC_WEIGHT, oldSpecificWeight, specificWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpecificPrice() {
		return specificPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificPrice(double newSpecificPrice) {
		double oldSpecificPrice = specificPrice;
		specificPrice = newSpecificPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.WIRE_TYPE__SPECIFIC_PRICE, oldSpecificPrice, specificPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNConductors() {
		return nConductors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNConductors(int newNConductors) {
		int oldNConductors = nConductors;
		nConductors = newNConductors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.WIRE_TYPE__NCONDUCTORS, oldNConductors, nConductors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinBendingRadius() {
		return minBendingRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinBendingRadius(double newMinBendingRadius) {
		double oldMinBendingRadius = minBendingRadius;
		minBendingRadius = newMinBendingRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.WIRE_TYPE__MIN_BENDING_RADIUS, oldMinBendingRadius, minBendingRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNShields() {
		return nShields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNShields(int newNShields) {
		int oldNShields = nShields;
		nShields = newNShields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.WIRE_TYPE__NSHIELDS, oldNShields, nShields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.WIRE_TYPE__SPECIFIC_WEIGHT:
				return getSpecificWeight();
			case LibraryPackage.WIRE_TYPE__SPECIFIC_PRICE:
				return getSpecificPrice();
			case LibraryPackage.WIRE_TYPE__NCONDUCTORS:
				return getNConductors();
			case LibraryPackage.WIRE_TYPE__MIN_BENDING_RADIUS:
				return getMinBendingRadius();
			case LibraryPackage.WIRE_TYPE__NSHIELDS:
				return getNShields();
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
			case LibraryPackage.WIRE_TYPE__SPECIFIC_WEIGHT:
				setSpecificWeight((Double)newValue);
				return;
			case LibraryPackage.WIRE_TYPE__SPECIFIC_PRICE:
				setSpecificPrice((Double)newValue);
				return;
			case LibraryPackage.WIRE_TYPE__NCONDUCTORS:
				setNConductors((Integer)newValue);
				return;
			case LibraryPackage.WIRE_TYPE__MIN_BENDING_RADIUS:
				setMinBendingRadius((Double)newValue);
				return;
			case LibraryPackage.WIRE_TYPE__NSHIELDS:
				setNShields((Integer)newValue);
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
			case LibraryPackage.WIRE_TYPE__SPECIFIC_WEIGHT:
				setSpecificWeight(SPECIFIC_WEIGHT_EDEFAULT);
				return;
			case LibraryPackage.WIRE_TYPE__SPECIFIC_PRICE:
				setSpecificPrice(SPECIFIC_PRICE_EDEFAULT);
				return;
			case LibraryPackage.WIRE_TYPE__NCONDUCTORS:
				setNConductors(NCONDUCTORS_EDEFAULT);
				return;
			case LibraryPackage.WIRE_TYPE__MIN_BENDING_RADIUS:
				setMinBendingRadius(MIN_BENDING_RADIUS_EDEFAULT);
				return;
			case LibraryPackage.WIRE_TYPE__NSHIELDS:
				setNShields(NSHIELDS_EDEFAULT);
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
			case LibraryPackage.WIRE_TYPE__SPECIFIC_WEIGHT:
				return specificWeight != SPECIFIC_WEIGHT_EDEFAULT;
			case LibraryPackage.WIRE_TYPE__SPECIFIC_PRICE:
				return specificPrice != SPECIFIC_PRICE_EDEFAULT;
			case LibraryPackage.WIRE_TYPE__NCONDUCTORS:
				return nConductors != NCONDUCTORS_EDEFAULT;
			case LibraryPackage.WIRE_TYPE__MIN_BENDING_RADIUS:
				return minBendingRadius != MIN_BENDING_RADIUS_EDEFAULT;
			case LibraryPackage.WIRE_TYPE__NSHIELDS:
				return nShields != NSHIELDS_EDEFAULT;
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
		result.append(" (specificWeight: ");
		result.append(specificWeight);
		result.append(", specificPrice: ");
		result.append(specificPrice);
		result.append(", nConductors: ");
		result.append(nConductors);
		result.append(", minBendingRadius: ");
		result.append(minBendingRadius);
		result.append(", nShields: ");
		result.append(nShields);
		result.append(')');
		return result.toString();
	}

} //WireTypeImpl
