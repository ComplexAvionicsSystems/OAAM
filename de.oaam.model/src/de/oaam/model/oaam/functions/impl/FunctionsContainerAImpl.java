/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.functions.ExternalTaskLink;
import de.oaam.model.oaam.functions.FailureCondition;
import de.oaam.model.oaam.functions.FunctionsContainerA;
import de.oaam.model.oaam.functions.FunctionsPackage;
import de.oaam.model.oaam.functions.Signal;
import de.oaam.model.oaam.functions.SignalGroup;
import de.oaam.model.oaam.functions.Subfunction;
import de.oaam.model.oaam.functions.Task;
import de.oaam.model.oaam.functions.TaskGroup;
import de.oaam.model.oaam.functions.TaskRedundancy;
import de.oaam.model.oaam.functions.TaskSymmetry;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import java.util.Collection;

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
 * An implementation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#isIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getTaskLinks <em>Task Links</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getTaskGroups <em>Task Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getTaskSymmetries <em>Task Symmetries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getTaskRedundancies <em>Task Redundancies</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getSignalGroups <em>Signal Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getFailureEvents <em>Failure Events</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl#getSubfunctions <em>Subfunctions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionsContainerAImpl extends ElementAImpl implements FunctionsContainerA {
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
	 * The default value of the '{@link #isIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ATOMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected boolean isAtomic = IS_ATOMIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getTaskLinks() <em>Task Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalTaskLink> taskLinks;

	/**
	 * The cached value of the '{@link #getTaskGroups() <em>Task Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskGroup> taskGroups;

	/**
	 * The cached value of the '{@link #getTaskSymmetries() <em>Task Symmetries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSymmetries()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskSymmetry> taskSymmetries;

	/**
	 * The cached value of the '{@link #getTaskRedundancies() <em>Task Redundancies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRedundancies()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskRedundancy> taskRedundancies;

	/**
	 * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signals;

	/**
	 * The cached value of the '{@link #getSignalGroups() <em>Signal Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalGroup> signalGroups;

	/**
	 * The cached value of the '{@link #getFailureEvents() <em>Failure Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureCondition> failureEvents;

	/**
	 * The cached value of the '{@link #getSubfunctions() <em>Subfunctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subfunction> subfunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionsContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAtomic() {
		return isAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtomic(boolean newIsAtomic) {
		boolean oldIsAtomic = isAtomic;
		isAtomic = newIsAtomic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTIONS_CONTAINER_A__IS_ATOMIC, oldIsAtomic, isAtomic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalTaskLink> getTaskLinks() {
		if (taskLinks == null) {
			taskLinks = new EObjectContainmentEList<ExternalTaskLink>(ExternalTaskLink.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_LINKS);
		}
		return taskLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskGroup> getTaskGroups() {
		if (taskGroups == null) {
			taskGroups = new EObjectContainmentEList<TaskGroup>(TaskGroup.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_GROUPS);
		}
		return taskGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskSymmetry> getTaskSymmetries() {
		if (taskSymmetries == null) {
			taskSymmetries = new EObjectContainmentEList<TaskSymmetry>(TaskSymmetry.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES);
		}
		return taskSymmetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskRedundancy> getTaskRedundancies() {
		if (taskRedundancies == null) {
			taskRedundancies = new EObjectContainmentEList<TaskRedundancy>(TaskRedundancy.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES);
		}
		return taskRedundancies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectContainmentEList<Signal>(Signal.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNALS);
		}
		return signals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalGroup> getSignalGroups() {
		if (signalGroups == null) {
			signalGroups = new EObjectContainmentEList<SignalGroup>(SignalGroup.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS);
		}
		return signalGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureCondition> getFailureEvents() {
		if (failureEvents == null) {
			failureEvents = new EObjectContainmentEList<FailureCondition>(FailureCondition.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__FAILURE_EVENTS);
		}
		return failureEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subfunction> getSubfunctions() {
		if (subfunctions == null) {
			subfunctions = new EObjectContainmentEList<Subfunction>(Subfunction.class, this, FunctionsPackage.FUNCTIONS_CONTAINER_A__SUBFUNCTIONS);
		}
		return subfunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_LINKS:
				return ((InternalEList<?>)getTaskLinks()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_GROUPS:
				return ((InternalEList<?>)getTaskGroups()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES:
				return ((InternalEList<?>)getTaskSymmetries()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES:
				return ((InternalEList<?>)getTaskRedundancies()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNALS:
				return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS:
				return ((InternalEList<?>)getSignalGroups()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__FAILURE_EVENTS:
				return ((InternalEList<?>)getFailureEvents()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SUBFUNCTIONS:
				return ((InternalEList<?>)getSubfunctions()).basicRemove(otherEnd, msgs);
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
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__VARIANTS:
				return getVariants();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__OPERATION_MODES:
				return getOperationModes();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__IS_ATOMIC:
				return isIsAtomic();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASKS:
				return getTasks();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_LINKS:
				return getTaskLinks();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_GROUPS:
				return getTaskGroups();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES:
				return getTaskSymmetries();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES:
				return getTaskRedundancies();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNALS:
				return getSignals();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS:
				return getSignalGroups();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__FAILURE_EVENTS:
				return getFailureEvents();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SUBFUNCTIONS:
				return getSubfunctions();
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
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__IS_ATOMIC:
				setIsAtomic((Boolean)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_LINKS:
				getTaskLinks().clear();
				getTaskLinks().addAll((Collection<? extends ExternalTaskLink>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_GROUPS:
				getTaskGroups().clear();
				getTaskGroups().addAll((Collection<? extends TaskGroup>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES:
				getTaskSymmetries().clear();
				getTaskSymmetries().addAll((Collection<? extends TaskSymmetry>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES:
				getTaskRedundancies().clear();
				getTaskRedundancies().addAll((Collection<? extends TaskRedundancy>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNALS:
				getSignals().clear();
				getSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS:
				getSignalGroups().clear();
				getSignalGroups().addAll((Collection<? extends SignalGroup>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__FAILURE_EVENTS:
				getFailureEvents().clear();
				getFailureEvents().addAll((Collection<? extends FailureCondition>)newValue);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SUBFUNCTIONS:
				getSubfunctions().clear();
				getSubfunctions().addAll((Collection<? extends Subfunction>)newValue);
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
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__VARIANTS:
				getVariants().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__IS_ATOMIC:
				setIsAtomic(IS_ATOMIC_EDEFAULT);
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASKS:
				getTasks().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_LINKS:
				getTaskLinks().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_GROUPS:
				getTaskGroups().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES:
				getTaskSymmetries().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES:
				getTaskRedundancies().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNALS:
				getSignals().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS:
				getSignalGroups().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__FAILURE_EVENTS:
				getFailureEvents().clear();
				return;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SUBFUNCTIONS:
				getSubfunctions().clear();
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
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__VARIANTS:
				return variants != null && !variants.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__IS_ATOMIC:
				return isAtomic != IS_ATOMIC_EDEFAULT;
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASKS:
				return tasks != null && !tasks.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_LINKS:
				return taskLinks != null && !taskLinks.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_GROUPS:
				return taskGroups != null && !taskGroups.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES:
				return taskSymmetries != null && !taskSymmetries.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES:
				return taskRedundancies != null && !taskRedundancies.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNALS:
				return signals != null && !signals.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS:
				return signalGroups != null && !signalGroups.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__FAILURE_EVENTS:
				return failureEvents != null && !failureEvents.isEmpty();
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SUBFUNCTIONS:
				return subfunctions != null && !subfunctions.isEmpty();
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
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.FUNCTIONS_CONTAINER_A__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.FUNCTIONS_CONTAINER_A__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return FunctionsPackage.FUNCTIONS_CONTAINER_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return FunctionsPackage.FUNCTIONS_CONTAINER_A__OPERATION_MODES;
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
		result.append(" (isAtomic: ");
		result.append(isAtomic);
		result.append(')');
		return result.toString();
	}

} //FunctionsContainerAImpl
