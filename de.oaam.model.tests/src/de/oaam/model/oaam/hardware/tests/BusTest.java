/**
 */
package de.oaam.model.oaam.hardware.tests;

import de.oaam.model.oaam.hardware.Bus;
import de.oaam.model.oaam.hardware.HardwareFactory;

import de.oaam.model.oaam.library.tests.ResourceProviderInstanceATest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusTest extends ResourceProviderInstanceATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusTest.class);
	}

	/**
	 * Constructs a new Bus test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Bus getFixture() {
		return (Bus)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HardwareFactory.eINSTANCE.createBus());
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

} //BusTest
