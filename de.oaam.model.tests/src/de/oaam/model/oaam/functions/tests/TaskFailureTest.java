/**
 */
package de.oaam.model.oaam.functions.tests;

import de.oaam.model.oaam.common.tests.BoolATest;

import de.oaam.model.oaam.functions.FunctionsFactory;
import de.oaam.model.oaam.functions.TaskFailure;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Failure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskFailureTest extends BoolATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskFailureTest.class);
	}

	/**
	 * Constructs a new Task Failure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFailureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Failure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskFailure getFixture() {
		return (TaskFailure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionsFactory.eINSTANCE.createTaskFailure());
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

} //TaskFailureTest
