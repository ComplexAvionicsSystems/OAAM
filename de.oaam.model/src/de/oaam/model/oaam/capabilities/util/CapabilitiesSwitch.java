/**
 */
package de.oaam.model.oaam.capabilities.util;

import de.oaam.model.oaam.capabilities.*;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage
 * @generated
 */
public class CapabilitiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CapabilitiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesSwitch() {
		if (modelPackage == null) {
			modelPackage = CapabilitiesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CapabilitiesPackage.CAPABILITY_A: {
				CapabilityA capabilityA = (CapabilityA)theEObject;
				T result = caseCapabilityA(capabilityA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A: {
				CapabilitiesContainerA capabilitiesContainerA = (CapabilitiesContainerA)theEObject;
				T result = caseCapabilitiesContainerA(capabilitiesContainerA);
				if (result == null) result = caseOaamBaseElementA(capabilitiesContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.TASK_ON_DEVICE_CAPABILITY: {
				TaskOnDeviceCapability taskOnDeviceCapability = (TaskOnDeviceCapability)theEObject;
				T result = caseTaskOnDeviceCapability(taskOnDeviceCapability);
				if (result == null) result = caseCapabilityA(taskOnDeviceCapability);
				if (result == null) result = caseOaamBaseElementA(taskOnDeviceCapability);
				if (result == null) result = caseVariantDependentElementA(taskOnDeviceCapability);
				if (result == null) result = caseModeDependentElementA(taskOnDeviceCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY: {
				DeviceInLocationCapability deviceInLocationCapability = (DeviceInLocationCapability)theEObject;
				T result = caseDeviceInLocationCapability(deviceInLocationCapability);
				if (result == null) result = caseCapabilityA(deviceInLocationCapability);
				if (result == null) result = caseOaamBaseElementA(deviceInLocationCapability);
				if (result == null) result = caseVariantDependentElementA(deviceInLocationCapability);
				if (result == null) result = caseModeDependentElementA(deviceInLocationCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY: {
				ConnectionInDuctOrLocationCapability connectionInDuctOrLocationCapability = (ConnectionInDuctOrLocationCapability)theEObject;
				T result = caseConnectionInDuctOrLocationCapability(connectionInDuctOrLocationCapability);
				if (result == null) result = caseCapabilityA(connectionInDuctOrLocationCapability);
				if (result == null) result = caseOaamBaseElementA(connectionInDuctOrLocationCapability);
				if (result == null) result = caseVariantDependentElementA(connectionInDuctOrLocationCapability);
				if (result == null) result = caseModeDependentElementA(connectionInDuctOrLocationCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY: {
				SignalOnConnectionOrDeviceCapability signalOnConnectionOrDeviceCapability = (SignalOnConnectionOrDeviceCapability)theEObject;
				T result = caseSignalOnConnectionOrDeviceCapability(signalOnConnectionOrDeviceCapability);
				if (result == null) result = caseCapabilityA(signalOnConnectionOrDeviceCapability);
				if (result == null) result = caseOaamBaseElementA(signalOnConnectionOrDeviceCapability);
				if (result == null) result = caseVariantDependentElementA(signalOnConnectionOrDeviceCapability);
				if (result == null) result = caseModeDependentElementA(signalOnConnectionOrDeviceCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.SUBDEVICE_IN_DEVICE_CAPABILITY: {
				SubdeviceInDeviceCapability subdeviceInDeviceCapability = (SubdeviceInDeviceCapability)theEObject;
				T result = caseSubdeviceInDeviceCapability(subdeviceInDeviceCapability);
				if (result == null) result = caseCapabilityA(subdeviceInDeviceCapability);
				if (result == null) result = caseOaamBaseElementA(subdeviceInDeviceCapability);
				if (result == null) result = caseVariantDependentElementA(subdeviceInDeviceCapability);
				if (result == null) result = caseModeDependentElementA(subdeviceInDeviceCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.SUBCONNECTION_IN_DEVICE_CAPABILITY: {
				SubconnectionInDeviceCapability subconnectionInDeviceCapability = (SubconnectionInDeviceCapability)theEObject;
				T result = caseSubconnectionInDeviceCapability(subconnectionInDeviceCapability);
				if (result == null) result = caseCapabilityA(subconnectionInDeviceCapability);
				if (result == null) result = caseOaamBaseElementA(subconnectionInDeviceCapability);
				if (result == null) result = caseVariantDependentElementA(subconnectionInDeviceCapability);
				if (result == null) result = caseModeDependentElementA(subconnectionInDeviceCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.RESOURCE_CONSUMPTION: {
				ResourceConsumption resourceConsumption = (ResourceConsumption)theEObject;
				T result = caseResourceConsumption(resourceConsumption);
				if (result == null) result = caseOaamBaseElementA(resourceConsumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.CAPABILITIES: {
				Capabilities capabilities = (Capabilities)theEObject;
				T result = caseCapabilities(capabilities);
				if (result == null) result = caseCapabilitiesContainerA(capabilities);
				if (result == null) result = caseOaamBaseElementA(capabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.SUBCAPABILITIES: {
				Subcapabilities subcapabilities = (Subcapabilities)theEObject;
				T result = caseSubcapabilities(subcapabilities);
				if (result == null) result = caseCapabilitiesContainerA(subcapabilities);
				if (result == null) result = caseModeDependentElementA(subcapabilities);
				if (result == null) result = caseVariantDependentElementA(subcapabilities);
				if (result == null) result = caseOaamBaseElementA(subcapabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityA(CapabilityA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilitiesContainerA(CapabilitiesContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task On Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task On Device Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOnDeviceCapability(TaskOnDeviceCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device In Location Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device In Location Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceInLocationCapability(DeviceInLocationCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection In Duct Or Location Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection In Duct Or Location Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionInDuctOrLocationCapability(ConnectionInDuctOrLocationCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal On Connection Or Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal On Connection Or Device Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalOnConnectionOrDeviceCapability(SignalOnConnectionOrDeviceCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subdevice In Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subdevice In Device Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubdeviceInDeviceCapability(SubdeviceInDeviceCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subconnection In Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subconnection In Device Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubconnectionInDeviceCapability(SubconnectionInDeviceCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Consumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceConsumption(ResourceConsumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilities(Capabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subcapabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subcapabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubcapabilities(Subcapabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOaamBaseElementA(OaamBaseElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantDependentElementA(VariantDependentElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDependentElementA(ModeDependentElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CapabilitiesSwitch
