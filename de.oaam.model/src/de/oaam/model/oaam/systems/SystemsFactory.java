/**
 */
package de.oaam.model.oaam.systems;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.systems.SystemsPackage
 * @generated
 */
public interface SystemsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemsFactory eINSTANCE = de.oaam.model.oaam.systems.impl.SystemsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Systems</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Systems</em>'.
	 * @generated
	 */
	Systems createSystems();

	/**
	 * Returns a new object of class '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsystem</em>'.
	 * @generated
	 */
	Subsystem createSubsystem();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Flow</em>'.
	 * @generated
	 */
	InformationFlow createInformationFlow();

	/**
	 * Returns a new object of class '<em>Information Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Signal</em>'.
	 * @generated
	 */
	InformationSignal createInformationSignal();

	/**
	 * Returns a new object of class '<em>Information Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Material</em>'.
	 * @generated
	 */
	InformationMaterial createInformationMaterial();

	/**
	 * Returns a new object of class '<em>Information Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Power</em>'.
	 * @generated
	 */
	InformationPower createInformationPower();

	/**
	 * Returns a new object of class '<em>Electric Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electric Power</em>'.
	 * @generated
	 */
	ElectricPower createElectricPower();

	/**
	 * Returns a new object of class '<em>Hydraulic Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydraulic Power</em>'.
	 * @generated
	 */
	HydraulicPower createHydraulicPower();

	/**
	 * Returns a new object of class '<em>Rotary Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotary Power</em>'.
	 * @generated
	 */
	RotaryPower createRotaryPower();

	/**
	 * Returns a new object of class '<em>Linear Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Power</em>'.
	 * @generated
	 */
	LinearPower createLinearPower();

	/**
	 * Returns a new object of class '<em>Input Segregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Segregation</em>'.
	 * @generated
	 */
	InputSegregation createInputSegregation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemsPackage getSystemsPackage();

} //SystemsFactory
