/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.BusType;
import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.MessageType;

import de.oaam.model.oaam.safety.FailureProviderA;
import de.oaam.model.oaam.safety.PartFailureMode;
import de.oaam.model.oaam.safety.SafetyPackage;

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
 * An implementation of the model object '<em><b>Bus Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#isCanFail <em>Can Fail</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getPartFailureModes <em>Part Failure Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getDeviceTypes <em>Device Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#isIsSelfManaging <em>Is Self Managing</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getConnectionTypes <em>Connection Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#isRequiresMaster <em>Requires Master</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.BusTypeImpl#getMessagetypes <em>Messagetypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusTypeImpl extends ResourceProviderAImpl implements BusType {
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
	 * The default value of the '{@link #isCanFail() <em>Can Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanFail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_FAIL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCanFail() <em>Can Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanFail()
	 * @generated
	 * @ordered
	 */
	protected boolean canFail = CAN_FAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected static final double FAILURE_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected double failureRate = FAILURE_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartFailureModes() <em>Part Failure Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartFailureModes()
	 * @generated
	 * @ordered
	 */
	protected EList<PartFailureMode> partFailureModes;

	/**
	 * The cached value of the '{@link #getDeviceTypes() <em>Device Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> deviceTypes;

	/**
	 * The default value of the '{@link #isIsSelfManaging() <em>Is Self Managing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelfManaging()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SELF_MANAGING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSelfManaging() <em>Is Self Managing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelfManaging()
	 * @generated
	 * @ordered
	 */
	protected boolean isSelfManaging = IS_SELF_MANAGING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionTypes() <em>Connection Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionType> connectionTypes;

	/**
	 * The default value of the '{@link #isRequiresMaster() <em>Requires Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresMaster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_MASTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresMaster() <em>Requires Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresMaster()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresMaster = REQUIRES_MASTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessagetypes() <em>Messagetypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagetypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> messagetypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.BUS_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, LibraryPackage.BUS_TYPE__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanFail() {
		return canFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanFail(boolean newCanFail) {
		boolean oldCanFail = canFail;
		canFail = newCanFail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__CAN_FAIL, oldCanFail, canFail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFailureRate() {
		return failureRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureRate(double newFailureRate) {
		double oldFailureRate = failureRate;
		failureRate = newFailureRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__FAILURE_RATE, oldFailureRate, failureRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartFailureMode> getPartFailureModes() {
		if (partFailureModes == null) {
			partFailureModes = new EObjectContainmentEList<PartFailureMode>(PartFailureMode.class, this, LibraryPackage.BUS_TYPE__PART_FAILURE_MODES);
		}
		return partFailureModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getDeviceTypes() {
		if (deviceTypes == null) {
			deviceTypes = new EObjectResolvingEList<DeviceType>(DeviceType.class, this, LibraryPackage.BUS_TYPE__DEVICE_TYPES);
		}
		return deviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSelfManaging() {
		return isSelfManaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelfManaging(boolean newIsSelfManaging) {
		boolean oldIsSelfManaging = isSelfManaging;
		isSelfManaging = newIsSelfManaging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__IS_SELF_MANAGING, oldIsSelfManaging, isSelfManaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionType> getConnectionTypes() {
		if (connectionTypes == null) {
			connectionTypes = new EObjectResolvingEList<ConnectionType>(ConnectionType.class, this, LibraryPackage.BUS_TYPE__CONNECTION_TYPES);
		}
		return connectionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequiresMaster() {
		return requiresMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresMaster(boolean newRequiresMaster) {
		boolean oldRequiresMaster = requiresMaster;
		requiresMaster = newRequiresMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BUS_TYPE__REQUIRES_MASTER, oldRequiresMaster, requiresMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getMessagetypes() {
		if (messagetypes == null) {
			messagetypes = new EObjectResolvingEList<MessageType>(MessageType.class, this, LibraryPackage.BUS_TYPE__MESSAGETYPES);
		}
		return messagetypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.BUS_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.BUS_TYPE__PART_FAILURE_MODES:
				return ((InternalEList<?>)getPartFailureModes()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.BUS_TYPE__ID:
				return getId();
			case LibraryPackage.BUS_TYPE__NAME:
				return getName();
			case LibraryPackage.BUS_TYPE__STYLE:
				return getStyle();
			case LibraryPackage.BUS_TYPE__ATTRIBUTES:
				return getAttributes();
			case LibraryPackage.BUS_TYPE__DOCUMENTATION:
				return getDocumentation();
			case LibraryPackage.BUS_TYPE__MODIFIED:
				return getModified();
			case LibraryPackage.BUS_TYPE__MODIFIER:
				return getModifier();
			case LibraryPackage.BUS_TYPE__TRACE_LINK:
				return getTraceLink();
			case LibraryPackage.BUS_TYPE__CAN_FAIL:
				return isCanFail();
			case LibraryPackage.BUS_TYPE__FAILURE_RATE:
				return getFailureRate();
			case LibraryPackage.BUS_TYPE__PART_FAILURE_MODES:
				return getPartFailureModes();
			case LibraryPackage.BUS_TYPE__DEVICE_TYPES:
				return getDeviceTypes();
			case LibraryPackage.BUS_TYPE__IS_SELF_MANAGING:
				return isIsSelfManaging();
			case LibraryPackage.BUS_TYPE__CONNECTION_TYPES:
				return getConnectionTypes();
			case LibraryPackage.BUS_TYPE__REQUIRES_MASTER:
				return isRequiresMaster();
			case LibraryPackage.BUS_TYPE__MESSAGETYPES:
				return getMessagetypes();
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
			case LibraryPackage.BUS_TYPE__ID:
				setId((String)newValue);
				return;
			case LibraryPackage.BUS_TYPE__NAME:
				setName((String)newValue);
				return;
			case LibraryPackage.BUS_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case LibraryPackage.BUS_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case LibraryPackage.BUS_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case LibraryPackage.BUS_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case LibraryPackage.BUS_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case LibraryPackage.BUS_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case LibraryPackage.BUS_TYPE__CAN_FAIL:
				setCanFail((Boolean)newValue);
				return;
			case LibraryPackage.BUS_TYPE__FAILURE_RATE:
				setFailureRate((Double)newValue);
				return;
			case LibraryPackage.BUS_TYPE__PART_FAILURE_MODES:
				getPartFailureModes().clear();
				getPartFailureModes().addAll((Collection<? extends PartFailureMode>)newValue);
				return;
			case LibraryPackage.BUS_TYPE__DEVICE_TYPES:
				getDeviceTypes().clear();
				getDeviceTypes().addAll((Collection<? extends DeviceType>)newValue);
				return;
			case LibraryPackage.BUS_TYPE__IS_SELF_MANAGING:
				setIsSelfManaging((Boolean)newValue);
				return;
			case LibraryPackage.BUS_TYPE__CONNECTION_TYPES:
				getConnectionTypes().clear();
				getConnectionTypes().addAll((Collection<? extends ConnectionType>)newValue);
				return;
			case LibraryPackage.BUS_TYPE__REQUIRES_MASTER:
				setRequiresMaster((Boolean)newValue);
				return;
			case LibraryPackage.BUS_TYPE__MESSAGETYPES:
				getMessagetypes().clear();
				getMessagetypes().addAll((Collection<? extends MessageType>)newValue);
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
			case LibraryPackage.BUS_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case LibraryPackage.BUS_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__CAN_FAIL:
				setCanFail(CAN_FAIL_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__FAILURE_RATE:
				setFailureRate(FAILURE_RATE_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__PART_FAILURE_MODES:
				getPartFailureModes().clear();
				return;
			case LibraryPackage.BUS_TYPE__DEVICE_TYPES:
				getDeviceTypes().clear();
				return;
			case LibraryPackage.BUS_TYPE__IS_SELF_MANAGING:
				setIsSelfManaging(IS_SELF_MANAGING_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__CONNECTION_TYPES:
				getConnectionTypes().clear();
				return;
			case LibraryPackage.BUS_TYPE__REQUIRES_MASTER:
				setRequiresMaster(REQUIRES_MASTER_EDEFAULT);
				return;
			case LibraryPackage.BUS_TYPE__MESSAGETYPES:
				getMessagetypes().clear();
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
			case LibraryPackage.BUS_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LibraryPackage.BUS_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibraryPackage.BUS_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case LibraryPackage.BUS_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case LibraryPackage.BUS_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case LibraryPackage.BUS_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case LibraryPackage.BUS_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case LibraryPackage.BUS_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case LibraryPackage.BUS_TYPE__CAN_FAIL:
				return canFail != CAN_FAIL_EDEFAULT;
			case LibraryPackage.BUS_TYPE__FAILURE_RATE:
				return failureRate != FAILURE_RATE_EDEFAULT;
			case LibraryPackage.BUS_TYPE__PART_FAILURE_MODES:
				return partFailureModes != null && !partFailureModes.isEmpty();
			case LibraryPackage.BUS_TYPE__DEVICE_TYPES:
				return deviceTypes != null && !deviceTypes.isEmpty();
			case LibraryPackage.BUS_TYPE__IS_SELF_MANAGING:
				return isSelfManaging != IS_SELF_MANAGING_EDEFAULT;
			case LibraryPackage.BUS_TYPE__CONNECTION_TYPES:
				return connectionTypes != null && !connectionTypes.isEmpty();
			case LibraryPackage.BUS_TYPE__REQUIRES_MASTER:
				return requiresMaster != REQUIRES_MASTER_EDEFAULT;
			case LibraryPackage.BUS_TYPE__MESSAGETYPES:
				return messagetypes != null && !messagetypes.isEmpty();
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
				case LibraryPackage.BUS_TYPE__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case LibraryPackage.BUS_TYPE__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case LibraryPackage.BUS_TYPE__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case LibraryPackage.BUS_TYPE__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case LibraryPackage.BUS_TYPE__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case LibraryPackage.BUS_TYPE__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case LibraryPackage.BUS_TYPE__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case LibraryPackage.BUS_TYPE__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == FailureProviderA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.BUS_TYPE__CAN_FAIL: return SafetyPackage.FAILURE_PROVIDER_A__CAN_FAIL;
				case LibraryPackage.BUS_TYPE__FAILURE_RATE: return SafetyPackage.FAILURE_PROVIDER_A__FAILURE_RATE;
				case LibraryPackage.BUS_TYPE__PART_FAILURE_MODES: return SafetyPackage.FAILURE_PROVIDER_A__PART_FAILURE_MODES;
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
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return LibraryPackage.BUS_TYPE__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return LibraryPackage.BUS_TYPE__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return LibraryPackage.BUS_TYPE__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return LibraryPackage.BUS_TYPE__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return LibraryPackage.BUS_TYPE__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return LibraryPackage.BUS_TYPE__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return LibraryPackage.BUS_TYPE__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return LibraryPackage.BUS_TYPE__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == FailureProviderA.class) {
			switch (baseFeatureID) {
				case SafetyPackage.FAILURE_PROVIDER_A__CAN_FAIL: return LibraryPackage.BUS_TYPE__CAN_FAIL;
				case SafetyPackage.FAILURE_PROVIDER_A__FAILURE_RATE: return LibraryPackage.BUS_TYPE__FAILURE_RATE;
				case SafetyPackage.FAILURE_PROVIDER_A__PART_FAILURE_MODES: return LibraryPackage.BUS_TYPE__PART_FAILURE_MODES;
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
		result.append(", canFail: ");
		result.append(canFail);
		result.append(", failureRate: ");
		result.append(failureRate);
		result.append(", isSelfManaging: ");
		result.append(isSelfManaging);
		result.append(", requiresMaster: ");
		result.append(requiresMaster);
		result.append(')');
		return result.toString();
	}

} //BusTypeImpl
