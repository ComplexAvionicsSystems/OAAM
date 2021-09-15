/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices;

import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;

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
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesFactory
 * @model kind="package"
 * @generated
 */
public interface FailurePropagationMatricesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "failurePropagationMatrices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v160/safety/failurePropagations/failurePropagationMatrices";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.safety.failurePropagations.failurePropagationMatrices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailurePropagationMatricesPackage eINSTANCE = de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatrixAImpl <em>Failure Propagation Matrix A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatrixAImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailurePropagationMatrixA()
	 * @generated
	 */
	int FAILURE_PROPAGATION_MATRIX_A = 0;

	/**
	 * The number of structural features of the '<em>Failure Propagation Matrix A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION_MATRIX_A_FEATURE_COUNT = FailurePropagationsPackage.PROPAGATOR_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure Propagation Matrix A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION_MATRIX_A_OPERATION_COUNT = FailurePropagationsPackage.PROPAGATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixImpl <em>Failure Mode Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeMatrix()
	 * @generated
	 */
	int FAILURE_MODE_MATRIX = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__ROWS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__INPORTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX__OUTPORTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Failure Mode Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Failure Mode Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixImpl <em>Integrity State Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateMatrix()
	 * @generated
	 */
	int INTEGRITY_STATE_MATRIX = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Outports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__OUTPORTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__INPORTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX__ROWS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integrity State Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integrity State Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixImpl <em>Boolean Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanMatrix()
	 * @generated
	 */
	int BOOLEAN_MATRIX = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Outports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__OUTPORTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__INPORTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX__ROWS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boolean Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportImpl <em>Failure Mode Inport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeInport()
	 * @generated
	 */
	int FAILURE_MODE_INPORT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Mode Inport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure Mode Inport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportImpl <em>Failure Mode Outport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeOutport()
	 * @generated
	 */
	int FAILURE_MODE_OUTPORT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Default Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT__DEFAULT_FAILURE_MODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Mode Outport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure Mode Outport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixRowImpl <em>Failure Mode Matrix Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixRowImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeMatrixRow()
	 * @generated
	 */
	int FAILURE_MODE_MATRIX_ROW = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Inport Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__INPORT_ENTRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outport Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW__OUTPORT_ENTRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure Mode Matrix Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Failure Mode Matrix Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_MATRIX_ROW_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportEntryImpl <em>Failure Mode Inport Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportEntryImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeInportEntry()
	 * @generated
	 */
	int FAILURE_MODE_INPORT_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Inport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__INPORT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY__FAILURE_MODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure Mode Inport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Failure Mode Inport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INPORT_ENTRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportEntryImpl <em>Failure Mode Outport Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportEntryImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeOutportEntry()
	 * @generated
	 */
	int FAILURE_MODE_OUTPORT_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Outport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__OUTPORT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY__FAILURE_MODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure Mode Outport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Failure Mode Outport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OUTPORT_ENTRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportImpl <em>Integrity State Outport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateOutport()
	 * @generated
	 */
	int INTEGRITY_STATE_OUTPORT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Default Integrity State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT__DEFAULT_INTEGRITY_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integrity State Outport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integrity State Outport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateInportImpl <em>Integrity State Inport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateInportImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateInport()
	 * @generated
	 */
	int INTEGRITY_STATE_INPORT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integrity State Inport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integrity State Inport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixRowImpl <em>Integrity State Matrix Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixRowImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateMatrixRow()
	 * @generated
	 */
	int INTEGRITY_STATE_MATRIX_ROW = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Inport Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__INPORT_ENTRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outport Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW__OUTPORT_ENTRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integrity State Matrix Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integrity State Matrix Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_MATRIX_ROW_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateInportEntryImpl <em>Integrity State Inport Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateInportEntryImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateInportEntry()
	 * @generated
	 */
	int INTEGRITY_STATE_INPORT_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Integrity State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__INTEGRITY_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY__INPORT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integrity State Inport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integrity State Inport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_INPORT_ENTRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportEntryImpl <em>Integrity State Outport Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportEntryImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateOutportEntry()
	 * @generated
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Integrity State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__INTEGRITY_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY__OUTPORT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integrity State Outport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integrity State Outport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_OUTPORT_ENTRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportImpl <em>Boolean Inport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanInport()
	 * @generated
	 */
	int BOOLEAN_INPORT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Inport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Inport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportImpl <em>Boolean Outport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanOutport()
	 * @generated
	 */
	int BOOLEAN_OUTPORT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT__DEFAULT_VALUE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Outport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Outport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixRowImpl <em>Boolean Matrix Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixRowImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanMatrixRow()
	 * @generated
	 */
	int BOOLEAN_MATRIX_ROW = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Inport Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__INPORT_ENTRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outport Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW__OUTPORT_ENTRIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Matrix Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Matrix Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MATRIX_ROW_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportEntryImpl <em>Boolean Inport Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportEntryImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanInportEntry()
	 * @generated
	 */
	int BOOLEAN_INPORT_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__VALUE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY__INPORT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Inport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Inport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INPORT_ENTRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportEntryImpl <em>Boolean Outport Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportEntryImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanOutportEntry()
	 * @generated
	 */
	int BOOLEAN_OUTPORT_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__VALUE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY__OUTPORT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Outport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Outport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OUTPORT_ENTRY_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatrixA <em>Failure Propagation Matrix A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Propagation Matrix A</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatrixA
	 * @generated
	 */
	EClass getFailurePropagationMatrixA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix <em>Failure Mode Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode Matrix</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix
	 * @generated
	 */
	EClass getFailureModeMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix#getRows()
	 * @see #getFailureModeMatrix()
	 * @generated
	 */
	EReference getFailureModeMatrix_Rows();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix#getInports <em>Inports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inports</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix#getInports()
	 * @see #getFailureModeMatrix()
	 * @generated
	 */
	EReference getFailureModeMatrix_Inports();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix#getOutports <em>Outports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outports</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix#getOutports()
	 * @see #getFailureModeMatrix()
	 * @generated
	 */
	EReference getFailureModeMatrix_Outports();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix <em>Integrity State Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity State Matrix</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix
	 * @generated
	 */
	EClass getIntegrityStateMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix#getOutports <em>Outports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outports</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix#getOutports()
	 * @see #getIntegrityStateMatrix()
	 * @generated
	 */
	EReference getIntegrityStateMatrix_Outports();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix#getInports <em>Inports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inports</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix#getInports()
	 * @see #getIntegrityStateMatrix()
	 * @generated
	 */
	EReference getIntegrityStateMatrix_Inports();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix#getRows()
	 * @see #getIntegrityStateMatrix()
	 * @generated
	 */
	EReference getIntegrityStateMatrix_Rows();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix <em>Boolean Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Matrix</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix
	 * @generated
	 */
	EClass getBooleanMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix#getOutports <em>Outports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outports</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix#getOutports()
	 * @see #getBooleanMatrix()
	 * @generated
	 */
	EReference getBooleanMatrix_Outports();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix#getInports <em>Inports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inports</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix#getInports()
	 * @see #getBooleanMatrix()
	 * @generated
	 */
	EReference getBooleanMatrix_Inports();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix#getRows()
	 * @see #getBooleanMatrix()
	 * @generated
	 */
	EReference getBooleanMatrix_Rows();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport <em>Failure Mode Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode Inport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport
	 * @generated
	 */
	EClass getFailureModeInport();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport#getInput()
	 * @see #getFailureModeInport()
	 * @generated
	 */
	EReference getFailureModeInport_Input();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport <em>Failure Mode Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode Outport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport
	 * @generated
	 */
	EClass getFailureModeOutport();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport#getDefaultFailureMode <em>Default Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport#getDefaultFailureMode()
	 * @see #getFailureModeOutport()
	 * @generated
	 */
	EReference getFailureModeOutport_DefaultFailureMode();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow <em>Failure Mode Matrix Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode Matrix Row</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow
	 * @generated
	 */
	EClass getFailureModeMatrixRow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow#getInportEntries <em>Inport Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inport Entries</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow#getInportEntries()
	 * @see #getFailureModeMatrixRow()
	 * @generated
	 */
	EReference getFailureModeMatrixRow_InportEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow#getOutportEntries <em>Outport Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outport Entries</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow#getOutportEntries()
	 * @see #getFailureModeMatrixRow()
	 * @generated
	 */
	EReference getFailureModeMatrixRow_OutportEntries();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry <em>Failure Mode Inport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode Inport Entry</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry
	 * @generated
	 */
	EClass getFailureModeInportEntry();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry#getInport <em>Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry#getInport()
	 * @see #getFailureModeInportEntry()
	 * @generated
	 */
	EReference getFailureModeInportEntry_Inport();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry#getFailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry#getFailureMode()
	 * @see #getFailureModeInportEntry()
	 * @generated
	 */
	EReference getFailureModeInportEntry_FailureMode();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry <em>Failure Mode Outport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode Outport Entry</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry
	 * @generated
	 */
	EClass getFailureModeOutportEntry();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry#getOutport <em>Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry#getOutport()
	 * @see #getFailureModeOutportEntry()
	 * @generated
	 */
	EReference getFailureModeOutportEntry_Outport();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry#getFailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry#getFailureMode()
	 * @see #getFailureModeOutportEntry()
	 * @generated
	 */
	EReference getFailureModeOutportEntry_FailureMode();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport <em>Integrity State Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity State Outport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport
	 * @generated
	 */
	EClass getIntegrityStateOutport();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport#getDefaultIntegrityState <em>Default Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Integrity State</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport#getDefaultIntegrityState()
	 * @see #getIntegrityStateOutport()
	 * @generated
	 */
	EAttribute getIntegrityStateOutport_DefaultIntegrityState();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInport <em>Integrity State Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity State Inport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInport
	 * @generated
	 */
	EClass getIntegrityStateInport();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInport#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInport#getInput()
	 * @see #getIntegrityStateInport()
	 * @generated
	 */
	EReference getIntegrityStateInport_Input();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow <em>Integrity State Matrix Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity State Matrix Row</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow
	 * @generated
	 */
	EClass getIntegrityStateMatrixRow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow#getInportEntries <em>Inport Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inport Entries</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow#getInportEntries()
	 * @see #getIntegrityStateMatrixRow()
	 * @generated
	 */
	EReference getIntegrityStateMatrixRow_InportEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow#getOutportEntries <em>Outport Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outport Entries</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow#getOutportEntries()
	 * @see #getIntegrityStateMatrixRow()
	 * @generated
	 */
	EReference getIntegrityStateMatrixRow_OutportEntries();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry <em>Integrity State Inport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity State Inport Entry</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry
	 * @generated
	 */
	EClass getIntegrityStateInportEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry#getIntegrityState <em>Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity State</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry#getIntegrityState()
	 * @see #getIntegrityStateInportEntry()
	 * @generated
	 */
	EAttribute getIntegrityStateInportEntry_IntegrityState();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry#getInport <em>Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry#getInport()
	 * @see #getIntegrityStateInportEntry()
	 * @generated
	 */
	EReference getIntegrityStateInportEntry_Inport();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry <em>Integrity State Outport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity State Outport Entry</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry
	 * @generated
	 */
	EClass getIntegrityStateOutportEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry#getIntegrityState <em>Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity State</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry#getIntegrityState()
	 * @see #getIntegrityStateOutportEntry()
	 * @generated
	 */
	EAttribute getIntegrityStateOutportEntry_IntegrityState();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry#getOutport <em>Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry#getOutport()
	 * @see #getIntegrityStateOutportEntry()
	 * @generated
	 */
	EReference getIntegrityStateOutportEntry_Outport();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport <em>Boolean Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Inport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport
	 * @generated
	 */
	EClass getBooleanInport();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport#getInput()
	 * @see #getBooleanInport()
	 * @generated
	 */
	EReference getBooleanInport_Input();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport <em>Boolean Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Outport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport
	 * @generated
	 */
	EClass getBooleanOutport();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport#isDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport#isDefaultValue()
	 * @see #getBooleanOutport()
	 * @generated
	 */
	EAttribute getBooleanOutport_DefaultValue();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow <em>Boolean Matrix Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Matrix Row</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow
	 * @generated
	 */
	EClass getBooleanMatrixRow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow#getInportEntries <em>Inport Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inport Entries</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow#getInportEntries()
	 * @see #getBooleanMatrixRow()
	 * @generated
	 */
	EReference getBooleanMatrixRow_InportEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow#getOutportEntries <em>Outport Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outport Entries</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow#getOutportEntries()
	 * @see #getBooleanMatrixRow()
	 * @generated
	 */
	EReference getBooleanMatrixRow_OutportEntries();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry <em>Boolean Inport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Inport Entry</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry
	 * @generated
	 */
	EClass getBooleanInportEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry#isValue()
	 * @see #getBooleanInportEntry()
	 * @generated
	 */
	EAttribute getBooleanInportEntry_Value();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry#getInport <em>Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry#getInport()
	 * @see #getBooleanInportEntry()
	 * @generated
	 */
	EReference getBooleanInportEntry_Inport();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry <em>Boolean Outport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Outport Entry</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry
	 * @generated
	 */
	EClass getBooleanOutportEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry#isValue()
	 * @see #getBooleanOutportEntry()
	 * @generated
	 */
	EAttribute getBooleanOutportEntry_Value();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry#getOutport <em>Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outport</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry#getOutport()
	 * @see #getBooleanOutportEntry()
	 * @generated
	 */
	EReference getBooleanOutportEntry_Outport();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FailurePropagationMatricesFactory getFailurePropagationMatricesFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatrixAImpl <em>Failure Propagation Matrix A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatrixAImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailurePropagationMatrixA()
		 * @generated
		 */
		EClass FAILURE_PROPAGATION_MATRIX_A = eINSTANCE.getFailurePropagationMatrixA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixImpl <em>Failure Mode Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeMatrix()
		 * @generated
		 */
		EClass FAILURE_MODE_MATRIX = eINSTANCE.getFailureModeMatrix();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_MATRIX__ROWS = eINSTANCE.getFailureModeMatrix_Rows();

		/**
		 * The meta object literal for the '<em><b>Inports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_MATRIX__INPORTS = eINSTANCE.getFailureModeMatrix_Inports();

		/**
		 * The meta object literal for the '<em><b>Outports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_MATRIX__OUTPORTS = eINSTANCE.getFailureModeMatrix_Outports();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixImpl <em>Integrity State Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateMatrix()
		 * @generated
		 */
		EClass INTEGRITY_STATE_MATRIX = eINSTANCE.getIntegrityStateMatrix();

		/**
		 * The meta object literal for the '<em><b>Outports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_MATRIX__OUTPORTS = eINSTANCE.getIntegrityStateMatrix_Outports();

		/**
		 * The meta object literal for the '<em><b>Inports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_MATRIX__INPORTS = eINSTANCE.getIntegrityStateMatrix_Inports();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_MATRIX__ROWS = eINSTANCE.getIntegrityStateMatrix_Rows();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixImpl <em>Boolean Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanMatrix()
		 * @generated
		 */
		EClass BOOLEAN_MATRIX = eINSTANCE.getBooleanMatrix();

		/**
		 * The meta object literal for the '<em><b>Outports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_MATRIX__OUTPORTS = eINSTANCE.getBooleanMatrix_Outports();

		/**
		 * The meta object literal for the '<em><b>Inports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_MATRIX__INPORTS = eINSTANCE.getBooleanMatrix_Inports();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_MATRIX__ROWS = eINSTANCE.getBooleanMatrix_Rows();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportImpl <em>Failure Mode Inport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeInport()
		 * @generated
		 */
		EClass FAILURE_MODE_INPORT = eINSTANCE.getFailureModeInport();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_INPORT__INPUT = eINSTANCE.getFailureModeInport_Input();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportImpl <em>Failure Mode Outport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeOutport()
		 * @generated
		 */
		EClass FAILURE_MODE_OUTPORT = eINSTANCE.getFailureModeOutport();

		/**
		 * The meta object literal for the '<em><b>Default Failure Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_OUTPORT__DEFAULT_FAILURE_MODE = eINSTANCE.getFailureModeOutport_DefaultFailureMode();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixRowImpl <em>Failure Mode Matrix Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixRowImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeMatrixRow()
		 * @generated
		 */
		EClass FAILURE_MODE_MATRIX_ROW = eINSTANCE.getFailureModeMatrixRow();

		/**
		 * The meta object literal for the '<em><b>Inport Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_MATRIX_ROW__INPORT_ENTRIES = eINSTANCE.getFailureModeMatrixRow_InportEntries();

		/**
		 * The meta object literal for the '<em><b>Outport Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_MATRIX_ROW__OUTPORT_ENTRIES = eINSTANCE.getFailureModeMatrixRow_OutportEntries();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportEntryImpl <em>Failure Mode Inport Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeInportEntryImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeInportEntry()
		 * @generated
		 */
		EClass FAILURE_MODE_INPORT_ENTRY = eINSTANCE.getFailureModeInportEntry();

		/**
		 * The meta object literal for the '<em><b>Inport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_INPORT_ENTRY__INPORT = eINSTANCE.getFailureModeInportEntry_Inport();

		/**
		 * The meta object literal for the '<em><b>Failure Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_INPORT_ENTRY__FAILURE_MODE = eINSTANCE.getFailureModeInportEntry_FailureMode();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportEntryImpl <em>Failure Mode Outport Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeOutportEntryImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getFailureModeOutportEntry()
		 * @generated
		 */
		EClass FAILURE_MODE_OUTPORT_ENTRY = eINSTANCE.getFailureModeOutportEntry();

		/**
		 * The meta object literal for the '<em><b>Outport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_OUTPORT_ENTRY__OUTPORT = eINSTANCE.getFailureModeOutportEntry_Outport();

		/**
		 * The meta object literal for the '<em><b>Failure Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_OUTPORT_ENTRY__FAILURE_MODE = eINSTANCE.getFailureModeOutportEntry_FailureMode();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportImpl <em>Integrity State Outport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateOutport()
		 * @generated
		 */
		EClass INTEGRITY_STATE_OUTPORT = eINSTANCE.getIntegrityStateOutport();

		/**
		 * The meta object literal for the '<em><b>Default Integrity State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRITY_STATE_OUTPORT__DEFAULT_INTEGRITY_STATE = eINSTANCE.getIntegrityStateOutport_DefaultIntegrityState();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateInportImpl <em>Integrity State Inport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateInportImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateInport()
		 * @generated
		 */
		EClass INTEGRITY_STATE_INPORT = eINSTANCE.getIntegrityStateInport();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_INPORT__INPUT = eINSTANCE.getIntegrityStateInport_Input();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixRowImpl <em>Integrity State Matrix Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixRowImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateMatrixRow()
		 * @generated
		 */
		EClass INTEGRITY_STATE_MATRIX_ROW = eINSTANCE.getIntegrityStateMatrixRow();

		/**
		 * The meta object literal for the '<em><b>Inport Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_MATRIX_ROW__INPORT_ENTRIES = eINSTANCE.getIntegrityStateMatrixRow_InportEntries();

		/**
		 * The meta object literal for the '<em><b>Outport Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_MATRIX_ROW__OUTPORT_ENTRIES = eINSTANCE.getIntegrityStateMatrixRow_OutportEntries();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateInportEntryImpl <em>Integrity State Inport Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateInportEntryImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateInportEntry()
		 * @generated
		 */
		EClass INTEGRITY_STATE_INPORT_ENTRY = eINSTANCE.getIntegrityStateInportEntry();

		/**
		 * The meta object literal for the '<em><b>Integrity State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRITY_STATE_INPORT_ENTRY__INTEGRITY_STATE = eINSTANCE.getIntegrityStateInportEntry_IntegrityState();

		/**
		 * The meta object literal for the '<em><b>Inport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_INPORT_ENTRY__INPORT = eINSTANCE.getIntegrityStateInportEntry_Inport();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportEntryImpl <em>Integrity State Outport Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateOutportEntryImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getIntegrityStateOutportEntry()
		 * @generated
		 */
		EClass INTEGRITY_STATE_OUTPORT_ENTRY = eINSTANCE.getIntegrityStateOutportEntry();

		/**
		 * The meta object literal for the '<em><b>Integrity State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRITY_STATE_OUTPORT_ENTRY__INTEGRITY_STATE = eINSTANCE.getIntegrityStateOutportEntry_IntegrityState();

		/**
		 * The meta object literal for the '<em><b>Outport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_OUTPORT_ENTRY__OUTPORT = eINSTANCE.getIntegrityStateOutportEntry_Outport();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportImpl <em>Boolean Inport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanInport()
		 * @generated
		 */
		EClass BOOLEAN_INPORT = eINSTANCE.getBooleanInport();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_INPORT__INPUT = eINSTANCE.getBooleanInport_Input();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportImpl <em>Boolean Outport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanOutport()
		 * @generated
		 */
		EClass BOOLEAN_OUTPORT = eINSTANCE.getBooleanOutport();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_OUTPORT__DEFAULT_VALUE = eINSTANCE.getBooleanOutport_DefaultValue();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixRowImpl <em>Boolean Matrix Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixRowImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanMatrixRow()
		 * @generated
		 */
		EClass BOOLEAN_MATRIX_ROW = eINSTANCE.getBooleanMatrixRow();

		/**
		 * The meta object literal for the '<em><b>Inport Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_MATRIX_ROW__INPORT_ENTRIES = eINSTANCE.getBooleanMatrixRow_InportEntries();

		/**
		 * The meta object literal for the '<em><b>Outport Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_MATRIX_ROW__OUTPORT_ENTRIES = eINSTANCE.getBooleanMatrixRow_OutportEntries();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportEntryImpl <em>Boolean Inport Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanInportEntryImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanInportEntry()
		 * @generated
		 */
		EClass BOOLEAN_INPORT_ENTRY = eINSTANCE.getBooleanInportEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_INPORT_ENTRY__VALUE = eINSTANCE.getBooleanInportEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Inport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_INPORT_ENTRY__INPORT = eINSTANCE.getBooleanInportEntry_Inport();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportEntryImpl <em>Boolean Outport Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanOutportEntryImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailurePropagationMatricesPackageImpl#getBooleanOutportEntry()
		 * @generated
		 */
		EClass BOOLEAN_OUTPORT_ENTRY = eINSTANCE.getBooleanOutportEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_OUTPORT_ENTRY__VALUE = eINSTANCE.getBooleanOutportEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Outport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OUTPORT_ENTRY__OUTPORT = eINSTANCE.getBooleanOutportEntry_Outport();

	}

} //FailurePropagationMatricesPackage
