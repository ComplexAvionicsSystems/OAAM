/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import de.oaam.model.oaam.systems.InformationFlow;
import de.oaam.model.oaam.systems.InputSegregation;
import de.oaam.model.oaam.systems.Subsystem;
import de.oaam.model.oaam.systems.SystemsContainerA;
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
 * An implementation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemsContainerAImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemsContainerAImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemsContainerAImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemsContainerAImpl#getInformationFlows <em>Information Flows</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemsContainerAImpl#getInputSegregations <em>Input Segregations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemsContainerAImpl#getSubsystems <em>Subsystems</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SystemsContainerAImpl extends OaamBaseElementAImpl implements SystemsContainerA {
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
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<de.oaam.model.oaam.systems.System> systems;

	/**
	 * The cached value of the '{@link #getInformationFlows() <em>Information Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationFlow> informationFlows;

	/**
	 * The cached value of the '{@link #getInputSegregations() <em>Input Segregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSegregations()
	 * @generated
	 * @ordered
	 */
	protected EList<InputSegregation> inputSegregations;

	/**
	 * The cached value of the '{@link #getSubsystems() <em>Subsystems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystems()
	 * @generated
	 * @ordered
	 */
	protected EList<Subsystem> subsystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemsContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemsPackage.Literals.SYSTEMS_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, SystemsPackage.SYSTEMS_CONTAINER_A__OPERATION_MODES);
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
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, SystemsPackage.SYSTEMS_CONTAINER_A__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.oaam.model.oaam.systems.System> getSystems() {
		if (systems == null) {
			systems = new EObjectContainmentEList<de.oaam.model.oaam.systems.System>(de.oaam.model.oaam.systems.System.class, this, SystemsPackage.SYSTEMS_CONTAINER_A__SYSTEMS);
		}
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationFlow> getInformationFlows() {
		if (informationFlows == null) {
			informationFlows = new EObjectContainmentEList<InformationFlow>(InformationFlow.class, this, SystemsPackage.SYSTEMS_CONTAINER_A__INFORMATION_FLOWS);
		}
		return informationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSegregation> getInputSegregations() {
		if (inputSegregations == null) {
			inputSegregations = new EObjectContainmentEList<InputSegregation>(InputSegregation.class, this, SystemsPackage.SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS);
		}
		return inputSegregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subsystem> getSubsystems() {
		if (subsystems == null) {
			subsystems = new EObjectContainmentEList<Subsystem>(Subsystem.class, this, SystemsPackage.SYSTEMS_CONTAINER_A__SUBSYSTEMS);
		}
		return subsystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemsPackage.SYSTEMS_CONTAINER_A__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case SystemsPackage.SYSTEMS_CONTAINER_A__SYSTEMS:
				return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
			case SystemsPackage.SYSTEMS_CONTAINER_A__INFORMATION_FLOWS:
				return ((InternalEList<?>)getInformationFlows()).basicRemove(otherEnd, msgs);
			case SystemsPackage.SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS:
				return ((InternalEList<?>)getInputSegregations()).basicRemove(otherEnd, msgs);
			case SystemsPackage.SYSTEMS_CONTAINER_A__SUBSYSTEMS:
				return ((InternalEList<?>)getSubsystems()).basicRemove(otherEnd, msgs);
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
			case SystemsPackage.SYSTEMS_CONTAINER_A__OPERATION_MODES:
				return getOperationModes();
			case SystemsPackage.SYSTEMS_CONTAINER_A__VARIANTS:
				return getVariants();
			case SystemsPackage.SYSTEMS_CONTAINER_A__SYSTEMS:
				return getSystems();
			case SystemsPackage.SYSTEMS_CONTAINER_A__INFORMATION_FLOWS:
				return getInformationFlows();
			case SystemsPackage.SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS:
				return getInputSegregations();
			case SystemsPackage.SYSTEMS_CONTAINER_A__SUBSYSTEMS:
				return getSubsystems();
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
			case SystemsPackage.SYSTEMS_CONTAINER_A__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__SYSTEMS:
				getSystems().clear();
				getSystems().addAll((Collection<? extends de.oaam.model.oaam.systems.System>)newValue);
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__INFORMATION_FLOWS:
				getInformationFlows().clear();
				getInformationFlows().addAll((Collection<? extends InformationFlow>)newValue);
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS:
				getInputSegregations().clear();
				getInputSegregations().addAll((Collection<? extends InputSegregation>)newValue);
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__SUBSYSTEMS:
				getSubsystems().clear();
				getSubsystems().addAll((Collection<? extends Subsystem>)newValue);
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
			case SystemsPackage.SYSTEMS_CONTAINER_A__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__VARIANTS:
				getVariants().clear();
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__SYSTEMS:
				getSystems().clear();
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__INFORMATION_FLOWS:
				getInformationFlows().clear();
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS:
				getInputSegregations().clear();
				return;
			case SystemsPackage.SYSTEMS_CONTAINER_A__SUBSYSTEMS:
				getSubsystems().clear();
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
			case SystemsPackage.SYSTEMS_CONTAINER_A__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case SystemsPackage.SYSTEMS_CONTAINER_A__VARIANTS:
				return variants != null && !variants.isEmpty();
			case SystemsPackage.SYSTEMS_CONTAINER_A__SYSTEMS:
				return systems != null && !systems.isEmpty();
			case SystemsPackage.SYSTEMS_CONTAINER_A__INFORMATION_FLOWS:
				return informationFlows != null && !informationFlows.isEmpty();
			case SystemsPackage.SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS:
				return inputSegregations != null && !inputSegregations.isEmpty();
			case SystemsPackage.SYSTEMS_CONTAINER_A__SUBSYSTEMS:
				return subsystems != null && !subsystems.isEmpty();
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
				case SystemsPackage.SYSTEMS_CONTAINER_A__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case SystemsPackage.SYSTEMS_CONTAINER_A__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
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
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return SystemsPackage.SYSTEMS_CONTAINER_A__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return SystemsPackage.SYSTEMS_CONTAINER_A__VARIANTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SystemsContainerAImpl
