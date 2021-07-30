/**
 */
package de.oaam.model.oaam.allocations.tests;

import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.Suballocations;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Suballocations</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuballocationsTest extends AllocationsContainerATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuballocationsTest.class);
	}

	/**
	 * Constructs a new Suballocations test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuballocationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Suballocations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Suballocations getFixture() {
		return (Suballocations)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocationsFactory.eINSTANCE.createSuballocations());
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

} //SuballocationsTest
