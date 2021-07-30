/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.tests;

import de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Io Signal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoSignalTest extends SourceATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IoSignalTest.class);
	}

	/**
	 * Constructs a new Io Signal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoSignalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Io Signal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IoSignal getFixture() {
		return (IoSignal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskInternalRequirementsFactory.eINSTANCE.createIoSignal());
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

} //IoSignalTest
