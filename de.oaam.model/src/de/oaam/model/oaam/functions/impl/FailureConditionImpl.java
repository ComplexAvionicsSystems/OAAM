/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.common.BoolA;

import de.oaam.model.oaam.common.BoolNot;
import de.oaam.model.oaam.common.BoolOperation;
import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.functions.FailureCondition;
import de.oaam.model.oaam.functions.FunctionsPackage;

import de.oaam.model.oaam.functions.OutputIntegrityState;
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
 * An implementation of the model object '<em><b>Failure Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#getMaxOccurrenceProbability <em>Max Occurrence Probability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#isNoSingleFailure <em>No Single Failure</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#getBooleanOperations <em>Boolean Operations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#getBooleanNots <em>Boolean Nots</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#getOutputIntegrityStates <em>Output Integrity States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureConditionImpl extends OaamBaseElementAImpl implements FailureCondition {
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
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected BoolA condition;

	/**
	 * The default value of the '{@link #getMaxOccurrenceProbability() <em>Max Occurrence Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurrenceProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_OCCURRENCE_PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxOccurrenceProbability() <em>Max Occurrence Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurrenceProbability()
	 * @generated
	 * @ordered
	 */
	protected double maxOccurrenceProbability = MAX_OCCURRENCE_PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoSingleFailure() <em>No Single Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSingleFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SINGLE_FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoSingleFailure() <em>No Single Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSingleFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean noSingleFailure = NO_SINGLE_FAILURE_EDEFAULT;

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
	 * The cached value of the '{@link #getOutputIntegrityStates() <em>Output Integrity States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputIntegrityStates()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputIntegrityState> outputIntegrityStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.FAILURE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES);
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
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, FunctionsPackage.FAILURE_CONDITION__VARIANTS);
		}
		return variants;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.FAILURE_CONDITION__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FAILURE_CONDITION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxOccurrenceProbability() {
		return maxOccurrenceProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOccurrenceProbability(double newMaxOccurrenceProbability) {
		double oldMaxOccurrenceProbability = maxOccurrenceProbability;
		maxOccurrenceProbability = newMaxOccurrenceProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_PROBABILITY, oldMaxOccurrenceProbability, maxOccurrenceProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoSingleFailure() {
		return noSingleFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoSingleFailure(boolean newNoSingleFailure) {
		boolean oldNoSingleFailure = noSingleFailure;
		noSingleFailure = newNoSingleFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE, oldNoSingleFailure, noSingleFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolOperation> getBooleanOperations() {
		if (booleanOperations == null) {
			booleanOperations = new EObjectContainmentEList<BoolOperation>(BoolOperation.class, this, FunctionsPackage.FAILURE_CONDITION__BOOLEAN_OPERATIONS);
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
			booleanNots = new EObjectContainmentEList<BoolNot>(BoolNot.class, this, FunctionsPackage.FAILURE_CONDITION__BOOLEAN_NOTS);
		}
		return booleanNots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputIntegrityState> getOutputIntegrityStates() {
		if (outputIntegrityStates == null) {
			outputIntegrityStates = new EObjectContainmentEList<OutputIntegrityState>(OutputIntegrityState.class, this, FunctionsPackage.FAILURE_CONDITION__OUTPUT_INTEGRITY_STATES);
		}
		return outputIntegrityStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_OPERATIONS:
				return ((InternalEList<?>)getBooleanOperations()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_NOTS:
				return ((InternalEList<?>)getBooleanNots()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FAILURE_CONDITION__OUTPUT_INTEGRITY_STATES:
				return ((InternalEList<?>)getOutputIntegrityStates()).basicRemove(otherEnd, msgs);
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
			case FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES:
				return getOperationModes();
			case FunctionsPackage.FAILURE_CONDITION__VARIANTS:
				return getVariants();
			case FunctionsPackage.FAILURE_CONDITION__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_PROBABILITY:
				return getMaxOccurrenceProbability();
			case FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE:
				return isNoSingleFailure();
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_OPERATIONS:
				return getBooleanOperations();
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_NOTS:
				return getBooleanNots();
			case FunctionsPackage.FAILURE_CONDITION__OUTPUT_INTEGRITY_STATES:
				return getOutputIntegrityStates();
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
			case FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case FunctionsPackage.FAILURE_CONDITION__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case FunctionsPackage.FAILURE_CONDITION__CONDITION:
				setCondition((BoolA)newValue);
				return;
			case FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_PROBABILITY:
				setMaxOccurrenceProbability((Double)newValue);
				return;
			case FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE:
				setNoSingleFailure((Boolean)newValue);
				return;
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_OPERATIONS:
				getBooleanOperations().clear();
				getBooleanOperations().addAll((Collection<? extends BoolOperation>)newValue);
				return;
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_NOTS:
				getBooleanNots().clear();
				getBooleanNots().addAll((Collection<? extends BoolNot>)newValue);
				return;
			case FunctionsPackage.FAILURE_CONDITION__OUTPUT_INTEGRITY_STATES:
				getOutputIntegrityStates().clear();
				getOutputIntegrityStates().addAll((Collection<? extends OutputIntegrityState>)newValue);
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
			case FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case FunctionsPackage.FAILURE_CONDITION__VARIANTS:
				getVariants().clear();
				return;
			case FunctionsPackage.FAILURE_CONDITION__CONDITION:
				setCondition((BoolA)null);
				return;
			case FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_PROBABILITY:
				setMaxOccurrenceProbability(MAX_OCCURRENCE_PROBABILITY_EDEFAULT);
				return;
			case FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE:
				setNoSingleFailure(NO_SINGLE_FAILURE_EDEFAULT);
				return;
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_OPERATIONS:
				getBooleanOperations().clear();
				return;
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_NOTS:
				getBooleanNots().clear();
				return;
			case FunctionsPackage.FAILURE_CONDITION__OUTPUT_INTEGRITY_STATES:
				getOutputIntegrityStates().clear();
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
			case FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case FunctionsPackage.FAILURE_CONDITION__VARIANTS:
				return variants != null && !variants.isEmpty();
			case FunctionsPackage.FAILURE_CONDITION__CONDITION:
				return condition != null;
			case FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_PROBABILITY:
				return maxOccurrenceProbability != MAX_OCCURRENCE_PROBABILITY_EDEFAULT;
			case FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE:
				return noSingleFailure != NO_SINGLE_FAILURE_EDEFAULT;
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_OPERATIONS:
				return booleanOperations != null && !booleanOperations.isEmpty();
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_NOTS:
				return booleanNots != null && !booleanNots.isEmpty();
			case FunctionsPackage.FAILURE_CONDITION__OUTPUT_INTEGRITY_STATES:
				return outputIntegrityStates != null && !outputIntegrityStates.isEmpty();
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
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.FAILURE_CONDITION__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
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
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return FunctionsPackage.FAILURE_CONDITION__VARIANTS;
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
		result.append(" (maxOccurrenceProbability: ");
		result.append(maxOccurrenceProbability);
		result.append(", noSingleFailure: ");
		result.append(noSingleFailure);
		result.append(')');
		return result.toString();
	}

} //FailureConditionImpl
