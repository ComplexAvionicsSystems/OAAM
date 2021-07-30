/**
 */
package de.oaam.model.oaam.safety.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.RequirementFailureEffect;
import de.oaam.model.oaam.safety.SafetyFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Requirement Failure Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementFailureEffectTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementFailureEffectTest.class);
	}

	/**
	 * Constructs a new Requirement Failure Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFailureEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Requirement Failure Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequirementFailureEffect getFixture() {
		return (RequirementFailureEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SafetyFactory.eINSTANCE.createRequirementFailureEffect());
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

} //RequirementFailureEffectTest
