/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.BoolNot;
import de.oaam.model.oaam.common.BoolOperation;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.TaskInputTrigger;
import de.oaam.model.oaam.library.TaskOutputTrigger;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Task Output Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl#getFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl#isIsFixedRate <em>Is Fixed Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl#getBooleanOperations <em>Boolean Operations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl#getBooleanNots <em>Boolean Nots</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl#getTaskInputTriggers <em>Task Input Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskOutputTriggerImpl extends OaamBaseElementAImpl implements TaskOutputTrigger {
	/**
	 * The default value of the '{@link #getFixedRate() <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRate()
	 * @generated
	 * @ordered
	 */
	protected static final float FIXED_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFixedRate() <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRate()
	 * @generated
	 * @ordered
	 */
	protected float fixedRate = FIXED_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFixedRate() <em>Is Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFixedRate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FIXED_RATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFixedRate() <em>Is Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFixedRate()
	 * @generated
	 * @ordered
	 */
	protected boolean isFixedRate = IS_FIXED_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected BoolA condition;

	/**
	 * The cached value of the '{@link #getBooleanOperations() <em>Boolean Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<BoolOperation> booleanOperations;

	/**
	 * The cached value of the '{@link #getBooleanNots() <em>Boolean Nots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanNots()
	 * @generated
	 * @ordered
	 */
	protected EList<BoolNot> booleanNots;

	/**
	 * The cached value of the '{@link #getTaskInputTriggers() <em>Task Input Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskInputTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInputTrigger> taskInputTriggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskOutputTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.TASK_OUTPUT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFixedRate() {
		return fixedRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedRate(float newFixedRate) {
		float oldFixedRate = fixedRate;
		fixedRate = newFixedRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_OUTPUT_TRIGGER__FIXED_RATE, oldFixedRate, fixedRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFixedRate() {
		return isFixedRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFixedRate(boolean newIsFixedRate) {
		boolean oldIsFixedRate = isFixedRate;
		isFixedRate = newIsFixedRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_OUTPUT_TRIGGER__IS_FIXED_RATE, oldIsFixedRate, isFixedRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolA getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (BoolA)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.TASK_OUTPUT_TRIGGER__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolA basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(BoolA newCondition) {
		BoolA oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_OUTPUT_TRIGGER__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolOperation> getBooleanOperations() {
		if (booleanOperations == null) {
			booleanOperations = new EObjectContainmentEList<BoolOperation>(BoolOperation.class, this, LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_OPERATIONS);
		}
		return booleanOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolNot> getBooleanNots() {
		if (booleanNots == null) {
			booleanNots = new EObjectContainmentEList<BoolNot>(BoolNot.class, this, LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_NOTS);
		}
		return booleanNots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskInputTrigger> getTaskInputTriggers() {
		if (taskInputTriggers == null) {
			taskInputTriggers = new EObjectContainmentEList<TaskInputTrigger>(TaskInputTrigger.class, this, LibraryPackage.TASK_OUTPUT_TRIGGER__TASK_INPUT_TRIGGERS);
		}
		return taskInputTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_OPERATIONS:
				return ((InternalEList<?>)getBooleanOperations()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_NOTS:
				return ((InternalEList<?>)getBooleanNots()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TASK_OUTPUT_TRIGGER__TASK_INPUT_TRIGGERS:
				return ((InternalEList<?>)getTaskInputTriggers()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.TASK_OUTPUT_TRIGGER__FIXED_RATE:
				return getFixedRate();
			case LibraryPackage.TASK_OUTPUT_TRIGGER__IS_FIXED_RATE:
				return isIsFixedRate();
			case LibraryPackage.TASK_OUTPUT_TRIGGER__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_OPERATIONS:
				return getBooleanOperations();
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_NOTS:
				return getBooleanNots();
			case LibraryPackage.TASK_OUTPUT_TRIGGER__TASK_INPUT_TRIGGERS:
				return getTaskInputTriggers();
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
			case LibraryPackage.TASK_OUTPUT_TRIGGER__FIXED_RATE:
				setFixedRate((Float)newValue);
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__IS_FIXED_RATE:
				setIsFixedRate((Boolean)newValue);
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__CONDITION:
				setCondition((BoolA)newValue);
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_OPERATIONS:
				getBooleanOperations().clear();
				getBooleanOperations().addAll((Collection<? extends BoolOperation>)newValue);
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_NOTS:
				getBooleanNots().clear();
				getBooleanNots().addAll((Collection<? extends BoolNot>)newValue);
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__TASK_INPUT_TRIGGERS:
				getTaskInputTriggers().clear();
				getTaskInputTriggers().addAll((Collection<? extends TaskInputTrigger>)newValue);
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
			case LibraryPackage.TASK_OUTPUT_TRIGGER__FIXED_RATE:
				setFixedRate(FIXED_RATE_EDEFAULT);
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__IS_FIXED_RATE:
				setIsFixedRate(IS_FIXED_RATE_EDEFAULT);
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__CONDITION:
				setCondition((BoolA)null);
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_OPERATIONS:
				getBooleanOperations().clear();
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_NOTS:
				getBooleanNots().clear();
				return;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__TASK_INPUT_TRIGGERS:
				getTaskInputTriggers().clear();
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
			case LibraryPackage.TASK_OUTPUT_TRIGGER__FIXED_RATE:
				return fixedRate != FIXED_RATE_EDEFAULT;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__IS_FIXED_RATE:
				return isFixedRate != IS_FIXED_RATE_EDEFAULT;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__CONDITION:
				return condition != null;
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_OPERATIONS:
				return booleanOperations != null && !booleanOperations.isEmpty();
			case LibraryPackage.TASK_OUTPUT_TRIGGER__BOOLEAN_NOTS:
				return booleanNots != null && !booleanNots.isEmpty();
			case LibraryPackage.TASK_OUTPUT_TRIGGER__TASK_INPUT_TRIGGERS:
				return taskInputTriggers != null && !taskInputTriggers.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (fixedRate: ");
		result.append(fixedRate);
		result.append(", isFixedRate: ");
		result.append(isFixedRate);
		result.append(')');
		return result.toString();
	}

} //TaskOutputTriggerImpl
