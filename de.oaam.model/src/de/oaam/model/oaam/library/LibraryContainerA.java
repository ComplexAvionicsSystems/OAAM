/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.DataTypeA;
import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A library holds the definitions of all important basic elements used in the architecture model as for instance function types, device types, or resource types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getResourceBundles <em>Resource Bundles</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getResourceModifiers <em>Resource Modifiers</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getResourceTypeDissimilarities <em>Resource Type Dissimilarities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getTaskTypes <em>Task Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getTaskTypeDissimilarity <em>Task Type Dissimilarity</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getSignalTypes <em>Signal Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getDeviceTypes <em>Device Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getDeviceTypeSymmetries <em>Device Type Symmetries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getDeviceTypeDissimilarities <em>Device Type Dissimilarities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getConnectionTypes <em>Connection Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getWireTypes <em>Wire Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getLocationTypes <em>Location Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getDuctTypes <em>Duct Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getGenericAttributes <em>Generic Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getPowerSources <em>Power Sources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getSublibraries <em>Sublibraries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getIoTypes <em>Io Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getHardwareGroupTypes <em>Hardware Group Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.LibraryContainerA#getMessageTypes <em>Message Types</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA()
 * @model abstract="true"
 * @generated
 */
public interface LibraryContainerA extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.common.DataTypeA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All defined data types to be used within the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTypeA> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Resource Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All resource types of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_ResourceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceType> getResourceTypes();

	/**
	 * Returns the value of the '<em><b>Resource Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceBundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All resource bundles of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Bundles</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_ResourceBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceBundle> getResourceBundles();

	/**
	 * Returns the value of the '<em><b>Resource Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceTypeModifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All resource modifiers of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Modifiers</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_ResourceModifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceTypeModifier> getResourceModifiers();

	/**
	 * Returns the value of the '<em><b>Resource Type Dissimilarities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceTypeDissimilarity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All resource type dissimilarities of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type Dissimilarities</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_ResourceTypeDissimilarities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceTypeDissimilarity> getResourceTypeDissimilarities();

	/**
	 * Returns the value of the '<em><b>Task Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All task types of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_TaskTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskType> getTaskTypes();

	/**
	 * Returns the value of the '<em><b>Task Type Dissimilarity</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.TaskTypeDissimilarity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All function dissimilarity declarations of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Type Dissimilarity</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_TaskTypeDissimilarity()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskTypeDissimilarity> getTaskTypeDissimilarity();

	/**
	 * Returns the value of the '<em><b>Signal Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.SignalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signal types of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_SignalTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalType> getSignalTypes();

	/**
	 * Returns the value of the '<em><b>Device Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device types of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_DeviceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceType> getDeviceTypes();

	/**
	 * Returns the value of the '<em><b>Device Type Symmetries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DeviceTypeSymmetry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device type symmetries of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type Symmetries</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_DeviceTypeSymmetries()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceTypeSymmetry> getDeviceTypeSymmetries();

	/**
	 * Returns the value of the '<em><b>Device Type Dissimilarities</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DeviceTypeDissimilarity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All device type dissimilarity declarations of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type Dissimilarities</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_DeviceTypeDissimilarities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceTypeDissimilarity> getDeviceTypeDissimilarities();

	/**
	 * Returns the value of the '<em><b>Connection Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connection types of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_ConnectionTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionType> getConnectionTypes();

	/**
	 * Returns the value of the '<em><b>Wire Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.WireType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All wire types of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wire Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_WireTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<WireType> getWireTypes();

	/**
	 * Returns the value of the '<em><b>Location Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All location types of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_LocationTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocationType> getLocationTypes();

	/**
	 * Returns the value of the '<em><b>Duct Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.DuctType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All duct types of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duct Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_DuctTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DuctType> getDuctTypes();

	/**
	 * Returns the value of the '<em><b>Generic Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All generic attributes of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Attributes</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_GenericAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getGenericAttributes();

	/**
	 * Returns the value of the '<em><b>Power Sources</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.PowerSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All power sources
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Sources</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_PowerSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerSource> getPowerSources();

	/**
	 * Returns the value of the '<em><b>Sublibraries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Sublibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A library might contain sublibraries to structure its content. Sublibraries can contain further subliebraries. A sublibrary can contain the same elements that a library can contain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sublibraries</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_Sublibraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sublibrary> getSublibraries();

	/**
	 * Returns the value of the '<em><b>Io Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.IoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All IO types of this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Io Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_IoTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<IoType> getIoTypes();

	/**
	 * Returns the value of the '<em><b>Hardware Group Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.BusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All hardware group types of a library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Group Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_HardwareGroupTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusType> getHardwareGroupTypes();

	/**
	 * Returns the value of the '<em><b>Message Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All message types of the library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Types</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getLibraryContainerA_MessageTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageType> getMessageTypes();

} // LibraryContainerA
