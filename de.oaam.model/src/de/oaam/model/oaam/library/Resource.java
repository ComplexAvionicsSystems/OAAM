/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource is an instance of a resource type which is provided by resource providers and consumed by resource consumers. It is the mandatory precondition for any allocations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.Resource#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.Resource#getCount <em>Count</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.Resource#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ResourceType)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResource_Type()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.Resource#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of resources that are available
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResource_Count()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getCount();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.Resource#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(double value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceTypeModifierLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modifiers that are statically bound to this resource
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifiers</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResource_Modifiers()
	 * @model
	 * @generated
	 */
	EList<ResourceTypeModifierLevel> getModifiers();

} // Resource
