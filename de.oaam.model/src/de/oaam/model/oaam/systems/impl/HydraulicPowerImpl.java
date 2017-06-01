/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.systems.HydraulicPower;
import de.oaam.model.oaam.systems.SystemsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydraulic Power</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.impl.HydraulicPowerImpl#getPressure <em>Pressure</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.HydraulicPowerImpl#getMassFlowRate <em>Mass Flow Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydraulicPowerImpl extends PowerImpl implements HydraulicPower {
	/**
	 * The default value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected static final double PRESSURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected double pressure = PRESSURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMassFlowRate() <em>Mass Flow Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassFlowRate()
	 * @generated
	 * @ordered
	 */
	protected static final double MASS_FLOW_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMassFlowRate() <em>Mass Flow Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassFlowRate()
	 * @generated
	 * @ordered
	 */
	protected double massFlowRate = MASS_FLOW_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydraulicPowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemsPackage.Literals.HYDRAULIC_POWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPressure() {
		return pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressure(double newPressure) {
		double oldPressure = pressure;
		pressure = newPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.HYDRAULIC_POWER__PRESSURE, oldPressure, pressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMassFlowRate() {
		return massFlowRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassFlowRate(double newMassFlowRate) {
		double oldMassFlowRate = massFlowRate;
		massFlowRate = newMassFlowRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.HYDRAULIC_POWER__MASS_FLOW_RATE, oldMassFlowRate, massFlowRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemsPackage.HYDRAULIC_POWER__PRESSURE:
				return getPressure();
			case SystemsPackage.HYDRAULIC_POWER__MASS_FLOW_RATE:
				return getMassFlowRate();
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
			case SystemsPackage.HYDRAULIC_POWER__PRESSURE:
				setPressure((Double)newValue);
				return;
			case SystemsPackage.HYDRAULIC_POWER__MASS_FLOW_RATE:
				setMassFlowRate((Double)newValue);
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
			case SystemsPackage.HYDRAULIC_POWER__PRESSURE:
				setPressure(PRESSURE_EDEFAULT);
				return;
			case SystemsPackage.HYDRAULIC_POWER__MASS_FLOW_RATE:
				setMassFlowRate(MASS_FLOW_RATE_EDEFAULT);
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
			case SystemsPackage.HYDRAULIC_POWER__PRESSURE:
				return pressure != PRESSURE_EDEFAULT;
			case SystemsPackage.HYDRAULIC_POWER__MASS_FLOW_RATE:
				return massFlowRate != MASS_FLOW_RATE_EDEFAULT;
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
		result.append(" (pressure: ");
		result.append(pressure);
		result.append(", massFlowRate: ");
		result.append(massFlowRate);
		result.append(')');
		return result.toString();
	}

} //HydraulicPowerImpl
