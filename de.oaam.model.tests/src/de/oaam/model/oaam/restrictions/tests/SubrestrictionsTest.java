/**
 */
package de.oaam.model.oaam.restrictions.tests;

import de.oaam.model.oaam.restrictions.RestrictionsFactory;
import de.oaam.model.oaam.restrictions.Subrestrictions;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subrestrictions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubrestrictionsTest extends RestrictionsContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubrestrictionsTest.class);
	}

	/**
	 * Constructs a new Subrestrictions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrestrictionsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subrestrictions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Subrestrictions getFixture() {
		return (Subrestrictions)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestrictionsFactory.eINSTANCE.createSubrestrictions());
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

} //SubrestrictionsTest
