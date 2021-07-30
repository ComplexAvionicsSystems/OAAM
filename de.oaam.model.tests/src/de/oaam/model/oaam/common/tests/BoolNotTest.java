/**
 */
package de.oaam.model.oaam.common.tests;

import de.oaam.model.oaam.common.BoolNot;
import de.oaam.model.oaam.common.CommonFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bool Not</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoolNotTest extends BoolATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoolNotTest.class);
	}

	/**
	 * Constructs a new Bool Not test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolNotTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bool Not test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BoolNot getFixture() {
		return (BoolNot)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonFactory.eINSTANCE.createBoolNot());
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

} //BoolNotTest
