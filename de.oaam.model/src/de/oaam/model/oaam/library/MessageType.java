/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.DataTypeA;
import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of a certian message type of a bus system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.MessageType#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.MessageType#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.MessageType#getAllignment <em>Allignment</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.MessageType#getHeaderDefinition <em>Header Definition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.MessageType#getTrailerDefinition <em>Trailer Definition</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends OaamBaseElementA, ResourceConsumerA, ResourceProviderA {
	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum size of a message in bits
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getMessageType_MinLength()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.MessageType#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum size of a message in bits
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getMessageType_MaxLength()
	 * @model default="8" required="true"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.MessageType#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Allignment</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if the messages of this type require a byte allignment given in bits, e.g. a value of 32 means that all signals in this header have to start at multiples of 4 byte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allignment</em>' attribute.
	 * @see #setAllignment(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getMessageType_Allignment()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getAllignment();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.MessageType#getAllignment <em>Allignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allignment</em>' attribute.
	 * @see #getAllignment()
	 * @generated
	 */
	void setAllignment(int value);

	/**
	 * Returns the value of the '<em><b>Header Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data structure of the header of this kind of messages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Definition</em>' containment reference.
	 * @see #setHeaderDefinition(DataTypeA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getMessageType_HeaderDefinition()
	 * @model containment="true"
	 * @generated
	 */
	DataTypeA getHeaderDefinition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.MessageType#getHeaderDefinition <em>Header Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Definition</em>' containment reference.
	 * @see #getHeaderDefinition()
	 * @generated
	 */
	void setHeaderDefinition(DataTypeA value);

	/**
	 * Returns the value of the '<em><b>Trailer Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data structure of the trailer of this kind of messages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trailer Definition</em>' containment reference.
	 * @see #setTrailerDefinition(DataTypeA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getMessageType_TrailerDefinition()
	 * @model containment="true"
	 * @generated
	 */
	DataTypeA getTrailerDefinition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.MessageType#getTrailerDefinition <em>Trailer Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trailer Definition</em>' containment reference.
	 * @see #getTrailerDefinition()
	 * @generated
	 */
	void setTrailerDefinition(DataTypeA value);

} // MessageType
