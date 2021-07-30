/**
 */
package de.oaam.model.oaam.functions.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.functions.FunctionsFactory;
import de.oaam.model.oaam.functions.TaskRedundancy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Redundancy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskRedundancyTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskRedundancyTest.class);
	}

	/**
	 * Constructs a new Task Redundancy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRedundancyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Redundancy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskRedundancy getFixture() {
		return (TaskRedundancy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionsFactory.eINSTANCE.createTaskRedundancy());
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

} //TaskRedundancyTest
