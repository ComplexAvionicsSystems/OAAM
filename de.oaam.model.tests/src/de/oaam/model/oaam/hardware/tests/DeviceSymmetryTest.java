/**
 */
package de.oaam.model.oaam.hardware.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.hardware.DeviceSymmetry;
import de.oaam.model.oaam.hardware.HardwareFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device Symmetry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceSymmetryTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeviceSymmetryTest.class);
	}

	/**
	 * Constructs a new Device Symmetry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceSymmetryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Device Symmetry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeviceSymmetry getFixture() {
		return (DeviceSymmetry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HardwareFactory.eINSTANCE.createDeviceSymmetry());
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

} //DeviceSymmetryTest
