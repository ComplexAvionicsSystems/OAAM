/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.CommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * Common and reusable definitions as data, task, hardware, and signal types.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.library.LibraryFactory
 * @model kind="package"
 * @generated
 */
public interface LibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v140/library";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.library";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryPackage eINSTANCE = de.oaam.model.oaam.library.impl.LibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceConsumerAImpl <em>Resource Consumer A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceConsumerAImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceConsumerA()
	 * @generated
	 */
	int RESOURCE_CONSUMER_A = 0;

	/**
	 * The feature id for the '<em><b>Required Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMER_A__REQUIRED_RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Consumed Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMER_A__CONSUMED_GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Resource Consumer A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMER_A_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Consumer A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMER_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceProviderAImpl <em>Resource Provider A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceProviderAImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceProviderA()
	 * @generated
	 */
	int RESOURCE_PROVIDER_A = 1;

	/**
	 * The feature id for the '<em><b>Provided Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_A__PROVIDED_BUNDLES = 0;

	/**
	 * The feature id for the '<em><b>Possible Resource Provisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS = 1;

	/**
	 * The feature id for the '<em><b>Provided Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_A__PROVIDED_GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Resource Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_A__RESOURCE_LINKS = 3;

	/**
	 * The number of structural features of the '<em>Resource Provider A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_A_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource Provider A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceProviderInstanceAImpl <em>Resource Provider Instance A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceProviderInstanceAImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceProviderInstanceA()
	 * @generated
	 */
	int RESOURCE_PROVIDER_INSTANCE_A = 2;

	/**
	 * The feature id for the '<em><b>Required Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS = 0;

	/**
	 * The number of structural features of the '<em>Resource Provider Instance A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Provider Instance A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_INSTANCE_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.LibraryContainerAImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getLibraryContainerA()
	 * @generated
	 */
	int LIBRARY_CONTAINER_A = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__DATA_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__RESOURCE_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__RESOURCE_BUNDLES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Type Dissimilarities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__TASK_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Task Type Dissimilarity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Signal Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__SIGNAL_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Device Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__DEVICE_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Device Type Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Device Type Dissimilarities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Connection Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__CONNECTION_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Wire Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__WIRE_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Location Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__LOCATION_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Duct Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__DUCT_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Generic Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Power Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__POWER_SOURCES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sublibraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__SUBLIBRARIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Io Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A__IO_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CONTAINER_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceTypeImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Required Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__REQUIRED_RESOURCES = RESOURCE_CONSUMER_A__REQUIRED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Consumed Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CONSUMED_GROUPS = RESOURCE_CONSUMER_A__CONSUMED_GROUPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ID = RESOURCE_CONSUMER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = RESOURCE_CONSUMER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__STYLE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ATTRIBUTES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__DOCUMENTATION = RESOURCE_CONSUMER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__MODIFIED = RESOURCE_CONSUMER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__MODIFIER = RESOURCE_CONSUMER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TRACE_LINK = RESOURCE_CONSUMER_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__UNIT = RESOURCE_CONSUMER_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_CONSUMED = RESOURCE_CONSUMER_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Distinguishable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_DISTINGUISHABLE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Propagated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_PROPAGATED = RESOURCE_CONSUMER_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__DIRECTION = RESOURCE_CONSUMER_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Io</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_IO = RESOURCE_CONSUMER_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_CONFIGURABLE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Propageted Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__PROPAGETED_RESOURCES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Allowed Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ALLOWED_MODIFIERS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ALTERNATIVES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = RESOURCE_CONSUMER_A_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_OPERATION_COUNT = RESOURCE_CONSUMER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MODIFIERS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceAlternativesImpl <em>Resource Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceAlternativesImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceAlternatives()
	 * @generated
	 */
	int RESOURCE_ALTERNATIVES = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES__RESOURCES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Alternatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Alternatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALTERNATIVES_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceBundleImpl <em>Resource Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceBundleImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceBundle()
	 * @generated
	 */
	int RESOURCE_BUNDLE = 7;

	/**
	 * The feature id for the '<em><b>Required Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__REQUIRED_RESOURCES = RESOURCE_CONSUMER_A__REQUIRED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Consumed Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__CONSUMED_GROUPS = RESOURCE_CONSUMER_A__CONSUMED_GROUPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__ID = RESOURCE_CONSUMER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__NAME = RESOURCE_CONSUMER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__STYLE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__ATTRIBUTES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__DOCUMENTATION = RESOURCE_CONSUMER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__MODIFIED = RESOURCE_CONSUMER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__MODIFIER = RESOURCE_CONSUMER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__TRACE_LINK = RESOURCE_CONSUMER_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__RESOURCES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mtbf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__MTBF = RESOURCE_CONSUMER_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__COST = RESOURCE_CONSUMER_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE__MASS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Resource Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE_FEATURE_COUNT = RESOURCE_CONSUMER_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Resource Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUNDLE_OPERATION_COUNT = RESOURCE_CONSUMER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.TaskTypeImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Required Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__REQUIRED_RESOURCES = RESOURCE_CONSUMER_A__REQUIRED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Consumed Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CONSUMED_GROUPS = RESOURCE_CONSUMER_A__CONSUMED_GROUPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ID = RESOURCE_CONSUMER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = RESOURCE_CONSUMER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__STYLE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ATTRIBUTES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__DOCUMENTATION = RESOURCE_CONSUMER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__MODIFIED = RESOURCE_CONSUMER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__MODIFIER = RESOURCE_CONSUMER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TRACE_LINK = RESOURCE_CONSUMER_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__OUTPUT_DECLARATIONS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__INPUT_DECLARATIONS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Deterministic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__IS_DETERMINISTIC = RESOURCE_CONSUMER_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Preferred Execution Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PREFERRED_EXECUTION_RATE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>State Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__STATE_DECLARATIONS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PARAMETER_DECLARATIONS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = RESOURCE_CONSUMER_A_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_OPERATION_COUNT = RESOURCE_CONSUMER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.SignalTypeImpl <em>Signal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.SignalTypeImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getSignalType()
	 * @generated
	 */
	int SIGNAL_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Required Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__REQUIRED_RESOURCES = RESOURCE_CONSUMER_A__REQUIRED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Consumed Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__CONSUMED_GROUPS = RESOURCE_CONSUMER_A__CONSUMED_GROUPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__ID = RESOURCE_CONSUMER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__NAME = RESOURCE_CONSUMER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__STYLE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__ATTRIBUTES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__DOCUMENTATION = RESOURCE_CONSUMER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__MODIFIED = RESOURCE_CONSUMER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__MODIFIER = RESOURCE_CONSUMER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__TRACE_LINK = RESOURCE_CONSUMER_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__TYPE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Signal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE_FEATURE_COUNT = RESOURCE_CONSUMER_A_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Signal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE_OPERATION_COUNT = RESOURCE_CONSUMER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl <em>Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.DeviceTypeImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Required Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__REQUIRED_RESOURCES = RESOURCE_CONSUMER_A__REQUIRED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Consumed Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__CONSUMED_GROUPS = RESOURCE_CONSUMER_A__CONSUMED_GROUPS;

	/**
	 * The feature id for the '<em><b>Provided Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__PROVIDED_BUNDLES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Possible Resource Provisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__POSSIBLE_RESOURCE_PROVISIONS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__PROVIDED_GROUPS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__RESOURCE_LINKS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__ID = RESOURCE_CONSUMER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__NAME = RESOURCE_CONSUMER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__STYLE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__ATTRIBUTES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__DOCUMENTATION = RESOURCE_CONSUMER_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__MODIFIED = RESOURCE_CONSUMER_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__MODIFIER = RESOURCE_CONSUMER_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__TRACE_LINK = RESOURCE_CONSUMER_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Io Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__IO_DECLARATIONS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Subdevice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__IS_SUBDEVICE = RESOURCE_CONSUMER_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Can Have Subdevices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__CAN_HAVE_SUBDEVICES = RESOURCE_CONSUMER_A_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Mtbf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__MTBF = RESOURCE_CONSUMER_A_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__WEIGHT = RESOURCE_CONSUMER_A_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__COST = RESOURCE_CONSUMER_A_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Io Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__IO_GROUPS = RESOURCE_CONSUMER_A_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Is Self Managing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__IS_SELF_MANAGING = RESOURCE_CONSUMER_A_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_FEATURE_COUNT = RESOURCE_CONSUMER_A_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_OPERATION_COUNT = RESOURCE_CONSUMER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ConnectionTypeImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Provided Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__PROVIDED_BUNDLES = RESOURCE_PROVIDER_A__PROVIDED_BUNDLES;

	/**
	 * The feature id for the '<em><b>Possible Resource Provisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__POSSIBLE_RESOURCE_PROVISIONS = RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS;

	/**
	 * The feature id for the '<em><b>Provided Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__PROVIDED_GROUPS = RESOURCE_PROVIDER_A__PROVIDED_GROUPS;

	/**
	 * The feature id for the '<em><b>Resource Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__RESOURCE_LINKS = RESOURCE_PROVIDER_A__RESOURCE_LINKS;

	/**
	 * The feature id for the '<em><b>Required Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__REQUIRED_RESOURCES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumed Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__CONSUMED_GROUPS = RESOURCE_PROVIDER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__ID = RESOURCE_PROVIDER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__NAME = RESOURCE_PROVIDER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__STYLE = RESOURCE_PROVIDER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__ATTRIBUTES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__DOCUMENTATION = RESOURCE_PROVIDER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__MODIFIED = RESOURCE_PROVIDER_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__MODIFIER = RESOURCE_PROVIDER_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__TRACE_LINK = RESOURCE_PROVIDER_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__IS_INFORMATION = RESOURCE_PROVIDER_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__IS_POWER = RESOURCE_PROVIDER_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Wire Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__WIRE_TYPES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Wireless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__IS_WIRELESS = RESOURCE_PROVIDER_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Allows Circles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__ALLOWS_CIRCLES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>NStarting Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__NSTARTING_POINTS = RESOURCE_PROVIDER_A_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Starting Point Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__STARTING_POINT_RESOURCE_TYPES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>NEnd Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__NEND_POINTS = RESOURCE_PROVIDER_A_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>End Point Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__END_POINT_RESOURCE_TYPES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>NJoints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__NJOINTS = RESOURCE_PROVIDER_A_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Max Joint Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__MAX_JOINT_BRANCHES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Max Interface To Joint Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE = RESOURCE_PROVIDER_A_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Switch Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__SWITCH_TYPES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Is Switched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__IS_SWITCHED = RESOURCE_PROVIDER_A_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Direct Connections Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED = RESOURCE_PROVIDER_A_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__MAX_LENGTH = RESOURCE_PROVIDER_A_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Is Unidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__IS_UNIDIRECTIONAL = RESOURCE_PROVIDER_A_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Requires Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__REQUIRES_MASTER = RESOURCE_PROVIDER_A_FEATURE_COUNT + 27;

	/**
	 * The number of structural features of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_FEATURE_COUNT = RESOURCE_PROVIDER_A_FEATURE_COUNT + 28;

	/**
	 * The number of operations of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_OPERATION_COUNT = RESOURCE_PROVIDER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.LocationTypeImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Provided Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__PROVIDED_BUNDLES = RESOURCE_PROVIDER_A__PROVIDED_BUNDLES;

	/**
	 * The feature id for the '<em><b>Possible Resource Provisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__POSSIBLE_RESOURCE_PROVISIONS = RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS;

	/**
	 * The feature id for the '<em><b>Provided Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__PROVIDED_GROUPS = RESOURCE_PROVIDER_A__PROVIDED_GROUPS;

	/**
	 * The feature id for the '<em><b>Resource Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__RESOURCE_LINKS = RESOURCE_PROVIDER_A__RESOURCE_LINKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ID = RESOURCE_PROVIDER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__NAME = RESOURCE_PROVIDER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__STYLE = RESOURCE_PROVIDER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ATTRIBUTES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__DOCUMENTATION = RESOURCE_PROVIDER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__MODIFIED = RESOURCE_PROVIDER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__MODIFIER = RESOURCE_PROVIDER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__TRACE_LINK = RESOURCE_PROVIDER_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Joint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__IS_JOINT = RESOURCE_PROVIDER_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Duct Opening Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__DUCT_OPENING_DECLARATIONS = RESOURCE_PROVIDER_A_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = RESOURCE_PROVIDER_A_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_OPERATION_COUNT = RESOURCE_PROVIDER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.DuctTypeImpl <em>Duct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.DuctTypeImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDuctType()
	 * @generated
	 */
	int DUCT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Provided Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__PROVIDED_BUNDLES = RESOURCE_PROVIDER_A__PROVIDED_BUNDLES;

	/**
	 * The feature id for the '<em><b>Possible Resource Provisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__POSSIBLE_RESOURCE_PROVISIONS = RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS;

	/**
	 * The feature id for the '<em><b>Provided Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__PROVIDED_GROUPS = RESOURCE_PROVIDER_A__PROVIDED_GROUPS;

	/**
	 * The feature id for the '<em><b>Resource Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__RESOURCE_LINKS = RESOURCE_PROVIDER_A__RESOURCE_LINKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__ID = RESOURCE_PROVIDER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__NAME = RESOURCE_PROVIDER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__STYLE = RESOURCE_PROVIDER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__ATTRIBUTES = RESOURCE_PROVIDER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__DOCUMENTATION = RESOURCE_PROVIDER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__MODIFIED = RESOURCE_PROVIDER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__MODIFIER = RESOURCE_PROVIDER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE__TRACE_LINK = RESOURCE_PROVIDER_A_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Duct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE_FEATURE_COUNT = RESOURCE_PROVIDER_A_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Duct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_TYPE_OPERATION_COUNT = RESOURCE_PROVIDER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.WireTypeImpl <em>Wire Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.WireTypeImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getWireType()
	 * @generated
	 */
	int WIRE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Specific Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__SPECIFIC_WEIGHT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__SPECIFIC_PRICE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>NConductors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__NCONDUCTORS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Bending Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__MIN_BENDING_RADIUS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>NShields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__NSHIELDS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mtbf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE__MTBF = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Wire Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Wire Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TYPE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.IoTypeImpl <em>Io Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.IoTypeImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getIoType()
	 * @generated
	 */
	int IO_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE__DIRECTION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Io Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Io Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TYPE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.InputDeclarationImpl <em>Input Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.InputDeclarationImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getInputDeclaration()
	 * @generated
	 */
	int INPUT_DECLARATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__UNIT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__PRECONDITION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__RANGE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__LOWER_BOUND = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION__UPPER_BOUND = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Input Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Input Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl <em>Output Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.OutputDeclarationImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getOutputDeclaration()
	 * @generated
	 */
	int OUTPUT_DECLARATION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__UNIT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__POSTCONDITION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__TRIGGER = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__RANGE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__LOWER_BOUND = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__UPPER_BOUND = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fault Propagations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION__FAULT_PROPAGATIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Output Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Output Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECLARATION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.IoDeclarationImpl <em>Io Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.IoDeclarationImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getIoDeclaration()
	 * @generated
	 */
	int IO_DECLARATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__RESOURCES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Io Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Io Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DECLARATION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.DuctOpeningDeclarationImpl <em>Duct Opening Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.DuctOpeningDeclarationImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDuctOpeningDeclaration()
	 * @generated
	 */
	int DUCT_OPENING_DECLARATION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The number of structural features of the '<em>Duct Opening Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duct Opening Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUCT_OPENING_DECLARATION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceGroupImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceGroup()
	 * @generated
	 */
	int RESOURCE_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__RESOURCES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.DeviceTypeSymmetryImpl <em>Device Type Symmetry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.DeviceTypeSymmetryImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDeviceTypeSymmetry()
	 * @generated
	 */
	int DEVICE_TYPE_SYMMETRY = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY__DEVICE_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Type Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Type Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_SYMMETRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.IoGroupImpl <em>Io Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.IoGroupImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getIoGroup()
	 * @generated
	 */
	int IO_GROUP = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Ios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP__IOS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Io Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Io Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_GROUP_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.AttributeDefinitionImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getAttributeDefinition()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__DATA_TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__TARGET = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.FaultPropagationImpl <em>Fault Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.FaultPropagationImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getFaultPropagation()
	 * @generated
	 */
	int FAULT_PROPAGATION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Output State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__OUTPUT_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__CONDITION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Boolean Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__BOOLEAN_OPERATIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Boolean Nots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__BOOLEAN_NOTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Task Input States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION__TASK_INPUT_STATES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fault Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Fault Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PROPAGATION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.TaskInputStateImpl <em>Task Input State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.TaskInputStateImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskInputState()
	 * @generated
	 */
	int TASK_INPUT_STATE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__ID = CommonPackage.BOOL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__NAME = CommonPackage.BOOL_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__STYLE = CommonPackage.BOOL_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__ATTRIBUTES = CommonPackage.BOOL_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__DOCUMENTATION = CommonPackage.BOOL_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__MODIFIED = CommonPackage.BOOL_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__MODIFIER = CommonPackage.BOOL_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__TRACE_LINK = CommonPackage.BOOL_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__STATE = CommonPackage.BOOL_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE__INPUT = CommonPackage.BOOL_A_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Task Input State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE_FEATURE_COUNT = CommonPackage.BOOL_A_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Task Input State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_STATE_OPERATION_COUNT = CommonPackage.BOOL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.PowerSourceImpl <em>Power Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.PowerSourceImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getPowerSource()
	 * @generated
	 */
	int POWER_SOURCE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The number of structural features of the '<em>Power Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceLinkImpl <em>Resource Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceLinkImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceLink()
	 * @generated
	 */
	int RESOURCE_LINK = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__IN = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__OUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierImpl <em>Resource Type Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceTypeModifierImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceTypeModifier()
	 * @generated
	 */
	int RESOURCE_TYPE_MODIFIER = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER__LEVELS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Type Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Type Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierLevelImpl <em>Resource Type Modifier Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceTypeModifierLevelImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceTypeModifierLevel()
	 * @generated
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Required Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__REQUIRED_RESOURCES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumed Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__CONSUMED_GROUPS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Equal Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__EQUAL_ALTERNATIVES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Better Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL__BETTER_ALTERNATIVE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource Type Modifier Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Resource Type Modifier Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_LEVEL_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierReferenceImpl <em>Resource Type Modifier Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceTypeModifierReferenceImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceTypeModifierReference()
	 * @generated
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allowed Levels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE__ALLOWED_LEVELS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Type Modifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Type Modifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_MODIFIER_REFERENCE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.TaskTypeDissimilarityImpl <em>Task Type Dissimilarity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.TaskTypeDissimilarityImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskTypeDissimilarity()
	 * @generated
	 */
	int TASK_TYPE_DISSIMILARITY = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__TASKS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Percentage Of Common Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_CODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Type Dissimilarity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Type Dissimilarity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_DISSIMILARITY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.DeviceTypeDissimilarityImpl <em>Device Type Dissimilarity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.DeviceTypeDissimilarityImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDeviceTypeDissimilarity()
	 * @generated
	 */
	int DEVICE_TYPE_DISSIMILARITY = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__DEVICES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Percentage Of Common Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_HARDWARE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device Type Dissimilarity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Device Type Dissimilarity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_DISSIMILARITY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeDissimilarityImpl <em>Resource Type Dissimilarity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.ResourceTypeDissimilarityImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceTypeDissimilarity()
	 * @generated
	 */
	int RESOURCE_TYPE_DISSIMILARITY = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY__RESOURCE_TYPES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Type Dissimilarity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Type Dissimilarity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_DISSIMILARITY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.SublibraryImpl <em>Sublibrary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.SublibraryImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getSublibrary()
	 * @generated
	 */
	int SUBLIBRARY = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__ID = LIBRARY_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__NAME = LIBRARY_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__STYLE = LIBRARY_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__ATTRIBUTES = LIBRARY_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__DOCUMENTATION = LIBRARY_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__MODIFIED = LIBRARY_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__MODIFIER = LIBRARY_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__TRACE_LINK = LIBRARY_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__DATA_TYPES = LIBRARY_CONTAINER_A__DATA_TYPES;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__RESOURCE_TYPES = LIBRARY_CONTAINER_A__RESOURCE_TYPES;

	/**
	 * The feature id for the '<em><b>Resource Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__RESOURCE_BUNDLES = LIBRARY_CONTAINER_A__RESOURCE_BUNDLES;

	/**
	 * The feature id for the '<em><b>Resource Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__RESOURCE_MODIFIERS = LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS;

	/**
	 * The feature id for the '<em><b>Resource Type Dissimilarities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__RESOURCE_TYPE_DISSIMILARITIES = LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES;

	/**
	 * The feature id for the '<em><b>Task Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__TASK_TYPES = LIBRARY_CONTAINER_A__TASK_TYPES;

	/**
	 * The feature id for the '<em><b>Task Type Dissimilarity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__TASK_TYPE_DISSIMILARITY = LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY;

	/**
	 * The feature id for the '<em><b>Signal Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__SIGNAL_TYPES = LIBRARY_CONTAINER_A__SIGNAL_TYPES;

	/**
	 * The feature id for the '<em><b>Device Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__DEVICE_TYPES = LIBRARY_CONTAINER_A__DEVICE_TYPES;

	/**
	 * The feature id for the '<em><b>Device Type Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__DEVICE_TYPE_SYMMETRIES = LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Device Type Dissimilarities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__DEVICE_TYPE_DISSIMILARITIES = LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES;

	/**
	 * The feature id for the '<em><b>Connection Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__CONNECTION_TYPES = LIBRARY_CONTAINER_A__CONNECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Wire Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__WIRE_TYPES = LIBRARY_CONTAINER_A__WIRE_TYPES;

	/**
	 * The feature id for the '<em><b>Location Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__LOCATION_TYPES = LIBRARY_CONTAINER_A__LOCATION_TYPES;

	/**
	 * The feature id for the '<em><b>Duct Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__DUCT_TYPES = LIBRARY_CONTAINER_A__DUCT_TYPES;

	/**
	 * The feature id for the '<em><b>Generic Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__GENERIC_ATTRIBUTES = LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Power Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__POWER_SOURCES = LIBRARY_CONTAINER_A__POWER_SOURCES;

	/**
	 * The feature id for the '<em><b>Sublibraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__SUBLIBRARIES = LIBRARY_CONTAINER_A__SUBLIBRARIES;

	/**
	 * The feature id for the '<em><b>Io Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY__IO_TYPES = LIBRARY_CONTAINER_A__IO_TYPES;

	/**
	 * The number of structural features of the '<em>Sublibrary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY_FEATURE_COUNT = LIBRARY_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sublibrary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIBRARY_OPERATION_COUNT = LIBRARY_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl <em>Task Output Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskOutputTrigger()
	 * @generated
	 */
	int TASK_OUTPUT_TRIGGER = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__FIXED_RATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__IS_FIXED_RATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__CONDITION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Boolean Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__BOOLEAN_OPERATIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Boolean Nots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__BOOLEAN_NOTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task Input Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER__TASK_INPUT_TRIGGERS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Task Output Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Task Output Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_TRIGGER_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.TaskInputTriggerImpl <em>Task Input Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.TaskInputTriggerImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskInputTrigger()
	 * @generated
	 */
	int TASK_INPUT_TRIGGER = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER__ID = CommonPackage.BOOL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER__NAME = CommonPackage.BOOL_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER__STYLE = CommonPackage.BOOL_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER__ATTRIBUTES = CommonPackage.BOOL_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER__DOCUMENTATION = CommonPackage.BOOL_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER__MODIFIED = CommonPackage.BOOL_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER__MODIFIER = CommonPackage.BOOL_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER__TRACE_LINK = CommonPackage.BOOL_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER__INPUT = CommonPackage.BOOL_A_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Task Input Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER_FEATURE_COUNT = CommonPackage.BOOL_A_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Task Input Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_TRIGGER_OPERATION_COUNT = CommonPackage.BOOL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.TaskStateDeclarationImpl <em>Task State Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.TaskStateDeclarationImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskStateDeclaration()
	 * @generated
	 */
	int TASK_STATE_DECLARATION = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task State Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task State Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_DECLARATION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.TaskParameterDeclarationImpl <em>Task Parameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.TaskParameterDeclarationImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskParameterDeclaration()
	 * @generated
	 */
	int TASK_PARAMETER_DECLARATION = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_DECLARATION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.impl.LibraryImpl
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ID = LIBRARY_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = LIBRARY_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__STYLE = LIBRARY_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ATTRIBUTES = LIBRARY_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DOCUMENTATION = LIBRARY_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MODIFIED = LIBRARY_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MODIFIER = LIBRARY_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TRACE_LINK = LIBRARY_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DATA_TYPES = LIBRARY_CONTAINER_A__DATA_TYPES;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__RESOURCE_TYPES = LIBRARY_CONTAINER_A__RESOURCE_TYPES;

	/**
	 * The feature id for the '<em><b>Resource Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__RESOURCE_BUNDLES = LIBRARY_CONTAINER_A__RESOURCE_BUNDLES;

	/**
	 * The feature id for the '<em><b>Resource Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__RESOURCE_MODIFIERS = LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS;

	/**
	 * The feature id for the '<em><b>Resource Type Dissimilarities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__RESOURCE_TYPE_DISSIMILARITIES = LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES;

	/**
	 * The feature id for the '<em><b>Task Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TASK_TYPES = LIBRARY_CONTAINER_A__TASK_TYPES;

	/**
	 * The feature id for the '<em><b>Task Type Dissimilarity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TASK_TYPE_DISSIMILARITY = LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY;

	/**
	 * The feature id for the '<em><b>Signal Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SIGNAL_TYPES = LIBRARY_CONTAINER_A__SIGNAL_TYPES;

	/**
	 * The feature id for the '<em><b>Device Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DEVICE_TYPES = LIBRARY_CONTAINER_A__DEVICE_TYPES;

	/**
	 * The feature id for the '<em><b>Device Type Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DEVICE_TYPE_SYMMETRIES = LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Device Type Dissimilarities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DEVICE_TYPE_DISSIMILARITIES = LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES;

	/**
	 * The feature id for the '<em><b>Connection Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONNECTION_TYPES = LIBRARY_CONTAINER_A__CONNECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Wire Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__WIRE_TYPES = LIBRARY_CONTAINER_A__WIRE_TYPES;

	/**
	 * The feature id for the '<em><b>Location Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LOCATION_TYPES = LIBRARY_CONTAINER_A__LOCATION_TYPES;

	/**
	 * The feature id for the '<em><b>Duct Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DUCT_TYPES = LIBRARY_CONTAINER_A__DUCT_TYPES;

	/**
	 * The feature id for the '<em><b>Generic Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__GENERIC_ATTRIBUTES = LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Power Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__POWER_SOURCES = LIBRARY_CONTAINER_A__POWER_SOURCES;

	/**
	 * The feature id for the '<em><b>Sublibraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SUBLIBRARIES = LIBRARY_CONTAINER_A__SUBLIBRARIES;

	/**
	 * The feature id for the '<em><b>Io Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__IO_TYPES = LIBRARY_CONTAINER_A__IO_TYPES;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = LIBRARY_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = LIBRARY_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.IoDirectionE <em>Io Direction E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.IoDirectionE
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getIoDirectionE()
	 * @generated
	 */
	int IO_DIRECTION_E = 40;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.AttributeTypesE <em>Attribute Types E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.AttributeTypesE
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getAttributeTypesE()
	 * @generated
	 */
	int ATTRIBUTE_TYPES_E = 41;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.library.AttributeTargetsE <em>Attribute Targets E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.library.AttributeTargetsE
	 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getAttributeTargetsE()
	 * @generated
	 */
	int ATTRIBUTE_TARGETS_E = 42;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceConsumerA <em>Resource Consumer A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Consumer A</em>'.
	 * @see de.oaam.model.oaam.library.ResourceConsumerA
	 * @generated
	 */
	EClass getResourceConsumerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceConsumerA#getRequiredResources <em>Required Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Resources</em>'.
	 * @see de.oaam.model.oaam.library.ResourceConsumerA#getRequiredResources()
	 * @see #getResourceConsumerA()
	 * @generated
	 */
	EReference getResourceConsumerA_RequiredResources();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceConsumerA#getConsumedGroups <em>Consumed Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consumed Groups</em>'.
	 * @see de.oaam.model.oaam.library.ResourceConsumerA#getConsumedGroups()
	 * @see #getResourceConsumerA()
	 * @generated
	 */
	EReference getResourceConsumerA_ConsumedGroups();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceProviderA <em>Resource Provider A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Provider A</em>'.
	 * @see de.oaam.model.oaam.library.ResourceProviderA
	 * @generated
	 */
	EClass getResourceProviderA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceProviderA#getProvidedBundles <em>Provided Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Bundles</em>'.
	 * @see de.oaam.model.oaam.library.ResourceProviderA#getProvidedBundles()
	 * @see #getResourceProviderA()
	 * @generated
	 */
	EReference getResourceProviderA_ProvidedBundles();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ResourceProviderA#getPossibleResourceProvisions <em>Possible Resource Provisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Resource Provisions</em>'.
	 * @see de.oaam.model.oaam.library.ResourceProviderA#getPossibleResourceProvisions()
	 * @see #getResourceProviderA()
	 * @generated
	 */
	EReference getResourceProviderA_PossibleResourceProvisions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceProviderA#getProvidedGroups <em>Provided Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Groups</em>'.
	 * @see de.oaam.model.oaam.library.ResourceProviderA#getProvidedGroups()
	 * @see #getResourceProviderA()
	 * @generated
	 */
	EReference getResourceProviderA_ProvidedGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceProviderA#getResourceLinks <em>Resource Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Links</em>'.
	 * @see de.oaam.model.oaam.library.ResourceProviderA#getResourceLinks()
	 * @see #getResourceProviderA()
	 * @generated
	 */
	EReference getResourceProviderA_ResourceLinks();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceProviderInstanceA <em>Resource Provider Instance A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Provider Instance A</em>'.
	 * @see de.oaam.model.oaam.library.ResourceProviderInstanceA
	 * @generated
	 */
	EClass getResourceProviderInstanceA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ResourceProviderInstanceA#getRequiredModifiers <em>Required Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Modifiers</em>'.
	 * @see de.oaam.model.oaam.library.ResourceProviderInstanceA#getRequiredModifiers()
	 * @see #getResourceProviderInstanceA()
	 * @generated
	 */
	EReference getResourceProviderInstanceA_RequiredModifiers();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.LibraryContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA
	 * @generated
	 */
	EClass getLibraryContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getDataTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getResourceTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_ResourceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getResourceBundles <em>Resource Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Bundles</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getResourceBundles()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_ResourceBundles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getResourceModifiers <em>Resource Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Modifiers</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getResourceModifiers()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_ResourceModifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getResourceTypeDissimilarities <em>Resource Type Dissimilarities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Type Dissimilarities</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getResourceTypeDissimilarities()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_ResourceTypeDissimilarities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getTaskTypes <em>Task Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getTaskTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_TaskTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getTaskTypeDissimilarity <em>Task Type Dissimilarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Type Dissimilarity</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getTaskTypeDissimilarity()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_TaskTypeDissimilarity();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getSignalTypes <em>Signal Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getSignalTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_SignalTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getDeviceTypes <em>Device Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getDeviceTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_DeviceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getDeviceTypeSymmetries <em>Device Type Symmetries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Type Symmetries</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getDeviceTypeSymmetries()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_DeviceTypeSymmetries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getDeviceTypeDissimilarities <em>Device Type Dissimilarities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Type Dissimilarities</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getDeviceTypeDissimilarities()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_DeviceTypeDissimilarities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getConnectionTypes <em>Connection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getConnectionTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_ConnectionTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getWireTypes <em>Wire Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wire Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getWireTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_WireTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getLocationTypes <em>Location Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getLocationTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_LocationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getDuctTypes <em>Duct Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duct Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getDuctTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_DuctTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getGenericAttributes <em>Generic Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Attributes</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getGenericAttributes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_GenericAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getPowerSources <em>Power Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Sources</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getPowerSources()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_PowerSources();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getSublibraries <em>Sublibraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sublibraries</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getSublibraries()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_Sublibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LibraryContainerA#getIoTypes <em>Io Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Types</em>'.
	 * @see de.oaam.model.oaam.library.LibraryContainerA#getIoTypes()
	 * @see #getLibraryContainerA()
	 * @generated
	 */
	EReference getLibraryContainerA_IoTypes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#getUnit()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceType#isIsConsumed <em>Is Consumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Consumed</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#isIsConsumed()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsConsumed();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceType#isIsDistinguishable <em>Is Distinguishable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Distinguishable</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#isIsDistinguishable()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsDistinguishable();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceType#isIsPropagated <em>Is Propagated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Propagated</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#isIsPropagated()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsPropagated();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#getDirection()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceType#isIsIo <em>Is Io</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Io</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#isIsIo()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsIo();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceType#isIsConfigurable <em>Is Configurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Configurable</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#isIsConfigurable()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsConfigurable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceType#getPropagetedResources <em>Propageted Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propageted Resources</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#getPropagetedResources()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_PropagetedResources();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ResourceType#getAllowedModifiers <em>Allowed Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Modifiers</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#getAllowedModifiers()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_AllowedModifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceType#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see de.oaam.model.oaam.library.ResourceType#getAlternatives()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Alternatives();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see de.oaam.model.oaam.library.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.library.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.Resource#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.oaam.model.oaam.library.Resource#getCount()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Count();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.Resource#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modifiers</em>'.
	 * @see de.oaam.model.oaam.library.Resource#getModifiers()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Modifiers();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceAlternatives <em>Resource Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Alternatives</em>'.
	 * @see de.oaam.model.oaam.library.ResourceAlternatives
	 * @generated
	 */
	EClass getResourceAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceAlternatives#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see de.oaam.model.oaam.library.ResourceAlternatives#getResources()
	 * @see #getResourceAlternatives()
	 * @generated
	 */
	EReference getResourceAlternatives_Resources();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceBundle <em>Resource Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Bundle</em>'.
	 * @see de.oaam.model.oaam.library.ResourceBundle
	 * @generated
	 */
	EClass getResourceBundle();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceBundle#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see de.oaam.model.oaam.library.ResourceBundle#getResources()
	 * @see #getResourceBundle()
	 * @generated
	 */
	EReference getResourceBundle_Resources();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceBundle#getMtbf <em>Mtbf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mtbf</em>'.
	 * @see de.oaam.model.oaam.library.ResourceBundle#getMtbf()
	 * @see #getResourceBundle()
	 * @generated
	 */
	EAttribute getResourceBundle_Mtbf();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceBundle#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see de.oaam.model.oaam.library.ResourceBundle#getCost()
	 * @see #getResourceBundle()
	 * @generated
	 */
	EAttribute getResourceBundle_Cost();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ResourceBundle#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see de.oaam.model.oaam.library.ResourceBundle#getMass()
	 * @see #getResourceBundle()
	 * @generated
	 */
	EAttribute getResourceBundle_Mass();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see de.oaam.model.oaam.library.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.TaskType#getOutputDeclarations <em>Output Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Declarations</em>'.
	 * @see de.oaam.model.oaam.library.TaskType#getOutputDeclarations()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_OutputDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.TaskType#getInputDeclarations <em>Input Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Declarations</em>'.
	 * @see de.oaam.model.oaam.library.TaskType#getInputDeclarations()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_InputDeclarations();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.TaskType#isIsDeterministic <em>Is Deterministic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deterministic</em>'.
	 * @see de.oaam.model.oaam.library.TaskType#isIsDeterministic()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_IsDeterministic();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.TaskType#getPreferredExecutionRate <em>Preferred Execution Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Execution Rate</em>'.
	 * @see de.oaam.model.oaam.library.TaskType#getPreferredExecutionRate()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_PreferredExecutionRate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.TaskType#getStateDeclarations <em>State Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Declarations</em>'.
	 * @see de.oaam.model.oaam.library.TaskType#getStateDeclarations()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_StateDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.TaskType#getParameterDeclarations <em>Parameter Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Declarations</em>'.
	 * @see de.oaam.model.oaam.library.TaskType#getParameterDeclarations()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_ParameterDeclarations();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Type</em>'.
	 * @see de.oaam.model.oaam.library.SignalType
	 * @generated
	 */
	EClass getSignalType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.SignalType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.library.SignalType#getType()
	 * @see #getSignalType()
	 * @generated
	 */
	EReference getSignalType_Type();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type</em>'.
	 * @see de.oaam.model.oaam.library.DeviceType
	 * @generated
	 */
	EClass getDeviceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.DeviceType#getIoDeclarations <em>Io Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Declarations</em>'.
	 * @see de.oaam.model.oaam.library.DeviceType#getIoDeclarations()
	 * @see #getDeviceType()
	 * @generated
	 */
	EReference getDeviceType_IoDeclarations();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.DeviceType#isIsSubdevice <em>Is Subdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Subdevice</em>'.
	 * @see de.oaam.model.oaam.library.DeviceType#isIsSubdevice()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_IsSubdevice();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.DeviceType#isCanHaveSubdevices <em>Can Have Subdevices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Have Subdevices</em>'.
	 * @see de.oaam.model.oaam.library.DeviceType#isCanHaveSubdevices()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_CanHaveSubdevices();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.DeviceType#getMtbf <em>Mtbf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mtbf</em>'.
	 * @see de.oaam.model.oaam.library.DeviceType#getMtbf()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_Mtbf();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.DeviceType#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.oaam.model.oaam.library.DeviceType#getWeight()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_Weight();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.DeviceType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see de.oaam.model.oaam.library.DeviceType#getCost()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_Cost();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.DeviceType#getIoGroups <em>Io Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Groups</em>'.
	 * @see de.oaam.model.oaam.library.DeviceType#getIoGroups()
	 * @see #getDeviceType()
	 * @generated
	 */
	EReference getDeviceType_IoGroups();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.DeviceType#isIsSelfManaging <em>Is Self Managing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Self Managing</em>'.
	 * @see de.oaam.model.oaam.library.DeviceType#isIsSelfManaging()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_IsSelfManaging();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Type</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType
	 * @generated
	 */
	EClass getConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#isIsInformation <em>Is Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Information</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#isIsInformation()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_IsInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#isIsPower <em>Is Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Power</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#isIsPower()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_IsPower();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ConnectionType#getWireTypes <em>Wire Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wire Types</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getWireTypes()
	 * @see #getConnectionType()
	 * @generated
	 */
	EReference getConnectionType_WireTypes();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#isIsWireless <em>Is Wireless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Wireless</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#isIsWireless()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_IsWireless();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#isAllowsCircles <em>Allows Circles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Circles</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#isAllowsCircles()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_AllowsCircles();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#getNStartingPoints <em>NStarting Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NStarting Points</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getNStartingPoints()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_NStartingPoints();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ConnectionType#getStartingPointResourceTypes <em>Starting Point Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Starting Point Resource Types</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getStartingPointResourceTypes()
	 * @see #getConnectionType()
	 * @generated
	 */
	EReference getConnectionType_StartingPointResourceTypes();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#getNEndPoints <em>NEnd Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NEnd Points</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getNEndPoints()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_NEndPoints();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ConnectionType#getEndPointResourceTypes <em>End Point Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Point Resource Types</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getEndPointResourceTypes()
	 * @see #getConnectionType()
	 * @generated
	 */
	EReference getConnectionType_EndPointResourceTypes();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#getNJoints <em>NJoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NJoints</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getNJoints()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_NJoints();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#getMaxJointBranches <em>Max Joint Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Joint Branches</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getMaxJointBranches()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_MaxJointBranches();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#getMaxInterfaceToJointDistance <em>Max Interface To Joint Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interface To Joint Distance</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getMaxInterfaceToJointDistance()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_MaxInterfaceToJointDistance();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ConnectionType#getSwitchTypes <em>Switch Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Types</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getSwitchTypes()
	 * @see #getConnectionType()
	 * @generated
	 */
	EReference getConnectionType_SwitchTypes();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#isIsSwitched <em>Is Switched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Switched</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#isIsSwitched()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_IsSwitched();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#isDirectConnectionsAllowed <em>Direct Connections Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct Connections Allowed</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#isDirectConnectionsAllowed()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_DirectConnectionsAllowed();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#getMaxLength()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#isIsUnidirectional <em>Is Unidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unidirectional</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#isIsUnidirectional()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_IsUnidirectional();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.ConnectionType#isRequiresMaster <em>Requires Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Master</em>'.
	 * @see de.oaam.model.oaam.library.ConnectionType#isRequiresMaster()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_RequiresMaster();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see de.oaam.model.oaam.library.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.LocationType#isIsJoint <em>Is Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Joint</em>'.
	 * @see de.oaam.model.oaam.library.LocationType#isIsJoint()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_IsJoint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.LocationType#getDuctOpeningDeclarations <em>Duct Opening Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duct Opening Declarations</em>'.
	 * @see de.oaam.model.oaam.library.LocationType#getDuctOpeningDeclarations()
	 * @see #getLocationType()
	 * @generated
	 */
	EReference getLocationType_DuctOpeningDeclarations();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.DuctType <em>Duct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duct Type</em>'.
	 * @see de.oaam.model.oaam.library.DuctType
	 * @generated
	 */
	EClass getDuctType();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.WireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Type</em>'.
	 * @see de.oaam.model.oaam.library.WireType
	 * @generated
	 */
	EClass getWireType();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.WireType#getSpecificWeight <em>Specific Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Weight</em>'.
	 * @see de.oaam.model.oaam.library.WireType#getSpecificWeight()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_SpecificWeight();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.WireType#getSpecificPrice <em>Specific Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Price</em>'.
	 * @see de.oaam.model.oaam.library.WireType#getSpecificPrice()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_SpecificPrice();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.WireType#getNConductors <em>NConductors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NConductors</em>'.
	 * @see de.oaam.model.oaam.library.WireType#getNConductors()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_NConductors();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.WireType#getMinBendingRadius <em>Min Bending Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Bending Radius</em>'.
	 * @see de.oaam.model.oaam.library.WireType#getMinBendingRadius()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_MinBendingRadius();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.WireType#getNShields <em>NShields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NShields</em>'.
	 * @see de.oaam.model.oaam.library.WireType#getNShields()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_NShields();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.WireType#getMtbf <em>Mtbf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mtbf</em>'.
	 * @see de.oaam.model.oaam.library.WireType#getMtbf()
	 * @see #getWireType()
	 * @generated
	 */
	EAttribute getWireType_Mtbf();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.IoType <em>Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io Type</em>'.
	 * @see de.oaam.model.oaam.library.IoType
	 * @generated
	 */
	EClass getIoType();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.IoType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.oaam.model.oaam.library.IoType#getDirection()
	 * @see #getIoType()
	 * @generated
	 */
	EAttribute getIoType_Direction();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.InputDeclaration <em>Input Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Declaration</em>'.
	 * @see de.oaam.model.oaam.library.InputDeclaration
	 * @generated
	 */
	EClass getInputDeclaration();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.InputDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.library.InputDeclaration#getType()
	 * @see #getInputDeclaration()
	 * @generated
	 */
	EReference getInputDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.InputDeclaration#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.oaam.model.oaam.library.InputDeclaration#getUnit()
	 * @see #getInputDeclaration()
	 * @generated
	 */
	EAttribute getInputDeclaration_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.InputDeclaration#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see de.oaam.model.oaam.library.InputDeclaration#getPrecondition()
	 * @see #getInputDeclaration()
	 * @generated
	 */
	EAttribute getInputDeclaration_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.InputDeclaration#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see de.oaam.model.oaam.library.InputDeclaration#getRange()
	 * @see #getInputDeclaration()
	 * @generated
	 */
	EAttribute getInputDeclaration_Range();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.InputDeclaration#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.oaam.model.oaam.library.InputDeclaration#getLowerBound()
	 * @see #getInputDeclaration()
	 * @generated
	 */
	EAttribute getInputDeclaration_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.InputDeclaration#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.oaam.model.oaam.library.InputDeclaration#getUpperBound()
	 * @see #getInputDeclaration()
	 * @generated
	 */
	EAttribute getInputDeclaration_UpperBound();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.OutputDeclaration <em>Output Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Declaration</em>'.
	 * @see de.oaam.model.oaam.library.OutputDeclaration
	 * @generated
	 */
	EClass getOutputDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.OutputDeclaration#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.oaam.model.oaam.library.OutputDeclaration#getUnit()
	 * @see #getOutputDeclaration()
	 * @generated
	 */
	EAttribute getOutputDeclaration_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.OutputDeclaration#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcondition</em>'.
	 * @see de.oaam.model.oaam.library.OutputDeclaration#getPostcondition()
	 * @see #getOutputDeclaration()
	 * @generated
	 */
	EAttribute getOutputDeclaration_Postcondition();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.library.OutputDeclaration#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see de.oaam.model.oaam.library.OutputDeclaration#getTrigger()
	 * @see #getOutputDeclaration()
	 * @generated
	 */
	EReference getOutputDeclaration_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.OutputDeclaration#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see de.oaam.model.oaam.library.OutputDeclaration#getRange()
	 * @see #getOutputDeclaration()
	 * @generated
	 */
	EAttribute getOutputDeclaration_Range();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.OutputDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.library.OutputDeclaration#getType()
	 * @see #getOutputDeclaration()
	 * @generated
	 */
	EReference getOutputDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.OutputDeclaration#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.oaam.model.oaam.library.OutputDeclaration#getLowerBound()
	 * @see #getOutputDeclaration()
	 * @generated
	 */
	EAttribute getOutputDeclaration_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.OutputDeclaration#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.oaam.model.oaam.library.OutputDeclaration#getUpperBound()
	 * @see #getOutputDeclaration()
	 * @generated
	 */
	EAttribute getOutputDeclaration_UpperBound();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.OutputDeclaration#getFaultPropagations <em>Fault Propagations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault Propagations</em>'.
	 * @see de.oaam.model.oaam.library.OutputDeclaration#getFaultPropagations()
	 * @see #getOutputDeclaration()
	 * @generated
	 */
	EReference getOutputDeclaration_FaultPropagations();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.IoDeclaration <em>Io Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io Declaration</em>'.
	 * @see de.oaam.model.oaam.library.IoDeclaration
	 * @generated
	 */
	EClass getIoDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.IoDeclaration#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see de.oaam.model.oaam.library.IoDeclaration#getResources()
	 * @see #getIoDeclaration()
	 * @generated
	 */
	EReference getIoDeclaration_Resources();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.IoDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.library.IoDeclaration#getType()
	 * @see #getIoDeclaration()
	 * @generated
	 */
	EReference getIoDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.DuctOpeningDeclaration <em>Duct Opening Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duct Opening Declaration</em>'.
	 * @see de.oaam.model.oaam.library.DuctOpeningDeclaration
	 * @generated
	 */
	EClass getDuctOpeningDeclaration();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Group</em>'.
	 * @see de.oaam.model.oaam.library.ResourceGroup
	 * @generated
	 */
	EClass getResourceGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ResourceGroup#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see de.oaam.model.oaam.library.ResourceGroup#getResources()
	 * @see #getResourceGroup()
	 * @generated
	 */
	EReference getResourceGroup_Resources();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.DeviceTypeSymmetry <em>Device Type Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type Symmetry</em>'.
	 * @see de.oaam.model.oaam.library.DeviceTypeSymmetry
	 * @generated
	 */
	EClass getDeviceTypeSymmetry();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.DeviceTypeSymmetry#getDeviceTypes <em>Device Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Device Types</em>'.
	 * @see de.oaam.model.oaam.library.DeviceTypeSymmetry#getDeviceTypes()
	 * @see #getDeviceTypeSymmetry()
	 * @generated
	 */
	EReference getDeviceTypeSymmetry_DeviceTypes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.IoGroup <em>Io Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io Group</em>'.
	 * @see de.oaam.model.oaam.library.IoGroup
	 * @generated
	 */
	EClass getIoGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.IoGroup#getIos <em>Ios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ios</em>'.
	 * @see de.oaam.model.oaam.library.IoGroup#getIos()
	 * @see #getIoGroup()
	 * @generated
	 */
	EReference getIoGroup_Ios();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition</em>'.
	 * @see de.oaam.model.oaam.library.AttributeDefinition
	 * @generated
	 */
	EClass getAttributeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.AttributeDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see de.oaam.model.oaam.library.AttributeDefinition#getDataType()
	 * @see #getAttributeDefinition()
	 * @generated
	 */
	EAttribute getAttributeDefinition_DataType();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.AttributeDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see de.oaam.model.oaam.library.AttributeDefinition#getTarget()
	 * @see #getAttributeDefinition()
	 * @generated
	 */
	EAttribute getAttributeDefinition_Target();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.FaultPropagation <em>Fault Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Propagation</em>'.
	 * @see de.oaam.model.oaam.library.FaultPropagation
	 * @generated
	 */
	EClass getFaultPropagation();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.FaultPropagation#getOutputState <em>Output State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output State</em>'.
	 * @see de.oaam.model.oaam.library.FaultPropagation#getOutputState()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EAttribute getFaultPropagation_OutputState();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.FaultPropagation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see de.oaam.model.oaam.library.FaultPropagation#getCondition()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EReference getFaultPropagation_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.FaultPropagation#getBooleanOperations <em>Boolean Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Operations</em>'.
	 * @see de.oaam.model.oaam.library.FaultPropagation#getBooleanOperations()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EReference getFaultPropagation_BooleanOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.FaultPropagation#getBooleanNots <em>Boolean Nots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Nots</em>'.
	 * @see de.oaam.model.oaam.library.FaultPropagation#getBooleanNots()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EReference getFaultPropagation_BooleanNots();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.FaultPropagation#getTaskInputStates <em>Task Input States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Input States</em>'.
	 * @see de.oaam.model.oaam.library.FaultPropagation#getTaskInputStates()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EReference getFaultPropagation_TaskInputStates();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.TaskInputState <em>Task Input State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Input State</em>'.
	 * @see de.oaam.model.oaam.library.TaskInputState
	 * @generated
	 */
	EClass getTaskInputState();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.TaskInputState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.oaam.model.oaam.library.TaskInputState#getState()
	 * @see #getTaskInputState()
	 * @generated
	 */
	EAttribute getTaskInputState_State();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.TaskInputState#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.library.TaskInputState#getInput()
	 * @see #getTaskInputState()
	 * @generated
	 */
	EReference getTaskInputState_Input();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.PowerSource <em>Power Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Source</em>'.
	 * @see de.oaam.model.oaam.library.PowerSource
	 * @generated
	 */
	EClass getPowerSource();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceLink <em>Resource Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Link</em>'.
	 * @see de.oaam.model.oaam.library.ResourceLink
	 * @generated
	 */
	EClass getResourceLink();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ResourceLink#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see de.oaam.model.oaam.library.ResourceLink#getIn()
	 * @see #getResourceLink()
	 * @generated
	 */
	EReference getResourceLink_In();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ResourceLink#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see de.oaam.model.oaam.library.ResourceLink#getOut()
	 * @see #getResourceLink()
	 * @generated
	 */
	EReference getResourceLink_Out();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceTypeModifier <em>Resource Type Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type Modifier</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeModifier
	 * @generated
	 */
	EClass getResourceTypeModifier();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.ResourceTypeModifier#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeModifier#getLevels()
	 * @see #getResourceTypeModifier()
	 * @generated
	 */
	EReference getResourceTypeModifier_Levels();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceTypeModifierLevel <em>Resource Type Modifier Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type Modifier Level</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeModifierLevel
	 * @generated
	 */
	EClass getResourceTypeModifierLevel();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ResourceTypeModifierLevel#getEqualAlternatives <em>Equal Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equal Alternatives</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeModifierLevel#getEqualAlternatives()
	 * @see #getResourceTypeModifierLevel()
	 * @generated
	 */
	EReference getResourceTypeModifierLevel_EqualAlternatives();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.ResourceTypeModifierLevel#getBetterAlternative <em>Better Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Better Alternative</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeModifierLevel#getBetterAlternative()
	 * @see #getResourceTypeModifierLevel()
	 * @generated
	 */
	EReference getResourceTypeModifierLevel_BetterAlternative();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceTypeModifierReference <em>Resource Type Modifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type Modifier Reference</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeModifierReference
	 * @generated
	 */
	EClass getResourceTypeModifierReference();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.ResourceTypeModifierReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeModifierReference#getType()
	 * @see #getResourceTypeModifierReference()
	 * @generated
	 */
	EReference getResourceTypeModifierReference_Type();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ResourceTypeModifierReference#getAllowedLevels <em>Allowed Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Levels</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeModifierReference#getAllowedLevels()
	 * @see #getResourceTypeModifierReference()
	 * @generated
	 */
	EReference getResourceTypeModifierReference_AllowedLevels();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.TaskTypeDissimilarity <em>Task Type Dissimilarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type Dissimilarity</em>'.
	 * @see de.oaam.model.oaam.library.TaskTypeDissimilarity
	 * @generated
	 */
	EClass getTaskTypeDissimilarity();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.TaskTypeDissimilarity#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.library.TaskTypeDissimilarity#getTasks()
	 * @see #getTaskTypeDissimilarity()
	 * @generated
	 */
	EReference getTaskTypeDissimilarity_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.TaskTypeDissimilarity#getPercentageOfCommonCode <em>Percentage Of Common Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Common Code</em>'.
	 * @see de.oaam.model.oaam.library.TaskTypeDissimilarity#getPercentageOfCommonCode()
	 * @see #getTaskTypeDissimilarity()
	 * @generated
	 */
	EAttribute getTaskTypeDissimilarity_PercentageOfCommonCode();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.DeviceTypeDissimilarity <em>Device Type Dissimilarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type Dissimilarity</em>'.
	 * @see de.oaam.model.oaam.library.DeviceTypeDissimilarity
	 * @generated
	 */
	EClass getDeviceTypeDissimilarity();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.DeviceTypeDissimilarity#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see de.oaam.model.oaam.library.DeviceTypeDissimilarity#getDevices()
	 * @see #getDeviceTypeDissimilarity()
	 * @generated
	 */
	EReference getDeviceTypeDissimilarity_Devices();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.DeviceTypeDissimilarity#getPercentageOfCommonHardware <em>Percentage Of Common Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Common Hardware</em>'.
	 * @see de.oaam.model.oaam.library.DeviceTypeDissimilarity#getPercentageOfCommonHardware()
	 * @see #getDeviceTypeDissimilarity()
	 * @generated
	 */
	EAttribute getDeviceTypeDissimilarity_PercentageOfCommonHardware();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.ResourceTypeDissimilarity <em>Resource Type Dissimilarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type Dissimilarity</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeDissimilarity
	 * @generated
	 */
	EClass getResourceTypeDissimilarity();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.library.ResourceTypeDissimilarity#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Types</em>'.
	 * @see de.oaam.model.oaam.library.ResourceTypeDissimilarity#getResourceTypes()
	 * @see #getResourceTypeDissimilarity()
	 * @generated
	 */
	EReference getResourceTypeDissimilarity_ResourceTypes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.Sublibrary <em>Sublibrary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sublibrary</em>'.
	 * @see de.oaam.model.oaam.library.Sublibrary
	 * @generated
	 */
	EClass getSublibrary();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.TaskOutputTrigger <em>Task Output Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Output Trigger</em>'.
	 * @see de.oaam.model.oaam.library.TaskOutputTrigger
	 * @generated
	 */
	EClass getTaskOutputTrigger();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.TaskOutputTrigger#getFixedRate <em>Fixed Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Rate</em>'.
	 * @see de.oaam.model.oaam.library.TaskOutputTrigger#getFixedRate()
	 * @see #getTaskOutputTrigger()
	 * @generated
	 */
	EAttribute getTaskOutputTrigger_FixedRate();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.library.TaskOutputTrigger#isIsFixedRate <em>Is Fixed Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fixed Rate</em>'.
	 * @see de.oaam.model.oaam.library.TaskOutputTrigger#isIsFixedRate()
	 * @see #getTaskOutputTrigger()
	 * @generated
	 */
	EAttribute getTaskOutputTrigger_IsFixedRate();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.TaskOutputTrigger#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see de.oaam.model.oaam.library.TaskOutputTrigger#getCondition()
	 * @see #getTaskOutputTrigger()
	 * @generated
	 */
	EReference getTaskOutputTrigger_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.TaskOutputTrigger#getBooleanOperations <em>Boolean Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Operations</em>'.
	 * @see de.oaam.model.oaam.library.TaskOutputTrigger#getBooleanOperations()
	 * @see #getTaskOutputTrigger()
	 * @generated
	 */
	EReference getTaskOutputTrigger_BooleanOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.TaskOutputTrigger#getBooleanNots <em>Boolean Nots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Nots</em>'.
	 * @see de.oaam.model.oaam.library.TaskOutputTrigger#getBooleanNots()
	 * @see #getTaskOutputTrigger()
	 * @generated
	 */
	EReference getTaskOutputTrigger_BooleanNots();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.library.TaskOutputTrigger#getTaskInputTriggers <em>Task Input Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Input Triggers</em>'.
	 * @see de.oaam.model.oaam.library.TaskOutputTrigger#getTaskInputTriggers()
	 * @see #getTaskOutputTrigger()
	 * @generated
	 */
	EReference getTaskOutputTrigger_TaskInputTriggers();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.TaskInputTrigger <em>Task Input Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Input Trigger</em>'.
	 * @see de.oaam.model.oaam.library.TaskInputTrigger
	 * @generated
	 */
	EClass getTaskInputTrigger();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.TaskInputTrigger#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.library.TaskInputTrigger#getInput()
	 * @see #getTaskInputTrigger()
	 * @generated
	 */
	EReference getTaskInputTrigger_Input();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.TaskStateDeclaration <em>Task State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task State Declaration</em>'.
	 * @see de.oaam.model.oaam.library.TaskStateDeclaration
	 * @generated
	 */
	EClass getTaskStateDeclaration();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.TaskStateDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.library.TaskStateDeclaration#getType()
	 * @see #getTaskStateDeclaration()
	 * @generated
	 */
	EReference getTaskStateDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.TaskParameterDeclaration <em>Task Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Parameter Declaration</em>'.
	 * @see de.oaam.model.oaam.library.TaskParameterDeclaration
	 * @generated
	 */
	EClass getTaskParameterDeclaration();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.library.TaskParameterDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.library.TaskParameterDeclaration#getType()
	 * @see #getTaskParameterDeclaration()
	 * @generated
	 */
	EReference getTaskParameterDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.library.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see de.oaam.model.oaam.library.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.library.IoDirectionE <em>Io Direction E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Io Direction E</em>'.
	 * @see de.oaam.model.oaam.library.IoDirectionE
	 * @generated
	 */
	EEnum getIoDirectionE();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.library.AttributeTypesE <em>Attribute Types E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Types E</em>'.
	 * @see de.oaam.model.oaam.library.AttributeTypesE
	 * @generated
	 */
	EEnum getAttributeTypesE();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.library.AttributeTargetsE <em>Attribute Targets E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Targets E</em>'.
	 * @see de.oaam.model.oaam.library.AttributeTargetsE
	 * @generated
	 */
	EEnum getAttributeTargetsE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibraryFactory getLibraryFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceConsumerAImpl <em>Resource Consumer A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceConsumerAImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceConsumerA()
		 * @generated
		 */
		EClass RESOURCE_CONSUMER_A = eINSTANCE.getResourceConsumerA();

		/**
		 * The meta object literal for the '<em><b>Required Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSUMER_A__REQUIRED_RESOURCES = eINSTANCE.getResourceConsumerA_RequiredResources();

		/**
		 * The meta object literal for the '<em><b>Consumed Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSUMER_A__CONSUMED_GROUPS = eINSTANCE.getResourceConsumerA_ConsumedGroups();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceProviderAImpl <em>Resource Provider A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceProviderAImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceProviderA()
		 * @generated
		 */
		EClass RESOURCE_PROVIDER_A = eINSTANCE.getResourceProviderA();

		/**
		 * The meta object literal for the '<em><b>Provided Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROVIDER_A__PROVIDED_BUNDLES = eINSTANCE.getResourceProviderA_ProvidedBundles();

		/**
		 * The meta object literal for the '<em><b>Possible Resource Provisions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS = eINSTANCE.getResourceProviderA_PossibleResourceProvisions();

		/**
		 * The meta object literal for the '<em><b>Provided Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROVIDER_A__PROVIDED_GROUPS = eINSTANCE.getResourceProviderA_ProvidedGroups();

		/**
		 * The meta object literal for the '<em><b>Resource Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROVIDER_A__RESOURCE_LINKS = eINSTANCE.getResourceProviderA_ResourceLinks();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceProviderInstanceAImpl <em>Resource Provider Instance A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceProviderInstanceAImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceProviderInstanceA()
		 * @generated
		 */
		EClass RESOURCE_PROVIDER_INSTANCE_A = eINSTANCE.getResourceProviderInstanceA();

		/**
		 * The meta object literal for the '<em><b>Required Modifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS = eINSTANCE.getResourceProviderInstanceA_RequiredModifiers();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.LibraryContainerAImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getLibraryContainerA()
		 * @generated
		 */
		EClass LIBRARY_CONTAINER_A = eINSTANCE.getLibraryContainerA();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__DATA_TYPES = eINSTANCE.getLibraryContainerA_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__RESOURCE_TYPES = eINSTANCE.getLibraryContainerA_ResourceTypes();

		/**
		 * The meta object literal for the '<em><b>Resource Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__RESOURCE_BUNDLES = eINSTANCE.getLibraryContainerA_ResourceBundles();

		/**
		 * The meta object literal for the '<em><b>Resource Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS = eINSTANCE.getLibraryContainerA_ResourceModifiers();

		/**
		 * The meta object literal for the '<em><b>Resource Type Dissimilarities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES = eINSTANCE.getLibraryContainerA_ResourceTypeDissimilarities();

		/**
		 * The meta object literal for the '<em><b>Task Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__TASK_TYPES = eINSTANCE.getLibraryContainerA_TaskTypes();

		/**
		 * The meta object literal for the '<em><b>Task Type Dissimilarity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY = eINSTANCE.getLibraryContainerA_TaskTypeDissimilarity();

		/**
		 * The meta object literal for the '<em><b>Signal Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__SIGNAL_TYPES = eINSTANCE.getLibraryContainerA_SignalTypes();

		/**
		 * The meta object literal for the '<em><b>Device Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__DEVICE_TYPES = eINSTANCE.getLibraryContainerA_DeviceTypes();

		/**
		 * The meta object literal for the '<em><b>Device Type Symmetries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES = eINSTANCE.getLibraryContainerA_DeviceTypeSymmetries();

		/**
		 * The meta object literal for the '<em><b>Device Type Dissimilarities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES = eINSTANCE.getLibraryContainerA_DeviceTypeDissimilarities();

		/**
		 * The meta object literal for the '<em><b>Connection Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__CONNECTION_TYPES = eINSTANCE.getLibraryContainerA_ConnectionTypes();

		/**
		 * The meta object literal for the '<em><b>Wire Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__WIRE_TYPES = eINSTANCE.getLibraryContainerA_WireTypes();

		/**
		 * The meta object literal for the '<em><b>Location Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__LOCATION_TYPES = eINSTANCE.getLibraryContainerA_LocationTypes();

		/**
		 * The meta object literal for the '<em><b>Duct Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__DUCT_TYPES = eINSTANCE.getLibraryContainerA_DuctTypes();

		/**
		 * The meta object literal for the '<em><b>Generic Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES = eINSTANCE.getLibraryContainerA_GenericAttributes();

		/**
		 * The meta object literal for the '<em><b>Power Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__POWER_SOURCES = eINSTANCE.getLibraryContainerA_PowerSources();

		/**
		 * The meta object literal for the '<em><b>Sublibraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__SUBLIBRARIES = eINSTANCE.getLibraryContainerA_Sublibraries();

		/**
		 * The meta object literal for the '<em><b>Io Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CONTAINER_A__IO_TYPES = eINSTANCE.getLibraryContainerA_IoTypes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceTypeImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__UNIT = eINSTANCE.getResourceType_Unit();

		/**
		 * The meta object literal for the '<em><b>Is Consumed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_CONSUMED = eINSTANCE.getResourceType_IsConsumed();

		/**
		 * The meta object literal for the '<em><b>Is Distinguishable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_DISTINGUISHABLE = eINSTANCE.getResourceType_IsDistinguishable();

		/**
		 * The meta object literal for the '<em><b>Is Propagated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_PROPAGATED = eINSTANCE.getResourceType_IsPropagated();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__DIRECTION = eINSTANCE.getResourceType_Direction();

		/**
		 * The meta object literal for the '<em><b>Is Io</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_IO = eINSTANCE.getResourceType_IsIo();

		/**
		 * The meta object literal for the '<em><b>Is Configurable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_CONFIGURABLE = eINSTANCE.getResourceType_IsConfigurable();

		/**
		 * The meta object literal for the '<em><b>Propageted Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__PROPAGETED_RESOURCES = eINSTANCE.getResourceType_PropagetedResources();

		/**
		 * The meta object literal for the '<em><b>Allowed Modifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__ALLOWED_MODIFIERS = eINSTANCE.getResourceType_AllowedModifiers();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__ALTERNATIVES = eINSTANCE.getResourceType_Alternatives();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__TYPE = eINSTANCE.getResource_Type();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__COUNT = eINSTANCE.getResource_Count();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__MODIFIERS = eINSTANCE.getResource_Modifiers();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceAlternativesImpl <em>Resource Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceAlternativesImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceAlternatives()
		 * @generated
		 */
		EClass RESOURCE_ALTERNATIVES = eINSTANCE.getResourceAlternatives();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ALTERNATIVES__RESOURCES = eINSTANCE.getResourceAlternatives_Resources();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceBundleImpl <em>Resource Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceBundleImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceBundle()
		 * @generated
		 */
		EClass RESOURCE_BUNDLE = eINSTANCE.getResourceBundle();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_BUNDLE__RESOURCES = eINSTANCE.getResourceBundle_Resources();

		/**
		 * The meta object literal for the '<em><b>Mtbf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BUNDLE__MTBF = eINSTANCE.getResourceBundle_Mtbf();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BUNDLE__COST = eINSTANCE.getResourceBundle_Cost();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BUNDLE__MASS = eINSTANCE.getResourceBundle_Mass();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.TaskTypeImpl <em>Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.TaskTypeImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskType()
		 * @generated
		 */
		EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '<em><b>Output Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__OUTPUT_DECLARATIONS = eINSTANCE.getTaskType_OutputDeclarations();

		/**
		 * The meta object literal for the '<em><b>Input Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__INPUT_DECLARATIONS = eINSTANCE.getTaskType_InputDeclarations();

		/**
		 * The meta object literal for the '<em><b>Is Deterministic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__IS_DETERMINISTIC = eINSTANCE.getTaskType_IsDeterministic();

		/**
		 * The meta object literal for the '<em><b>Preferred Execution Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PREFERRED_EXECUTION_RATE = eINSTANCE.getTaskType_PreferredExecutionRate();

		/**
		 * The meta object literal for the '<em><b>State Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__STATE_DECLARATIONS = eINSTANCE.getTaskType_StateDeclarations();

		/**
		 * The meta object literal for the '<em><b>Parameter Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__PARAMETER_DECLARATIONS = eINSTANCE.getTaskType_ParameterDeclarations();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.SignalTypeImpl <em>Signal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.SignalTypeImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getSignalType()
		 * @generated
		 */
		EClass SIGNAL_TYPE = eINSTANCE.getSignalType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_TYPE__TYPE = eINSTANCE.getSignalType_Type();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.DeviceTypeImpl <em>Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.DeviceTypeImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDeviceType()
		 * @generated
		 */
		EClass DEVICE_TYPE = eINSTANCE.getDeviceType();

		/**
		 * The meta object literal for the '<em><b>Io Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TYPE__IO_DECLARATIONS = eINSTANCE.getDeviceType_IoDeclarations();

		/**
		 * The meta object literal for the '<em><b>Is Subdevice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__IS_SUBDEVICE = eINSTANCE.getDeviceType_IsSubdevice();

		/**
		 * The meta object literal for the '<em><b>Can Have Subdevices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__CAN_HAVE_SUBDEVICES = eINSTANCE.getDeviceType_CanHaveSubdevices();

		/**
		 * The meta object literal for the '<em><b>Mtbf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__MTBF = eINSTANCE.getDeviceType_Mtbf();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__WEIGHT = eINSTANCE.getDeviceType_Weight();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__COST = eINSTANCE.getDeviceType_Cost();

		/**
		 * The meta object literal for the '<em><b>Io Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TYPE__IO_GROUPS = eINSTANCE.getDeviceType_IoGroups();

		/**
		 * The meta object literal for the '<em><b>Is Self Managing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__IS_SELF_MANAGING = eINSTANCE.getDeviceType_IsSelfManaging();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ConnectionTypeImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getConnectionType()
		 * @generated
		 */
		EClass CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '<em><b>Is Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__IS_INFORMATION = eINSTANCE.getConnectionType_IsInformation();

		/**
		 * The meta object literal for the '<em><b>Is Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__IS_POWER = eINSTANCE.getConnectionType_IsPower();

		/**
		 * The meta object literal for the '<em><b>Wire Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TYPE__WIRE_TYPES = eINSTANCE.getConnectionType_WireTypes();

		/**
		 * The meta object literal for the '<em><b>Is Wireless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__IS_WIRELESS = eINSTANCE.getConnectionType_IsWireless();

		/**
		 * The meta object literal for the '<em><b>Allows Circles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__ALLOWS_CIRCLES = eINSTANCE.getConnectionType_AllowsCircles();

		/**
		 * The meta object literal for the '<em><b>NStarting Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__NSTARTING_POINTS = eINSTANCE.getConnectionType_NStartingPoints();

		/**
		 * The meta object literal for the '<em><b>Starting Point Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TYPE__STARTING_POINT_RESOURCE_TYPES = eINSTANCE.getConnectionType_StartingPointResourceTypes();

		/**
		 * The meta object literal for the '<em><b>NEnd Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__NEND_POINTS = eINSTANCE.getConnectionType_NEndPoints();

		/**
		 * The meta object literal for the '<em><b>End Point Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TYPE__END_POINT_RESOURCE_TYPES = eINSTANCE.getConnectionType_EndPointResourceTypes();

		/**
		 * The meta object literal for the '<em><b>NJoints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__NJOINTS = eINSTANCE.getConnectionType_NJoints();

		/**
		 * The meta object literal for the '<em><b>Max Joint Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__MAX_JOINT_BRANCHES = eINSTANCE.getConnectionType_MaxJointBranches();

		/**
		 * The meta object literal for the '<em><b>Max Interface To Joint Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE = eINSTANCE.getConnectionType_MaxInterfaceToJointDistance();

		/**
		 * The meta object literal for the '<em><b>Switch Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TYPE__SWITCH_TYPES = eINSTANCE.getConnectionType_SwitchTypes();

		/**
		 * The meta object literal for the '<em><b>Is Switched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__IS_SWITCHED = eINSTANCE.getConnectionType_IsSwitched();

		/**
		 * The meta object literal for the '<em><b>Direct Connections Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED = eINSTANCE.getConnectionType_DirectConnectionsAllowed();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__MAX_LENGTH = eINSTANCE.getConnectionType_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Is Unidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__IS_UNIDIRECTIONAL = eINSTANCE.getConnectionType_IsUnidirectional();

		/**
		 * The meta object literal for the '<em><b>Requires Master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__REQUIRES_MASTER = eINSTANCE.getConnectionType_RequiresMaster();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.LocationTypeImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getLocationType()
		 * @generated
		 */
		EClass LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '<em><b>Is Joint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__IS_JOINT = eINSTANCE.getLocationType_IsJoint();

		/**
		 * The meta object literal for the '<em><b>Duct Opening Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TYPE__DUCT_OPENING_DECLARATIONS = eINSTANCE.getLocationType_DuctOpeningDeclarations();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.DuctTypeImpl <em>Duct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.DuctTypeImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDuctType()
		 * @generated
		 */
		EClass DUCT_TYPE = eINSTANCE.getDuctType();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.WireTypeImpl <em>Wire Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.WireTypeImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getWireType()
		 * @generated
		 */
		EClass WIRE_TYPE = eINSTANCE.getWireType();

		/**
		 * The meta object literal for the '<em><b>Specific Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__SPECIFIC_WEIGHT = eINSTANCE.getWireType_SpecificWeight();

		/**
		 * The meta object literal for the '<em><b>Specific Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__SPECIFIC_PRICE = eINSTANCE.getWireType_SpecificPrice();

		/**
		 * The meta object literal for the '<em><b>NConductors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__NCONDUCTORS = eINSTANCE.getWireType_NConductors();

		/**
		 * The meta object literal for the '<em><b>Min Bending Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__MIN_BENDING_RADIUS = eINSTANCE.getWireType_MinBendingRadius();

		/**
		 * The meta object literal for the '<em><b>NShields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__NSHIELDS = eINSTANCE.getWireType_NShields();

		/**
		 * The meta object literal for the '<em><b>Mtbf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_TYPE__MTBF = eINSTANCE.getWireType_Mtbf();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.IoTypeImpl <em>Io Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.IoTypeImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getIoType()
		 * @generated
		 */
		EClass IO_TYPE = eINSTANCE.getIoType();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TYPE__DIRECTION = eINSTANCE.getIoType_Direction();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.InputDeclarationImpl <em>Input Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.InputDeclarationImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getInputDeclaration()
		 * @generated
		 */
		EClass INPUT_DECLARATION = eINSTANCE.getInputDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_DECLARATION__TYPE = eINSTANCE.getInputDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DECLARATION__UNIT = eINSTANCE.getInputDeclaration_Unit();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DECLARATION__PRECONDITION = eINSTANCE.getInputDeclaration_Precondition();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DECLARATION__RANGE = eINSTANCE.getInputDeclaration_Range();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DECLARATION__LOWER_BOUND = eINSTANCE.getInputDeclaration_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DECLARATION__UPPER_BOUND = eINSTANCE.getInputDeclaration_UpperBound();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl <em>Output Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.OutputDeclarationImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getOutputDeclaration()
		 * @generated
		 */
		EClass OUTPUT_DECLARATION = eINSTANCE.getOutputDeclaration();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DECLARATION__UNIT = eINSTANCE.getOutputDeclaration_Unit();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DECLARATION__POSTCONDITION = eINSTANCE.getOutputDeclaration_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DECLARATION__TRIGGER = eINSTANCE.getOutputDeclaration_Trigger();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DECLARATION__RANGE = eINSTANCE.getOutputDeclaration_Range();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DECLARATION__TYPE = eINSTANCE.getOutputDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DECLARATION__LOWER_BOUND = eINSTANCE.getOutputDeclaration_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DECLARATION__UPPER_BOUND = eINSTANCE.getOutputDeclaration_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Fault Propagations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DECLARATION__FAULT_PROPAGATIONS = eINSTANCE.getOutputDeclaration_FaultPropagations();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.IoDeclarationImpl <em>Io Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.IoDeclarationImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getIoDeclaration()
		 * @generated
		 */
		EClass IO_DECLARATION = eINSTANCE.getIoDeclaration();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_DECLARATION__RESOURCES = eINSTANCE.getIoDeclaration_Resources();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_DECLARATION__TYPE = eINSTANCE.getIoDeclaration_Type();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.DuctOpeningDeclarationImpl <em>Duct Opening Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.DuctOpeningDeclarationImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDuctOpeningDeclaration()
		 * @generated
		 */
		EClass DUCT_OPENING_DECLARATION = eINSTANCE.getDuctOpeningDeclaration();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceGroupImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceGroup()
		 * @generated
		 */
		EClass RESOURCE_GROUP = eINSTANCE.getResourceGroup();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_GROUP__RESOURCES = eINSTANCE.getResourceGroup_Resources();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.DeviceTypeSymmetryImpl <em>Device Type Symmetry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.DeviceTypeSymmetryImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDeviceTypeSymmetry()
		 * @generated
		 */
		EClass DEVICE_TYPE_SYMMETRY = eINSTANCE.getDeviceTypeSymmetry();

		/**
		 * The meta object literal for the '<em><b>Device Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TYPE_SYMMETRY__DEVICE_TYPES = eINSTANCE.getDeviceTypeSymmetry_DeviceTypes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.IoGroupImpl <em>Io Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.IoGroupImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getIoGroup()
		 * @generated
		 */
		EClass IO_GROUP = eINSTANCE.getIoGroup();

		/**
		 * The meta object literal for the '<em><b>Ios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_GROUP__IOS = eINSTANCE.getIoGroup_Ios();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.AttributeDefinitionImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getAttributeDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION = eINSTANCE.getAttributeDefinition();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION__DATA_TYPE = eINSTANCE.getAttributeDefinition_DataType();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION__TARGET = eINSTANCE.getAttributeDefinition_Target();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.FaultPropagationImpl <em>Fault Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.FaultPropagationImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getFaultPropagation()
		 * @generated
		 */
		EClass FAULT_PROPAGATION = eINSTANCE.getFaultPropagation();

		/**
		 * The meta object literal for the '<em><b>Output State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_PROPAGATION__OUTPUT_STATE = eINSTANCE.getFaultPropagation_OutputState();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_PROPAGATION__CONDITION = eINSTANCE.getFaultPropagation_Condition();

		/**
		 * The meta object literal for the '<em><b>Boolean Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_PROPAGATION__BOOLEAN_OPERATIONS = eINSTANCE.getFaultPropagation_BooleanOperations();

		/**
		 * The meta object literal for the '<em><b>Boolean Nots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_PROPAGATION__BOOLEAN_NOTS = eINSTANCE.getFaultPropagation_BooleanNots();

		/**
		 * The meta object literal for the '<em><b>Task Input States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_PROPAGATION__TASK_INPUT_STATES = eINSTANCE.getFaultPropagation_TaskInputStates();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.TaskInputStateImpl <em>Task Input State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.TaskInputStateImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskInputState()
		 * @generated
		 */
		EClass TASK_INPUT_STATE = eINSTANCE.getTaskInputState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_INPUT_STATE__STATE = eINSTANCE.getTaskInputState_State();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INPUT_STATE__INPUT = eINSTANCE.getTaskInputState_Input();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.PowerSourceImpl <em>Power Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.PowerSourceImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getPowerSource()
		 * @generated
		 */
		EClass POWER_SOURCE = eINSTANCE.getPowerSource();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceLinkImpl <em>Resource Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceLinkImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceLink()
		 * @generated
		 */
		EClass RESOURCE_LINK = eINSTANCE.getResourceLink();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_LINK__IN = eINSTANCE.getResourceLink_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_LINK__OUT = eINSTANCE.getResourceLink_Out();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierImpl <em>Resource Type Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceTypeModifierImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceTypeModifier()
		 * @generated
		 */
		EClass RESOURCE_TYPE_MODIFIER = eINSTANCE.getResourceTypeModifier();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_MODIFIER__LEVELS = eINSTANCE.getResourceTypeModifier_Levels();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierLevelImpl <em>Resource Type Modifier Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceTypeModifierLevelImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceTypeModifierLevel()
		 * @generated
		 */
		EClass RESOURCE_TYPE_MODIFIER_LEVEL = eINSTANCE.getResourceTypeModifierLevel();

		/**
		 * The meta object literal for the '<em><b>Equal Alternatives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_MODIFIER_LEVEL__EQUAL_ALTERNATIVES = eINSTANCE.getResourceTypeModifierLevel_EqualAlternatives();

		/**
		 * The meta object literal for the '<em><b>Better Alternative</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_MODIFIER_LEVEL__BETTER_ALTERNATIVE = eINSTANCE.getResourceTypeModifierLevel_BetterAlternative();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierReferenceImpl <em>Resource Type Modifier Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceTypeModifierReferenceImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceTypeModifierReference()
		 * @generated
		 */
		EClass RESOURCE_TYPE_MODIFIER_REFERENCE = eINSTANCE.getResourceTypeModifierReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_MODIFIER_REFERENCE__TYPE = eINSTANCE.getResourceTypeModifierReference_Type();

		/**
		 * The meta object literal for the '<em><b>Allowed Levels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_MODIFIER_REFERENCE__ALLOWED_LEVELS = eINSTANCE.getResourceTypeModifierReference_AllowedLevels();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.TaskTypeDissimilarityImpl <em>Task Type Dissimilarity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.TaskTypeDissimilarityImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskTypeDissimilarity()
		 * @generated
		 */
		EClass TASK_TYPE_DISSIMILARITY = eINSTANCE.getTaskTypeDissimilarity();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE_DISSIMILARITY__TASKS = eINSTANCE.getTaskTypeDissimilarity_Tasks();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Common Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_CODE = eINSTANCE.getTaskTypeDissimilarity_PercentageOfCommonCode();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.DeviceTypeDissimilarityImpl <em>Device Type Dissimilarity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.DeviceTypeDissimilarityImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getDeviceTypeDissimilarity()
		 * @generated
		 */
		EClass DEVICE_TYPE_DISSIMILARITY = eINSTANCE.getDeviceTypeDissimilarity();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TYPE_DISSIMILARITY__DEVICES = eINSTANCE.getDeviceTypeDissimilarity_Devices();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Common Hardware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_HARDWARE = eINSTANCE.getDeviceTypeDissimilarity_PercentageOfCommonHardware();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.ResourceTypeDissimilarityImpl <em>Resource Type Dissimilarity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.ResourceTypeDissimilarityImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getResourceTypeDissimilarity()
		 * @generated
		 */
		EClass RESOURCE_TYPE_DISSIMILARITY = eINSTANCE.getResourceTypeDissimilarity();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_DISSIMILARITY__RESOURCE_TYPES = eINSTANCE.getResourceTypeDissimilarity_ResourceTypes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.SublibraryImpl <em>Sublibrary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.SublibraryImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getSublibrary()
		 * @generated
		 */
		EClass SUBLIBRARY = eINSTANCE.getSublibrary();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl <em>Task Output Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.TaskOutputTriggerImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskOutputTrigger()
		 * @generated
		 */
		EClass TASK_OUTPUT_TRIGGER = eINSTANCE.getTaskOutputTrigger();

		/**
		 * The meta object literal for the '<em><b>Fixed Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_OUTPUT_TRIGGER__FIXED_RATE = eINSTANCE.getTaskOutputTrigger_FixedRate();

		/**
		 * The meta object literal for the '<em><b>Is Fixed Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_OUTPUT_TRIGGER__IS_FIXED_RATE = eINSTANCE.getTaskOutputTrigger_IsFixedRate();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_OUTPUT_TRIGGER__CONDITION = eINSTANCE.getTaskOutputTrigger_Condition();

		/**
		 * The meta object literal for the '<em><b>Boolean Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_OUTPUT_TRIGGER__BOOLEAN_OPERATIONS = eINSTANCE.getTaskOutputTrigger_BooleanOperations();

		/**
		 * The meta object literal for the '<em><b>Boolean Nots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_OUTPUT_TRIGGER__BOOLEAN_NOTS = eINSTANCE.getTaskOutputTrigger_BooleanNots();

		/**
		 * The meta object literal for the '<em><b>Task Input Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_OUTPUT_TRIGGER__TASK_INPUT_TRIGGERS = eINSTANCE.getTaskOutputTrigger_TaskInputTriggers();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.TaskInputTriggerImpl <em>Task Input Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.TaskInputTriggerImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskInputTrigger()
		 * @generated
		 */
		EClass TASK_INPUT_TRIGGER = eINSTANCE.getTaskInputTrigger();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INPUT_TRIGGER__INPUT = eINSTANCE.getTaskInputTrigger_Input();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.TaskStateDeclarationImpl <em>Task State Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.TaskStateDeclarationImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskStateDeclaration()
		 * @generated
		 */
		EClass TASK_STATE_DECLARATION = eINSTANCE.getTaskStateDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_STATE_DECLARATION__TYPE = eINSTANCE.getTaskStateDeclaration_Type();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.TaskParameterDeclarationImpl <em>Task Parameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.TaskParameterDeclarationImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getTaskParameterDeclaration()
		 * @generated
		 */
		EClass TASK_PARAMETER_DECLARATION = eINSTANCE.getTaskParameterDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PARAMETER_DECLARATION__TYPE = eINSTANCE.getTaskParameterDeclaration_Type();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.impl.LibraryImpl
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.IoDirectionE <em>Io Direction E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.IoDirectionE
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getIoDirectionE()
		 * @generated
		 */
		EEnum IO_DIRECTION_E = eINSTANCE.getIoDirectionE();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.AttributeTypesE <em>Attribute Types E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.AttributeTypesE
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getAttributeTypesE()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPES_E = eINSTANCE.getAttributeTypesE();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.library.AttributeTargetsE <em>Attribute Targets E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.library.AttributeTargetsE
		 * @see de.oaam.model.oaam.library.impl.LibraryPackageImpl#getAttributeTargetsE()
		 * @generated
		 */
		EEnum ATTRIBUTE_TARGETS_E = eINSTANCE.getAttributeTargetsE();

	}

} //LibraryPackage
