/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.library.InputDeclaration;
import de.oaam.model.oaam.library.InternalStateDefinition;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.OutputDeclaration;
import de.oaam.model.oaam.library.ParameterDefinition;
import de.oaam.model.oaam.library.TaskType;

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
 * An implementation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#isIsDeterministic <em>Is Deterministic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getPreferredExecutionRate <em>Preferred Execution Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getInternalStates <em>Internal States</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskTypeImpl extends ResourceConsumerAImpl implements TaskType {
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
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputDeclaration> outputs;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputDeclaration> inputs;

	/**
	 * The default value of the '{@link #isIsDeterministic() <em>Is Deterministic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeterministic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DETERMINISTIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDeterministic() <em>Is Deterministic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeterministic()
	 * @generated
	 * @ordered
	 */
	protected boolean isDeterministic = IS_DETERMINISTIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredExecutionRate() <em>Preferred Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredExecutionRate()
	 * @generated
	 * @ordered
	 */
	protected static final float PREFERRED_EXECUTION_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPreferredExecutionRate() <em>Preferred Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredExecutionRate()
	 * @generated
	 * @ordered
	 */
	protected float preferredExecutionRate = PREFERRED_EXECUTION_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalStates() <em>Internal States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalStates()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalStateDefinition> internalStates;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDefinition> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.TASK_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, LibraryPackage.TASK_TYPE__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputDeclaration> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputDeclaration>(OutputDeclaration.class, this, LibraryPackage.TASK_TYPE__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputDeclaration> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputDeclaration>(InputDeclaration.class, this, LibraryPackage.TASK_TYPE__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDeterministic() {
		return isDeterministic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeterministic(boolean newIsDeterministic) {
		boolean oldIsDeterministic = isDeterministic;
		isDeterministic = newIsDeterministic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__IS_DETERMINISTIC, oldIsDeterministic, isDeterministic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPreferredExecutionRate() {
		return preferredExecutionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredExecutionRate(float newPreferredExecutionRate) {
		float oldPreferredExecutionRate = preferredExecutionRate;
		preferredExecutionRate = newPreferredExecutionRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__PREFERRED_EXECUTION_RATE, oldPreferredExecutionRate, preferredExecutionRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalStateDefinition> getInternalStates() {
		if (internalStates == null) {
			internalStates = new EObjectContainmentEList<InternalStateDefinition>(InternalStateDefinition.class, this, LibraryPackage.TASK_TYPE__INTERNAL_STATES);
		}
		return internalStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDefinition> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ParameterDefinition>(ParameterDefinition.class, this, LibraryPackage.TASK_TYPE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.TASK_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_TYPE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_TYPE__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_TYPE__INTERNAL_STATES:
				return ((InternalEList<?>)getInternalStates()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_TYPE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.TASK_TYPE__ID:
				return getId();
			case LibraryPackage.TASK_TYPE__NAME:
				return getName();
			case LibraryPackage.TASK_TYPE__STYLE:
				return getStyle();
			case LibraryPackage.TASK_TYPE__ATTRIBUTES:
				return getAttributes();
			case LibraryPackage.TASK_TYPE__DOCUMENTATION:
				return getDocumentation();
			case LibraryPackage.TASK_TYPE__MODIFIED:
				return getModified();
			case LibraryPackage.TASK_TYPE__MODIFIER:
				return getModifier();
			case LibraryPackage.TASK_TYPE__TRACE_LINK:
				return getTraceLink();
			case LibraryPackage.TASK_TYPE__OUTPUTS:
				return getOutputs();
			case LibraryPackage.TASK_TYPE__INPUTS:
				return getInputs();
			case LibraryPackage.TASK_TYPE__IS_DETERMINISTIC:
				return isIsDeterministic();
			case LibraryPackage.TASK_TYPE__PREFERRED_EXECUTION_RATE:
				return getPreferredExecutionRate();
			case LibraryPackage.TASK_TYPE__INTERNAL_STATES:
				return getInternalStates();
			case LibraryPackage.TASK_TYPE__PARAMETERS:
				return getParameters();
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
			case LibraryPackage.TASK_TYPE__ID:
				setId((String)newValue);
				return;
			case LibraryPackage.TASK_TYPE__NAME:
				setName((String)newValue);
				return;
			case LibraryPackage.TASK_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case LibraryPackage.TASK_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case LibraryPackage.TASK_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case LibraryPackage.TASK_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case LibraryPackage.TASK_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case LibraryPackage.TASK_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case LibraryPackage.TASK_TYPE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputDeclaration>)newValue);
				return;
			case LibraryPackage.TASK_TYPE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputDeclaration>)newValue);
				return;
			case LibraryPackage.TASK_TYPE__IS_DETERMINISTIC:
				setIsDeterministic((Boolean)newValue);
				return;
			case LibraryPackage.TASK_TYPE__PREFERRED_EXECUTION_RATE:
				setPreferredExecutionRate((Float)newValue);
				return;
			case LibraryPackage.TASK_TYPE__INTERNAL_STATES:
				getInternalStates().clear();
				getInternalStates().addAll((Collection<? extends InternalStateDefinition>)newValue);
				return;
			case LibraryPackage.TASK_TYPE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ParameterDefinition>)newValue);
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
			case LibraryPackage.TASK_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case LibraryPackage.TASK_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__OUTPUTS:
				getOutputs().clear();
				return;
			case LibraryPackage.TASK_TYPE__INPUTS:
				getInputs().clear();
				return;
			case LibraryPackage.TASK_TYPE__IS_DETERMINISTIC:
				setIsDeterministic(IS_DETERMINISTIC_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__PREFERRED_EXECUTION_RATE:
				setPreferredExecutionRate(PREFERRED_EXECUTION_RATE_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__INTERNAL_STATES:
				getInternalStates().clear();
				return;
			case LibraryPackage.TASK_TYPE__PARAMETERS:
				getParameters().clear();
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
			case LibraryPackage.TASK_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LibraryPackage.TASK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibraryPackage.TASK_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case LibraryPackage.TASK_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case LibraryPackage.TASK_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case LibraryPackage.TASK_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case LibraryPackage.TASK_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case LibraryPackage.TASK_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case LibraryPackage.TASK_TYPE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case LibraryPackage.TASK_TYPE__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case LibraryPackage.TASK_TYPE__IS_DETERMINISTIC:
				return isDeterministic != IS_DETERMINISTIC_EDEFAULT;
			case LibraryPackage.TASK_TYPE__PREFERRED_EXECUTION_RATE:
				return preferredExecutionRate != PREFERRED_EXECUTION_RATE_EDEFAULT;
			case LibraryPackage.TASK_TYPE__INTERNAL_STATES:
				return internalStates != null && !internalStates.isEmpty();
			case LibraryPackage.TASK_TYPE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
				case LibraryPackage.TASK_TYPE__ID: return CommonPackage.ELEMENT_A__ID;
				case LibraryPackage.TASK_TYPE__NAME: return CommonPackage.ELEMENT_A__NAME;
				case LibraryPackage.TASK_TYPE__STYLE: return CommonPackage.ELEMENT_A__STYLE;
				case LibraryPackage.TASK_TYPE__ATTRIBUTES: return CommonPackage.ELEMENT_A__ATTRIBUTES;
				case LibraryPackage.TASK_TYPE__DOCUMENTATION: return CommonPackage.ELEMENT_A__DOCUMENTATION;
				case LibraryPackage.TASK_TYPE__MODIFIED: return CommonPackage.ELEMENT_A__MODIFIED;
				case LibraryPackage.TASK_TYPE__MODIFIER: return CommonPackage.ELEMENT_A__MODIFIER;
				case LibraryPackage.TASK_TYPE__TRACE_LINK: return CommonPackage.ELEMENT_A__TRACE_LINK;
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
				case CommonPackage.ELEMENT_A__ID: return LibraryPackage.TASK_TYPE__ID;
				case CommonPackage.ELEMENT_A__NAME: return LibraryPackage.TASK_TYPE__NAME;
				case CommonPackage.ELEMENT_A__STYLE: return LibraryPackage.TASK_TYPE__STYLE;
				case CommonPackage.ELEMENT_A__ATTRIBUTES: return LibraryPackage.TASK_TYPE__ATTRIBUTES;
				case CommonPackage.ELEMENT_A__DOCUMENTATION: return LibraryPackage.TASK_TYPE__DOCUMENTATION;
				case CommonPackage.ELEMENT_A__MODIFIED: return LibraryPackage.TASK_TYPE__MODIFIED;
				case CommonPackage.ELEMENT_A__MODIFIER: return LibraryPackage.TASK_TYPE__MODIFIER;
				case CommonPackage.ELEMENT_A__TRACE_LINK: return LibraryPackage.TASK_TYPE__TRACE_LINK;
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
		result.append(", isDeterministic: ");
		result.append(isDeterministic);
		result.append(", preferredExecutionRate: ");
		result.append(preferredExecutionRate);
		result.append(')');
		return result.toString();
	}

} //TaskTypeImpl
