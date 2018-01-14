/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.IoDeclaration;
import de.oaam.model.oaam.library.IoGroup;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.ResourceBundles;
import de.oaam.model.oaam.library.ResourceGroup;
import de.oaam.model.oaam.library.ResourceLink;
import de.oaam.model.oaam.library.ResourceProviderA;
import de.oaam.model.oaam.library.ResourceType;

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
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getIos <em>Ios</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#isIsSubdevice <em>Is Subdevice</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#isCanHaveSubdevices <em>Can Have Subdevices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl#getMtbf <em>Mtbf</em>}</li>
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
	protected EList<ResourceBundles> providedBundles;

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
	 * The cached value of the '{@link #getIos() <em>Ios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIos()
	 * @generated
	 * @ordered
	 */
	protected EList<IoDeclaration> ios;

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
	 * The default value of the '{@link #getMtbf() <em>Mtbf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtbf()
	 * @generated
	 * @ordered
	 */
	protected static final double MTBF_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMtbf() <em>Mtbf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtbf()
	 * @generated
	 * @ordered
	 */
	protected double mtbf = MTBF_EDEFAULT;

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
	public EList<ResourceBundles> getProvidedBundles() {
		if (providedBundles == null) {
			providedBundles = new EObjectContainmentEList<ResourceBundles>(ResourceBundles.class, this, LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES);
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
	public EList<IoDeclaration> getIos() {
		if (ios == null) {
			ios = new EObjectContainmentEList<IoDeclaration>(IoDeclaration.class, this, LibraryPackage.DEVICE_TYPE__IOS);
		}
		return ios;
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
	public double getMtbf() {
		return mtbf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMtbf(double newMtbf) {
		double oldMtbf = mtbf;
		mtbf = newMtbf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.DEVICE_TYPE__MTBF, oldMtbf, mtbf));
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
			case LibraryPackage.DEVICE_TYPE__IOS:
				return ((InternalEList<?>)getIos()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.DEVICE_TYPE__IOS:
				return getIos();
			case LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE:
				return isIsSubdevice();
			case LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES:
				return isCanHaveSubdevices();
			case LibraryPackage.DEVICE_TYPE__MTBF:
				return getMtbf();
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
				getProvidedBundles().addAll((Collection<? extends ResourceBundles>)newValue);
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
			case LibraryPackage.DEVICE_TYPE__IOS:
				getIos().clear();
				getIos().addAll((Collection<? extends IoDeclaration>)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE:
				setIsSubdevice((Boolean)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES:
				setCanHaveSubdevices((Boolean)newValue);
				return;
			case LibraryPackage.DEVICE_TYPE__MTBF:
				setMtbf((Double)newValue);
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
			case LibraryPackage.DEVICE_TYPE__IOS:
				getIos().clear();
				return;
			case LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE:
				setIsSubdevice(IS_SUBDEVICE_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES:
				setCanHaveSubdevices(CAN_HAVE_SUBDEVICES_EDEFAULT);
				return;
			case LibraryPackage.DEVICE_TYPE__MTBF:
				setMtbf(MTBF_EDEFAULT);
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
			case LibraryPackage.DEVICE_TYPE__IOS:
				return ios != null && !ios.isEmpty();
			case LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE:
				return isSubdevice != IS_SUBDEVICE_EDEFAULT;
			case LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES:
				return canHaveSubdevices != CAN_HAVE_SUBDEVICES_EDEFAULT;
			case LibraryPackage.DEVICE_TYPE__MTBF:
				return mtbf != MTBF_EDEFAULT;
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
		if (baseClass == _ElementA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.DEVICE_TYPE__ID: return CommonPackage._ELEMENT_A__ID;
				case LibraryPackage.DEVICE_TYPE__NAME: return CommonPackage._ELEMENT_A__NAME;
				case LibraryPackage.DEVICE_TYPE__STYLE: return CommonPackage._ELEMENT_A__STYLE;
				case LibraryPackage.DEVICE_TYPE__ATTRIBUTES: return CommonPackage._ELEMENT_A__ATTRIBUTES;
				case LibraryPackage.DEVICE_TYPE__DOCUMENTATION: return CommonPackage._ELEMENT_A__DOCUMENTATION;
				case LibraryPackage.DEVICE_TYPE__MODIFIED: return CommonPackage._ELEMENT_A__MODIFIED;
				case LibraryPackage.DEVICE_TYPE__MODIFIER: return CommonPackage._ELEMENT_A__MODIFIER;
				case LibraryPackage.DEVICE_TYPE__TRACE_LINK: return CommonPackage._ELEMENT_A__TRACE_LINK;
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
		if (baseClass == _ElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage._ELEMENT_A__ID: return LibraryPackage.DEVICE_TYPE__ID;
				case CommonPackage._ELEMENT_A__NAME: return LibraryPackage.DEVICE_TYPE__NAME;
				case CommonPackage._ELEMENT_A__STYLE: return LibraryPackage.DEVICE_TYPE__STYLE;
				case CommonPackage._ELEMENT_A__ATTRIBUTES: return LibraryPackage.DEVICE_TYPE__ATTRIBUTES;
				case CommonPackage._ELEMENT_A__DOCUMENTATION: return LibraryPackage.DEVICE_TYPE__DOCUMENTATION;
				case CommonPackage._ELEMENT_A__MODIFIED: return LibraryPackage.DEVICE_TYPE__MODIFIED;
				case CommonPackage._ELEMENT_A__MODIFIER: return LibraryPackage.DEVICE_TYPE__MODIFIER;
				case CommonPackage._ELEMENT_A__TRACE_LINK: return LibraryPackage.DEVICE_TYPE__TRACE_LINK;
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
		result.append(", isSubdevice: ");
		result.append(isSubdevice);
		result.append(", canHaveSubdevices: ");
		result.append(canHaveSubdevices);
		result.append(", mtbf: ");
		result.append(mtbf);
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
