/**
 */
package de.oaam.model.oaam.scenario.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;
import de.oaam.model.oaam.scenario.OperationMode;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Mode Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.OperationModeReferenceImpl#getOperationMode <em>Operation Mode</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.OperationModeReferenceImpl#getActiveProbability <em>Active Probability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationModeReferenceImpl extends OaamBaseElementAImpl implements OperationModeReference {
	/**
	 * The cached value of the '{@link #getOperationMode() <em>Operation Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationMode()
	 * @generated
	 * @ordered
	 */
	protected OperationMode operationMode;

	/**
	 * The default value of the '{@link #getActiveProbability() <em>Active Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getActiveProbability() <em>Active Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveProbability()
	 * @generated
	 * @ordered
	 */
	protected double activeProbability = ACTIVE_PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationModeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.OPERATION_MODE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationMode getOperationMode() {
		if (operationMode != null && operationMode.eIsProxy()) {
			InternalEObject oldOperationMode = (InternalEObject)operationMode;
			operationMode = (OperationMode)eResolveProxy(oldOperationMode);
			if (operationMode != oldOperationMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.OPERATION_MODE_REFERENCE__OPERATION_MODE, oldOperationMode, operationMode));
			}
		}
		return operationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationMode basicGetOperationMode() {
		return operationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationMode(OperationMode newOperationMode) {
		OperationMode oldOperationMode = operationMode;
		operationMode = newOperationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.OPERATION_MODE_REFERENCE__OPERATION_MODE, oldOperationMode, operationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActiveProbability() {
		return activeProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveProbability(double newActiveProbability) {
		double oldActiveProbability = activeProbability;
		activeProbability = newActiveProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.OPERATION_MODE_REFERENCE__ACTIVE_PROBABILITY, oldActiveProbability, activeProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.OPERATION_MODE_REFERENCE__OPERATION_MODE:
				if (resolve) return getOperationMode();
				return basicGetOperationMode();
			case ScenarioPackage.OPERATION_MODE_REFERENCE__ACTIVE_PROBABILITY:
				return getActiveProbability();
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
			case ScenarioPackage.OPERATION_MODE_REFERENCE__OPERATION_MODE:
				setOperationMode((OperationMode)newValue);
				return;
			case ScenarioPackage.OPERATION_MODE_REFERENCE__ACTIVE_PROBABILITY:
				setActiveProbability((Double)newValue);
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
			case ScenarioPackage.OPERATION_MODE_REFERENCE__OPERATION_MODE:
				setOperationMode((OperationMode)null);
				return;
			case ScenarioPackage.OPERATION_MODE_REFERENCE__ACTIVE_PROBABILITY:
				setActiveProbability(ACTIVE_PROBABILITY_EDEFAULT);
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
			case ScenarioPackage.OPERATION_MODE_REFERENCE__OPERATION_MODE:
				return operationMode != null;
			case ScenarioPackage.OPERATION_MODE_REFERENCE__ACTIVE_PROBABILITY:
				return activeProbability != ACTIVE_PROBABILITY_EDEFAULT;
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
		result.append(" (activeProbability: ");
		result.append(activeProbability);
		result.append(')');
		return result.toString();
	}

} //OperationModeReferenceImpl
