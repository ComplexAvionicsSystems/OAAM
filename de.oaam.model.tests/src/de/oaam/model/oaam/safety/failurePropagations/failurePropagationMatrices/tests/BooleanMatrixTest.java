/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Matrix</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanMatrixTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanMatrixTest.class);
	}

	/**
	 * Constructs a new Boolean Matrix test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanMatrixTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Matrix test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanMatrix getFixture() {
		return (BooleanMatrix)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailurePropagationMatricesFactory.eINSTANCE.createBooleanMatrix());
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

} //BooleanMatrixTest
