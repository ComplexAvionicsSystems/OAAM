/**
 */
package de.oaam.model.oaam.systems.tests;

import de.oaam.model.oaam.systems.HydraulicPower;
import de.oaam.model.oaam.systems.SystemsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hydraulic Power</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HydraulicPowerTest extends InformationPowerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HydraulicPowerTest.class);
	}

	/**
	 * Constructs a new Hydraulic Power test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraulicPowerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hydraulic Power test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HydraulicPower getFixture() {
		return (HydraulicPower)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemsFactory.eINSTANCE.createHydraulicPower());
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

} //HydraulicPowerTest
