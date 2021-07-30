/**
 */
package de.oaam.model.oaam.capabilities.tests;

import de.oaam.model.oaam.capabilities.CapabilitiesFactory;
import de.oaam.model.oaam.capabilities.DeviceInLocationCapability;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device In Location Capability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceInLocationCapabilityTest extends CapabilityATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeviceInLocationCapabilityTest.class);
	}

	/**
	 * Constructs a new Device In Location Capability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceInLocationCapabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Device In Location Capability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeviceInLocationCapability getFixture() {
		return (DeviceInLocationCapability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CapabilitiesFactory.eINSTANCE.createDeviceInLocationCapability());
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

} //DeviceInLocationCapabilityTest
