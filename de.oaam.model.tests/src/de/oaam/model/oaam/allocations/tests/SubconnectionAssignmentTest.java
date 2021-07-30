/**
 */
package de.oaam.model.oaam.allocations.tests;

import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.SubconnectionAssignment;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subconnection Assignment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubconnectionAssignmentTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubconnectionAssignmentTest.class);
	}

	/**
	 * Constructs a new Subconnection Assignment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubconnectionAssignmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subconnection Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubconnectionAssignment getFixture() {
		return (SubconnectionAssignment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocationsFactory.eINSTANCE.createSubconnectionAssignment());
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

} //SubconnectionAssignmentTest
