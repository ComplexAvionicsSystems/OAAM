/**
 */
package de.oaam.model.oaam.functions.tests;

import de.oaam.model.oaam.functions.FunctionsFactory;
import de.oaam.model.oaam.functions.Subfunctions;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subfunctions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubfunctionsTest extends FunctionsContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubfunctionsTest.class);
	}

	/**
	 * Constructs a new Subfunctions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubfunctionsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subfunctions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Subfunctions getFixture() {
		return (Subfunctions)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionsFactory.eINSTANCE.createSubfunctions());
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

} //SubfunctionsTest
