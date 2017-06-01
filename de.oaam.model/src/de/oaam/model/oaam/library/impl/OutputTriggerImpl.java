/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.BoolA;

import de.oaam.model.oaam.common.impl._ElementAImpl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.OutputTrigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputTriggerImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputTriggerImpl#getFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputTriggerImpl#isIdFixedRate <em>Id Fixed Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputTriggerImpl extends _ElementAImpl implements OutputTrigger {
	/**
	 * The cached value of the '{@link #getLogic() <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogic()
	 * @generated
	 * @ordered
	 */
	protected BoolA logic;

	/**
	 * The default value of the '{@link #getFixedRate() <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRate()
	 * @generated
	 * @ordered
	 */
	protected static final float FIXED_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFixedRate() <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRate()
	 * @generated
	 * @ordered
	 */
	protected float fixedRate = FIXED_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIdFixedRate() <em>Id Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdFixedRate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ID_FIXED_RATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdFixedRate() <em>Id Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdFixedRate()
	 * @generated
	 * @ordered
	 */
	protected boolean idFixedRate = ID_FIXED_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OUTPUT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolA getLogic() {
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogic(BoolA newLogic, NotificationChain msgs) {
		BoolA oldLogic = logic;
		logic = newLogic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_TRIGGER__LOGIC, oldLogic, newLogic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogic(BoolA newLogic) {
		if (newLogic != logic) {
			NotificationChain msgs = null;
			if (logic != null)
				msgs = ((InternalEObject)logic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.OUTPUT_TRIGGER__LOGIC, null, msgs);
			if (newLogic != null)
				msgs = ((InternalEObject)newLogic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.OUTPUT_TRIGGER__LOGIC, null, msgs);
			msgs = basicSetLogic(newLogic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_TRIGGER__LOGIC, newLogic, newLogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFixedRate() {
		return fixedRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedRate(float newFixedRate) {
		float oldFixedRate = fixedRate;
		fixedRate = newFixedRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_TRIGGER__FIXED_RATE, oldFixedRate, fixedRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdFixedRate() {
		return idFixedRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdFixedRate(boolean newIdFixedRate) {
		boolean oldIdFixedRate = idFixedRate;
		idFixedRate = newIdFixedRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_TRIGGER__ID_FIXED_RATE, oldIdFixedRate, idFixedRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OUTPUT_TRIGGER__LOGIC:
				return basicSetLogic(null, msgs);
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
			case LibraryPackage.OUTPUT_TRIGGER__LOGIC:
				return getLogic();
			case LibraryPackage.OUTPUT_TRIGGER__FIXED_RATE:
				return getFixedRate();
			case LibraryPackage.OUTPUT_TRIGGER__ID_FIXED_RATE:
				return isIdFixedRate();
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
			case LibraryPackage.OUTPUT_TRIGGER__LOGIC:
				setLogic((BoolA)newValue);
				return;
			case LibraryPackage.OUTPUT_TRIGGER__FIXED_RATE:
				setFixedRate((Float)newValue);
				return;
			case LibraryPackage.OUTPUT_TRIGGER__ID_FIXED_RATE:
				setIdFixedRate((Boolean)newValue);
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
			case LibraryPackage.OUTPUT_TRIGGER__LOGIC:
				setLogic((BoolA)null);
				return;
			case LibraryPackage.OUTPUT_TRIGGER__FIXED_RATE:
				setFixedRate(FIXED_RATE_EDEFAULT);
				return;
			case LibraryPackage.OUTPUT_TRIGGER__ID_FIXED_RATE:
				setIdFixedRate(ID_FIXED_RATE_EDEFAULT);
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
			case LibraryPackage.OUTPUT_TRIGGER__LOGIC:
				return logic != null;
			case LibraryPackage.OUTPUT_TRIGGER__FIXED_RATE:
				return fixedRate != FIXED_RATE_EDEFAULT;
			case LibraryPackage.OUTPUT_TRIGGER__ID_FIXED_RATE:
				return idFixedRate != ID_FIXED_RATE_EDEFAULT;
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
		result.append(" (fixedRate: ");
		result.append(fixedRate);
		result.append(", idFixedRate: ");
		result.append(idFixedRate);
		result.append(')');
		return result.toString();
	}

} //OutputTriggerImpl
