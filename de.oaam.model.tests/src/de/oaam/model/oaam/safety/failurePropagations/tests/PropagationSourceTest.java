/**
 */
package de.oaam.model.oaam.safety.failurePropagations.tests;

import de.oaam.model.oaam.common.tests.OaamBaseElementATest;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsFactory;
import de.oaam.model.oaam.safety.failurePropagations.PropagationSource;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Propagation Source</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropagationSourceTest extends OaamBaseElementATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropagationSourceTest.class);
	}

	/**
	 * Constructs a new Propagation Source test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagationSourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Propagation Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropagationSource getFixture() {
		return (PropagationSource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailurePropagationsFactory.eINSTANCE.createPropagationSource());
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

} //PropagationSourceTest
