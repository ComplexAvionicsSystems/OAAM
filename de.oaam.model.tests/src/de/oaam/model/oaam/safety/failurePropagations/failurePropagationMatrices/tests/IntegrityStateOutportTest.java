/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesFactory;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integrity State Outport</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrityStateOutportTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegrityStateOutportTest.class);
	}

	/**
	 * Constructs a new Integrity State Outport test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateOutportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integrity State Outport test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegrityStateOutport getFixture() {
		return (IntegrityStateOutport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailurePropagationMatricesFactory.eINSTANCE.createIntegrityStateOutport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntegrityStateOutportTest
