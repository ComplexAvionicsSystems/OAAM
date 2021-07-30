/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.MessageType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageTypeTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageTypeTest.class);
	}

	/**
	 * Constructs a new Message Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MessageType getFixture() {
		return (MessageType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createMessageType());
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

} //MessageTypeTest
