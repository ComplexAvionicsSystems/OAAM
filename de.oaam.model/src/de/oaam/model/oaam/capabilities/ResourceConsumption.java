/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.Resource;
import de.oaam.model.oaam.library.ResourceType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Consumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource consumption is the definition of how many resource of a single type are required for a capability. In addition, the original resource type can be referenced. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.ResourceConsumption#getCount <em>Count</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.ResourceConsumption#getOriginalResource <em>Original Resource</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.ResourceConsumption#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getResourceConsumption()
 * @model
 * @generated
 */
public interface ResourceConsumption extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of resource to be consumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(double)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getResourceConsumption_Count()
	 * @model required="true"
	 * @generated
	 */
	double getCount();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.ResourceConsumption#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(double value);

	/**
	 * Returns the value of the '<em><b>Original Resource</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the original resources of that were required by the type. These might differ from the capabilities resource due to resource alternatives. Capability resource are those realy consumed. Original resources are those originally demanded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Resource</em>' reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getResourceConsumption_OriginalResource()
	 * @model
	 * @generated
	 */
	EList<Resource> getOriginalResource();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource type to be consumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ResourceType)
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getResourceConsumption_Type()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.capabilities.ResourceConsumption#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceType value);

} // ResourceConsumption
