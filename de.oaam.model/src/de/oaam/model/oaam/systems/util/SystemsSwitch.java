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
 * @see de.oaam.model.oaam.systems.SystemsPackage
 * @generated
 */
public class SystemsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemsSwitch() {
		if (modelPackage == null) {
			modelPackage = SystemsPackage.eINSTANCE;
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
			case SystemsPackage.SYSTEMS_CONTAINER_A: {
				SystemsContainerA systemsContainerA = (SystemsContainerA)theEObject;
				T result = caseSystemsContainerA(systemsContainerA);
				if (result == null) result = caseOaamBaseElementA(systemsContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.SYSTEMS: {
				Systems systems = (Systems)theEObject;
				T result = caseSystems(systems);
				if (result == null) result = caseSystemsContainerA(systems);
				if (result == null) result = caseOaamBaseElementA(systems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.SUBSYSTEM: {
				Subsystem subsystem = (Subsystem)theEObject;
				T result = caseSubsystem(subsystem);
				if (result == null) result = caseSystemsContainerA(subsystem);
				if (result == null) result = caseModeDependentElementA(subsystem);
				if (result == null) result = caseVariantDependentElementA(subsystem);
				if (result == null) result = caseOaamBaseElementA(subsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.SYSTEM: {
				de.oaam.model.oaam.systems.System system = (de.oaam.model.oaam.systems.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseOaamBaseElementA(system);
				if (result == null) result = caseVariantDependentElementA(system);
				if (result == null) result = caseModeDependentElementA(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.REQUIRED_INFORMATION_A: {
				RequiredInformationA requiredInformationA = (RequiredInformationA)theEObject;
				T result = caseRequiredInformationA(requiredInformationA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.PROVIDED_INFORMATION_A: {
				ProvidedInformationA providedInformationA = (ProvidedInformationA)theEObject;
				T result = caseProvidedInformationA(providedInformationA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.INFORMATION_FLOW: {
				InformationFlow informationFlow = (InformationFlow)theEObject;
				T result = caseInformationFlow(informationFlow);
				if (result == null) result = caseOaamBaseElementA(informationFlow);
				if (result == null) result = caseModeDependentElementA(informationFlow);
				if (result == null) result = caseVariantDependentElementA(informationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.INFORMATION_SIGNAL: {
				InformationSignal informationSignal = (InformationSignal)theEObject;
				T result = caseInformationSignal(informationSignal);
				if (result == null) result = caseProvidedInformationA(informationSignal);
				if (result == null) result = caseRequiredInformationA(informationSignal);
				if (result == null) result = caseOaamBaseElementA(informationSignal);
				if (result == null) result = caseModeDependentElementA(informationSignal);
				if (result == null) result = caseVariantDependentElementA(informationSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.INFORMATION_MATERIAL: {
				InformationMaterial informationMaterial = (InformationMaterial)theEObject;
				T result = caseInformationMaterial(informationMaterial);
				if (result == null) result = caseProvidedInformationA(informationMaterial);
				if (result == null) result = caseRequiredInformationA(informationMaterial);
				if (result == null) result = caseOaamBaseElementA(informationMaterial);
				if (result == null) result = caseModeDependentElementA(informationMaterial);
				if (result == null) result = caseVariantDependentElementA(informationMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.INFORMATION_POWER: {
				InformationPower informationPower = (InformationPower)theEObject;
				T result = caseInformationPower(informationPower);
				if (result == null) result = caseProvidedInformationA(informationPower);
				if (result == null) result = caseRequiredInformationA(informationPower);
				if (result == null) result = caseOaamBaseElementA(informationPower);
				if (result == null) result = caseVariantDependentElementA(informationPower);
				if (result == null) result = caseModeDependentElementA(informationPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.ELECTRIC_POWER: {
				ElectricPower electricPower = (ElectricPower)theEObject;
				T result = caseElectricPower(electricPower);
				if (result == null) result = caseInformationPower(electricPower);
				if (result == null) result = caseProvidedInformationA(electricPower);
				if (result == null) result = caseRequiredInformationA(electricPower);
				if (result == null) result = caseOaamBaseElementA(electricPower);
				if (result == null) result = caseVariantDependentElementA(electricPower);
				if (result == null) result = caseModeDependentElementA(electricPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.HYDRAULIC_POWER: {
				HydraulicPower hydraulicPower = (HydraulicPower)theEObject;
				T result = caseHydraulicPower(hydraulicPower);
				if (result == null) result = caseInformationPower(hydraulicPower);
				if (result == null) result = caseProvidedInformationA(hydraulicPower);
				if (result == null) result = caseRequiredInformationA(hydraulicPower);
				if (result == null) result = caseOaamBaseElementA(hydraulicPower);
				if (result == null) result = caseVariantDependentElementA(hydraulicPower);
				if (result == null) result = caseModeDependentElementA(hydraulicPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.ROTARY_POWER: {
				RotaryPower rotaryPower = (RotaryPower)theEObject;
				T result = caseRotaryPower(rotaryPower);
				if (result == null) result = caseInformationPower(rotaryPower);
				if (result == null) result = caseProvidedInformationA(rotaryPower);
				if (result == null) result = caseRequiredInformationA(rotaryPower);
				if (result == null) result = caseOaamBaseElementA(rotaryPower);
				if (result == null) result = caseVariantDependentElementA(rotaryPower);
				if (result == null) result = caseModeDependentElementA(rotaryPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.LINEAR_POWER: {
				LinearPower linearPower = (LinearPower)theEObject;
				T result = caseLinearPower(linearPower);
				if (result == null) result = caseInformationPower(linearPower);
				if (result == null) result = caseProvidedInformationA(linearPower);
				if (result == null) result = caseRequiredInformationA(linearPower);
				if (result == null) result = caseOaamBaseElementA(linearPower);
				if (result == null) result = caseVariantDependentElementA(linearPower);
				if (result == null) result = caseModeDependentElementA(linearPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.INPUT_SEGREGATION: {
				InputSegregation inputSegregation = (InputSegregation)theEObject;
				T result = caseInputSegregation(inputSegregation);
				if (result == null) result = caseOaamBaseElementA(inputSegregation);
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
	public T caseSystemsContainerA(SystemsContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systems</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systems</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystems(Systems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsystem(Subsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(de.oaam.model.oaam.systems.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Information A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Information A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredInformationA(RequiredInformationA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Information A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Information A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedInformationA(ProvidedInformationA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationFlow(InformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationSignal(InformationSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationMaterial(InformationMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationPower(InformationPower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electric Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electric Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricPower(ElectricPower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydraulic Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydraulic Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydraulicPower(HydraulicPower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotary Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotary Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotaryPower(RotaryPower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearPower(LinearPower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Segregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Segregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputSegregation(InputSegregation object) {
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

} //SystemsSwitch
