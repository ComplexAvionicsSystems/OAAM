/**
 */
package de.oaam.model.oaam.mapping.impl;

import de.oaam.model.oaam.common.impl._ElementAImpl;

import de.oaam.model.oaam.mapping.ConnectionAssignment;
import de.oaam.model.oaam.mapping.DeviceAssignment;
import de.oaam.model.oaam.mapping.MappingContainerA;
import de.oaam.model.oaam.mapping.MappingPackage;
import de.oaam.model.oaam.mapping.SignalAssignment;
import de.oaam.model.oaam.mapping.SubDeviceAssignment;
import de.oaam.model.oaam.mapping.Supmapping;
import de.oaam.model.oaam.mapping.TaskAssignment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.MappingContainerAImpl#getDeviceAssignments <em>Device Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.MappingContainerAImpl#getSubDeviceAssignments <em>Sub Device Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.MappingContainerAImpl#getConnectionAssignments <em>Connection Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.MappingContainerAImpl#getTaskAssignments <em>Task Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.MappingContainerAImpl#getSignalAssignments <em>Signal Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.MappingContainerAImpl#getSupmapping <em>Supmapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MappingContainerAImpl extends _ElementAImpl implements MappingContainerA {
	/**
	 * The cached value of the '{@link #getDeviceAssignments() <em>Device Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceAssignment> deviceAssignments;

	/**
	 * The cached value of the '{@link #getSubDeviceAssignments() <em>Sub Device Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDeviceAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<SubDeviceAssignment> subDeviceAssignments;

	/**
	 * The cached value of the '{@link #getConnectionAssignments() <em>Connection Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionAssignment> connectionAssignments;

	/**
	 * The cached value of the '{@link #getTaskAssignments() <em>Task Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskAssignment> taskAssignments;

	/**
	 * The cached value of the '{@link #getSignalAssignments() <em>Signal Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalAssignment> signalAssignments;

	/**
	 * The cached value of the '{@link #getSupmapping() <em>Supmapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupmapping()
	 * @generated
	 * @ordered
	 */
	protected EList<Supmapping> supmapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAPPING_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceAssignment> getDeviceAssignments() {
		if (deviceAssignments == null) {
			deviceAssignments = new EObjectContainmentEList<DeviceAssignment>(DeviceAssignment.class, this, MappingPackage.MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS);
		}
		return deviceAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubDeviceAssignment> getSubDeviceAssignments() {
		if (subDeviceAssignments == null) {
			subDeviceAssignments = new EObjectContainmentEList<SubDeviceAssignment>(SubDeviceAssignment.class, this, MappingPackage.MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS);
		}
		return subDeviceAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionAssignment> getConnectionAssignments() {
		if (connectionAssignments == null) {
			connectionAssignments = new EObjectContainmentEList<ConnectionAssignment>(ConnectionAssignment.class, this, MappingPackage.MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS);
		}
		return connectionAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskAssignment> getTaskAssignments() {
		if (taskAssignments == null) {
			taskAssignments = new EObjectContainmentEList<TaskAssignment>(TaskAssignment.class, this, MappingPackage.MAPPING_CONTAINER_A__TASK_ASSIGNMENTS);
		}
		return taskAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalAssignment> getSignalAssignments() {
		if (signalAssignments == null) {
			signalAssignments = new EObjectContainmentEList<SignalAssignment>(SignalAssignment.class, this, MappingPackage.MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS);
		}
		return signalAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supmapping> getSupmapping() {
		if (supmapping == null) {
			supmapping = new EObjectContainmentEList<Supmapping>(Supmapping.class, this, MappingPackage.MAPPING_CONTAINER_A__SUPMAPPING);
		}
		return supmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS:
				return ((InternalEList<?>)getDeviceAssignments()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS:
				return ((InternalEList<?>)getSubDeviceAssignments()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				return ((InternalEList<?>)getConnectionAssignments()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_CONTAINER_A__TASK_ASSIGNMENTS:
				return ((InternalEList<?>)getTaskAssignments()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				return ((InternalEList<?>)getSignalAssignments()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_CONTAINER_A__SUPMAPPING:
				return ((InternalEList<?>)getSupmapping()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS:
				return getDeviceAssignments();
			case MappingPackage.MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS:
				return getSubDeviceAssignments();
			case MappingPackage.MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				return getConnectionAssignments();
			case MappingPackage.MAPPING_CONTAINER_A__TASK_ASSIGNMENTS:
				return getTaskAssignments();
			case MappingPackage.MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				return getSignalAssignments();
			case MappingPackage.MAPPING_CONTAINER_A__SUPMAPPING:
				return getSupmapping();
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
			case MappingPackage.MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS:
				getDeviceAssignments().clear();
				getDeviceAssignments().addAll((Collection<? extends DeviceAssignment>)newValue);
				return;
			case MappingPackage.MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS:
				getSubDeviceAssignments().clear();
				getSubDeviceAssignments().addAll((Collection<? extends SubDeviceAssignment>)newValue);
				return;
			case MappingPackage.MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				getConnectionAssignments().clear();
				getConnectionAssignments().addAll((Collection<? extends ConnectionAssignment>)newValue);
				return;
			case MappingPackage.MAPPING_CONTAINER_A__TASK_ASSIGNMENTS:
				getTaskAssignments().clear();
				getTaskAssignments().addAll((Collection<? extends TaskAssignment>)newValue);
				return;
			case MappingPackage.MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				getSignalAssignments().clear();
				getSignalAssignments().addAll((Collection<? extends SignalAssignment>)newValue);
				return;
			case MappingPackage.MAPPING_CONTAINER_A__SUPMAPPING:
				getSupmapping().clear();
				getSupmapping().addAll((Collection<? extends Supmapping>)newValue);
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
			case MappingPackage.MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS:
				getDeviceAssignments().clear();
				return;
			case MappingPackage.MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS:
				getSubDeviceAssignments().clear();
				return;
			case MappingPackage.MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				getConnectionAssignments().clear();
				return;
			case MappingPackage.MAPPING_CONTAINER_A__TASK_ASSIGNMENTS:
				getTaskAssignments().clear();
				return;
			case MappingPackage.MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				getSignalAssignments().clear();
				return;
			case MappingPackage.MAPPING_CONTAINER_A__SUPMAPPING:
				getSupmapping().clear();
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
			case MappingPackage.MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS:
				return deviceAssignments != null && !deviceAssignments.isEmpty();
			case MappingPackage.MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS:
				return subDeviceAssignments != null && !subDeviceAssignments.isEmpty();
			case MappingPackage.MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				return connectionAssignments != null && !connectionAssignments.isEmpty();
			case MappingPackage.MAPPING_CONTAINER_A__TASK_ASSIGNMENTS:
				return taskAssignments != null && !taskAssignments.isEmpty();
			case MappingPackage.MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				return signalAssignments != null && !signalAssignments.isEmpty();
			case MappingPackage.MAPPING_CONTAINER_A__SUPMAPPING:
				return supmapping != null && !supmapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingContainerAImpl
