/**
 */
package de.oaam.model.oaam.safety.failurePropagations.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure Mode Boolean Conversion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureModeBooleanConversionTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureModeBooleanConversionTest.class);
	}

	/**
	 * Constructs a new Failure Mode Boolean Conversion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeBooleanConversionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Failure Mode Boolean Conversion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FailureModeBooleanConversion getFixture() {
		return (FailureModeBooleanConversion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailurePropagationsFactory.eINSTANCE.createFailureModeBooleanConversion());
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

} //FailureModeBooleanConversionTest
