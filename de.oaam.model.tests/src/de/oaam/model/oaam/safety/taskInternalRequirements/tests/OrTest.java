/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.tests;

import de.oaam.model.oaam.safety.taskInternalRequirements.Or;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrTest extends BooleanOperatorATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrTest.class);
	}

	/**
	 * Constructs a new Or test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Or test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Or getFixture() {
		return (Or)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskInternalRequirementsFactory.eINSTANCE.createOr());
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

} //OrTest
