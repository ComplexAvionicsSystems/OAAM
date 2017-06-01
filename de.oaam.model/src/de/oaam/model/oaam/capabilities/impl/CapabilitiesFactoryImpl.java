/**
 */
package de.oaam.model.oaam.capabilities.impl;

import de.oaam.model.oaam.capabilities.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilitiesFactoryImpl extends EFactoryImpl implements CapabilitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapabilitiesFactory init() {
		try {
			CapabilitiesFactory theCapabilitiesFactory = (CapabilitiesFactory)EPackage.Registry.INSTANCE.getEFactory(CapabilitiesPackage.eNS_URI);
			if (theCapabilitiesFactory != null) {
				return theCapabilitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapabilitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CapabilitiesPackage.TASK_CAPABILITY: return createTaskCapability();
			case CapabilitiesPackage.DEVICE_CAPABILITY: return createDeviceCapability();
			case CapabilitiesPackage.CONNECTION_CAPABILITY: return createConnectionCapability();
			case CapabilitiesPackage.SIGNAL_CAPABILITY: return createSignalCapability();
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY: return createSubDeviceCapability();
			case CapabilitiesPackage.RESOURCE_CONSUMPTION: return createResourceConsumption();
			case CapabilitiesPackage.CAPABILITIES: return createCapabilities();
			case CapabilitiesPackage.SUBCAPABILITY: return createSubcapability();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCapability createTaskCapability() {
		TaskCapabilityImpl taskCapability = new TaskCapabilityImpl();
		return taskCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceCapability createDeviceCapability() {
		DeviceCapabilityImpl deviceCapability = new DeviceCapabilityImpl();
		return deviceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionCapability createConnectionCapability() {
		ConnectionCapabilityImpl connectionCapability = new ConnectionCapabilityImpl();
		return connectionCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalCapability createSignalCapability() {
		SignalCapabilityImpl signalCapability = new SignalCapabilityImpl();
		return signalCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubDeviceCapability createSubDeviceCapability() {
		SubDeviceCapabilityImpl subDeviceCapability = new SubDeviceCapabilityImpl();
		return subDeviceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceConsumption createResourceConsumption() {
		ResourceConsumptionImpl resourceConsumption = new ResourceConsumptionImpl();
		return resourceConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilities createCapabilities() {
		CapabilitiesImpl capabilities = new CapabilitiesImpl();
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcapability createSubcapability() {
		SubcapabilityImpl subcapability = new SubcapabilityImpl();
		return subcapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesPackage getCapabilitiesPackage() {
		return (CapabilitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapabilitiesPackage getPackage() {
		return CapabilitiesPackage.eINSTANCE;
	}

} //CapabilitiesFactoryImpl
