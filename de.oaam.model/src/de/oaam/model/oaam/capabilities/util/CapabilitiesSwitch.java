/**
 */
package de.oaam.model.oaam.capabilities.util;

import de.oaam.model.oaam.capabilities.*;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

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
				if (result == null) result = case_ElementA(capabilitiesContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.TASK_CAPABILITY: {
				TaskCapability taskCapability = (TaskCapability)theEObject;
				T result = caseTaskCapability(taskCapability);
				if (result == null) result = caseCapabilityA(taskCapability);
				if (result == null) result = case_ElementA(taskCapability);
				if (result == null) result = case_VariantDependentElementA(taskCapability);
				if (result == null) result = case_ModeDependentElementA(taskCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.DEVICE_CAPABILITY: {
				DeviceCapability deviceCapability = (DeviceCapability)theEObject;
				T result = caseDeviceCapability(deviceCapability);
				if (result == null) result = caseCapabilityA(deviceCapability);
				if (result == null) result = case_ElementA(deviceCapability);
				if (result == null) result = case_VariantDependentElementA(deviceCapability);
				if (result == null) result = case_ModeDependentElementA(deviceCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.CONNECTION_CAPABILITY: {
				ConnectionCapability connectionCapability = (ConnectionCapability)theEObject;
				T result = caseConnectionCapability(connectionCapability);
				if (result == null) result = caseCapabilityA(connectionCapability);
				if (result == null) result = case_ElementA(connectionCapability);
				if (result == null) result = case_VariantDependentElementA(connectionCapability);
				if (result == null) result = case_ModeDependentElementA(connectionCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.SIGNAL_CAPABILITY: {
				SignalCapability signalCapability = (SignalCapability)theEObject;
				T result = caseSignalCapability(signalCapability);
				if (result == null) result = caseCapabilityA(signalCapability);
				if (result == null) result = case_ElementA(signalCapability);
				if (result == null) result = case_VariantDependentElementA(signalCapability);
				if (result == null) result = case_ModeDependentElementA(signalCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY: {
				SubDeviceCapability subDeviceCapability = (SubDeviceCapability)theEObject;
				T result = caseSubDeviceCapability(subDeviceCapability);
				if (result == null) result = caseCapabilityA(subDeviceCapability);
				if (result == null) result = case_ElementA(subDeviceCapability);
				if (result == null) result = case_VariantDependentElementA(subDeviceCapability);
				if (result == null) result = case_ModeDependentElementA(subDeviceCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.RESOURCE_CONSUMPTION: {
				ResourceConsumption resourceConsumption = (ResourceConsumption)theEObject;
				T result = caseResourceConsumption(resourceConsumption);
				if (result == null) result = case_ElementA(resourceConsumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.CAPABILITIES: {
				Capabilities capabilities = (Capabilities)theEObject;
				T result = caseCapabilities(capabilities);
				if (result == null) result = caseCapabilitiesContainerA(capabilities);
				if (result == null) result = case_ElementA(capabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilitiesPackage.SUBCAPABILITY: {
				Subcapability subcapability = (Subcapability)theEObject;
				T result = caseSubcapability(subcapability);
				if (result == null) result = caseCapabilitiesContainerA(subcapability);
				if (result == null) result = case_ModeDependentElementA(subcapability);
				if (result == null) result = case_VariantDependentElementA(subcapability);
				if (result == null) result = case_ElementA(subcapability);
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
	 * Returns the result of interpreting the object as an instance of '<em>Task Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskCapability(TaskCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceCapability(DeviceCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionCapability(ConnectionCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalCapability(SignalCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Device Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Device Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubDeviceCapability(SubDeviceCapability object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Subcapability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subcapability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubcapability(Subcapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_ElementA(_ElementA object) {
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
	public T case_VariantDependentElementA(_VariantDependentElementA object) {
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
	public T case_ModeDependentElementA(_ModeDependentElementA object) {
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
