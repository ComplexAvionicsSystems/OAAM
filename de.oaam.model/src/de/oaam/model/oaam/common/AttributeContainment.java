/**
 */
package de.oaam.model.oaam.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An attribute which can contain an arbitrary other model element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.AttributeContainment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getAttributeContainment()
 * @model
 * @generated
 */
public interface AttributeContainment extends AttributeA {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.common._ElementA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A containment of an architecture model element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see de.oaam.model.oaam.common.CommonPackage#getAttributeContainment_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<_ElementA> getValue();

} // AttributeContainment
