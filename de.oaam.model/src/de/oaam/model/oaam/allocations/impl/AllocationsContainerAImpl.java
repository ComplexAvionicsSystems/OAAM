/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsContainerA;
import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.ConnectionAssignment;
import de.oaam.model.oaam.allocations.DeviceAssignment;
import de.oaam.model.oaam.allocations.Message;
import de.oaam.model.oaam.allocations.SignalAssignment;
import de.oaam.model.oaam.allocations.Suballocations;
import de.oaam.model.oaam.allocations.SubconnectionAssignment;
import de.oaam.model.oaam.allocations.SubdeviceAssignment;
import de.oaam.model.oaam.allocations.TaskAssignment;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

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
 *   <li>{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl#getDeviceAssignments <em>Device Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl#getSubdeviceAssignments <em>Subdevice Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl#getConnectionAssignments <em>Connection Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl#getTaskAssignments <em>Task Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl#getSignalAssignments <em>Signal Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl#getSuballocations <em>Suballocations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl#getSubconnectionAssignments <em>Subconnection Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AllocationsContainerAImpl extends OaamBaseElementAImpl implements AllocationsContainerA {
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
	 * The cached value of the '{@link #getSubdeviceAssignments() <em>Subdevice Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdeviceAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<SubdeviceAssignment> subdeviceAssignments;

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
	 * The cached value of the '{@link #getSuballocations() <em>Suballocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuballocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Suballocations> suballocations;

	/**
	 * The cached value of the '{@link #getSubconnectionAssignments() <em>Subconnection Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubconnectionAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<SubconnectionAssignment> subconnectionAssignments;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationsContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceAssignment> getDeviceAssignments() {
		if (deviceAssignments == null) {
			deviceAssignments = new EObjectContainmentEList<DeviceAssignment>(DeviceAssignment.class, this, AllocationsPackage.ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS);
		}
		return deviceAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubdeviceAssignment> getSubdeviceAssignments() {
		if (subdeviceAssignments == null) {
			subdeviceAssignments = new EObjectContainmentEList<SubdeviceAssignment>(SubdeviceAssignment.class, this, AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS);
		}
		return subdeviceAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionAssignment> getConnectionAssignments() {
		if (connectionAssignments == null) {
			connectionAssignments = new EObjectContainmentEList<ConnectionAssignment>(ConnectionAssignment.class, this, AllocationsPackage.ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS);
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
			taskAssignments = new EObjectContainmentEList<TaskAssignment>(TaskAssignment.class, this, AllocationsPackage.ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS);
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
			signalAssignments = new EObjectContainmentEList<SignalAssignment>(SignalAssignment.class, this, AllocationsPackage.ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS);
		}
		return signalAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Suballocations> getSuballocations() {
		if (suballocations == null) {
			suballocations = new EObjectContainmentEList<Suballocations>(Suballocations.class, this, AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS);
		}
		return suballocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubconnectionAssignment> getSubconnectionAssignments() {
		if (subconnectionAssignments == null) {
			subconnectionAssignments = new EObjectContainmentEList<SubconnectionAssignment>(SubconnectionAssignment.class, this, AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS);
		}
		return subconnectionAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this, AllocationsPackage.ALLOCATIONS_CONTAINER_A__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS:
				return ((InternalEList<?>)getDeviceAssignments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS:
				return ((InternalEList<?>)getSubdeviceAssignments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				return ((InternalEList<?>)getConnectionAssignments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS:
				return ((InternalEList<?>)getTaskAssignments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				return ((InternalEList<?>)getSignalAssignments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS:
				return ((InternalEList<?>)getSuballocations()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS:
				return ((InternalEList<?>)getSubconnectionAssignments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
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
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS:
				return getDeviceAssignments();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS:
				return getSubdeviceAssignments();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				return getConnectionAssignments();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS:
				return getTaskAssignments();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				return getSignalAssignments();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS:
				return getSuballocations();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS:
				return getSubconnectionAssignments();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__MESSAGES:
				return getMessages();
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
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS:
				getDeviceAssignments().clear();
				getDeviceAssignments().addAll((Collection<? extends DeviceAssignment>)newValue);
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS:
				getSubdeviceAssignments().clear();
				getSubdeviceAssignments().addAll((Collection<? extends SubdeviceAssignment>)newValue);
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				getConnectionAssignments().clear();
				getConnectionAssignments().addAll((Collection<? extends ConnectionAssignment>)newValue);
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS:
				getTaskAssignments().clear();
				getTaskAssignments().addAll((Collection<? extends TaskAssignment>)newValue);
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				getSignalAssignments().clear();
				getSignalAssignments().addAll((Collection<? extends SignalAssignment>)newValue);
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS:
				getSuballocations().clear();
				getSuballocations().addAll((Collection<? extends Suballocations>)newValue);
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS:
				getSubconnectionAssignments().clear();
				getSubconnectionAssignments().addAll((Collection<? extends SubconnectionAssignment>)newValue);
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
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
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS:
				getDeviceAssignments().clear();
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS:
				getSubdeviceAssignments().clear();
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				getConnectionAssignments().clear();
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS:
				getTaskAssignments().clear();
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				getSignalAssignments().clear();
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS:
				getSuballocations().clear();
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS:
				getSubconnectionAssignments().clear();
				return;
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__MESSAGES:
				getMessages().clear();
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
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS:
				return deviceAssignments != null && !deviceAssignments.isEmpty();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS:
				return subdeviceAssignments != null && !subdeviceAssignments.isEmpty();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS:
				return connectionAssignments != null && !connectionAssignments.isEmpty();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS:
				return taskAssignments != null && !taskAssignments.isEmpty();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS:
				return signalAssignments != null && !signalAssignments.isEmpty();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS:
				return suballocations != null && !suballocations.isEmpty();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS:
				return subconnectionAssignments != null && !subconnectionAssignments.isEmpty();
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__MESSAGES:
				return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocationsContainerAImpl
