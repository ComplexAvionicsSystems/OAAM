/**
 */
package de.oaam.model.oaam.anatomy.tests;

import de.oaam.model.oaam.anatomy.Anatomy;
import de.oaam.model.oaam.anatomy.AnatomyFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Anatomy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnatomyTest extends AnatomyContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnatomyTest.class);
	}

	/**
	 * Constructs a new Anatomy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnatomyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Anatomy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Anatomy getFixture() {
		return (Anatomy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnatomyFactory.eINSTANCE.createAnatomy());
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

} //AnatomyTest
