/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.LocationType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationTypeTest extends ResourceProviderATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocationTypeTest.class);
	}

	/**
	 * Constructs a new Location Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Location Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LocationType getFixture() {
		return (LocationType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createLocationType());
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

} //LocationTypeTest
