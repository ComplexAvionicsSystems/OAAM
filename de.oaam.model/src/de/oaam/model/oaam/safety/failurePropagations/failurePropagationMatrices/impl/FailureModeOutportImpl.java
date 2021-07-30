/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Mode Outport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportImpl#getDefaultFailureMode <em>Default Failure Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModeOutportImpl extends OaamBaseElementAImpl implements FailureModeOutport {
	/**
	 * The cached value of the '{@link #getDefaultFailureMode() <em>Default Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFailureMode()
	 * @generated
	 * @ordered
	 */
	protected FunctionalFailureMode defaultFailureMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModeOutportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.FAILURE_MODE_OUTPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode getDefaultFailureMode() {
		if (defaultFailureMode != null && defaultFailureMode.eIsProxy()) {
			InternalEObject oldDefaultFailureMode = (InternalEObject)defaultFailureMode;
			defaultFailureMode = (FunctionalFailureMode)eResolveProxy(oldDefaultFailureMode);
			if (defaultFailureMode != oldDefaultFailureMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT__DEFAULT_FAILURE_MODE, oldDefaultFailureMode, defaultFailureMode));
			}
		}
		return defaultFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode basicGetDefaultFailureMode() {
		return defaultFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFailureMode(FunctionalFailureMode newDefaultFailureMode) {
		FunctionalFailureMode oldDefaultFailureMode = defaultFailureMode;
		defaultFailureMode = newDefaultFailureMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT__DEFAULT_FAILURE_MODE, oldDefaultFailureMode, defaultFailureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT__DEFAULT_FAILURE_MODE:
				if (resolve) return getDefaultFailureMode();
				return basicGetDefaultFailureMode();
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT__DEFAULT_FAILURE_MODE:
				setDefaultFailureMode((FunctionalFailureMode)newValue);
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT__DEFAULT_FAILURE_MODE:
				setDefaultFailureMode((FunctionalFailureMode)null);
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT__DEFAULT_FAILURE_MODE:
				return defaultFailureMode != null;
		}
		return super.eIsSet(featureID);
	}

} //FailureModeOutportImpl
