/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.systems.ElectricPower;
import de.oaam.model.oaam.systems.SystemsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electric Power</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.impl.ElectricPowerImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.ElectricPowerImpl#getNPhases <em>NPhases</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.ElectricPowerImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.ElectricPowerImpl#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricPowerImpl extends PowerImpl implements ElectricPower {
	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final double FREQUENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected double frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNPhases() <em>NPhases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNPhases()
	 * @generated
	 * @ordered
	 */
	protected static final int NPHASES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNPhases() <em>NPhases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNPhases()
	 * @generated
	 * @ordered
	 */
	protected int nPhases = NPHASES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected double voltage = VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected double current = CURRENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricPowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemsPackage.Literals.ELECTRIC_POWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(double newFrequency) {
		double oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.ELECTRIC_POWER__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNPhases() {
		return nPhases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNPhases(int newNPhases) {
		int oldNPhases = nPhases;
		nPhases = newNPhases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.ELECTRIC_POWER__NPHASES, oldNPhases, nPhases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(double newVoltage) {
		double oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.ELECTRIC_POWER__VOLTAGE, oldVoltage, voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(double newCurrent) {
		double oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.ELECTRIC_POWER__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemsPackage.ELECTRIC_POWER__FREQUENCY:
				return getFrequency();
			case SystemsPackage.ELECTRIC_POWER__NPHASES:
				return getNPhases();
			case SystemsPackage.ELECTRIC_POWER__VOLTAGE:
				return getVoltage();
			case SystemsPackage.ELECTRIC_POWER__CURRENT:
				return getCurrent();
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
			case SystemsPackage.ELECTRIC_POWER__FREQUENCY:
				setFrequency((Double)newValue);
				return;
			case SystemsPackage.ELECTRIC_POWER__NPHASES:
				setNPhases((Integer)newValue);
				return;
			case SystemsPackage.ELECTRIC_POWER__VOLTAGE:
				setVoltage((Double)newValue);
				return;
			case SystemsPackage.ELECTRIC_POWER__CURRENT:
				setCurrent((Double)newValue);
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
			case SystemsPackage.ELECTRIC_POWER__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case SystemsPackage.ELECTRIC_POWER__NPHASES:
				setNPhases(NPHASES_EDEFAULT);
				return;
			case SystemsPackage.ELECTRIC_POWER__VOLTAGE:
				setVoltage(VOLTAGE_EDEFAULT);
				return;
			case SystemsPackage.ELECTRIC_POWER__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
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
			case SystemsPackage.ELECTRIC_POWER__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case SystemsPackage.ELECTRIC_POWER__NPHASES:
				return nPhases != NPHASES_EDEFAULT;
			case SystemsPackage.ELECTRIC_POWER__VOLTAGE:
				return voltage != VOLTAGE_EDEFAULT;
			case SystemsPackage.ELECTRIC_POWER__CURRENT:
				return current != CURRENT_EDEFAULT;
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
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(", nPhases: ");
		result.append(nPhases);
		result.append(", voltage: ");
		result.append(voltage);
		result.append(", current: ");
		result.append(current);
		result.append(')');
		return result.toString();
	}

} //ElectricPowerImpl
