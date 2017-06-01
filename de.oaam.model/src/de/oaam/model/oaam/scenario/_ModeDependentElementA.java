/**
 */
package de.oaam.model.oaam.scenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Dependent Element A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A super class for elements that exist only during certain phases
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.scenario._ModeDependentElementA#getOperationModes <em>Operation Modes</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.scenario.ScenarioPackage#get_ModeDependentElementA()
 * @model abstract="true"
 * @generated
 */
public interface _ModeDependentElementA extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Modes</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.scenario.OperationModeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation modes in which the element is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Modes</em>' containment reference list.
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#get_ModeDependentElementA_OperationModes()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationModeReference> getOperationModes();

} // _ModeDependentElementA
