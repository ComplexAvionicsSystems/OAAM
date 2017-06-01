/**
 */
package de.oaam.model.oaam.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floating Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A floating point number in IEEE format
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.FloatingPoint#getNBits <em>NBits</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.FloatingPoint#getEndianess <em>Endianess</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getFloatingPoint()
 * @model
 * @generated
 */
public interface FloatingPoint extends DataTypeA {
	/**
	 * Returns the value of the '<em><b>NBits</b></em>' attribute.
	 * The default value is <code>"32"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bits. Float = 32, Double = 64
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NBits</em>' attribute.
	 * @see #setNBits(int)
	 * @see de.oaam.model.oaam.common.CommonPackage#getFloatingPoint_NBits()
	 * @model default="32" required="true"
	 * @generated
	 */
	int getNBits();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.FloatingPoint#getNBits <em>NBits</em>}' attribute.
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
	 * @see de.oaam.model.oaam.common.CommonPackage#getFloatingPoint_Endianess()
	 * @model default="BIG" required="true"
	 * @generated
	 */
	EndianessE getEndianess();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.FloatingPoint#getEndianess <em>Endianess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endianess</em>' attribute.
	 * @see de.oaam.model.oaam.common.EndianessE
	 * @see #getEndianess()
	 * @generated
	 */
	void setEndianess(EndianessE value);

} // FloatingPoint
