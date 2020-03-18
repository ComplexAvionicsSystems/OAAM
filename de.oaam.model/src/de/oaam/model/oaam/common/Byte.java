/**
 */
package de.oaam.model.oaam.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Byte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 8 Bits of unknown content
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.Byte#getNBits <em>NBits</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getByte()
 * @model
 * @generated
 */
public interface Byte extends DataTypeA {

	/**
	 * Returns the value of the '<em><b>NBits</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of character encoding bits. The default is 8.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NBits</em>' attribute.
	 * @see #setNBits(int)
	 * @see de.oaam.model.oaam.common.CommonPackage#getByte_NBits()
	 * @model default="8" required="true"
	 * @generated
	 */
	int getNBits();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Byte#getNBits <em>NBits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NBits</em>' attribute.
	 * @see #getNBits()
	 * @generated
	 */
	void setNBits(int value);
} // Byte
