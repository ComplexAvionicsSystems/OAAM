/**
 */
package de.oaam.model.oaam.safety;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.safety.SafetyPackage
 * @generated
 */
public interface SafetyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SafetyFactory eINSTANCE = de.oaam.model.oaam.safety.impl.SafetyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Part Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Failure Mode</em>'.
	 * @generated
	 */
	PartFailureMode createPartFailureMode();

	/**
	 * Returns a new object of class '<em>Failure Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Effect</em>'.
	 * @generated
	 */
	FailureEffect createFailureEffect();

	/**
	 * Returns a new object of class '<em>Fault Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Propagation</em>'.
	 * @generated
	 */
	FaultPropagation createFaultPropagation();

	/**
	 * Returns a new object of class '<em>Functional Failure Mode Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Failure Mode Set</em>'.
	 * @generated
	 */
	FunctionalFailureModeSet createFunctionalFailureModeSet();

	/**
	 * Returns a new object of class '<em>Functional Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Failure Mode</em>'.
	 * @generated
	 */
	FunctionalFailureMode createFunctionalFailureMode();

	/**
	 * Returns a new object of class '<em>Requirement Failure Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Failure Effect</em>'.
	 * @generated
	 */
	RequirementFailureEffect createRequirementFailureEffect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SafetyPackage getSafetyPackage();

} //SafetyFactory
