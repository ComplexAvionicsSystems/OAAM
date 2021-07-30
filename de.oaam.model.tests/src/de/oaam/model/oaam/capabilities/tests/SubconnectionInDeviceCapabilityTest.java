/**
 */
package de.oaam.model.oaam.capabilities.tests;

import de.oaam.model.oaam.capabilities.CapabilitiesFactory;
import de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subconnection In Device Capability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubconnectionInDeviceCapabilityTest extends CapabilityATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubconnectionInDeviceCapabilityTest.class);
	}

	/**
	 * Constructs a new Subconnection In Device Capability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubconnectionInDeviceCapabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subconnection In Device Capability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubconnectionInDeviceCapability getFixture() {
		return (SubconnectionInDeviceCapability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CapabilitiesFactory.eINSTANCE.createSubconnectionInDeviceCapability());
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

} //SubconnectionInDeviceCapabilityTest
