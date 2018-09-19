/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defining an additional attribute for a type of object that is mandatory for each instance of that object in the model. For instance define a serial number attribute for all device types as a string attribute
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.AttributeDefinition#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.AttributeDefinition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getAttributeDefinition()
 * @model
 * @generated
 */
public interface AttributeDefinition extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.library.AttributeTypesE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see de.oaam.model.oaam.library.AttributeTypesE
	 * @see #setDataType(AttributeTypesE)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getAttributeDefinition_DataType()
	 * @model required="true"
	 * @generated
	 */
	AttributeTypesE getDataType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.AttributeDefinition#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see de.oaam.model.oaam.library.AttributeTypesE
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(AttributeTypesE value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.library.AttributeTargetsE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of elements this attribute is used for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see de.oaam.model.oaam.library.AttributeTargetsE
	 * @see #setTarget(AttributeTargetsE)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getAttributeDefinition_Target()
	 * @model required="true"
	 * @generated
	 */
	AttributeTargetsE getTarget();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.AttributeDefinition#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see de.oaam.model.oaam.library.AttributeTargetsE
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AttributeTargetsE value);

} // AttributeDefinition
