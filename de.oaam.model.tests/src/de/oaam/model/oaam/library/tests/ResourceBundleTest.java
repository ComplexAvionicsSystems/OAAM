/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.ResourceBundle;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Bundle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceBundleTest extends ResourceConsumerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceBundleTest.class);
	}

	/**
	 * Constructs a new Resource Bundle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBundleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Bundle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceBundle getFixture() {
		return (ResourceBundle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createResourceBundle());
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

} //ResourceBundleTest
