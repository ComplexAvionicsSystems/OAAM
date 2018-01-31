/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import de.oaam.model.oaam.systems.ProvidedOutputA;
import de.oaam.model.oaam.systems.RequiredInputA;
import de.oaam.model.oaam.systems.SystemsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemImpl#getProvidedOutputs <em>Provided Outputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemImpl#getRequiredInputs <em>Required Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ElementAImpl implements de.oaam.model.oaam.systems.System {
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
	 * The cached value of the '{@link #getProvidedOutputs() <em>Provided Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedOutputA> providedOutputs;

	/**
	 * The cached value of the '{@link #getRequiredInputs() <em>Required Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredInputA> requiredInputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemsPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, SystemsPackage.SYSTEM__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, SystemsPackage.SYSTEM__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedOutputA> getProvidedOutputs() {
		if (providedOutputs == null) {
			providedOutputs = new EObjectContainmentEList<ProvidedOutputA>(ProvidedOutputA.class, this, SystemsPackage.SYSTEM__PROVIDED_OUTPUTS);
		}
		return providedOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredInputA> getRequiredInputs() {
		if (requiredInputs == null) {
			requiredInputs = new EObjectContainmentEList<RequiredInputA>(RequiredInputA.class, this, SystemsPackage.SYSTEM__REQUIRED_INPUTS);
		}
		return requiredInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemsPackage.SYSTEM__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				return ((InternalEList<?>)getProvidedOutputs()).basicRemove(otherEnd, msgs);
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				return ((InternalEList<?>)getRequiredInputs()).basicRemove(otherEnd, msgs);
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
			case SystemsPackage.SYSTEM__VARIANTS:
				return getVariants();
			case SystemsPackage.SYSTEM__OPERATION_MODES:
				return getOperationModes();
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				return getProvidedOutputs();
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				return getRequiredInputs();
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
			case SystemsPackage.SYSTEM__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case SystemsPackage.SYSTEM__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				getProvidedOutputs().clear();
				getProvidedOutputs().addAll((Collection<? extends ProvidedOutputA>)newValue);
				return;
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				getRequiredInputs().clear();
				getRequiredInputs().addAll((Collection<? extends RequiredInputA>)newValue);
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
			case SystemsPackage.SYSTEM__VARIANTS:
				getVariants().clear();
				return;
			case SystemsPackage.SYSTEM__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				getProvidedOutputs().clear();
				return;
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				getRequiredInputs().clear();
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
			case SystemsPackage.SYSTEM__VARIANTS:
				return variants != null && !variants.isEmpty();
			case SystemsPackage.SYSTEM__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				return providedOutputs != null && !providedOutputs.isEmpty();
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				return requiredInputs != null && !requiredInputs.isEmpty();
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
				case SystemsPackage.SYSTEM__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case SystemsPackage.SYSTEM__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return SystemsPackage.SYSTEM__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return SystemsPackage.SYSTEM__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SystemImpl
