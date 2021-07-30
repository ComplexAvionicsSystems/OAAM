/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.library.DuctType;
import de.oaam.model.oaam.library.LibraryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Duct Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DuctTypeTest extends ResourceProviderATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DuctTypeTest.class);
	}

	/**
	 * Constructs a new Duct Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Duct Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DuctType getFixture() {
		return (DuctType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createDuctType());
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

} //DuctTypeTest
