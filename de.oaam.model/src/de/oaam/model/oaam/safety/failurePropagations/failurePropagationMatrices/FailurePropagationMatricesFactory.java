/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage
 * @generated
 */
public interface FailurePropagationMatricesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailurePropagationMatricesFactory eINSTANCE = de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Failure Mode Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode Matrix</em>'.
	 * @generated
	 */
	FailureModeMatrix createFailureModeMatrix();

	/**
	 * Returns a new object of class '<em>Integrity State Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrity State Matrix</em>'.
	 * @generated
	 */
	IntegrityStateMatrix createIntegrityStateMatrix();

	/**
	 * Returns a new object of class '<em>Boolean Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Matrix</em>'.
	 * @generated
	 */
	BooleanMatrix createBooleanMatrix();

	/**
	 * Returns a new object of class '<em>Failure Mode Inport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode Inport</em>'.
	 * @generated
	 */
	FailureModeInport createFailureModeInport();

	/**
	 * Returns a new object of class '<em>Failure Mode Outport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode Outport</em>'.
	 * @generated
	 */
	FailureModeOutport createFailureModeOutport();

	/**
	 * Returns a new object of class '<em>Failure Mode Matrix Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode Matrix Row</em>'.
	 * @generated
	 */
	FailureModeMatrixRow createFailureModeMatrixRow();

	/**
	 * Returns a new object of class '<em>Failure Mode Inport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode Inport Entry</em>'.
	 * @generated
	 */
	FailureModeInportEntry createFailureModeInportEntry();

	/**
	 * Returns a new object of class '<em>Failure Mode Outport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode Outport Entry</em>'.
	 * @generated
	 */
	FailureModeOutportEntry createFailureModeOutportEntry();

	/**
	 * Returns a new object of class '<em>Integrity State Outport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrity State Outport</em>'.
	 * @generated
	 */
	IntegrityStateOutport createIntegrityStateOutport();

	/**
	 * Returns a new object of class '<em>Integrity State Inport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrity State Inport</em>'.
	 * @generated
	 */
	IntegrityStateInport createIntegrityStateInport();

	/**
	 * Returns a new object of class '<em>Integrity State Matrix Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrity State Matrix Row</em>'.
	 * @generated
	 */
	IntegrityStateMatrixRow createIntegrityStateMatrixRow();

	/**
	 * Returns a new object of class '<em>Integrity State Inport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrity State Inport Entry</em>'.
	 * @generated
	 */
	IntegrityStateInportEntry createIntegrityStateInportEntry();

	/**
	 * Returns a new object of class '<em>Integrity State Outport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrity State Outport Entry</em>'.
	 * @generated
	 */
	IntegrityStateOutportEntry createIntegrityStateOutportEntry();

	/**
	 * Returns a new object of class '<em>Boolean Inport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Inport</em>'.
	 * @generated
	 */
	BooleanInport createBooleanInport();

	/**
	 * Returns a new object of class '<em>Boolean Outport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Outport</em>'.
	 * @generated
	 */
	BooleanOutport createBooleanOutport();

	/**
	 * Returns a new object of class '<em>Boolean Matrix Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Matrix Row</em>'.
	 * @generated
	 */
	BooleanMatrixRow createBooleanMatrixRow();

	/**
	 * Returns a new object of class '<em>Boolean Inport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Inport Entry</em>'.
	 * @generated
	 */
	BooleanInportEntry createBooleanInportEntry();

	/**
	 * Returns a new object of class '<em>Boolean Outport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Outport Entry</em>'.
	 * @generated
	 */
	BooleanOutportEntry createBooleanOutportEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FailurePropagationMatricesPackage getFailurePropagationMatricesPackage();

} //FailurePropagationMatricesFactory
