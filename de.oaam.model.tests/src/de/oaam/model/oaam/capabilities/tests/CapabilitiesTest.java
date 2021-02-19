/**
 */
package de.oaam.model.oaam.capabilities.tests;

import de.oaam.model.oaam.capabilities.Capabilities;
import de.oaam.model.oaam.capabilities.CapabilitiesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilitiesTest extends CapabilitiesContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CapabilitiesTest.class);
	}

	/**
	 * Constructs a new Capabilities test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Capabilities test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Capabilities getFixture() {
		return (Capabilities)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CapabilitiesFactory.eINSTANCE.createCapabilities());
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

} //CapabilitiesTest
