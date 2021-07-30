/**
 */
package de.oaam.model.oaam.allocations.tests;

import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.Message;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageTest.class);
	}

	/**
	 * Constructs a new Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Message getFixture() {
		return (Message)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocationsFactory.eINSTANCE.createMessage());
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

} //MessageTest
