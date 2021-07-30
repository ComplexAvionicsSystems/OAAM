/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.InputDeclaration;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.OutputDeclaration;
import de.oaam.model.oaam.library.TaskParameterDeclaration;
import de.oaam.model.oaam.library.TaskStateDeclaration;
import de.oaam.model.oaam.library.TaskType;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagation;

import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement;

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
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getOutputDeclarations <em>Output Declarations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getInputDeclarations <em>Input Declarations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#isIsDeterministic <em>Is Deterministic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getPreferredExecutionRate <em>Preferred Execution Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getStateDeclarations <em>State Declarations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getTaskInternalRequirements <em>Task Internal Requirements</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeImpl#getFailurePropagation <em>Failure Propagation</em>}</li>
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
	 * The cached value of the '{@link #getOutputDeclarations() <em>Output Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputDeclaration> outputDeclarations;

	/**
	 * The cached value of the '{@link #getInputDeclarations() <em>Input Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<InputDeclaration> inputDeclarations;

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
	 * The cached value of the '{@link #getStateDeclarations() <em>State Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskStateDeclaration> stateDeclarations;

	/**
	 * The cached value of the '{@link #getParameterDeclarations() <em>Parameter Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskParameterDeclaration> parameterDeclarations;

	/**
	 * The cached value of the '{@link #getTaskInternalRequirements() <em>Task Internal Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskInternalRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInternalRequirement> taskInternalRequirements;

	/**
	 * The cached value of the '{@link #getFailurePropagation() <em>Failure Propagation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailurePropagation()
	 * @generated
	 * @ordered
	 */
	protected FailurePropagation failurePropagation;

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
	public EList<OutputDeclaration> getOutputDeclarations() {
		if (outputDeclarations == null) {
			outputDeclarations = new EObjectContainmentEList<OutputDeclaration>(OutputDeclaration.class, this, LibraryPackage.TASK_TYPE__OUTPUT_DECLARATIONS);
		}
		return outputDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputDeclaration> getInputDeclarations() {
		if (inputDeclarations == null) {
			inputDeclarations = new EObjectContainmentEList<InputDeclaration>(InputDeclaration.class, this, LibraryPackage.TASK_TYPE__INPUT_DECLARATIONS);
		}
		return inputDeclarations;
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
	public EList<TaskStateDeclaration> getStateDeclarations() {
		if (stateDeclarations == null) {
			stateDeclarations = new EObjectContainmentEList<TaskStateDeclaration>(TaskStateDeclaration.class, this, LibraryPackage.TASK_TYPE__STATE_DECLARATIONS);
		}
		return stateDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskParameterDeclaration> getParameterDeclarations() {
		if (parameterDeclarations == null) {
			parameterDeclarations = new EObjectContainmentEList<TaskParameterDeclaration>(TaskParameterDeclaration.class, this, LibraryPackage.TASK_TYPE__PARAMETER_DECLARATIONS);
		}
		return parameterDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskInternalRequirement> getTaskInternalRequirements() {
		if (taskInternalRequirements == null) {
			taskInternalRequirements = new EObjectContainmentEList<TaskInternalRequirement>(TaskInternalRequirement.class, this, LibraryPackage.TASK_TYPE__TASK_INTERNAL_REQUIREMENTS);
		}
		return taskInternalRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagation getFailurePropagation() {
		return failurePropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailurePropagation(FailurePropagation newFailurePropagation, NotificationChain msgs) {
		FailurePropagation oldFailurePropagation = failurePropagation;
		failurePropagation = newFailurePropagation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__FAILURE_PROPAGATION, oldFailurePropagation, newFailurePropagation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailurePropagation(FailurePropagation newFailurePropagation) {
		if (newFailurePropagation != failurePropagation) {
			NotificationChain msgs = null;
			if (failurePropagation != null)
				msgs = ((InternalEObject)failurePropagation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.TASK_TYPE__FAILURE_PROPAGATION, null, msgs);
			if (newFailurePropagation != null)
				msgs = ((InternalEObject)newFailurePropagation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.TASK_TYPE__FAILURE_PROPAGATION, null, msgs);
			msgs = basicSetFailurePropagation(newFailurePropagation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE__FAILURE_PROPAGATION, newFailurePropagation, newFailurePropagation));
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
			case LibraryPackage.TASK_TYPE__OUTPUT_DECLARATIONS:
				return ((InternalEList<?>)getOutputDeclarations()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_TYPE__INPUT_DECLARATIONS:
				return ((InternalEList<?>)getInputDeclarations()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_TYPE__STATE_DECLARATIONS:
				return ((InternalEList<?>)getStateDeclarations()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_TYPE__PARAMETER_DECLARATIONS:
				return ((InternalEList<?>)getParameterDeclarations()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_TYPE__TASK_INTERNAL_REQUIREMENTS:
				return ((InternalEList<?>)getTaskInternalRequirements()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_TYPE__FAILURE_PROPAGATION:
				return basicSetFailurePropagation(null, msgs);
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
			case LibraryPackage.TASK_TYPE__OUTPUT_DECLARATIONS:
				return getOutputDeclarations();
			case LibraryPackage.TASK_TYPE__INPUT_DECLARATIONS:
				return getInputDeclarations();
			case LibraryPackage.TASK_TYPE__IS_DETERMINISTIC:
				return isIsDeterministic();
			case LibraryPackage.TASK_TYPE__PREFERRED_EXECUTION_RATE:
				return getPreferredExecutionRate();
			case LibraryPackage.TASK_TYPE__STATE_DECLARATIONS:
				return getStateDeclarations();
			case LibraryPackage.TASK_TYPE__PARAMETER_DECLARATIONS:
				return getParameterDeclarations();
			case LibraryPackage.TASK_TYPE__TASK_INTERNAL_REQUIREMENTS:
				return getTaskInternalRequirements();
			case LibraryPackage.TASK_TYPE__FAILURE_PROPAGATION:
				return getFailurePropagation();
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
			case LibraryPackage.TASK_TYPE__OUTPUT_DECLARATIONS:
				getOutputDeclarations().clear();
				getOutputDeclarations().addAll((Collection<? extends OutputDeclaration>)newValue);
				return;
			case LibraryPackage.TASK_TYPE__INPUT_DECLARATIONS:
				getInputDeclarations().clear();
				getInputDeclarations().addAll((Collection<? extends InputDeclaration>)newValue);
				return;
			case LibraryPackage.TASK_TYPE__IS_DETERMINISTIC:
				setIsDeterministic((Boolean)newValue);
				return;
			case LibraryPackage.TASK_TYPE__PREFERRED_EXECUTION_RATE:
				setPreferredExecutionRate((Float)newValue);
				return;
			case LibraryPackage.TASK_TYPE__STATE_DECLARATIONS:
				getStateDeclarations().clear();
				getStateDeclarations().addAll((Collection<? extends TaskStateDeclaration>)newValue);
				return;
			case LibraryPackage.TASK_TYPE__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
				getParameterDeclarations().addAll((Collection<? extends TaskParameterDeclaration>)newValue);
				return;
			case LibraryPackage.TASK_TYPE__TASK_INTERNAL_REQUIREMENTS:
				getTaskInternalRequirements().clear();
				getTaskInternalRequirements().addAll((Collection<? extends TaskInternalRequirement>)newValue);
				return;
			case LibraryPackage.TASK_TYPE__FAILURE_PROPAGATION:
				setFailurePropagation((FailurePropagation)newValue);
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
			case LibraryPackage.TASK_TYPE__OUTPUT_DECLARATIONS:
				getOutputDeclarations().clear();
				return;
			case LibraryPackage.TASK_TYPE__INPUT_DECLARATIONS:
				getInputDeclarations().clear();
				return;
			case LibraryPackage.TASK_TYPE__IS_DETERMINISTIC:
				setIsDeterministic(IS_DETERMINISTIC_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__PREFERRED_EXECUTION_RATE:
				setPreferredExecutionRate(PREFERRED_EXECUTION_RATE_EDEFAULT);
				return;
			case LibraryPackage.TASK_TYPE__STATE_DECLARATIONS:
				getStateDeclarations().clear();
				return;
			case LibraryPackage.TASK_TYPE__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
				return;
			case LibraryPackage.TASK_TYPE__TASK_INTERNAL_REQUIREMENTS:
				getTaskInternalRequirements().clear();
				return;
			case LibraryPackage.TASK_TYPE__FAILURE_PROPAGATION:
				setFailurePropagation((FailurePropagation)null);
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
			case LibraryPackage.TASK_TYPE__OUTPUT_DECLARATIONS:
				return outputDeclarations != null && !outputDeclarations.isEmpty();
			case LibraryPackage.TASK_TYPE__INPUT_DECLARATIONS:
				return inputDeclarations != null && !inputDeclarations.isEmpty();
			case LibraryPackage.TASK_TYPE__IS_DETERMINISTIC:
				return isDeterministic != IS_DETERMINISTIC_EDEFAULT;
			case LibraryPackage.TASK_TYPE__PREFERRED_EXECUTION_RATE:
				return preferredExecutionRate != PREFERRED_EXECUTION_RATE_EDEFAULT;
			case LibraryPackage.TASK_TYPE__STATE_DECLARATIONS:
				return stateDeclarations != null && !stateDeclarations.isEmpty();
			case LibraryPackage.TASK_TYPE__PARAMETER_DECLARATIONS:
				return parameterDeclarations != null && !parameterDeclarations.isEmpty();
			case LibraryPackage.TASK_TYPE__TASK_INTERNAL_REQUIREMENTS:
				return taskInternalRequirements != null && !taskInternalRequirements.isEmpty();
			case LibraryPackage.TASK_TYPE__FAILURE_PROPAGATION:
				return failurePropagation != null;
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
				case LibraryPackage.TASK_TYPE__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case LibraryPackage.TASK_TYPE__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case LibraryPackage.TASK_TYPE__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case LibraryPackage.TASK_TYPE__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case LibraryPackage.TASK_TYPE__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case LibraryPackage.TASK_TYPE__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case LibraryPackage.TASK_TYPE__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case LibraryPackage.TASK_TYPE__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
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
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return LibraryPackage.TASK_TYPE__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return LibraryPackage.TASK_TYPE__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return LibraryPackage.TASK_TYPE__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return LibraryPackage.TASK_TYPE__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return LibraryPackage.TASK_TYPE__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return LibraryPackage.TASK_TYPE__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return LibraryPackage.TASK_TYPE__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return LibraryPackage.TASK_TYPE__TRACE_LINK;
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
		result.append(", isDeterministic: ");
		result.append(isDeterministic);
		result.append(", preferredExecutionRate: ");
		result.append(preferredExecutionRate);
		result.append(')');
		return result.toString();
	}

} //TaskTypeImpl
