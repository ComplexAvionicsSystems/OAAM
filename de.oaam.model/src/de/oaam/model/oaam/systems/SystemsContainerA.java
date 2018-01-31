/**
 */
package de.oaam.model.oaam.systems;

import de.oaam.model.oaam.common.ElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  The systems model contains a high level description of the system components as well as the data and power flow without specifying the implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.SystemsContainerA#getSystems <em>Systems</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.SystemsContainerA#getInformationFlows <em>Information Flows</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.SystemsContainerA#getInputSegregations <em>Input Segregations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.SystemsContainerA#getSubsystems <em>Subsystems</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getSystemsContainerA()
 * @model abstract="true"
 * @generated
 */
public interface SystemsContainerA extends ElementA {
	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.systems.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All included system 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getSystemsContainerA_Systems()
	 * @model containment="true"
	 * @generated
	 */
	EList<de.oaam.model.oaam.systems.System> getSystems();

	/**
	 * Returns the value of the '<em><b>Information Flows</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.systems.InformationFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All information flows
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Flows</em>' containment reference list.
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getSystemsContainerA_InformationFlows()
	 * @model containment="true"
	 * @generated
	 */
	EList<InformationFlow> getInformationFlows();

	/**
	 * Returns the value of the '<em><b>Input Segregations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.systems.InputSegregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of input segregation constraints for the described systems
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Segregations</em>' containment reference list.
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getSystemsContainerA_InputSegregations()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputSegregation> getInputSegregations();

	/**
	 * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.systems.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All included subsystems
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsystems</em>' containment reference list.
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getSystemsContainerA_Subsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subsystem> getSubsystems();

} // SystemsContainerA
