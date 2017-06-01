/**
 */
package de.oaam.model.oaam.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An attribute which can contain a references to arbitrary other model elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.AttributeReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getAttributeReference()
 * @model
 * @generated
 */
public interface AttributeReference extends AttributeA {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.common._ElementA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an architecture model element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see de.oaam.model.oaam.common.CommonPackage#getAttributeReference_Value()
	 * @model
	 * @generated
	 */
	EList<_ElementA> getValue();

} // AttributeReference
