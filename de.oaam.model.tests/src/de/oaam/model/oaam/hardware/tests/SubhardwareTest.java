/**
 */
package de.oaam.model.oaam.hardware.tests;

import de.oaam.model.oaam.hardware.HardwareFactory;
import de.oaam.model.oaam.hardware.Subhardware;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subhardware</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubhardwareTest extends HardwareContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubhardwareTest.class);
	}

	/**
	 * Constructs a new Subhardware test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubhardwareTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subhardware test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Subhardware getFixture() {
		return (Subhardware)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HardwareFactory.eINSTANCE.createSubhardware());
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

} //SubhardwareTest
