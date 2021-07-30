/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.ResourceTypeModifier;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Type Modifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceTypeModifierTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceTypeModifierTest.class);
	}

	/**
	 * Constructs a new Resource Type Modifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeModifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Type Modifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceTypeModifier getFixture() {
		return (ResourceTypeModifier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createResourceTypeModifier());
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

} //ResourceTypeModifierTest
