/**
 */
package de.oaam.model.oaam.anatomy.tests;

import de.oaam.model.oaam.anatomy.AnatomyFactory;
import de.oaam.model.oaam.anatomy.LocationSymmetry;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Location Symmetry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationSymmetryTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocationSymmetryTest.class);
	}

	/**
	 * Constructs a new Location Symmetry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationSymmetryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Location Symmetry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LocationSymmetry getFixture() {
		return (LocationSymmetry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnatomyFactory.eINSTANCE.createLocationSymmetry());
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

} //LocationSymmetryTest
