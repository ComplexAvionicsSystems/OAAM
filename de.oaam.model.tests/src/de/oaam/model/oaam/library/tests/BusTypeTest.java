/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.library.BusType;
import de.oaam.model.oaam.library.LibraryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusTypeTest extends ResourceProviderATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusTypeTest.class);
	}

	/**
	 * Constructs a new Bus Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusType getFixture() {
		return (BusType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createBusType());
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

} //BusTypeTest
