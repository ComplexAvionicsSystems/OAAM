/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common._ElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource is a shared and consumed entity. A resource type defines a category of resources, e.g. KBs of memory, MIPS of computational power, or the number of analog input interfaces.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceType#isIsConsumed <em>Is Consumed</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceType#isIsDistinguishable <em>Is Distinguishable</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceType#isIsPropagated <em>Is Propagated</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceType#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceType#isIsIo <em>Is Io</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceType#isIsConfigurable <em>Is Configurable</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceType#getPropagetedResources <em>Propageted Resources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceType#getAllowedModifiers <em>Allowed Modifiers</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceType#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType()
 * @model
 * @generated
 */
public interface ResourceType extends ResourceConsumerA, _ElementA {
	/**
	 * Returns the value of the '<em><b>Is Consumed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes if the resource is consumed by an allocation of consumers, or if the resource type is must only be available and can satisfy an unlimited number of consumers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Consumed</em>' attribute.
	 * @see #setIsConsumed(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType_IsConsumed()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsConsumed();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ResourceType#isIsConsumed <em>Is Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consumed</em>' attribute.
	 * @see #isIsConsumed()
	 * @generated
	 */
	void setIsConsumed(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Distinguishable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes if this resource can be counted and if it matters to shich instance a consumer is allocated. For example I/O connectors can be counted. On the contrary CPU resource cannot be counted and it doesnt matter which resource instance is allocated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Distinguishable</em>' attribute.
	 * @see #setIsDistinguishable(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType_IsDistinguishable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsDistinguishable();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ResourceType#isIsDistinguishable <em>Is Distinguishable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Distinguishable</em>' attribute.
	 * @see #isIsDistinguishable()
	 * @generated
	 */
	void setIsDistinguishable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Propagated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes if a resource is not only consumed, but is consumed from a depending resource. For example power, may be not a resource of the target hardware, but of the powersupply before.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Propagated</em>' attribute.
	 * @see #setIsPropagated(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType_IsPropagated()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPropagated();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ResourceType#isIsPropagated <em>Is Propagated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Propagated</em>' attribute.
	 * @see #isIsPropagated()
	 * @generated
	 */
	void setIsPropagated(boolean value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.library.IoDirectionE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The direction of information/power flow on this resource. This is only applicable if this is an I/O resource type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see de.oaam.model.oaam.library.IoDirectionE
	 * @see #setDirection(IoDirectionE)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType_Direction()
	 * @model required="true"
	 * @generated
	 */
	IoDirectionE getDirection();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ResourceType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.oaam.model.oaam.library.IoDirectionE
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(IoDirectionE value);

	/**
	 * Returns the value of the '<em><b>Is Io</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an resource type used as an I/O
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Io</em>' attribute.
	 * @see #setIsIo(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType_IsIo()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsIo();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ResourceType#isIsIo <em>Is Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Io</em>' attribute.
	 * @see #isIsIo()
	 * @generated
	 */
	void setIsIo(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this resource is an configurable resource which might represent diffrent types
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Configurable</em>' attribute.
	 * @see #setIsConfigurable(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType_IsConfigurable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsConfigurable();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ResourceType#isIsConfigurable <em>Is Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Configurable</em>' attribute.
	 * @see #isIsConfigurable()
	 * @generated
	 */
	void setIsConfigurable(boolean value);

	/**
	 * Returns the value of the '<em><b>Propageted Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Propageted resources specifie the type and the maximum number of resources that can be propagated to connected resource providers by this resource. The forwarded resource type must be of type propageted. For instance a discrete output can always forward a limited amount of power, so there would be a resource type DISCRETE with a maximum of 5W propagated resource of type POWER.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propageted Resources</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType_PropagetedResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getPropagetedResources();

	/**
	 * Returns the value of the '<em><b>Allowed Modifiers</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ModifierDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of allowed modifiers for this resource type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed Modifiers</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType_AllowedModifiers()
	 * @model
	 * @generated
	 */
	EList<ModifierDefinition> getAllowedModifiers();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceAlternatives}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of possible alternatives. Alternative resources could be considered for mappings if the original is not available or is unfavourable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceType_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceAlternatives> getAlternatives();

} // ResourceType
