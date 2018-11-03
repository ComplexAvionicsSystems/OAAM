/**
 */
package de.oaam.model.oaam.scenario;

import de.oaam.model.oaam.common.OaamBaseElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for scenarios and subscenarios. A scenario is a global, timely or variant dependent definition of parameters. For instance along a flight mission.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.scenario.ScenarioContainerA#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.ScenarioContainerA#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.ScenarioContainerA#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.scenario.ScenarioContainerA#getSubscenarios <em>Subscenarios</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getScenarioContainerA()
 * @model abstract="true"
 * @generated
 */
public interface ScenarioContainerA extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.scenario.ScenarioParameterA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getScenarioContainerA_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScenarioParameterA> getParameters();

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.scenario.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All variants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getScenarioContainerA_Variants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variant> getVariants();

	/**
	 * Returns the value of the '<em><b>Operation Modes</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.scenario.OperationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All operation modes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Modes</em>' containment reference list.
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getScenarioContainerA_OperationModes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OperationMode> getOperationModes();

	/**
	 * Returns the value of the '<em><b>Subscenarios</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.scenario.Subscenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All included subscenarios.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscenarios</em>' containment reference list.
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getScenarioContainerA_Subscenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscenario> getSubscenarios();

} // ScenarioContainerA
