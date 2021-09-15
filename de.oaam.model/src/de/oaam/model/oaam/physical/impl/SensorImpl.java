/**
 */
package de.oaam.model.oaam.physical.impl;

import de.oaam.model.oaam.functions.Output;

import de.oaam.model.oaam.physical.PhysicalPackage;
import de.oaam.model.oaam.physical.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.physical.impl.SensorImpl#getSignalledBy <em>Signalled By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends PhysicalInterfaceAImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getSignalledBy() <em>Signalled By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> signalledBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getSignalledBy() {
		if (signalledBy == null) {
			signalledBy = new EObjectResolvingEList<Output>(Output.class, this, PhysicalPackage.SENSOR__SIGNALLED_BY);
		}
		return signalledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhysicalPackage.SENSOR__SIGNALLED_BY:
				return getSignalledBy();
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
			case PhysicalPackage.SENSOR__SIGNALLED_BY:
				getSignalledBy().clear();
				getSignalledBy().addAll((Collection<? extends Output>)newValue);
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
			case PhysicalPackage.SENSOR__SIGNALLED_BY:
				getSignalledBy().clear();
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
			case PhysicalPackage.SENSOR__SIGNALLED_BY:
				return signalledBy != null && !signalledBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SensorImpl
