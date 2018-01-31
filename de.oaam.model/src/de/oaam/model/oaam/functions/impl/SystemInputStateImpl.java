/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.common.IntegretyStateE;
import de.oaam.model.oaam.common.impl.BoolAImpl;

import de.oaam.model.oaam.functions.FunctionsPackage;
import de.oaam.model.oaam.functions.Output;
import de.oaam.model.oaam.functions.SystemInputState;

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
 * An implementation of the model object '<em><b>System Input State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getState <em>State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemInputStateImpl extends BoolAImpl implements SystemInputState {
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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final IntegretyStateE STATE_EDEFAULT = IntegretyStateE.OK;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected IntegretyStateE state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInputStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SYSTEM_INPUT_STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SYSTEM_INPUT_STATE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SYSTEM_INPUT_STATE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SYSTEM_INPUT_STATE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, FunctionsPackage.SYSTEM_INPUT_STATE__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SYSTEM_INPUT_STATE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SYSTEM_INPUT_STATE__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, FunctionsPackage.SYSTEM_INPUT_STATE__OPERATION_MODES);
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
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, FunctionsPackage.SYSTEM_INPUT_STATE__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegretyStateE getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(IntegretyStateE newState) {
		IntegretyStateE oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SYSTEM_INPUT_STATE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (Output)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.SYSTEM_INPUT_STATE__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Output newOutput) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SYSTEM_INPUT_STATE__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.SYSTEM_INPUT_STATE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.SYSTEM_INPUT_STATE__OPERATION_MODES:
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
			case FunctionsPackage.SYSTEM_INPUT_STATE__ID:
				return getId();
			case FunctionsPackage.SYSTEM_INPUT_STATE__NAME:
				return getName();
			case FunctionsPackage.SYSTEM_INPUT_STATE__STYLE:
				return getStyle();
			case FunctionsPackage.SYSTEM_INPUT_STATE__ATTRIBUTES:
				return getAttributes();
			case FunctionsPackage.SYSTEM_INPUT_STATE__DOCUMENTATION:
				return getDocumentation();
			case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIED:
				return getModified();
			case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIER:
				return getModifier();
			case FunctionsPackage.SYSTEM_INPUT_STATE__TRACE_LINK:
				return getTraceLink();
			case FunctionsPackage.SYSTEM_INPUT_STATE__OPERATION_MODES:
				return getOperationModes();
			case FunctionsPackage.SYSTEM_INPUT_STATE__VARIANTS:
				return getVariants();
			case FunctionsPackage.SYSTEM_INPUT_STATE__STATE:
				return getState();
			case FunctionsPackage.SYSTEM_INPUT_STATE__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
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
			case FunctionsPackage.SYSTEM_INPUT_STATE__ID:
				setId((String)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__NAME:
				setName((String)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__STYLE:
				setStyle((String)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIED:
				setModified((Date)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIER:
				setModifier((String)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__STATE:
				setState((IntegretyStateE)newValue);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__OUTPUT:
				setOutput((Output)newValue);
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
			case FunctionsPackage.SYSTEM_INPUT_STATE__ID:
				setId(ID_EDEFAULT);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__VARIANTS:
				getVariants().clear();
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case FunctionsPackage.SYSTEM_INPUT_STATE__OUTPUT:
				setOutput((Output)null);
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
			case FunctionsPackage.SYSTEM_INPUT_STATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FunctionsPackage.SYSTEM_INPUT_STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FunctionsPackage.SYSTEM_INPUT_STATE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case FunctionsPackage.SYSTEM_INPUT_STATE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FunctionsPackage.SYSTEM_INPUT_STATE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case FunctionsPackage.SYSTEM_INPUT_STATE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case FunctionsPackage.SYSTEM_INPUT_STATE__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case FunctionsPackage.SYSTEM_INPUT_STATE__VARIANTS:
				return variants != null && !variants.isEmpty();
			case FunctionsPackage.SYSTEM_INPUT_STATE__STATE:
				return state != STATE_EDEFAULT;
			case FunctionsPackage.SYSTEM_INPUT_STATE__OUTPUT:
				return output != null;
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
				case FunctionsPackage.SYSTEM_INPUT_STATE__ID: return CommonPackage.ELEMENT_A__ID;
				case FunctionsPackage.SYSTEM_INPUT_STATE__NAME: return CommonPackage.ELEMENT_A__NAME;
				case FunctionsPackage.SYSTEM_INPUT_STATE__STYLE: return CommonPackage.ELEMENT_A__STYLE;
				case FunctionsPackage.SYSTEM_INPUT_STATE__ATTRIBUTES: return CommonPackage.ELEMENT_A__ATTRIBUTES;
				case FunctionsPackage.SYSTEM_INPUT_STATE__DOCUMENTATION: return CommonPackage.ELEMENT_A__DOCUMENTATION;
				case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIED: return CommonPackage.ELEMENT_A__MODIFIED;
				case FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIER: return CommonPackage.ELEMENT_A__MODIFIER;
				case FunctionsPackage.SYSTEM_INPUT_STATE__TRACE_LINK: return CommonPackage.ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.SYSTEM_INPUT_STATE__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.SYSTEM_INPUT_STATE__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
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
				case CommonPackage.ELEMENT_A__ID: return FunctionsPackage.SYSTEM_INPUT_STATE__ID;
				case CommonPackage.ELEMENT_A__NAME: return FunctionsPackage.SYSTEM_INPUT_STATE__NAME;
				case CommonPackage.ELEMENT_A__STYLE: return FunctionsPackage.SYSTEM_INPUT_STATE__STYLE;
				case CommonPackage.ELEMENT_A__ATTRIBUTES: return FunctionsPackage.SYSTEM_INPUT_STATE__ATTRIBUTES;
				case CommonPackage.ELEMENT_A__DOCUMENTATION: return FunctionsPackage.SYSTEM_INPUT_STATE__DOCUMENTATION;
				case CommonPackage.ELEMENT_A__MODIFIED: return FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIED;
				case CommonPackage.ELEMENT_A__MODIFIER: return FunctionsPackage.SYSTEM_INPUT_STATE__MODIFIER;
				case CommonPackage.ELEMENT_A__TRACE_LINK: return FunctionsPackage.SYSTEM_INPUT_STATE__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return FunctionsPackage.SYSTEM_INPUT_STATE__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return FunctionsPackage.SYSTEM_INPUT_STATE__VARIANTS;
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
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //SystemInputStateImpl
