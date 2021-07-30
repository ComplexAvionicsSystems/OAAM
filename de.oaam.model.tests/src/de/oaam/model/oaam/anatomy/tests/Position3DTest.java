/**
 */
package de.oaam.model.oaam.anatomy.tests;

import de.oaam.model.oaam.anatomy.AnatomyFactory;
import de.oaam.model.oaam.anatomy.Position3D;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Position3 D</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Position3DTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Position3DTest.class);
	}

	/**
	 * Constructs a new Position3 D test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position3DTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Position3 D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Position3D getFixture() {
		return (Position3D)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnatomyFactory.eINSTANCE.createPosition3D());
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

} //Position3DTest
