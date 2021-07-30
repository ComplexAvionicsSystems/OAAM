/**
 */
package de.oaam.model.oaam.systems.tests;

import de.oaam.model.oaam.systems.InformationMaterial;
import de.oaam.model.oaam.systems.SystemsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Information Material</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationMaterialTest extends ProvidedInformationATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InformationMaterialTest.class);
	}

	/**
	 * Constructs a new Information Material test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationMaterialTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Information Material test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InformationMaterial getFixture() {
		return (InformationMaterial)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemsFactory.eINSTANCE.createInformationMaterial());
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

} //InformationMaterialTest
