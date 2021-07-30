/**
 */
package de.oaam.model.oaam.physical.tests;

import de.oaam.model.oaam.physical.Effector;
import de.oaam.model.oaam.physical.PhysicalFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Effector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EffectorTest extends PhysicalInterfaceATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EffectorTest.class);
	}

	/**
	 * Constructs a new Effector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Effector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Effector getFixture() {
		return (Effector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhysicalFactory.eINSTANCE.createEffector());
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

} //EffectorTest
