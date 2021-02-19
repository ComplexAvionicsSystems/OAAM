/**
 */
package de.oaam.model.oaam.common.tests;

import de.oaam.model.oaam.common.AttributeNumeric;
import de.oaam.model.oaam.common.CommonFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Numeric</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeNumericTest extends AttributeATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeNumericTest.class);
	}

	/**
	 * Constructs a new Attribute Numeric test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNumericTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Numeric test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeNumeric getFixture() {
		return (AttributeNumeric)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonFactory.eINSTANCE.createAttributeNumeric());
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

} //AttributeNumericTest
