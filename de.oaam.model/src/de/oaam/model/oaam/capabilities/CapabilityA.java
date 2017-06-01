/**
 */
package de.oaam.model.oaam.capabilities;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class of a capability. A capability defines how a resource consumer can be mapped to a resource provider.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.CapabilityA#getResourceConsumptions <em>Resource Consumptions</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilityA()
 * @model abstract="true"
 * @generated
 */
public interface CapabilityA extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.capabilities.ResourceConsumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resources consumed if the capability is used to map resource consumer element to a resource provider element, e.g. a function to a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Consumptions</em>' containment reference list.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#getCapabilityA_ResourceConsumptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceConsumption> getResourceConsumptions();

} // CapabilityA
