/**
 */
package de.oaam.model.oaam.systems.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.systems.InformationFlow;
import de.oaam.model.oaam.systems.SystemsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationFlowTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InformationFlowTest.class);
	}

	/**
	 * Constructs a new Information Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Information Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InformationFlow getFixture() {
		return (InformationFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemsFactory.eINSTANCE.createInformationFlow());
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

} //InformationFlowTest
