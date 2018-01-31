/**
 */
package de.oaam.model.oaam.scenario.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.scenario.ParameterBool;
import de.oaam.model.oaam.scenario.ScenarioPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Bool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterBoolImpl extends ParameterAImpl implements ParameterBool {
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
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.PARAMETER_BOOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PARAMETER_BOOL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PARAMETER_BOOL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PARAMETER_BOOL__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, ScenarioPackage.PARAMETER_BOOL__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PARAMETER_BOOL__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PARAMETER_BOOL__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PARAMETER_BOOL__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PARAMETER_BOOL__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PARAMETER_BOOL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioPackage.PARAMETER_BOOL__ATTRIBUTES:
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
			case ScenarioPackage.PARAMETER_BOOL__ID:
				return getId();
			case ScenarioPackage.PARAMETER_BOOL__NAME:
				return getName();
			case ScenarioPackage.PARAMETER_BOOL__STYLE:
				return getStyle();
			case ScenarioPackage.PARAMETER_BOOL__ATTRIBUTES:
				return getAttributes();
			case ScenarioPackage.PARAMETER_BOOL__DOCUMENTATION:
				return getDocumentation();
			case ScenarioPackage.PARAMETER_BOOL__MODIFIED:
				return getModified();
			case ScenarioPackage.PARAMETER_BOOL__MODIFIER:
				return getModifier();
			case ScenarioPackage.PARAMETER_BOOL__TRACE_LINK:
				return getTraceLink();
			case ScenarioPackage.PARAMETER_BOOL__VALUE:
				return isValue();
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
			case ScenarioPackage.PARAMETER_BOOL__ID:
				setId((String)newValue);
				return;
			case ScenarioPackage.PARAMETER_BOOL__NAME:
				setName((String)newValue);
				return;
			case ScenarioPackage.PARAMETER_BOOL__STYLE:
				setStyle((String)newValue);
				return;
			case ScenarioPackage.PARAMETER_BOOL__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case ScenarioPackage.PARAMETER_BOOL__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case ScenarioPackage.PARAMETER_BOOL__MODIFIED:
				setModified((Date)newValue);
				return;
			case ScenarioPackage.PARAMETER_BOOL__MODIFIER:
				setModifier((String)newValue);
				return;
			case ScenarioPackage.PARAMETER_BOOL__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case ScenarioPackage.PARAMETER_BOOL__VALUE:
				setValue((Boolean)newValue);
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
			case ScenarioPackage.PARAMETER_BOOL__ID:
				setId(ID_EDEFAULT);
				return;
			case ScenarioPackage.PARAMETER_BOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScenarioPackage.PARAMETER_BOOL__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case ScenarioPackage.PARAMETER_BOOL__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ScenarioPackage.PARAMETER_BOOL__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case ScenarioPackage.PARAMETER_BOOL__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case ScenarioPackage.PARAMETER_BOOL__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case ScenarioPackage.PARAMETER_BOOL__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case ScenarioPackage.PARAMETER_BOOL__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ScenarioPackage.PARAMETER_BOOL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScenarioPackage.PARAMETER_BOOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScenarioPackage.PARAMETER_BOOL__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case ScenarioPackage.PARAMETER_BOOL__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ScenarioPackage.PARAMETER_BOOL__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case ScenarioPackage.PARAMETER_BOOL__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case ScenarioPackage.PARAMETER_BOOL__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case ScenarioPackage.PARAMETER_BOOL__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case ScenarioPackage.PARAMETER_BOOL__VALUE:
				return value != VALUE_EDEFAULT;
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
				case ScenarioPackage.PARAMETER_BOOL__ID: return CommonPackage.ELEMENT_A__ID;
				case ScenarioPackage.PARAMETER_BOOL__NAME: return CommonPackage.ELEMENT_A__NAME;
				case ScenarioPackage.PARAMETER_BOOL__STYLE: return CommonPackage.ELEMENT_A__STYLE;
				case ScenarioPackage.PARAMETER_BOOL__ATTRIBUTES: return CommonPackage.ELEMENT_A__ATTRIBUTES;
				case ScenarioPackage.PARAMETER_BOOL__DOCUMENTATION: return CommonPackage.ELEMENT_A__DOCUMENTATION;
				case ScenarioPackage.PARAMETER_BOOL__MODIFIED: return CommonPackage.ELEMENT_A__MODIFIED;
				case ScenarioPackage.PARAMETER_BOOL__MODIFIER: return CommonPackage.ELEMENT_A__MODIFIER;
				case ScenarioPackage.PARAMETER_BOOL__TRACE_LINK: return CommonPackage.ELEMENT_A__TRACE_LINK;
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
				case CommonPackage.ELEMENT_A__ID: return ScenarioPackage.PARAMETER_BOOL__ID;
				case CommonPackage.ELEMENT_A__NAME: return ScenarioPackage.PARAMETER_BOOL__NAME;
				case CommonPackage.ELEMENT_A__STYLE: return ScenarioPackage.PARAMETER_BOOL__STYLE;
				case CommonPackage.ELEMENT_A__ATTRIBUTES: return ScenarioPackage.PARAMETER_BOOL__ATTRIBUTES;
				case CommonPackage.ELEMENT_A__DOCUMENTATION: return ScenarioPackage.PARAMETER_BOOL__DOCUMENTATION;
				case CommonPackage.ELEMENT_A__MODIFIED: return ScenarioPackage.PARAMETER_BOOL__MODIFIED;
				case CommonPackage.ELEMENT_A__MODIFIER: return ScenarioPackage.PARAMETER_BOOL__MODIFIER;
				case CommonPackage.ELEMENT_A__TRACE_LINK: return ScenarioPackage.PARAMETER_BOOL__TRACE_LINK;
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ParameterBoolImpl
