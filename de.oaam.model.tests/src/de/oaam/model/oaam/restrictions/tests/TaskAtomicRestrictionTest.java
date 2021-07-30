/**
 */
package de.oaam.model.oaam.restrictions.tests;

import de.oaam.model.oaam.restrictions.RestrictionsFactory;
import de.oaam.model.oaam.restrictions.TaskAtomicRestriction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Atomic Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskAtomicRestrictionTest extends TaskRestrictionATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskAtomicRestrictionTest.class);
	}

	/**
	 * Constructs a new Task Atomic Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAtomicRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Atomic Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskAtomicRestriction getFixture() {
		return (TaskAtomicRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestrictionsFactory.eINSTANCE.createTaskAtomicRestriction());
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

} //TaskAtomicRestrictionTest
