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
	String eNS_URI = "http://www.oaam.de/oaam/model/v100/capabilities";

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
	int CAPABILITIES_CONTAINER_A__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Function Capabilties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subcapabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A__SUBCAPABILITIES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_CONTAINER_A_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.TaskCapabilityImpl <em>Task Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.TaskCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getTaskCapability()
	 * @generated
	 */
	int TASK_CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__TASK_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Worst Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__WORST_CASE_EXECUTION_TIME = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY__FAILURE_PROBABILITY = CAPABILITY_A_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Task Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Task Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.DeviceCapabilityImpl <em>Device Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.DeviceCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getDeviceCapability()
	 * @generated
	 */
	int DEVICE_CAPABILITY = 3;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY__LOCATION_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.ConnectionCapabilityImpl <em>Connection Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.ConnectionCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getConnectionCapability()
	 * @generated
	 */
	int CONNECTION_CAPABILITY = 4;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__CONNECTION_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__LOCATION_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Duct Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY__DUCT_TYPE = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Connection Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Connection Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.SignalCapabilityImpl <em>Signal Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.SignalCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSignalCapability()
	 * @generated
	 */
	int SIGNAL_CAPABILITY = 5;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Signal Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__SIGNAL_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY__CONNECTION_TYPE = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Signal Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Signal Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.SubDeviceCapabilityImpl <em>Sub Device Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.SubDeviceCapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubDeviceCapability()
	 * @generated
	 */
	int SUB_DEVICE_CAPABILITY = 6;

	/**
	 * The feature id for the '<em><b>Resource Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__RESOURCE_CONSUMPTIONS = CAPABILITY_A__RESOURCE_CONSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__ID = CAPABILITY_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__NAME = CAPABILITY_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__STYLE = CAPABILITY_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__ATTRIBUTES = CAPABILITY_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__DOCUMENTATION = CAPABILITY_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__MODIFIED = CAPABILITY_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__MODIFIER = CAPABILITY_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__TRACE_LINK = CAPABILITY_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__VARIANTS = CAPABILITY_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__OPERATION_MODES = CAPABILITY_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sub Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__SUB_DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY__TARGET_DEVICE_TYPE = CAPABILITY_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Sub Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY_FEATURE_COUNT = CAPABILITY_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Sub Device Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_CAPABILITY_OPERATION_COUNT = CAPABILITY_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.ResourceConsumptionImpl <em>Resource Consumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.ResourceConsumptionImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getResourceConsumption()
	 * @generated
	 */
	int RESOURCE_CONSUMPTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION__TYPE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSUMPTION_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.CapabilitiesImpl <em>Capabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getCapabilities()
	 * @generated
	 */
	int CAPABILITIES = 8;

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
	 * The feature id for the '<em><b>Function Capabilties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__FUNCTION_CAPABILTIES = CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES;

	/**
	 * The feature id for the '<em><b>Signal Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__SIGNAL_CAPABILITIES = CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Sub Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__SUB_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Connection Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__CONNECTION_CAPABILITIES = CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Subcapabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__SUBCAPABILITIES = CAPABILITIES_CONTAINER_A__SUBCAPABILITIES;

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
	 * The meta object id for the '{@link de.oaam.model.oaam.capabilities.impl.SubcapabilityImpl <em>Subcapability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.capabilities.impl.SubcapabilityImpl
	 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubcapability()
	 * @generated
	 */
	int SUBCAPABILITY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__ID = CAPABILITIES_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__NAME = CAPABILITIES_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__STYLE = CAPABILITIES_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__ATTRIBUTES = CAPABILITIES_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__DOCUMENTATION = CAPABILITIES_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__MODIFIED = CAPABILITIES_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__MODIFIER = CAPABILITIES_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__TRACE_LINK = CAPABILITIES_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Function Capabilties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__FUNCTION_CAPABILTIES = CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES;

	/**
	 * The feature id for the '<em><b>Signal Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__SIGNAL_CAPABILITIES = CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Sub Device Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__SUB_DEVICE_CAPABILITIES = CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Connection Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__CONNECTION_CAPABILITIES = CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Subcapabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__SUBCAPABILITIES = CAPABILITIES_CONTAINER_A__SUBCAPABILITIES;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__OPERATION_MODES = CAPABILITIES_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY__VARIANTS = CAPABILITIES_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subcapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY_FEATURE_COUNT = CAPABILITIES_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subcapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPABILITY_OPERATION_COUNT = CAPABILITIES_CONTAINER_A_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getFunctionCapabilties <em>Function Capabilties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Capabilties</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getFunctionCapabilties()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_FunctionCapabilties();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSignalCapabilities <em>Signal Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSignalCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_SignalCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getDeviceCapabilities <em>Device Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getDeviceCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_DeviceCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubDeviceCapabilities <em>Sub Device Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Device Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getSubDeviceCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_SubDeviceCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getConnectionCapabilities <em>Connection Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Capabilities</em>'.
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesContainerA#getConnectionCapabilities()
	 * @see #getCapabilitiesContainerA()
	 * @generated
	 */
	EReference getCapabilitiesContainerA_ConnectionCapabilities();

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
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.TaskCapability <em>Task Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskCapability
	 * @generated
	 */
	EClass getTaskCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.TaskCapability#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskCapability#getTaskType()
	 * @see #getTaskCapability()
	 * @generated
	 */
	EReference getTaskCapability_TaskType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.TaskCapability#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskCapability#getDeviceType()
	 * @see #getTaskCapability()
	 * @generated
	 */
	EReference getTaskCapability_DeviceType();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.capabilities.TaskCapability#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Case Execution Time</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskCapability#getWorstCaseExecutionTime()
	 * @see #getTaskCapability()
	 * @generated
	 */
	EAttribute getTaskCapability_WorstCaseExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.capabilities.TaskCapability#getFailureProbability <em>Failure Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Probability</em>'.
	 * @see de.oaam.model.oaam.capabilities.TaskCapability#getFailureProbability()
	 * @see #getTaskCapability()
	 * @generated
	 */
	EAttribute getTaskCapability_FailureProbability();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.DeviceCapability <em>Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.DeviceCapability
	 * @generated
	 */
	EClass getDeviceCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.DeviceCapability#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.DeviceCapability#getDeviceType()
	 * @see #getDeviceCapability()
	 * @generated
	 */
	EReference getDeviceCapability_DeviceType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.DeviceCapability#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.DeviceCapability#getLocationType()
	 * @see #getDeviceCapability()
	 * @generated
	 */
	EReference getDeviceCapability_LocationType();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.ConnectionCapability <em>Connection Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.ConnectionCapability
	 * @generated
	 */
	EClass getConnectionCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.ConnectionCapability#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.ConnectionCapability#getConnectionType()
	 * @see #getConnectionCapability()
	 * @generated
	 */
	EReference getConnectionCapability_ConnectionType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.ConnectionCapability#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.ConnectionCapability#getLocationType()
	 * @see #getConnectionCapability()
	 * @generated
	 */
	EReference getConnectionCapability_LocationType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.ConnectionCapability#getDuctType <em>Duct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duct Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.ConnectionCapability#getDuctType()
	 * @see #getConnectionCapability()
	 * @generated
	 */
	EReference getConnectionCapability_DuctType();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.SignalCapability <em>Signal Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.SignalCapability
	 * @generated
	 */
	EClass getSignalCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SignalCapability#getSignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SignalCapability#getSignalType()
	 * @see #getSignalCapability()
	 * @generated
	 */
	EReference getSignalCapability_SignalType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SignalCapability#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SignalCapability#getDeviceType()
	 * @see #getSignalCapability()
	 * @generated
	 */
	EReference getSignalCapability_DeviceType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SignalCapability#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SignalCapability#getConnectionType()
	 * @see #getSignalCapability()
	 * @generated
	 */
	EReference getSignalCapability_ConnectionType();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.SubDeviceCapability <em>Sub Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Device Capability</em>'.
	 * @see de.oaam.model.oaam.capabilities.SubDeviceCapability
	 * @generated
	 */
	EClass getSubDeviceCapability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SubDeviceCapability#getSubDeviceType <em>Sub Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SubDeviceCapability#getSubDeviceType()
	 * @see #getSubDeviceCapability()
	 * @generated
	 */
	EReference getSubDeviceCapability_SubDeviceType();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.capabilities.SubDeviceCapability#getTargetDeviceType <em>Target Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Device Type</em>'.
	 * @see de.oaam.model.oaam.capabilities.SubDeviceCapability#getTargetDeviceType()
	 * @see #getSubDeviceCapability()
	 * @generated
	 */
	EReference getSubDeviceCapability_TargetDeviceType();

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
	 * Returns the meta object for class '{@link de.oaam.model.oaam.capabilities.Subcapability <em>Subcapability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcapability</em>'.
	 * @see de.oaam.model.oaam.capabilities.Subcapability
	 * @generated
	 */
	EClass getSubcapability();

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
		 * The meta object literal for the '<em><b>Function Capabilties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__FUNCTION_CAPABILTIES = eINSTANCE.getCapabilitiesContainerA_FunctionCapabilties();

		/**
		 * The meta object literal for the '<em><b>Signal Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__SIGNAL_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_SignalCapabilities();

		/**
		 * The meta object literal for the '<em><b>Device Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__DEVICE_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_DeviceCapabilities();

		/**
		 * The meta object literal for the '<em><b>Sub Device Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__SUB_DEVICE_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_SubDeviceCapabilities();

		/**
		 * The meta object literal for the '<em><b>Connection Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__CONNECTION_CAPABILITIES = eINSTANCE.getCapabilitiesContainerA_ConnectionCapabilities();

		/**
		 * The meta object literal for the '<em><b>Subcapabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_CONTAINER_A__SUBCAPABILITIES = eINSTANCE.getCapabilitiesContainerA_Subcapabilities();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.TaskCapabilityImpl <em>Task Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.TaskCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getTaskCapability()
		 * @generated
		 */
		EClass TASK_CAPABILITY = eINSTANCE.getTaskCapability();

		/**
		 * The meta object literal for the '<em><b>Task Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CAPABILITY__TASK_TYPE = eINSTANCE.getTaskCapability_TaskType();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CAPABILITY__DEVICE_TYPE = eINSTANCE.getTaskCapability_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Worst Case Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CAPABILITY__WORST_CASE_EXECUTION_TIME = eINSTANCE.getTaskCapability_WorstCaseExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Failure Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CAPABILITY__FAILURE_PROBABILITY = eINSTANCE.getTaskCapability_FailureProbability();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.DeviceCapabilityImpl <em>Device Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.DeviceCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getDeviceCapability()
		 * @generated
		 */
		EClass DEVICE_CAPABILITY = eINSTANCE.getDeviceCapability();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CAPABILITY__DEVICE_TYPE = eINSTANCE.getDeviceCapability_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CAPABILITY__LOCATION_TYPE = eINSTANCE.getDeviceCapability_LocationType();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.ConnectionCapabilityImpl <em>Connection Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.ConnectionCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getConnectionCapability()
		 * @generated
		 */
		EClass CONNECTION_CAPABILITY = eINSTANCE.getConnectionCapability();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CAPABILITY__CONNECTION_TYPE = eINSTANCE.getConnectionCapability_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CAPABILITY__LOCATION_TYPE = eINSTANCE.getConnectionCapability_LocationType();

		/**
		 * The meta object literal for the '<em><b>Duct Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CAPABILITY__DUCT_TYPE = eINSTANCE.getConnectionCapability_DuctType();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.SignalCapabilityImpl <em>Signal Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.SignalCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSignalCapability()
		 * @generated
		 */
		EClass SIGNAL_CAPABILITY = eINSTANCE.getSignalCapability();

		/**
		 * The meta object literal for the '<em><b>Signal Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_CAPABILITY__SIGNAL_TYPE = eINSTANCE.getSignalCapability_SignalType();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_CAPABILITY__DEVICE_TYPE = eINSTANCE.getSignalCapability_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_CAPABILITY__CONNECTION_TYPE = eINSTANCE.getSignalCapability_ConnectionType();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.SubDeviceCapabilityImpl <em>Sub Device Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.SubDeviceCapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubDeviceCapability()
		 * @generated
		 */
		EClass SUB_DEVICE_CAPABILITY = eINSTANCE.getSubDeviceCapability();

		/**
		 * The meta object literal for the '<em><b>Sub Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_DEVICE_CAPABILITY__SUB_DEVICE_TYPE = eINSTANCE.getSubDeviceCapability_SubDeviceType();

		/**
		 * The meta object literal for the '<em><b>Target Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_DEVICE_CAPABILITY__TARGET_DEVICE_TYPE = eINSTANCE.getSubDeviceCapability_TargetDeviceType();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.capabilities.impl.SubcapabilityImpl <em>Subcapability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.capabilities.impl.SubcapabilityImpl
		 * @see de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl#getSubcapability()
		 * @generated
		 */
		EClass SUBCAPABILITY = eINSTANCE.getSubcapability();

	}

} //CapabilitiesPackage
