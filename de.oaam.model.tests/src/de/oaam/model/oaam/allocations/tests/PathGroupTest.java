/**
 */
package de.oaam.model.oaam.allocations.tests;

import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.PathGroup;

import de.oaam.model.oaam.scenario.tests.ModeDependentElementATest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Path Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathGroupTest extends ModeDependentElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PathGroupTest.class);
	}

	/**
	 * Constructs a new Path Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Path Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PathGroup getFixture() {
		return (PathGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocationsFactory.eINSTANCE.createPathGroup());
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

} //PathGroupTest
