/**
 */
package de.oaam.model.oaam.common.tests;

import de.oaam.model.oaam.common.BoolOperation;
import de.oaam.model.oaam.common.CommonFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bool Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoolOperationTest extends BoolATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoolOperationTest.class);
	}

	/**
	 * Constructs a new Bool Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bool Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BoolOperation getFixture() {
		return (BoolOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonFactory.eINSTANCE.createBoolOperation());
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

} //BoolOperationTest
