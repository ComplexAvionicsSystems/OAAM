/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.LibraryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connection Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionTypeTest extends ResourceProviderATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectionTypeTest.class);
	}

	/**
	 * Constructs a new Connection Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Connection Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConnectionType getFixture() {
		return (ConnectionType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createConnectionType());
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

} //ConnectionTypeTest
