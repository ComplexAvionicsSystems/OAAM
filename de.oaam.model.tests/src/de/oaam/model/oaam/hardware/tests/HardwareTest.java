/**
 */
package de.oaam.model.oaam.hardware.tests;

import de.oaam.model.oaam.hardware.Hardware;
import de.oaam.model.oaam.hardware.HardwareFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareTest extends HardwareContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareTest.class);
	}

	/**
	 * Constructs a new Hardware test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hardware test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Hardware getFixture() {
		return (Hardware)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HardwareFactory.eINSTANCE.createHardware());
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

} //HardwareTest
