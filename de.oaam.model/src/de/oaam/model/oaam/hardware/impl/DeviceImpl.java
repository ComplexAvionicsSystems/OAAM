/**
 */
package de.oaam.model.oaam.hardware.impl;

import de.oaam.model.oaam.anatomy.Location;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.hardware.Device;
import de.oaam.model.oaam.hardware.HardwarePackage;
import de.oaam.model.oaam.hardware.Io;

import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.PowerSource;

import de.oaam.model.oaam.library.impl.ResourceProviderInstanceAImpl;

import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

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
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getIos <em>Ios</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getSubDevices <em>Sub Devices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getLocationBinding <em>Location Binding</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.DeviceImpl#getPowerSources <em>Power Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends ResourceProviderInstanceAImpl implements Device {
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
	 * The cached value of the '{@link #getOperationModes() <em>Operation Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationModes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationModeReference> operationModes;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DeviceType type;

	/**
	 * The cached value of the '{@link #getIos() <em>Ios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIos()
	 * @generated
	 * @ordered
	 */
	protected EList<Io> ios;

	/**
	 * The cached value of the '{@link #getSubDevices() <em>Sub Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> subDevices;

	/**
	 * The cached value of the '{@link #getLocationBinding() <em>Location Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationBinding()
	 * @generated
	 * @ordered
	 */
	protected Location locationBinding;

	/**
	 * The cached value of the '{@link #getPowerSources() <em>Power Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSource> powerSources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.DEVICE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.DEVICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.DEVICE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, HardwarePackage.DEVICE__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.DEVICE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.DEVICE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.DEVICE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.DEVICE__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, HardwarePackage.DEVICE__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, HardwarePackage.DEVICE__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DeviceType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePackage.DEVICE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DeviceType newType) {
		DeviceType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.DEVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Io> getIos() {
		if (ios == null) {
			ios = new EObjectContainmentEList<Io>(Io.class, this, HardwarePackage.DEVICE__IOS);
		}
		return ios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getSubDevices() {
		if (subDevices == null) {
			subDevices = new EObjectContainmentEList<Device>(Device.class, this, HardwarePackage.DEVICE__SUB_DEVICES);
		}
		return subDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocationBinding() {
		if (locationBinding != null && locationBinding.eIsProxy()) {
			InternalEObject oldLocationBinding = (InternalEObject)locationBinding;
			locationBinding = (Location)eResolveProxy(oldLocationBinding);
			if (locationBinding != oldLocationBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePackage.DEVICE__LOCATION_BINDING, oldLocationBinding, locationBinding));
			}
		}
		return locationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocationBinding() {
		return locationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationBinding(Location newLocationBinding) {
		Location oldLocationBinding = locationBinding;
		locationBinding = newLocationBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.DEVICE__LOCATION_BINDING, oldLocationBinding, locationBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSource> getPowerSources() {
		if (powerSources == null) {
			powerSources = new EObjectResolvingEList<PowerSource>(PowerSource.class, this, HardwarePackage.DEVICE__POWER_SOURCES);
		}
		return powerSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePackage.DEVICE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case HardwarePackage.DEVICE__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case HardwarePackage.DEVICE__IOS:
				return ((InternalEList<?>)getIos()).basicRemove(otherEnd, msgs);
			case HardwarePackage.DEVICE__SUB_DEVICES:
				return ((InternalEList<?>)getSubDevices()).basicRemove(otherEnd, msgs);
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
			case HardwarePackage.DEVICE__ID:
				return getId();
			case HardwarePackage.DEVICE__NAME:
				return getName();
			case HardwarePackage.DEVICE__STYLE:
				return getStyle();
			case HardwarePackage.DEVICE__ATTRIBUTES:
				return getAttributes();
			case HardwarePackage.DEVICE__DOCUMENTATION:
				return getDocumentation();
			case HardwarePackage.DEVICE__MODIFIED:
				return getModified();
			case HardwarePackage.DEVICE__MODIFIER:
				return getModifier();
			case HardwarePackage.DEVICE__TRACE_LINK:
				return getTraceLink();
			case HardwarePackage.DEVICE__VARIANTS:
				return getVariants();
			case HardwarePackage.DEVICE__OPERATION_MODES:
				return getOperationModes();
			case HardwarePackage.DEVICE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case HardwarePackage.DEVICE__IOS:
				return getIos();
			case HardwarePackage.DEVICE__SUB_DEVICES:
				return getSubDevices();
			case HardwarePackage.DEVICE__LOCATION_BINDING:
				if (resolve) return getLocationBinding();
				return basicGetLocationBinding();
			case HardwarePackage.DEVICE__POWER_SOURCES:
				return getPowerSources();
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
			case HardwarePackage.DEVICE__ID:
				setId((String)newValue);
				return;
			case HardwarePackage.DEVICE__NAME:
				setName((String)newValue);
				return;
			case HardwarePackage.DEVICE__STYLE:
				setStyle((String)newValue);
				return;
			case HardwarePackage.DEVICE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case HardwarePackage.DEVICE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case HardwarePackage.DEVICE__MODIFIED:
				setModified((Date)newValue);
				return;
			case HardwarePackage.DEVICE__MODIFIER:
				setModifier((String)newValue);
				return;
			case HardwarePackage.DEVICE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case HardwarePackage.DEVICE__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case HardwarePackage.DEVICE__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case HardwarePackage.DEVICE__TYPE:
				setType((DeviceType)newValue);
				return;
			case HardwarePackage.DEVICE__IOS:
				getIos().clear();
				getIos().addAll((Collection<? extends Io>)newValue);
				return;
			case HardwarePackage.DEVICE__SUB_DEVICES:
				getSubDevices().clear();
				getSubDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case HardwarePackage.DEVICE__LOCATION_BINDING:
				setLocationBinding((Location)newValue);
				return;
			case HardwarePackage.DEVICE__POWER_SOURCES:
				getPowerSources().clear();
				getPowerSources().addAll((Collection<? extends PowerSource>)newValue);
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
			case HardwarePackage.DEVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case HardwarePackage.DEVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HardwarePackage.DEVICE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case HardwarePackage.DEVICE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case HardwarePackage.DEVICE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case HardwarePackage.DEVICE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case HardwarePackage.DEVICE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case HardwarePackage.DEVICE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case HardwarePackage.DEVICE__VARIANTS:
				getVariants().clear();
				return;
			case HardwarePackage.DEVICE__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case HardwarePackage.DEVICE__TYPE:
				setType((DeviceType)null);
				return;
			case HardwarePackage.DEVICE__IOS:
				getIos().clear();
				return;
			case HardwarePackage.DEVICE__SUB_DEVICES:
				getSubDevices().clear();
				return;
			case HardwarePackage.DEVICE__LOCATION_BINDING:
				setLocationBinding((Location)null);
				return;
			case HardwarePackage.DEVICE__POWER_SOURCES:
				getPowerSources().clear();
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
			case HardwarePackage.DEVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case HardwarePackage.DEVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HardwarePackage.DEVICE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case HardwarePackage.DEVICE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case HardwarePackage.DEVICE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case HardwarePackage.DEVICE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case HardwarePackage.DEVICE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case HardwarePackage.DEVICE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case HardwarePackage.DEVICE__VARIANTS:
				return variants != null && !variants.isEmpty();
			case HardwarePackage.DEVICE__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case HardwarePackage.DEVICE__TYPE:
				return type != null;
			case HardwarePackage.DEVICE__IOS:
				return ios != null && !ios.isEmpty();
			case HardwarePackage.DEVICE__SUB_DEVICES:
				return subDevices != null && !subDevices.isEmpty();
			case HardwarePackage.DEVICE__LOCATION_BINDING:
				return locationBinding != null;
			case HardwarePackage.DEVICE__POWER_SOURCES:
				return powerSources != null && !powerSources.isEmpty();
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
		if (baseClass == _ElementA.class) {
			switch (derivedFeatureID) {
				case HardwarePackage.DEVICE__ID: return CommonPackage._ELEMENT_A__ID;
				case HardwarePackage.DEVICE__NAME: return CommonPackage._ELEMENT_A__NAME;
				case HardwarePackage.DEVICE__STYLE: return CommonPackage._ELEMENT_A__STYLE;
				case HardwarePackage.DEVICE__ATTRIBUTES: return CommonPackage._ELEMENT_A__ATTRIBUTES;
				case HardwarePackage.DEVICE__DOCUMENTATION: return CommonPackage._ELEMENT_A__DOCUMENTATION;
				case HardwarePackage.DEVICE__MODIFIED: return CommonPackage._ELEMENT_A__MODIFIED;
				case HardwarePackage.DEVICE__MODIFIER: return CommonPackage._ELEMENT_A__MODIFIER;
				case HardwarePackage.DEVICE__TRACE_LINK: return CommonPackage._ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == _VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case HardwarePackage.DEVICE__VARIANTS: return ScenarioPackage._VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == _ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case HardwarePackage.DEVICE__OPERATION_MODES: return ScenarioPackage._MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
		if (baseClass == _ElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage._ELEMENT_A__ID: return HardwarePackage.DEVICE__ID;
				case CommonPackage._ELEMENT_A__NAME: return HardwarePackage.DEVICE__NAME;
				case CommonPackage._ELEMENT_A__STYLE: return HardwarePackage.DEVICE__STYLE;
				case CommonPackage._ELEMENT_A__ATTRIBUTES: return HardwarePackage.DEVICE__ATTRIBUTES;
				case CommonPackage._ELEMENT_A__DOCUMENTATION: return HardwarePackage.DEVICE__DOCUMENTATION;
				case CommonPackage._ELEMENT_A__MODIFIED: return HardwarePackage.DEVICE__MODIFIED;
				case CommonPackage._ELEMENT_A__MODIFIER: return HardwarePackage.DEVICE__MODIFIER;
				case CommonPackage._ELEMENT_A__TRACE_LINK: return HardwarePackage.DEVICE__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == _VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage._VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return HardwarePackage.DEVICE__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == _ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage._MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return HardwarePackage.DEVICE__OPERATION_MODES;
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

		StringBuffer result = new StringBuffer(super.toString());
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
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
