/**
 */
package de.oaam.model.oaam.restrictions.tests;

import de.oaam.model.oaam.restrictions.RestrictionsFactory;
import de.oaam.model.oaam.restrictions.TaskSymmetryRestriction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Symmetry Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskSymmetryRestrictionTest extends TaskRestrictionATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskSymmetryRestrictionTest.class);
	}

	/**
	 * Constructs a new Task Symmetry Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSymmetryRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Symmetry Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskSymmetryRestriction getFixture() {
		return (TaskSymmetryRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestrictionsFactory.eINSTANCE.createTaskSymmetryRestriction());
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

} //TaskSymmetryRestrictionTest
