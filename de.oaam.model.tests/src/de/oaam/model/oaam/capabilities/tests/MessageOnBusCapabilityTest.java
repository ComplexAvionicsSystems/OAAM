/**
 */
package de.oaam.model.oaam.capabilities.tests;

import de.oaam.model.oaam.capabilities.CapabilitiesFactory;
import de.oaam.model.oaam.capabilities.MessageOnBusCapability;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message On Bus Capability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageOnBusCapabilityTest extends CapabilityATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageOnBusCapabilityTest.class);
	}

	/**
	 * Constructs a new Message On Bus Capability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOnBusCapabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message On Bus Capability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MessageOnBusCapability getFixture() {
		return (MessageOnBusCapability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CapabilitiesFactory.eINSTANCE.createMessageOnBusCapability());
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

} //MessageOnBusCapabilityTest
