/**
 */
package de.oaam.model.oaam.systems.tests;

import de.oaam.model.oaam.systems.Systems;
import de.oaam.model.oaam.systems.SystemsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Systems</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemsTest extends SystemsContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemsTest.class);
	}

	/**
	 * Constructs a new Systems test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Systems test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Systems getFixture() {
		return (Systems)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemsFactory.eINSTANCE.createSystems());
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

} //SystemsTest
