/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Mode Inport Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportEntryImpl#getInport <em>Inport</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportEntryImpl#getFailureMode <em>Failure Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModeInportEntryImpl extends OaamBaseElementAImpl implements FailureModeInportEntry {
	/**
	 * The cached value of the '{@link #getInport() <em>Inport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInport()
	 * @generated
	 * @ordered
	 */
	protected FailureModeInport inport;

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
	protected FailureModeInportEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.FAILURE_MODE_INPORT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeInport getInport() {
		if (inport != null && inport.eIsProxy()) {
			InternalEObject oldInport = (InternalEObject)inport;
			inport = (FailureModeInport)eResolveProxy(oldInport);
			if (inport != oldInport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__INPORT, oldInport, inport));
			}
		}
		return inport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeInport basicGetInport() {
		return inport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInport(FailureModeInport newInport) {
		FailureModeInport oldInport = inport;
		inport = newInport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__INPORT, oldInport, inport));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__FAILURE_MODE, oldFailureMode, failureMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__FAILURE_MODE, oldFailureMode, failureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__INPORT:
				if (resolve) return getInport();
				return basicGetInport();
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__FAILURE_MODE:
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__INPORT:
				setInport((FailureModeInport)newValue);
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__FAILURE_MODE:
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__INPORT:
				setInport((FailureModeInport)null);
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__FAILURE_MODE:
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__INPORT:
				return inport != null;
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY__FAILURE_MODE:
				return failureMode != null;
		}
		return super.eIsSet(featureID);
	}

} //FailureModeInportEntryImpl
