/**
 */
package de.oaam.model.oaam.safety.impl;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.BoolNot;
import de.oaam.model.oaam.common.BoolOperation;
import de.oaam.model.oaam.common.IntegrityStateE;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.TaskInputState;

import de.oaam.model.oaam.safety.FaultPropagation;
import de.oaam.model.oaam.safety.SafetyPackage;

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
 * An implementation of the model object '<em><b>Fault Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FaultPropagationImpl#getOutputState <em>Output State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FaultPropagationImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FaultPropagationImpl#getBooleanOperations <em>Boolean Operations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FaultPropagationImpl#getBooleanNots <em>Boolean Nots</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.impl.FaultPropagationImpl#getTaskInputStates <em>Task Input States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultPropagationImpl extends OaamBaseElementAImpl implements FaultPropagation {
	/**
	 * The default value of the '{@link #getOutputState() <em>Output State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputState()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityStateE OUTPUT_STATE_EDEFAULT = IntegrityStateE.OK;

	/**
	 * The cached value of the '{@link #getOutputState() <em>Output State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputState()
	 * @generated
	 * @ordered
	 */
	protected IntegrityStateE outputState = OUTPUT_STATE_EDEFAULT;

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
	 * The cached value of the '{@link #getTaskInputStates() <em>Task Input States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskInputStates()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInputState> taskInputStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultPropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyPackage.Literals.FAULT_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateE getOutputState() {
		return outputState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputState(IntegrityStateE newOutputState) {
		IntegrityStateE oldOutputState = outputState;
		outputState = newOutputState == null ? OUTPUT_STATE_EDEFAULT : newOutputState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.FAULT_PROPAGATION__OUTPUT_STATE, oldOutputState, outputState));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SafetyPackage.FAULT_PROPAGATION__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.FAULT_PROPAGATION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolOperation> getBooleanOperations() {
		if (booleanOperations == null) {
			booleanOperations = new EObjectContainmentEList<BoolOperation>(BoolOperation.class, this, SafetyPackage.FAULT_PROPAGATION__BOOLEAN_OPERATIONS);
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
			booleanNots = new EObjectContainmentEList<BoolNot>(BoolNot.class, this, SafetyPackage.FAULT_PROPAGATION__BOOLEAN_NOTS);
		}
		return booleanNots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskInputState> getTaskInputStates() {
		if (taskInputStates == null) {
			taskInputStates = new EObjectContainmentEList<TaskInputState>(TaskInputState.class, this, SafetyPackage.FAULT_PROPAGATION__TASK_INPUT_STATES);
		}
		return taskInputStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_OPERATIONS:
				return ((InternalEList<?>)getBooleanOperations()).basicRemove(otherEnd, msgs);
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_NOTS:
				return ((InternalEList<?>)getBooleanNots()).basicRemove(otherEnd, msgs);
			case SafetyPackage.FAULT_PROPAGATION__TASK_INPUT_STATES:
				return ((InternalEList<?>)getTaskInputStates()).basicRemove(otherEnd, msgs);
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
			case SafetyPackage.FAULT_PROPAGATION__OUTPUT_STATE:
				return getOutputState();
			case SafetyPackage.FAULT_PROPAGATION__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_OPERATIONS:
				return getBooleanOperations();
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_NOTS:
				return getBooleanNots();
			case SafetyPackage.FAULT_PROPAGATION__TASK_INPUT_STATES:
				return getTaskInputStates();
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
			case SafetyPackage.FAULT_PROPAGATION__OUTPUT_STATE:
				setOutputState((IntegrityStateE)newValue);
				return;
			case SafetyPackage.FAULT_PROPAGATION__CONDITION:
				setCondition((BoolA)newValue);
				return;
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_OPERATIONS:
				getBooleanOperations().clear();
				getBooleanOperations().addAll((Collection<? extends BoolOperation>)newValue);
				return;
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_NOTS:
				getBooleanNots().clear();
				getBooleanNots().addAll((Collection<? extends BoolNot>)newValue);
				return;
			case SafetyPackage.FAULT_PROPAGATION__TASK_INPUT_STATES:
				getTaskInputStates().clear();
				getTaskInputStates().addAll((Collection<? extends TaskInputState>)newValue);
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
			case SafetyPackage.FAULT_PROPAGATION__OUTPUT_STATE:
				setOutputState(OUTPUT_STATE_EDEFAULT);
				return;
			case SafetyPackage.FAULT_PROPAGATION__CONDITION:
				setCondition((BoolA)null);
				return;
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_OPERATIONS:
				getBooleanOperations().clear();
				return;
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_NOTS:
				getBooleanNots().clear();
				return;
			case SafetyPackage.FAULT_PROPAGATION__TASK_INPUT_STATES:
				getTaskInputStates().clear();
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
			case SafetyPackage.FAULT_PROPAGATION__OUTPUT_STATE:
				return outputState != OUTPUT_STATE_EDEFAULT;
			case SafetyPackage.FAULT_PROPAGATION__CONDITION:
				return condition != null;
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_OPERATIONS:
				return booleanOperations != null && !booleanOperations.isEmpty();
			case SafetyPackage.FAULT_PROPAGATION__BOOLEAN_NOTS:
				return booleanNots != null && !booleanNots.isEmpty();
			case SafetyPackage.FAULT_PROPAGATION__TASK_INPUT_STATES:
				return taskInputStates != null && !taskInputStates.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (outputState: ");
		result.append(outputState);
		result.append(')');
		return result.toString();
	}

} //FaultPropagationImpl
