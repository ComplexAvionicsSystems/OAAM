/**
 */
package de.oaam.model.oaam.capabilities.util;

import de.oaam.model.oaam.capabilities.*;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage
 * @generated
 */
public class CapabilitiesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CapabilitiesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CapabilitiesPackage.eINSTANCE;
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
	protected CapabilitiesSwitch<Adapter> modelSwitch =
		new CapabilitiesSwitch<Adapter>() {
			@Override
			public Adapter caseCapabilityA(CapabilityA object) {
				return createCapabilityAAdapter();
			}
			@Override
			public Adapter caseCapabilitiesContainerA(CapabilitiesContainerA object) {
				return createCapabilitiesContainerAAdapter();
			}
			@Override
			public Adapter caseTaskCapability(TaskCapability object) {
				return createTaskCapabilityAdapter();
			}
			@Override
			public Adapter caseDeviceCapability(DeviceCapability object) {
				return createDeviceCapabilityAdapter();
			}
			@Override
			public Adapter caseConnectionCapability(ConnectionCapability object) {
				return createConnectionCapabilityAdapter();
			}
			@Override
			public Adapter caseSignalCapability(SignalCapability object) {
				return createSignalCapabilityAdapter();
			}
			@Override
			public Adapter caseSubDeviceCapability(SubDeviceCapability object) {
				return createSubDeviceCapabilityAdapter();
			}
			@Override
			public Adapter caseResourceConsumption(ResourceConsumption object) {
				return createResourceConsumptionAdapter();
			}
			@Override
			public Adapter caseCapabilities(Capabilities object) {
				return createCapabilitiesAdapter();
			}
			@Override
			public Adapter caseSubcapability(Subcapability object) {
				return createSubcapabilityAdapter();
			}
			@Override
			public Adapter caseElementA(ElementA object) {
				return createElementAAdapter();
			}
			@Override
			public Adapter caseVariantDependentElementA(VariantDependentElementA object) {
				return createVariantDependentElementAAdapter();
			}
			@Override
			public Adapter caseModeDependentElementA(ModeDependentElementA object) {
				return createModeDependentElementAAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.CapabilityA <em>Capability A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.CapabilityA
	 * @generated
	 */
	public Adapter createCapabilityAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA
	 * @generated
	 */
	public Adapter createCapabilitiesContainerAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.TaskCapability <em>Task Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.TaskCapability
	 * @generated
	 */
	public Adapter createTaskCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.DeviceCapability <em>Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.DeviceCapability
	 * @generated
	 */
	public Adapter createDeviceCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.ConnectionCapability <em>Connection Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.ConnectionCapability
	 * @generated
	 */
	public Adapter createConnectionCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.SignalCapability <em>Signal Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.SignalCapability
	 * @generated
	 */
	public Adapter createSignalCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.SubDeviceCapability <em>Sub Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.SubDeviceCapability
	 * @generated
	 */
	public Adapter createSubDeviceCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.ResourceConsumption <em>Resource Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.ResourceConsumption
	 * @generated
	 */
	public Adapter createResourceConsumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.Capabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.Capabilities
	 * @generated
	 */
	public Adapter createCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.Subcapability <em>Subcapability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.Subcapability
	 * @generated
	 */
	public Adapter createSubcapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.common.ElementA <em>Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.common.ElementA
	 * @generated
	 */
	public Adapter createElementAAdapter() {
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

} //CapabilitiesAdapterFactory
