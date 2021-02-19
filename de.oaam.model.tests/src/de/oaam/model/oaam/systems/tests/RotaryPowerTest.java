/**
 */
package de.oaam.model.oaam.systems.tests;

import de.oaam.model.oaam.systems.RotaryPower;
import de.oaam.model.oaam.systems.SystemsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rotary Power</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RotaryPowerTest extends InformationPowerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RotaryPowerTest.class);
	}

	/**
	 * Constructs a new Rotary Power test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotaryPowerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rotary Power test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RotaryPower getFixture() {
		return (RotaryPower)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemsFactory.eINSTANCE.createRotaryPower());
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

} //RotaryPowerTest
