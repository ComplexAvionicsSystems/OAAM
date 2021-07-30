/**
 */
package de.oaam.model.oaam.systems.tests;

import de.oaam.model.oaam.systems.Subsystem;
import de.oaam.model.oaam.systems.SystemsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsystemTest extends SystemsContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubsystemTest.class);
	}

	/**
	 * Constructs a new Subsystem test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subsystem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Subsystem getFixture() {
		return (Subsystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemsFactory.eINSTANCE.createSubsystem());
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

} //SubsystemTest
