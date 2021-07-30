/**
 */
package de.oaam.model.oaam.restrictions.tests;

import de.oaam.model.oaam.restrictions.ConnectionTypeRestriction;
import de.oaam.model.oaam.restrictions.RestrictionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connection Type Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionTypeRestrictionTest extends SignalRestrictionATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectionTypeRestrictionTest.class);
	}

	/**
	 * Constructs a new Connection Type Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTypeRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Connection Type Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConnectionTypeRestriction getFixture() {
		return (ConnectionTypeRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestrictionsFactory.eINSTANCE.createConnectionTypeRestriction());
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

} //ConnectionTypeRestrictionTest
