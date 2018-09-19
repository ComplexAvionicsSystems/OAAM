/**
 */
package de.oaam.model.oaam.hardware.util;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.hardware.*;

import de.oaam.model.oaam.library.ResourceProviderInstanceA;

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
 * @see de.oaam.model.oaam.hardware.HardwarePackage
 * @generated
 */
public class HardwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HardwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareSwitch() {
		if (modelPackage == null) {
			modelPackage = HardwarePackage.eINSTANCE;
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
			case HardwarePackage.HARDWARE_CONTAINER_A: {
				HardwareContainerA hardwareContainerA = (HardwareContainerA)theEObject;
				T result = caseHardwareContainerA(hardwareContainerA);
				if (result == null) result = caseOaamBaseElementA(hardwareContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseResourceProviderInstanceA(device);
				if (result == null) result = caseOaamBaseElementA(device);
				if (result == null) result = caseVariantDependentElementA(device);
				if (result == null) result = caseModeDependentElementA(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseResourceProviderInstanceA(connection);
				if (result == null) result = caseOaamBaseElementA(connection);
				if (result == null) result = caseVariantDependentElementA(connection);
				if (result == null) result = caseModeDependentElementA(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.IO: {
				Io io = (Io)theEObject;
				T result = caseIo(io);
				if (result == null) result = caseOaamBaseElementA(io);
				if (result == null) result = caseVariantDependentElementA(io);
				if (result == null) result = caseModeDependentElementA(io);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.DEVICE_SYMMETRY: {
				DeviceSymmetry deviceSymmetry = (DeviceSymmetry)theEObject;
				T result = caseDeviceSymmetry(deviceSymmetry);
				if (result == null) result = caseOaamBaseElementA(deviceSymmetry);
				if (result == null) result = caseVariantDependentElementA(deviceSymmetry);
				if (result == null) result = caseModeDependentElementA(deviceSymmetry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.HARDWARE: {
				Hardware hardware = (Hardware)theEObject;
				T result = caseHardware(hardware);
				if (result == null) result = caseHardwareContainerA(hardware);
				if (result == null) result = caseVariantDependentElementA(hardware);
				if (result == null) result = caseModeDependentElementA(hardware);
				if (result == null) result = caseOaamBaseElementA(hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.SUBHARDWARE: {
				Subhardware subhardware = (Subhardware)theEObject;
				T result = caseSubhardware(subhardware);
				if (result == null) result = caseHardwareContainerA(subhardware);
				if (result == null) result = caseVariantDependentElementA(subhardware);
				if (result == null) result = caseModeDependentElementA(subhardware);
				if (result == null) result = caseOaamBaseElementA(subhardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseHardwareContainerA(HardwareContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIo(Io object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Symmetry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Symmetry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSymmetry(DeviceSymmetry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardware(Hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subhardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subhardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubhardware(Subhardware object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Provider Instance A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Provider Instance A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceProviderInstanceA(ResourceProviderInstanceA object) {
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

} //HardwareSwitch
