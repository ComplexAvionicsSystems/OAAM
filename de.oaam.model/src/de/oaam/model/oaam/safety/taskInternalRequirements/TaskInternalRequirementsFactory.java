/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage
 * @generated
 */
public interface TaskInternalRequirementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskInternalRequirementsFactory eINSTANCE = de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task Internal Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Internal Requirement</em>'.
	 * @generated
	 */
	TaskInternalRequirement createTaskInternalRequirement();

	/**
	 * Returns a new object of class '<em>Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement</em>'.
	 * @generated
	 */
	Agreement createAgreement();

	/**
	 * Returns a new object of class '<em>Below</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Below</em>'.
	 * @generated
	 */
	Below createBelow();

	/**
	 * Returns a new object of class '<em>Above</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Above</em>'.
	 * @generated
	 */
	Above createAbove();

	/**
	 * Returns a new object of class '<em>Io Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io Signal</em>'.
	 * @generated
	 */
	IoSignal createIoSignal();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Bool Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Timeout</em>'.
	 * @generated
	 */
	BoolTimeout createBoolTimeout();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskInternalRequirementsPackage getTaskInternalRequirementsPackage();

} //TaskInternalRequirementsFactory
