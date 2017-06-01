/**
 */
package de.oaam.model.oaam.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Consumer A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class of a resource consuming element. Instances are functions, devices, subdevices or resources itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceConsumerA#getRequiredResources <em>Required Resources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceConsumerA#getConsumedGroups <em>Consumed Groups</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceConsumerA()
 * @model abstract="true"
 * @generated
 */
public interface ResourceConsumerA extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required resource a resource consumer will consume when mapped to a resource provider. The required resources are, however, a wishlist. The precise resource consumption of a resource consumer is specified in the capabilities layer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Resources</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceConsumerA_RequiredResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getRequiredResources();

	/**
	 * Returns the value of the '<em><b>Consumed Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource groups organize the resources of the resource consumer in groups, e.g. galvanic groups of I/Os, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumed Groups</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceConsumerA_ConsumedGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceGroup> getConsumedGroups();

} // ResourceConsumerA
