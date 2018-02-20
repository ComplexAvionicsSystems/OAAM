/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.anatomy.AnatomyPackage;

import de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl;

import de.oaam.model.oaam.capabilities.CapabilitiesPackage;

import de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl;

import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.common.impl.CommonPackageImpl;

import de.oaam.model.oaam.functions.FunctionsPackage;

import de.oaam.model.oaam.functions.impl.FunctionsPackageImpl;

import de.oaam.model.oaam.hardware.HardwarePackage;

import de.oaam.model.oaam.hardware.impl.HardwarePackageImpl;

import de.oaam.model.oaam.impl.OaamPackageImpl;

import de.oaam.model.oaam.library.AttributeDefinition;
import de.oaam.model.oaam.library.AttributeTargetsE;
import de.oaam.model.oaam.library.AttributeTypesE;
import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.DeviceTypeDissimilarity;
import de.oaam.model.oaam.library.DeviceTypeSymmetry;
import de.oaam.model.oaam.library.DuctOpeningDeclaration;
import de.oaam.model.oaam.library.DuctType;
import de.oaam.model.oaam.library.FaultPropagation;
import de.oaam.model.oaam.library.FunctionInputState;
import de.oaam.model.oaam.library.FunctionInputTrigger;
import de.oaam.model.oaam.library.InputDeclaration;
import de.oaam.model.oaam.library.InternalStateDefinition;
import de.oaam.model.oaam.library.IoDeclaration;
import de.oaam.model.oaam.library.IoDirectionE;
import de.oaam.model.oaam.library.IoGroup;
import de.oaam.model.oaam.library.Library;
import de.oaam.model.oaam.library.LibraryContainerA;
import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.LocationType;
import de.oaam.model.oaam.library.OutputDeclaration;
import de.oaam.model.oaam.library.OutputTrigger;
import de.oaam.model.oaam.library.ParameterDefinition;
import de.oaam.model.oaam.library.PowerSource;
import de.oaam.model.oaam.library.Resource;
import de.oaam.model.oaam.library.ResourceAlternatives;
import de.oaam.model.oaam.library.ResourceBundles;
import de.oaam.model.oaam.library.ResourceConsumerA;
import de.oaam.model.oaam.library.ResourceGroup;
import de.oaam.model.oaam.library.ResourceLink;
import de.oaam.model.oaam.library.ResourceProviderA;
import de.oaam.model.oaam.library.ResourceProviderInstanceA;
import de.oaam.model.oaam.library.ResourceType;
import de.oaam.model.oaam.library.ResourceTypeDissimilarity;
import de.oaam.model.oaam.library.ResourceTypeModifier;
import de.oaam.model.oaam.library.ResourceTypeModifierLevel;
import de.oaam.model.oaam.library.ResourceTypeModifierReference;
import de.oaam.model.oaam.library.SignalType;
import de.oaam.model.oaam.library.Sublibrary;
import de.oaam.model.oaam.library.TaskType;
import de.oaam.model.oaam.library.TaskTypeDissimilarity;
import de.oaam.model.oaam.library.WireType;

import de.oaam.model.oaam.mapping.MappingPackage;

import de.oaam.model.oaam.mapping.impl.MappingPackageImpl;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl;

import de.oaam.model.oaam.scenario.ScenarioPackage;

import de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl;

import de.oaam.model.oaam.systems.SystemsPackage;

import de.oaam.model.oaam.systems.impl.SystemsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryPackageImpl extends EPackageImpl implements LibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConsumerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProviderAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProviderInstanceAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAlternativesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceBundlesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ductOpeningDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeSymmetryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInputStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeModifierLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeModifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypeDissimilarityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeDissimilarityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeDissimilarityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sublibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInputTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalStateDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ioDirectionEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypesEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTargetsEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.oaam.model.oaam.library.LibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LibraryPackageImpl() {
		super(eNS_URI, LibraryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LibraryPackage init() {
		if (isInited) return (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Obtain or create and register package
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LibraryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) instanceof OaamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) : OaamPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) instanceof SystemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) : SystemsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) instanceof AnatomyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) : AnatomyPackage.eINSTANCE);
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) : CapabilitiesPackage.eINSTANCE);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);

		// Create package meta-data objects
		theLibraryPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theSystemsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theAnatomyPackage.createPackageContents();
		theCapabilitiesPackage.createPackageContents();
		theRestrictionsPackage.createPackageContents();
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theLibraryPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theSystemsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theAnatomyPackage.initializePackageContents();
		theCapabilitiesPackage.initializePackageContents();
		theRestrictionsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LibraryPackage.eNS_URI, theLibraryPackage);
		return theLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceConsumerA() {
		return resourceConsumerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConsumerA_RequiredResources() {
		return (EReference)resourceConsumerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConsumerA_ConsumedGroups() {
		return (EReference)resourceConsumerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceProviderA() {
		return resourceProviderAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceProviderA_ProvidedBundles() {
		return (EReference)resourceProviderAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceProviderA_PossibleResourceProvisions() {
		return (EReference)resourceProviderAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceProviderA_ProvidedGroups() {
		return (EReference)resourceProviderAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceProviderA_ResourceLinks() {
		return (EReference)resourceProviderAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceProviderInstanceA() {
		return resourceProviderInstanceAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceProviderInstanceA_RequiredModifiers() {
		return (EReference)resourceProviderInstanceAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryContainerA() {
		return libraryContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_DataTypes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_ResourceTypes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_RessourceBundles() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_ResourceModifiers() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_ResourceTypeDissimilarities() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_TaskTypes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_TaskTypeDissimilarity() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_SignalTypes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_DeviceTypes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_DeviceTypeSymmetries() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_DeviceTypeDissimilarities() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_ConnectionTypes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_WireTypes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_LocationTypes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_RouteTypes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_GenericAttributes() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryContainerA_Sublibraries() {
		return (EReference)libraryContainerAEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceType() {
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsConsumed() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsDistinguishable() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsPropagated() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Direction() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsIo() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsConfigurable() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_PropagetedResources() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_AllowedModifiers() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_Alternatives() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Type() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Count() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Modifiers() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAlternatives() {
		return resourceAlternativesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAlternatives_Resources() {
		return (EReference)resourceAlternativesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceBundles() {
		return resourceBundlesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceBundles_Resources() {
		return (EReference)resourceBundlesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceBundles_Mtbf() {
		return (EAttribute)resourceBundlesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceBundles_Cost() {
		return (EAttribute)resourceBundlesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceBundles_Mass() {
		return (EAttribute)resourceBundlesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskType() {
		return taskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_Outputs() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_Inputs() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_IsDeterministic() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_PreferredExecutionRate() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_InternalStates() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_Parameters() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalType() {
		return signalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceType() {
		return deviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceType_Ios() {
		return (EReference)deviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_IsSubdevice() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_CanHaveSubdevices() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_Mtbf() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_Weight() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_Cost() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceType_IoGroups() {
		return (EReference)deviceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_IsSelfManaging() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionType() {
		return connectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_IsInformation() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_IsPower() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionType_WireType() {
		return (EReference)connectionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_IsWireless() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_AllowsCircles() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_NSources() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_NTagets() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_NJoints() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_MaxJointBranches() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_MaxInterfaceToJointDistance() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionType_SwitchTypes() {
		return (EReference)connectionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_IsSwitched() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_DirectConnectionsAllowed() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_MaxLength() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_IsUnidirectional() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationType() {
		return locationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_IsJoint() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_DuctOpenings() {
		return (EReference)locationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuctType() {
		return ductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWireType() {
		return wireTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_SpecificWeight() {
		return (EAttribute)wireTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_SpecificPrice() {
		return (EAttribute)wireTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_NConductors() {
		return (EAttribute)wireTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_MinBendingRadius() {
		return (EAttribute)wireTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_NShields() {
		return (EAttribute)wireTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDeclaration() {
		return inputDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputDeclaration_Type() {
		return (EReference)inputDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDeclaration_Unit() {
		return (EAttribute)inputDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDeclaration_Precondition() {
		return (EAttribute)inputDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDeclaration_Range() {
		return (EAttribute)inputDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDeclaration_LowerBound() {
		return (EAttribute)inputDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDeclaration_UpperBound() {
		return (EAttribute)inputDeclarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDeclaration() {
		return outputDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDeclaration_Unit() {
		return (EAttribute)outputDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDeclaration_Postcondition() {
		return (EAttribute)outputDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDeclaration_Trigger() {
		return (EReference)outputDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDeclaration_Range() {
		return (EAttribute)outputDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDeclaration_Type() {
		return (EReference)outputDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDeclaration_LowerBound() {
		return (EAttribute)outputDeclarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDeclaration_UpperBound() {
		return (EAttribute)outputDeclarationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDeclaration_FaultPropagations() {
		return (EReference)outputDeclarationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoDeclaration() {
		return ioDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoDeclaration_Resources() {
		return (EReference)ioDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuctOpeningDeclaration() {
		return ductOpeningDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceGroup() {
		return resourceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceGroup_Resources() {
		return (EReference)resourceGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceTypeSymmetry() {
		return deviceTypeSymmetryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceTypeSymmetry_DeviceTypes() {
		return (EReference)deviceTypeSymmetryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoGroup() {
		return ioGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoGroup_Ios() {
		return (EReference)ioGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinition() {
		return attributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinition_DataType() {
		return (EAttribute)attributeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinition_Target() {
		return (EAttribute)attributeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultPropagation() {
		return faultPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultPropagation_OutputState() {
		return (EAttribute)faultPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultPropagation_Logic() {
		return (EReference)faultPropagationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionInputState() {
		return functionInputStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionInputState_State() {
		return (EAttribute)functionInputStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInputState_Input() {
		return (EReference)functionInputStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSource() {
		return powerSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceLink() {
		return resourceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceLink_In() {
		return (EReference)resourceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceLink_Out() {
		return (EReference)resourceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceTypeModifier() {
		return resourceTypeModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceTypeModifier_Levels() {
		return (EReference)resourceTypeModifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceTypeModifierLevel() {
		return resourceTypeModifierLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceTypeModifierLevel_EqualAlternatives() {
		return (EReference)resourceTypeModifierLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceTypeModifierLevel_BetterAlternative() {
		return (EReference)resourceTypeModifierLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceTypeModifierReference() {
		return resourceTypeModifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceTypeModifierReference_Type() {
		return (EReference)resourceTypeModifierReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceTypeModifierReference_AllowedLevels() {
		return (EReference)resourceTypeModifierReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskTypeDissimilarity() {
		return taskTypeDissimilarityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskTypeDissimilarity_Tasks() {
		return (EReference)taskTypeDissimilarityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskTypeDissimilarity_PercentageOfCommonCode() {
		return (EAttribute)taskTypeDissimilarityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceTypeDissimilarity() {
		return deviceTypeDissimilarityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceTypeDissimilarity_Devices() {
		return (EReference)deviceTypeDissimilarityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceTypeDissimilarity_PercentageOfCommonHardware() {
		return (EAttribute)deviceTypeDissimilarityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceTypeDissimilarity() {
		return resourceTypeDissimilarityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceTypeDissimilarity_ResourceTypes() {
		return (EReference)resourceTypeDissimilarityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSublibrary() {
		return sublibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputTrigger() {
		return outputTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputTrigger_Logic() {
		return (EReference)outputTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputTrigger_FixedRate() {
		return (EAttribute)outputTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputTrigger_IsFixedRate() {
		return (EAttribute)outputTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionInputTrigger() {
		return functionInputTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInputTrigger_Input() {
		return (EReference)functionInputTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalStateDefinition() {
		return internalStateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalStateDefinition_Type() {
		return (EReference)internalStateDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDefinition() {
		return parameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDefinition_Type() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIoDirectionE() {
		return ioDirectionEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeTypesE() {
		return attributeTypesEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeTargetsE() {
		return attributeTargetsEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFactory getLibraryFactory() {
		return (LibraryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceConsumerAEClass = createEClass(RESOURCE_CONSUMER_A);
		createEReference(resourceConsumerAEClass, RESOURCE_CONSUMER_A__REQUIRED_RESOURCES);
		createEReference(resourceConsumerAEClass, RESOURCE_CONSUMER_A__CONSUMED_GROUPS);

		resourceProviderAEClass = createEClass(RESOURCE_PROVIDER_A);
		createEReference(resourceProviderAEClass, RESOURCE_PROVIDER_A__PROVIDED_BUNDLES);
		createEReference(resourceProviderAEClass, RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS);
		createEReference(resourceProviderAEClass, RESOURCE_PROVIDER_A__PROVIDED_GROUPS);
		createEReference(resourceProviderAEClass, RESOURCE_PROVIDER_A__RESOURCE_LINKS);

		resourceProviderInstanceAEClass = createEClass(RESOURCE_PROVIDER_INSTANCE_A);
		createEReference(resourceProviderInstanceAEClass, RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS);

		libraryContainerAEClass = createEClass(LIBRARY_CONTAINER_A);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__DATA_TYPES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__RESOURCE_TYPES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__RESSOURCE_BUNDLES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__TASK_TYPES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__SIGNAL_TYPES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__DEVICE_TYPES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__CONNECTION_TYPES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__WIRE_TYPES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__LOCATION_TYPES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__ROUTE_TYPES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES);
		createEReference(libraryContainerAEClass, LIBRARY_CONTAINER_A__SUBLIBRARIES);

		resourceTypeEClass = createEClass(RESOURCE_TYPE);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__IS_CONSUMED);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__IS_DISTINGUISHABLE);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__IS_PROPAGATED);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__DIRECTION);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__IS_IO);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__IS_CONFIGURABLE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__PROPAGETED_RESOURCES);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__ALLOWED_MODIFIERS);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__ALTERNATIVES);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__TYPE);
		createEAttribute(resourceEClass, RESOURCE__COUNT);
		createEReference(resourceEClass, RESOURCE__MODIFIERS);

		resourceAlternativesEClass = createEClass(RESOURCE_ALTERNATIVES);
		createEReference(resourceAlternativesEClass, RESOURCE_ALTERNATIVES__RESOURCES);

		resourceBundlesEClass = createEClass(RESOURCE_BUNDLES);
		createEReference(resourceBundlesEClass, RESOURCE_BUNDLES__RESOURCES);
		createEAttribute(resourceBundlesEClass, RESOURCE_BUNDLES__MTBF);
		createEAttribute(resourceBundlesEClass, RESOURCE_BUNDLES__COST);
		createEAttribute(resourceBundlesEClass, RESOURCE_BUNDLES__MASS);

		taskTypeEClass = createEClass(TASK_TYPE);
		createEReference(taskTypeEClass, TASK_TYPE__OUTPUTS);
		createEReference(taskTypeEClass, TASK_TYPE__INPUTS);
		createEAttribute(taskTypeEClass, TASK_TYPE__IS_DETERMINISTIC);
		createEAttribute(taskTypeEClass, TASK_TYPE__PREFERRED_EXECUTION_RATE);
		createEReference(taskTypeEClass, TASK_TYPE__INTERNAL_STATES);
		createEReference(taskTypeEClass, TASK_TYPE__PARAMETERS);

		signalTypeEClass = createEClass(SIGNAL_TYPE);

		deviceTypeEClass = createEClass(DEVICE_TYPE);
		createEReference(deviceTypeEClass, DEVICE_TYPE__IOS);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__IS_SUBDEVICE);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__CAN_HAVE_SUBDEVICES);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__MTBF);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__WEIGHT);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__COST);
		createEReference(deviceTypeEClass, DEVICE_TYPE__IO_GROUPS);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__IS_SELF_MANAGING);

		connectionTypeEClass = createEClass(CONNECTION_TYPE);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__IS_INFORMATION);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__IS_POWER);
		createEReference(connectionTypeEClass, CONNECTION_TYPE__WIRE_TYPE);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__IS_WIRELESS);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__ALLOWS_CIRCLES);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__NSOURCES);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__NTAGETS);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__NJOINTS);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__MAX_JOINT_BRANCHES);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE);
		createEReference(connectionTypeEClass, CONNECTION_TYPE__SWITCH_TYPES);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__IS_SWITCHED);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__MAX_LENGTH);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__IS_UNIDIRECTIONAL);

		locationTypeEClass = createEClass(LOCATION_TYPE);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__IS_JOINT);
		createEReference(locationTypeEClass, LOCATION_TYPE__DUCT_OPENINGS);

		ductTypeEClass = createEClass(DUCT_TYPE);

		wireTypeEClass = createEClass(WIRE_TYPE);
		createEAttribute(wireTypeEClass, WIRE_TYPE__SPECIFIC_WEIGHT);
		createEAttribute(wireTypeEClass, WIRE_TYPE__SPECIFIC_PRICE);
		createEAttribute(wireTypeEClass, WIRE_TYPE__NCONDUCTORS);
		createEAttribute(wireTypeEClass, WIRE_TYPE__MIN_BENDING_RADIUS);
		createEAttribute(wireTypeEClass, WIRE_TYPE__NSHIELDS);

		inputDeclarationEClass = createEClass(INPUT_DECLARATION);
		createEReference(inputDeclarationEClass, INPUT_DECLARATION__TYPE);
		createEAttribute(inputDeclarationEClass, INPUT_DECLARATION__UNIT);
		createEAttribute(inputDeclarationEClass, INPUT_DECLARATION__PRECONDITION);
		createEAttribute(inputDeclarationEClass, INPUT_DECLARATION__RANGE);
		createEAttribute(inputDeclarationEClass, INPUT_DECLARATION__LOWER_BOUND);
		createEAttribute(inputDeclarationEClass, INPUT_DECLARATION__UPPER_BOUND);

		outputDeclarationEClass = createEClass(OUTPUT_DECLARATION);
		createEAttribute(outputDeclarationEClass, OUTPUT_DECLARATION__UNIT);
		createEAttribute(outputDeclarationEClass, OUTPUT_DECLARATION__POSTCONDITION);
		createEReference(outputDeclarationEClass, OUTPUT_DECLARATION__TRIGGER);
		createEAttribute(outputDeclarationEClass, OUTPUT_DECLARATION__RANGE);
		createEReference(outputDeclarationEClass, OUTPUT_DECLARATION__TYPE);
		createEAttribute(outputDeclarationEClass, OUTPUT_DECLARATION__LOWER_BOUND);
		createEAttribute(outputDeclarationEClass, OUTPUT_DECLARATION__UPPER_BOUND);
		createEReference(outputDeclarationEClass, OUTPUT_DECLARATION__FAULT_PROPAGATIONS);

		ioDeclarationEClass = createEClass(IO_DECLARATION);
		createEReference(ioDeclarationEClass, IO_DECLARATION__RESOURCES);

		ductOpeningDeclarationEClass = createEClass(DUCT_OPENING_DECLARATION);

		resourceGroupEClass = createEClass(RESOURCE_GROUP);
		createEReference(resourceGroupEClass, RESOURCE_GROUP__RESOURCES);

		deviceTypeSymmetryEClass = createEClass(DEVICE_TYPE_SYMMETRY);
		createEReference(deviceTypeSymmetryEClass, DEVICE_TYPE_SYMMETRY__DEVICE_TYPES);

		ioGroupEClass = createEClass(IO_GROUP);
		createEReference(ioGroupEClass, IO_GROUP__IOS);

		attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);
		createEAttribute(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__DATA_TYPE);
		createEAttribute(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__TARGET);

		faultPropagationEClass = createEClass(FAULT_PROPAGATION);
		createEAttribute(faultPropagationEClass, FAULT_PROPAGATION__OUTPUT_STATE);
		createEReference(faultPropagationEClass, FAULT_PROPAGATION__LOGIC);

		functionInputStateEClass = createEClass(FUNCTION_INPUT_STATE);
		createEAttribute(functionInputStateEClass, FUNCTION_INPUT_STATE__STATE);
		createEReference(functionInputStateEClass, FUNCTION_INPUT_STATE__INPUT);

		powerSourceEClass = createEClass(POWER_SOURCE);

		resourceLinkEClass = createEClass(RESOURCE_LINK);
		createEReference(resourceLinkEClass, RESOURCE_LINK__IN);
		createEReference(resourceLinkEClass, RESOURCE_LINK__OUT);

		resourceTypeModifierEClass = createEClass(RESOURCE_TYPE_MODIFIER);
		createEReference(resourceTypeModifierEClass, RESOURCE_TYPE_MODIFIER__LEVELS);

		resourceTypeModifierLevelEClass = createEClass(RESOURCE_TYPE_MODIFIER_LEVEL);
		createEReference(resourceTypeModifierLevelEClass, RESOURCE_TYPE_MODIFIER_LEVEL__EQUAL_ALTERNATIVES);
		createEReference(resourceTypeModifierLevelEClass, RESOURCE_TYPE_MODIFIER_LEVEL__BETTER_ALTERNATIVE);

		resourceTypeModifierReferenceEClass = createEClass(RESOURCE_TYPE_MODIFIER_REFERENCE);
		createEReference(resourceTypeModifierReferenceEClass, RESOURCE_TYPE_MODIFIER_REFERENCE__TYPE);
		createEReference(resourceTypeModifierReferenceEClass, RESOURCE_TYPE_MODIFIER_REFERENCE__ALLOWED_LEVELS);

		taskTypeDissimilarityEClass = createEClass(TASK_TYPE_DISSIMILARITY);
		createEReference(taskTypeDissimilarityEClass, TASK_TYPE_DISSIMILARITY__TASKS);
		createEAttribute(taskTypeDissimilarityEClass, TASK_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_CODE);

		deviceTypeDissimilarityEClass = createEClass(DEVICE_TYPE_DISSIMILARITY);
		createEReference(deviceTypeDissimilarityEClass, DEVICE_TYPE_DISSIMILARITY__DEVICES);
		createEAttribute(deviceTypeDissimilarityEClass, DEVICE_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_HARDWARE);

		resourceTypeDissimilarityEClass = createEClass(RESOURCE_TYPE_DISSIMILARITY);
		createEReference(resourceTypeDissimilarityEClass, RESOURCE_TYPE_DISSIMILARITY__RESOURCE_TYPES);

		libraryEClass = createEClass(LIBRARY);

		sublibraryEClass = createEClass(SUBLIBRARY);

		outputTriggerEClass = createEClass(OUTPUT_TRIGGER);
		createEReference(outputTriggerEClass, OUTPUT_TRIGGER__LOGIC);
		createEAttribute(outputTriggerEClass, OUTPUT_TRIGGER__FIXED_RATE);
		createEAttribute(outputTriggerEClass, OUTPUT_TRIGGER__IS_FIXED_RATE);

		functionInputTriggerEClass = createEClass(FUNCTION_INPUT_TRIGGER);
		createEReference(functionInputTriggerEClass, FUNCTION_INPUT_TRIGGER__INPUT);

		internalStateDefinitionEClass = createEClass(INTERNAL_STATE_DEFINITION);
		createEReference(internalStateDefinitionEClass, INTERNAL_STATE_DEFINITION__TYPE);

		parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__TYPE);

		// Create enums
		ioDirectionEEEnum = createEEnum(IO_DIRECTION_E);
		attributeTypesEEEnum = createEEnum(ATTRIBUTE_TYPES_E);
		attributeTargetsEEEnum = createEEnum(ATTRIBUTE_TARGETS_E);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		libraryContainerAEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceTypeEClass.getESuperTypes().add(this.getResourceConsumerA());
		resourceTypeEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceAlternativesEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceBundlesEClass.getESuperTypes().add(this.getResourceConsumerA());
		resourceBundlesEClass.getESuperTypes().add(theCommonPackage.getElementA());
		taskTypeEClass.getESuperTypes().add(this.getResourceConsumerA());
		taskTypeEClass.getESuperTypes().add(theCommonPackage.getElementA());
		signalTypeEClass.getESuperTypes().add(this.getResourceConsumerA());
		signalTypeEClass.getESuperTypes().add(theCommonPackage.getElementA());
		deviceTypeEClass.getESuperTypes().add(this.getResourceConsumerA());
		deviceTypeEClass.getESuperTypes().add(this.getResourceProviderA());
		deviceTypeEClass.getESuperTypes().add(theCommonPackage.getElementA());
		connectionTypeEClass.getESuperTypes().add(this.getResourceProviderA());
		connectionTypeEClass.getESuperTypes().add(this.getResourceConsumerA());
		connectionTypeEClass.getESuperTypes().add(theCommonPackage.getElementA());
		locationTypeEClass.getESuperTypes().add(this.getResourceProviderA());
		locationTypeEClass.getESuperTypes().add(theCommonPackage.getElementA());
		ductTypeEClass.getESuperTypes().add(this.getResourceProviderA());
		ductTypeEClass.getESuperTypes().add(theCommonPackage.getElementA());
		wireTypeEClass.getESuperTypes().add(theCommonPackage.getElementA());
		inputDeclarationEClass.getESuperTypes().add(theCommonPackage.getElementA());
		outputDeclarationEClass.getESuperTypes().add(theCommonPackage.getElementA());
		ioDeclarationEClass.getESuperTypes().add(theCommonPackage.getElementA());
		ductOpeningDeclarationEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceGroupEClass.getESuperTypes().add(theCommonPackage.getElementA());
		deviceTypeSymmetryEClass.getESuperTypes().add(theCommonPackage.getElementA());
		ioGroupEClass.getESuperTypes().add(theCommonPackage.getElementA());
		attributeDefinitionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		faultPropagationEClass.getESuperTypes().add(theCommonPackage.getElementA());
		functionInputStateEClass.getESuperTypes().add(theCommonPackage.getBoolA());
		functionInputStateEClass.getESuperTypes().add(theCommonPackage.getElementA());
		powerSourceEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceLinkEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceTypeModifierEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceTypeModifierLevelEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceTypeModifierLevelEClass.getESuperTypes().add(this.getResourceConsumerA());
		resourceTypeModifierReferenceEClass.getESuperTypes().add(theCommonPackage.getElementA());
		taskTypeDissimilarityEClass.getESuperTypes().add(theCommonPackage.getElementA());
		deviceTypeDissimilarityEClass.getESuperTypes().add(theCommonPackage.getElementA());
		resourceTypeDissimilarityEClass.getESuperTypes().add(theCommonPackage.getElementA());
		libraryEClass.getESuperTypes().add(this.getLibraryContainerA());
		sublibraryEClass.getESuperTypes().add(this.getLibraryContainerA());
		outputTriggerEClass.getESuperTypes().add(theCommonPackage.getElementA());
		functionInputTriggerEClass.getESuperTypes().add(theCommonPackage.getBoolA());
		functionInputTriggerEClass.getESuperTypes().add(theCommonPackage.getElementA());
		internalStateDefinitionEClass.getESuperTypes().add(theCommonPackage.getElementA());
		parameterDefinitionEClass.getESuperTypes().add(theCommonPackage.getElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceConsumerAEClass, ResourceConsumerA.class, "ResourceConsumerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceConsumerA_RequiredResources(), this.getResource(), null, "requiredResources", null, 0, -1, ResourceConsumerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConsumerA_ConsumedGroups(), this.getResourceGroup(), null, "consumedGroups", null, 0, -1, ResourceConsumerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceProviderAEClass, ResourceProviderA.class, "ResourceProviderA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceProviderA_ProvidedBundles(), this.getResourceBundles(), null, "providedBundles", null, 0, -1, ResourceProviderA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceProviderA_PossibleResourceProvisions(), this.getResourceType(), null, "possibleResourceProvisions", null, 0, -1, ResourceProviderA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceProviderA_ProvidedGroups(), this.getResourceGroup(), null, "providedGroups", null, 0, -1, ResourceProviderA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceProviderA_ResourceLinks(), this.getResourceLink(), null, "resourceLinks", null, 0, -1, ResourceProviderA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceProviderInstanceAEClass, ResourceProviderInstanceA.class, "ResourceProviderInstanceA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceProviderInstanceA_RequiredModifiers(), this.getResourceTypeModifierLevel(), null, "requiredModifiers", null, 0, -1, ResourceProviderInstanceA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryContainerAEClass, LibraryContainerA.class, "LibraryContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibraryContainerA_DataTypes(), theCommonPackage.getDataTypeA(), null, "dataTypes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_ResourceTypes(), this.getResourceType(), null, "resourceTypes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_RessourceBundles(), this.getResourceBundles(), null, "ressourceBundles", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_ResourceModifiers(), this.getResourceTypeModifier(), null, "resourceModifiers", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_ResourceTypeDissimilarities(), this.getResourceTypeDissimilarity(), null, "resourceTypeDissimilarities", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_TaskTypes(), this.getTaskType(), null, "taskTypes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_TaskTypeDissimilarity(), this.getTaskTypeDissimilarity(), null, "taskTypeDissimilarity", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_SignalTypes(), this.getSignalType(), null, "signalTypes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_DeviceTypes(), this.getDeviceType(), null, "deviceTypes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_DeviceTypeSymmetries(), this.getDeviceTypeSymmetry(), null, "deviceTypeSymmetries", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_DeviceTypeDissimilarities(), this.getDeviceTypeDissimilarity(), null, "deviceTypeDissimilarities", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_ConnectionTypes(), this.getConnectionType(), null, "connectionTypes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_WireTypes(), this.getWireType(), null, "wireTypes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_LocationTypes(), this.getLocationType(), null, "locationTypes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_RouteTypes(), this.getDuctType(), null, "routeTypes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_GenericAttributes(), this.getAttributeDefinition(), null, "genericAttributes", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryContainerA_Sublibraries(), this.getSublibrary(), null, "sublibraries", null, 0, -1, LibraryContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceType_IsConsumed(), ecorePackage.getEBoolean(), "isConsumed", "true", 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_IsDistinguishable(), ecorePackage.getEBoolean(), "isDistinguishable", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_IsPropagated(), ecorePackage.getEBoolean(), "isPropagated", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_Direction(), this.getIoDirectionE(), "direction", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_IsIo(), ecorePackage.getEBoolean(), "isIo", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_IsConfigurable(), ecorePackage.getEBoolean(), "isConfigurable", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_PropagetedResources(), this.getResource(), null, "propagetedResources", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_AllowedModifiers(), this.getResourceTypeModifierReference(), null, "allowedModifiers", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Alternatives(), this.getResourceAlternatives(), null, "alternatives", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Type(), this.getResourceType(), null, "type", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Count(), ecorePackage.getEDouble(), "count", "1.0", 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Modifiers(), this.getResourceTypeModifierLevel(), null, "modifiers", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAlternativesEClass, ResourceAlternatives.class, "ResourceAlternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceAlternatives_Resources(), this.getResource(), null, "resources", null, 1, -1, ResourceAlternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceBundlesEClass, ResourceBundles.class, "ResourceBundles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceBundles_Resources(), this.getResource(), null, "resources", null, 0, -1, ResourceBundles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceBundles_Mtbf(), ecorePackage.getEDouble(), "mtbf", null, 1, 1, ResourceBundles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceBundles_Cost(), ecorePackage.getEDouble(), "cost", null, 1, 1, ResourceBundles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceBundles_Mass(), ecorePackage.getEDouble(), "mass", null, 1, 1, ResourceBundles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTypeEClass, TaskType.class, "TaskType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskType_Outputs(), this.getOutputDeclaration(), null, "outputs", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_Inputs(), this.getInputDeclaration(), null, "inputs", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_IsDeterministic(), ecorePackage.getEBoolean(), "isDeterministic", null, 1, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_PreferredExecutionRate(), ecorePackage.getEFloat(), "preferredExecutionRate", "0.0", 1, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_InternalStates(), this.getInternalStateDefinition(), null, "internalStates", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_Parameters(), this.getParameterDefinition(), null, "parameters", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalTypeEClass, SignalType.class, "SignalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceTypeEClass, DeviceType.class, "DeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceType_Ios(), this.getIoDeclaration(), null, "ios", null, 0, -1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_IsSubdevice(), ecorePackage.getEBoolean(), "isSubdevice", "false", 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_CanHaveSubdevices(), ecorePackage.getEBoolean(), "canHaveSubdevices", "false", 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_Mtbf(), ecorePackage.getEDouble(), "mtbf", null, 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_Weight(), ecorePackage.getEDouble(), "weight", null, 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_Cost(), ecorePackage.getEDouble(), "cost", null, 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceType_IoGroups(), this.getIoGroup(), null, "ioGroups", null, 0, -1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_IsSelfManaging(), ecorePackage.getEBoolean(), "isSelfManaging", "false", 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionTypeEClass, ConnectionType.class, "ConnectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionType_IsInformation(), ecorePackage.getEBoolean(), "isInformation", "true", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_IsPower(), ecorePackage.getEBoolean(), "isPower", "false", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionType_WireType(), this.getWireType(), null, "wireType", null, 0, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_IsWireless(), ecorePackage.getEBoolean(), "isWireless", "false", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_AllowsCircles(), ecorePackage.getEBoolean(), "allowsCircles", "false", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_NSources(), ecorePackage.getEInt(), "nSources", "1", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_NTagets(), ecorePackage.getEInt(), "nTagets", "1", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_NJoints(), ecorePackage.getEInt(), "nJoints", "0", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_MaxJointBranches(), ecorePackage.getEInt(), "maxJointBranches", "0", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_MaxInterfaceToJointDistance(), ecorePackage.getEDouble(), "maxInterfaceToJointDistance", "0", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionType_SwitchTypes(), this.getDeviceType(), null, "switchTypes", null, 0, -1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_IsSwitched(), ecorePackage.getEBoolean(), "isSwitched", null, 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_DirectConnectionsAllowed(), ecorePackage.getEBoolean(), "directConnectionsAllowed", null, 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_MaxLength(), ecorePackage.getEDouble(), "maxLength", "100", 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionType_IsUnidirectional(), ecorePackage.getEBoolean(), "isUnidirectional", null, 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationTypeEClass, LocationType.class, "LocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationType_IsJoint(), ecorePackage.getEBoolean(), "isJoint", null, 1, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationType_DuctOpenings(), this.getDuctOpeningDeclaration(), null, "ductOpenings", null, 0, -1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ductTypeEClass, DuctType.class, "DuctType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wireTypeEClass, WireType.class, "WireType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWireType_SpecificWeight(), ecorePackage.getEDouble(), "specificWeight", null, 1, 1, WireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWireType_SpecificPrice(), ecorePackage.getEDouble(), "specificPrice", null, 1, 1, WireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWireType_NConductors(), ecorePackage.getEInt(), "nConductors", "1", 1, 1, WireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWireType_MinBendingRadius(), ecorePackage.getEDouble(), "minBendingRadius", null, 1, 1, WireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWireType_NShields(), ecorePackage.getEInt(), "nShields", "1", 1, 1, WireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputDeclarationEClass, InputDeclaration.class, "InputDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputDeclaration_Type(), theCommonPackage.getDataTypeA(), null, "type", null, 1, 1, InputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDeclaration_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, InputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDeclaration_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, InputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDeclaration_Range(), ecorePackage.getEString(), "range", null, 0, 1, InputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDeclaration_LowerBound(), ecorePackage.getEInt(), "lowerBound", "1", 1, 1, InputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDeclaration_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 1, 1, InputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputDeclarationEClass, OutputDeclaration.class, "OutputDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputDeclaration_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, OutputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDeclaration_Postcondition(), ecorePackage.getEString(), "postcondition", null, 0, 1, OutputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputDeclaration_Trigger(), this.getOutputTrigger(), null, "trigger", null, 1, 1, OutputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDeclaration_Range(), ecorePackage.getEString(), "range", null, 0, 1, OutputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputDeclaration_Type(), theCommonPackage.getDataTypeA(), null, "type", null, 1, 1, OutputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDeclaration_LowerBound(), ecorePackage.getEInt(), "lowerBound", "1", 1, 1, OutputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDeclaration_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 1, 1, OutputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputDeclaration_FaultPropagations(), this.getFaultPropagation(), null, "faultPropagations", null, 0, -1, OutputDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioDeclarationEClass, IoDeclaration.class, "IoDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoDeclaration_Resources(), this.getResource(), null, "resources", null, 1, -1, IoDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ductOpeningDeclarationEClass, DuctOpeningDeclaration.class, "DuctOpeningDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceGroupEClass, ResourceGroup.class, "ResourceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceGroup_Resources(), this.getResource(), null, "resources", null, 0, -1, ResourceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceTypeSymmetryEClass, DeviceTypeSymmetry.class, "DeviceTypeSymmetry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceTypeSymmetry_DeviceTypes(), this.getDeviceType(), null, "deviceTypes", null, 2, -1, DeviceTypeSymmetry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioGroupEClass, IoGroup.class, "IoGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoGroup_Ios(), this.getIoDeclaration(), null, "ios", null, 0, -1, IoGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDefinitionEClass, AttributeDefinition.class, "AttributeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDefinition_DataType(), this.getAttributeTypesE(), "dataType", null, 1, 1, AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDefinition_Target(), this.getAttributeTargetsE(), "target", null, 1, 1, AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultPropagationEClass, FaultPropagation.class, "FaultPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaultPropagation_OutputState(), theCommonPackage.getIntegretyStateE(), "outputState", null, 1, 1, FaultPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultPropagation_Logic(), theCommonPackage.getBoolA(), null, "logic", null, 1, 1, FaultPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionInputStateEClass, FunctionInputState.class, "FunctionInputState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionInputState_State(), theCommonPackage.getIntegretyStateE(), "state", null, 1, 1, FunctionInputState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInputState_Input(), this.getInputDeclaration(), null, "input", null, 1, 1, FunctionInputState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerSourceEClass, PowerSource.class, "PowerSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceLinkEClass, ResourceLink.class, "ResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceLink_In(), this.getResource(), null, "in", null, 1, -1, ResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceLink_Out(), this.getResource(), null, "out", null, 1, -1, ResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceTypeModifierEClass, ResourceTypeModifier.class, "ResourceTypeModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceTypeModifier_Levels(), this.getResourceTypeModifierLevel(), null, "levels", null, 1, -1, ResourceTypeModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceTypeModifierLevelEClass, ResourceTypeModifierLevel.class, "ResourceTypeModifierLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceTypeModifierLevel_EqualAlternatives(), this.getResourceTypeModifierLevel(), null, "equalAlternatives", null, 0, -1, ResourceTypeModifierLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceTypeModifierLevel_BetterAlternative(), this.getResourceTypeModifierLevel(), null, "betterAlternative", null, 0, 1, ResourceTypeModifierLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceTypeModifierReferenceEClass, ResourceTypeModifierReference.class, "ResourceTypeModifierReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceTypeModifierReference_Type(), this.getResourceTypeModifier(), null, "type", null, 1, 1, ResourceTypeModifierReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceTypeModifierReference_AllowedLevels(), this.getResourceTypeModifierLevel(), null, "allowedLevels", null, 1, -1, ResourceTypeModifierReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTypeDissimilarityEClass, TaskTypeDissimilarity.class, "TaskTypeDissimilarity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskTypeDissimilarity_Tasks(), this.getTaskType(), null, "tasks", null, 0, -1, TaskTypeDissimilarity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskTypeDissimilarity_PercentageOfCommonCode(), ecorePackage.getEDouble(), "percentageOfCommonCode", null, 1, 1, TaskTypeDissimilarity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceTypeDissimilarityEClass, DeviceTypeDissimilarity.class, "DeviceTypeDissimilarity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceTypeDissimilarity_Devices(), this.getDeviceType(), null, "devices", null, 0, -1, DeviceTypeDissimilarity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceTypeDissimilarity_PercentageOfCommonHardware(), ecorePackage.getEDouble(), "percentageOfCommonHardware", null, 1, 1, DeviceTypeDissimilarity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceTypeDissimilarityEClass, ResourceTypeDissimilarity.class, "ResourceTypeDissimilarity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceTypeDissimilarity_ResourceTypes(), this.getResourceType(), null, "resourceTypes", null, 0, -1, ResourceTypeDissimilarity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sublibraryEClass, Sublibrary.class, "Sublibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputTriggerEClass, OutputTrigger.class, "OutputTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputTrigger_Logic(), theCommonPackage.getBoolA(), null, "logic", null, 0, 1, OutputTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputTrigger_FixedRate(), ecorePackage.getEFloat(), "fixedRate", null, 1, 1, OutputTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputTrigger_IsFixedRate(), ecorePackage.getEBoolean(), "isFixedRate", "false", 1, 1, OutputTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionInputTriggerEClass, FunctionInputTrigger.class, "FunctionInputTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionInputTrigger_Input(), this.getInputDeclaration(), null, "input", null, 1, 1, FunctionInputTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalStateDefinitionEClass, InternalStateDefinition.class, "InternalStateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalStateDefinition_Type(), theCommonPackage.getDataTypeA(), null, "type", null, 1, 1, InternalStateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterDefinition_Type(), theCommonPackage.getDataTypeA(), null, "type", null, 1, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ioDirectionEEEnum, IoDirectionE.class, "IoDirectionE");
		addEEnumLiteral(ioDirectionEEEnum, IoDirectionE.NONE);
		addEEnumLiteral(ioDirectionEEEnum, IoDirectionE.IN);
		addEEnumLiteral(ioDirectionEEEnum, IoDirectionE.OUT);
		addEEnumLiteral(ioDirectionEEEnum, IoDirectionE.BOTH);

		initEEnum(attributeTypesEEEnum, AttributeTypesE.class, "AttributeTypesE");
		addEEnumLiteral(attributeTypesEEEnum, AttributeTypesE.STRING);
		addEEnumLiteral(attributeTypesEEEnum, AttributeTypesE.NUMERIC);
		addEEnumLiteral(attributeTypesEEEnum, AttributeTypesE.BOOL);

		initEEnum(attributeTargetsEEEnum, AttributeTargetsE.class, "AttributeTargetsE");
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.DEVICE_TYPE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.DEVICE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.FUNCTION_TYPE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.FUNCTION);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.WIRE_TYPE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.RESOURCE_TYPE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.RESOURCE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.SIGNAL_TYPE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.SIGNAL);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.CONNECTION_TYPE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.CONNECTION);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.LOCATION_TYPE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.LOCATION);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.DUCT_TYPE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.DUCT);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.RESOURCE_BUNDLE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.RESOURCE_ALTERNATIVE);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.RESOURCE_GROUP);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.AREA);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.VARIANT);
		addEEnumLiteral(attributeTargetsEEEnum, AttributeTargetsE.TIMEFRAME);
	}

} //LibraryPackageImpl
