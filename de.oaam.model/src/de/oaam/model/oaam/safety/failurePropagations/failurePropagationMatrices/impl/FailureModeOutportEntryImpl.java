/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Mode Outport Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportEntryImpl#getOutport <em>Outport</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportEntryImpl#getFailureMode <em>Failure Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModeOutportEntryImpl extends OaamBaseElementAImpl implements FailureModeOutportEntry {
	/**
	 * The cached value of the '{@link #getOutport() <em>Outport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutport()
	 * @generated
	 * @ordered
	 */
	protected FailureModeOutport outport;

	/**
	 * The cached value of the '{@link #getFailureMode() <em>Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMode()
	 * @generated
	 * @ordered
	 */
	protected FunctionalFailureMode failureMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModeOutportEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.FAILURE_MODE_OUTPORT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeOutport getOutport() {
		if (outport != null && outport.eIsProxy()) {
			InternalEObject oldOutport = (InternalEObject)outport;
			outport = (FailureModeOutport)eResolveProxy(oldOutport);
			if (outport != oldOutport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__OUTPORT, oldOutport, outport));
			}
		}
		return outport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeOutport basicGetOutport() {
		return outport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutport(FailureModeOutport newOutport) {
		FailureModeOutport oldOutport = outport;
		outport = newOutport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__OUTPORT, oldOutport, outport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode getFailureMode() {
		if (failureMode != null && failureMode.eIsProxy()) {
			InternalEObject oldFailureMode = (InternalEObject)failureMode;
			failureMode = (FunctionalFailureMode)eResolveProxy(oldFailureMode);
			if (failureMode != oldFailureMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__FAILURE_MODE, oldFailureMode, failureMode));
			}
		}
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode basicGetFailureMode() {
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureMode(FunctionalFailureMode newFailureMode) {
		FunctionalFailureMode oldFailureMode = failureMode;
		failureMode = newFailureMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__FAILURE_MODE, oldFailureMode, failureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__OUTPORT:
				if (resolve) return getOutport();
				return basicGetOutport();
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__FAILURE_MODE:
				if (resolve) return getFailureMode();
				return basicGetFailureMode();
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__OUTPORT:
				setOutport((FailureModeOutport)newValue);
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__FAILURE_MODE:
				setFailureMode((FunctionalFailureMode)newValue);
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__OUTPORT:
				setOutport((FailureModeOutport)null);
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__FAILURE_MODE:
				setFailureMode((FunctionalFailureMode)null);
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__OUTPORT:
				return outport != null;
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY__FAILURE_MODE:
				return failureMode != null;
		}
		return super.eIsSet(featureID);
	}

} //FailureModeOutportEntryImpl
