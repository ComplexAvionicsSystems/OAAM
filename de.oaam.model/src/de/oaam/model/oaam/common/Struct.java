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
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getStruct()
 * @model
 * @generated
 */
public interface Struct extends DataTypeA {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal alignment of array fields in byte. 0 means all elements are directly after each other. Values above 0 mean that fields smaller than the value will be stuffed with padding bytes until the alignment matches.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #setAlignment(int)
	 * @see de.oaam.model.oaam.common.CommonPackage#getStruct_Alignment()
	 * @model default="0" required="true"
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

} // Struct
