/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.library.DeviceTypeSymmetry;
import de.oaam.model.oaam.library.LibraryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device Type Symmetry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceTypeSymmetryTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeviceTypeSymmetryTest.class);
	}

	/**
	 * Constructs a new Device Type Symmetry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTypeSymmetryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Device Type Symmetry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeviceTypeSymmetry getFixture() {
		return (DeviceTypeSymmetry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createDeviceTypeSymmetry());
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

} //DeviceTypeSymmetryTest
