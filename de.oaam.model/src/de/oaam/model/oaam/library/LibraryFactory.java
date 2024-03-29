/**
 */
package de.oaam.model.oaam.library;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.library.LibraryPackage
 * @generated
 */
public interface LibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryFactory eINSTANCE = de.oaam.model.oaam.library.impl.LibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Type</em>'.
	 * @generated
	 */
	ResourceType createResourceType();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Resource Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Alternatives</em>'.
	 * @generated
	 */
	ResourceAlternatives createResourceAlternatives();

	/**
	 * Returns a new object of class '<em>Resource Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Bundle</em>'.
	 * @generated
	 */
	ResourceBundle createResourceBundle();

	/**
	 * Returns a new object of class '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Type</em>'.
	 * @generated
	 */
	TaskType createTaskType();

	/**
	 * Returns a new object of class '<em>Signal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Type</em>'.
	 * @generated
	 */
	SignalType createSignalType();

	/**
	 * Returns a new object of class '<em>Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Type</em>'.
	 * @generated
	 */
	DeviceType createDeviceType();

	/**
	 * Returns a new object of class '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Type</em>'.
	 * @generated
	 */
	ConnectionType createConnectionType();

	/**
	 * Returns a new object of class '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Type</em>'.
	 * @generated
	 */
	LocationType createLocationType();

	/**
	 * Returns a new object of class '<em>Duct Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duct Type</em>'.
	 * @generated
	 */
	DuctType createDuctType();

	/**
	 * Returns a new object of class '<em>Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire Type</em>'.
	 * @generated
	 */
	WireType createWireType();

	/**
	 * Returns a new object of class '<em>Io Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io Type</em>'.
	 * @generated
	 */
	IoType createIoType();

	/**
	 * Returns a new object of class '<em>Input Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Declaration</em>'.
	 * @generated
	 */
	InputDeclaration createInputDeclaration();

	/**
	 * Returns a new object of class '<em>Output Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Declaration</em>'.
	 * @generated
	 */
	OutputDeclaration createOutputDeclaration();

	/**
	 * Returns a new object of class '<em>Io Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io Declaration</em>'.
	 * @generated
	 */
	IoDeclaration createIoDeclaration();

	/**
	 * Returns a new object of class '<em>Duct Opening Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duct Opening Declaration</em>'.
	 * @generated
	 */
	DuctOpeningDeclaration createDuctOpeningDeclaration();

	/**
	 * Returns a new object of class '<em>Resource Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Group</em>'.
	 * @generated
	 */
	ResourceGroup createResourceGroup();

	/**
	 * Returns a new object of class '<em>Device Type Symmetry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Type Symmetry</em>'.
	 * @generated
	 */
	DeviceTypeSymmetry createDeviceTypeSymmetry();

	/**
	 * Returns a new object of class '<em>Io Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io Group</em>'.
	 * @generated
	 */
	IoGroup createIoGroup();

	/**
	 * Returns a new object of class '<em>Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition</em>'.
	 * @generated
	 */
	AttributeDefinition createAttributeDefinition();

	/**
	 * Returns a new object of class '<em>Task Input State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Input State</em>'.
	 * @generated
	 */
	TaskInputState createTaskInputState();

	/**
	 * Returns a new object of class '<em>Power Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Source</em>'.
	 * @generated
	 */
	PowerSource createPowerSource();

	/**
	 * Returns a new object of class '<em>Resource Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Link</em>'.
	 * @generated
	 */
	ResourceLink createResourceLink();

	/**
	 * Returns a new object of class '<em>Resource Type Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Type Modifier</em>'.
	 * @generated
	 */
	ResourceTypeModifier createResourceTypeModifier();

	/**
	 * Returns a new object of class '<em>Resource Type Modifier Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Type Modifier Level</em>'.
	 * @generated
	 */
	ResourceTypeModifierLevel createResourceTypeModifierLevel();

	/**
	 * Returns a new object of class '<em>Resource Type Modifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Type Modifier Reference</em>'.
	 * @generated
	 */
	ResourceTypeModifierReference createResourceTypeModifierReference();

	/**
	 * Returns a new object of class '<em>Task Type Dissimilarity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Type Dissimilarity</em>'.
	 * @generated
	 */
	TaskTypeDissimilarity createTaskTypeDissimilarity();

	/**
	 * Returns a new object of class '<em>Device Type Dissimilarity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Type Dissimilarity</em>'.
	 * @generated
	 */
	DeviceTypeDissimilarity createDeviceTypeDissimilarity();

	/**
	 * Returns a new object of class '<em>Resource Type Dissimilarity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Type Dissimilarity</em>'.
	 * @generated
	 */
	ResourceTypeDissimilarity createResourceTypeDissimilarity();

	/**
	 * Returns a new object of class '<em>Task Output Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Output Trigger</em>'.
	 * @generated
	 */
	TaskOutputTrigger createTaskOutputTrigger();

	/**
	 * Returns a new object of class '<em>Task Input Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Input Trigger</em>'.
	 * @generated
	 */
	TaskInputTrigger createTaskInputTrigger();

	/**
	 * Returns a new object of class '<em>Task State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task State Declaration</em>'.
	 * @generated
	 */
	TaskStateDeclaration createTaskStateDeclaration();

	/**
	 * Returns a new object of class '<em>Task Parameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Parameter Declaration</em>'.
	 * @generated
	 */
	TaskParameterDeclaration createTaskParameterDeclaration();

	/**
	 * Returns a new object of class '<em>Bus Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Type</em>'.
	 * @generated
	 */
	BusType createBusType();

	/**
	 * Returns a new object of class '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Type</em>'.
	 * @generated
	 */
	MessageType createMessageType();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Sublibrary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sublibrary</em>'.
	 * @generated
	 */
	Sublibrary createSublibrary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LibraryPackage getLibraryPackage();

} //LibraryFactory
