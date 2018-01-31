/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.common.IntegretyStateE;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies how the state of the inputs transfers to the outputs. An arbitrary Boolean logic can be created.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.FaultPropagation#getOutputState <em>Output State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.FaultPropagation#getLogic <em>Logic</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getFaultPropagation()
 * @model
 * @generated
 */
public interface FaultPropagation extends ElementA {
	/**
	 * Returns the value of the '<em><b>Output State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegretyStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the desired output state for that the logic is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @see #setOutputState(IntegretyStateE)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getFaultPropagation_OutputState()
	 * @model required="true"
	 * @generated
	 */
	IntegretyStateE getOutputState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.FaultPropagation#getOutputState <em>Output State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @see #getOutputState()
	 * @generated
	 */
	void setOutputState(IntegretyStateE value);

	/**
	 * Returns the value of the '<em><b>Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean expression which define the relation to the input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logic</em>' containment reference.
	 * @see #setLogic(BoolA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getFaultPropagation_Logic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolA getLogic();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.FaultPropagation#getLogic <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' containment reference.
	 * @see #getLogic()
	 * @generated
	 */
	void setLogic(BoolA value);

} // FaultPropagation
