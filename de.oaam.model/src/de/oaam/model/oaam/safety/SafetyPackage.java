/**
 */
package de.oaam.model.oaam.safety;

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
 * @see de.oaam.model.oaam.safety.SafetyFactory
 * @model kind="package"
 * @generated
 */
public interface SafetyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "safety";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v160/safety";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.safety";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SafetyPackage eINSTANCE = de.oaam.model.oaam.safety.impl.SafetyPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.impl.PartFailureModeImpl <em>Part Failure Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.impl.PartFailureModeImpl
	 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getPartFailureMode()
	 * @generated
	 */
	int PART_FAILURE_MODE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Failure Mode Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__FAILURE_MODE_RATIO = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE__FAILURE_EFFECTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Part Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Part Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FAILURE_MODE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.impl.FailureEffectImpl <em>Failure Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.impl.FailureEffectImpl
	 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFailureEffect()
	 * @generated
	 */
	int FAILURE_EFFECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Propagation Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__PROPAGATION_FAILURE_MODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Propagation Integrity State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__PROPAGATION_INTEGRITY_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failure Effect Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__FAILURE_EFFECT_PROBABILITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Propagates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__PROPAGATES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Failure Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Failure Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.impl.FaultPropagationImpl <em>Fault Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.impl.FaultPropagationImpl
	 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFaultPropagation()
	 * @generated
	 */
	int FAULT_PROPAGATION = 2;

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
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.impl.FailureProviderAImpl <em>Failure Provider A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.impl.FailureProviderAImpl
	 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFailureProviderA()
	 * @generated
	 */
	int FAILURE_PROVIDER_A = 3;

	/**
	 * The feature id for the '<em><b>Can Fail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROVIDER_A__CAN_FAIL = 0;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROVIDER_A__FAILURE_RATE = 1;

	/**
	 * The feature id for the '<em><b>Part Failure Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROVIDER_A__PART_FAILURE_MODES = 2;

	/**
	 * The number of structural features of the '<em>Failure Provider A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROVIDER_A_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Failure Provider A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROVIDER_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.impl.FunctionalFailureModeSetImpl <em>Functional Failure Mode Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.impl.FunctionalFailureModeSetImpl
	 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFunctionalFailureModeSet()
	 * @generated
	 */
	int FUNCTIONAL_FAILURE_MODE_SET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Failure Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET__FAILURE_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Failure Mode Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Functional Failure Mode Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_SET_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.impl.FunctionalFailureModeImpl <em>Functional Failure Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.impl.FunctionalFailureModeImpl
	 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFunctionalFailureMode()
	 * @generated
	 */
	int FUNCTIONAL_FAILURE_MODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Requirement Failure Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__REQUIREMENT_FAILURE_EFFECTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Integrity State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__INTEGRITY_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Short Notation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE__SHORT_NOTATION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Functional Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Functional Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FAILURE_MODE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.impl.RequirementFailureEffectImpl <em>Requirement Failure Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.impl.RequirementFailureEffectImpl
	 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getRequirementFailureEffect()
	 * @generated
	 */
	int REQUIREMENT_FAILURE_EFFECT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__EFFECT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT__TARGET = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement Failure Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirement Failure Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FAILURE_EFFECT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE <em>Requirement Failure Effect Targets E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE
	 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getRequirementFailureEffectTargetsE()
	 * @generated
	 */
	int REQUIREMENT_FAILURE_EFFECT_TARGETS_E = 7;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.RequirementFailureEffectTypesE <em>Requirement Failure Effect Types E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTypesE
	 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getRequirementFailureEffectTypesE()
	 * @generated
	 */
	int REQUIREMENT_FAILURE_EFFECT_TYPES_E = 8;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.PartFailureMode <em>Part Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.PartFailureMode
	 * @generated
	 */
	EClass getPartFailureMode();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.PartFailureMode#getFailureModeRatio <em>Failure Mode Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Mode Ratio</em>'.
	 * @see de.oaam.model.oaam.safety.PartFailureMode#getFailureModeRatio()
	 * @see #getPartFailureMode()
	 * @generated
	 */
	EAttribute getPartFailureMode_FailureModeRatio();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.PartFailureMode#getFailureEffects <em>Failure Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Effects</em>'.
	 * @see de.oaam.model.oaam.safety.PartFailureMode#getFailureEffects()
	 * @see #getPartFailureMode()
	 * @generated
	 */
	EReference getPartFailureMode_FailureEffects();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.FailureEffect <em>Failure Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Effect</em>'.
	 * @see de.oaam.model.oaam.safety.FailureEffect
	 * @generated
	 */
	EClass getFailureEffect();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.FailureEffect#getPropagationFailureMode <em>Propagation Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Propagation Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.FailureEffect#getPropagationFailureMode()
	 * @see #getFailureEffect()
	 * @generated
	 */
	EReference getFailureEffect_PropagationFailureMode();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.FailureEffect#getPropagationIntegrityState <em>Propagation Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagation Integrity State</em>'.
	 * @see de.oaam.model.oaam.safety.FailureEffect#getPropagationIntegrityState()
	 * @see #getFailureEffect()
	 * @generated
	 */
	EAttribute getFailureEffect_PropagationIntegrityState();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.FailureEffect#getFailureEffectProbability <em>Failure Effect Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Effect Probability</em>'.
	 * @see de.oaam.model.oaam.safety.FailureEffect#getFailureEffectProbability()
	 * @see #getFailureEffect()
	 * @generated
	 */
	EAttribute getFailureEffect_FailureEffectProbability();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.FailureEffect#getPropagates <em>Propagates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagates</em>'.
	 * @see de.oaam.model.oaam.safety.FailureEffect#getPropagates()
	 * @see #getFailureEffect()
	 * @generated
	 */
	EAttribute getFailureEffect_Propagates();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.FaultPropagation <em>Fault Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Propagation</em>'.
	 * @see de.oaam.model.oaam.safety.FaultPropagation
	 * @generated
	 */
	EClass getFaultPropagation();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.FaultPropagation#getOutputState <em>Output State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output State</em>'.
	 * @see de.oaam.model.oaam.safety.FaultPropagation#getOutputState()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EAttribute getFaultPropagation_OutputState();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.FaultPropagation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see de.oaam.model.oaam.safety.FaultPropagation#getCondition()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EReference getFaultPropagation_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.FaultPropagation#getBooleanOperations <em>Boolean Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Operations</em>'.
	 * @see de.oaam.model.oaam.safety.FaultPropagation#getBooleanOperations()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EReference getFaultPropagation_BooleanOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.FaultPropagation#getBooleanNots <em>Boolean Nots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Nots</em>'.
	 * @see de.oaam.model.oaam.safety.FaultPropagation#getBooleanNots()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EReference getFaultPropagation_BooleanNots();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.FaultPropagation#getTaskInputStates <em>Task Input States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Input States</em>'.
	 * @see de.oaam.model.oaam.safety.FaultPropagation#getTaskInputStates()
	 * @see #getFaultPropagation()
	 * @generated
	 */
	EReference getFaultPropagation_TaskInputStates();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.FailureProviderA <em>Failure Provider A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Provider A</em>'.
	 * @see de.oaam.model.oaam.safety.FailureProviderA
	 * @generated
	 */
	EClass getFailureProviderA();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.FailureProviderA#isCanFail <em>Can Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Fail</em>'.
	 * @see de.oaam.model.oaam.safety.FailureProviderA#isCanFail()
	 * @see #getFailureProviderA()
	 * @generated
	 */
	EAttribute getFailureProviderA_CanFail();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.FailureProviderA#getFailureRate <em>Failure Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Rate</em>'.
	 * @see de.oaam.model.oaam.safety.FailureProviderA#getFailureRate()
	 * @see #getFailureProviderA()
	 * @generated
	 */
	EAttribute getFailureProviderA_FailureRate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.FailureProviderA#getPartFailureModes <em>Part Failure Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part Failure Modes</em>'.
	 * @see de.oaam.model.oaam.safety.FailureProviderA#getPartFailureModes()
	 * @see #getFailureProviderA()
	 * @generated
	 */
	EReference getFailureProviderA_PartFailureModes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.FunctionalFailureModeSet <em>Functional Failure Mode Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Failure Mode Set</em>'.
	 * @see de.oaam.model.oaam.safety.FunctionalFailureModeSet
	 * @generated
	 */
	EClass getFunctionalFailureModeSet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.FunctionalFailureModeSet#getFailureModes <em>Failure Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Modes</em>'.
	 * @see de.oaam.model.oaam.safety.FunctionalFailureModeSet#getFailureModes()
	 * @see #getFunctionalFailureModeSet()
	 * @generated
	 */
	EReference getFunctionalFailureModeSet_FailureModes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.FunctionalFailureMode <em>Functional Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.FunctionalFailureMode
	 * @generated
	 */
	EClass getFunctionalFailureMode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.FunctionalFailureMode#getRequirementFailureEffects <em>Requirement Failure Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Failure Effects</em>'.
	 * @see de.oaam.model.oaam.safety.FunctionalFailureMode#getRequirementFailureEffects()
	 * @see #getFunctionalFailureMode()
	 * @generated
	 */
	EReference getFunctionalFailureMode_RequirementFailureEffects();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.FunctionalFailureMode#getIntegrityState <em>Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity State</em>'.
	 * @see de.oaam.model.oaam.safety.FunctionalFailureMode#getIntegrityState()
	 * @see #getFunctionalFailureMode()
	 * @generated
	 */
	EAttribute getFunctionalFailureMode_IntegrityState();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.FunctionalFailureMode#getShortNotation <em>Short Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Notation</em>'.
	 * @see de.oaam.model.oaam.safety.FunctionalFailureMode#getShortNotation()
	 * @see #getFunctionalFailureMode()
	 * @generated
	 */
	EAttribute getFunctionalFailureMode_ShortNotation();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.RequirementFailureEffect <em>Requirement Failure Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Failure Effect</em>'.
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffect
	 * @generated
	 */
	EClass getRequirementFailureEffect();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.RequirementFailureEffect#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffect#getEffect()
	 * @see #getRequirementFailureEffect()
	 * @generated
	 */
	EAttribute getRequirementFailureEffect_Effect();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.RequirementFailureEffect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffect#getTarget()
	 * @see #getRequirementFailureEffect()
	 * @generated
	 */
	EAttribute getRequirementFailureEffect_Target();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE <em>Requirement Failure Effect Targets E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement Failure Effect Targets E</em>'.
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE
	 * @generated
	 */
	EEnum getRequirementFailureEffectTargetsE();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.safety.RequirementFailureEffectTypesE <em>Requirement Failure Effect Types E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement Failure Effect Types E</em>'.
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTypesE
	 * @generated
	 */
	EEnum getRequirementFailureEffectTypesE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SafetyFactory getSafetyFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.impl.PartFailureModeImpl <em>Part Failure Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.impl.PartFailureModeImpl
		 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getPartFailureMode()
		 * @generated
		 */
		EClass PART_FAILURE_MODE = eINSTANCE.getPartFailureMode();

		/**
		 * The meta object literal for the '<em><b>Failure Mode Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_FAILURE_MODE__FAILURE_MODE_RATIO = eINSTANCE.getPartFailureMode_FailureModeRatio();

		/**
		 * The meta object literal for the '<em><b>Failure Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_FAILURE_MODE__FAILURE_EFFECTS = eINSTANCE.getPartFailureMode_FailureEffects();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.impl.FailureEffectImpl <em>Failure Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.impl.FailureEffectImpl
		 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFailureEffect()
		 * @generated
		 */
		EClass FAILURE_EFFECT = eINSTANCE.getFailureEffect();

		/**
		 * The meta object literal for the '<em><b>Propagation Failure Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_EFFECT__PROPAGATION_FAILURE_MODE = eINSTANCE.getFailureEffect_PropagationFailureMode();

		/**
		 * The meta object literal for the '<em><b>Propagation Integrity State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_EFFECT__PROPAGATION_INTEGRITY_STATE = eINSTANCE.getFailureEffect_PropagationIntegrityState();

		/**
		 * The meta object literal for the '<em><b>Failure Effect Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_EFFECT__FAILURE_EFFECT_PROBABILITY = eINSTANCE.getFailureEffect_FailureEffectProbability();

		/**
		 * The meta object literal for the '<em><b>Propagates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_EFFECT__PROPAGATES = eINSTANCE.getFailureEffect_Propagates();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.impl.FaultPropagationImpl <em>Fault Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.impl.FaultPropagationImpl
		 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFaultPropagation()
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
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.impl.FailureProviderAImpl <em>Failure Provider A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.impl.FailureProviderAImpl
		 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFailureProviderA()
		 * @generated
		 */
		EClass FAILURE_PROVIDER_A = eINSTANCE.getFailureProviderA();

		/**
		 * The meta object literal for the '<em><b>Can Fail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_PROVIDER_A__CAN_FAIL = eINSTANCE.getFailureProviderA_CanFail();

		/**
		 * The meta object literal for the '<em><b>Failure Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_PROVIDER_A__FAILURE_RATE = eINSTANCE.getFailureProviderA_FailureRate();

		/**
		 * The meta object literal for the '<em><b>Part Failure Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_PROVIDER_A__PART_FAILURE_MODES = eINSTANCE.getFailureProviderA_PartFailureModes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.impl.FunctionalFailureModeSetImpl <em>Functional Failure Mode Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.impl.FunctionalFailureModeSetImpl
		 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFunctionalFailureModeSet()
		 * @generated
		 */
		EClass FUNCTIONAL_FAILURE_MODE_SET = eINSTANCE.getFunctionalFailureModeSet();

		/**
		 * The meta object literal for the '<em><b>Failure Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_FAILURE_MODE_SET__FAILURE_MODES = eINSTANCE.getFunctionalFailureModeSet_FailureModes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.impl.FunctionalFailureModeImpl <em>Functional Failure Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.impl.FunctionalFailureModeImpl
		 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getFunctionalFailureMode()
		 * @generated
		 */
		EClass FUNCTIONAL_FAILURE_MODE = eINSTANCE.getFunctionalFailureMode();

		/**
		 * The meta object literal for the '<em><b>Requirement Failure Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_FAILURE_MODE__REQUIREMENT_FAILURE_EFFECTS = eINSTANCE.getFunctionalFailureMode_RequirementFailureEffects();

		/**
		 * The meta object literal for the '<em><b>Integrity State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_FAILURE_MODE__INTEGRITY_STATE = eINSTANCE.getFunctionalFailureMode_IntegrityState();

		/**
		 * The meta object literal for the '<em><b>Short Notation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_FAILURE_MODE__SHORT_NOTATION = eINSTANCE.getFunctionalFailureMode_ShortNotation();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.impl.RequirementFailureEffectImpl <em>Requirement Failure Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.impl.RequirementFailureEffectImpl
		 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getRequirementFailureEffect()
		 * @generated
		 */
		EClass REQUIREMENT_FAILURE_EFFECT = eINSTANCE.getRequirementFailureEffect();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_FAILURE_EFFECT__EFFECT = eINSTANCE.getRequirementFailureEffect_Effect();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_FAILURE_EFFECT__TARGET = eINSTANCE.getRequirementFailureEffect_Target();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE <em>Requirement Failure Effect Targets E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE
		 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getRequirementFailureEffectTargetsE()
		 * @generated
		 */
		EEnum REQUIREMENT_FAILURE_EFFECT_TARGETS_E = eINSTANCE.getRequirementFailureEffectTargetsE();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.RequirementFailureEffectTypesE <em>Requirement Failure Effect Types E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTypesE
		 * @see de.oaam.model.oaam.safety.impl.SafetyPackageImpl#getRequirementFailureEffectTypesE()
		 * @generated
		 */
		EEnum REQUIREMENT_FAILURE_EFFECT_TYPES_E = eINSTANCE.getRequirementFailureEffectTypesE();

	}

} //SafetyPackage
