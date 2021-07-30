/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.IntegrityStateE;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integrity State Outport Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportEntryImpl#getIntegrityState <em>Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportEntryImpl#getOutport <em>Outport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrityStateOutportEntryImpl extends OaamBaseElementAImpl implements IntegrityStateOutportEntry {
	/**
	 * The default value of the '{@link #getIntegrityState() <em>Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityStateE INTEGRITY_STATE_EDEFAULT = IntegrityStateE.OK;

	/**
	 * The cached value of the '{@link #getIntegrityState() <em>Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityState()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStateE integrityState = INTEGRITY_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutport() <em>Outport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutport()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStateOutport outport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrityStateOutportEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.INTEGRITY_STATE_OUTPORT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateE getIntegrityState() {
		return integrityState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityState(IntegrityStateE newIntegrityState) {
		IntegrityStateE oldIntegrityState = integrityState;
		integrityState = newIntegrityState == null ? INTEGRITY_STATE_EDEFAULT : newIntegrityState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__INTEGRITY_STATE, oldIntegrityState, integrityState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateOutport getOutport() {
		if (outport != null && outport.eIsProxy()) {
			InternalEObject oldOutport = (InternalEObject)outport;
			outport = (IntegrityStateOutport)eResolveProxy(oldOutport);
			if (outport != oldOutport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__OUTPORT, oldOutport, outport));
			}
		}
		return outport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateOutport basicGetOutport() {
		return outport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutport(IntegrityStateOutport newOutport) {
		IntegrityStateOutport oldOutport = outport;
		outport = newOutport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__OUTPORT, oldOutport, outport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__INTEGRITY_STATE:
				return getIntegrityState();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__OUTPORT:
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__INTEGRITY_STATE:
				setIntegrityState((IntegrityStateE)newValue);
				return;
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__OUTPORT:
				setOutport((IntegrityStateOutport)newValue);
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__INTEGRITY_STATE:
				setIntegrityState(INTEGRITY_STATE_EDEFAULT);
				return;
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__OUTPORT:
				setOutport((IntegrityStateOutport)null);
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__INTEGRITY_STATE:
				return integrityState != INTEGRITY_STATE_EDEFAULT;
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY__OUTPORT:
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
		result.append(" (integrityState: ");
		result.append(integrityState);
		result.append(')');
		return result.toString();
	}

} //IntegrityStateOutportEntryImpl
