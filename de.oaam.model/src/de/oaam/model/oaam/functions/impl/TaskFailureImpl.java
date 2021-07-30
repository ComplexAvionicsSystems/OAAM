/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.common.impl.BoolAImpl;

import de.oaam.model.oaam.functions.FunctionsPackage;
import de.oaam.model.oaam.functions.Task;
import de.oaam.model.oaam.functions.TaskFailure;

import de.oaam.model.oaam.safety.FunctionalFailureMode;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE;

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
 * An implementation of the model object '<em><b>Task Failure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getTask <em>Task</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getTaskState <em>Task State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getTaskFailureMode <em>Task Failure Mode</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskFailureImpl#getFailsWith <em>Fails With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskFailureImpl extends BoolAImpl implements TaskFailure {
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
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The default value of the '{@link #getTaskState() <em>Task State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskState()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityStateE TASK_STATE_EDEFAULT = IntegrityStateE.OK;

	/**
	 * The cached value of the '{@link #getTaskState() <em>Task State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskState()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStateE taskState = TASK_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskFailureMode() <em>Task Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskFailureMode()
	 * @generated
	 * @ordered
	 */
	protected FunctionalFailureMode taskFailureMode;

	/**
	 * The default value of the '{@link #getFailsWith() <em>Fails With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailsWith()
	 * @generated
	 * @ordered
	 */
	protected static final FailurePropagationGenericTypeE FAILS_WITH_EDEFAULT = FailurePropagationGenericTypeE.INTEGRITY_STATE;

	/**
	 * The cached value of the '{@link #getFailsWith() <em>Fails With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailsWith()
	 * @generated
	 * @ordered
	 */
	protected FailurePropagationGenericTypeE failsWith = FAILS_WITH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFailureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.TASK_FAILURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, FunctionsPackage.TASK_FAILURE__ATTRIBUTES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, FunctionsPackage.TASK_FAILURE__OPERATION_MODES);
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
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, FunctionsPackage.TASK_FAILURE__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.TASK_FAILURE__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateE getTaskState() {
		return taskState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskState(IntegrityStateE newTaskState) {
		IntegrityStateE oldTaskState = taskState;
		taskState = newTaskState == null ? TASK_STATE_EDEFAULT : newTaskState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__TASK_STATE, oldTaskState, taskState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode getTaskFailureMode() {
		if (taskFailureMode != null && taskFailureMode.eIsProxy()) {
			InternalEObject oldTaskFailureMode = (InternalEObject)taskFailureMode;
			taskFailureMode = (FunctionalFailureMode)eResolveProxy(oldTaskFailureMode);
			if (taskFailureMode != oldTaskFailureMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.TASK_FAILURE__TASK_FAILURE_MODE, oldTaskFailureMode, taskFailureMode));
			}
		}
		return taskFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureMode basicGetTaskFailureMode() {
		return taskFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskFailureMode(FunctionalFailureMode newTaskFailureMode) {
		FunctionalFailureMode oldTaskFailureMode = taskFailureMode;
		taskFailureMode = newTaskFailureMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__TASK_FAILURE_MODE, oldTaskFailureMode, taskFailureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationGenericTypeE getFailsWith() {
		return failsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailsWith(FailurePropagationGenericTypeE newFailsWith) {
		FailurePropagationGenericTypeE oldFailsWith = failsWith;
		failsWith = newFailsWith == null ? FAILS_WITH_EDEFAULT : newFailsWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK_FAILURE__FAILS_WITH, oldFailsWith, failsWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.TASK_FAILURE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.TASK_FAILURE__OPERATION_MODES:
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
			case FunctionsPackage.TASK_FAILURE__ID:
				return getId();
			case FunctionsPackage.TASK_FAILURE__NAME:
				return getName();
			case FunctionsPackage.TASK_FAILURE__STYLE:
				return getStyle();
			case FunctionsPackage.TASK_FAILURE__ATTRIBUTES:
				return getAttributes();
			case FunctionsPackage.TASK_FAILURE__DOCUMENTATION:
				return getDocumentation();
			case FunctionsPackage.TASK_FAILURE__MODIFIED:
				return getModified();
			case FunctionsPackage.TASK_FAILURE__MODIFIER:
				return getModifier();
			case FunctionsPackage.TASK_FAILURE__TRACE_LINK:
				return getTraceLink();
			case FunctionsPackage.TASK_FAILURE__OPERATION_MODES:
				return getOperationModes();
			case FunctionsPackage.TASK_FAILURE__VARIANTS:
				return getVariants();
			case FunctionsPackage.TASK_FAILURE__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case FunctionsPackage.TASK_FAILURE__TASK_STATE:
				return getTaskState();
			case FunctionsPackage.TASK_FAILURE__TASK_FAILURE_MODE:
				if (resolve) return getTaskFailureMode();
				return basicGetTaskFailureMode();
			case FunctionsPackage.TASK_FAILURE__FAILS_WITH:
				return getFailsWith();
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
			case FunctionsPackage.TASK_FAILURE__ID:
				setId((String)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__NAME:
				setName((String)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__STYLE:
				setStyle((String)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__MODIFIED:
				setModified((Date)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__MODIFIER:
				setModifier((String)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__TASK:
				setTask((Task)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__TASK_STATE:
				setTaskState((IntegrityStateE)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__TASK_FAILURE_MODE:
				setTaskFailureMode((FunctionalFailureMode)newValue);
				return;
			case FunctionsPackage.TASK_FAILURE__FAILS_WITH:
				setFailsWith((FailurePropagationGenericTypeE)newValue);
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
			case FunctionsPackage.TASK_FAILURE__ID:
				setId(ID_EDEFAULT);
				return;
			case FunctionsPackage.TASK_FAILURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FunctionsPackage.TASK_FAILURE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case FunctionsPackage.TASK_FAILURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FunctionsPackage.TASK_FAILURE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case FunctionsPackage.TASK_FAILURE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case FunctionsPackage.TASK_FAILURE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case FunctionsPackage.TASK_FAILURE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case FunctionsPackage.TASK_FAILURE__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case FunctionsPackage.TASK_FAILURE__VARIANTS:
				getVariants().clear();
				return;
			case FunctionsPackage.TASK_FAILURE__TASK:
				setTask((Task)null);
				return;
			case FunctionsPackage.TASK_FAILURE__TASK_STATE:
				setTaskState(TASK_STATE_EDEFAULT);
				return;
			case FunctionsPackage.TASK_FAILURE__TASK_FAILURE_MODE:
				setTaskFailureMode((FunctionalFailureMode)null);
				return;
			case FunctionsPackage.TASK_FAILURE__FAILS_WITH:
				setFailsWith(FAILS_WITH_EDEFAULT);
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
			case FunctionsPackage.TASK_FAILURE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FunctionsPackage.TASK_FAILURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FunctionsPackage.TASK_FAILURE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case FunctionsPackage.TASK_FAILURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FunctionsPackage.TASK_FAILURE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case FunctionsPackage.TASK_FAILURE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case FunctionsPackage.TASK_FAILURE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case FunctionsPackage.TASK_FAILURE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case FunctionsPackage.TASK_FAILURE__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case FunctionsPackage.TASK_FAILURE__VARIANTS:
				return variants != null && !variants.isEmpty();
			case FunctionsPackage.TASK_FAILURE__TASK:
				return task != null;
			case FunctionsPackage.TASK_FAILURE__TASK_STATE:
				return taskState != TASK_STATE_EDEFAULT;
			case FunctionsPackage.TASK_FAILURE__TASK_FAILURE_MODE:
				return taskFailureMode != null;
			case FunctionsPackage.TASK_FAILURE__FAILS_WITH:
				return failsWith != FAILS_WITH_EDEFAULT;
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
				case FunctionsPackage.TASK_FAILURE__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case FunctionsPackage.TASK_FAILURE__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case FunctionsPackage.TASK_FAILURE__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case FunctionsPackage.TASK_FAILURE__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case FunctionsPackage.TASK_FAILURE__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case FunctionsPackage.TASK_FAILURE__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case FunctionsPackage.TASK_FAILURE__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case FunctionsPackage.TASK_FAILURE__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.TASK_FAILURE__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.TASK_FAILURE__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
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
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return FunctionsPackage.TASK_FAILURE__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return FunctionsPackage.TASK_FAILURE__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return FunctionsPackage.TASK_FAILURE__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return FunctionsPackage.TASK_FAILURE__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return FunctionsPackage.TASK_FAILURE__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return FunctionsPackage.TASK_FAILURE__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return FunctionsPackage.TASK_FAILURE__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return FunctionsPackage.TASK_FAILURE__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return FunctionsPackage.TASK_FAILURE__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return FunctionsPackage.TASK_FAILURE__VARIANTS;
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
		result.append(", taskState: ");
		result.append(taskState);
		result.append(", failsWith: ");
		result.append(failsWith);
		result.append(')');
		return result.toString();
	}

} //TaskFailureImpl
