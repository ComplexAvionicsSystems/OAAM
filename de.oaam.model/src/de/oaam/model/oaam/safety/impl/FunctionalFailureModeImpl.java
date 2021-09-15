/**
 */
package de.oaam.model.oaam.safety.impl;

import de.oaam.model.oaam.common.IntegrityStateE;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.FunctionalFailureMode;
import de.oaam.model.oaam.safety.RequirementFailureEffect;
import de.oaam.model.oaam.safety.SafetyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Failure Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FunctionalFailureModeImpl#getRequirementFailureEffects <em>Requirement Failure Effects</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FunctionalFailureModeImpl#getIntegrityState <em>Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FunctionalFailureModeImpl#getShortNotation <em>Short Notation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalFailureModeImpl extends OaamBaseElementAImpl implements FunctionalFailureMode {
	/**
	 * The cached value of the '{@link #getRequirementFailureEffects() <em>Requirement Failure Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementFailureEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementFailureEffect> requirementFailureEffects;

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
	 * The default value of the '{@link #getShortNotation() <em>Short Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortNotation()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortNotation() <em>Short Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortNotation()
	 * @generated
	 * @ordered
	 */
	protected String shortNotation = SHORT_NOTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalFailureModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyPackage.Literals.FUNCTIONAL_FAILURE_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementFailureEffect> getRequirementFailureEffects() {
		if (requirementFailureEffects == null) {
			requirementFailureEffects = new EObjectContainmentEList<RequirementFailureEffect>(RequirementFailureEffect.class, this, SafetyPackage.FUNCTIONAL_FAILURE_MODE__REQUIREMENT_FAILURE_EFFECTS);
		}
		return requirementFailureEffects;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.FUNCTIONAL_FAILURE_MODE__INTEGRITY_STATE, oldIntegrityState, integrityState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortNotation() {
		return shortNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortNotation(String newShortNotation) {
		String oldShortNotation = shortNotation;
		shortNotation = newShortNotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.FUNCTIONAL_FAILURE_MODE__SHORT_NOTATION, oldShortNotation, shortNotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__REQUIREMENT_FAILURE_EFFECTS:
				return ((InternalEList<?>)getRequirementFailureEffects()).basicRemove(otherEnd, msgs);
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
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__REQUIREMENT_FAILURE_EFFECTS:
				return getRequirementFailureEffects();
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__INTEGRITY_STATE:
				return getIntegrityState();
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__SHORT_NOTATION:
				return getShortNotation();
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
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__REQUIREMENT_FAILURE_EFFECTS:
				getRequirementFailureEffects().clear();
				getRequirementFailureEffects().addAll((Collection<? extends RequirementFailureEffect>)newValue);
				return;
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__INTEGRITY_STATE:
				setIntegrityState((IntegrityStateE)newValue);
				return;
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__SHORT_NOTATION:
				setShortNotation((String)newValue);
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
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__REQUIREMENT_FAILURE_EFFECTS:
				getRequirementFailureEffects().clear();
				return;
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__INTEGRITY_STATE:
				setIntegrityState(INTEGRITY_STATE_EDEFAULT);
				return;
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__SHORT_NOTATION:
				setShortNotation(SHORT_NOTATION_EDEFAULT);
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
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__REQUIREMENT_FAILURE_EFFECTS:
				return requirementFailureEffects != null && !requirementFailureEffects.isEmpty();
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__INTEGRITY_STATE:
				return integrityState != INTEGRITY_STATE_EDEFAULT;
			case SafetyPackage.FUNCTIONAL_FAILURE_MODE__SHORT_NOTATION:
				return SHORT_NOTATION_EDEFAULT == null ? shortNotation != null : !SHORT_NOTATION_EDEFAULT.equals(shortNotation);
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
		result.append(", shortNotation: ");
		result.append(shortNotation);
		result.append(')');
		return result.toString();
	}

} //FunctionalFailureModeImpl
