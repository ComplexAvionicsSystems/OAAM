/**
 */
package de.oaam.model.oaam.systems.util;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import de.oaam.model.oaam.systems.ElectricPower;
import de.oaam.model.oaam.systems.HydraulicPower;
import de.oaam.model.oaam.systems.InformationFlow;
import de.oaam.model.oaam.systems.InformationMaterial;
import de.oaam.model.oaam.systems.InformationPower;
import de.oaam.model.oaam.systems.InformationSignal;
import de.oaam.model.oaam.systems.InputSegregation;
import de.oaam.model.oaam.systems.LinearPower;
import de.oaam.model.oaam.systems.ProvidedInformationA;
import de.oaam.model.oaam.systems.RequiredInformationA;
import de.oaam.model.oaam.systems.RotaryPower;
import de.oaam.model.oaam.systems.Subsystem;
import de.oaam.model.oaam.systems.Systems;
import de.oaam.model.oaam.systems.SystemsContainerA;
import de.oaam.model.oaam.systems.SystemsPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.systems.SystemsPackage
 * @generated
 */
public class SystemsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SystemsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemsSwitch<Adapter> modelSwitch =
		new SystemsSwitch<Adapter>() {
			@Override
			public Adapter caseSystemsContainerA(SystemsContainerA object) {
				return createSystemsContainerAAdapter();
			}
			@Override
			public Adapter caseSystems(Systems object) {
				return createSystemsAdapter();
			}
			@Override
			public Adapter caseSubsystem(Subsystem object) {
				return createSubsystemAdapter();
			}
			@Override
			public Adapter caseSystem(de.oaam.model.oaam.systems.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseRequiredInformationA(RequiredInformationA object) {
				return createRequiredInformationAAdapter();
			}
			@Override
			public Adapter caseProvidedInformationA(ProvidedInformationA object) {
				return createProvidedInformationAAdapter();
			}
			@Override
			public Adapter caseInformationFlow(InformationFlow object) {
				return createInformationFlowAdapter();
			}
			@Override
			public Adapter caseInformationSignal(InformationSignal object) {
				return createInformationSignalAdapter();
			}
			@Override
			public Adapter caseInformationMaterial(InformationMaterial object) {
				return createInformationMaterialAdapter();
			}
			@Override
			public Adapter caseInformationPower(InformationPower object) {
				return createInformationPowerAdapter();
			}
			@Override
			public Adapter caseElectricPower(ElectricPower object) {
				return createElectricPowerAdapter();
			}
			@Override
			public Adapter caseHydraulicPower(HydraulicPower object) {
				return createHydraulicPowerAdapter();
			}
			@Override
			public Adapter caseRotaryPower(RotaryPower object) {
				return createRotaryPowerAdapter();
			}
			@Override
			public Adapter caseLinearPower(LinearPower object) {
				return createLinearPowerAdapter();
			}
			@Override
			public Adapter caseInputSegregation(InputSegregation object) {
				return createInputSegregationAdapter();
			}
			@Override
			public Adapter caseOaamBaseElementA(OaamBaseElementA object) {
				return createOaamBaseElementAAdapter();
			}
			@Override
			public Adapter caseModeDependentElementA(ModeDependentElementA object) {
				return createModeDependentElementAAdapter();
			}
			@Override
			public Adapter caseVariantDependentElementA(VariantDependentElementA object) {
				return createVariantDependentElementAAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.SystemsContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.SystemsContainerA
	 * @generated
	 */
	public Adapter createSystemsContainerAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.Systems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.Systems
	 * @generated
	 */
	public Adapter createSystemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.Subsystem
	 * @generated
	 */
	public Adapter createSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.RequiredInformationA <em>Required Information A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.RequiredInformationA
	 * @generated
	 */
	public Adapter createRequiredInformationAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.ProvidedInformationA <em>Provided Information A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.ProvidedInformationA
	 * @generated
	 */
	public Adapter createProvidedInformationAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.InformationFlow <em>Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.InformationFlow
	 * @generated
	 */
	public Adapter createInformationFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.InformationSignal <em>Information Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.InformationSignal
	 * @generated
	 */
	public Adapter createInformationSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.InformationMaterial <em>Information Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.InformationMaterial
	 * @generated
	 */
	public Adapter createInformationMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.InformationPower <em>Information Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.InformationPower
	 * @generated
	 */
	public Adapter createInformationPowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.ElectricPower <em>Electric Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.ElectricPower
	 * @generated
	 */
	public Adapter createElectricPowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.HydraulicPower <em>Hydraulic Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.HydraulicPower
	 * @generated
	 */
	public Adapter createHydraulicPowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.RotaryPower <em>Rotary Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.RotaryPower
	 * @generated
	 */
	public Adapter createRotaryPowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.LinearPower <em>Linear Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.LinearPower
	 * @generated
	 */
	public Adapter createLinearPowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.systems.InputSegregation <em>Input Segregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.systems.InputSegregation
	 * @generated
	 */
	public Adapter createInputSegregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.common.OaamBaseElementA <em>Oaam Base Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA
	 * @generated
	 */
	public Adapter createOaamBaseElementAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.scenario.ModeDependentElementA <em>Mode Dependent Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.scenario.ModeDependentElementA
	 * @generated
	 */
	public Adapter createModeDependentElementAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.scenario.VariantDependentElementA <em>Variant Dependent Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.scenario.VariantDependentElementA
	 * @generated
	 */
	public Adapter createVariantDependentElementAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SystemsAdapterFactory
