/**
 */
package de.oaam.model.oaam.physical.impl;

import de.oaam.model.oaam.functions.Input;

import de.oaam.model.oaam.physical.Effector;
import de.oaam.model.oaam.physical.PhysicalPackage;
import de.oaam.model.oaam.physical.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.physical.impl.EffectorImpl#getObservableBy <em>Observable By</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.impl.EffectorImpl#getSignalledBy <em>Signalled By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectorImpl extends PhysicalInterfaceAImpl implements Effector {
	/**
	 * The cached value of the '{@link #getObservableBy() <em>Observable By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservableBy()
	 * @generated
	 * @ordered
	 */
	protected Sensor observableBy;

	/**
	 * The cached value of the '{@link #getSignalledBy() <em>Signalled By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> signalledBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalPackage.Literals.EFFECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getObservableBy() {
		if (observableBy != null && observableBy.eIsProxy()) {
			InternalEObject oldObservableBy = (InternalEObject)observableBy;
			observableBy = (Sensor)eResolveProxy(oldObservableBy);
			if (observableBy != oldObservableBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhysicalPackage.EFFECTOR__OBSERVABLE_BY, oldObservableBy, observableBy));
			}
		}
		return observableBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetObservableBy() {
		return observableBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservableBy(Sensor newObservableBy) {
		Sensor oldObservableBy = observableBy;
		observableBy = newObservableBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalPackage.EFFECTOR__OBSERVABLE_BY, oldObservableBy, observableBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getSignalledBy() {
		if (signalledBy == null) {
			signalledBy = new EObjectResolvingEList<Input>(Input.class, this, PhysicalPackage.EFFECTOR__SIGNALLED_BY);
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
			case PhysicalPackage.EFFECTOR__OBSERVABLE_BY:
				if (resolve) return getObservableBy();
				return basicGetObservableBy();
			case PhysicalPackage.EFFECTOR__SIGNALLED_BY:
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
			case PhysicalPackage.EFFECTOR__OBSERVABLE_BY:
				setObservableBy((Sensor)newValue);
				return;
			case PhysicalPackage.EFFECTOR__SIGNALLED_BY:
				getSignalledBy().clear();
				getSignalledBy().addAll((Collection<? extends Input>)newValue);
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
			case PhysicalPackage.EFFECTOR__OBSERVABLE_BY:
				setObservableBy((Sensor)null);
				return;
			case PhysicalPackage.EFFECTOR__SIGNALLED_BY:
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
			case PhysicalPackage.EFFECTOR__OBSERVABLE_BY:
				return observableBy != null;
			case PhysicalPackage.EFFECTOR__SIGNALLED_BY:
				return signalledBy != null && !signalledBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EffectorImpl
