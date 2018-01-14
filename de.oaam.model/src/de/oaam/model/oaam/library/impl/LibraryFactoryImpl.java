/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.library.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryFactoryImpl extends EFactoryImpl implements LibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LibraryFactory init() {
		try {
			LibraryFactory theLibraryFactory = (LibraryFactory)EPackage.Registry.INSTANCE.getEFactory(LibraryPackage.eNS_URI);
			if (theLibraryFactory != null) {
				return theLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LibraryPackage.RESOURCE_TYPE: return createResourceType();
			case LibraryPackage.RESOURCE: return createResource();
			case LibraryPackage.RESOURCE_ALTERNATIVES: return createResourceAlternatives();
			case LibraryPackage.RESOURCE_BUNDLES: return createResourceBundles();
			case LibraryPackage.TASK_TYPE: return createTaskType();
			case LibraryPackage.SIGNAL_TYPE: return createSignalType();
			case LibraryPackage.DEVICE_TYPE: return createDeviceType();
			case LibraryPackage.CONNECTION_TYPE: return createConnectionType();
			case LibraryPackage.LOCATION_TYPE: return createLocationType();
			case LibraryPackage.DUCT_TYPE: return createDuctType();
			case LibraryPackage.WIRE_TYPE: return createWireType();
			case LibraryPackage.INPUT_DECLARATION: return createInputDeclaration();
			case LibraryPackage.OUTPUT_DECLARATION: return createOutputDeclaration();
			case LibraryPackage.IO_DECLARATION: return createIoDeclaration();
			case LibraryPackage.DUCT_OPENING_DECLARATION: return createDuctOpeningDeclaration();
			case LibraryPackage.RESOURCE_GROUP: return createResourceGroup();
			case LibraryPackage.DEVICE_TYPE_SYMMETRY: return createDeviceTypeSymmetry();
			case LibraryPackage.IO_GROUP: return createIoGroup();
			case LibraryPackage.ATTRIBUTE_DEFINITION: return createAttributeDefinition();
			case LibraryPackage.FAULT_PROPAGATION: return createFaultPropagation();
			case LibraryPackage.FUNCTION_INPUT_STATE: return createFunctionInputState();
			case LibraryPackage.POWER_SOURCE: return createPowerSource();
			case LibraryPackage.RESOURCE_LINK: return createResourceLink();
			case LibraryPackage.RESOURCE_MODIFIER: return createResourceModifier();
			case LibraryPackage.MODIFIER_LEVEL: return createModifierLevel();
			case LibraryPackage.MODIFIER_DEFINITION: return createModifierDefinition();
			case LibraryPackage.TASK_TYPE_DISSIMILARITY: return createTaskTypeDissimilarity();
			case LibraryPackage.DEVICE_TYPE_DISSIMILARITY: return createDeviceTypeDissimilarity();
			case LibraryPackage.RESOURCE_TYPE_DISSIMILARITY: return createResourceTypeDissimilarity();
			case LibraryPackage.LIBRARY: return createLibrary();
			case LibraryPackage.SUBLIBRARY: return createSublibrary();
			case LibraryPackage.OUTPUT_TRIGGER: return createOutputTrigger();
			case LibraryPackage.FUNCTION_INPUT_TRIGGER: return createFunctionInputTrigger();
			case LibraryPackage.INTERNAL_STATE_DEFINITION: return createInternalStateDefinition();
			case LibraryPackage.PARAMETER_DEFINITION: return createParameterDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LibraryPackage.IO_DIRECTION_E:
				return createIoDirectionEFromString(eDataType, initialValue);
			case LibraryPackage.ATTRIBUTE_TYPES_E:
				return createAttributeTypesEFromString(eDataType, initialValue);
			case LibraryPackage.ATTRIBUTE_TARGETS_E:
				return createAttributeTargetsEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LibraryPackage.IO_DIRECTION_E:
				return convertIoDirectionEToString(eDataType, instanceValue);
			case LibraryPackage.ATTRIBUTE_TYPES_E:
				return convertAttributeTypesEToString(eDataType, instanceValue);
			case LibraryPackage.ATTRIBUTE_TARGETS_E:
				return convertAttributeTargetsEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAlternatives createResourceAlternatives() {
		ResourceAlternativesImpl resourceAlternatives = new ResourceAlternativesImpl();
		return resourceAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBundles createResourceBundles() {
		ResourceBundlesImpl resourceBundles = new ResourceBundlesImpl();
		return resourceBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskType() {
		TaskTypeImpl taskType = new TaskTypeImpl();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createSignalType() {
		SignalTypeImpl signalType = new SignalTypeImpl();
		return signalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType createDeviceType() {
		DeviceTypeImpl deviceType = new DeviceTypeImpl();
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionType() {
		ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctType createDuctType() {
		DuctTypeImpl ductType = new DuctTypeImpl();
		return ductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireType createWireType() {
		WireTypeImpl wireType = new WireTypeImpl();
		return wireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDeclaration createInputDeclaration() {
		InputDeclarationImpl inputDeclaration = new InputDeclarationImpl();
		return inputDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDeclaration createOutputDeclaration() {
		OutputDeclarationImpl outputDeclaration = new OutputDeclarationImpl();
		return outputDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoDeclaration createIoDeclaration() {
		IoDeclarationImpl ioDeclaration = new IoDeclarationImpl();
		return ioDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctOpeningDeclaration createDuctOpeningDeclaration() {
		DuctOpeningDeclarationImpl ductOpeningDeclaration = new DuctOpeningDeclarationImpl();
		return ductOpeningDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceGroup createResourceGroup() {
		ResourceGroupImpl resourceGroup = new ResourceGroupImpl();
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTypeSymmetry createDeviceTypeSymmetry() {
		DeviceTypeSymmetryImpl deviceTypeSymmetry = new DeviceTypeSymmetryImpl();
		return deviceTypeSymmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoGroup createIoGroup() {
		IoGroupImpl ioGroup = new IoGroupImpl();
		return ioGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionImpl();
		return attributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultPropagation createFaultPropagation() {
		FaultPropagationImpl faultPropagation = new FaultPropagationImpl();
		return faultPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInputState createFunctionInputState() {
		FunctionInputStateImpl functionInputState = new FunctionInputStateImpl();
		return functionInputState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSource createPowerSource() {
		PowerSourceImpl powerSource = new PowerSourceImpl();
		return powerSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLink createResourceLink() {
		ResourceLinkImpl resourceLink = new ResourceLinkImpl();
		return resourceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModifier createResourceModifier() {
		ResourceModifierImpl resourceModifier = new ResourceModifierImpl();
		return resourceModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifierLevel createModifierLevel() {
		ModifierLevelImpl modifierLevel = new ModifierLevelImpl();
		return modifierLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifierDefinition createModifierDefinition() {
		ModifierDefinitionImpl modifierDefinition = new ModifierDefinitionImpl();
		return modifierDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTypeDissimilarity createTaskTypeDissimilarity() {
		TaskTypeDissimilarityImpl taskTypeDissimilarity = new TaskTypeDissimilarityImpl();
		return taskTypeDissimilarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTypeDissimilarity createDeviceTypeDissimilarity() {
		DeviceTypeDissimilarityImpl deviceTypeDissimilarity = new DeviceTypeDissimilarityImpl();
		return deviceTypeDissimilarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeDissimilarity createResourceTypeDissimilarity() {
		ResourceTypeDissimilarityImpl resourceTypeDissimilarity = new ResourceTypeDissimilarityImpl();
		return resourceTypeDissimilarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sublibrary createSublibrary() {
		SublibraryImpl sublibrary = new SublibraryImpl();
		return sublibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputTrigger createOutputTrigger() {
		OutputTriggerImpl outputTrigger = new OutputTriggerImpl();
		return outputTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInputTrigger createFunctionInputTrigger() {
		FunctionInputTriggerImpl functionInputTrigger = new FunctionInputTriggerImpl();
		return functionInputTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalStateDefinition createInternalStateDefinition() {
		InternalStateDefinitionImpl internalStateDefinition = new InternalStateDefinitionImpl();
		return internalStateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoDirectionE createIoDirectionEFromString(EDataType eDataType, String initialValue) {
		IoDirectionE result = IoDirectionE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIoDirectionEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypesE createAttributeTypesEFromString(EDataType eDataType, String initialValue) {
		AttributeTypesE result = AttributeTypesE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypesEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTargetsE createAttributeTargetsEFromString(EDataType eDataType, String initialValue) {
		AttributeTargetsE result = AttributeTargetsE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTargetsEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryPackage getLibraryPackage() {
		return (LibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LibraryPackage getPackage() {
		return LibraryPackage.eINSTANCE;
	}

} //LibraryFactoryImpl
