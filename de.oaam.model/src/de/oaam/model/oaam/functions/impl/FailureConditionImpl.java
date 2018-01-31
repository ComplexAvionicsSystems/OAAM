/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.common.BoolA;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.functions.FailureCondition;
import de.oaam.model.oaam.functions.FunctionsPackage;

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
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#getMaxOccurrenceRate <em>Max Occurrence Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl#isNoSingleFailure <em>No Single Failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureConditionImpl extends ElementAImpl implements FailureCondition {
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
	 * The cached value of the '{@link #getLogic() <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogic()
	 * @generated
	 * @ordered
	 */
	protected BoolA logic;

	/**
	 * The default value of the '{@link #getMaxOccurrenceRate() <em>Max Occurrence Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurrenceRate()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_OCCURRENCE_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxOccurrenceRate() <em>Max Occurrence Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurrenceRate()
	 * @generated
	 * @ordered
	 */
	protected double maxOccurrenceRate = MAX_OCCURRENCE_RATE_EDEFAULT;

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
	public BoolA getLogic() {
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogic(BoolA newLogic, NotificationChain msgs) {
		BoolA oldLogic = logic;
		logic = newLogic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.FAILURE_CONDITION__LOGIC, oldLogic, newLogic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogic(BoolA newLogic) {
		if (newLogic != logic) {
			NotificationChain msgs = null;
			if (logic != null)
				msgs = ((InternalEObject)logic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.FAILURE_CONDITION__LOGIC, null, msgs);
			if (newLogic != null)
				msgs = ((InternalEObject)newLogic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.FAILURE_CONDITION__LOGIC, null, msgs);
			msgs = basicSetLogic(newLogic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FAILURE_CONDITION__LOGIC, newLogic, newLogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxOccurrenceRate() {
		return maxOccurrenceRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOccurrenceRate(double newMaxOccurrenceRate) {
		double oldMaxOccurrenceRate = maxOccurrenceRate;
		maxOccurrenceRate = newMaxOccurrenceRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_RATE, oldMaxOccurrenceRate, maxOccurrenceRate));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.FAILURE_CONDITION__LOGIC:
				return basicSetLogic(null, msgs);
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
			case FunctionsPackage.FAILURE_CONDITION__LOGIC:
				return getLogic();
			case FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_RATE:
				return getMaxOccurrenceRate();
			case FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE:
				return isNoSingleFailure();
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
			case FunctionsPackage.FAILURE_CONDITION__LOGIC:
				setLogic((BoolA)newValue);
				return;
			case FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_RATE:
				setMaxOccurrenceRate((Double)newValue);
				return;
			case FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE:
				setNoSingleFailure((Boolean)newValue);
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
			case FunctionsPackage.FAILURE_CONDITION__LOGIC:
				setLogic((BoolA)null);
				return;
			case FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_RATE:
				setMaxOccurrenceRate(MAX_OCCURRENCE_RATE_EDEFAULT);
				return;
			case FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE:
				setNoSingleFailure(NO_SINGLE_FAILURE_EDEFAULT);
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
			case FunctionsPackage.FAILURE_CONDITION__LOGIC:
				return logic != null;
			case FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_RATE:
				return maxOccurrenceRate != MAX_OCCURRENCE_RATE_EDEFAULT;
			case FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE:
				return noSingleFailure != NO_SINGLE_FAILURE_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxOccurrenceRate: ");
		result.append(maxOccurrenceRate);
		result.append(", noSingleFailure: ");
		result.append(noSingleFailure);
		result.append(')');
		return result.toString();
	}

} //FailureConditionImpl
