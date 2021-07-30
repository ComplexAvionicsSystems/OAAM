/**
 */
package de.oaam.model.oaam.physical.tests;

import de.oaam.model.oaam.physical.PhysicalFactory;
import de.oaam.model.oaam.physical.SubphysicalInteraction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subphysical Interaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubphysicalInteractionTest extends PhysicalInteractionContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubphysicalInteractionTest.class);
	}

	/**
	 * Constructs a new Subphysical Interaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubphysicalInteractionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subphysical Interaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubphysicalInteraction getFixture() {
		return (SubphysicalInteraction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhysicalFactory.eINSTANCE.createSubphysicalInteraction());
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

} //SubphysicalInteractionTest
