/**
 */
package de.oaam.model.oaam.common.tests;

import de.oaam.model.oaam.common.CommonFactory;
import de.oaam.model.oaam.common.FloatingPoint;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Floating Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FloatingPointTest extends DataTypeATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FloatingPointTest.class);
	}

	/**
	 * Constructs a new Floating Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Floating Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FloatingPoint getFixture() {
		return (FloatingPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonFactory.eINSTANCE.createFloatingPoint());
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

} //FloatingPointTest
