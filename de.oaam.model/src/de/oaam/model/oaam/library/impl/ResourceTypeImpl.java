/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.library.IoDirectionE;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.Resource;
import de.oaam.model.oaam.library.ResourceAlternatives;
import de.oaam.model.oaam.library.ResourceType;

import de.oaam.model.oaam.library.ResourceTypeModifierReference;
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
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#isIsConsumed <em>Is Consumed</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#isIsDistinguishable <em>Is Distinguishable</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#isIsPropagated <em>Is Propagated</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#isIsIo <em>Is Io</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#isIsConfigurable <em>Is Configurable</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getPropagetedResources <em>Propageted Resources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getAllowedModifiers <em>Allowed Modifiers</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeImpl extends ResourceConsumerAImpl implements ResourceType {
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
	 * The default value of the '{@link #isIsConsumed() <em>Is Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConsumed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSUMED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsConsumed() <em>Is Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConsumed()
	 * @generated
	 * @ordered
	 */
	protected boolean isConsumed = IS_CONSUMED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDistinguishable() <em>Is Distinguishable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDistinguishable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISTINGUISHABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDistinguishable() <em>Is Distinguishable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDistinguishable()
	 * @generated
	 * @ordered
	 */
	protected boolean isDistinguishable = IS_DISTINGUISHABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPropagated() <em>Is Propagated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPropagated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROPAGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPropagated() <em>Is Propagated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPropagated()
	 * @generated
	 * @ordered
	 */
	protected boolean isPropagated = IS_PROPAGATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final IoDirectionE DIRECTION_EDEFAULT = IoDirectionE.NONE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected IoDirectionE direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsIo() <em>Is Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIo() <em>Is Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIo()
	 * @generated
	 * @ordered
	 */
	protected boolean isIo = IS_IO_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsConfigurable() <em>Is Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConfigurable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONFIGURABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConfigurable() <em>Is Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConfigurable()
	 * @generated
	 * @ordered
	 */
	protected boolean isConfigurable = IS_CONFIGURABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropagetedResources() <em>Propageted Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagetedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> propagetedResources;

	/**
	 * The cached value of the '{@link #getAllowedModifiers() <em>Allowed Modifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceTypeModifierReference> allowedModifiers;

	/**
	 * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceAlternatives> alternatives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.RESOURCE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, LibraryPackage.RESOURCE_TYPE__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConsumed() {
		return isConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConsumed(boolean newIsConsumed) {
		boolean oldIsConsumed = isConsumed;
		isConsumed = newIsConsumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__IS_CONSUMED, oldIsConsumed, isConsumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDistinguishable() {
		return isDistinguishable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDistinguishable(boolean newIsDistinguishable) {
		boolean oldIsDistinguishable = isDistinguishable;
		isDistinguishable = newIsDistinguishable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__IS_DISTINGUISHABLE, oldIsDistinguishable, isDistinguishable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPropagated() {
		return isPropagated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPropagated(boolean newIsPropagated) {
		boolean oldIsPropagated = isPropagated;
		isPropagated = newIsPropagated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__IS_PROPAGATED, oldIsPropagated, isPropagated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoDirectionE getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(IoDirectionE newDirection) {
		IoDirectionE oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIo() {
		return isIo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIo(boolean newIsIo) {
		boolean oldIsIo = isIo;
		isIo = newIsIo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__IS_IO, oldIsIo, isIo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConfigurable() {
		return isConfigurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConfigurable(boolean newIsConfigurable) {
		boolean oldIsConfigurable = isConfigurable;
		isConfigurable = newIsConfigurable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE__IS_CONFIGURABLE, oldIsConfigurable, isConfigurable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getPropagetedResources() {
		if (propagetedResources == null) {
			propagetedResources = new EObjectContainmentEList<Resource>(Resource.class, this, LibraryPackage.RESOURCE_TYPE__PROPAGETED_RESOURCES);
		}
		return propagetedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceTypeModifierReference> getAllowedModifiers() {
		if (allowedModifiers == null) {
			allowedModifiers = new EObjectResolvingEList<ResourceTypeModifierReference>(ResourceTypeModifierReference.class, this, LibraryPackage.RESOURCE_TYPE__ALLOWED_MODIFIERS);
		}
		return allowedModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceAlternatives> getAlternatives() {
		if (alternatives == null) {
			alternatives = new EObjectContainmentEList<ResourceAlternatives>(ResourceAlternatives.class, this, LibraryPackage.RESOURCE_TYPE__ALTERNATIVES);
		}
		return alternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.RESOURCE_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.RESOURCE_TYPE__PROPAGETED_RESOURCES:
				return ((InternalEList<?>)getPropagetedResources()).basicRemove(otherEnd, msgs);
			case LibraryPackage.RESOURCE_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.RESOURCE_TYPE__ID:
				return getId();
			case LibraryPackage.RESOURCE_TYPE__NAME:
				return getName();
			case LibraryPackage.RESOURCE_TYPE__STYLE:
				return getStyle();
			case LibraryPackage.RESOURCE_TYPE__ATTRIBUTES:
				return getAttributes();
			case LibraryPackage.RESOURCE_TYPE__DOCUMENTATION:
				return getDocumentation();
			case LibraryPackage.RESOURCE_TYPE__MODIFIED:
				return getModified();
			case LibraryPackage.RESOURCE_TYPE__MODIFIER:
				return getModifier();
			case LibraryPackage.RESOURCE_TYPE__TRACE_LINK:
				return getTraceLink();
			case LibraryPackage.RESOURCE_TYPE__IS_CONSUMED:
				return isIsConsumed();
			case LibraryPackage.RESOURCE_TYPE__IS_DISTINGUISHABLE:
				return isIsDistinguishable();
			case LibraryPackage.RESOURCE_TYPE__IS_PROPAGATED:
				return isIsPropagated();
			case LibraryPackage.RESOURCE_TYPE__DIRECTION:
				return getDirection();
			case LibraryPackage.RESOURCE_TYPE__IS_IO:
				return isIsIo();
			case LibraryPackage.RESOURCE_TYPE__IS_CONFIGURABLE:
				return isIsConfigurable();
			case LibraryPackage.RESOURCE_TYPE__PROPAGETED_RESOURCES:
				return getPropagetedResources();
			case LibraryPackage.RESOURCE_TYPE__ALLOWED_MODIFIERS:
				return getAllowedModifiers();
			case LibraryPackage.RESOURCE_TYPE__ALTERNATIVES:
				return getAlternatives();
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
			case LibraryPackage.RESOURCE_TYPE__ID:
				setId((String)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_CONSUMED:
				setIsConsumed((Boolean)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_DISTINGUISHABLE:
				setIsDistinguishable((Boolean)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_PROPAGATED:
				setIsPropagated((Boolean)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__DIRECTION:
				setDirection((IoDirectionE)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_IO:
				setIsIo((Boolean)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_CONFIGURABLE:
				setIsConfigurable((Boolean)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__PROPAGETED_RESOURCES:
				getPropagetedResources().clear();
				getPropagetedResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__ALLOWED_MODIFIERS:
				getAllowedModifiers().clear();
				getAllowedModifiers().addAll((Collection<? extends ResourceTypeModifierReference>)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends ResourceAlternatives>)newValue);
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
			case LibraryPackage.RESOURCE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case LibraryPackage.RESOURCE_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_CONSUMED:
				setIsConsumed(IS_CONSUMED_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_DISTINGUISHABLE:
				setIsDistinguishable(IS_DISTINGUISHABLE_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_PROPAGATED:
				setIsPropagated(IS_PROPAGATED_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_IO:
				setIsIo(IS_IO_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__IS_CONFIGURABLE:
				setIsConfigurable(IS_CONFIGURABLE_EDEFAULT);
				return;
			case LibraryPackage.RESOURCE_TYPE__PROPAGETED_RESOURCES:
				getPropagetedResources().clear();
				return;
			case LibraryPackage.RESOURCE_TYPE__ALLOWED_MODIFIERS:
				getAllowedModifiers().clear();
				return;
			case LibraryPackage.RESOURCE_TYPE__ALTERNATIVES:
				getAlternatives().clear();
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
			case LibraryPackage.RESOURCE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LibraryPackage.RESOURCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibraryPackage.RESOURCE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case LibraryPackage.RESOURCE_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case LibraryPackage.RESOURCE_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case LibraryPackage.RESOURCE_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case LibraryPackage.RESOURCE_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case LibraryPackage.RESOURCE_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case LibraryPackage.RESOURCE_TYPE__IS_CONSUMED:
				return isConsumed != IS_CONSUMED_EDEFAULT;
			case LibraryPackage.RESOURCE_TYPE__IS_DISTINGUISHABLE:
				return isDistinguishable != IS_DISTINGUISHABLE_EDEFAULT;
			case LibraryPackage.RESOURCE_TYPE__IS_PROPAGATED:
				return isPropagated != IS_PROPAGATED_EDEFAULT;
			case LibraryPackage.RESOURCE_TYPE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case LibraryPackage.RESOURCE_TYPE__IS_IO:
				return isIo != IS_IO_EDEFAULT;
			case LibraryPackage.RESOURCE_TYPE__IS_CONFIGURABLE:
				return isConfigurable != IS_CONFIGURABLE_EDEFAULT;
			case LibraryPackage.RESOURCE_TYPE__PROPAGETED_RESOURCES:
				return propagetedResources != null && !propagetedResources.isEmpty();
			case LibraryPackage.RESOURCE_TYPE__ALLOWED_MODIFIERS:
				return allowedModifiers != null && !allowedModifiers.isEmpty();
			case LibraryPackage.RESOURCE_TYPE__ALTERNATIVES:
				return alternatives != null && !alternatives.isEmpty();
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
		if (baseClass == ElementA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.RESOURCE_TYPE__ID: return CommonPackage.ELEMENT_A__ID;
				case LibraryPackage.RESOURCE_TYPE__NAME: return CommonPackage.ELEMENT_A__NAME;
				case LibraryPackage.RESOURCE_TYPE__STYLE: return CommonPackage.ELEMENT_A__STYLE;
				case LibraryPackage.RESOURCE_TYPE__ATTRIBUTES: return CommonPackage.ELEMENT_A__ATTRIBUTES;
				case LibraryPackage.RESOURCE_TYPE__DOCUMENTATION: return CommonPackage.ELEMENT_A__DOCUMENTATION;
				case LibraryPackage.RESOURCE_TYPE__MODIFIED: return CommonPackage.ELEMENT_A__MODIFIED;
				case LibraryPackage.RESOURCE_TYPE__MODIFIER: return CommonPackage.ELEMENT_A__MODIFIER;
				case LibraryPackage.RESOURCE_TYPE__TRACE_LINK: return CommonPackage.ELEMENT_A__TRACE_LINK;
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
		if (baseClass == ElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage.ELEMENT_A__ID: return LibraryPackage.RESOURCE_TYPE__ID;
				case CommonPackage.ELEMENT_A__NAME: return LibraryPackage.RESOURCE_TYPE__NAME;
				case CommonPackage.ELEMENT_A__STYLE: return LibraryPackage.RESOURCE_TYPE__STYLE;
				case CommonPackage.ELEMENT_A__ATTRIBUTES: return LibraryPackage.RESOURCE_TYPE__ATTRIBUTES;
				case CommonPackage.ELEMENT_A__DOCUMENTATION: return LibraryPackage.RESOURCE_TYPE__DOCUMENTATION;
				case CommonPackage.ELEMENT_A__MODIFIED: return LibraryPackage.RESOURCE_TYPE__MODIFIED;
				case CommonPackage.ELEMENT_A__MODIFIER: return LibraryPackage.RESOURCE_TYPE__MODIFIER;
				case CommonPackage.ELEMENT_A__TRACE_LINK: return LibraryPackage.RESOURCE_TYPE__TRACE_LINK;
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
		result.append(", isConsumed: ");
		result.append(isConsumed);
		result.append(", isDistinguishable: ");
		result.append(isDistinguishable);
		result.append(", isPropagated: ");
		result.append(isPropagated);
		result.append(", direction: ");
		result.append(direction);
		result.append(", isIo: ");
		result.append(isIo);
		result.append(", isConfigurable: ");
		result.append(isConfigurable);
		result.append(')');
		return result.toString();
	}

} //ResourceTypeImpl
