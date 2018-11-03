/**
 */
package de.oaam.model.oaam.capabilities;

import de.oaam.model.oaam.common.CommonPackage;

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
 * Definition of software to hardware to anatomy assignment possibilities and resource consumptions.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.capabilities.CapabilitiesFactory
 * @model kind="package"
 * @generated
 */
public interface CapabilitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "capabilities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v140/capabilities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.capabilities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapabilitiesPackage eINSTANCE = de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.CapabilityAImpl <em>Capability A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilityAImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getCapabilityA()
	 * @generated
	 */
	int CAPABILITY_A = 0;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_A__RESOURCE_CONSUMPTIONS = 0;

	/**
	 * The number of structural features of the '<em>Capability A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capability A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getCapabilitiesContainerA()
	 * @generated
	 */
	int CAPABILITIES_CONTAINER_A = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Task On Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal On Connection Or Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device In Location Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subdevice In Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection In Duct Or Location Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subcapabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__SUBCAPABILITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subconnection In Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.TaskOnDeviceCapabilityImpl <em>Task On Device Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.TaskOnDeviceCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getTaskOnDeviceCapability()
	 * @generated
	 */
	int TASK_ON_DEVICE_CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__TASK_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Worst Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__WORST_CASE_EXECUTION_TIME = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY__FAILURE_PROBABILITY = CAPABILITY_A_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Task On Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Task On Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ON_DEVICE_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl <em>Device In Location Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getDeviceInLocationCapability()
	 * @generated
	 */
	int DEVICE_IN_LOCATION_CAPABILITY = 3;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY__LOCATION_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Device In Location Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Device In Location Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IN_LOCATION_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.ConnectionInDuctOrLocationCapabilityImpl <em>Connection In Duct Or Location Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.ConnectionInDuctOrLocationCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getConnectionInDuctOrLocationCapability()
	 * @generated
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY = 4;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__CONNECTION_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__LOCATION_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Duct Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__DUCT_TYPE = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Connection In Duct Or Location Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Connection In Duct Or Location Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.SignalOnConnectionOrDeviceCapabilityImpl <em>Signal On Connection Or Device Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.SignalOnConnectionOrDeviceCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSignalOnConnectionOrDeviceCapability()
	 * @generated
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY = 5;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Signal Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__SIGNAL_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__CONNECTION_TYPE = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Worst Case Transmission Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__WORST_CASE_TRANSMISSION_TIME = CAPABILITY_A_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Signal On Connection Or Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Signal On Connection Or Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.SubdeviceInDeviceCapabilityImpl <em>Subdevice In Device Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.SubdeviceInDeviceCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubdeviceInDeviceCapability()
	 * @generated
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY = 6;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subdevice Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__SUBDEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY__TARGET_DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Subdevice In Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Subdevice In Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_IN_DEVICE_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.SubconnectionInDeviceCapabilityImpl <em>Subconnection In Device Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.SubconnectionInDeviceCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubconnectionInDeviceCapability()
	 * @generated
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY = 7;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subconnection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__SUBCONNECTION_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY__TARGET_DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Subconnection In Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Subconnection In Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_IN_DEVICE_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.ResourceConsumptionImpl <em>Resource Consumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.ResourceConsumptionImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getResourceConsumption()
	 * @generated
	 */
	int RESOURCE_CONSUMPTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesImpl <em>Capabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getCapabilities()
	 * @generated
	 */
	int CAPABILITIES = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__ID = CAPABILITIES_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__NAME = CAPABILITIES_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__STYLE = CAPABILITIES_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__ATTRIBUTES = CAPABILITIES_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__DOCUMENTATION = CAPABILITIES_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__MODIFIED = CAPABILITIES_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__MODIFIER = CAPABILITIES_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__TRACE_LINK = CAPABILITIES_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Task On Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__TASK_ON_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Signal On Connection Or Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Device In Location Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__DEVICE_IN_LOCATION_CAPABILITIES = CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Subdevice In Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__SUBDEVICE_IN_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Connection In Duct Or Location Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES = CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Subcapabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__SUBCAPABILITIES = CAPABILITIES_CONTAINER_A__SUBCAPABILITIES;

	/**
	 * The feature id for the '<em><b>Subconnection In Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__SUBCONNECTION_IN_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES;

	/**
	 * The number of structural features of the '<em>Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_FEATURE_COUNT = CAPABILITIES_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_OPERATION_COUNT = CAPABILITIES_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.SubcapabilitiesImpl <em>Subcapabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.SubcapabilitiesImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubcapabilities()
	 * @generated
	 */
	int SUBCAPABILITIES = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__ID = CAPABILITIES_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__NAME = CAPABILITIES_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__STYLE = CAPABILITIES_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__ATTRIBUTES = CAPABILITIES_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__DOCUMENTATION = CAPABILITIES_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__MODIFIED = CAPABILITIES_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__MODIFIER = CAPABILITIES_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__TRACE_LINK = CAPABILITIES_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Task On Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__TASK_ON_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Signal On Connection Or Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Device In Location Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__DEVICE_IN_LOCATION_CAPABILITIES = CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Subdevice In Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__SUBDEVICE_IN_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Connection In Duct Or Location Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES = CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Subcapabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__SUBCAPABILITIES = CAPABILITIES_CONTAINER_A__SUBCAPABILITIES;

	/**
	 * The feature id for the '<em><b>Subconnection In Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__SUBCONNECTION_IN_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__OPERATION_MODES = CAPABILITIES_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES__VARIANTS = CAPABILITIES_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subcapabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES_FEATURE_COUNT = CAPABILITIES_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subcapabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITIES_OPERATION_COUNT = CAPABILITIES_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.CapabilityA <em>Capability A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability A</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilityA
	 * @generated
	 */
	EClass getCapabilityA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilityA#getResourceConsumptions <em>Resource Consumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Consumptions</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilityA#getResourceConsumptions()
	 * @see #getCapabilityA()
	 * @generated
	 */
	EReference getCapabilityA_ResourceConsumptions();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA
	 * @generated
	 */
	EClass getCapabilitiesContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getTaskOnDeviceCapabilities <em>Task On Device Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task On Device Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getTaskOnDeviceCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_TaskOnDeviceCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSignalOnConnectionOrDeviceCapabilities <em>Signal On Connection Or Device Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal On Connection Or Device Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSignalOnConnectionOrDeviceCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_SignalOnConnectionOrDeviceCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getDeviceInLocationCapabilities <em>Device In Location Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device In Location Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getDeviceInLocationCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_DeviceInLocationCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubdeviceInDeviceCapabilities <em>Subdevice In Device Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subdevice In Device Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubdeviceInDeviceCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_SubdeviceInDeviceCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getConnectionInDuctOrLocationCapabilities <em>Connection In Duct Or Location Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection In Duct Or Location Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getConnectionInDuctOrLocationCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_ConnectionInDuctOrLocationCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubcapabilities <em>Subcapabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcapabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubcapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_Subcapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubconnectionInDeviceCapabilities <em>Subconnection In Device Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subconnection In Device Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubconnectionInDeviceCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_SubconnectionInDeviceCapabilities();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.TaskOnDeviceCapability <em>Task On Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task On Device Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskOnDeviceCapability
	 * @generated
	 */
	EClass getTaskOnDeviceCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.TaskOnDeviceCapability#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskOnDeviceCapability#getTaskType()
	 * @see #getTaskOnDeviceCapability()
	 * @generated
	 */
	EReference getTaskOnDeviceCapability_TaskType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.TaskOnDeviceCapability#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskOnDeviceCapability#getDeviceType()
	 * @see #getTaskOnDeviceCapability()
	 * @generated
	 */
	EReference getTaskOnDeviceCapability_DeviceType();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.capabilities.TaskOnDeviceCapability#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Case Execution Time</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskOnDeviceCapability#getWorstCaseExecutionTime()
	 * @see #getTaskOnDeviceCapability()
	 * @generated
	 */
	EAttribute getTaskOnDeviceCapability_WorstCaseExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.capabilities.TaskOnDeviceCapability#getFailureProbability <em>Failure Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Probability</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskOnDeviceCapability#getFailureProbability()
	 * @see #getTaskOnDeviceCapability()
	 * @generated
	 */
	EAttribute getTaskOnDeviceCapability_FailureProbability();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.DeviceInLocationCapability <em>Device In Location Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device In Location Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.DeviceInLocationCapability
	 * @generated
	 */
	EClass getDeviceInLocationCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.DeviceInLocationCapability#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.DeviceInLocationCapability#getDeviceType()
	 * @see #getDeviceInLocationCapability()
	 * @generated
	 */
	EReference getDeviceInLocationCapability_DeviceType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.DeviceInLocationCapability#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.DeviceInLocationCapability#getLocationType()
	 * @see #getDeviceInLocationCapability()
	 * @generated
	 */
	EReference getDeviceInLocationCapability_LocationType();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability <em>Connection In Duct Or Location Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection In Duct Or Location Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability
	 * @generated
	 */
	EClass getConnectionInDuctOrLocationCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability#getConnectionType()
	 * @see #getConnectionInDuctOrLocationCapability()
	 * @generated
	 */
	EReference getConnectionInDuctOrLocationCapability_ConnectionType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability#getLocationType()
	 * @see #getConnectionInDuctOrLocationCapability()
	 * @generated
	 */
	EReference getConnectionInDuctOrLocationCapability_LocationType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability#getDuctType <em>Duct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duct Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability#getDuctType()
	 * @see #getConnectionInDuctOrLocationCapability()
	 * @generated
	 */
	EReference getConnectionInDuctOrLocationCapability_DuctType();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability <em>Signal On Connection Or Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal On Connection Or Device Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability
	 * @generated
	 */
	EClass getSignalOnConnectionOrDeviceCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getSignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getSignalType()
	 * @see #getSignalOnConnectionOrDeviceCapability()
	 * @generated
	 */
	EReference getSignalOnConnectionOrDeviceCapability_SignalType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getDeviceType()
	 * @see #getSignalOnConnectionOrDeviceCapability()
	 * @generated
	 */
	EReference getSignalOnConnectionOrDeviceCapability_DeviceType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getConnectionType()
	 * @see #getSignalOnConnectionOrDeviceCapability()
	 * @generated
	 */
	EReference getSignalOnConnectionOrDeviceCapability_ConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getWorstCaseTransmissionTime <em>Worst Case Transmission Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Case Transmission Time</em>'.
	 * @see de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability#getWorstCaseTransmissionTime()
	 * @see #getSignalOnConnectionOrDeviceCapability()
	 * @generated
	 */
	EAttribute getSignalOnConnectionOrDeviceCapability_WorstCaseTransmissionTime();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability <em>Subdevice In Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subdevice In Device Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability
	 * @generated
	 */
	EClass getSubdeviceInDeviceCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability#getSubdeviceType <em>Subdevice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subdevice Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability#getSubdeviceType()
	 * @see #getSubdeviceInDeviceCapability()
	 * @generated
	 */
	EReference getSubdeviceInDeviceCapability_SubdeviceType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability#getTargetDeviceType <em>Target Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability#getTargetDeviceType()
	 * @see #getSubdeviceInDeviceCapability()
	 * @generated
	 */
	EReference getSubdeviceInDeviceCapability_TargetDeviceType();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability <em>Subconnection In Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subconnection In Device Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability
	 * @generated
	 */
	EClass getSubconnectionInDeviceCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability#getSubconnectionType <em>Subconnection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subconnection Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability#getSubconnectionType()
	 * @see #getSubconnectionInDeviceCapability()
	 * @generated
	 */
	EReference getSubconnectionInDeviceCapability_SubconnectionType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability#getTargetDeviceType <em>Target Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability#getTargetDeviceType()
	 * @see #getSubconnectionInDeviceCapability()
	 * @generated
	 */
	EReference getSubconnectionInDeviceCapability_TargetDeviceType();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.ResourceConsumption <em>Resource Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Consumption</em>'.
	 * @see de.oaam.model.oaam.capabilities.ResourceConsumption
	 * @generated
	 */
	EClass getResourceConsumption();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.capabilities.ResourceConsumption#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.oaam.model.oaam.capabilities.ResourceConsumption#getCount()
	 * @see #getResourceConsumption()
	 * @generated
	 */
	EAttribute getResourceConsumption_Count();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.capabilities.ResourceConsumption#getOriginalResource <em>Original Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Original Resource</em>'.
	 * @see de.oaam.model.oaam.capabilities.ResourceConsumption#getOriginalResource()
	 * @see #getResourceConsumption()
	 * @generated
	 */
	EReference getResourceConsumption_OriginalResource();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.ResourceConsumption#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.ResourceConsumption#getType()
	 * @see #getResourceConsumption()
	 * @generated
	 */
	EReference getResourceConsumption_Type();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.Capabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.Capabilities
	 * @generated
	 */
	EClass getCapabilities();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.Subcapabilities <em>Subcapabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcapabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.Subcapabilities
	 * @generated
	 */
	EClass getSubcapabilities();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CapabilitiesFactory getCapabilitiesFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.CapabilityAImpl <em>Capability A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilityAImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getCapabilityA()
		 * @generated
		 */
		EClass CAPABILITY_A = eINSTANCE.getCapabilityA();

		/**
		 * The meta object literal for the '<em><b>Resource Consumptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_A__RESOURCE_CONSUMPTIONS = eINSTANCE.getCapabilityA_ResourceConsumptions();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesContainerAImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getCapabilitiesContainerA()
		 * @generated
		 */
		EClass CAPABILITIES_CONTAINER_A = eINSTANCE.getCapabilitiesContainerA();

		/**
		 * The meta object literal for the '<em><b>Task On Device Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_TaskOnDeviceCapabilities();

		/**
		 * The meta object literal for the '<em><b>Signal On Connection Or Device Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_SignalOnConnectionOrDeviceCapabilities();

		/**
		 * The meta object literal for the '<em><b>Device In Location Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_DeviceInLocationCapabilities();

		/**
		 * The meta object literal for the '<em><b>Subdevice In Device Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_SubdeviceInDeviceCapabilities();

		/**
		 * The meta object literal for the '<em><b>Connection In Duct Or Location Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_ConnectionInDuctOrLocationCapabilities();

		/**
		 * The meta object literal for the '<em><b>Subcapabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__SUBCAPABILITIES = eINSTANCE.getCapabilitiesContainerA_Subcapabilities();

		/**
		 * The meta object literal for the '<em><b>Subconnection In Device Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_SubconnectionInDeviceCapabilities();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.TaskOnDeviceCapabilityImpl <em>Task On Device Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.TaskOnDeviceCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getTaskOnDeviceCapability()
		 * @generated
		 */
		EClass TASK_ON_DEVICE_CAPABILITY = eINSTANCE.getTaskOnDeviceCapability();

		/**
		 * The meta object literal for the '<em><b>Task Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ON_DEVICE_CAPABILITY__TASK_TYPE = eINSTANCE.getTaskOnDeviceCapability_TaskType();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ON_DEVICE_CAPABILITY__DEVICE_TYPE = eINSTANCE.getTaskOnDeviceCapability_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Worst Case Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ON_DEVICE_CAPABILITY__WORST_CASE_EXECUTION_TIME = eINSTANCE.getTaskOnDeviceCapability_WorstCaseExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Failure Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ON_DEVICE_CAPABILITY__FAILURE_PROBABILITY = eINSTANCE.getTaskOnDeviceCapability_FailureProbability();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl <em>Device In Location Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getDeviceInLocationCapability()
		 * @generated
		 */
		EClass DEVICE_IN_LOCATION_CAPABILITY = eINSTANCE.getDeviceInLocationCapability();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_IN_LOCATION_CAPABILITY__DEVICE_TYPE = eINSTANCE.getDeviceInLocationCapability_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_IN_LOCATION_CAPABILITY__LOCATION_TYPE = eINSTANCE.getDeviceInLocationCapability_LocationType();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.ConnectionInDuctOrLocationCapabilityImpl <em>Connection In Duct Or Location Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.ConnectionInDuctOrLocationCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getConnectionInDuctOrLocationCapability()
		 * @generated
		 */
		EClass CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY = eINSTANCE.getConnectionInDuctOrLocationCapability();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__CONNECTION_TYPE = eINSTANCE.getConnectionInDuctOrLocationCapability_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__LOCATION_TYPE = eINSTANCE.getConnectionInDuctOrLocationCapability_LocationType();

		/**
		 * The meta object literal for the '<em><b>Duct Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__DUCT_TYPE = eINSTANCE.getConnectionInDuctOrLocationCapability_DuctType();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.SignalOnConnectionOrDeviceCapabilityImpl <em>Signal On Connection Or Device Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.SignalOnConnectionOrDeviceCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSignalOnConnectionOrDeviceCapability()
		 * @generated
		 */
		EClass SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY = eINSTANCE.getSignalOnConnectionOrDeviceCapability();

		/**
		 * The meta object literal for the '<em><b>Signal Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__SIGNAL_TYPE = eINSTANCE.getSignalOnConnectionOrDeviceCapability_SignalType();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__DEVICE_TYPE = eINSTANCE.getSignalOnConnectionOrDeviceCapability_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__CONNECTION_TYPE = eINSTANCE.getSignalOnConnectionOrDeviceCapability_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Worst Case Transmission Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__WORST_CASE_TRANSMISSION_TIME = eINSTANCE.getSignalOnConnectionOrDeviceCapability_WorstCaseTransmissionTime();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.SubdeviceInDeviceCapabilityImpl <em>Subdevice In Device Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.SubdeviceInDeviceCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubdeviceInDeviceCapability()
		 * @generated
		 */
		EClass SUBDEVICE_IN_DEVICE_CAPABILITY = eINSTANCE.getSubdeviceInDeviceCapability();

		/**
		 * The meta object literal for the '<em><b>Subdevice Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_IN_DEVICE_CAPABILITY__SUBDEVICE_TYPE = eINSTANCE.getSubdeviceInDeviceCapability_SubdeviceType();

		/**
		 * The meta object literal for the '<em><b>Target Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_IN_DEVICE_CAPABILITY__TARGET_DEVICE_TYPE = eINSTANCE.getSubdeviceInDeviceCapability_TargetDeviceType();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.SubconnectionInDeviceCapabilityImpl <em>Subconnection In Device Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.SubconnectionInDeviceCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubconnectionInDeviceCapability()
		 * @generated
		 */
		EClass SUBCONNECTION_IN_DEVICE_CAPABILITY = eINSTANCE.getSubconnectionInDeviceCapability();

		/**
		 * The meta object literal for the '<em><b>Subconnection Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCONNECTION_IN_DEVICE_CAPABILITY__SUBCONNECTION_TYPE = eINSTANCE.getSubconnectionInDeviceCapability_SubconnectionType();

		/**
		 * The meta object literal for the '<em><b>Target Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCONNECTION_IN_DEVICE_CAPABILITY__TARGET_DEVICE_TYPE = eINSTANCE.getSubconnectionInDeviceCapability_TargetDeviceType();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.ResourceConsumptionImpl <em>Resource Consumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.ResourceConsumptionImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getResourceConsumption()
		 * @generated
		 */
		EClass RESOURCE_CONSUMPTION = eINSTANCE.getResourceConsumption();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONSUMPTION__COUNT = eINSTANCE.getResourceConsumption_Count();

		/**
		 * The meta object literal for the '<em><b>Original Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE = eINSTANCE.getResourceConsumption_OriginalResource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSUMPTION__TYPE = eINSTANCE.getResourceConsumption_Type();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesImpl <em>Capabilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getCapabilities()
		 * @generated
		 */
		EClass CAPABILITIES = eINSTANCE.getCapabilities();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.SubcapabilitiesImpl <em>Subcapabilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.SubcapabilitiesImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubcapabilities()
		 * @generated
		 */
		EClass SUBCAPABILITIES = eINSTANCE.getSubcapabilities();

	}

} //CapabilitiesPackage
