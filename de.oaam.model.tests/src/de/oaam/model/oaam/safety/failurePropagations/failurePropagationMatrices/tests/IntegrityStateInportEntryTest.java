/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesFactory;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integrity State Inport Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrityStateInportEntryTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegrityStateInportEntryTest.class);
	}

	/**
	 * Constructs a new Integrity State Inport Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateInportEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integrity State Inport Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegrityStateInportEntry getFixture() {
		return (IntegrityStateInportEntry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailurePropagationMatricesFactory.eINSTANCE.createIntegrityStateInportEntry());
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

} //IntegrityStateInportEntryTest
