/**
 */
package de.oaam.model.oaam.physical.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.functions.FunctionsContainerA;

import de.oaam.model.oaam.physical.Effector;
import de.oaam.model.oaam.physical.PhysicalInteractionContainerA;
import de.oaam.model.oaam.physical.PhysicalPackage;
import de.oaam.model.oaam.physical.Sensor;
import de.oaam.model.oaam.physical.SubphysicalInteraction;

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
 * An implementation of the model object '<em><b>Interaction Container A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.physical.impl.PhysicalInteractionContainerAImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.impl.PhysicalInteractionContainerAImpl#getSubphysicalInteractions <em>Subphysical Interactions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.impl.PhysicalInteractionContainerAImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.impl.PhysicalInteractionContainerAImpl#getEffectors <em>Effectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PhysicalInteractionContainerAImpl extends OaamBaseElementAImpl implements PhysicalInteractionContainerA {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionsContainerA function;

	/**
	 * The cached value of the '{@link #getSubphysicalInteractions() <em>Subphysical Interactions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubphysicalInteractions()
	 * @generated
	 * @ordered
	 */
	protected SubphysicalInteraction subphysicalInteractions;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * The cached value of the '{@link #getEffectors() <em>Effectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Effector> effectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalInteractionContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalPackage.Literals.PHYSICAL_INTERACTION_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsContainerA getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (FunctionsContainerA)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsContainerA basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(FunctionsContainerA newFunction) {
		FunctionsContainerA oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubphysicalInteraction getSubphysicalInteractions() {
		return subphysicalInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubphysicalInteractions(SubphysicalInteraction newSubphysicalInteractions, NotificationChain msgs) {
		SubphysicalInteraction oldSubphysicalInteractions = subphysicalInteractions;
		subphysicalInteractions = newSubphysicalInteractions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS, oldSubphysicalInteractions, newSubphysicalInteractions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubphysicalInteractions(SubphysicalInteraction newSubphysicalInteractions) {
		if (newSubphysicalInteractions != subphysicalInteractions) {
			NotificationChain msgs = null;
			if (subphysicalInteractions != null)
				msgs = ((InternalEObject)subphysicalInteractions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS, null, msgs);
			if (newSubphysicalInteractions != null)
				msgs = ((InternalEObject)newSubphysicalInteractions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS, null, msgs);
			msgs = basicSetSubphysicalInteractions(newSubphysicalInteractions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS, newSubphysicalInteractions, newSubphysicalInteractions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effector> getEffectors() {
		if (effectors == null) {
			effectors = new EObjectContainmentEList<Effector>(Effector.class, this, PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS);
		}
		return effectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS:
				return basicSetSubphysicalInteractions(null, msgs);
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS:
				return ((InternalEList<?>)getEffectors()).basicRemove(otherEnd, msgs);
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
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS:
				return getSubphysicalInteractions();
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SENSORS:
				return getSensors();
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS:
				return getEffectors();
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
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION:
				setFunction((FunctionsContainerA)newValue);
				return;
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS:
				setSubphysicalInteractions((SubphysicalInteraction)newValue);
				return;
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS:
				getEffectors().clear();
				getEffectors().addAll((Collection<? extends Effector>)newValue);
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
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION:
				setFunction((FunctionsContainerA)null);
				return;
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS:
				setSubphysicalInteractions((SubphysicalInteraction)null);
				return;
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SENSORS:
				getSensors().clear();
				return;
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS:
				getEffectors().clear();
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
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION:
				return function != null;
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS:
				return subphysicalInteractions != null;
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS:
				return effectors != null && !effectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalInteractionContainerAImpl
