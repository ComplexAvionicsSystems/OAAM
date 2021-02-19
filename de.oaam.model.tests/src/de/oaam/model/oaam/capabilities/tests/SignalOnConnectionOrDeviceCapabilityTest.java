/**
 */
package de.oaam.model.oaam.capabilities.tests;

import de.oaam.model.oaam.capabilities.CapabilitiesFactory;
import de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Signal On Connection Or Device Capability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SignalOnConnectionOrDeviceCapabilityTest extends CapabilityATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SignalOnConnectionOrDeviceCapabilityTest.class);
	}

	/**
	 * Constructs a new Signal On Connection Or Device Capability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalOnConnectionOrDeviceCapabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Signal On Connection Or Device Capability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SignalOnConnectionOrDeviceCapability getFixture() {
		return (SignalOnConnectionOrDeviceCapability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CapabilitiesFactory.eINSTANCE.createSignalOnConnectionOrDeviceCapability());
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

} //SignalOnConnectionOrDeviceCapabilityTest
