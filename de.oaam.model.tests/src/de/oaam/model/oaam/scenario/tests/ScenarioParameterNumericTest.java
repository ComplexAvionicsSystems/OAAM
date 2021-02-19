/**
 */
package de.oaam.model.oaam.scenario.tests;

import de.oaam.model.oaam.scenario.ScenarioFactory;
import de.oaam.model.oaam.scenario.ScenarioParameterNumeric;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Numeric</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioParameterNumericTest extends ScenarioParameterATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScenarioParameterNumericTest.class);
	}

	/**
	 * Constructs a new Parameter Numeric test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioParameterNumericTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter Numeric test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScenarioParameterNumeric getFixture() {
		return (ScenarioParameterNumeric)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScenarioFactory.eINSTANCE.createScenarioParameterNumeric());
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

} //ScenarioParameterNumericTest
