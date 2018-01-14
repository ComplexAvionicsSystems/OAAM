/**
 */
package de.oaam.model.oaam.mapping;

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
 * The assignment of tasks functions to hardware and hardware to anatomy.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v100/mapping";

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
	MappingPackage eINSTANCE = de.oaam.model.oaam.mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.MappingContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.MappingContainerAImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getMappingContainerA()
	 * @generated
	 */
	int MAPPING_CONTAINER_A = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Device Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__TASK_ASSIGNMENTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Signal Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Supmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A__SUPMAPPING = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_A_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.TaskAssignmentImpl <em>Task Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.TaskAssignmentImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getTaskAssignment()
	 * @generated
	 */
	int TASK_ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__CAPABILITY = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__TASK = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__DEVICE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__SCHEDULE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Task Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Task Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.SignalAssignmentImpl <em>Signal Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.SignalAssignmentImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSignalAssignment()
	 * @generated
	 */
	int SIGNAL_ASSIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__SEGMENTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__SIGNAL = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signal Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Signal Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.ConnectionAssignmentImpl <em>Connection Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.ConnectionAssignmentImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getConnectionAssignment()
	 * @generated
	 */
	int CONNECTION_ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__SEGMENTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__CONNECTION = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connection Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connection Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.SignalAssignmentSegmentImpl <em>Signal Assignment Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.SignalAssignmentSegmentImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSignalAssignmentSegment()
	 * @generated
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__CAPABILITY = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__DEVICE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__CONNECTION = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Signal Assignment Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Signal Assignment Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.DeviceAssignmentImpl <em>Device Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.DeviceAssignmentImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getDeviceAssignment()
	 * @generated
	 */
	int DEVICE_ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__DEVICE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__LOCATION = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__CAPABILITY = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Device Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Device Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.ConnectionAssignmentSegmentImpl <em>Connection Assignment Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.ConnectionAssignmentSegmentImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getConnectionAssignmentSegment()
	 * @generated
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__LOCATION = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__DUCT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connection Assignment Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Connection Assignment Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.SubDeviceAssignmentImpl <em>Sub Device Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.SubDeviceAssignmentImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSubDeviceAssignment()
	 * @generated
	 */
	int SUB_DEVICE_ASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__CAPABILITY = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__SUB_DEVICE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT__TARGET_DEVICE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sub Device Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sub Device Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DEVICE_ASSIGNMENT_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.MappingImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ID = MAPPING_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = MAPPING_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__STYLE = MAPPING_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ATTRIBUTES = MAPPING_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DOCUMENTATION = MAPPING_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MODIFIED = MAPPING_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MODIFIER = MAPPING_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TRACE_LINK = MAPPING_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DEVICE_ASSIGNMENTS = MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Sub Device Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SUB_DEVICE_ASSIGNMENTS = MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Connection Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CONNECTION_ASSIGNMENTS = MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Task Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TASK_ASSIGNMENTS = MAPPING_CONTAINER_A__TASK_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Signal Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SIGNAL_ASSIGNMENTS = MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Supmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SUPMAPPING = MAPPING_CONTAINER_A__SUPMAPPING;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = MAPPING_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = MAPPING_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.SupmappingImpl <em>Supmapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.SupmappingImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSupmapping()
	 * @generated
	 */
	int SUPMAPPING = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__ID = MAPPING_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__NAME = MAPPING_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__STYLE = MAPPING_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__ATTRIBUTES = MAPPING_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__DOCUMENTATION = MAPPING_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__MODIFIED = MAPPING_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__MODIFIER = MAPPING_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__TRACE_LINK = MAPPING_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__DEVICE_ASSIGNMENTS = MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Sub Device Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__SUB_DEVICE_ASSIGNMENTS = MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Connection Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__CONNECTION_ASSIGNMENTS = MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Task Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__TASK_ASSIGNMENTS = MAPPING_CONTAINER_A__TASK_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Signal Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__SIGNAL_ASSIGNMENTS = MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Supmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__SUPMAPPING = MAPPING_CONTAINER_A__SUPMAPPING;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__OPERATION_MODES = MAPPING_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING__VARIANTS = MAPPING_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supmapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING_FEATURE_COUNT = MAPPING_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Supmapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPMAPPING_OPERATION_COUNT = MAPPING_CONTAINER_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.ScheduleImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__RATE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__IS_PERIODIC = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__PRIORITY = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scheduled Times</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__SCHEDULED_TIMES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.mapping.impl.ScheduledTimeImpl <em>Scheduled Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.mapping.impl.ScheduledTimeImpl
	 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getScheduledTime()
	 * @generated
	 */
	int SCHEDULED_TIME = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__CYCLE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__START_TIME = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__DURATION = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__RESTART = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Scheduled Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Scheduled Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.MappingContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.mapping.MappingContainerA
	 * @generated
	 */
	EClass getMappingContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.MappingContainerA#getDeviceAssignments <em>Device Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Assignments</em>'.
	 * @see de.oaam.model.oaam.mapping.MappingContainerA#getDeviceAssignments()
	 * @see #getMappingContainerA()
	 * @generated
	 */
	EReference getMappingContainerA_DeviceAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.MappingContainerA#getSubDeviceAssignments <em>Sub Device Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Device Assignments</em>'.
	 * @see de.oaam.model.oaam.mapping.MappingContainerA#getSubDeviceAssignments()
	 * @see #getMappingContainerA()
	 * @generated
	 */
	EReference getMappingContainerA_SubDeviceAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.MappingContainerA#getConnectionAssignments <em>Connection Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Assignments</em>'.
	 * @see de.oaam.model.oaam.mapping.MappingContainerA#getConnectionAssignments()
	 * @see #getMappingContainerA()
	 * @generated
	 */
	EReference getMappingContainerA_ConnectionAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.MappingContainerA#getTaskAssignments <em>Task Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Assignments</em>'.
	 * @see de.oaam.model.oaam.mapping.MappingContainerA#getTaskAssignments()
	 * @see #getMappingContainerA()
	 * @generated
	 */
	EReference getMappingContainerA_TaskAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.MappingContainerA#getSignalAssignments <em>Signal Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Assignments</em>'.
	 * @see de.oaam.model.oaam.mapping.MappingContainerA#getSignalAssignments()
	 * @see #getMappingContainerA()
	 * @generated
	 */
	EReference getMappingContainerA_SignalAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.MappingContainerA#getSupmapping <em>Supmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supmapping</em>'.
	 * @see de.oaam.model.oaam.mapping.MappingContainerA#getSupmapping()
	 * @see #getMappingContainerA()
	 * @generated
	 */
	EReference getMappingContainerA_Supmapping();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.TaskAssignment <em>Task Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Assignment</em>'.
	 * @see de.oaam.model.oaam.mapping.TaskAssignment
	 * @generated
	 */
	EClass getTaskAssignment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.TaskAssignment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.mapping.TaskAssignment#getCapability()
	 * @see #getTaskAssignment()
	 * @generated
	 */
	EReference getTaskAssignment_Capability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.TaskAssignment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see de.oaam.model.oaam.mapping.TaskAssignment#getTask()
	 * @see #getTaskAssignment()
	 * @generated
	 */
	EReference getTaskAssignment_Task();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.TaskAssignment#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see de.oaam.model.oaam.mapping.TaskAssignment#getDevice()
	 * @see #getTaskAssignment()
	 * @generated
	 */
	EReference getTaskAssignment_Device();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.TaskAssignment#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedule</em>'.
	 * @see de.oaam.model.oaam.mapping.TaskAssignment#getSchedule()
	 * @see #getTaskAssignment()
	 * @generated
	 */
	EReference getTaskAssignment_Schedule();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.SignalAssignment <em>Signal Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Assignment</em>'.
	 * @see de.oaam.model.oaam.mapping.SignalAssignment
	 * @generated
	 */
	EClass getSignalAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.SignalAssignment#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see de.oaam.model.oaam.mapping.SignalAssignment#getSegments()
	 * @see #getSignalAssignment()
	 * @generated
	 */
	EReference getSignalAssignment_Segments();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.SignalAssignment#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see de.oaam.model.oaam.mapping.SignalAssignment#getSignal()
	 * @see #getSignalAssignment()
	 * @generated
	 */
	EReference getSignalAssignment_Signal();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.ConnectionAssignment <em>Connection Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Assignment</em>'.
	 * @see de.oaam.model.oaam.mapping.ConnectionAssignment
	 * @generated
	 */
	EClass getConnectionAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.ConnectionAssignment#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see de.oaam.model.oaam.mapping.ConnectionAssignment#getSegments()
	 * @see #getConnectionAssignment()
	 * @generated
	 */
	EReference getConnectionAssignment_Segments();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.ConnectionAssignment#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see de.oaam.model.oaam.mapping.ConnectionAssignment#getConnection()
	 * @see #getConnectionAssignment()
	 * @generated
	 */
	EReference getConnectionAssignment_Connection();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment <em>Signal Assignment Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Assignment Segment</em>'.
	 * @see de.oaam.model.oaam.mapping.SignalAssignmentSegment
	 * @generated
	 */
	EClass getSignalAssignmentSegment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.mapping.SignalAssignmentSegment#getCapability()
	 * @see #getSignalAssignmentSegment()
	 * @generated
	 */
	EReference getSignalAssignmentSegment_Capability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see de.oaam.model.oaam.mapping.SignalAssignmentSegment#getDevice()
	 * @see #getSignalAssignmentSegment()
	 * @generated
	 */
	EReference getSignalAssignmentSegment_Device();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.SignalAssignmentSegment#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see de.oaam.model.oaam.mapping.SignalAssignmentSegment#getConnection()
	 * @see #getSignalAssignmentSegment()
	 * @generated
	 */
	EReference getSignalAssignmentSegment_Connection();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.DeviceAssignment <em>Device Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Assignment</em>'.
	 * @see de.oaam.model.oaam.mapping.DeviceAssignment
	 * @generated
	 */
	EClass getDeviceAssignment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.DeviceAssignment#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see de.oaam.model.oaam.mapping.DeviceAssignment#getDevice()
	 * @see #getDeviceAssignment()
	 * @generated
	 */
	EReference getDeviceAssignment_Device();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.DeviceAssignment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.oaam.model.oaam.mapping.DeviceAssignment#getLocation()
	 * @see #getDeviceAssignment()
	 * @generated
	 */
	EReference getDeviceAssignment_Location();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.DeviceAssignment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.mapping.DeviceAssignment#getCapability()
	 * @see #getDeviceAssignment()
	 * @generated
	 */
	EReference getDeviceAssignment_Capability();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment <em>Connection Assignment Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Assignment Segment</em>'.
	 * @see de.oaam.model.oaam.mapping.ConnectionAssignmentSegment
	 * @generated
	 */
	EClass getConnectionAssignmentSegment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getCapability()
	 * @see #getConnectionAssignmentSegment()
	 * @generated
	 */
	EReference getConnectionAssignmentSegment_Capability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getLocation()
	 * @see #getConnectionAssignmentSegment()
	 * @generated
	 */
	EReference getConnectionAssignmentSegment_Location();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getDuct <em>Duct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duct</em>'.
	 * @see de.oaam.model.oaam.mapping.ConnectionAssignmentSegment#getDuct()
	 * @see #getConnectionAssignmentSegment()
	 * @generated
	 */
	EReference getConnectionAssignmentSegment_Duct();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.SubDeviceAssignment <em>Sub Device Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Device Assignment</em>'.
	 * @see de.oaam.model.oaam.mapping.SubDeviceAssignment
	 * @generated
	 */
	EClass getSubDeviceAssignment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.SubDeviceAssignment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.mapping.SubDeviceAssignment#getCapability()
	 * @see #getSubDeviceAssignment()
	 * @generated
	 */
	EReference getSubDeviceAssignment_Capability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.SubDeviceAssignment#getSubDevice <em>Sub Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Device</em>'.
	 * @see de.oaam.model.oaam.mapping.SubDeviceAssignment#getSubDevice()
	 * @see #getSubDeviceAssignment()
	 * @generated
	 */
	EReference getSubDeviceAssignment_SubDevice();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.mapping.SubDeviceAssignment#getTargetDevice <em>Target Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Device</em>'.
	 * @see de.oaam.model.oaam.mapping.SubDeviceAssignment#getTargetDevice()
	 * @see #getSubDeviceAssignment()
	 * @generated
	 */
	EReference getSubDeviceAssignment_TargetDevice();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see de.oaam.model.oaam.mapping.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.Supmapping <em>Supmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supmapping</em>'.
	 * @see de.oaam.model.oaam.mapping.Supmapping
	 * @generated
	 */
	EClass getSupmapping();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see de.oaam.model.oaam.mapping.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.mapping.Schedule#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see de.oaam.model.oaam.mapping.Schedule#getRate()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Rate();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.mapping.Schedule#isIsPeriodic <em>Is Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Periodic</em>'.
	 * @see de.oaam.model.oaam.mapping.Schedule#isIsPeriodic()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_IsPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.mapping.Schedule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.oaam.model.oaam.mapping.Schedule#getPriority()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.mapping.Schedule#getScheduledTimes <em>Scheduled Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduled Times</em>'.
	 * @see de.oaam.model.oaam.mapping.Schedule#getScheduledTimes()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_ScheduledTimes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.mapping.ScheduledTime <em>Scheduled Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Time</em>'.
	 * @see de.oaam.model.oaam.mapping.ScheduledTime
	 * @generated
	 */
	EClass getScheduledTime();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.mapping.ScheduledTime#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle</em>'.
	 * @see de.oaam.model.oaam.mapping.ScheduledTime#getCycle()
	 * @see #getScheduledTime()
	 * @generated
	 */
	EAttribute getScheduledTime_Cycle();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.mapping.ScheduledTime#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see de.oaam.model.oaam.mapping.ScheduledTime#getStartTime()
	 * @see #getScheduledTime()
	 * @generated
	 */
	EAttribute getScheduledTime_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.mapping.ScheduledTime#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.oaam.model.oaam.mapping.ScheduledTime#getDuration()
	 * @see #getScheduledTime()
	 * @generated
	 */
	EAttribute getScheduledTime_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.mapping.ScheduledTime#isRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see de.oaam.model.oaam.mapping.ScheduledTime#isRestart()
	 * @see #getScheduledTime()
	 * @generated
	 */
	EAttribute getScheduledTime_Restart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.MappingContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.MappingContainerAImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getMappingContainerA()
		 * @generated
		 */
		EClass MAPPING_CONTAINER_A = eINSTANCE.getMappingContainerA();

		/**
		 * The meta object literal for the '<em><b>Device Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS = eINSTANCE.getMappingContainerA_DeviceAssignments();

		/**
		 * The meta object literal for the '<em><b>Sub Device Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS = eINSTANCE.getMappingContainerA_SubDeviceAssignments();

		/**
		 * The meta object literal for the '<em><b>Connection Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS = eINSTANCE.getMappingContainerA_ConnectionAssignments();

		/**
		 * The meta object literal for the '<em><b>Task Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER_A__TASK_ASSIGNMENTS = eINSTANCE.getMappingContainerA_TaskAssignments();

		/**
		 * The meta object literal for the '<em><b>Signal Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS = eINSTANCE.getMappingContainerA_SignalAssignments();

		/**
		 * The meta object literal for the '<em><b>Supmapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER_A__SUPMAPPING = eINSTANCE.getMappingContainerA_Supmapping();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.TaskAssignmentImpl <em>Task Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.TaskAssignmentImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getTaskAssignment()
		 * @generated
		 */
		EClass TASK_ASSIGNMENT = eINSTANCE.getTaskAssignment();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ASSIGNMENT__CAPABILITY = eINSTANCE.getTaskAssignment_Capability();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ASSIGNMENT__TASK = eINSTANCE.getTaskAssignment_Task();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ASSIGNMENT__DEVICE = eINSTANCE.getTaskAssignment_Device();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ASSIGNMENT__SCHEDULE = eINSTANCE.getTaskAssignment_Schedule();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.SignalAssignmentImpl <em>Signal Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.SignalAssignmentImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSignalAssignment()
		 * @generated
		 */
		EClass SIGNAL_ASSIGNMENT = eINSTANCE.getSignalAssignment();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ASSIGNMENT__SEGMENTS = eINSTANCE.getSignalAssignment_Segments();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ASSIGNMENT__SIGNAL = eINSTANCE.getSignalAssignment_Signal();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.ConnectionAssignmentImpl <em>Connection Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.ConnectionAssignmentImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getConnectionAssignment()
		 * @generated
		 */
		EClass CONNECTION_ASSIGNMENT = eINSTANCE.getConnectionAssignment();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ASSIGNMENT__SEGMENTS = eINSTANCE.getConnectionAssignment_Segments();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ASSIGNMENT__CONNECTION = eINSTANCE.getConnectionAssignment_Connection();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.SignalAssignmentSegmentImpl <em>Signal Assignment Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.SignalAssignmentSegmentImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSignalAssignmentSegment()
		 * @generated
		 */
		EClass SIGNAL_ASSIGNMENT_SEGMENT = eINSTANCE.getSignalAssignmentSegment();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ASSIGNMENT_SEGMENT__CAPABILITY = eINSTANCE.getSignalAssignmentSegment_Capability();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ASSIGNMENT_SEGMENT__DEVICE = eINSTANCE.getSignalAssignmentSegment_Device();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ASSIGNMENT_SEGMENT__CONNECTION = eINSTANCE.getSignalAssignmentSegment_Connection();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.DeviceAssignmentImpl <em>Device Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.DeviceAssignmentImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getDeviceAssignment()
		 * @generated
		 */
		EClass DEVICE_ASSIGNMENT = eINSTANCE.getDeviceAssignment();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ASSIGNMENT__DEVICE = eINSTANCE.getDeviceAssignment_Device();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ASSIGNMENT__LOCATION = eINSTANCE.getDeviceAssignment_Location();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ASSIGNMENT__CAPABILITY = eINSTANCE.getDeviceAssignment_Capability();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.ConnectionAssignmentSegmentImpl <em>Connection Assignment Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.ConnectionAssignmentSegmentImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getConnectionAssignmentSegment()
		 * @generated
		 */
		EClass CONNECTION_ASSIGNMENT_SEGMENT = eINSTANCE.getConnectionAssignmentSegment();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY = eINSTANCE.getConnectionAssignmentSegment_Capability();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ASSIGNMENT_SEGMENT__LOCATION = eINSTANCE.getConnectionAssignmentSegment_Location();

		/**
		 * The meta object literal for the '<em><b>Duct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ASSIGNMENT_SEGMENT__DUCT = eINSTANCE.getConnectionAssignmentSegment_Duct();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.SubDeviceAssignmentImpl <em>Sub Device Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.SubDeviceAssignmentImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSubDeviceAssignment()
		 * @generated
		 */
		EClass SUB_DEVICE_ASSIGNMENT = eINSTANCE.getSubDeviceAssignment();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_DEVICE_ASSIGNMENT__CAPABILITY = eINSTANCE.getSubDeviceAssignment_Capability();

		/**
		 * The meta object literal for the '<em><b>Sub Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_DEVICE_ASSIGNMENT__SUB_DEVICE = eINSTANCE.getSubDeviceAssignment_SubDevice();

		/**
		 * The meta object literal for the '<em><b>Target Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_DEVICE_ASSIGNMENT__TARGET_DEVICE = eINSTANCE.getSubDeviceAssignment_TargetDevice();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.MappingImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.SupmappingImpl <em>Supmapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.SupmappingImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSupmapping()
		 * @generated
		 */
		EClass SUPMAPPING = eINSTANCE.getSupmapping();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.ScheduleImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__RATE = eINSTANCE.getSchedule_Rate();

		/**
		 * The meta object literal for the '<em><b>Is Periodic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__IS_PERIODIC = eINSTANCE.getSchedule_IsPeriodic();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__PRIORITY = eINSTANCE.getSchedule_Priority();

		/**
		 * The meta object literal for the '<em><b>Scheduled Times</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__SCHEDULED_TIMES = eINSTANCE.getSchedule_ScheduledTimes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.mapping.impl.ScheduledTimeImpl <em>Scheduled Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.mapping.impl.ScheduledTimeImpl
		 * @see de.oaam.model.oaam.mapping.impl.MappingPackageImpl#getScheduledTime()
		 * @generated
		 */
		EClass SCHEDULED_TIME = eINSTANCE.getScheduledTime();

		/**
		 * The meta object literal for the '<em><b>Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_TIME__CYCLE = eINSTANCE.getScheduledTime_Cycle();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_TIME__START_TIME = eINSTANCE.getScheduledTime_StartTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_TIME__DURATION = eINSTANCE.getScheduledTime_Duration();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_TIME__RESTART = eINSTANCE.getScheduledTime_Restart();

	}

} //MappingPackage
