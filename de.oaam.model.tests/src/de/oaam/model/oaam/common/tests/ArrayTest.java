/**
 */
package de.oaam.model.oaam.common.tests;

import de.oaam.model.oaam.common.Array;
import de.oaam.model.oaam.common.CommonFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayTest extends DataTypeATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArrayTest.class);
	}

	/**
	 * Constructs a new Array test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Array test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Array getFixture() {
		return (Array)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonFactory.eINSTANCE.createArray());
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

} //ArrayTest
