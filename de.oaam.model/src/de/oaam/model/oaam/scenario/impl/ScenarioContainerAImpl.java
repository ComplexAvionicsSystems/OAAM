/**
 */
package de.oaam.model.oaam.scenario.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.scenario.OperationMode;
import de.oaam.model.oaam.scenario.ScenarioContainerA;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.ScenarioParameterA;
import de.oaam.model.oaam.scenario.Subscenario;
import de.oaam.model.oaam.scenario.Variant;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ScenarioContainerAImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ScenarioContainerAImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ScenarioContainerAImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.impl.ScenarioContainerAImpl#getSubscenarios <em>Subscenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScenarioContainerAImpl extends OaamBaseElementAImpl implements ScenarioContainerA {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioParameterA> parameters;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
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
	protected EList<OperationMode> operationModes;

	/**
	 * The cached value of the '{@link #getSubscenarios() <em>Subscenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscenario> subscenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.SCENARIO_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioParameterA> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ScenarioParameterA>(ScenarioParameterA.class, this, ScenarioPackage.SCENARIO_CONTAINER_A__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectContainmentEList<Variant>(Variant.class, this, ScenarioPackage.SCENARIO_CONTAINER_A__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationMode> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationMode>(OperationMode.class, this, ScenarioPackage.SCENARIO_CONTAINER_A__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscenario> getSubscenarios() {
		if (subscenarios == null) {
			subscenarios = new EObjectContainmentEList<Subscenario>(Subscenario.class, this, ScenarioPackage.SCENARIO_CONTAINER_A__SUBSCENARIOS);
		}
		return subscenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO_CONTAINER_A__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.SCENARIO_CONTAINER_A__VARIANTS:
				return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.SCENARIO_CONTAINER_A__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.SCENARIO_CONTAINER_A__SUBSCENARIOS:
				return ((InternalEList<?>)getSubscenarios()).basicRemove(otherEnd, msgs);
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
			case ScenarioPackage.SCENARIO_CONTAINER_A__PARAMETERS:
				return getParameters();
			case ScenarioPackage.SCENARIO_CONTAINER_A__VARIANTS:
				return getVariants();
			case ScenarioPackage.SCENARIO_CONTAINER_A__OPERATION_MODES:
				return getOperationModes();
			case ScenarioPackage.SCENARIO_CONTAINER_A__SUBSCENARIOS:
				return getSubscenarios();
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
			case ScenarioPackage.SCENARIO_CONTAINER_A__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ScenarioParameterA>)newValue);
				return;
			case ScenarioPackage.SCENARIO_CONTAINER_A__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case ScenarioPackage.SCENARIO_CONTAINER_A__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationMode>)newValue);
				return;
			case ScenarioPackage.SCENARIO_CONTAINER_A__SUBSCENARIOS:
				getSubscenarios().clear();
				getSubscenarios().addAll((Collection<? extends Subscenario>)newValue);
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
			case ScenarioPackage.SCENARIO_CONTAINER_A__PARAMETERS:
				getParameters().clear();
				return;
			case ScenarioPackage.SCENARIO_CONTAINER_A__VARIANTS:
				getVariants().clear();
				return;
			case ScenarioPackage.SCENARIO_CONTAINER_A__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case ScenarioPackage.SCENARIO_CONTAINER_A__SUBSCENARIOS:
				getSubscenarios().clear();
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
			case ScenarioPackage.SCENARIO_CONTAINER_A__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ScenarioPackage.SCENARIO_CONTAINER_A__VARIANTS:
				return variants != null && !variants.isEmpty();
			case ScenarioPackage.SCENARIO_CONTAINER_A__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case ScenarioPackage.SCENARIO_CONTAINER_A__SUBSCENARIOS:
				return subscenarios != null && !subscenarios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioContainerAImpl
