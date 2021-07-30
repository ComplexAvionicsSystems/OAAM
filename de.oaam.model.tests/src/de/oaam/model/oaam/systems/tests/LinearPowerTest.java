/**
 */
package de.oaam.model.oaam.systems.tests;

import de.oaam.model.oaam.systems.LinearPower;
import de.oaam.model.oaam.systems.SystemsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Linear Power</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinearPowerTest extends InformationPowerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinearPowerTest.class);
	}

	/**
	 * Constructs a new Linear Power test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearPowerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Linear Power test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinearPower getFixture() {
		return (LinearPower)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemsFactory.eINSTANCE.createLinearPower());
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

} //LinearPowerTest
