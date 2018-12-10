/**
 */
package de.oaam.model.oaam.hardware.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.HardwarePackage;
import de.oaam.model.oaam.hardware.Io;

import de.oaam.model.oaam.library.ConnectionType;

import de.oaam.model.oaam.library.impl.ResourceProviderInstanceAImpl;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

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
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getStartingPoints <em>Starting Points</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getEndPoints <em>End Points</em>}</li>
 *   <li>{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl#getMasters <em>Masters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends ResourceProviderInstanceAImpl implements Connection {
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
	protected ConnectionType type;

	/**
	 * The cached value of the '{@link #getStartingPoints() <em>Starting Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Io> startingPoints;

	/**
	 * The cached value of the '{@link #getEndPoints() <em>End Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Io> endPoints;

	/**
	 * The cached value of the '{@link #getMasters() <em>Masters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasters()
	 * @generated
	 * @ordered
	 */
	protected EList<Io> masters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CONNECTION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CONNECTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CONNECTION__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, HardwarePackage.CONNECTION__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CONNECTION__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CONNECTION__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CONNECTION__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CONNECTION__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, HardwarePackage.CONNECTION__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, HardwarePackage.CONNECTION__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ConnectionType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePackage.CONNECTION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConnectionType newType) {
		ConnectionType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CONNECTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Io> getStartingPoints() {
		if (startingPoints == null) {
			startingPoints = new EObjectResolvingEList<Io>(Io.class, this, HardwarePackage.CONNECTION__STARTING_POINTS);
		}
		return startingPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Io> getEndPoints() {
		if (endPoints == null) {
			endPoints = new EObjectResolvingEList<Io>(Io.class, this, HardwarePackage.CONNECTION__END_POINTS);
		}
		return endPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Io> getMasters() {
		if (masters == null) {
			masters = new EObjectResolvingEList<Io>(Io.class, this, HardwarePackage.CONNECTION__MASTERS);
		}
		return masters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePackage.CONNECTION__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case HardwarePackage.CONNECTION__OPERATION_MODES:
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
			case HardwarePackage.CONNECTION__ID:
				return getId();
			case HardwarePackage.CONNECTION__NAME:
				return getName();
			case HardwarePackage.CONNECTION__STYLE:
				return getStyle();
			case HardwarePackage.CONNECTION__ATTRIBUTES:
				return getAttributes();
			case HardwarePackage.CONNECTION__DOCUMENTATION:
				return getDocumentation();
			case HardwarePackage.CONNECTION__MODIFIED:
				return getModified();
			case HardwarePackage.CONNECTION__MODIFIER:
				return getModifier();
			case HardwarePackage.CONNECTION__TRACE_LINK:
				return getTraceLink();
			case HardwarePackage.CONNECTION__VARIANTS:
				return getVariants();
			case HardwarePackage.CONNECTION__OPERATION_MODES:
				return getOperationModes();
			case HardwarePackage.CONNECTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case HardwarePackage.CONNECTION__STARTING_POINTS:
				return getStartingPoints();
			case HardwarePackage.CONNECTION__END_POINTS:
				return getEndPoints();
			case HardwarePackage.CONNECTION__MASTERS:
				return getMasters();
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
			case HardwarePackage.CONNECTION__ID:
				setId((String)newValue);
				return;
			case HardwarePackage.CONNECTION__NAME:
				setName((String)newValue);
				return;
			case HardwarePackage.CONNECTION__STYLE:
				setStyle((String)newValue);
				return;
			case HardwarePackage.CONNECTION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case HardwarePackage.CONNECTION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case HardwarePackage.CONNECTION__MODIFIED:
				setModified((Date)newValue);
				return;
			case HardwarePackage.CONNECTION__MODIFIER:
				setModifier((String)newValue);
				return;
			case HardwarePackage.CONNECTION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case HardwarePackage.CONNECTION__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case HardwarePackage.CONNECTION__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case HardwarePackage.CONNECTION__TYPE:
				setType((ConnectionType)newValue);
				return;
			case HardwarePackage.CONNECTION__STARTING_POINTS:
				getStartingPoints().clear();
				getStartingPoints().addAll((Collection<? extends Io>)newValue);
				return;
			case HardwarePackage.CONNECTION__END_POINTS:
				getEndPoints().clear();
				getEndPoints().addAll((Collection<? extends Io>)newValue);
				return;
			case HardwarePackage.CONNECTION__MASTERS:
				getMasters().clear();
				getMasters().addAll((Collection<? extends Io>)newValue);
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
			case HardwarePackage.CONNECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case HardwarePackage.CONNECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HardwarePackage.CONNECTION__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case HardwarePackage.CONNECTION__ATTRIBUTES:
				getAttributes().clear();
				return;
			case HardwarePackage.CONNECTION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case HardwarePackage.CONNECTION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case HardwarePackage.CONNECTION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case HardwarePackage.CONNECTION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case HardwarePackage.CONNECTION__VARIANTS:
				getVariants().clear();
				return;
			case HardwarePackage.CONNECTION__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case HardwarePackage.CONNECTION__TYPE:
				setType((ConnectionType)null);
				return;
			case HardwarePackage.CONNECTION__STARTING_POINTS:
				getStartingPoints().clear();
				return;
			case HardwarePackage.CONNECTION__END_POINTS:
				getEndPoints().clear();
				return;
			case HardwarePackage.CONNECTION__MASTERS:
				getMasters().clear();
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
			case HardwarePackage.CONNECTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case HardwarePackage.CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HardwarePackage.CONNECTION__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case HardwarePackage.CONNECTION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case HardwarePackage.CONNECTION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case HardwarePackage.CONNECTION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case HardwarePackage.CONNECTION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case HardwarePackage.CONNECTION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case HardwarePackage.CONNECTION__VARIANTS:
				return variants != null && !variants.isEmpty();
			case HardwarePackage.CONNECTION__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case HardwarePackage.CONNECTION__TYPE:
				return type != null;
			case HardwarePackage.CONNECTION__STARTING_POINTS:
				return startingPoints != null && !startingPoints.isEmpty();
			case HardwarePackage.CONNECTION__END_POINTS:
				return endPoints != null && !endPoints.isEmpty();
			case HardwarePackage.CONNECTION__MASTERS:
				return masters != null && !masters.isEmpty();
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
				case HardwarePackage.CONNECTION__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case HardwarePackage.CONNECTION__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case HardwarePackage.CONNECTION__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case HardwarePackage.CONNECTION__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case HardwarePackage.CONNECTION__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case HardwarePackage.CONNECTION__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case HardwarePackage.CONNECTION__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case HardwarePackage.CONNECTION__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case HardwarePackage.CONNECTION__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case HardwarePackage.CONNECTION__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return HardwarePackage.CONNECTION__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return HardwarePackage.CONNECTION__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return HardwarePackage.CONNECTION__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return HardwarePackage.CONNECTION__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return HardwarePackage.CONNECTION__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return HardwarePackage.CONNECTION__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return HardwarePackage.CONNECTION__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return HardwarePackage.CONNECTION__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return HardwarePackage.CONNECTION__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return HardwarePackage.CONNECTION__OPERATION_MODES;
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

} //ConnectionImpl
