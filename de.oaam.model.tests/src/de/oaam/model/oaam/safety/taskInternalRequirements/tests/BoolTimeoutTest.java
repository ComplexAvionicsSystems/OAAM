/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.tests;

import de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bool Timeout</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoolTimeoutTest extends ComplexOperatorATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoolTimeoutTest.class);
	}

	/**
	 * Constructs a new Bool Timeout test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolTimeoutTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bool Timeout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BoolTimeout getFixture() {
		return (BoolTimeout)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskInternalRequirementsFactory.eINSTANCE.createBoolTimeout());
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

} //BoolTimeoutTest
