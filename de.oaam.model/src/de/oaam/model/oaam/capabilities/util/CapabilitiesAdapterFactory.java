/**
 */
package de.oaam.model.oaam.capabilities.util;

import de.oaam.model.oaam.capabilities.*;

import de.oaam.model.oaam.common.OaamBaseElementA;

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
			public Adapter caseTaskOnDeviceCapability(TaskOnDeviceCapability object) {
				return createTaskOnDeviceCapabilityAdapter();
			}
			@Override
			public Adapter caseDeviceInLocationCapability(DeviceInLocationCapability object) {
				return createDeviceInLocationCapabilityAdapter();
			}
			@Override
			public Adapter caseConnectionInDuctOrLocationCapability(ConnectionInDuctOrLocationCapability object) {
				return createConnectionInDuctOrLocationCapabilityAdapter();
			}
			@Override
			public Adapter caseSignalOnConnectionOrDeviceCapability(SignalOnConnectionOrDeviceCapability object) {
				return createSignalOnConnectionOrDeviceCapabilityAdapter();
			}
			@Override
			public Adapter caseSubdeviceInDeviceCapability(SubdeviceInDeviceCapability object) {
				return createSubdeviceInDeviceCapabilityAdapter();
			}
			@Override
			public Adapter caseSubconnectionInDeviceCapability(SubconnectionInDeviceCapability object) {
				return createSubconnectionInDeviceCapabilityAdapter();
			}
			@Override
			public Adapter caseResourceConsumption(ResourceConsumption object) {
				return createResourceConsumptionAdapter();
			}
			@Override
			public Adapter caseMessageOnBusCapability(MessageOnBusCapability object) {
				return createMessageOnBusCapabilityAdapter();
			}
			@Override
			public Adapter caseMessageOnConnectionOrDeviceCapability(MessageOnConnectionOrDeviceCapability object) {
				return createMessageOnConnectionOrDeviceCapabilityAdapter();
			}
			@Override
			public Adapter caseSubmessageInMessageCapability(SubmessageInMessageCapability object) {
				return createSubmessageInMessageCapabilityAdapter();
			}
			@Override
			public Adapter caseSignalInMessageCapability(SignalInMessageCapability object) {
				return createSignalInMessageCapabilityAdapter();
			}
			@Override
			public Adapter caseCapabilities(Capabilities object) {
				return createCapabilitiesAdapter();
			}
			@Override
			public Adapter caseSubcapabilities(Subcapabilities object) {
				return createSubcapabilitiesAdapter();
			}
			@Override
			public Adapter caseOaamBaseElementA(OaamBaseElementA object) {
				return createOaamBaseElementAAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.TaskOnDeviceCapability <em>Task On Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.TaskOnDeviceCapability
	 * @generated
	 */
	public Adapter createTaskOnDeviceCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.DeviceInLocationCapability <em>Device In Location Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.DeviceInLocationCapability
	 * @generated
	 */
	public Adapter createDeviceInLocationCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability <em>Connection In Duct Or Location Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability
	 * @generated
	 */
	public Adapter createConnectionInDuctOrLocationCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability <em>Signal On Connection Or Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability
	 * @generated
	 */
	public Adapter createSignalOnConnectionOrDeviceCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability <em>Subdevice In Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability
	 * @generated
	 */
	public Adapter createSubdeviceInDeviceCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability <em>Subconnection In Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability
	 * @generated
	 */
	public Adapter createSubconnectionInDeviceCapabilityAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.Subcapabilities <em>Subcapabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.Subcapabilities
	 * @generated
	 */
	public Adapter createSubcapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.MessageOnBusCapability <em>Message On Bus Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.MessageOnBusCapability
	 * @generated
	 */
	public Adapter createMessageOnBusCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.SubmessageInMessageCapability <em>Submessage In Message Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.SubmessageInMessageCapability
	 * @generated
	 */
	public Adapter createSubmessageInMessageCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.SignalInMessageCapability <em>Signal In Message Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.SignalInMessageCapability
	 * @generated
	 */
	public Adapter createSignalInMessageCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability <em>Message On Connection Or Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability
	 * @generated
	 */
	public Adapter createMessageOnConnectionOrDeviceCapabilityAdapter() {
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
