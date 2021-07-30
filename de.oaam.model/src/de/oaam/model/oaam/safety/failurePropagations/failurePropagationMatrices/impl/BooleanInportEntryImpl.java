/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Inport Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportEntryImpl#isValue <em>Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportEntryImpl#getInport <em>Inport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanInportEntryImpl extends OaamBaseElementAImpl implements BooleanInportEntry {
	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInport() <em>Inport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInport()
	 * @generated
	 * @ordered
	 */
	protected BooleanInport inport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanInportEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.BOOLEAN_INPORT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanInport getInport() {
		if (inport != null && inport.eIsProxy()) {
			InternalEObject oldInport = (InternalEObject)inport;
			inport = (BooleanInport)eResolveProxy(oldInport);
			if (inport != oldInport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__INPORT, oldInport, inport));
			}
		}
		return inport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanInport basicGetInport() {
		return inport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInport(BooleanInport newInport) {
		BooleanInport oldInport = inport;
		inport = newInport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__INPORT, oldInport, inport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__VALUE:
				return isValue();
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__INPORT:
				if (resolve) return getInport();
				return basicGetInport();
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
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__VALUE:
				setValue((Boolean)newValue);
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__INPORT:
				setInport((BooleanInport)newValue);
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
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__INPORT:
				setInport((BooleanInport)null);
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
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__VALUE:
				return value != VALUE_EDEFAULT;
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY__INPORT:
				return inport != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //BooleanInportEntryImpl
