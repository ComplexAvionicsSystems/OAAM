/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.library.LibraryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The spatial topology of installation locations and cable routes.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.anatomy.AnatomyFactory
 * @model kind="package"
 * @generated
 */
public interface AnatomyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "anatomy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v140/anatomy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.anatomy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnatomyPackage eINSTANCE = de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getAnatomyContainerA()
	 * @generated
	 */
	int ANATOMY_CONTAINER_A = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__LOCATIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ducts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__DUCTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__AREAS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subanatomies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__SUBANATOMIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Area Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A__AREA_SYMMETRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_CONTAINER_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.LocationImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Required Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REQUIRED_MODIFIERS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STYLE = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ATTRIBUTES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DOCUMENTATION = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MODIFIED = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MODIFIER = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TRACE_LINK = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__VARIANTS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__OPERATION_MODES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TYPE = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POSITION = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Duct Openings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DUCT_OPENINGS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LENGTH = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.AreaImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__LOCATIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ducts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__DUCTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.DuctImpl <em>Duct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.DuctImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getDuct()
	 * @generated
	 */
	int DUCT = 3;

	/**
	 * The feature id for the '<em><b>Required Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__REQUIRED_MODIFIERS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__ID = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__NAME = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__STYLE = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__ATTRIBUTES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__DOCUMENTATION = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__MODIFIED = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__MODIFIER = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__TRACE_LINK = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__VARIANTS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__OPERATION_MODES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__LENGTH = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__TYPE = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Starting Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__STARTING_POINT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT__END_POINT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Duct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_FEATURE_COUNT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Duct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPERATION_COUNT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.DuctOpeningImpl <em>Duct Opening</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.DuctOpeningImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getDuctOpening()
	 * @generated
	 */
	int DUCT_OPENING = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relativ Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__RELATIV_POSITION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING__DECLARATION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Duct Opening</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Duct Opening</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.Position3DImpl <em>Position3 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.Position3DImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getPosition3D()
	 * @generated
	 */
	int POSITION3_D = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__X = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__Y = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D__Z = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Position3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Position3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION3_D_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.LocationSymmetryImpl <em>Location Symmetry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.LocationSymmetryImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getLocationSymmetry()
	 * @generated
	 */
	int LOCATION_SYMMETRY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY__LOCATIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Location Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Location Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SYMMETRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.AreaSymmetryImpl <em>Area Symmetry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.AreaSymmetryImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getAreaSymmetry()
	 * @generated
	 */
	int AREA_SYMMETRY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY__AREAS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Area Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Area Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SYMMETRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.AnatomyImpl <em>Anatomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getAnatomy()
	 * @generated
	 */
	int ANATOMY = 9;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.anatomy.impl.SubanatomyImpl <em>Subanatomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.anatomy.impl.SubanatomyImpl
	 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getSubanatomy()
	 * @generated
	 */
	int SUBANATOMY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__ID = ANATOMY_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__NAME = ANATOMY_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__STYLE = ANATOMY_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__ATTRIBUTES = ANATOMY_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__DOCUMENTATION = ANATOMY_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__MODIFIED = ANATOMY_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__MODIFIER = ANATOMY_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__TRACE_LINK = ANATOMY_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__LOCATIONS = ANATOMY_CONTAINER_A__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Location Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__LOCATION_SYMMETRIES = ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Ducts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__DUCTS = ANATOMY_CONTAINER_A__DUCTS;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__AREAS = ANATOMY_CONTAINER_A__AREAS;

	/**
	 * The feature id for the '<em><b>Subanatomies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__SUBANATOMIES = ANATOMY_CONTAINER_A__SUBANATOMIES;

	/**
	 * The feature id for the '<em><b>Area Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__AREA_SYMMETRIES = ANATOMY_CONTAINER_A__AREA_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__VARIANTS = ANATOMY_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY__OPERATION_MODES = ANATOMY_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subanatomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY_FEATURE_COUNT = ANATOMY_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subanatomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBANATOMY_OPERATION_COUNT = ANATOMY_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__ID = ANATOMY_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__NAME = ANATOMY_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__STYLE = ANATOMY_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__ATTRIBUTES = ANATOMY_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__DOCUMENTATION = ANATOMY_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__MODIFIED = ANATOMY_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__MODIFIER = ANATOMY_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__TRACE_LINK = ANATOMY_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__LOCATIONS = ANATOMY_CONTAINER_A__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Location Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__LOCATION_SYMMETRIES = ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Ducts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__DUCTS = ANATOMY_CONTAINER_A__DUCTS;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__AREAS = ANATOMY_CONTAINER_A__AREAS;

	/**
	 * The feature id for the '<em><b>Subanatomies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__SUBANATOMIES = ANATOMY_CONTAINER_A__SUBANATOMIES;

	/**
	 * The feature id for the '<em><b>Area Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY__AREA_SYMMETRIES = ANATOMY_CONTAINER_A__AREA_SYMMETRIES;

	/**
	 * The number of structural features of the '<em>Anatomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_FEATURE_COUNT = ANATOMY_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anatomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANATOMY_OPERATION_COUNT = ANATOMY_CONTAINER_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.AnatomyContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.anatomy.AnatomyContainerA
	 * @generated
	 */
	EClass getAnatomyContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see de.oaam.model.oaam.anatomy.AnatomyContainerA#getLocations()
	 * @see #getAnatomyContainerA()
	 * @generated
	 */
	EReference getAnatomyContainerA_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getLocationSymmetries <em>Location Symmetries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Symmetries</em>'.
	 * @see de.oaam.model.oaam.anatomy.AnatomyContainerA#getLocationSymmetries()
	 * @see #getAnatomyContainerA()
	 * @generated
	 */
	EReference getAnatomyContainerA_LocationSymmetries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getDucts <em>Ducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ducts</em>'.
	 * @see de.oaam.model.oaam.anatomy.AnatomyContainerA#getDucts()
	 * @see #getAnatomyContainerA()
	 * @generated
	 */
	EReference getAnatomyContainerA_Ducts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see de.oaam.model.oaam.anatomy.AnatomyContainerA#getAreas()
	 * @see #getAnatomyContainerA()
	 * @generated
	 */
	EReference getAnatomyContainerA_Areas();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getSubanatomies <em>Subanatomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subanatomies</em>'.
	 * @see de.oaam.model.oaam.anatomy.AnatomyContainerA#getSubanatomies()
	 * @see #getAnatomyContainerA()
	 * @generated
	 */
	EReference getAnatomyContainerA_Subanatomies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getAreaSymmetries <em>Area Symmetries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area Symmetries</em>'.
	 * @see de.oaam.model.oaam.anatomy.AnatomyContainerA#getAreaSymmetries()
	 * @see #getAnatomyContainerA()
	 * @generated
	 */
	EReference getAnatomyContainerA_AreaSymmetries();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.oaam.model.oaam.anatomy.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.anatomy.Location#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.anatomy.Location#getType()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.anatomy.Location#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see de.oaam.model.oaam.anatomy.Location#getPosition()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.anatomy.Location#getDuctOpenings <em>Duct Openings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duct Openings</em>'.
	 * @see de.oaam.model.oaam.anatomy.Location#getDuctOpenings()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_DuctOpenings();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.anatomy.Location#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.oaam.model.oaam.anatomy.Location#getLength()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Length();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see de.oaam.model.oaam.anatomy.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.anatomy.Area#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see de.oaam.model.oaam.anatomy.Area#getLocations()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Locations();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.anatomy.Area#getDucts <em>Ducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ducts</em>'.
	 * @see de.oaam.model.oaam.anatomy.Area#getDucts()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Ducts();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.Duct <em>Duct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duct</em>'.
	 * @see de.oaam.model.oaam.anatomy.Duct
	 * @generated
	 */
	EClass getDuct();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.anatomy.Duct#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.oaam.model.oaam.anatomy.Duct#getLength()
	 * @see #getDuct()
	 * @generated
	 */
	EAttribute getDuct_Length();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.anatomy.Duct#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.anatomy.Duct#getType()
	 * @see #getDuct()
	 * @generated
	 */
	EReference getDuct_Type();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.anatomy.Duct#getStartingPoint <em>Starting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting Point</em>'.
	 * @see de.oaam.model.oaam.anatomy.Duct#getStartingPoint()
	 * @see #getDuct()
	 * @generated
	 */
	EReference getDuct_StartingPoint();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.anatomy.Duct#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Point</em>'.
	 * @see de.oaam.model.oaam.anatomy.Duct#getEndPoint()
	 * @see #getDuct()
	 * @generated
	 */
	EReference getDuct_EndPoint();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.DuctOpening <em>Duct Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duct Opening</em>'.
	 * @see de.oaam.model.oaam.anatomy.DuctOpening
	 * @generated
	 */
	EClass getDuctOpening();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.anatomy.DuctOpening#getRelativPosition <em>Relativ Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relativ Position</em>'.
	 * @see de.oaam.model.oaam.anatomy.DuctOpening#getRelativPosition()
	 * @see #getDuctOpening()
	 * @generated
	 */
	EReference getDuctOpening_RelativPosition();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.anatomy.DuctOpening#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see de.oaam.model.oaam.anatomy.DuctOpening#getDeclaration()
	 * @see #getDuctOpening()
	 * @generated
	 */
	EReference getDuctOpening_Declaration();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.Position3D <em>Position3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position3 D</em>'.
	 * @see de.oaam.model.oaam.anatomy.Position3D
	 * @generated
	 */
	EClass getPosition3D();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.anatomy.Position3D#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.oaam.model.oaam.anatomy.Position3D#getX()
	 * @see #getPosition3D()
	 * @generated
	 */
	EAttribute getPosition3D_X();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.anatomy.Position3D#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.oaam.model.oaam.anatomy.Position3D#getY()
	 * @see #getPosition3D()
	 * @generated
	 */
	EAttribute getPosition3D_Y();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.anatomy.Position3D#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see de.oaam.model.oaam.anatomy.Position3D#getZ()
	 * @see #getPosition3D()
	 * @generated
	 */
	EAttribute getPosition3D_Z();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.LocationSymmetry <em>Location Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Symmetry</em>'.
	 * @see de.oaam.model.oaam.anatomy.LocationSymmetry
	 * @generated
	 */
	EClass getLocationSymmetry();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.anatomy.LocationSymmetry#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see de.oaam.model.oaam.anatomy.LocationSymmetry#getLocations()
	 * @see #getLocationSymmetry()
	 * @generated
	 */
	EReference getLocationSymmetry_Locations();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.AreaSymmetry <em>Area Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Symmetry</em>'.
	 * @see de.oaam.model.oaam.anatomy.AreaSymmetry
	 * @generated
	 */
	EClass getAreaSymmetry();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.anatomy.AreaSymmetry#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Areas</em>'.
	 * @see de.oaam.model.oaam.anatomy.AreaSymmetry#getAreas()
	 * @see #getAreaSymmetry()
	 * @generated
	 */
	EReference getAreaSymmetry_Areas();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.Anatomy <em>Anatomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anatomy</em>'.
	 * @see de.oaam.model.oaam.anatomy.Anatomy
	 * @generated
	 */
	EClass getAnatomy();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.anatomy.Subanatomy <em>Subanatomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subanatomy</em>'.
	 * @see de.oaam.model.oaam.anatomy.Subanatomy
	 * @generated
	 */
	EClass getSubanatomy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnatomyFactory getAnatomyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getAnatomyContainerA()
		 * @generated
		 */
		EClass ANATOMY_CONTAINER_A = eINSTANCE.getAnatomyContainerA();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANATOMY_CONTAINER_A__LOCATIONS = eINSTANCE.getAnatomyContainerA_Locations();

		/**
		 * The meta object literal for the '<em><b>Location Symmetries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES = eINSTANCE.getAnatomyContainerA_LocationSymmetries();

		/**
		 * The meta object literal for the '<em><b>Ducts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANATOMY_CONTAINER_A__DUCTS = eINSTANCE.getAnatomyContainerA_Ducts();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANATOMY_CONTAINER_A__AREAS = eINSTANCE.getAnatomyContainerA_Areas();

		/**
		 * The meta object literal for the '<em><b>Subanatomies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANATOMY_CONTAINER_A__SUBANATOMIES = eINSTANCE.getAnatomyContainerA_Subanatomies();

		/**
		 * The meta object literal for the '<em><b>Area Symmetries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANATOMY_CONTAINER_A__AREA_SYMMETRIES = eINSTANCE.getAnatomyContainerA_AreaSymmetries();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.LocationImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__TYPE = eINSTANCE.getLocation_Type();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__POSITION = eINSTANCE.getLocation_Position();

		/**
		 * The meta object literal for the '<em><b>Duct Openings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__DUCT_OPENINGS = eINSTANCE.getLocation_DuctOpenings();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LENGTH = eINSTANCE.getLocation_Length();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.AreaImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__LOCATIONS = eINSTANCE.getArea_Locations();

		/**
		 * The meta object literal for the '<em><b>Ducts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__DUCTS = eINSTANCE.getArea_Ducts();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.DuctImpl <em>Duct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.DuctImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getDuct()
		 * @generated
		 */
		EClass DUCT = eINSTANCE.getDuct();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUCT__LENGTH = eINSTANCE.getDuct_Length();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUCT__TYPE = eINSTANCE.getDuct_Type();

		/**
		 * The meta object literal for the '<em><b>Starting Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUCT__STARTING_POINT = eINSTANCE.getDuct_StartingPoint();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUCT__END_POINT = eINSTANCE.getDuct_EndPoint();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.DuctOpeningImpl <em>Duct Opening</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.DuctOpeningImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getDuctOpening()
		 * @generated
		 */
		EClass DUCT_OPENING = eINSTANCE.getDuctOpening();

		/**
		 * The meta object literal for the '<em><b>Relativ Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUCT_OPENING__RELATIV_POSITION = eINSTANCE.getDuctOpening_RelativPosition();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUCT_OPENING__DECLARATION = eINSTANCE.getDuctOpening_Declaration();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.Position3DImpl <em>Position3 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.Position3DImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getPosition3D()
		 * @generated
		 */
		EClass POSITION3_D = eINSTANCE.getPosition3D();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION3_D__X = eINSTANCE.getPosition3D_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION3_D__Y = eINSTANCE.getPosition3D_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION3_D__Z = eINSTANCE.getPosition3D_Z();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.LocationSymmetryImpl <em>Location Symmetry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.LocationSymmetryImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getLocationSymmetry()
		 * @generated
		 */
		EClass LOCATION_SYMMETRY = eINSTANCE.getLocationSymmetry();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_SYMMETRY__LOCATIONS = eINSTANCE.getLocationSymmetry_Locations();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.AreaSymmetryImpl <em>Area Symmetry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.AreaSymmetryImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getAreaSymmetry()
		 * @generated
		 */
		EClass AREA_SYMMETRY = eINSTANCE.getAreaSymmetry();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_SYMMETRY__AREAS = eINSTANCE.getAreaSymmetry_Areas();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.AnatomyImpl <em>Anatomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getAnatomy()
		 * @generated
		 */
		EClass ANATOMY = eINSTANCE.getAnatomy();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.anatomy.impl.SubanatomyImpl <em>Subanatomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.anatomy.impl.SubanatomyImpl
		 * @see de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl#getSubanatomy()
		 * @generated
		 */
		EClass SUBANATOMY = eINSTANCE.getSubanatomy();

	}

} //AnatomyPackage
