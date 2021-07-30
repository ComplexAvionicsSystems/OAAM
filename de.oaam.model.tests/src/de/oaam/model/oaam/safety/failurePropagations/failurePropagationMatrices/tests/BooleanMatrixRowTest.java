/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanMatrixRowTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanMatrixRowTest.class);
	}

	/**
	 * Constructs a new Boolean Matrix Row test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanMatrixRowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Matrix Row test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanMatrixRow getFixture() {
		return (BooleanMatrixRow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailurePropagationMatricesFactory.eINSTANCE.createBooleanMatrixRow());
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

} //BooleanMatrixRowTest
