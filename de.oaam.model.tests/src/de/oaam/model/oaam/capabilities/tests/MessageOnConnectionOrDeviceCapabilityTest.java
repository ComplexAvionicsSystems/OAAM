/**
 */
package de.oaam.model.oaam.capabilities.tests;

import de.oaam.model.oaam.capabilities.CapabilitiesFactory;
import de.oaam.model.oaam.capabilities.MessageOnConnectionOrDeviceCapability;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message On Connection Or Device Capability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageOnConnectionOrDeviceCapabilityTest extends CapabilityATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageOnConnectionOrDeviceCapabilityTest.class);
	}

	/**
	 * Constructs a new Message On Connection Or Device Capability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOnConnectionOrDeviceCapabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message On Connection Or Device Capability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MessageOnConnectionOrDeviceCapability getFixture() {
		return (MessageOnConnectionOrDeviceCapability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CapabilitiesFactory.eINSTANCE.createMessageOnConnectionOrDeviceCapability());
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

} //MessageOnConnectionOrDeviceCapabilityTest
