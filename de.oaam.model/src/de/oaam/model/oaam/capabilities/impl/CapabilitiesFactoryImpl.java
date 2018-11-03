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
			case CapabilitiesPackage.TASK_ON_DEVICE_CAPABILITY: return createTaskOnDeviceCapability();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY: return createDeviceInLocationCapability();
			case CapabilitiesPackage.CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY: return createConnectionInDuctOrLocationCapability();
			case CapabilitiesPackage.SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY: return createSignalOnConnectionOrDeviceCapability();
			case CapabilitiesPackage.SUBDEVICE_IN_DEVICE_CAPABILITY: return createSubdeviceInDeviceCapability();
			case CapabilitiesPackage.SUBCONNECTION_IN_DEVICE_CAPABILITY: return createSubconnectionInDeviceCapability();
			case CapabilitiesPackage.RESOURCE_CONSUMPTION: return createResourceConsumption();
			case CapabilitiesPackage.CAPABILITIES: return createCapabilities();
			case CapabilitiesPackage.SUBCAPABILITIES: return createSubcapabilities();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOnDeviceCapability createTaskOnDeviceCapability() {
		TaskOnDeviceCapabilityImpl taskOnDeviceCapability = new TaskOnDeviceCapabilityImpl();
		return taskOnDeviceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceInLocationCapability createDeviceInLocationCapability() {
		DeviceInLocationCapabilityImpl deviceInLocationCapability = new DeviceInLocationCapabilityImpl();
		return deviceInLocationCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInDuctOrLocationCapability createConnectionInDuctOrLocationCapability() {
		ConnectionInDuctOrLocationCapabilityImpl connectionInDuctOrLocationCapability = new ConnectionInDuctOrLocationCapabilityImpl();
		return connectionInDuctOrLocationCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalOnConnectionOrDeviceCapability createSignalOnConnectionOrDeviceCapability() {
		SignalOnConnectionOrDeviceCapabilityImpl signalOnConnectionOrDeviceCapability = new SignalOnConnectionOrDeviceCapabilityImpl();
		return signalOnConnectionOrDeviceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubdeviceInDeviceCapability createSubdeviceInDeviceCapability() {
		SubdeviceInDeviceCapabilityImpl subdeviceInDeviceCapability = new SubdeviceInDeviceCapabilityImpl();
		return subdeviceInDeviceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubconnectionInDeviceCapability createSubconnectionInDeviceCapability() {
		SubconnectionInDeviceCapabilityImpl subconnectionInDeviceCapability = new SubconnectionInDeviceCapabilityImpl();
		return subconnectionInDeviceCapability;
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
	public Subcapabilities createSubcapabilities() {
		SubcapabilitiesImpl subcapabilities = new SubcapabilitiesImpl();
		return subcapabilities;
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
