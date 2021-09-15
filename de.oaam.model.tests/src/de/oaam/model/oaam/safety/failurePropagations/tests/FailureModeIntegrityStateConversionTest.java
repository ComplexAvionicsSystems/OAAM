/**
 */
package de.oaam.model.oaam.safety.failurePropagations.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure Mode Integrity State Conversion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureModeIntegrityStateConversionTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureModeIntegrityStateConversionTest.class);
	}

	/**
	 * Constructs a new Failure Mode Integrity State Conversion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeIntegrityStateConversionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Failure Mode Integrity State Conversion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FailureModeIntegrityStateConversion getFixture() {
		return (FailureModeIntegrityStateConversion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailurePropagationsFactory.eINSTANCE.createFailureModeIntegrityStateConversion());
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

} //FailureModeIntegrityStateConversionTest
