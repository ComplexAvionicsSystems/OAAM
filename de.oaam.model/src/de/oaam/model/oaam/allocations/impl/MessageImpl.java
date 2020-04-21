/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.Message;

import de.oaam.model.oaam.allocations.PathA;
import de.oaam.model.oaam.allocations.Schedule;
import de.oaam.model.oaam.allocations.SegmentA;
import de.oaam.model.oaam.allocations.SignalToMessageAssignment;
import de.oaam.model.oaam.allocations.Submessage;
import de.oaam.model.oaam.capabilities.MessageOnBusCapability;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;
import de.oaam.model.oaam.hardware.Bus;

import de.oaam.model.oaam.hardware.Device;
import de.oaam.model.oaam.library.MessageType;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getSubmessages <em>Submessages</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getSignalToMessageAssignments <em>Signal To Message Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#isIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getSourceDevices <em>Source Devices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageImpl#getDestinationDevices <em>Destination Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends OaamBaseElementAImpl implements Message {
	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variants;

	/**
	 * The cached value of the '{@link #getOperationModes() <em>Operation Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationModes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationModeReference> operationModes;

	/**
	 * The cached value of the '{@link #getSchedules() <em>Schedules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<Schedule> schedules;

	/**
	 * The cached value of the '{@link #getSubmessages() <em>Submessages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Submessage> submessages;

	/**
	 * The cached value of the '{@link #getSignalToMessageAssignments() <em>Signal To Message Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalToMessageAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalToMessageAssignment> signalToMessageAssignments;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentA> segments;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MessageType type;

	/**
	 * The default value of the '{@link #isIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean isPersistent = IS_PERSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected PathA path;

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
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AllocationsPackage.MESSAGE__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, AllocationsPackage.MESSAGE__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schedule> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectContainmentEList<Schedule>(Schedule.class, this, AllocationsPackage.MESSAGE__SCHEDULES);
		}
		return schedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Submessage> getSubmessages() {
		if (submessages == null) {
			submessages = new EObjectContainmentEList<Submessage>(Submessage.class, this, AllocationsPackage.MESSAGE__SUBMESSAGES);
		}
		return submessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalToMessageAssignment> getSignalToMessageAssignments() {
		if (signalToMessageAssignments == null) {
			signalToMessageAssignments = new EObjectContainmentEList<SignalToMessageAssignment>(SignalToMessageAssignment.class, this, AllocationsPackage.MESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS);
		}
		return signalToMessageAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SegmentA> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentEList<SegmentA>(SegmentA.class, this, AllocationsPackage.MESSAGE__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MessageType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.MESSAGE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MessageType newType) {
		MessageType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.MESSAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPersistent() {
		return isPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPersistent(boolean newIsPersistent) {
		boolean oldIsPersistent = isPersistent;
		isPersistent = newIsPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.MESSAGE__IS_PERSISTENT, oldIsPersistent, isPersistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.MESSAGE__LENGTH, oldLength, length));
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
	public PathA getPath() {
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (PathA)eResolveProxy(oldPath);
			if (path != oldPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.MESSAGE__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathA basicGetPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(PathA newPath) {
		PathA oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.MESSAGE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationsPackage.MESSAGE__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.MESSAGE__SCHEDULES:
				return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.MESSAGE__SUBMESSAGES:
				return ((InternalEList<?>)getSubmessages()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.MESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				return ((InternalEList<?>)getSignalToMessageAssignments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.MESSAGE__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
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
			case AllocationsPackage.MESSAGE__VARIANTS:
				return getVariants();
			case AllocationsPackage.MESSAGE__OPERATION_MODES:
				return getOperationModes();
			case AllocationsPackage.MESSAGE__SCHEDULES:
				return getSchedules();
			case AllocationsPackage.MESSAGE__SUBMESSAGES:
				return getSubmessages();
			case AllocationsPackage.MESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				return getSignalToMessageAssignments();
			case AllocationsPackage.MESSAGE__SEGMENTS:
				return getSegments();
			case AllocationsPackage.MESSAGE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AllocationsPackage.MESSAGE__IS_PERSISTENT:
				return isIsPersistent();
			case AllocationsPackage.MESSAGE__LENGTH:
				return getLength();
			case AllocationsPackage.MESSAGE__PATH:
				if (resolve) return getPath();
				return basicGetPath();
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
			case AllocationsPackage.MESSAGE__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AllocationsPackage.MESSAGE__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case AllocationsPackage.MESSAGE__SCHEDULES:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Schedule>)newValue);
				return;
			case AllocationsPackage.MESSAGE__SUBMESSAGES:
				getSubmessages().clear();
				getSubmessages().addAll((Collection<? extends Submessage>)newValue);
				return;
			case AllocationsPackage.MESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				getSignalToMessageAssignments().clear();
				getSignalToMessageAssignments().addAll((Collection<? extends SignalToMessageAssignment>)newValue);
				return;
			case AllocationsPackage.MESSAGE__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends SegmentA>)newValue);
				return;
			case AllocationsPackage.MESSAGE__TYPE:
				setType((MessageType)newValue);
				return;
			case AllocationsPackage.MESSAGE__IS_PERSISTENT:
				setIsPersistent((Boolean)newValue);
				return;
			case AllocationsPackage.MESSAGE__LENGTH:
				setLength((Integer)newValue);
				return;
			case AllocationsPackage.MESSAGE__PATH:
				setPath((PathA)newValue);
				return;
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
			case AllocationsPackage.MESSAGE__VARIANTS:
				getVariants().clear();
				return;
			case AllocationsPackage.MESSAGE__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case AllocationsPackage.MESSAGE__SCHEDULES:
				getSchedules().clear();
				return;
			case AllocationsPackage.MESSAGE__SUBMESSAGES:
				getSubmessages().clear();
				return;
			case AllocationsPackage.MESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				getSignalToMessageAssignments().clear();
				return;
			case AllocationsPackage.MESSAGE__SEGMENTS:
				getSegments().clear();
				return;
			case AllocationsPackage.MESSAGE__TYPE:
				setType((MessageType)null);
				return;
			case AllocationsPackage.MESSAGE__IS_PERSISTENT:
				setIsPersistent(IS_PERSISTENT_EDEFAULT);
				return;
			case AllocationsPackage.MESSAGE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case AllocationsPackage.MESSAGE__PATH:
				setPath((PathA)null);
				return;
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
			case AllocationsPackage.MESSAGE__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AllocationsPackage.MESSAGE__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case AllocationsPackage.MESSAGE__SCHEDULES:
				return schedules != null && !schedules.isEmpty();
			case AllocationsPackage.MESSAGE__SUBMESSAGES:
				return submessages != null && !submessages.isEmpty();
			case AllocationsPackage.MESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				return signalToMessageAssignments != null && !signalToMessageAssignments.isEmpty();
			case AllocationsPackage.MESSAGE__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case AllocationsPackage.MESSAGE__TYPE:
				return type != null;
			case AllocationsPackage.MESSAGE__IS_PERSISTENT:
				return isPersistent != IS_PERSISTENT_EDEFAULT;
			case AllocationsPackage.MESSAGE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case AllocationsPackage.MESSAGE__PATH:
				return path != null;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.MESSAGE__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.MESSAGE__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return AllocationsPackage.MESSAGE__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return AllocationsPackage.MESSAGE__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isPersistent: ");
		result.append(isPersistent);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
