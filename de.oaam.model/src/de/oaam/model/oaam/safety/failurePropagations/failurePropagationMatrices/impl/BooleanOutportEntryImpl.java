/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Outport Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportEntryImpl#isValue <em>Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportEntryImpl#getOutport <em>Outport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanOutportEntryImpl extends OaamBaseElementAImpl implements BooleanOutportEntry {
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
	 * The cached value of the '{@link #getOutport() <em>Outport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutport()
	 * @generated
	 * @ordered
	 */
	protected BooleanOutport outport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOutportEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.BOOLEAN_OUTPORT_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOutport getOutport() {
		if (outport != null && outport.eIsProxy()) {
			InternalEObject oldOutport = (InternalEObject)outport;
			outport = (BooleanOutport)eResolveProxy(oldOutport);
			if (outport != oldOutport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__OUTPORT, oldOutport, outport));
			}
		}
		return outport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOutport basicGetOutport() {
		return outport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutport(BooleanOutport newOutport) {
		BooleanOutport oldOutport = outport;
		outport = newOutport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__OUTPORT, oldOutport, outport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__VALUE:
				return isValue();
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__OUTPORT:
				if (resolve) return getOutport();
				return basicGetOutport();
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
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__VALUE:
				setValue((Boolean)newValue);
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__OUTPORT:
				setOutport((BooleanOutport)newValue);
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
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__OUTPORT:
				setOutport((BooleanOutport)null);
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
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__VALUE:
				return value != VALUE_EDEFAULT;
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY__OUTPORT:
				return outport != null;
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

} //BooleanOutportEntryImpl
