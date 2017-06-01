/**
 */
package de.oaam.model.oaam.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single character which can be of different encodings. The default size is 8 Bit. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.Character#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.Character#getNBits <em>NBits</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends DataTypeA {
	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Character encoding table used for the content. E.g. ASCII or UNICODE. If the encoding has more than one byte per character. nBits must be set accordingly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see de.oaam.model.oaam.common.CommonPackage#getCharacter_Encoding()
	 * @model required="true"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Character#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

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
	 * @see de.oaam.model.oaam.common.CommonPackage#getCharacter_NBits()
	 * @model default="8" required="true"
	 * @generated
	 */
	int getNBits();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Character#getNBits <em>NBits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NBits</em>' attribute.
	 * @see #getNBits()
	 * @generated
	 */
	void setNBits(int value);

} // Character
