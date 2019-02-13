/**
 */
package de.oaam.model.oaam.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structure composed of multiple variables or arrays
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.Struct#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.Struct#getFields <em>Fields</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.Struct#getInheritsFrom <em>Inherits From</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.Struct#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getStruct()
 * @model
 * @generated
 */
public interface Struct extends DataTypeA {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal alignment (padding) of array fields in bits. 0 means all elements are directly after each other. Values above 0 mean that fields smaller than the value will be stuffed with padding bits until a multiple of the alignment value is reached. 8 equals a one Byte allignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #setAlignment(int)
	 * @see de.oaam.model.oaam.common.CommonPackage#getStruct_Alignment()
	 * @model default="8" required="true"
	 * @generated
	 */
	int getAlignment();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Struct#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(int value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.common.DataTypeA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data types of which the structure is composed of in sequential order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see de.oaam.model.oaam.common.CommonPackage#getStruct_Fields()
	 * @model required="true"
	 * @generated
	 */
	EList<DataTypeA> getFields();

	/**
	 * Returns the value of the '<em><b>Inherits From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a super type of the struct. The inhereting struc will contain all elements of the super type and his super types plus the elements that are defined here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherits From</em>' reference.
	 * @see #setInheritsFrom(Struct)
	 * @see de.oaam.model.oaam.common.CommonPackage#getStruct_InheritsFrom()
	 * @model
	 * @generated
	 */
	Struct getInheritsFrom();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Struct#getInheritsFrom <em>Inherits From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherits From</em>' reference.
	 * @see #getInheritsFrom()
	 * @generated
	 */
	void setInheritsFrom(Struct value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true there cannot be an instance of that struct. However, inhereting structs may be used in tasks or signals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see de.oaam.model.oaam.common.CommonPackage#getStruct_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Struct#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

} // Struct
