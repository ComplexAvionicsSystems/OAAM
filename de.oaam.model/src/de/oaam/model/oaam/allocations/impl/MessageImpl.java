/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.Message;

import de.oaam.model.oaam.capabilities.MessageOnBusCapability;

import de.oaam.model.oaam.hardware.Bus;

import de.oaam.model.oaam.hardware.Device;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getSourceDevices <em>Source Devices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getDestinationDevices <em>Destination Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MessageAImpl implements Message {
	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected MessageOnBusCapability capability;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected Bus bus;

	/**
	 * The cached value of the '{@link #getSourceDevices() <em>Source Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> sourceDevices;

	/**
	 * The cached value of the '{@link #getDestinationDevices() <em>Destination Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> destinationDevices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOnBusCapability getCapability() {
		if (capability != null && capability.eIsProxy()) {
			InternalEObject oldCapability = (InternalEObject)capability;
			capability = (MessageOnBusCapability)eResolveProxy(oldCapability);
			if (capability != oldCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.MESSAGE__CAPABILITY, oldCapability, capability));
			}
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOnBusCapability basicGetCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(MessageOnBusCapability newCapability) {
		MessageOnBusCapability oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.MESSAGE__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		if (bus != null && bus.eIsProxy()) {
			InternalEObject oldBus = (InternalEObject)bus;
			bus = (Bus)eResolveProxy(oldBus);
			if (bus != oldBus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.MESSAGE__BUS, oldBus, bus));
			}
		}
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetBus() {
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(Bus newBus) {
		Bus oldBus = bus;
		bus = newBus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.MESSAGE__BUS, oldBus, bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getSourceDevices() {
		if (sourceDevices == null) {
			sourceDevices = new EObjectResolvingEList<Device>(Device.class, this, AllocationsPackage.MESSAGE__SOURCE_DEVICES);
		}
		return sourceDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDestinationDevices() {
		if (destinationDevices == null) {
			destinationDevices = new EObjectResolvingEList<Device>(Device.class, this, AllocationsPackage.MESSAGE__DESTINATION_DEVICES);
		}
		return destinationDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationsPackage.MESSAGE__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case AllocationsPackage.MESSAGE__BUS:
				if (resolve) return getBus();
				return basicGetBus();
			case AllocationsPackage.MESSAGE__SOURCE_DEVICES:
				return getSourceDevices();
			case AllocationsPackage.MESSAGE__DESTINATION_DEVICES:
				return getDestinationDevices();
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
			case AllocationsPackage.MESSAGE__CAPABILITY:
				setCapability((MessageOnBusCapability)newValue);
				return;
			case AllocationsPackage.MESSAGE__BUS:
				setBus((Bus)newValue);
				return;
			case AllocationsPackage.MESSAGE__SOURCE_DEVICES:
				getSourceDevices().clear();
				getSourceDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case AllocationsPackage.MESSAGE__DESTINATION_DEVICES:
				getDestinationDevices().clear();
				getDestinationDevices().addAll((Collection<? extends Device>)newValue);
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
			case AllocationsPackage.MESSAGE__CAPABILITY:
				setCapability((MessageOnBusCapability)null);
				return;
			case AllocationsPackage.MESSAGE__BUS:
				setBus((Bus)null);
				return;
			case AllocationsPackage.MESSAGE__SOURCE_DEVICES:
				getSourceDevices().clear();
				return;
			case AllocationsPackage.MESSAGE__DESTINATION_DEVICES:
				getDestinationDevices().clear();
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
			case AllocationsPackage.MESSAGE__CAPABILITY:
				return capability != null;
			case AllocationsPackage.MESSAGE__BUS:
				return bus != null;
			case AllocationsPackage.MESSAGE__SOURCE_DEVICES:
				return sourceDevices != null && !sourceDevices.isEmpty();
			case AllocationsPackage.MESSAGE__DESTINATION_DEVICES:
				return destinationDevices != null && !destinationDevices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageImpl
