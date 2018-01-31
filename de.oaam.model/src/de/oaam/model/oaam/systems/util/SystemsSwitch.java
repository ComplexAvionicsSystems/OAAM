/**
 */
package de.oaam.model.oaam.systems.util;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import de.oaam.model.oaam.systems.ElectricPower;
import de.oaam.model.oaam.systems.HydraulicPower;
import de.oaam.model.oaam.systems.Information;
import de.oaam.model.oaam.systems.InformationFlow;
import de.oaam.model.oaam.systems.InputSegregation;
import de.oaam.model.oaam.systems.LinearPower;
import de.oaam.model.oaam.systems.Power;
import de.oaam.model.oaam.systems.ProvidedOutputA;
import de.oaam.model.oaam.systems.RequiredInputA;
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
				if (result == null) result = caseElementA(systemsContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.SYSTEMS: {
				Systems systems = (Systems)theEObject;
				T result = caseSystems(systems);
				if (result == null) result = caseSystemsContainerA(systems);
				if (result == null) result = caseElementA(systems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.SUBSYSTEM: {
				Subsystem subsystem = (Subsystem)theEObject;
				T result = caseSubsystem(subsystem);
				if (result == null) result = caseSystemsContainerA(subsystem);
				if (result == null) result = caseModeDependentElementA(subsystem);
				if (result == null) result = caseVariantDependentElementA(subsystem);
				if (result == null) result = caseElementA(subsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.SYSTEM: {
				de.oaam.model.oaam.systems.System system = (de.oaam.model.oaam.systems.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseElementA(system);
				if (result == null) result = caseVariantDependentElementA(system);
				if (result == null) result = caseModeDependentElementA(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.REQUIRED_INPUT_A: {
				RequiredInputA requiredInputA = (RequiredInputA)theEObject;
				T result = caseRequiredInputA(requiredInputA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.PROVIDED_OUTPUT_A: {
				ProvidedOutputA providedOutputA = (ProvidedOutputA)theEObject;
				T result = caseProvidedOutputA(providedOutputA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.INFORMATION: {
				Information information = (Information)theEObject;
				T result = caseInformation(information);
				if (result == null) result = caseProvidedOutputA(information);
				if (result == null) result = caseRequiredInputA(information);
				if (result == null) result = caseElementA(information);
				if (result == null) result = caseModeDependentElementA(information);
				if (result == null) result = caseVariantDependentElementA(information);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.INFORMATION_FLOW: {
				InformationFlow informationFlow = (InformationFlow)theEObject;
				T result = caseInformationFlow(informationFlow);
				if (result == null) result = caseElementA(informationFlow);
				if (result == null) result = caseModeDependentElementA(informationFlow);
				if (result == null) result = caseVariantDependentElementA(informationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.ELECTRIC_POWER: {
				ElectricPower electricPower = (ElectricPower)theEObject;
				T result = caseElectricPower(electricPower);
				if (result == null) result = casePower(electricPower);
				if (result == null) result = caseProvidedOutputA(electricPower);
				if (result == null) result = caseRequiredInputA(electricPower);
				if (result == null) result = caseElementA(electricPower);
				if (result == null) result = caseVariantDependentElementA(electricPower);
				if (result == null) result = caseModeDependentElementA(electricPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.POWER: {
				Power power = (Power)theEObject;
				T result = casePower(power);
				if (result == null) result = caseProvidedOutputA(power);
				if (result == null) result = caseRequiredInputA(power);
				if (result == null) result = caseElementA(power);
				if (result == null) result = caseVariantDependentElementA(power);
				if (result == null) result = caseModeDependentElementA(power);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.HYDRAULIC_POWER: {
				HydraulicPower hydraulicPower = (HydraulicPower)theEObject;
				T result = caseHydraulicPower(hydraulicPower);
				if (result == null) result = casePower(hydraulicPower);
				if (result == null) result = caseProvidedOutputA(hydraulicPower);
				if (result == null) result = caseRequiredInputA(hydraulicPower);
				if (result == null) result = caseElementA(hydraulicPower);
				if (result == null) result = caseVariantDependentElementA(hydraulicPower);
				if (result == null) result = caseModeDependentElementA(hydraulicPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.ROTARY_POWER: {
				RotaryPower rotaryPower = (RotaryPower)theEObject;
				T result = caseRotaryPower(rotaryPower);
				if (result == null) result = casePower(rotaryPower);
				if (result == null) result = caseProvidedOutputA(rotaryPower);
				if (result == null) result = caseRequiredInputA(rotaryPower);
				if (result == null) result = caseElementA(rotaryPower);
				if (result == null) result = caseVariantDependentElementA(rotaryPower);
				if (result == null) result = caseModeDependentElementA(rotaryPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.LINEAR_POWER: {
				LinearPower linearPower = (LinearPower)theEObject;
				T result = caseLinearPower(linearPower);
				if (result == null) result = casePower(linearPower);
				if (result == null) result = caseProvidedOutputA(linearPower);
				if (result == null) result = caseRequiredInputA(linearPower);
				if (result == null) result = caseElementA(linearPower);
				if (result == null) result = caseVariantDependentElementA(linearPower);
				if (result == null) result = caseModeDependentElementA(linearPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemsPackage.INPUT_SEGREGATION: {
				InputSegregation inputSegregation = (InputSegregation)theEObject;
				T result = caseInputSegregation(inputSegregation);
				if (result == null) result = caseElementA(inputSegregation);
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
	 * Returns the result of interpreting the object as an instance of '<em>Required Input A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Input A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredInputA(RequiredInputA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Output A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Output A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedOutputA(ProvidedOutputA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformation(Information object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePower(Power object) {
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
	public T caseElementA(ElementA object) {
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
