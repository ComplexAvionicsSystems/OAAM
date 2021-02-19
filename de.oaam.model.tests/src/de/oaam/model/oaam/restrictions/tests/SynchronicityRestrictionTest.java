/**
 */
package de.oaam.model.oaam.restrictions.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.restrictions.RestrictionsFactory;
import de.oaam.model.oaam.restrictions.SynchronicityRestriction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Synchronicity Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronicityRestrictionTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SynchronicityRestrictionTest.class);
	}

	/**
	 * Constructs a new Synchronicity Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronicityRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Synchronicity Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SynchronicityRestriction getFixture() {
		return (SynchronicityRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestrictionsFactory.eINSTANCE.createSynchronicityRestriction());
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

} //SynchronicityRestrictionTest
