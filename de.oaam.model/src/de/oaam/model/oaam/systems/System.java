/**
 */
package de.oaam.model.oaam.systems;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A system is an encapsuleted functionality that interacts with information and power
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.System#getProvidedOutputs <em>Provided Outputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.System#getRequiredInputs <em>Required Inputs</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Provided Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.systems.ProvidedOutputA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All outputs provided by the system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Outputs</em>' containment reference list.
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getSystem_ProvidedOutputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedOutputA> getProvidedOutputs();

	/**
	 * Returns the value of the '<em><b>Required Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.systems.RequiredInputA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All inputs required by the system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Inputs</em>' containment reference list.
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getSystem_RequiredInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredInputA> getRequiredInputs();

} // System
