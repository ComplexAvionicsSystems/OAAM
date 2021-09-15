/**
 */
package de.oaam.model.oaam.safety.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FunctionalFailureMode;
import de.oaam.model.oaam.safety.FunctionalFailureModeSet;
import de.oaam.model.oaam.safety.SafetyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Failure Mode Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FunctionalFailureModeSetImpl#getFailureModes <em>Failure Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalFailureModeSetImpl extends OaamBaseElementAImpl implements FunctionalFailureModeSet {
	/**
	 * The cached value of the '{@link #getFailureModes() <em>Failure Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModes()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalFailureMode> failureModes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalFailureModeSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyPackage.Literals.FUNCTIONAL_FAILURE_MODE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalFailureMode> getFailureModes() {
		if (failureModes == null) {
			failureModes = new EObjectContainmentEList<FunctionalFailureMode>(FunctionalFailureMode.class, this, SafetyPackage.FUNCTIONAL_FAILURE_MODE_SET__FAILURE_MODES);
		}
		return failureModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE_SET__FAILURE_MODES:
				return ((InternalEList<?>)getFailureModes()).basicRemove(otherEnd, msgs);
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
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE_SET__FAILURE_MODES:
				return getFailureModes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE_SET__FAILURE_MODES:
				getFailureModes().clear();
				getFailureModes().addAll((Collection<? extends FunctionalFailureMode>)newValue);
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
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE_SET__FAILURE_MODES:
				getFailureModes().clear();
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
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE_SET__FAILURE_MODES:
				return failureModes != null && !failureModes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalFailureModeSetImpl
