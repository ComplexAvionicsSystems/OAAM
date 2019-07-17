/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.Resource;
import de.oaam.model.oaam.library.ResourceConsumerA;
import de.oaam.model.oaam.library.ResourceGroup;
import de.oaam.model.oaam.library.ResourceType;
import de.oaam.model.oaam.library.WireType;

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
 * An implementation of the model object '<em><b>Connection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getRequiredResources <em>Required Resources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getConsumedGroups <em>Consumed Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#isIsInformation <em>Is Information</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#isIsPower <em>Is Power</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getWireTypes <em>Wire Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#isIsWireless <em>Is Wireless</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#isAllowsCircles <em>Allows Circles</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getNStartingPoints <em>NStarting Points</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getStartingPointResourceTypes <em>Starting Point Resource Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getNEndPoints <em>NEnd Points</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getEndPointResourceTypes <em>End Point Resource Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getNJoints <em>NJoints</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getMaxJointBranches <em>Max Joint Branches</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getMaxInterfaceToJointDistance <em>Max Interface To Joint Distance</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getSwitchTypes <em>Switch Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#isIsSwitched <em>Is Switched</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#isDirectConnectionsAllowed <em>Direct Connections Allowed</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#isIsUnidirectional <em>Is Unidirectional</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl#isRequiresMaster <em>Requires Master</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionTypeImpl extends ResourceProviderAImpl implements ConnectionType {
	/**
	 * The cached value of the '{@link #getRequiredResources() <em>Required Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> requiredResources;

	/**
	 * The cached value of the '{@link #getConsumedGroups() <em>Consumed Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroup> consumedGroups;

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
	 * The default value of the '{@link #isIsInformation() <em>Is Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInformation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INFORMATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsInformation() <em>Is Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInformation()
	 * @generated
	 * @ordered
	 */
	protected boolean isInformation = IS_INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPower() <em>Is Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPower()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_POWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPower() <em>Is Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPower()
	 * @generated
	 * @ordered
	 */
	protected boolean isPower = IS_POWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWireTypes() <em>Wire Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<WireType> wireTypes;

	/**
	 * The default value of the '{@link #isIsWireless() <em>Is Wireless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWireless()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WIRELESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWireless() <em>Is Wireless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWireless()
	 * @generated
	 * @ordered
	 */
	protected boolean isWireless = IS_WIRELESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowsCircles() <em>Allows Circles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowsCircles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOWS_CIRCLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowsCircles() <em>Allows Circles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowsCircles()
	 * @generated
	 * @ordered
	 */
	protected boolean allowsCircles = ALLOWS_CIRCLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNStartingPoints() <em>NStarting Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNStartingPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int NSTARTING_POINTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNStartingPoints() <em>NStarting Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNStartingPoints()
	 * @generated
	 * @ordered
	 */
	protected int nStartingPoints = NSTARTING_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartingPointResourceTypes() <em>Starting Point Resource Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingPointResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> startingPointResourceTypes;

	/**
	 * The default value of the '{@link #getNEndPoints() <em>NEnd Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNEndPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int NEND_POINTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNEndPoints() <em>NEnd Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNEndPoints()
	 * @generated
	 * @ordered
	 */
	protected int nEndPoints = NEND_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndPointResourceTypes() <em>End Point Resource Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> endPointResourceTypes;

	/**
	 * The default value of the '{@link #getNJoints() <em>NJoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNJoints()
	 * @generated
	 * @ordered
	 */
	protected static final int NJOINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNJoints() <em>NJoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNJoints()
	 * @generated
	 * @ordered
	 */
	protected int nJoints = NJOINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxJointBranches() <em>Max Joint Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJointBranches()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_JOINT_BRANCHES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxJointBranches() <em>Max Joint Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJointBranches()
	 * @generated
	 * @ordered
	 */
	protected int maxJointBranches = MAX_JOINT_BRANCHES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInterfaceToJointDistance() <em>Max Interface To Joint Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterfaceToJointDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_INTERFACE_TO_JOINT_DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxInterfaceToJointDistance() <em>Max Interface To Joint Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterfaceToJointDistance()
	 * @generated
	 * @ordered
	 */
	protected double maxInterfaceToJointDistance = MAX_INTERFACE_TO_JOINT_DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitchTypes() <em>Switch Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> switchTypes;

	/**
	 * The default value of the '{@link #isIsSwitched() <em>Is Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSwitched()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SWITCHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSwitched() <em>Is Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSwitched()
	 * @generated
	 * @ordered
	 */
	protected boolean isSwitched = IS_SWITCHED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDirectConnectionsAllowed() <em>Direct Connections Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectConnectionsAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECT_CONNECTIONS_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirectConnectionsAllowed() <em>Direct Connections Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectConnectionsAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean directConnectionsAllowed = DIRECT_CONNECTIONS_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_LENGTH_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected double maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnidirectional() <em>Is Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnidirectional() <em>Is Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnidirectional = IS_UNIDIRECTIONAL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.CONNECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequiredResources() {
		if (requiredResources == null) {
			requiredResources = new EObjectContainmentEList<Resource>(Resource.class, this, LibraryPackage.CONNECTION_TYPE__REQUIRED_RESOURCES);
		}
		return requiredResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceGroup> getConsumedGroups() {
		if (consumedGroups == null) {
			consumedGroups = new EObjectContainmentEList<ResourceGroup>(ResourceGroup.class, this, LibraryPackage.CONNECTION_TYPE__CONSUMED_GROUPS);
		}
		return consumedGroups;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, LibraryPackage.CONNECTION_TYPE__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInformation() {
		return isInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInformation(boolean newIsInformation) {
		boolean oldIsInformation = isInformation;
		isInformation = newIsInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__IS_INFORMATION, oldIsInformation, isInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPower() {
		return isPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPower(boolean newIsPower) {
		boolean oldIsPower = isPower;
		isPower = newIsPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__IS_POWER, oldIsPower, isPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireType> getWireTypes() {
		if (wireTypes == null) {
			wireTypes = new EObjectResolvingEList<WireType>(WireType.class, this, LibraryPackage.CONNECTION_TYPE__WIRE_TYPES);
		}
		return wireTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWireless() {
		return isWireless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWireless(boolean newIsWireless) {
		boolean oldIsWireless = isWireless;
		isWireless = newIsWireless;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__IS_WIRELESS, oldIsWireless, isWireless));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowsCircles() {
		return allowsCircles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsCircles(boolean newAllowsCircles) {
		boolean oldAllowsCircles = allowsCircles;
		allowsCircles = newAllowsCircles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__ALLOWS_CIRCLES, oldAllowsCircles, allowsCircles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNStartingPoints() {
		return nStartingPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNStartingPoints(int newNStartingPoints) {
		int oldNStartingPoints = nStartingPoints;
		nStartingPoints = newNStartingPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__NSTARTING_POINTS, oldNStartingPoints, nStartingPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getStartingPointResourceTypes() {
		if (startingPointResourceTypes == null) {
			startingPointResourceTypes = new EObjectResolvingEList<ResourceType>(ResourceType.class, this, LibraryPackage.CONNECTION_TYPE__STARTING_POINT_RESOURCE_TYPES);
		}
		return startingPointResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNEndPoints() {
		return nEndPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNEndPoints(int newNEndPoints) {
		int oldNEndPoints = nEndPoints;
		nEndPoints = newNEndPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__NEND_POINTS, oldNEndPoints, nEndPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getEndPointResourceTypes() {
		if (endPointResourceTypes == null) {
			endPointResourceTypes = new EObjectResolvingEList<ResourceType>(ResourceType.class, this, LibraryPackage.CONNECTION_TYPE__END_POINT_RESOURCE_TYPES);
		}
		return endPointResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNJoints() {
		return nJoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNJoints(int newNJoints) {
		int oldNJoints = nJoints;
		nJoints = newNJoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__NJOINTS, oldNJoints, nJoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxJointBranches() {
		return maxJointBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxJointBranches(int newMaxJointBranches) {
		int oldMaxJointBranches = maxJointBranches;
		maxJointBranches = newMaxJointBranches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__MAX_JOINT_BRANCHES, oldMaxJointBranches, maxJointBranches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxInterfaceToJointDistance() {
		return maxInterfaceToJointDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterfaceToJointDistance(double newMaxInterfaceToJointDistance) {
		double oldMaxInterfaceToJointDistance = maxInterfaceToJointDistance;
		maxInterfaceToJointDistance = newMaxInterfaceToJointDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE, oldMaxInterfaceToJointDistance, maxInterfaceToJointDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getSwitchTypes() {
		if (switchTypes == null) {
			switchTypes = new EObjectResolvingEList<DeviceType>(DeviceType.class, this, LibraryPackage.CONNECTION_TYPE__SWITCH_TYPES);
		}
		return switchTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSwitched() {
		return isSwitched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSwitched(boolean newIsSwitched) {
		boolean oldIsSwitched = isSwitched;
		isSwitched = newIsSwitched;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__IS_SWITCHED, oldIsSwitched, isSwitched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirectConnectionsAllowed() {
		return directConnectionsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectConnectionsAllowed(boolean newDirectConnectionsAllowed) {
		boolean oldDirectConnectionsAllowed = directConnectionsAllowed;
		directConnectionsAllowed = newDirectConnectionsAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED, oldDirectConnectionsAllowed, directConnectionsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(double newMaxLength) {
		double oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnidirectional() {
		return isUnidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnidirectional(boolean newIsUnidirectional) {
		boolean oldIsUnidirectional = isUnidirectional;
		isUnidirectional = newIsUnidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__IS_UNIDIRECTIONAL, oldIsUnidirectional, isUnidirectional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.CONNECTION_TYPE__REQUIRES_MASTER, oldRequiresMaster, requiresMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.CONNECTION_TYPE__REQUIRED_RESOURCES:
				return ((InternalEList<?>)getRequiredResources()).basicRemove(otherEnd, msgs);
			case LibraryPackage.CONNECTION_TYPE__CONSUMED_GROUPS:
				return ((InternalEList<?>)getConsumedGroups()).basicRemove(otherEnd, msgs);
			case LibraryPackage.CONNECTION_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.CONNECTION_TYPE__REQUIRED_RESOURCES:
				return getRequiredResources();
			case LibraryPackage.CONNECTION_TYPE__CONSUMED_GROUPS:
				return getConsumedGroups();
			case LibraryPackage.CONNECTION_TYPE__ID:
				return getId();
			case LibraryPackage.CONNECTION_TYPE__NAME:
				return getName();
			case LibraryPackage.CONNECTION_TYPE__STYLE:
				return getStyle();
			case LibraryPackage.CONNECTION_TYPE__ATTRIBUTES:
				return getAttributes();
			case LibraryPackage.CONNECTION_TYPE__DOCUMENTATION:
				return getDocumentation();
			case LibraryPackage.CONNECTION_TYPE__MODIFIED:
				return getModified();
			case LibraryPackage.CONNECTION_TYPE__MODIFIER:
				return getModifier();
			case LibraryPackage.CONNECTION_TYPE__TRACE_LINK:
				return getTraceLink();
			case LibraryPackage.CONNECTION_TYPE__IS_INFORMATION:
				return isIsInformation();
			case LibraryPackage.CONNECTION_TYPE__IS_POWER:
				return isIsPower();
			case LibraryPackage.CONNECTION_TYPE__WIRE_TYPES:
				return getWireTypes();
			case LibraryPackage.CONNECTION_TYPE__IS_WIRELESS:
				return isIsWireless();
			case LibraryPackage.CONNECTION_TYPE__ALLOWS_CIRCLES:
				return isAllowsCircles();
			case LibraryPackage.CONNECTION_TYPE__NSTARTING_POINTS:
				return getNStartingPoints();
			case LibraryPackage.CONNECTION_TYPE__STARTING_POINT_RESOURCE_TYPES:
				return getStartingPointResourceTypes();
			case LibraryPackage.CONNECTION_TYPE__NEND_POINTS:
				return getNEndPoints();
			case LibraryPackage.CONNECTION_TYPE__END_POINT_RESOURCE_TYPES:
				return getEndPointResourceTypes();
			case LibraryPackage.CONNECTION_TYPE__NJOINTS:
				return getNJoints();
			case LibraryPackage.CONNECTION_TYPE__MAX_JOINT_BRANCHES:
				return getMaxJointBranches();
			case LibraryPackage.CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE:
				return getMaxInterfaceToJointDistance();
			case LibraryPackage.CONNECTION_TYPE__SWITCH_TYPES:
				return getSwitchTypes();
			case LibraryPackage.CONNECTION_TYPE__IS_SWITCHED:
				return isIsSwitched();
			case LibraryPackage.CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED:
				return isDirectConnectionsAllowed();
			case LibraryPackage.CONNECTION_TYPE__MAX_LENGTH:
				return getMaxLength();
			case LibraryPackage.CONNECTION_TYPE__IS_UNIDIRECTIONAL:
				return isIsUnidirectional();
			case LibraryPackage.CONNECTION_TYPE__REQUIRES_MASTER:
				return isRequiresMaster();
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
			case LibraryPackage.CONNECTION_TYPE__REQUIRED_RESOURCES:
				getRequiredResources().clear();
				getRequiredResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__CONSUMED_GROUPS:
				getConsumedGroups().clear();
				getConsumedGroups().addAll((Collection<? extends ResourceGroup>)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__ID:
				setId((String)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_INFORMATION:
				setIsInformation((Boolean)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_POWER:
				setIsPower((Boolean)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__WIRE_TYPES:
				getWireTypes().clear();
				getWireTypes().addAll((Collection<? extends WireType>)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_WIRELESS:
				setIsWireless((Boolean)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__ALLOWS_CIRCLES:
				setAllowsCircles((Boolean)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__NSTARTING_POINTS:
				setNStartingPoints((Integer)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__STARTING_POINT_RESOURCE_TYPES:
				getStartingPointResourceTypes().clear();
				getStartingPointResourceTypes().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__NEND_POINTS:
				setNEndPoints((Integer)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__END_POINT_RESOURCE_TYPES:
				getEndPointResourceTypes().clear();
				getEndPointResourceTypes().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__NJOINTS:
				setNJoints((Integer)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__MAX_JOINT_BRANCHES:
				setMaxJointBranches((Integer)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE:
				setMaxInterfaceToJointDistance((Double)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__SWITCH_TYPES:
				getSwitchTypes().clear();
				getSwitchTypes().addAll((Collection<? extends DeviceType>)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_SWITCHED:
				setIsSwitched((Boolean)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED:
				setDirectConnectionsAllowed((Boolean)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__MAX_LENGTH:
				setMaxLength((Double)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_UNIDIRECTIONAL:
				setIsUnidirectional((Boolean)newValue);
				return;
			case LibraryPackage.CONNECTION_TYPE__REQUIRES_MASTER:
				setRequiresMaster((Boolean)newValue);
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
			case LibraryPackage.CONNECTION_TYPE__REQUIRED_RESOURCES:
				getRequiredResources().clear();
				return;
			case LibraryPackage.CONNECTION_TYPE__CONSUMED_GROUPS:
				getConsumedGroups().clear();
				return;
			case LibraryPackage.CONNECTION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case LibraryPackage.CONNECTION_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_INFORMATION:
				setIsInformation(IS_INFORMATION_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_POWER:
				setIsPower(IS_POWER_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__WIRE_TYPES:
				getWireTypes().clear();
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_WIRELESS:
				setIsWireless(IS_WIRELESS_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__ALLOWS_CIRCLES:
				setAllowsCircles(ALLOWS_CIRCLES_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__NSTARTING_POINTS:
				setNStartingPoints(NSTARTING_POINTS_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__STARTING_POINT_RESOURCE_TYPES:
				getStartingPointResourceTypes().clear();
				return;
			case LibraryPackage.CONNECTION_TYPE__NEND_POINTS:
				setNEndPoints(NEND_POINTS_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__END_POINT_RESOURCE_TYPES:
				getEndPointResourceTypes().clear();
				return;
			case LibraryPackage.CONNECTION_TYPE__NJOINTS:
				setNJoints(NJOINTS_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__MAX_JOINT_BRANCHES:
				setMaxJointBranches(MAX_JOINT_BRANCHES_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE:
				setMaxInterfaceToJointDistance(MAX_INTERFACE_TO_JOINT_DISTANCE_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__SWITCH_TYPES:
				getSwitchTypes().clear();
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_SWITCHED:
				setIsSwitched(IS_SWITCHED_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED:
				setDirectConnectionsAllowed(DIRECT_CONNECTIONS_ALLOWED_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__IS_UNIDIRECTIONAL:
				setIsUnidirectional(IS_UNIDIRECTIONAL_EDEFAULT);
				return;
			case LibraryPackage.CONNECTION_TYPE__REQUIRES_MASTER:
				setRequiresMaster(REQUIRES_MASTER_EDEFAULT);
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
			case LibraryPackage.CONNECTION_TYPE__REQUIRED_RESOURCES:
				return requiredResources != null && !requiredResources.isEmpty();
			case LibraryPackage.CONNECTION_TYPE__CONSUMED_GROUPS:
				return consumedGroups != null && !consumedGroups.isEmpty();
			case LibraryPackage.CONNECTION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LibraryPackage.CONNECTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibraryPackage.CONNECTION_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case LibraryPackage.CONNECTION_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case LibraryPackage.CONNECTION_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case LibraryPackage.CONNECTION_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case LibraryPackage.CONNECTION_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case LibraryPackage.CONNECTION_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case LibraryPackage.CONNECTION_TYPE__IS_INFORMATION:
				return isInformation != IS_INFORMATION_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__IS_POWER:
				return isPower != IS_POWER_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__WIRE_TYPES:
				return wireTypes != null && !wireTypes.isEmpty();
			case LibraryPackage.CONNECTION_TYPE__IS_WIRELESS:
				return isWireless != IS_WIRELESS_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__ALLOWS_CIRCLES:
				return allowsCircles != ALLOWS_CIRCLES_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__NSTARTING_POINTS:
				return nStartingPoints != NSTARTING_POINTS_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__STARTING_POINT_RESOURCE_TYPES:
				return startingPointResourceTypes != null && !startingPointResourceTypes.isEmpty();
			case LibraryPackage.CONNECTION_TYPE__NEND_POINTS:
				return nEndPoints != NEND_POINTS_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__END_POINT_RESOURCE_TYPES:
				return endPointResourceTypes != null && !endPointResourceTypes.isEmpty();
			case LibraryPackage.CONNECTION_TYPE__NJOINTS:
				return nJoints != NJOINTS_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__MAX_JOINT_BRANCHES:
				return maxJointBranches != MAX_JOINT_BRANCHES_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE:
				return maxInterfaceToJointDistance != MAX_INTERFACE_TO_JOINT_DISTANCE_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__SWITCH_TYPES:
				return switchTypes != null && !switchTypes.isEmpty();
			case LibraryPackage.CONNECTION_TYPE__IS_SWITCHED:
				return isSwitched != IS_SWITCHED_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED:
				return directConnectionsAllowed != DIRECT_CONNECTIONS_ALLOWED_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__IS_UNIDIRECTIONAL:
				return isUnidirectional != IS_UNIDIRECTIONAL_EDEFAULT;
			case LibraryPackage.CONNECTION_TYPE__REQUIRES_MASTER:
				return requiresMaster != REQUIRES_MASTER_EDEFAULT;
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
		if (baseClass == ResourceConsumerA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.CONNECTION_TYPE__REQUIRED_RESOURCES: return LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES;
				case LibraryPackage.CONNECTION_TYPE__CONSUMED_GROUPS: return LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == OaamBaseElementA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.CONNECTION_TYPE__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case LibraryPackage.CONNECTION_TYPE__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case LibraryPackage.CONNECTION_TYPE__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case LibraryPackage.CONNECTION_TYPE__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case LibraryPackage.CONNECTION_TYPE__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case LibraryPackage.CONNECTION_TYPE__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case LibraryPackage.CONNECTION_TYPE__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case LibraryPackage.CONNECTION_TYPE__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
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
		if (baseClass == ResourceConsumerA.class) {
			switch (baseFeatureID) {
				case LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES: return LibraryPackage.CONNECTION_TYPE__REQUIRED_RESOURCES;
				case LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS: return LibraryPackage.CONNECTION_TYPE__CONSUMED_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == OaamBaseElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return LibraryPackage.CONNECTION_TYPE__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return LibraryPackage.CONNECTION_TYPE__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return LibraryPackage.CONNECTION_TYPE__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return LibraryPackage.CONNECTION_TYPE__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return LibraryPackage.CONNECTION_TYPE__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return LibraryPackage.CONNECTION_TYPE__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return LibraryPackage.CONNECTION_TYPE__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return LibraryPackage.CONNECTION_TYPE__TRACE_LINK;
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
		result.append(", isInformation: ");
		result.append(isInformation);
		result.append(", isPower: ");
		result.append(isPower);
		result.append(", isWireless: ");
		result.append(isWireless);
		result.append(", allowsCircles: ");
		result.append(allowsCircles);
		result.append(", nStartingPoints: ");
		result.append(nStartingPoints);
		result.append(", nEndPoints: ");
		result.append(nEndPoints);
		result.append(", nJoints: ");
		result.append(nJoints);
		result.append(", maxJointBranches: ");
		result.append(maxJointBranches);
		result.append(", maxInterfaceToJointDistance: ");
		result.append(maxInterfaceToJointDistance);
		result.append(", isSwitched: ");
		result.append(isSwitched);
		result.append(", directConnectionsAllowed: ");
		result.append(directConnectionsAllowed);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", isUnidirectional: ");
		result.append(isUnidirectional);
		result.append(", requiresMaster: ");
		result.append(requiresMaster);
		result.append(')');
		return result.toString();
	}

} //ConnectionTypeImpl
