/**
 */
package de.oaam.model.oaam.hardware;

import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.library.LibraryPackage;

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
 * The hardware topology of devices and connections. 
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.hardware.HardwareFactory
 * @model kind="package"
 * @generated
 */
public interface HardwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hardware";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v100/hardware";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HardwarePackage eINSTANCE = de.oaam.model.oaam.hardware.impl.HardwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.hardware.impl.HardwareContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.hardware.impl.HardwareContainerAImpl
	 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getHardwareContainerA()
	 * @generated
	 */
	int HARDWARE_CONTAINER_A = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__DEVICES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__CONNECTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A__SUBHARDWARE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONTAINER_A_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.hardware.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.hardware.impl.DeviceImpl
	 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Required Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__REQUIRED_MODIFIERS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__STYLE = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ATTRIBUTES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DOCUMENTATION = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MODIFIED = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MODIFIER = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TRACE_LINK = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__VARIANTS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__OPERATION_MODES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IOS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sub Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SUB_DEVICES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Location Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__LOCATION_BINDING = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Power Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__POWER_SOURCES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.hardware.impl.ConnectionImpl
	 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Required Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__REQUIRED_MODIFIERS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ID = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STYLE = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ATTRIBUTES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DOCUMENTATION = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MODIFIED = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MODIFIER = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TRACE_LINK = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__VARIANTS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__OPERATION_MODES = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TYPE = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__END_POINTS = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.hardware.impl.IoImpl <em>Io</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.hardware.impl.IoImpl
	 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getIo()
	 * @generated
	 */
	int IO = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__DECLARATION = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Io</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Io</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.hardware.impl.DeviceSymmetryImpl <em>Device Symmetry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.hardware.impl.DeviceSymmetryImpl
	 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getDeviceSymmetry()
	 * @generated
	 */
	int DEVICE_SYMMETRY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY__DEVICES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Device Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Device Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SYMMETRY_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.hardware.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.hardware.impl.HardwareImpl
	 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__ID = HARDWARE_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__NAME = HARDWARE_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__STYLE = HARDWARE_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__ATTRIBUTES = HARDWARE_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__DOCUMENTATION = HARDWARE_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__MODIFIED = HARDWARE_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__MODIFIER = HARDWARE_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__TRACE_LINK = HARDWARE_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__DEVICES = HARDWARE_CONTAINER_A__DEVICES;

	/**
	 * The feature id for the '<em><b>Device Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__DEVICE_SYMMETRIES = HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__CONNECTIONS = HARDWARE_CONTAINER_A__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Subhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__SUBHARDWARE = HARDWARE_CONTAINER_A__SUBHARDWARE;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__VARIANTS = HARDWARE_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__OPERATION_MODES = HARDWARE_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = HARDWARE_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = HARDWARE_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.hardware.impl.SubhardwareImpl <em>Subhardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.hardware.impl.SubhardwareImpl
	 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getSubhardware()
	 * @generated
	 */
	int SUBHARDWARE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__ID = HARDWARE_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__NAME = HARDWARE_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__STYLE = HARDWARE_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__ATTRIBUTES = HARDWARE_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__DOCUMENTATION = HARDWARE_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__MODIFIED = HARDWARE_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__MODIFIER = HARDWARE_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__TRACE_LINK = HARDWARE_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__DEVICES = HARDWARE_CONTAINER_A__DEVICES;

	/**
	 * The feature id for the '<em><b>Device Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__DEVICE_SYMMETRIES = HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__CONNECTIONS = HARDWARE_CONTAINER_A__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Subhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__SUBHARDWARE = HARDWARE_CONTAINER_A__SUBHARDWARE;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__VARIANTS = HARDWARE_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE__OPERATION_MODES = HARDWARE_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subhardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE_FEATURE_COUNT = HARDWARE_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subhardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHARDWARE_OPERATION_COUNT = HARDWARE_CONTAINER_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.hardware.HardwareContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.hardware.HardwareContainerA
	 * @generated
	 */
	EClass getHardwareContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.hardware.HardwareContainerA#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see de.oaam.model.oaam.hardware.HardwareContainerA#getDevices()
	 * @see #getHardwareContainerA()
	 * @generated
	 */
	EReference getHardwareContainerA_Devices();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.hardware.HardwareContainerA#getDeviceSymmetries <em>Device Symmetries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Symmetries</em>'.
	 * @see de.oaam.model.oaam.hardware.HardwareContainerA#getDeviceSymmetries()
	 * @see #getHardwareContainerA()
	 * @generated
	 */
	EReference getHardwareContainerA_DeviceSymmetries();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.hardware.HardwareContainerA#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connections</em>'.
	 * @see de.oaam.model.oaam.hardware.HardwareContainerA#getConnections()
	 * @see #getHardwareContainerA()
	 * @generated
	 */
	EReference getHardwareContainerA_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.hardware.HardwareContainerA#getSubhardware <em>Subhardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subhardware</em>'.
	 * @see de.oaam.model.oaam.hardware.HardwareContainerA#getSubhardware()
	 * @see #getHardwareContainerA()
	 * @generated
	 */
	EReference getHardwareContainerA_Subhardware();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.hardware.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see de.oaam.model.oaam.hardware.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.hardware.Device#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.hardware.Device#getType()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.hardware.Device#getIos <em>Ios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ios</em>'.
	 * @see de.oaam.model.oaam.hardware.Device#getIos()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Ios();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.hardware.Device#getSubDevices <em>Sub Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Devices</em>'.
	 * @see de.oaam.model.oaam.hardware.Device#getSubDevices()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_SubDevices();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.hardware.Device#getLocationBinding <em>Location Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Binding</em>'.
	 * @see de.oaam.model.oaam.hardware.Device#getLocationBinding()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_LocationBinding();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.hardware.Device#getPowerSources <em>Power Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Sources</em>'.
	 * @see de.oaam.model.oaam.hardware.Device#getPowerSources()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_PowerSources();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.hardware.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see de.oaam.model.oaam.hardware.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.hardware.Connection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.hardware.Connection#getType()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Type();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.hardware.Connection#getEndPoints <em>End Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Points</em>'.
	 * @see de.oaam.model.oaam.hardware.Connection#getEndPoints()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_EndPoints();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.hardware.Io <em>Io</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io</em>'.
	 * @see de.oaam.model.oaam.hardware.Io
	 * @generated
	 */
	EClass getIo();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.hardware.Io#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see de.oaam.model.oaam.hardware.Io#getDeclaration()
	 * @see #getIo()
	 * @generated
	 */
	EReference getIo_Declaration();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.hardware.DeviceSymmetry <em>Device Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Symmetry</em>'.
	 * @see de.oaam.model.oaam.hardware.DeviceSymmetry
	 * @generated
	 */
	EClass getDeviceSymmetry();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.hardware.DeviceSymmetry#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see de.oaam.model.oaam.hardware.DeviceSymmetry#getDevices()
	 * @see #getDeviceSymmetry()
	 * @generated
	 */
	EReference getDeviceSymmetry_Devices();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.hardware.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see de.oaam.model.oaam.hardware.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.hardware.Subhardware <em>Subhardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subhardware</em>'.
	 * @see de.oaam.model.oaam.hardware.Subhardware
	 * @generated
	 */
	EClass getSubhardware();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HardwareFactory getHardwareFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.hardware.impl.HardwareContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.hardware.impl.HardwareContainerAImpl
		 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getHardwareContainerA()
		 * @generated
		 */
		EClass HARDWARE_CONTAINER_A = eINSTANCE.getHardwareContainerA();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CONTAINER_A__DEVICES = eINSTANCE.getHardwareContainerA_Devices();

		/**
		 * The meta object literal for the '<em><b>Device Symmetries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES = eINSTANCE.getHardwareContainerA_DeviceSymmetries();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CONTAINER_A__CONNECTIONS = eINSTANCE.getHardwareContainerA_Connections();

		/**
		 * The meta object literal for the '<em><b>Subhardware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CONTAINER_A__SUBHARDWARE = eINSTANCE.getHardwareContainerA_Subhardware();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.hardware.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.hardware.impl.DeviceImpl
		 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__TYPE = eINSTANCE.getDevice_Type();

		/**
		 * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__IOS = eINSTANCE.getDevice_Ios();

		/**
		 * The meta object literal for the '<em><b>Sub Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__SUB_DEVICES = eINSTANCE.getDevice_SubDevices();

		/**
		 * The meta object literal for the '<em><b>Location Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__LOCATION_BINDING = eINSTANCE.getDevice_LocationBinding();

		/**
		 * The meta object literal for the '<em><b>Power Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__POWER_SOURCES = eINSTANCE.getDevice_PowerSources();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.hardware.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.hardware.impl.ConnectionImpl
		 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TYPE = eINSTANCE.getConnection_Type();

		/**
		 * The meta object literal for the '<em><b>End Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__END_POINTS = eINSTANCE.getConnection_EndPoints();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.hardware.impl.IoImpl <em>Io</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.hardware.impl.IoImpl
		 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getIo()
		 * @generated
		 */
		EClass IO = eINSTANCE.getIo();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO__DECLARATION = eINSTANCE.getIo_Declaration();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.hardware.impl.DeviceSymmetryImpl <em>Device Symmetry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.hardware.impl.DeviceSymmetryImpl
		 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getDeviceSymmetry()
		 * @generated
		 */
		EClass DEVICE_SYMMETRY = eINSTANCE.getDeviceSymmetry();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SYMMETRY__DEVICES = eINSTANCE.getDeviceSymmetry_Devices();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.hardware.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.hardware.impl.HardwareImpl
		 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.hardware.impl.SubhardwareImpl <em>Subhardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.hardware.impl.SubhardwareImpl
		 * @see de.oaam.model.oaam.hardware.impl.HardwarePackageImpl#getSubhardware()
		 * @generated
		 */
		EClass SUBHARDWARE = eINSTANCE.getSubhardware();

	}

} //HardwarePackage
