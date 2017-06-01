/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.anatomy.Location;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.functions.Signal;
import de.oaam.model.oaam.functions.Subfunction;

import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.restrictions.ConnectionRestrinctionA;
import de.oaam.model.oaam.restrictions.DeviceRestrictionA;
import de.oaam.model.oaam.restrictions.LocationRestriction;
import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.SignalRestrictionA;
import de.oaam.model.oaam.restrictions.SubFunctionRestrictionA;

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
 * An implementation of the model object '<em><b>Location Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getSubFunctions <em>Sub Functions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationRestrictionImpl extends TaskRestrictionAImpl implements LocationRestriction {
	/**
	 * The cached value of the '{@link #getSignals() <em>Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signals;

	/**
	 * The cached value of the '{@link #getSubFunctions() <em>Sub Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subfunction> subFunctions;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected Device devices;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

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
	 * The default value of the '{@link #getLocationName() <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationName() <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationName()
	 * @generated
	 * @ordered
	 */
	protected String locationName = LOCATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORBIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected boolean isForbidden = IS_FORBIDDEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.LOCATION_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectResolvingEList<Signal>(Signal.class, this, RestrictionsPackage.LOCATION_RESTRICTION__SIGNALS);
		}
		return signals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subfunction> getSubFunctions() {
		if (subFunctions == null) {
			subFunctions = new EObjectResolvingEList<Subfunction>(Subfunction.class, this, RestrictionsPackage.LOCATION_RESTRICTION__SUB_FUNCTIONS);
		}
		return subFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevices() {
		if (devices != null && devices.eIsProxy()) {
			InternalEObject oldDevices = (InternalEObject)devices;
			devices = (Device)eResolveProxy(oldDevices);
			if (devices != oldDevices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestrictionsPackage.LOCATION_RESTRICTION__DEVICES, oldDevices, devices));
			}
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDevices() {
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevices(Device newDevices) {
		Device oldDevices = devices;
		devices = newDevices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__DEVICES, oldDevices, devices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectResolvingEList<Connection>(Connection.class, this, RestrictionsPackage.LOCATION_RESTRICTION__CONNECTIONS);
		}
		return connections;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, RestrictionsPackage.LOCATION_RESTRICTION__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, RestrictionsPackage.LOCATION_RESTRICTION__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, RestrictionsPackage.LOCATION_RESTRICTION__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationName(String newLocationName) {
		String oldLocationName = locationName;
		locationName = newLocationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__LOCATION_NAME, oldLocationName, locationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForbidden() {
		return isForbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForbidden(boolean newIsForbidden) {
		boolean oldIsForbidden = isForbidden;
		isForbidden = newIsForbidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.LOCATION_RESTRICTION__IS_FORBIDDEN, oldIsForbidden, isForbidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<Location>(Location.class, this, RestrictionsPackage.LOCATION_RESTRICTION__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestrictionsPackage.LOCATION_RESTRICTION__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.LOCATION_RESTRICTION__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
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
			case RestrictionsPackage.LOCATION_RESTRICTION__SIGNALS:
				return getSignals();
			case RestrictionsPackage.LOCATION_RESTRICTION__SUB_FUNCTIONS:
				return getSubFunctions();
			case RestrictionsPackage.LOCATION_RESTRICTION__DEVICES:
				if (resolve) return getDevices();
				return basicGetDevices();
			case RestrictionsPackage.LOCATION_RESTRICTION__CONNECTIONS:
				return getConnections();
			case RestrictionsPackage.LOCATION_RESTRICTION__ID:
				return getId();
			case RestrictionsPackage.LOCATION_RESTRICTION__NAME:
				return getName();
			case RestrictionsPackage.LOCATION_RESTRICTION__STYLE:
				return getStyle();
			case RestrictionsPackage.LOCATION_RESTRICTION__ATTRIBUTES:
				return getAttributes();
			case RestrictionsPackage.LOCATION_RESTRICTION__DOCUMENTATION:
				return getDocumentation();
			case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIED:
				return getModified();
			case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIER:
				return getModifier();
			case RestrictionsPackage.LOCATION_RESTRICTION__TRACE_LINK:
				return getTraceLink();
			case RestrictionsPackage.LOCATION_RESTRICTION__VARIANTS:
				return getVariants();
			case RestrictionsPackage.LOCATION_RESTRICTION__OPERATION_MODES:
				return getOperationModes();
			case RestrictionsPackage.LOCATION_RESTRICTION__LOCATION_NAME:
				return getLocationName();
			case RestrictionsPackage.LOCATION_RESTRICTION__IS_FORBIDDEN:
				return isIsForbidden();
			case RestrictionsPackage.LOCATION_RESTRICTION__LOCATIONS:
				return getLocations();
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
			case RestrictionsPackage.LOCATION_RESTRICTION__SIGNALS:
				getSignals().clear();
				getSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__SUB_FUNCTIONS:
				getSubFunctions().clear();
				getSubFunctions().addAll((Collection<? extends Subfunction>)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__DEVICES:
				setDevices((Device)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__ID:
				setId((String)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__NAME:
				setName((String)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__STYLE:
				setStyle((String)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIED:
				setModified((Date)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIER:
				setModifier((String)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__LOCATION_NAME:
				setLocationName((String)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
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
			case RestrictionsPackage.LOCATION_RESTRICTION__SIGNALS:
				getSignals().clear();
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__SUB_FUNCTIONS:
				getSubFunctions().clear();
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__DEVICES:
				setDevices((Device)null);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__CONNECTIONS:
				getConnections().clear();
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__ID:
				setId(ID_EDEFAULT);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__ATTRIBUTES:
				getAttributes().clear();
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__VARIANTS:
				getVariants().clear();
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__LOCATION_NAME:
				setLocationName(LOCATION_NAME_EDEFAULT);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case RestrictionsPackage.LOCATION_RESTRICTION__LOCATIONS:
				getLocations().clear();
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
			case RestrictionsPackage.LOCATION_RESTRICTION__SIGNALS:
				return signals != null && !signals.isEmpty();
			case RestrictionsPackage.LOCATION_RESTRICTION__SUB_FUNCTIONS:
				return subFunctions != null && !subFunctions.isEmpty();
			case RestrictionsPackage.LOCATION_RESTRICTION__DEVICES:
				return devices != null;
			case RestrictionsPackage.LOCATION_RESTRICTION__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case RestrictionsPackage.LOCATION_RESTRICTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RestrictionsPackage.LOCATION_RESTRICTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestrictionsPackage.LOCATION_RESTRICTION__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case RestrictionsPackage.LOCATION_RESTRICTION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case RestrictionsPackage.LOCATION_RESTRICTION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case RestrictionsPackage.LOCATION_RESTRICTION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case RestrictionsPackage.LOCATION_RESTRICTION__VARIANTS:
				return variants != null && !variants.isEmpty();
			case RestrictionsPackage.LOCATION_RESTRICTION__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case RestrictionsPackage.LOCATION_RESTRICTION__LOCATION_NAME:
				return LOCATION_NAME_EDEFAULT == null ? locationName != null : !LOCATION_NAME_EDEFAULT.equals(locationName);
			case RestrictionsPackage.LOCATION_RESTRICTION__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case RestrictionsPackage.LOCATION_RESTRICTION__LOCATIONS:
				return locations != null && !locations.isEmpty();
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
		if (baseClass == SignalRestrictionA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.LOCATION_RESTRICTION__SIGNALS: return RestrictionsPackage.SIGNAL_RESTRICTION_A__SIGNALS;
				default: return -1;
			}
		}
		if (baseClass == SubFunctionRestrictionA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.LOCATION_RESTRICTION__SUB_FUNCTIONS: return RestrictionsPackage.SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS;
				default: return -1;
			}
		}
		if (baseClass == DeviceRestrictionA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.LOCATION_RESTRICTION__DEVICES: return RestrictionsPackage.DEVICE_RESTRICTION_A__DEVICES;
				default: return -1;
			}
		}
		if (baseClass == ConnectionRestrinctionA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.LOCATION_RESTRICTION__CONNECTIONS: return RestrictionsPackage.CONNECTION_RESTRINCTION_A__CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == _ElementA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.LOCATION_RESTRICTION__ID: return CommonPackage._ELEMENT_A__ID;
				case RestrictionsPackage.LOCATION_RESTRICTION__NAME: return CommonPackage._ELEMENT_A__NAME;
				case RestrictionsPackage.LOCATION_RESTRICTION__STYLE: return CommonPackage._ELEMENT_A__STYLE;
				case RestrictionsPackage.LOCATION_RESTRICTION__ATTRIBUTES: return CommonPackage._ELEMENT_A__ATTRIBUTES;
				case RestrictionsPackage.LOCATION_RESTRICTION__DOCUMENTATION: return CommonPackage._ELEMENT_A__DOCUMENTATION;
				case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIED: return CommonPackage._ELEMENT_A__MODIFIED;
				case RestrictionsPackage.LOCATION_RESTRICTION__MODIFIER: return CommonPackage._ELEMENT_A__MODIFIER;
				case RestrictionsPackage.LOCATION_RESTRICTION__TRACE_LINK: return CommonPackage._ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == _VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.LOCATION_RESTRICTION__VARIANTS: return ScenarioPackage._VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == _ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.LOCATION_RESTRICTION__OPERATION_MODES: return ScenarioPackage._MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
		if (baseClass == SignalRestrictionA.class) {
			switch (baseFeatureID) {
				case RestrictionsPackage.SIGNAL_RESTRICTION_A__SIGNALS: return RestrictionsPackage.LOCATION_RESTRICTION__SIGNALS;
				default: return -1;
			}
		}
		if (baseClass == SubFunctionRestrictionA.class) {
			switch (baseFeatureID) {
				case RestrictionsPackage.SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS: return RestrictionsPackage.LOCATION_RESTRICTION__SUB_FUNCTIONS;
				default: return -1;
			}
		}
		if (baseClass == DeviceRestrictionA.class) {
			switch (baseFeatureID) {
				case RestrictionsPackage.DEVICE_RESTRICTION_A__DEVICES: return RestrictionsPackage.LOCATION_RESTRICTION__DEVICES;
				default: return -1;
			}
		}
		if (baseClass == ConnectionRestrinctionA.class) {
			switch (baseFeatureID) {
				case RestrictionsPackage.CONNECTION_RESTRINCTION_A__CONNECTIONS: return RestrictionsPackage.LOCATION_RESTRICTION__CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == _ElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage._ELEMENT_A__ID: return RestrictionsPackage.LOCATION_RESTRICTION__ID;
				case CommonPackage._ELEMENT_A__NAME: return RestrictionsPackage.LOCATION_RESTRICTION__NAME;
				case CommonPackage._ELEMENT_A__STYLE: return RestrictionsPackage.LOCATION_RESTRICTION__STYLE;
				case CommonPackage._ELEMENT_A__ATTRIBUTES: return RestrictionsPackage.LOCATION_RESTRICTION__ATTRIBUTES;
				case CommonPackage._ELEMENT_A__DOCUMENTATION: return RestrictionsPackage.LOCATION_RESTRICTION__DOCUMENTATION;
				case CommonPackage._ELEMENT_A__MODIFIED: return RestrictionsPackage.LOCATION_RESTRICTION__MODIFIED;
				case CommonPackage._ELEMENT_A__MODIFIER: return RestrictionsPackage.LOCATION_RESTRICTION__MODIFIER;
				case CommonPackage._ELEMENT_A__TRACE_LINK: return RestrictionsPackage.LOCATION_RESTRICTION__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == _VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage._VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return RestrictionsPackage.LOCATION_RESTRICTION__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == _ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage._MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return RestrictionsPackage.LOCATION_RESTRICTION__OPERATION_MODES;
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
		result.append(", locationName: ");
		result.append(locationName);
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(')');
		return result.toString();
	}

} //LocationRestrictionImpl
