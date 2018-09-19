/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;
import de.oaam.model.oaam.functions.Task;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.SynchronicityRestriction;
import de.oaam.model.oaam.restrictions.TaskRestrictionA;

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
 * An implementation of the model object '<em><b>Synchronicity Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SynchronicityRestrictionImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SynchronicityRestrictionImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SynchronicityRestrictionImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SynchronicityRestrictionImpl#getMaxJitter <em>Max Jitter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronicityRestrictionImpl extends OaamBaseElementAImpl implements SynchronicityRestriction {
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
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The default value of the '{@link #getMaxJitter() <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJitter()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_JITTER_EDEFAULT = 0.001F;

	/**
	 * The cached value of the '{@link #getMaxJitter() <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJitter()
	 * @generated
	 * @ordered
	 */
	protected float maxJitter = MAX_JITTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronicityRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.SYNCHRONICITY_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, RestrictionsPackage.SYNCHRONICITY_RESTRICTION__OPERATION_MODES);
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
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, RestrictionsPackage.SYNCHRONICITY_RESTRICTION__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, RestrictionsPackage.SYNCHRONICITY_RESTRICTION__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxJitter() {
		return maxJitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxJitter(float newMaxJitter) {
		float oldMaxJitter = maxJitter;
		maxJitter = newMaxJitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.SYNCHRONICITY_RESTRICTION__MAX_JITTER, oldMaxJitter, maxJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__OPERATION_MODES:
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
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__OPERATION_MODES:
				return getOperationModes();
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__VARIANTS:
				return getVariants();
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__TASKS:
				return getTasks();
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__MAX_JITTER:
				return getMaxJitter();
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
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__MAX_JITTER:
				setMaxJitter((Float)newValue);
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
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__VARIANTS:
				getVariants().clear();
				return;
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__TASKS:
				getTasks().clear();
				return;
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__MAX_JITTER:
				setMaxJitter(MAX_JITTER_EDEFAULT);
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
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__VARIANTS:
				return variants != null && !variants.isEmpty();
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__MAX_JITTER:
				return maxJitter != MAX_JITTER_EDEFAULT;
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
				case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == TaskRestrictionA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.SYNCHRONICITY_RESTRICTION__TASKS: return RestrictionsPackage.TASK_RESTRICTION_A__TASKS;
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
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return RestrictionsPackage.SYNCHRONICITY_RESTRICTION__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return RestrictionsPackage.SYNCHRONICITY_RESTRICTION__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == TaskRestrictionA.class) {
			switch (baseFeatureID) {
				case RestrictionsPackage.TASK_RESTRICTION_A__TASKS: return RestrictionsPackage.SYNCHRONICITY_RESTRICTION__TASKS;
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
		result.append(" (maxJitter: ");
		result.append(maxJitter);
		result.append(')');
		return result.toString();
	}

} //SynchronicityRestrictionImpl
