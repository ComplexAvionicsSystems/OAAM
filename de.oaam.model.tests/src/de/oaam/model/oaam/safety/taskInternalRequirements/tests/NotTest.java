/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.tests;

import de.oaam.model.oaam.safety.taskInternalRequirements.Not;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotTest extends BooleanOperatorATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotTest.class);
	}

	/**
	 * Constructs a new Not test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Not getFixture() {
		return (Not)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskInternalRequirementsFactory.eINSTANCE.createNot());
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

} //NotTest
