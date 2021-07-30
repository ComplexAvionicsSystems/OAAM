/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.tests;

import de.oaam.model.oaam.safety.taskInternalRequirements.Above;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Above</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AboveTest extends ComparatorATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AboveTest.class);
	}

	/**
	 * Constructs a new Above test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AboveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Above test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Above getFixture() {
		return (Above)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskInternalRequirementsFactory.eINSTANCE.createAbove());
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

} //AboveTest
