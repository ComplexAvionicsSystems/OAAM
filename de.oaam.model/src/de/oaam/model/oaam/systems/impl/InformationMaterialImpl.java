/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import de.oaam.model.oaam.systems.InformationMaterial;
import de.oaam.model.oaam.systems.RequiredInformationA;
import de.oaam.model.oaam.systems.SystemsPackage;

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
 * An implementation of the model object '<em><b>Information Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getDensity <em>Density</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationMaterialImpl extends ProvidedInformationAImpl implements InformationMaterial {
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
	 * The cached value of the '{@link #getOperationModes() <em>Operation Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationModes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationModeReference> operationModes;

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
	 * The default value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected static final double DENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected double density = DENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected double velocity = VELOCITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemsPackage.Literals.INFORMATION_MATERIAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INFORMATION_MATERIAL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INFORMATION_MATERIAL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INFORMATION_MATERIAL__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, SystemsPackage.INFORMATION_MATERIAL__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INFORMATION_MATERIAL__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INFORMATION_MATERIAL__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INFORMATION_MATERIAL__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INFORMATION_MATERIAL__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, SystemsPackage.INFORMATION_MATERIAL__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, SystemsPackage.INFORMATION_MATERIAL__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDensity() {
		return density;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDensity(double newDensity) {
		double oldDensity = density;
		density = newDensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INFORMATION_MATERIAL__DENSITY, oldDensity, density));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(double newVelocity) {
		double oldVelocity = velocity;
		velocity = newVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INFORMATION_MATERIAL__VELOCITY, oldVelocity, velocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemsPackage.INFORMATION_MATERIAL__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SystemsPackage.INFORMATION_MATERIAL__OPERATION_MODES:
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
			case SystemsPackage.INFORMATION_MATERIAL__ID:
				return getId();
			case SystemsPackage.INFORMATION_MATERIAL__NAME:
				return getName();
			case SystemsPackage.INFORMATION_MATERIAL__STYLE:
				return getStyle();
			case SystemsPackage.INFORMATION_MATERIAL__ATTRIBUTES:
				return getAttributes();
			case SystemsPackage.INFORMATION_MATERIAL__DOCUMENTATION:
				return getDocumentation();
			case SystemsPackage.INFORMATION_MATERIAL__MODIFIED:
				return getModified();
			case SystemsPackage.INFORMATION_MATERIAL__MODIFIER:
				return getModifier();
			case SystemsPackage.INFORMATION_MATERIAL__TRACE_LINK:
				return getTraceLink();
			case SystemsPackage.INFORMATION_MATERIAL__OPERATION_MODES:
				return getOperationModes();
			case SystemsPackage.INFORMATION_MATERIAL__VARIANTS:
				return getVariants();
			case SystemsPackage.INFORMATION_MATERIAL__DENSITY:
				return getDensity();
			case SystemsPackage.INFORMATION_MATERIAL__VELOCITY:
				return getVelocity();
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
			case SystemsPackage.INFORMATION_MATERIAL__ID:
				setId((String)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__NAME:
				setName((String)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__STYLE:
				setStyle((String)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__MODIFIED:
				setModified((Date)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__MODIFIER:
				setModifier((String)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__DENSITY:
				setDensity((Double)newValue);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__VELOCITY:
				setVelocity((Double)newValue);
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
			case SystemsPackage.INFORMATION_MATERIAL__ID:
				setId(ID_EDEFAULT);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SystemsPackage.INFORMATION_MATERIAL__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case SystemsPackage.INFORMATION_MATERIAL__VARIANTS:
				getVariants().clear();
				return;
			case SystemsPackage.INFORMATION_MATERIAL__DENSITY:
				setDensity(DENSITY_EDEFAULT);
				return;
			case SystemsPackage.INFORMATION_MATERIAL__VELOCITY:
				setVelocity(VELOCITY_EDEFAULT);
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
			case SystemsPackage.INFORMATION_MATERIAL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SystemsPackage.INFORMATION_MATERIAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SystemsPackage.INFORMATION_MATERIAL__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case SystemsPackage.INFORMATION_MATERIAL__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SystemsPackage.INFORMATION_MATERIAL__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case SystemsPackage.INFORMATION_MATERIAL__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case SystemsPackage.INFORMATION_MATERIAL__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case SystemsPackage.INFORMATION_MATERIAL__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case SystemsPackage.INFORMATION_MATERIAL__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case SystemsPackage.INFORMATION_MATERIAL__VARIANTS:
				return variants != null && !variants.isEmpty();
			case SystemsPackage.INFORMATION_MATERIAL__DENSITY:
				return density != DENSITY_EDEFAULT;
			case SystemsPackage.INFORMATION_MATERIAL__VELOCITY:
				return velocity != VELOCITY_EDEFAULT;
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
		if (baseClass == RequiredInformationA.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == OaamBaseElementA.class) {
			switch (derivedFeatureID) {
				case SystemsPackage.INFORMATION_MATERIAL__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case SystemsPackage.INFORMATION_MATERIAL__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case SystemsPackage.INFORMATION_MATERIAL__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case SystemsPackage.INFORMATION_MATERIAL__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case SystemsPackage.INFORMATION_MATERIAL__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case SystemsPackage.INFORMATION_MATERIAL__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case SystemsPackage.INFORMATION_MATERIAL__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case SystemsPackage.INFORMATION_MATERIAL__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case SystemsPackage.INFORMATION_MATERIAL__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case SystemsPackage.INFORMATION_MATERIAL__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
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
		if (baseClass == RequiredInformationA.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == OaamBaseElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return SystemsPackage.INFORMATION_MATERIAL__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return SystemsPackage.INFORMATION_MATERIAL__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return SystemsPackage.INFORMATION_MATERIAL__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return SystemsPackage.INFORMATION_MATERIAL__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return SystemsPackage.INFORMATION_MATERIAL__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return SystemsPackage.INFORMATION_MATERIAL__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return SystemsPackage.INFORMATION_MATERIAL__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return SystemsPackage.INFORMATION_MATERIAL__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return SystemsPackage.INFORMATION_MATERIAL__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return SystemsPackage.INFORMATION_MATERIAL__VARIANTS;
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
		result.append(", density: ");
		result.append(density);
		result.append(", velocity: ");
		result.append(velocity);
		result.append(')');
		return result.toString();
	}

} //InformationMaterialImpl
