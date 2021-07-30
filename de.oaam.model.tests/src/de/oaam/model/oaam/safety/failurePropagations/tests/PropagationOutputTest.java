/**
 */
package de.oaam.model.oaam.safety.failurePropagations.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsFactory;
import de.oaam.model.oaam.safety.failurePropagations.PropagationOutput;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Propagation Output</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropagationOutputTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropagationOutputTest.class);
	}

	/**
	 * Constructs a new Propagation Output test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagationOutputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Propagation Output test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropagationOutput getFixture() {
		return (PropagationOutput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailurePropagationsFactory.eINSTANCE.createPropagationOutput());
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

} //PropagationOutputTest
