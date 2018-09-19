/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Output Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An output that comes from another system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.ExternalOutputLink#getOutput <em>Output</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.ExternalOutputLink#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getExternalOutputLink()
 * @model
 * @generated
 */
public interface ExternalOutputLink extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The external output if fixed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getExternalOutputLink_Output()
	 * @model
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.ExternalOutputLink#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts the number of possible target outputs by filter expressions related to model properties.
	 * Supports Boolean expression as: &&, ||, !
	 * Strings can be regular expressions.
	 * For instance:
	 * name == "pressure_abs"
	 * id == "pressure_abs124"// this would be an absolute link
	 * area == "cabin"
	 * location != "left_*"
	 * name == "outflow_valve_*"
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getExternalOutputLink_Filter()
	 * @model
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.ExternalOutputLink#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

} // ExternalOutputLink
