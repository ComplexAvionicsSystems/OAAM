/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.PathGroup;
import de.oaam.model.oaam.allocations.Schedule;
import de.oaam.model.oaam.allocations.SegmentA;

import de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability;
import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.Device;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import de.oaam.model.oaam.scenario.impl.ModeDependentElementAImpl;
import java.util.Collection;

import java.util.Date;
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
 * An implementation of the model object '<em><b>Path Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getSubpaths <em>Subpaths</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#isChildrenRedundant <em>Children Redundant</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.PathGroupImpl#getDestinations <em>Destinations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathGroupImpl extends ModeDependentElementAImpl implements PathGroup {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeA> attributes;
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;
	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected String modifier = MODIFIER_EDEFAULT;
	/**
	 * The default value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_LINK_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected String traceLink = TRACE_LINK_EDEFAULT;
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
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected SignalOnConnectionOrDeviceCapability capability;
	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;
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
	 * The cached value of the '{@link #getSubpaths() <em>Subpaths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpaths()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentA> subpaths;

	/**
	 * The default value of the '{@link #isChildrenRedundant() <em>Children Redundant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChildrenRedundant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHILDREN_REDUNDANT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isChildrenRedundant() <em>Children Redundant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChildrenRedundant()
	 * @generated
	 * @ordered
	 */
	protected boolean childrenRedundant = CHILDREN_REDUNDANT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> sources;
	/**
	 * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> destinations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.PATH_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, AllocationsPackage.PATH_GROUP__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(String newModifier) {
		String oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceLink() {
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(String newTraceLink) {
		String oldTraceLink = traceLink;
		traceLink = newTraceLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AllocationsPackage.PATH_GROUP__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalOnConnectionOrDeviceCapability getCapability() {
		if (capability != null && capability.eIsProxy()) {
			InternalEObject oldCapability = (InternalEObject)capability;
			capability = (SignalOnConnectionOrDeviceCapability)eResolveProxy(oldCapability);
			if (capability != oldCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.PATH_GROUP__CAPABILITY, oldCapability, capability));
			}
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalOnConnectionOrDeviceCapability basicGetCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(SignalOnConnectionOrDeviceCapability newCapability) {
		SignalOnConnectionOrDeviceCapability oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject)device;
			device = (Device)eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.PATH_GROUP__DEVICE, oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (Connection)eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.PATH_GROUP__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Connection newConnection) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schedule> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectContainmentEList<Schedule>(Schedule.class, this, AllocationsPackage.PATH_GROUP__SCHEDULES);
		}
		return schedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SegmentA> getSubpaths() {
		if (subpaths == null) {
			subpaths = new EObjectContainmentEList<SegmentA>(SegmentA.class, this, AllocationsPackage.PATH_GROUP__SUBPATHS);
		}
		return subpaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChildrenRedundant() {
		return childrenRedundant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrenRedundant(boolean newChildrenRedundant) {
		boolean oldChildrenRedundant = childrenRedundant;
		childrenRedundant = newChildrenRedundant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.PATH_GROUP__CHILDREN_REDUNDANT, oldChildrenRedundant, childrenRedundant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<Device>(Device.class, this, AllocationsPackage.PATH_GROUP__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDestinations() {
		if (destinations == null) {
			destinations = new EObjectResolvingEList<Device>(Device.class, this, AllocationsPackage.PATH_GROUP__DESTINATIONS);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationsPackage.PATH_GROUP__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.PATH_GROUP__SCHEDULES:
				return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.PATH_GROUP__SUBPATHS:
				return ((InternalEList<?>)getSubpaths()).basicRemove(otherEnd, msgs);
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
			case AllocationsPackage.PATH_GROUP__ID:
				return getId();
			case AllocationsPackage.PATH_GROUP__NAME:
				return getName();
			case AllocationsPackage.PATH_GROUP__STYLE:
				return getStyle();
			case AllocationsPackage.PATH_GROUP__ATTRIBUTES:
				return getAttributes();
			case AllocationsPackage.PATH_GROUP__DOCUMENTATION:
				return getDocumentation();
			case AllocationsPackage.PATH_GROUP__MODIFIED:
				return getModified();
			case AllocationsPackage.PATH_GROUP__MODIFIER:
				return getModifier();
			case AllocationsPackage.PATH_GROUP__TRACE_LINK:
				return getTraceLink();
			case AllocationsPackage.PATH_GROUP__VARIANTS:
				return getVariants();
			case AllocationsPackage.PATH_GROUP__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case AllocationsPackage.PATH_GROUP__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case AllocationsPackage.PATH_GROUP__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
			case AllocationsPackage.PATH_GROUP__SCHEDULES:
				return getSchedules();
			case AllocationsPackage.PATH_GROUP__SUBPATHS:
				return getSubpaths();
			case AllocationsPackage.PATH_GROUP__CHILDREN_REDUNDANT:
				return isChildrenRedundant();
			case AllocationsPackage.PATH_GROUP__SOURCES:
				return getSources();
			case AllocationsPackage.PATH_GROUP__DESTINATIONS:
				return getDestinations();
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
			case AllocationsPackage.PATH_GROUP__ID:
				setId((String)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__NAME:
				setName((String)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__STYLE:
				setStyle((String)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__MODIFIED:
				setModified((Date)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__MODIFIER:
				setModifier((String)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__CAPABILITY:
				setCapability((SignalOnConnectionOrDeviceCapability)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__DEVICE:
				setDevice((Device)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__CONNECTION:
				setConnection((Connection)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__SCHEDULES:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Schedule>)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__SUBPATHS:
				getSubpaths().clear();
				getSubpaths().addAll((Collection<? extends SegmentA>)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__CHILDREN_REDUNDANT:
				setChildrenRedundant((Boolean)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Device>)newValue);
				return;
			case AllocationsPackage.PATH_GROUP__DESTINATIONS:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends Device>)newValue);
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
			case AllocationsPackage.PATH_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case AllocationsPackage.PATH_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AllocationsPackage.PATH_GROUP__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case AllocationsPackage.PATH_GROUP__ATTRIBUTES:
				getAttributes().clear();
				return;
			case AllocationsPackage.PATH_GROUP__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AllocationsPackage.PATH_GROUP__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case AllocationsPackage.PATH_GROUP__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AllocationsPackage.PATH_GROUP__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case AllocationsPackage.PATH_GROUP__VARIANTS:
				getVariants().clear();
				return;
			case AllocationsPackage.PATH_GROUP__CAPABILITY:
				setCapability((SignalOnConnectionOrDeviceCapability)null);
				return;
			case AllocationsPackage.PATH_GROUP__DEVICE:
				setDevice((Device)null);
				return;
			case AllocationsPackage.PATH_GROUP__CONNECTION:
				setConnection((Connection)null);
				return;
			case AllocationsPackage.PATH_GROUP__SCHEDULES:
				getSchedules().clear();
				return;
			case AllocationsPackage.PATH_GROUP__SUBPATHS:
				getSubpaths().clear();
				return;
			case AllocationsPackage.PATH_GROUP__CHILDREN_REDUNDANT:
				setChildrenRedundant(CHILDREN_REDUNDANT_EDEFAULT);
				return;
			case AllocationsPackage.PATH_GROUP__SOURCES:
				getSources().clear();
				return;
			case AllocationsPackage.PATH_GROUP__DESTINATIONS:
				getDestinations().clear();
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
			case AllocationsPackage.PATH_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AllocationsPackage.PATH_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AllocationsPackage.PATH_GROUP__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case AllocationsPackage.PATH_GROUP__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case AllocationsPackage.PATH_GROUP__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AllocationsPackage.PATH_GROUP__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case AllocationsPackage.PATH_GROUP__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AllocationsPackage.PATH_GROUP__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case AllocationsPackage.PATH_GROUP__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AllocationsPackage.PATH_GROUP__CAPABILITY:
				return capability != null;
			case AllocationsPackage.PATH_GROUP__DEVICE:
				return device != null;
			case AllocationsPackage.PATH_GROUP__CONNECTION:
				return connection != null;
			case AllocationsPackage.PATH_GROUP__SCHEDULES:
				return schedules != null && !schedules.isEmpty();
			case AllocationsPackage.PATH_GROUP__SUBPATHS:
				return subpaths != null && !subpaths.isEmpty();
			case AllocationsPackage.PATH_GROUP__CHILDREN_REDUNDANT:
				return childrenRedundant != CHILDREN_REDUNDANT_EDEFAULT;
			case AllocationsPackage.PATH_GROUP__SOURCES:
				return sources != null && !sources.isEmpty();
			case AllocationsPackage.PATH_GROUP__DESTINATIONS:
				return destinations != null && !destinations.isEmpty();
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
		if (baseClass == OaamBaseElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.PATH_GROUP__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case AllocationsPackage.PATH_GROUP__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case AllocationsPackage.PATH_GROUP__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case AllocationsPackage.PATH_GROUP__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case AllocationsPackage.PATH_GROUP__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case AllocationsPackage.PATH_GROUP__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case AllocationsPackage.PATH_GROUP__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case AllocationsPackage.PATH_GROUP__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.PATH_GROUP__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
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
		if (baseClass == OaamBaseElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return AllocationsPackage.PATH_GROUP__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return AllocationsPackage.PATH_GROUP__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return AllocationsPackage.PATH_GROUP__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return AllocationsPackage.PATH_GROUP__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return AllocationsPackage.PATH_GROUP__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return AllocationsPackage.PATH_GROUP__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return AllocationsPackage.PATH_GROUP__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return AllocationsPackage.PATH_GROUP__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return AllocationsPackage.PATH_GROUP__VARIANTS;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", style: ");
		result.append(style);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", modified: ");
		result.append(modified);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(", traceLink: ");
		result.append(traceLink);
		result.append(", childrenRedundant: ");
		result.append(childrenRedundant);
		result.append(')');
		return result.toString();
	}

} //PathGroupImpl
