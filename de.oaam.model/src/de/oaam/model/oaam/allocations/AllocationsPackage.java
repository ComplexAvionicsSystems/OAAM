/**
 */
package de.oaam.model.oaam.allocations;

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
 * @see de.oaam.model.oaam.allocations.AllocationsFactory
 * @model kind="package"
 * @generated
 */
public interface AllocationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "allocations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v140/allocations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.allocations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationsPackage eINSTANCE = de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getAllocationsContainerA()
	 * @generated
	 */
	int ALLOCATIONS_CONTAINER_A = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subdevice Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Signal Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Suballocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subconnection Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_CONTAINER_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.TaskAssignmentImpl <em>Task Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.TaskAssignmentImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getTaskAssignment()
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
	int TASK_ASSIGNMENT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__CAPABILITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__TASK = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__DEVICE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schedules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT__SCHEDULES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Task Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Task Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASSIGNMENT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.SignalAssignmentImpl <em>Signal Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.SignalAssignmentImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSignalAssignment()
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
	int SIGNAL_ASSIGNMENT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__SEGMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT__SIGNAL = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signal Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Signal Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.ConnectionAssignmentImpl <em>Connection Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.ConnectionAssignmentImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getConnectionAssignment()
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
	int CONNECTION_ASSIGNMENT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__SEGMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT__CONNECTION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connection Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connection Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.SignalAssignmentSegmentImpl <em>Signal Assignment Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.SignalAssignmentSegmentImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSignalAssignmentSegment()
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
	int SIGNAL_ASSIGNMENT_SEGMENT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__CAPABILITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__DEVICE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__CONNECTION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schedules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT__SCHEDULES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Signal Assignment Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Signal Assignment Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_SEGMENT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.DeviceAssignmentImpl <em>Device Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.DeviceAssignmentImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getDeviceAssignment()
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
	int DEVICE_ASSIGNMENT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__DEVICE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__LOCATION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT__CAPABILITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Device Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Device Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ASSIGNMENT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.ConnectionAssignmentSegmentImpl <em>Connection Assignment Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.ConnectionAssignmentSegmentImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getConnectionAssignmentSegment()
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
	int CONNECTION_ASSIGNMENT_SEGMENT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__LOCATION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT__DUCT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connection Assignment Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Connection Assignment Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ASSIGNMENT_SEGMENT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.SubdeviceAssignmentImpl <em>Subdevice Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.SubdeviceAssignmentImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSubdeviceAssignment()
	 * @generated
	 */
	int SUBDEVICE_ASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__CAPABILITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subdevice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__SUBDEVICE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT__TARGET_DEVICE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Subdevice Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Subdevice Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ASSIGNMENT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.SubconnectionAssignmentImpl <em>Subconnection Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.SubconnectionAssignmentImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSubconnectionAssignment()
	 * @generated
	 */
	int SUBCONNECTION_ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__CAPABILITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__SUBCONNECTION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT__TARGET_DEVICE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Subconnection Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Subconnection Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCONNECTION_ASSIGNMENT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.AllocationsImpl <em>Allocations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getAllocations()
	 * @generated
	 */
	int ALLOCATIONS = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__ID = ALLOCATIONS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__NAME = ALLOCATIONS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__STYLE = ALLOCATIONS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__ATTRIBUTES = ALLOCATIONS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__DOCUMENTATION = ALLOCATIONS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__MODIFIED = ALLOCATIONS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__MODIFIER = ALLOCATIONS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__TRACE_LINK = ALLOCATIONS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__DEVICE_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Subdevice Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__SUBDEVICE_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Connection Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__CONNECTION_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Task Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__TASK_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Signal Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__SIGNAL_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Suballocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__SUBALLOCATIONS = ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Subconnection Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS__SUBCONNECTION_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS;

	/**
	 * The number of structural features of the '<em>Allocations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_FEATURE_COUNT = ALLOCATIONS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allocations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONS_OPERATION_COUNT = ALLOCATIONS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.SuballocationsImpl <em>Suballocations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.SuballocationsImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSuballocations()
	 * @generated
	 */
	int SUBALLOCATIONS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__ID = ALLOCATIONS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__NAME = ALLOCATIONS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__STYLE = ALLOCATIONS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__ATTRIBUTES = ALLOCATIONS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__DOCUMENTATION = ALLOCATIONS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__MODIFIED = ALLOCATIONS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__MODIFIER = ALLOCATIONS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__TRACE_LINK = ALLOCATIONS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__DEVICE_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Subdevice Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__SUBDEVICE_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Connection Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__CONNECTION_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Task Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__TASK_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Signal Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__SIGNAL_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Suballocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__SUBALLOCATIONS = ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Subconnection Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__SUBCONNECTION_ASSIGNMENTS = ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__OPERATION_MODES = ALLOCATIONS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS__VARIANTS = ALLOCATIONS_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Suballocations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS_FEATURE_COUNT = ALLOCATIONS_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Suballocations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBALLOCATIONS_OPERATION_COUNT = ALLOCATIONS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.ScheduleImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__RATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__IS_PERIODIC = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__PRIORITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scheduled Times</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__SCHEDULED_TIMES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.allocations.impl.ScheduledTimeImpl <em>Scheduled Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.allocations.impl.ScheduledTimeImpl
	 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getScheduledTime()
	 * @generated
	 */
	int SCHEDULED_TIME = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__CYCLE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__START_TIME = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__DURATION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME__RESTART = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Scheduled Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Scheduled Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TIME_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.AllocationsContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.allocations.AllocationsContainerA
	 * @generated
	 */
	EClass getAllocationsContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getDeviceAssignments <em>Device Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Assignments</em>'.
	 * @see de.oaam.model.oaam.allocations.AllocationsContainerA#getDeviceAssignments()
	 * @see #getAllocationsContainerA()
	 * @generated
	 */
	EReference getAllocationsContainerA_DeviceAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getSubdeviceAssignments <em>Subdevice Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subdevice Assignments</em>'.
	 * @see de.oaam.model.oaam.allocations.AllocationsContainerA#getSubdeviceAssignments()
	 * @see #getAllocationsContainerA()
	 * @generated
	 */
	EReference getAllocationsContainerA_SubdeviceAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getConnectionAssignments <em>Connection Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Assignments</em>'.
	 * @see de.oaam.model.oaam.allocations.AllocationsContainerA#getConnectionAssignments()
	 * @see #getAllocationsContainerA()
	 * @generated
	 */
	EReference getAllocationsContainerA_ConnectionAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getTaskAssignments <em>Task Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Assignments</em>'.
	 * @see de.oaam.model.oaam.allocations.AllocationsContainerA#getTaskAssignments()
	 * @see #getAllocationsContainerA()
	 * @generated
	 */
	EReference getAllocationsContainerA_TaskAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getSignalAssignments <em>Signal Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Assignments</em>'.
	 * @see de.oaam.model.oaam.allocations.AllocationsContainerA#getSignalAssignments()
	 * @see #getAllocationsContainerA()
	 * @generated
	 */
	EReference getAllocationsContainerA_SignalAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getSuballocations <em>Suballocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suballocations</em>'.
	 * @see de.oaam.model.oaam.allocations.AllocationsContainerA#getSuballocations()
	 * @see #getAllocationsContainerA()
	 * @generated
	 */
	EReference getAllocationsContainerA_Suballocations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.AllocationsContainerA#getSubconnectionAssignments <em>Subconnection Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subconnection Assignments</em>'.
	 * @see de.oaam.model.oaam.allocations.AllocationsContainerA#getSubconnectionAssignments()
	 * @see #getAllocationsContainerA()
	 * @generated
	 */
	EReference getAllocationsContainerA_SubconnectionAssignments();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.TaskAssignment <em>Task Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Assignment</em>'.
	 * @see de.oaam.model.oaam.allocations.TaskAssignment
	 * @generated
	 */
	EClass getTaskAssignment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.TaskAssignment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.allocations.TaskAssignment#getCapability()
	 * @see #getTaskAssignment()
	 * @generated
	 */
	EReference getTaskAssignment_Capability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.TaskAssignment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see de.oaam.model.oaam.allocations.TaskAssignment#getTask()
	 * @see #getTaskAssignment()
	 * @generated
	 */
	EReference getTaskAssignment_Task();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.TaskAssignment#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see de.oaam.model.oaam.allocations.TaskAssignment#getDevice()
	 * @see #getTaskAssignment()
	 * @generated
	 */
	EReference getTaskAssignment_Device();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.TaskAssignment#getSchedules <em>Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedules</em>'.
	 * @see de.oaam.model.oaam.allocations.TaskAssignment#getSchedules()
	 * @see #getTaskAssignment()
	 * @generated
	 */
	EReference getTaskAssignment_Schedules();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.SignalAssignment <em>Signal Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Assignment</em>'.
	 * @see de.oaam.model.oaam.allocations.SignalAssignment
	 * @generated
	 */
	EClass getSignalAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.SignalAssignment#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see de.oaam.model.oaam.allocations.SignalAssignment#getSegments()
	 * @see #getSignalAssignment()
	 * @generated
	 */
	EReference getSignalAssignment_Segments();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SignalAssignment#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see de.oaam.model.oaam.allocations.SignalAssignment#getSignal()
	 * @see #getSignalAssignment()
	 * @generated
	 */
	EReference getSignalAssignment_Signal();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.ConnectionAssignment <em>Connection Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Assignment</em>'.
	 * @see de.oaam.model.oaam.allocations.ConnectionAssignment
	 * @generated
	 */
	EClass getConnectionAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.ConnectionAssignment#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see de.oaam.model.oaam.allocations.ConnectionAssignment#getSegments()
	 * @see #getConnectionAssignment()
	 * @generated
	 */
	EReference getConnectionAssignment_Segments();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.ConnectionAssignment#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see de.oaam.model.oaam.allocations.ConnectionAssignment#getConnection()
	 * @see #getConnectionAssignment()
	 * @generated
	 */
	EReference getConnectionAssignment_Connection();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment <em>Signal Assignment Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Assignment Segment</em>'.
	 * @see de.oaam.model.oaam.allocations.SignalAssignmentSegment
	 * @generated
	 */
	EClass getSignalAssignmentSegment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.allocations.SignalAssignmentSegment#getCapability()
	 * @see #getSignalAssignmentSegment()
	 * @generated
	 */
	EReference getSignalAssignmentSegment_Capability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see de.oaam.model.oaam.allocations.SignalAssignmentSegment#getDevice()
	 * @see #getSignalAssignmentSegment()
	 * @generated
	 */
	EReference getSignalAssignmentSegment_Device();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see de.oaam.model.oaam.allocations.SignalAssignmentSegment#getConnection()
	 * @see #getSignalAssignmentSegment()
	 * @generated
	 */
	EReference getSignalAssignmentSegment_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getSchedules <em>Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedules</em>'.
	 * @see de.oaam.model.oaam.allocations.SignalAssignmentSegment#getSchedules()
	 * @see #getSignalAssignmentSegment()
	 * @generated
	 */
	EReference getSignalAssignmentSegment_Schedules();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.DeviceAssignment <em>Device Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Assignment</em>'.
	 * @see de.oaam.model.oaam.allocations.DeviceAssignment
	 * @generated
	 */
	EClass getDeviceAssignment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.DeviceAssignment#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see de.oaam.model.oaam.allocations.DeviceAssignment#getDevice()
	 * @see #getDeviceAssignment()
	 * @generated
	 */
	EReference getDeviceAssignment_Device();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.DeviceAssignment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.oaam.model.oaam.allocations.DeviceAssignment#getLocation()
	 * @see #getDeviceAssignment()
	 * @generated
	 */
	EReference getDeviceAssignment_Location();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.DeviceAssignment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.allocations.DeviceAssignment#getCapability()
	 * @see #getDeviceAssignment()
	 * @generated
	 */
	EReference getDeviceAssignment_Capability();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.ConnectionAssignmentSegment <em>Connection Assignment Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Assignment Segment</em>'.
	 * @see de.oaam.model.oaam.allocations.ConnectionAssignmentSegment
	 * @generated
	 */
	EClass getConnectionAssignmentSegment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.ConnectionAssignmentSegment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.allocations.ConnectionAssignmentSegment#getCapability()
	 * @see #getConnectionAssignmentSegment()
	 * @generated
	 */
	EReference getConnectionAssignmentSegment_Capability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.ConnectionAssignmentSegment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.oaam.model.oaam.allocations.ConnectionAssignmentSegment#getLocation()
	 * @see #getConnectionAssignmentSegment()
	 * @generated
	 */
	EReference getConnectionAssignmentSegment_Location();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.ConnectionAssignmentSegment#getDuct <em>Duct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duct</em>'.
	 * @see de.oaam.model.oaam.allocations.ConnectionAssignmentSegment#getDuct()
	 * @see #getConnectionAssignmentSegment()
	 * @generated
	 */
	EReference getConnectionAssignmentSegment_Duct();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.SubdeviceAssignment <em>Subdevice Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subdevice Assignment</em>'.
	 * @see de.oaam.model.oaam.allocations.SubdeviceAssignment
	 * @generated
	 */
	EClass getSubdeviceAssignment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SubdeviceAssignment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.allocations.SubdeviceAssignment#getCapability()
	 * @see #getSubdeviceAssignment()
	 * @generated
	 */
	EReference getSubdeviceAssignment_Capability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SubdeviceAssignment#getSubdevice <em>Subdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subdevice</em>'.
	 * @see de.oaam.model.oaam.allocations.SubdeviceAssignment#getSubdevice()
	 * @see #getSubdeviceAssignment()
	 * @generated
	 */
	EReference getSubdeviceAssignment_Subdevice();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SubdeviceAssignment#getTargetDevice <em>Target Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Device</em>'.
	 * @see de.oaam.model.oaam.allocations.SubdeviceAssignment#getTargetDevice()
	 * @see #getSubdeviceAssignment()
	 * @generated
	 */
	EReference getSubdeviceAssignment_TargetDevice();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.SubconnectionAssignment <em>Subconnection Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subconnection Assignment</em>'.
	 * @see de.oaam.model.oaam.allocations.SubconnectionAssignment
	 * @generated
	 */
	EClass getSubconnectionAssignment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SubconnectionAssignment#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see de.oaam.model.oaam.allocations.SubconnectionAssignment#getCapability()
	 * @see #getSubconnectionAssignment()
	 * @generated
	 */
	EReference getSubconnectionAssignment_Capability();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SubconnectionAssignment#getSubconnection <em>Subconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subconnection</em>'.
	 * @see de.oaam.model.oaam.allocations.SubconnectionAssignment#getSubconnection()
	 * @see #getSubconnectionAssignment()
	 * @generated
	 */
	EReference getSubconnectionAssignment_Subconnection();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.allocations.SubconnectionAssignment#getTargetDevice <em>Target Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Device</em>'.
	 * @see de.oaam.model.oaam.allocations.SubconnectionAssignment#getTargetDevice()
	 * @see #getSubconnectionAssignment()
	 * @generated
	 */
	EReference getSubconnectionAssignment_TargetDevice();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.Allocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocations</em>'.
	 * @see de.oaam.model.oaam.allocations.Allocations
	 * @generated
	 */
	EClass getAllocations();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.Suballocations <em>Suballocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suballocations</em>'.
	 * @see de.oaam.model.oaam.allocations.Suballocations
	 * @generated
	 */
	EClass getSuballocations();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see de.oaam.model.oaam.allocations.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.allocations.Schedule#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see de.oaam.model.oaam.allocations.Schedule#getRate()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Rate();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.allocations.Schedule#isIsPeriodic <em>Is Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Periodic</em>'.
	 * @see de.oaam.model.oaam.allocations.Schedule#isIsPeriodic()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_IsPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.allocations.Schedule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.oaam.model.oaam.allocations.Schedule#getPriority()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.allocations.Schedule#getScheduledTimes <em>Scheduled Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduled Times</em>'.
	 * @see de.oaam.model.oaam.allocations.Schedule#getScheduledTimes()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_ScheduledTimes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.allocations.ScheduledTime <em>Scheduled Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Time</em>'.
	 * @see de.oaam.model.oaam.allocations.ScheduledTime
	 * @generated
	 */
	EClass getScheduledTime();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.allocations.ScheduledTime#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle</em>'.
	 * @see de.oaam.model.oaam.allocations.ScheduledTime#getCycle()
	 * @see #getScheduledTime()
	 * @generated
	 */
	EAttribute getScheduledTime_Cycle();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.allocations.ScheduledTime#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see de.oaam.model.oaam.allocations.ScheduledTime#getStartTime()
	 * @see #getScheduledTime()
	 * @generated
	 */
	EAttribute getScheduledTime_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.allocations.ScheduledTime#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.oaam.model.oaam.allocations.ScheduledTime#getDuration()
	 * @see #getScheduledTime()
	 * @generated
	 */
	EAttribute getScheduledTime_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.allocations.ScheduledTime#isRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see de.oaam.model.oaam.allocations.ScheduledTime#isRestart()
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
	AllocationsFactory getAllocationsFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsContainerAImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getAllocationsContainerA()
		 * @generated
		 */
		EClass ALLOCATIONS_CONTAINER_A = eINSTANCE.getAllocationsContainerA();

		/**
		 * The meta object literal for the '<em><b>Device Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS = eINSTANCE.getAllocationsContainerA_DeviceAssignments();

		/**
		 * The meta object literal for the '<em><b>Subdevice Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS = eINSTANCE.getAllocationsContainerA_SubdeviceAssignments();

		/**
		 * The meta object literal for the '<em><b>Connection Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS = eINSTANCE.getAllocationsContainerA_ConnectionAssignments();

		/**
		 * The meta object literal for the '<em><b>Task Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS = eINSTANCE.getAllocationsContainerA_TaskAssignments();

		/**
		 * The meta object literal for the '<em><b>Signal Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS = eINSTANCE.getAllocationsContainerA_SignalAssignments();

		/**
		 * The meta object literal for the '<em><b>Suballocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS = eINSTANCE.getAllocationsContainerA_Suballocations();

		/**
		 * The meta object literal for the '<em><b>Subconnection Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS = eINSTANCE.getAllocationsContainerA_SubconnectionAssignments();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.TaskAssignmentImpl <em>Task Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.TaskAssignmentImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getTaskAssignment()
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
		 * The meta object literal for the '<em><b>Schedules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ASSIGNMENT__SCHEDULES = eINSTANCE.getTaskAssignment_Schedules();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.SignalAssignmentImpl <em>Signal Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.SignalAssignmentImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSignalAssignment()
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
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.ConnectionAssignmentImpl <em>Connection Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.ConnectionAssignmentImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getConnectionAssignment()
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
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.SignalAssignmentSegmentImpl <em>Signal Assignment Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.SignalAssignmentSegmentImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSignalAssignmentSegment()
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
		 * The meta object literal for the '<em><b>Schedules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ASSIGNMENT_SEGMENT__SCHEDULES = eINSTANCE.getSignalAssignmentSegment_Schedules();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.DeviceAssignmentImpl <em>Device Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.DeviceAssignmentImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getDeviceAssignment()
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
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.ConnectionAssignmentSegmentImpl <em>Connection Assignment Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.ConnectionAssignmentSegmentImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getConnectionAssignmentSegment()
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
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.SubdeviceAssignmentImpl <em>Subdevice Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.SubdeviceAssignmentImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSubdeviceAssignment()
		 * @generated
		 */
		EClass SUBDEVICE_ASSIGNMENT = eINSTANCE.getSubdeviceAssignment();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_ASSIGNMENT__CAPABILITY = eINSTANCE.getSubdeviceAssignment_Capability();

		/**
		 * The meta object literal for the '<em><b>Subdevice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_ASSIGNMENT__SUBDEVICE = eINSTANCE.getSubdeviceAssignment_Subdevice();

		/**
		 * The meta object literal for the '<em><b>Target Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_ASSIGNMENT__TARGET_DEVICE = eINSTANCE.getSubdeviceAssignment_TargetDevice();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.SubconnectionAssignmentImpl <em>Subconnection Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.SubconnectionAssignmentImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSubconnectionAssignment()
		 * @generated
		 */
		EClass SUBCONNECTION_ASSIGNMENT = eINSTANCE.getSubconnectionAssignment();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCONNECTION_ASSIGNMENT__CAPABILITY = eINSTANCE.getSubconnectionAssignment_Capability();

		/**
		 * The meta object literal for the '<em><b>Subconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCONNECTION_ASSIGNMENT__SUBCONNECTION = eINSTANCE.getSubconnectionAssignment_Subconnection();

		/**
		 * The meta object literal for the '<em><b>Target Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCONNECTION_ASSIGNMENT__TARGET_DEVICE = eINSTANCE.getSubconnectionAssignment_TargetDevice();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.AllocationsImpl <em>Allocations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getAllocations()
		 * @generated
		 */
		EClass ALLOCATIONS = eINSTANCE.getAllocations();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.SuballocationsImpl <em>Suballocations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.SuballocationsImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSuballocations()
		 * @generated
		 */
		EClass SUBALLOCATIONS = eINSTANCE.getSuballocations();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.ScheduleImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getSchedule()
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
		 * The meta object literal for the '{@link de.oaam.model.oaam.allocations.impl.ScheduledTimeImpl <em>Scheduled Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.allocations.impl.ScheduledTimeImpl
		 * @see de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl#getScheduledTime()
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

} //AllocationsPackage
