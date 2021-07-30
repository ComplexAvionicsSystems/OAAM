/**
 */
package de.oaam.model.oaam.library.tests;

import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.ResourceType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceTypeTest extends ResourceConsumerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceTypeTest.class);
	}

	/**
	 * Constructs a new Resource Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceType getFixture() {
		return (ResourceType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createResourceType());
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

} //ResourceTypeTest
