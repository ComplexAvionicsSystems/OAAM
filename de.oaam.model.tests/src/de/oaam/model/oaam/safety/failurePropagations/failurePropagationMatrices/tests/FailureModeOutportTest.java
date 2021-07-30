/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure Mode Outport</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureModeOutportTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureModeOutportTest.class);
	}

	/**
	 * Constructs a new Failure Mode Outport test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeOutportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Failure Mode Outport test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FailureModeOutport getFixture() {
		return (FailureModeOutport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailurePropagationMatricesFactory.eINSTANCE.createFailureModeOutport());
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

} //FailureModeOutportTest
