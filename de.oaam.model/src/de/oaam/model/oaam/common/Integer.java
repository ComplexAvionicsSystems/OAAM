/**
 */
package de.oaam.model.oaam.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A signed or unsigned integer of variable resolution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.Integer#isSigned <em>Signed</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.Integer#getNBits <em>NBits</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.Integer#getEndianess <em>Endianess</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getInteger()
 * @model
 * @generated
 */
public interface Integer extends DataTypeA {
	/**
	 * Returns the value of the '<em><b>Signed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the integer is signed it can hold also negative values. The default is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signed</em>' attribute.
	 * @see #setSigned(boolean)
	 * @see de.oaam.model.oaam.common.CommonPackage#getInteger_Signed()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isSigned();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Integer#isSigned <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed</em>' attribute.
	 * @see #isSigned()
	 * @generated
	 */
	void setSigned(boolean value);

	/**
	 * Returns the value of the '<em><b>NBits</b></em>' attribute.
	 * The default value is <code>"16"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bits representing the integer. Common values are 8, 16, 32 and 64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NBits</em>' attribute.
	 * @see #setNBits(int)
	 * @see de.oaam.model.oaam.common.CommonPackage#getInteger_NBits()
	 * @model default="16" required="true"
	 * @generated
	 */
	int getNBits();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Integer#getNBits <em>NBits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NBits</em>' attribute.
	 * @see #getNBits()
	 * @generated
	 */
	void setNBits(int value);

	/**
	 * Returns the value of the '<em><b>Endianess</b></em>' attribute.
	 * The default value is <code>"BIG"</code>.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.EndianessE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The endianess of the included data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endianess</em>' attribute.
	 * @see de.oaam.model.oaam.common.EndianessE
	 * @see #setEndianess(EndianessE)
	 * @see de.oaam.model.oaam.common.CommonPackage#getInteger_Endianess()
	 * @model default="BIG" required="true"
	 * @generated
	 */
	EndianessE getEndianess();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Integer#getEndianess <em>Endianess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endianess</em>' attribute.
	 * @see de.oaam.model.oaam.common.EndianessE
	 * @see #getEndianess()
	 * @generated
	 */
	void setEndianess(EndianessE value);

} // Integer
