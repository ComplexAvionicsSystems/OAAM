/**
 */
package de.oaam.model.oaam.functions;

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
 * Main part of the executable function description, including tasks and data flows.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v140/functions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsPackage eINSTANCE = de.oaam.model.oaam.functions.impl.FunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFunctionsContainerA()
	 * @generated
	 */
	int FUNCTIONS_CONTAINER_A = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASKS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASK_LINKS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Task Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASK_GROUPS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Task Redundancies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__SIGNALS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Failure Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__FAILURE_EVENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subfunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__SUBFUNCTIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.FunctionsImpl <em>Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.FunctionsImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFunctions()
	 * @generated
	 */
	int FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__ID = FUNCTIONS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__NAME = FUNCTIONS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__STYLE = FUNCTIONS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__ATTRIBUTES = FUNCTIONS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__DOCUMENTATION = FUNCTIONS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__MODIFIED = FUNCTIONS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__MODIFIER = FUNCTIONS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TRACE_LINK = FUNCTIONS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__VARIANTS = FUNCTIONS_CONTAINER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__OPERATION_MODES = FUNCTIONS_CONTAINER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASKS = FUNCTIONS_CONTAINER_A__TASKS;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASK_LINKS = FUNCTIONS_CONTAINER_A__TASK_LINKS;

	/**
	 * The feature id for the '<em><b>Task Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASK_GROUPS = FUNCTIONS_CONTAINER_A__TASK_GROUPS;

	/**
	 * The feature id for the '<em><b>Task Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASK_SYMMETRIES = FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Task Redundancies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASK_REDUNDANCIES = FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__SIGNALS = FUNCTIONS_CONTAINER_A__SIGNALS;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__SIGNAL_GROUPS = FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS;

	/**
	 * The feature id for the '<em><b>Failure Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__FAILURE_EVENTS = FUNCTIONS_CONTAINER_A__FAILURE_EVENTS;

	/**
	 * The feature id for the '<em><b>Subfunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__SUBFUNCTIONS = FUNCTIONS_CONTAINER_A__SUBFUNCTIONS;

	/**
	 * The number of structural features of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_FEATURE_COUNT = FUNCTIONS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_OPERATION_COUNT = FUNCTIONS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.TaskImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPLEMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Device Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEVICE_BINDING = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>NParallels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NPARALLELS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FIXED_RATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARAMETERS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.ExternalTaskLinkImpl <em>External Task Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.ExternalTaskLinkImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getExternalTaskLink()
	 * @generated
	 */
	int EXTERNAL_TASK_LINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__INPUTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__OUTPUTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__TASK = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__FILTER = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>External Task Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>External Task Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.TaskGroupImpl <em>Task Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.TaskGroupImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskGroup()
	 * @generated
	 */
	int TASK_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__TASKS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.TaskSymmetryImpl <em>Task Symmetry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.TaskSymmetryImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskSymmetry()
	 * @generated
	 */
	int TASK_SYMMETRY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__TASKS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.TaskRedundancyImpl <em>Task Redundancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.TaskRedundancyImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskRedundancy()
	 * @generated
	 */
	int TASK_REDUNDANCY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__TASKS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Redundancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Redundancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl <em>Failure Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.FailureConditionImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFailureCondition()
	 * @generated
	 */
	int FAILURE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__LOGIC = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Occurrence Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__MAX_OCCURRENCE_PROBABILITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Single Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__NO_SINGLE_FAILURE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Failure Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Failure Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.OutputIntegrityStateImpl <em>Output Integrity State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.OutputIntegrityStateImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getOutputIntegrityState()
	 * @generated
	 */
	int OUTPUT_INTEGRITY_STATE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__ID = CommonPackage.BOOL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__NAME = CommonPackage.BOOL_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__STYLE = CommonPackage.BOOL_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__ATTRIBUTES = CommonPackage.BOOL_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__DOCUMENTATION = CommonPackage.BOOL_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__MODIFIED = CommonPackage.BOOL_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__MODIFIER = CommonPackage.BOOL_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__TRACE_LINK = CommonPackage.BOOL_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__OPERATION_MODES = CommonPackage.BOOL_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__VARIANTS = CommonPackage.BOOL_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__STATE = CommonPackage.BOOL_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE__OUTPUT = CommonPackage.BOOL_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Output Integrity State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE_FEATURE_COUNT = CommonPackage.BOOL_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Output Integrity State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTEGRITY_STATE_OPERATION_COUNT = CommonPackage.BOOL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.SignalImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SOURCE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TARGET = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TYPE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>In Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__IN_INDEX = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Out Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OUT_INDEX = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connection Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__CONNECTION_BINDING = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.SignalGroupImpl <em>Signal Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.SignalGroupImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSignalGroup()
	 * @generated
	 */
	int SIGNAL_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__SIGNALS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.InputImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DECLARATION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IMPLEMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Io Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IO_BINDINGS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__QUEUE_LENGTH = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OUTPUT_LINK = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.OutputImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IMPLEMENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DECLARATION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Io Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IO_BINDINGS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__FIXED_RATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.ExternalOutputLinkImpl <em>External Output Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.ExternalOutputLinkImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getExternalOutputLink()
	 * @generated
	 */
	int EXTERNAL_OUTPUT_LINK = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__OUTPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__FILTER = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>External Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>External Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.SubfunctionsImpl <em>Subfunctions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.SubfunctionsImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSubfunctions()
	 * @generated
	 */
	int SUBFUNCTIONS = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__ID = FUNCTIONS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__NAME = FUNCTIONS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__STYLE = FUNCTIONS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__ATTRIBUTES = FUNCTIONS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__DOCUMENTATION = FUNCTIONS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__MODIFIED = FUNCTIONS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__MODIFIER = FUNCTIONS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__TRACE_LINK = FUNCTIONS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__VARIANTS = FUNCTIONS_CONTAINER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__OPERATION_MODES = FUNCTIONS_CONTAINER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__TASKS = FUNCTIONS_CONTAINER_A__TASKS;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__TASK_LINKS = FUNCTIONS_CONTAINER_A__TASK_LINKS;

	/**
	 * The feature id for the '<em><b>Task Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__TASK_GROUPS = FUNCTIONS_CONTAINER_A__TASK_GROUPS;

	/**
	 * The feature id for the '<em><b>Task Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__TASK_SYMMETRIES = FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Task Redundancies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__TASK_REDUNDANCIES = FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__SIGNALS = FUNCTIONS_CONTAINER_A__SIGNALS;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__SIGNAL_GROUPS = FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS;

	/**
	 * The feature id for the '<em><b>Failure Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__FAILURE_EVENTS = FUNCTIONS_CONTAINER_A__FAILURE_EVENTS;

	/**
	 * The feature id for the '<em><b>Subfunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__SUBFUNCTIONS = FUNCTIONS_CONTAINER_A__SUBFUNCTIONS;

	/**
	 * The feature id for the '<em><b>Multiplicity Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__MULTIPLICITY_MIN = FUNCTIONS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS__MULTIPLICITY_MAX = FUNCTIONS_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subfunctions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS_FEATURE_COUNT = FUNCTIONS_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subfunctions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTIONS_OPERATION_COUNT = FUNCTIONS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.TaskParameterImpl <em>Task Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.TaskParameterImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskParameter()
	 * @generated
	 */
	int TASK_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__DEFINITION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER__VALUE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PARAMETER_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Functions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functions</em>'.
	 * @see de.oaam.model.oaam.functions.Functions
	 * @generated
	 */
	EClass getFunctions();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.FunctionsContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA
	 * @generated
	 */
	EClass getFunctionsContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTasks()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskLinks <em>Task Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Links</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTaskLinks()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_TaskLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskGroups <em>Task Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Groups</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTaskGroups()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_TaskGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskSymmetries <em>Task Symmetries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Symmetries</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTaskSymmetries()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_TaskSymmetries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskRedundancies <em>Task Redundancies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Redundancies</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTaskRedundancies()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_TaskRedundancies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getSignals()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_Signals();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getSignalGroups <em>Signal Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Groups</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getSignalGroups()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_SignalGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getFailureEvents <em>Failure Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Events</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getFailureEvents()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_FailureEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getSubfunctions <em>Subfunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subfunctions</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getSubfunctions()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_Subfunctions();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see de.oaam.model.oaam.functions.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Task#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getType()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getInputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.Task#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getOutputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outputs();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Task#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getImplements()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Implements();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Task#getDeviceBinding <em>Device Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Binding</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getDeviceBinding()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_DeviceBinding();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Task#getNParallels <em>NParallels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NParallels</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getNParallels()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_NParallels();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Task#getFixedRate <em>Fixed Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Rate</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getFixedRate()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_FixedRate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.Task#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getParameters()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Parameters();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.ExternalTaskLink <em>External Task Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Task Link</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink
	 * @generated
	 */
	EClass getExternalTaskLink();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getType()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EReference getExternalTaskLink_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getInputs()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EReference getExternalTaskLink_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getOutputs()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EReference getExternalTaskLink_Outputs();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getTask()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EReference getExternalTaskLink_Task();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getFilter()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EAttribute getExternalTaskLink_Filter();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Group</em>'.
	 * @see de.oaam.model.oaam.functions.TaskGroup
	 * @generated
	 */
	EClass getTaskGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.TaskGroup#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.functions.TaskGroup#getTasks()
	 * @see #getTaskGroup()
	 * @generated
	 */
	EReference getTaskGroup_Tasks();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.TaskSymmetry <em>Task Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Symmetry</em>'.
	 * @see de.oaam.model.oaam.functions.TaskSymmetry
	 * @generated
	 */
	EClass getTaskSymmetry();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.TaskSymmetry#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.functions.TaskSymmetry#getTasks()
	 * @see #getTaskSymmetry()
	 * @generated
	 */
	EReference getTaskSymmetry_Tasks();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.TaskRedundancy <em>Task Redundancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Redundancy</em>'.
	 * @see de.oaam.model.oaam.functions.TaskRedundancy
	 * @generated
	 */
	EClass getTaskRedundancy();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.TaskRedundancy#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.functions.TaskRedundancy#getTasks()
	 * @see #getTaskRedundancy()
	 * @generated
	 */
	EReference getTaskRedundancy_Tasks();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.FailureCondition <em>Failure Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Condition</em>'.
	 * @see de.oaam.model.oaam.functions.FailureCondition
	 * @generated
	 */
	EClass getFailureCondition();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.functions.FailureCondition#getLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logic</em>'.
	 * @see de.oaam.model.oaam.functions.FailureCondition#getLogic()
	 * @see #getFailureCondition()
	 * @generated
	 */
	EReference getFailureCondition_Logic();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.FailureCondition#getMaxOccurrenceProbability <em>Max Occurrence Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurrence Probability</em>'.
	 * @see de.oaam.model.oaam.functions.FailureCondition#getMaxOccurrenceProbability()
	 * @see #getFailureCondition()
	 * @generated
	 */
	EAttribute getFailureCondition_MaxOccurrenceProbability();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.FailureCondition#isNoSingleFailure <em>No Single Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Single Failure</em>'.
	 * @see de.oaam.model.oaam.functions.FailureCondition#isNoSingleFailure()
	 * @see #getFailureCondition()
	 * @generated
	 */
	EAttribute getFailureCondition_NoSingleFailure();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.OutputIntegrityState <em>Output Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Integrity State</em>'.
	 * @see de.oaam.model.oaam.functions.OutputIntegrityState
	 * @generated
	 */
	EClass getOutputIntegrityState();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.OutputIntegrityState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.oaam.model.oaam.functions.OutputIntegrityState#getState()
	 * @see #getOutputIntegrityState()
	 * @generated
	 */
	EAttribute getOutputIntegrityState_State();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.OutputIntegrityState#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see de.oaam.model.oaam.functions.OutputIntegrityState#getOutput()
	 * @see #getOutputIntegrityState()
	 * @generated
	 */
	EReference getOutputIntegrityState_Output();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see de.oaam.model.oaam.functions.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Signal#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getSource()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Source();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Signal#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getTarget()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Target();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Signal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getType()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Signal#getInIndex <em>In Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Index</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getInIndex()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_InIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Signal#getOutIndex <em>Out Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Index</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getOutIndex()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_OutIndex();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Signal#getConnectionBinding <em>Connection Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Binding</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getConnectionBinding()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_ConnectionBinding();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.SignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Group</em>'.
	 * @see de.oaam.model.oaam.functions.SignalGroup
	 * @generated
	 */
	EClass getSignalGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.SignalGroup#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signals</em>'.
	 * @see de.oaam.model.oaam.functions.SignalGroup#getSignals()
	 * @see #getSignalGroup()
	 * @generated
	 */
	EReference getSignalGroup_Signals();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see de.oaam.model.oaam.functions.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Input#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getDeclaration()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Declaration();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Input#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getImplements()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Implements();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.Input#getIoBindings <em>Io Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Io Bindings</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getIoBindings()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_IoBindings();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Input#getQueueLength <em>Queue Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Length</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getQueueLength()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_QueueLength();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.functions.Input#getOutputLink <em>Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Link</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getOutputLink()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_OutputLink();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see de.oaam.model.oaam.functions.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Output#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see de.oaam.model.oaam.functions.Output#getImplements()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Implements();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Output#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see de.oaam.model.oaam.functions.Output#getDeclaration()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Declaration();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.Output#getIoBindings <em>Io Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Io Bindings</em>'.
	 * @see de.oaam.model.oaam.functions.Output#getIoBindings()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_IoBindings();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Output#getFixedRate <em>Fixed Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Rate</em>'.
	 * @see de.oaam.model.oaam.functions.Output#getFixedRate()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_FixedRate();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.ExternalOutputLink <em>External Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Output Link</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalOutputLink
	 * @generated
	 */
	EClass getExternalOutputLink();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.ExternalOutputLink#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalOutputLink#getOutput()
	 * @see #getExternalOutputLink()
	 * @generated
	 */
	EReference getExternalOutputLink_Output();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.ExternalOutputLink#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalOutputLink#getFilter()
	 * @see #getExternalOutputLink()
	 * @generated
	 */
	EAttribute getExternalOutputLink_Filter();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Subfunctions <em>Subfunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subfunctions</em>'.
	 * @see de.oaam.model.oaam.functions.Subfunctions
	 * @generated
	 */
	EClass getSubfunctions();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Subfunctions#getMultiplicityMin <em>Multiplicity Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Min</em>'.
	 * @see de.oaam.model.oaam.functions.Subfunctions#getMultiplicityMin()
	 * @see #getSubfunctions()
	 * @generated
	 */
	EAttribute getSubfunctions_MultiplicityMin();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Subfunctions#getMultiplicityMax <em>Multiplicity Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Max</em>'.
	 * @see de.oaam.model.oaam.functions.Subfunctions#getMultiplicityMax()
	 * @see #getSubfunctions()
	 * @generated
	 */
	EAttribute getSubfunctions_MultiplicityMax();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.TaskParameter <em>Task Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Parameter</em>'.
	 * @see de.oaam.model.oaam.functions.TaskParameter
	 * @generated
	 */
	EClass getTaskParameter();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.TaskParameter#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see de.oaam.model.oaam.functions.TaskParameter#getDefinition()
	 * @see #getTaskParameter()
	 * @generated
	 */
	EReference getTaskParameter_Definition();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.TaskParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.oaam.model.oaam.functions.TaskParameter#getValue()
	 * @see #getTaskParameter()
	 * @generated
	 */
	EAttribute getTaskParameter_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionsFactory getFunctionsFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.FunctionsImpl <em>Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.FunctionsImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFunctions()
		 * @generated
		 */
		EClass FUNCTIONS = eINSTANCE.getFunctions();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFunctionsContainerA()
		 * @generated
		 */
		EClass FUNCTIONS_CONTAINER_A = eINSTANCE.getFunctionsContainerA();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASKS = eINSTANCE.getFunctionsContainerA_Tasks();

		/**
		 * The meta object literal for the '<em><b>Task Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASK_LINKS = eINSTANCE.getFunctionsContainerA_TaskLinks();

		/**
		 * The meta object literal for the '<em><b>Task Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASK_GROUPS = eINSTANCE.getFunctionsContainerA_TaskGroups();

		/**
		 * The meta object literal for the '<em><b>Task Symmetries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES = eINSTANCE.getFunctionsContainerA_TaskSymmetries();

		/**
		 * The meta object literal for the '<em><b>Task Redundancies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES = eINSTANCE.getFunctionsContainerA_TaskRedundancies();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__SIGNALS = eINSTANCE.getFunctionsContainerA_Signals();

		/**
		 * The meta object literal for the '<em><b>Signal Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS = eINSTANCE.getFunctionsContainerA_SignalGroups();

		/**
		 * The meta object literal for the '<em><b>Failure Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__FAILURE_EVENTS = eINSTANCE.getFunctionsContainerA_FailureEvents();

		/**
		 * The meta object literal for the '<em><b>Subfunctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__SUBFUNCTIONS = eINSTANCE.getFunctionsContainerA_Subfunctions();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.TaskImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TYPE = eINSTANCE.getTask_Type();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS = eINSTANCE.getTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUTS = eINSTANCE.getTask_Outputs();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IMPLEMENTS = eINSTANCE.getTask_Implements();

		/**
		 * The meta object literal for the '<em><b>Device Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DEVICE_BINDING = eINSTANCE.getTask_DeviceBinding();

		/**
		 * The meta object literal for the '<em><b>NParallels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NPARALLELS = eINSTANCE.getTask_NParallels();

		/**
		 * The meta object literal for the '<em><b>Fixed Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__FIXED_RATE = eINSTANCE.getTask_FixedRate();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARAMETERS = eINSTANCE.getTask_Parameters();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.ExternalTaskLinkImpl <em>External Task Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.ExternalTaskLinkImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getExternalTaskLink()
		 * @generated
		 */
		EClass EXTERNAL_TASK_LINK = eINSTANCE.getExternalTaskLink();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TASK_LINK__TYPE = eINSTANCE.getExternalTaskLink_Type();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TASK_LINK__INPUTS = eINSTANCE.getExternalTaskLink_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TASK_LINK__OUTPUTS = eINSTANCE.getExternalTaskLink_Outputs();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TASK_LINK__TASK = eINSTANCE.getExternalTaskLink_Task();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_TASK_LINK__FILTER = eINSTANCE.getExternalTaskLink_Filter();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.TaskGroupImpl <em>Task Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.TaskGroupImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskGroup()
		 * @generated
		 */
		EClass TASK_GROUP = eINSTANCE.getTaskGroup();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_GROUP__TASKS = eINSTANCE.getTaskGroup_Tasks();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.TaskSymmetryImpl <em>Task Symmetry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.TaskSymmetryImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskSymmetry()
		 * @generated
		 */
		EClass TASK_SYMMETRY = eINSTANCE.getTaskSymmetry();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SYMMETRY__TASKS = eINSTANCE.getTaskSymmetry_Tasks();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.TaskRedundancyImpl <em>Task Redundancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.TaskRedundancyImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskRedundancy()
		 * @generated
		 */
		EClass TASK_REDUNDANCY = eINSTANCE.getTaskRedundancy();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REDUNDANCY__TASKS = eINSTANCE.getTaskRedundancy_Tasks();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl <em>Failure Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.FailureConditionImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFailureCondition()
		 * @generated
		 */
		EClass FAILURE_CONDITION = eINSTANCE.getFailureCondition();

		/**
		 * The meta object literal for the '<em><b>Logic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_CONDITION__LOGIC = eINSTANCE.getFailureCondition_Logic();

		/**
		 * The meta object literal for the '<em><b>Max Occurrence Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_CONDITION__MAX_OCCURRENCE_PROBABILITY = eINSTANCE.getFailureCondition_MaxOccurrenceProbability();

		/**
		 * The meta object literal for the '<em><b>No Single Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_CONDITION__NO_SINGLE_FAILURE = eINSTANCE.getFailureCondition_NoSingleFailure();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.OutputIntegrityStateImpl <em>Output Integrity State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.OutputIntegrityStateImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getOutputIntegrityState()
		 * @generated
		 */
		EClass OUTPUT_INTEGRITY_STATE = eINSTANCE.getOutputIntegrityState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_INTEGRITY_STATE__STATE = eINSTANCE.getOutputIntegrityState_State();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_INTEGRITY_STATE__OUTPUT = eINSTANCE.getOutputIntegrityState_Output();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.SignalImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__SOURCE = eINSTANCE.getSignal_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__TARGET = eINSTANCE.getSignal_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__TYPE = eINSTANCE.getSignal_Type();

		/**
		 * The meta object literal for the '<em><b>In Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__IN_INDEX = eINSTANCE.getSignal_InIndex();

		/**
		 * The meta object literal for the '<em><b>Out Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__OUT_INDEX = eINSTANCE.getSignal_OutIndex();

		/**
		 * The meta object literal for the '<em><b>Connection Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__CONNECTION_BINDING = eINSTANCE.getSignal_ConnectionBinding();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.SignalGroupImpl <em>Signal Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.SignalGroupImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSignalGroup()
		 * @generated
		 */
		EClass SIGNAL_GROUP = eINSTANCE.getSignalGroup();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_GROUP__SIGNALS = eINSTANCE.getSignalGroup_Signals();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.InputImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__DECLARATION = eINSTANCE.getInput_Declaration();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__IMPLEMENTS = eINSTANCE.getInput_Implements();

		/**
		 * The meta object literal for the '<em><b>Io Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__IO_BINDINGS = eINSTANCE.getInput_IoBindings();

		/**
		 * The meta object literal for the '<em><b>Queue Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__QUEUE_LENGTH = eINSTANCE.getInput_QueueLength();

		/**
		 * The meta object literal for the '<em><b>Output Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__OUTPUT_LINK = eINSTANCE.getInput_OutputLink();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.OutputImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__IMPLEMENTS = eINSTANCE.getOutput_Implements();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__DECLARATION = eINSTANCE.getOutput_Declaration();

		/**
		 * The meta object literal for the '<em><b>Io Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__IO_BINDINGS = eINSTANCE.getOutput_IoBindings();

		/**
		 * The meta object literal for the '<em><b>Fixed Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__FIXED_RATE = eINSTANCE.getOutput_FixedRate();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.ExternalOutputLinkImpl <em>External Output Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.ExternalOutputLinkImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getExternalOutputLink()
		 * @generated
		 */
		EClass EXTERNAL_OUTPUT_LINK = eINSTANCE.getExternalOutputLink();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_OUTPUT_LINK__OUTPUT = eINSTANCE.getExternalOutputLink_Output();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_OUTPUT_LINK__FILTER = eINSTANCE.getExternalOutputLink_Filter();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.SubfunctionsImpl <em>Subfunctions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.SubfunctionsImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSubfunctions()
		 * @generated
		 */
		EClass SUBFUNCTIONS = eINSTANCE.getSubfunctions();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBFUNCTIONS__MULTIPLICITY_MIN = eINSTANCE.getSubfunctions_MultiplicityMin();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBFUNCTIONS__MULTIPLICITY_MAX = eINSTANCE.getSubfunctions_MultiplicityMax();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.TaskParameterImpl <em>Task Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.TaskParameterImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskParameter()
		 * @generated
		 */
		EClass TASK_PARAMETER = eINSTANCE.getTaskParameter();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PARAMETER__DEFINITION = eINSTANCE.getTaskParameter_Definition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PARAMETER__VALUE = eINSTANCE.getTaskParameter_Value();

	}

} //FunctionsPackage
