/**
 */
package de.oaam.model.oaam.safety.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.FunctionalFailureModeSet;
import de.oaam.model.oaam.safety.SafetyFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Functional Failure Mode Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalFailureModeSetTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionalFailureModeSetTest.class);
	}

	/**
	 * Constructs a new Functional Failure Mode Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalFailureModeSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Functional Failure Mode Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionalFailureModeSet getFixture() {
		return (FunctionalFailureModeSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SafetyFactory.eINSTANCE.createFunctionalFailureModeSet());
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

} //FunctionalFailureModeSetTest
