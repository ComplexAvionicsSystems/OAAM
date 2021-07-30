/**
 */
package de.oaam.model.oaam.allocations.tests;

import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.ScheduledTime;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scheduled Time</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScheduledTimeTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScheduledTimeTest.class);
	}

	/**
	 * Constructs a new Scheduled Time test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledTimeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Scheduled Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScheduledTime getFixture() {
		return (ScheduledTime)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocationsFactory.eINSTANCE.createScheduledTime());
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

} //ScheduledTimeTest
