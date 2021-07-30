/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Outport Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A row entry specifying an outgoing Boolean value on a specific outport.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry#isValue <em>Value</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry#getOutport <em>Outport</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanOutportEntry()
 * @model
 * @generated
 */
public interface BooleanOutportEntry extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean value this entry refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanOutportEntry_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Outport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outport which this entry refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outport</em>' reference.
	 * @see #setOutport(BooleanOutport)
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage#getBooleanOutportEntry_Outport()
	 * @model
	 * @generated
	 */
	BooleanOutport getOutport();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry#getOutport <em>Outport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outport</em>' reference.
	 * @see #getOutport()
	 * @generated
	 */
	void setOutport(BooleanOutport value);

} // BooleanOutportEntry
