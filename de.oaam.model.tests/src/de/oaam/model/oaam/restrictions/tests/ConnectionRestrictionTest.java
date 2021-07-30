/**
 */
package de.oaam.model.oaam.restrictions.tests;

import de.oaam.model.oaam.restrictions.ConnectionRestriction;
import de.oaam.model.oaam.restrictions.RestrictionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connection Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionRestrictionTest extends SignalRestrictionATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectionRestrictionTest.class);
	}

	/**
	 * Constructs a new Connection Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Connection Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConnectionRestriction getFixture() {
		return (ConnectionRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestrictionsFactory.eINSTANCE.createConnectionRestriction());
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

} //ConnectionRestrictionTest
