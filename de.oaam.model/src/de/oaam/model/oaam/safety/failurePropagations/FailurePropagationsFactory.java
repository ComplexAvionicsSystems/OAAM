/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage
 * @generated
 */
public interface FailurePropagationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailurePropagationsFactory eINSTANCE = de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Failure Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Propagation</em>'.
	 * @generated
	 */
	FailurePropagation createFailurePropagation();

	/**
	 * Returns a new object of class '<em>Boolean And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean And</em>'.
	 * @generated
	 */
	BooleanAnd createBooleanAnd();

	/**
	 * Returns a new object of class '<em>Boolean Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Or</em>'.
	 * @generated
	 */
	BooleanOr createBooleanOr();

	/**
	 * Returns a new object of class '<em>Boolean Xor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Xor</em>'.
	 * @generated
	 */
	BooleanXor createBooleanXor();

	/**
	 * Returns a new object of class '<em>Boolean Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Not</em>'.
	 * @generated
	 */
	BooleanNot createBooleanNot();

	/**
	 * Returns a new object of class '<em>Integrity State Boolean Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrity State Boolean Conversion</em>'.
	 * @generated
	 */
	IntegrityStateBooleanConversion createIntegrityStateBooleanConversion();

	/**
	 * Returns a new object of class '<em>Failure Mode Boolean Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode Boolean Conversion</em>'.
	 * @generated
	 */
	FailureModeBooleanConversion createFailureModeBooleanConversion();

	/**
	 * Returns a new object of class '<em>Boolean Failure Mode Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Failure Mode Conversion</em>'.
	 * @generated
	 */
	BooleanFailureModeConversion createBooleanFailureModeConversion();

	/**
	 * Returns a new object of class '<em>Integrity State Failure Mode Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrity State Failure Mode Conversion</em>'.
	 * @generated
	 */
	IntegrityStateFailureModeConversion createIntegrityStateFailureModeConversion();

	/**
	 * Returns a new object of class '<em>Failure Mode Integrity State Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode Integrity State Conversion</em>'.
	 * @generated
	 */
	FailureModeIntegrityStateConversion createFailureModeIntegrityStateConversion();

	/**
	 * Returns a new object of class '<em>Boolean Integrity State Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Integrity State Conversion</em>'.
	 * @generated
	 */
	BooleanIntegrityStateConversion createBooleanIntegrityStateConversion();

	/**
	 * Returns a new object of class '<em>Propagation Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagation Input</em>'.
	 * @generated
	 */
	PropagationInput createPropagationInput();

	/**
	 * Returns a new object of class '<em>Propagation Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagation Output</em>'.
	 * @generated
	 */
	PropagationOutput createPropagationOutput();

	/**
	 * Returns a new object of class '<em>Propagation Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagation Source</em>'.
	 * @generated
	 */
	PropagationSource createPropagationSource();

	/**
	 * Returns a new object of class '<em>Propagation Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagation Sink</em>'.
	 * @generated
	 */
	PropagationSink createPropagationSink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FailurePropagationsPackage getFailurePropagationsPackage();

} //FailurePropagationsFactory
