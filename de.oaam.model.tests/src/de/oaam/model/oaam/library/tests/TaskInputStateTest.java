/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.common.tests.BoolATest;

import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.TaskInputState;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Input State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskInputStateTest extends BoolATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskInputStateTest.class);
	}

	/**
	 * Constructs a new Task Input State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInputStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Input State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskInputState getFixture() {
		return (TaskInputState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createTaskInputState());
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

} //TaskInputStateTest
