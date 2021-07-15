/**
 */
package de.oaam.model.oaam.library.util;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.library.LibraryPackage
 * @generated
 */
public class LibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = LibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LibraryPackage.RESOURCE_CONSUMER_A: {
				ResourceConsumerA resourceConsumerA = (ResourceConsumerA)theEObject;
				T result = caseResourceConsumerA(resourceConsumerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_PROVIDER_A: {
				ResourceProviderA resourceProviderA = (ResourceProviderA)theEObject;
				T result = caseResourceProviderA(resourceProviderA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A: {
				ResourceProviderInstanceA resourceProviderInstanceA = (ResourceProviderInstanceA)theEObject;
				T result = caseResourceProviderInstanceA(resourceProviderInstanceA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.LIBRARY_CONTAINER_A: {
				LibraryContainerA libraryContainerA = (LibraryContainerA)theEObject;
				T result = caseLibraryContainerA(libraryContainerA);
				if (result == null) result = caseOaamBaseElementA(libraryContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = caseResourceConsumerA(resourceType);
				if (result == null) result = caseOaamBaseElementA(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseOaamBaseElementA(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_ALTERNATIVES: {
				ResourceAlternatives resourceAlternatives = (ResourceAlternatives)theEObject;
				T result = caseResourceAlternatives(resourceAlternatives);
				if (result == null) result = caseOaamBaseElementA(resourceAlternatives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_BUNDLE: {
				ResourceBundle resourceBundle = (ResourceBundle)theEObject;
				T result = caseResourceBundle(resourceBundle);
				if (result == null) result = caseResourceConsumerA(resourceBundle);
				if (result == null) result = caseOaamBaseElementA(resourceBundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TASK_TYPE: {
				TaskType taskType = (TaskType)theEObject;
				T result = caseTaskType(taskType);
				if (result == null) result = caseResourceConsumerA(taskType);
				if (result == null) result = caseOaamBaseElementA(taskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.SIGNAL_TYPE: {
				SignalType signalType = (SignalType)theEObject;
				T result = caseSignalType(signalType);
				if (result == null) result = caseResourceConsumerA(signalType);
				if (result == null) result = caseOaamBaseElementA(signalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.DEVICE_TYPE: {
				DeviceType deviceType = (DeviceType)theEObject;
				T result = caseDeviceType(deviceType);
				if (result == null) result = caseResourceConsumerA(deviceType);
				if (result == null) result = caseResourceProviderA(deviceType);
				if (result == null) result = caseOaamBaseElementA(deviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.CONNECTION_TYPE: {
				ConnectionType connectionType = (ConnectionType)theEObject;
				T result = caseConnectionType(connectionType);
				if (result == null) result = caseResourceProviderA(connectionType);
				if (result == null) result = caseResourceConsumerA(connectionType);
				if (result == null) result = caseOaamBaseElementA(connectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.LOCATION_TYPE: {
				LocationType locationType = (LocationType)theEObject;
				T result = caseLocationType(locationType);
				if (result == null) result = caseResourceProviderA(locationType);
				if (result == null) result = caseOaamBaseElementA(locationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.DUCT_TYPE: {
				DuctType ductType = (DuctType)theEObject;
				T result = caseDuctType(ductType);
				if (result == null) result = caseResourceProviderA(ductType);
				if (result == null) result = caseOaamBaseElementA(ductType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.WIRE_TYPE: {
				WireType wireType = (WireType)theEObject;
				T result = caseWireType(wireType);
				if (result == null) result = caseOaamBaseElementA(wireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.IO_TYPE: {
				IoType ioType = (IoType)theEObject;
				T result = caseIoType(ioType);
				if (result == null) result = caseOaamBaseElementA(ioType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.INPUT_DECLARATION: {
				InputDeclaration inputDeclaration = (InputDeclaration)theEObject;
				T result = caseInputDeclaration(inputDeclaration);
				if (result == null) result = caseOaamBaseElementA(inputDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OUTPUT_DECLARATION: {
				OutputDeclaration outputDeclaration = (OutputDeclaration)theEObject;
				T result = caseOutputDeclaration(outputDeclaration);
				if (result == null) result = caseOaamBaseElementA(outputDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.IO_DECLARATION: {
				IoDeclaration ioDeclaration = (IoDeclaration)theEObject;
				T result = caseIoDeclaration(ioDeclaration);
				if (result == null) result = caseOaamBaseElementA(ioDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.DUCT_OPENING_DECLARATION: {
				DuctOpeningDeclaration ductOpeningDeclaration = (DuctOpeningDeclaration)theEObject;
				T result = caseDuctOpeningDeclaration(ductOpeningDeclaration);
				if (result == null) result = caseOaamBaseElementA(ductOpeningDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_GROUP: {
				ResourceGroup resourceGroup = (ResourceGroup)theEObject;
				T result = caseResourceGroup(resourceGroup);
				if (result == null) result = caseOaamBaseElementA(resourceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.DEVICE_TYPE_SYMMETRY: {
				DeviceTypeSymmetry deviceTypeSymmetry = (DeviceTypeSymmetry)theEObject;
				T result = caseDeviceTypeSymmetry(deviceTypeSymmetry);
				if (result == null) result = caseOaamBaseElementA(deviceTypeSymmetry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.IO_GROUP: {
				IoGroup ioGroup = (IoGroup)theEObject;
				T result = caseIoGroup(ioGroup);
				if (result == null) result = caseOaamBaseElementA(ioGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.ATTRIBUTE_DEFINITION: {
				AttributeDefinition attributeDefinition = (AttributeDefinition)theEObject;
				T result = caseAttributeDefinition(attributeDefinition);
				if (result == null) result = caseOaamBaseElementA(attributeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.FAULT_PROPAGATION: {
				FaultPropagation faultPropagation = (FaultPropagation)theEObject;
				T result = caseFaultPropagation(faultPropagation);
				if (result == null) result = caseOaamBaseElementA(faultPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TASK_INPUT_STATE: {
				TaskInputState taskInputState = (TaskInputState)theEObject;
				T result = caseTaskInputState(taskInputState);
				if (result == null) result = caseBoolA(taskInputState);
				if (result == null) result = caseOaamBaseElementA(taskInputState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.POWER_SOURCE: {
				PowerSource powerSource = (PowerSource)theEObject;
				T result = casePowerSource(powerSource);
				if (result == null) result = caseOaamBaseElementA(powerSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_LINK: {
				ResourceLink resourceLink = (ResourceLink)theEObject;
				T result = caseResourceLink(resourceLink);
				if (result == null) result = caseOaamBaseElementA(resourceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_TYPE_MODIFIER: {
				ResourceTypeModifier resourceTypeModifier = (ResourceTypeModifier)theEObject;
				T result = caseResourceTypeModifier(resourceTypeModifier);
				if (result == null) result = caseOaamBaseElementA(resourceTypeModifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL: {
				ResourceTypeModifierLevel resourceTypeModifierLevel = (ResourceTypeModifierLevel)theEObject;
				T result = caseResourceTypeModifierLevel(resourceTypeModifierLevel);
				if (result == null) result = caseOaamBaseElementA(resourceTypeModifierLevel);
				if (result == null) result = caseResourceConsumerA(resourceTypeModifierLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE: {
				ResourceTypeModifierReference resourceTypeModifierReference = (ResourceTypeModifierReference)theEObject;
				T result = caseResourceTypeModifierReference(resourceTypeModifierReference);
				if (result == null) result = caseOaamBaseElementA(resourceTypeModifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TASK_TYPE_DISSIMILARITY: {
				TaskTypeDissimilarity taskTypeDissimilarity = (TaskTypeDissimilarity)theEObject;
				T result = caseTaskTypeDissimilarity(taskTypeDissimilarity);
				if (result == null) result = caseOaamBaseElementA(taskTypeDissimilarity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY: {
				DeviceTypeDissimilarity deviceTypeDissimilarity = (DeviceTypeDissimilarity)theEObject;
				T result = caseDeviceTypeDissimilarity(deviceTypeDissimilarity);
				if (result == null) result = caseOaamBaseElementA(deviceTypeDissimilarity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.RESOURCE_TYPE_DISSIMILARITY: {
				ResourceTypeDissimilarity resourceTypeDissimilarity = (ResourceTypeDissimilarity)theEObject;
				T result = caseResourceTypeDissimilarity(resourceTypeDissimilarity);
				if (result == null) result = caseOaamBaseElementA(resourceTypeDissimilarity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TASK_OUTPUT_TRIGGER: {
				TaskOutputTrigger taskOutputTrigger = (TaskOutputTrigger)theEObject;
				T result = caseTaskOutputTrigger(taskOutputTrigger);
				if (result == null) result = caseOaamBaseElementA(taskOutputTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TASK_INPUT_TRIGGER: {
				TaskInputTrigger taskInputTrigger = (TaskInputTrigger)theEObject;
				T result = caseTaskInputTrigger(taskInputTrigger);
				if (result == null) result = caseBoolA(taskInputTrigger);
				if (result == null) result = caseOaamBaseElementA(taskInputTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TASK_STATE_DECLARATION: {
				TaskStateDeclaration taskStateDeclaration = (TaskStateDeclaration)theEObject;
				T result = caseTaskStateDeclaration(taskStateDeclaration);
				if (result == null) result = caseOaamBaseElementA(taskStateDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TASK_PARAMETER_DECLARATION: {
				TaskParameterDeclaration taskParameterDeclaration = (TaskParameterDeclaration)theEObject;
				T result = caseTaskParameterDeclaration(taskParameterDeclaration);
				if (result == null) result = caseOaamBaseElementA(taskParameterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.BUS_TYPE: {
				BusType busType = (BusType)theEObject;
				T result = caseBusType(busType);
				if (result == null) result = caseResourceProviderA(busType);
				if (result == null) result = caseOaamBaseElementA(busType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.MESSAGE_TYPE: {
				MessageType messageType = (MessageType)theEObject;
				T result = caseMessageType(messageType);
				if (result == null) result = caseOaamBaseElementA(messageType);
				if (result == null) result = caseResourceConsumerA(messageType);
				if (result == null) result = caseResourceProviderA(messageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseLibraryContainerA(library);
				if (result == null) result = caseOaamBaseElementA(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.SUBLIBRARY: {
				Sublibrary sublibrary = (Sublibrary)theEObject;
				T result = caseSublibrary(sublibrary);
				if (result == null) result = caseLibraryContainerA(sublibrary);
				if (result == null) result = caseOaamBaseElementA(sublibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Consumer A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Consumer A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceConsumerA(ResourceConsumerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Provider A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Provider A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceProviderA(ResourceProviderA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Provider Instance A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Provider Instance A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceProviderInstanceA(ResourceProviderInstanceA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryContainerA(LibraryContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Alternatives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAlternatives(ResourceAlternatives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceBundle(ResourceBundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalType(SignalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceType(DeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionType(ConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationType(LocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuctType(DuctType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireType(WireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoType(IoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDeclaration(InputDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDeclaration(OutputDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoDeclaration(IoDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duct Opening Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duct Opening Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuctOpeningDeclaration(DuctOpeningDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceGroup(ResourceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Type Symmetry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Type Symmetry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceTypeSymmetry(DeviceTypeSymmetry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoGroup(IoGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinition(AttributeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultPropagation(FaultPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Input State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Input State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInputState(TaskInputState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSource(PowerSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceLink(ResourceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceTypeModifier(ResourceTypeModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type Modifier Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type Modifier Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceTypeModifierLevel(ResourceTypeModifierLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type Modifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type Modifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceTypeModifierReference(ResourceTypeModifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type Dissimilarity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type Dissimilarity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskTypeDissimilarity(TaskTypeDissimilarity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Type Dissimilarity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Type Dissimilarity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceTypeDissimilarity(DeviceTypeDissimilarity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type Dissimilarity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type Dissimilarity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceTypeDissimilarity(ResourceTypeDissimilarity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sublibrary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sublibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSublibrary(Sublibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Output Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Output Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOutputTrigger(TaskOutputTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Input Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Input Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInputTrigger(TaskInputTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task State Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskStateDeclaration(TaskStateDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Parameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Parameter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskParameterDeclaration(TaskParameterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusType(BusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageType(MessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOaamBaseElementA(OaamBaseElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolA(BoolA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LibrarySwitch
