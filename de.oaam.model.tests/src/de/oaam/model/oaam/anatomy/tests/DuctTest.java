/**
 */
package de.oaam.model.oaam.anatomy.tests;

import de.oaam.model.oaam.anatomy.AnatomyFactory;
import de.oaam.model.oaam.anatomy.Duct;

import de.oaam.model.oaam.library.tests.ResourceProviderInstanceATest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Duct</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DuctTest extends ResourceProviderInstanceATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DuctTest.class);
	}

	/**
	 * Constructs a new Duct test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Duct test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Duct getFixture() {
		return (Duct)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnatomyFactory.eINSTANCE.createDuct());
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

} //DuctTest
