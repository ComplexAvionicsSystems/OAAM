/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.IoDeclaration;
import de.oaam.model.oaam.library.IoGroup;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.ResourceBundle;
import de.oaam.model.oaam.library.ResourceGroup;
import de.oaam.model.oaam.library.ResourceLink;
import de.oaam.model.oaam.library.ResourceProviderA;
import de.oaam.model.oaam.library.ResourceType;

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
 * An implementation of the model object '<em><b>Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getProvidedBundles <em>Provided Bundles</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getPossibleResourceProvisions <em>Possible Resource Provisions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getProvidedGroups <em>Provided Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getResourceLinks <em>Resource Links</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#isCanFail <em>Can Fail</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getPartFailureModes <em>Part Failure Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getIoDeclarations <em>Io Declarations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#isIsSubdevice <em>Is Subdevice</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#isCanHaveSubdevices <em>Can Have Subdevices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getIoGroups <em>Io Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#isIsSelfManaging <em>Is Self Managing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceTypeImpl extends ResourceConsumerAImpl implements DeviceType {
	/**
	 * The cached value of the '{@link #getProvidedBundles() <em>Provided Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceBundle> providedBundles;

	/**
	 * The cached value of the '{@link #getPossibleResourceProvisions() <em>Possible Resource Provisions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleResourceProvisions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> possibleResourceProvisions;

	/**
	 * The cached value of the '{@link #getProvidedGroups() <em>Provided Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroup> providedGroups;

	/**
	 * The cached value of the '{@link #getResourceLinks() <em>Resource Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceLink> resourceLinks;

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
	 * The cached value of the '{@link #getIoDeclarations() <em>Io Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<IoDeclaration> ioDeclarations;

	/**
	 * The default value of the '{@link #isIsSubdevice() <em>Is Subdevice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubdevice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBDEVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSubdevice() <em>Is Subdevice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubdevice()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubdevice = IS_SUBDEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanHaveSubdevices() <em>Can Have Subdevices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHaveSubdevices()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_HAVE_SUBDEVICES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanHaveSubdevices() <em>Can Have Subdevices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHaveSubdevices()
	 * @generated
	 * @ordered
	 */
	protected boolean canHaveSubdevices = CAN_HAVE_SUBDEVICES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIoGroups() <em>Io Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<IoGroup> ioGroups;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.DEVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceBundle> getProvidedBundles() {
		if (providedBundles == null) {
			providedBundles = new EObjectContainmentEList<ResourceBundle>(ResourceBundle.class, this, LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES);
		}
		return providedBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getPossibleResourceProvisions() {
		if (possibleResourceProvisions == null) {
			possibleResourceProvisions = new EObjectResolvingEList<ResourceType>(ResourceType.class, this, LibraryPackage.DEVICE_TYPE__POSSIBLE_RESOURCE_PROVISIONS);
		}
		return possibleResourceProvisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceGroup> getProvidedGroups() {
		if (providedGroups == null) {
			providedGroups = new EObjectContainmentEList<ResourceGroup>(ResourceGroup.class, this, LibraryPackage.DEVICE_TYPE__PROVIDED_GROUPS);
		}
		return providedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceLink> getResourceLinks() {
		if (resourceLinks == null) {
			resourceLinks = new EObjectContainmentEList<ResourceLink>(ResourceLink.class, this, LibraryPackage.DEVICE_TYPE__RESOURCE_LINKS);
		}
		return resourceLinks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, LibraryPackage.DEVICE_TYPE__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__CAN_FAIL, oldCanFail, canFail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__FAILURE_RATE, oldFailureRate, failureRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartFailureMode> getPartFailureModes() {
		if (partFailureModes == null) {
			partFailureModes = new EObjectContainmentEList<PartFailureMode>(PartFailureMode.class, this, LibraryPackage.DEVICE_TYPE__PART_FAILURE_MODES);
		}
		return partFailureModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IoDeclaration> getIoDeclarations() {
		if (ioDeclarations == null) {
			ioDeclarations = new EObjectContainmentEList<IoDeclaration>(IoDeclaration.class, this, LibraryPackage.DEVICE_TYPE__IO_DECLARATIONS);
		}
		return ioDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubdevice() {
		return isSubdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubdevice(boolean newIsSubdevice) {
		boolean oldIsSubdevice = isSubdevice;
		isSubdevice = newIsSubdevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE, oldIsSubdevice, isSubdevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanHaveSubdevices() {
		return canHaveSubdevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanHaveSubdevices(boolean newCanHaveSubdevices) {
		boolean oldCanHaveSubdevices = canHaveSubdevices;
		canHaveSubdevices = newCanHaveSubdevices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES, oldCanHaveSubdevices, canHaveSubdevices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IoGroup> getIoGroups() {
		if (ioGroups == null) {
			ioGroups = new EObjectContainmentEList<IoGroup>(IoGroup.class, this, LibraryPackage.DEVICE_TYPE__IO_GROUPS);
		}
		return ioGroups;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__IS_SELF_MANAGING, oldIsSelfManaging, isSelfManaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES:
				return ((InternalEList<?>)getProvidedBundles()).basicRemove(otherEnd, msgs);
			case LibraryPackage.DEVICE_TYPE__PROVIDED_GROUPS:
				return ((InternalEList<?>)getProvidedGroups()).basicRemove(otherEnd, msgs);
			case LibraryPackage.DEVICE_TYPE__RESOURCE_LINKS:
				return ((InternalEList<?>)getResourceLinks()).basicRemove(otherEnd, msgs);
			case LibraryPackage.DEVICE_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.DEVICE_TYPE__PART_FAILURE_MODES:
				return ((InternalEList<?>)getPartFailureModes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.DEVICE_TYPE__IO_DECLARATIONS:
				return ((InternalEList<?>)getIoDeclarations()).basicRemove(otherEnd, msgs);
			case LibraryPackage.DEVICE_TYPE__IO_GROUPS:
				return ((InternalEList<?>)getIoGroups()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES:
				return getProvidedBundles();
			case LibraryPackage.DEVICE_TYPE__POSSIBLE_RESOURCE_PROVISIONS:
				return getPossibleResourceProvisions();
			case LibraryPackage.DEVICE_TYPE__PROVIDED_GROUPS:
				return getProvidedGroups();
			case LibraryPackage.DEVICE_TYPE__RESOURCE_LINKS:
				return getResourceLinks();
			case LibraryPackage.DEVICE_TYPE__ID:
				return getId();
			case LibraryPackage.DEVICE_TYPE__NAME:
				return getName();
			case LibraryPackage.DEVICE_TYPE__STYLE:
				return getStyle();
			case LibraryPackage.DEVICE_TYPE__ATTRIBUTES:
				return getAttributes();
			case LibraryPackage.DEVICE_TYPE__DOCUMENTATION:
				return getDocumentation();
			case LibraryPackage.DEVICE_TYPE__MODIFIED:
				return getModified();
			case LibraryPackage.DEVICE_TYPE__MODIFIER:
				return getModifier();
			case LibraryPackage.DEVICE_TYPE__TRACE_LINK:
				return getTraceLink();
			case LibraryPackage.DEVICE_TYPE__CAN_FAIL:
				return isCanFail();
			case LibraryPackage.DEVICE_TYPE__FAILURE_RATE:
				return getFailureRate();
			case LibraryPackage.DEVICE_TYPE__PART_FAILURE_MODES:
				return getPartFailureModes();
			case LibraryPackage.DEVICE_TYPE__IO_DECLARATIONS:
				return getIoDeclarations();
			case LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE:
				return isIsSubdevice();
			case LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES:
				return isCanHaveSubdevices();
			case LibraryPackage.DEVICE_TYPE__WEIGHT:
				return getWeight();
			case LibraryPackage.DEVICE_TYPE__COST:
				return getCost();
			case LibraryPackage.DEVICE_TYPE__IO_GROUPS:
				return getIoGroups();
			case LibraryPackage.DEVICE_TYPE__IS_SELF_MANAGING:
				return isIsSelfManaging();
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
			case LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES:
				getProvidedBundles().clear();
				getProvidedBundles().addAll((Collection<? extends ResourceBundle>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__POSSIBLE_RESOURCE_PROVISIONS:
				getPossibleResourceProvisions().clear();
				getPossibleResourceProvisions().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__PROVIDED_GROUPS:
				getProvidedGroups().clear();
				getProvidedGroups().addAll((Collection<? extends ResourceGroup>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__RESOURCE_LINKS:
				getResourceLinks().clear();
				getResourceLinks().addAll((Collection<? extends ResourceLink>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__ID:
				setId((String)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__NAME:
				setName((String)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__CAN_FAIL:
				setCanFail((Boolean)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__FAILURE_RATE:
				setFailureRate((Double)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__PART_FAILURE_MODES:
				getPartFailureModes().clear();
				getPartFailureModes().addAll((Collection<? extends PartFailureMode>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__IO_DECLARATIONS:
				getIoDeclarations().clear();
				getIoDeclarations().addAll((Collection<? extends IoDeclaration>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE:
				setIsSubdevice((Boolean)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES:
				setCanHaveSubdevices((Boolean)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__WEIGHT:
				setWeight((Double)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__COST:
				setCost((Double)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__IO_GROUPS:
				getIoGroups().clear();
				getIoGroups().addAll((Collection<? extends IoGroup>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__IS_SELF_MANAGING:
				setIsSelfManaging((Boolean)newValue);
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
			case LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES:
				getProvidedBundles().clear();
				return;
			case LibraryPackage.DEVICE_TYPE__POSSIBLE_RESOURCE_PROVISIONS:
				getPossibleResourceProvisions().clear();
				return;
			case LibraryPackage.DEVICE_TYPE__PROVIDED_GROUPS:
				getProvidedGroups().clear();
				return;
			case LibraryPackage.DEVICE_TYPE__RESOURCE_LINKS:
				getResourceLinks().clear();
				return;
			case LibraryPackage.DEVICE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case LibraryPackage.DEVICE_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__CAN_FAIL:
				setCanFail(CAN_FAIL_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__FAILURE_RATE:
				setFailureRate(FAILURE_RATE_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__PART_FAILURE_MODES:
				getPartFailureModes().clear();
				return;
			case LibraryPackage.DEVICE_TYPE__IO_DECLARATIONS:
				getIoDeclarations().clear();
				return;
			case LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE:
				setIsSubdevice(IS_SUBDEVICE_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES:
				setCanHaveSubdevices(CAN_HAVE_SUBDEVICES_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__COST:
				setCost(COST_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__IO_GROUPS:
				getIoGroups().clear();
				return;
			case LibraryPackage.DEVICE_TYPE__IS_SELF_MANAGING:
				setIsSelfManaging(IS_SELF_MANAGING_EDEFAULT);
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
			case LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES:
				return providedBundles != null && !providedBundles.isEmpty();
			case LibraryPackage.DEVICE_TYPE__POSSIBLE_RESOURCE_PROVISIONS:
				return possibleResourceProvisions != null && !possibleResourceProvisions.isEmpty();
			case LibraryPackage.DEVICE_TYPE__PROVIDED_GROUPS:
				return providedGroups != null && !providedGroups.isEmpty();
			case LibraryPackage.DEVICE_TYPE__RESOURCE_LINKS:
				return resourceLinks != null && !resourceLinks.isEmpty();
			case LibraryPackage.DEVICE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LibraryPackage.DEVICE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibraryPackage.DEVICE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case LibraryPackage.DEVICE_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case LibraryPackage.DEVICE_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case LibraryPackage.DEVICE_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case LibraryPackage.DEVICE_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case LibraryPackage.DEVICE_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case LibraryPackage.DEVICE_TYPE__CAN_FAIL:
				return canFail != CAN_FAIL_EDEFAULT;
			case LibraryPackage.DEVICE_TYPE__FAILURE_RATE:
				return failureRate != FAILURE_RATE_EDEFAULT;
			case LibraryPackage.DEVICE_TYPE__PART_FAILURE_MODES:
				return partFailureModes != null && !partFailureModes.isEmpty();
			case LibraryPackage.DEVICE_TYPE__IO_DECLARATIONS:
				return ioDeclarations != null && !ioDeclarations.isEmpty();
			case LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE:
				return isSubdevice != IS_SUBDEVICE_EDEFAULT;
			case LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES:
				return canHaveSubdevices != CAN_HAVE_SUBDEVICES_EDEFAULT;
			case LibraryPackage.DEVICE_TYPE__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case LibraryPackage.DEVICE_TYPE__COST:
				return cost != COST_EDEFAULT;
			case LibraryPackage.DEVICE_TYPE__IO_GROUPS:
				return ioGroups != null && !ioGroups.isEmpty();
			case LibraryPackage.DEVICE_TYPE__IS_SELF_MANAGING:
				return isSelfManaging != IS_SELF_MANAGING_EDEFAULT;
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
		if (baseClass == ResourceProviderA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES: return LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES;
				case LibraryPackage.DEVICE_TYPE__POSSIBLE_RESOURCE_PROVISIONS: return LibraryPackage.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS;
				case LibraryPackage.DEVICE_TYPE__PROVIDED_GROUPS: return LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS;
				case LibraryPackage.DEVICE_TYPE__RESOURCE_LINKS: return LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS;
				default: return -1;
			}
		}
		if (baseClass == OaamBaseElementA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.DEVICE_TYPE__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case LibraryPackage.DEVICE_TYPE__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case LibraryPackage.DEVICE_TYPE__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case LibraryPackage.DEVICE_TYPE__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case LibraryPackage.DEVICE_TYPE__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case LibraryPackage.DEVICE_TYPE__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case LibraryPackage.DEVICE_TYPE__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case LibraryPackage.DEVICE_TYPE__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == FailureProviderA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.DEVICE_TYPE__CAN_FAIL: return SafetyPackage.FAILURE_PROVIDER_A__CAN_FAIL;
				case LibraryPackage.DEVICE_TYPE__FAILURE_RATE: return SafetyPackage.FAILURE_PROVIDER_A__FAILURE_RATE;
				case LibraryPackage.DEVICE_TYPE__PART_FAILURE_MODES: return SafetyPackage.FAILURE_PROVIDER_A__PART_FAILURE_MODES;
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
		if (baseClass == ResourceProviderA.class) {
			switch (baseFeatureID) {
				case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES: return LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES;
				case LibraryPackage.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS: return LibraryPackage.DEVICE_TYPE__POSSIBLE_RESOURCE_PROVISIONS;
				case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS: return LibraryPackage.DEVICE_TYPE__PROVIDED_GROUPS;
				case LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS: return LibraryPackage.DEVICE_TYPE__RESOURCE_LINKS;
				default: return -1;
			}
		}
		if (baseClass == OaamBaseElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return LibraryPackage.DEVICE_TYPE__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return LibraryPackage.DEVICE_TYPE__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return LibraryPackage.DEVICE_TYPE__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return LibraryPackage.DEVICE_TYPE__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return LibraryPackage.DEVICE_TYPE__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return LibraryPackage.DEVICE_TYPE__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return LibraryPackage.DEVICE_TYPE__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return LibraryPackage.DEVICE_TYPE__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == FailureProviderA.class) {
			switch (baseFeatureID) {
				case SafetyPackage.FAILURE_PROVIDER_A__CAN_FAIL: return LibraryPackage.DEVICE_TYPE__CAN_FAIL;
				case SafetyPackage.FAILURE_PROVIDER_A__FAILURE_RATE: return LibraryPackage.DEVICE_TYPE__FAILURE_RATE;
				case SafetyPackage.FAILURE_PROVIDER_A__PART_FAILURE_MODES: return LibraryPackage.DEVICE_TYPE__PART_FAILURE_MODES;
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
		result.append(", isSubdevice: ");
		result.append(isSubdevice);
		result.append(", canHaveSubdevices: ");
		result.append(canHaveSubdevices);
		result.append(", weight: ");
		result.append(weight);
		result.append(", cost: ");
		result.append(cost);
		result.append(", isSelfManaging: ");
		result.append(isSelfManaging);
		result.append(')');
		return result.toString();
	}

} //DeviceTypeImpl
