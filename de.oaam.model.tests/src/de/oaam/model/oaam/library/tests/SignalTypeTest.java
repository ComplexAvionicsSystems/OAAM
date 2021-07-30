/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.SignalType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Signal Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SignalTypeTest extends ResourceConsumerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SignalTypeTest.class);
	}

	/**
	 * Constructs a new Signal Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Signal Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SignalType getFixture() {
		return (SignalType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createSignalType());
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

} //SignalTypeTest
