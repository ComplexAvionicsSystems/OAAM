/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

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
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsFactory
 * @model kind="package"
 * @generated
 */
public interface FailurePropagationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "failurePropagations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v160/safety/failurePropagations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.safety.failurePropagations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailurePropagationsPackage eINSTANCE = de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationImpl <em>Failure Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailurePropagation()
	 * @generated
	 */
	int FAILURE_PROPAGATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Propagators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION__PROPAGATORS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_PROPAGATION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagatorAImpl <em>Propagator A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagatorAImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagatorA()
	 * @generated
	 */
	int PROPAGATOR_A = 1;

	/**
	 * The number of structural features of the '<em>Propagator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Propagator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModePropagatorAImpl <em>Failure Mode Propagator A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailureModePropagatorAImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailureModePropagatorA()
	 * @generated
	 */
	int FAILURE_MODE_PROPAGATOR_A = 2;

	/**
	 * The number of structural features of the '<em>Failure Mode Propagator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_PROPAGATOR_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Failure Mode Propagator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_PROPAGATOR_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanPropagatorAImpl <em>Boolean Propagator A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanPropagatorAImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanPropagatorA()
	 * @generated
	 */
	int BOOLEAN_PROPAGATOR_A = 3;

	/**
	 * The number of structural features of the '<em>Boolean Propagator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPAGATOR_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Boolean Propagator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPAGATOR_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.ConversionAImpl <em>Conversion A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.ConversionAImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getConversionA()
	 * @generated
	 */
	int CONVERSION_A = 4;

	/**
	 * The number of structural features of the '<em>Conversion A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_A_FEATURE_COUNT = PROPAGATOR_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conversion A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_A_OPERATION_COUNT = PROPAGATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStatePropagatorAImpl <em>Integrity State Propagator A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStatePropagatorAImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getIntegrityStatePropagatorA()
	 * @generated
	 */
	int INTEGRITY_STATE_PROPAGATOR_A = 5;

	/**
	 * The number of structural features of the '<em>Integrity State Propagator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_PROPAGATOR_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Integrity State Propagator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_PROPAGATOR_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanGateAImpl <em>Boolean Gate A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanGateAImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanGateA()
	 * @generated
	 */
	int BOOLEAN_GATE_A = 6;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GATE_A__INPUTS = BOOLEAN_PROPAGATOR_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Gate A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GATE_A_FEATURE_COUNT = BOOLEAN_PROPAGATOR_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Gate A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GATE_A_OPERATION_COUNT = BOOLEAN_PROPAGATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanAndImpl <em>Boolean And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanAndImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanAnd()
	 * @generated
	 */
	int BOOLEAN_AND = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__INPUTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanOrImpl <em>Boolean Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanOrImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanOr()
	 * @generated
	 */
	int BOOLEAN_OR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__INPUTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanXorImpl <em>Boolean Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanXorImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanXor()
	 * @generated
	 */
	int BOOLEAN_XOR = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR__INPUTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_XOR_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanNotImpl <em>Boolean Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanNotImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanNot()
	 * @generated
	 */
	int BOOLEAN_NOT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NOT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateBooleanConversionImpl <em>Integrity State Boolean Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateBooleanConversionImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getIntegrityStateBooleanConversion()
	 * @generated
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input Integrity State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT_INTEGRITY_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integrity State Boolean Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integrity State Boolean Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_BOOLEAN_CONVERSION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeBooleanConversionImpl <em>Failure Mode Boolean Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeBooleanConversionImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailureModeBooleanConversion()
	 * @generated
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION__INPUT_FAILURE_MODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Failure Mode Boolean Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Failure Mode Boolean Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_BOOLEAN_CONVERSION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanFailureModeConversionImpl <em>Boolean Failure Mode Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanFailureModeConversionImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanFailureModeConversion()
	 * @generated
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__INPUT_BOOLEAN_VALUE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Failure Mode Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boolean Failure Mode Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FAILURE_MODE_CONVERSION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateFailureModeConversionImpl <em>Integrity State Failure Mode Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateFailureModeConversionImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getIntegrityStateFailureModeConversion()
	 * @generated
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input Integrity State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT_INTEGRITY_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integrity State Failure Mode Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integrity State Failure Mode Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_STATE_FAILURE_MODE_CONVERSION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeIntegrityStateConversionImpl <em>Failure Mode Integrity State Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeIntegrityStateConversionImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailureModeIntegrityStateConversion()
	 * @generated
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Integrity State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Failure Mode Integrity State Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Failure Mode Integrity State Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_INTEGRITY_STATE_CONVERSION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanIntegrityStateConversionImpl <em>Boolean Integrity State Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanIntegrityStateConversionImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanIntegrityStateConversion()
	 * @generated
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT_BOOLEAN_VALUE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Integrity State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Integrity State Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boolean Integrity State Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTEGRITY_STATE_CONVERSION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationInputImpl <em>Propagation Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagationInputImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagationInput()
	 * @generated
	 */
	int PROPAGATION_INPUT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT__SOURCE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagation Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Propagation Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_INPUT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationOutputImpl <em>Propagation Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagationOutputImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagationOutput()
	 * @generated
	 */
	int PROPAGATION_OUTPUT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__TARGET = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Propagated Integrity States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__PROPAGATED_INTEGRITY_STATES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Propagated Failure Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT__PROPAGATED_FAILURE_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Propagation Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Propagation Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_OUTPUT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSourceImpl <em>Propagation Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSourceImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagationSource()
	 * @generated
	 */
	int PROPAGATION_SOURCE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE__SOURCE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagation Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Propagation Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SOURCE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSinkImpl <em>Propagation Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSinkImpl
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagationSink()
	 * @generated
	 */
	int PROPAGATION_SINK = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Propagated Integrity States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__PROPAGATED_INTEGRITY_STATES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Propagated Failure Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK__PROPAGATED_FAILURE_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Propagation Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Propagation Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_SINK_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE <em>Failure Propagation Generic Type E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE
	 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailurePropagationGenericTypeE()
	 * @generated
	 */
	int FAILURE_PROPAGATION_GENERIC_TYPE_E = 21;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagation <em>Failure Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Propagation</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagation
	 * @generated
	 */
	EClass getFailurePropagation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagation#getPropagators <em>Propagators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propagators</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagation#getPropagators()
	 * @see #getFailurePropagation()
	 * @generated
	 */
	EReference getFailurePropagation_Propagators();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagatorA <em>Propagator A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator A</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagatorA
	 * @generated
	 */
	EClass getPropagatorA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA <em>Failure Mode Propagator A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode Propagator A</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA
	 * @generated
	 */
	EClass getFailureModePropagatorA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA <em>Boolean Propagator A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Propagator A</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA
	 * @generated
	 */
	EClass getBooleanPropagatorA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.ConversionA <em>Conversion A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion A</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.ConversionA
	 * @generated
	 */
	EClass getConversionA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA <em>Integrity State Propagator A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity State Propagator A</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA
	 * @generated
	 */
	EClass getIntegrityStatePropagatorA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanGateA <em>Boolean Gate A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Gate A</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanGateA
	 * @generated
	 */
	EClass getBooleanGateA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanGateA#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanGateA#getInputs()
	 * @see #getBooleanGateA()
	 * @generated
	 */
	EReference getBooleanGateA_Inputs();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanAnd <em>Boolean And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean And</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanAnd
	 * @generated
	 */
	EClass getBooleanAnd();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanOr <em>Boolean Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Or</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanOr
	 * @generated
	 */
	EClass getBooleanOr();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanXor <em>Boolean Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Xor</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanXor
	 * @generated
	 */
	EClass getBooleanXor();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanNot <em>Boolean Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Not</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanNot
	 * @generated
	 */
	EClass getBooleanNot();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanNot#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanNot#getInput()
	 * @see #getBooleanNot()
	 * @generated
	 */
	EReference getBooleanNot_Input();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion <em>Integrity State Boolean Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity State Boolean Conversion</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion
	 * @generated
	 */
	EClass getIntegrityStateBooleanConversion();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#getInputIntegrityState <em>Input Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Integrity State</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#getInputIntegrityState()
	 * @see #getIntegrityStateBooleanConversion()
	 * @generated
	 */
	EAttribute getIntegrityStateBooleanConversion_InputIntegrityState();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#isOutputBooleanValue <em>Output Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Boolean Value</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#isOutputBooleanValue()
	 * @see #getIntegrityStateBooleanConversion()
	 * @generated
	 */
	EAttribute getIntegrityStateBooleanConversion_OutputBooleanValue();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion#getInput()
	 * @see #getIntegrityStateBooleanConversion()
	 * @generated
	 */
	EReference getIntegrityStateBooleanConversion_Input();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion <em>Failure Mode Boolean Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode Boolean Conversion</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion
	 * @generated
	 */
	EClass getFailureModeBooleanConversion();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#getInput()
	 * @see #getFailureModeBooleanConversion()
	 * @generated
	 */
	EReference getFailureModeBooleanConversion_Input();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#isOutputBooleanValue <em>Output Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Boolean Value</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#isOutputBooleanValue()
	 * @see #getFailureModeBooleanConversion()
	 * @generated
	 */
	EAttribute getFailureModeBooleanConversion_OutputBooleanValue();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#getInputFailureMode <em>Input Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion#getInputFailureMode()
	 * @see #getFailureModeBooleanConversion()
	 * @generated
	 */
	EReference getFailureModeBooleanConversion_InputFailureMode();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion <em>Boolean Failure Mode Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Failure Mode Conversion</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion
	 * @generated
	 */
	EClass getBooleanFailureModeConversion();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#isInputBooleanValue <em>Input Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Boolean Value</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#isInputBooleanValue()
	 * @see #getBooleanFailureModeConversion()
	 * @generated
	 */
	EAttribute getBooleanFailureModeConversion_InputBooleanValue();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#getInput()
	 * @see #getBooleanFailureModeConversion()
	 * @generated
	 */
	EReference getBooleanFailureModeConversion_Input();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#getOutputFailureMode <em>Output Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion#getOutputFailureMode()
	 * @see #getBooleanFailureModeConversion()
	 * @generated
	 */
	EReference getBooleanFailureModeConversion_OutputFailureMode();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion <em>Integrity State Failure Mode Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity State Failure Mode Conversion</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion
	 * @generated
	 */
	EClass getIntegrityStateFailureModeConversion();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getInputIntegrityState <em>Input Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Integrity State</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getInputIntegrityState()
	 * @see #getIntegrityStateFailureModeConversion()
	 * @generated
	 */
	EAttribute getIntegrityStateFailureModeConversion_InputIntegrityState();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getInput()
	 * @see #getIntegrityStateFailureModeConversion()
	 * @generated
	 */
	EReference getIntegrityStateFailureModeConversion_Input();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getOutputFailureMode <em>Output Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion#getOutputFailureMode()
	 * @see #getIntegrityStateFailureModeConversion()
	 * @generated
	 */
	EReference getIntegrityStateFailureModeConversion_OutputFailureMode();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion <em>Failure Mode Integrity State Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode Integrity State Conversion</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion
	 * @generated
	 */
	EClass getFailureModeIntegrityStateConversion();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getInput()
	 * @see #getFailureModeIntegrityStateConversion()
	 * @generated
	 */
	EReference getFailureModeIntegrityStateConversion_Input();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getOutputIntegrityState <em>Output Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Integrity State</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getOutputIntegrityState()
	 * @see #getFailureModeIntegrityStateConversion()
	 * @generated
	 */
	EAttribute getFailureModeIntegrityStateConversion_OutputIntegrityState();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getInputFailureMode <em>Input Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Failure Mode</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion#getInputFailureMode()
	 * @see #getFailureModeIntegrityStateConversion()
	 * @generated
	 */
	EReference getFailureModeIntegrityStateConversion_InputFailureMode();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion <em>Boolean Integrity State Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Integrity State Conversion</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion
	 * @generated
	 */
	EClass getBooleanIntegrityStateConversion();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#getInput()
	 * @see #getBooleanIntegrityStateConversion()
	 * @generated
	 */
	EReference getBooleanIntegrityStateConversion_Input();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#isInputBooleanValue <em>Input Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Boolean Value</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#isInputBooleanValue()
	 * @see #getBooleanIntegrityStateConversion()
	 * @generated
	 */
	EAttribute getBooleanIntegrityStateConversion_InputBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#getOutputIntegrityState <em>Output Integrity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Integrity State</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion#getOutputIntegrityState()
	 * @see #getBooleanIntegrityStateConversion()
	 * @generated
	 */
	EAttribute getBooleanIntegrityStateConversion_OutputIntegrityState();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationInput <em>Propagation Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagation Input</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationInput
	 * @generated
	 */
	EClass getPropagationInput();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationInput#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationInput#getSource()
	 * @see #getPropagationInput()
	 * @generated
	 */
	EReference getPropagationInput_Source();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput <em>Propagation Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagation Output</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationOutput
	 * @generated
	 */
	EClass getPropagationOutput();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getTarget()
	 * @see #getPropagationOutput()
	 * @generated
	 */
	EReference getPropagationOutput_Target();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getPropagatedIntegrityStates <em>Propagated Integrity States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Propagated Integrity States</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getPropagatedIntegrityStates()
	 * @see #getPropagationOutput()
	 * @generated
	 */
	EReference getPropagationOutput_PropagatedIntegrityStates();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getPropagatedFailureModes <em>Propagated Failure Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Propagated Failure Modes</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationOutput#getPropagatedFailureModes()
	 * @see #getPropagationOutput()
	 * @generated
	 */
	EReference getPropagationOutput_PropagatedFailureModes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSource <em>Propagation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagation Source</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationSource
	 * @generated
	 */
	EClass getPropagationSource();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSource#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationSource#getSource()
	 * @see #getPropagationSource()
	 * @generated
	 */
	EReference getPropagationSource_Source();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSink <em>Propagation Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagation Sink</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationSink
	 * @generated
	 */
	EClass getPropagationSink();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSink#getPropagatedIntegrityStates <em>Propagated Integrity States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Propagated Integrity States</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationSink#getPropagatedIntegrityStates()
	 * @see #getPropagationSink()
	 * @generated
	 */
	EReference getPropagationSink_PropagatedIntegrityStates();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSink#getPropagatedFailureModes <em>Propagated Failure Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Propagated Failure Modes</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationSink#getPropagatedFailureModes()
	 * @see #getPropagationSink()
	 * @generated
	 */
	EReference getPropagationSink_PropagatedFailureModes();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE <em>Failure Propagation Generic Type E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failure Propagation Generic Type E</em>'.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE
	 * @generated
	 */
	EEnum getFailurePropagationGenericTypeE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FailurePropagationsFactory getFailurePropagationsFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationImpl <em>Failure Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailurePropagation()
		 * @generated
		 */
		EClass FAILURE_PROPAGATION = eINSTANCE.getFailurePropagation();

		/**
		 * The meta object literal for the '<em><b>Propagators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_PROPAGATION__PROPAGATORS = eINSTANCE.getFailurePropagation_Propagators();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagatorAImpl <em>Propagator A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagatorAImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagatorA()
		 * @generated
		 */
		EClass PROPAGATOR_A = eINSTANCE.getPropagatorA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModePropagatorAImpl <em>Failure Mode Propagator A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailureModePropagatorAImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailureModePropagatorA()
		 * @generated
		 */
		EClass FAILURE_MODE_PROPAGATOR_A = eINSTANCE.getFailureModePropagatorA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanPropagatorAImpl <em>Boolean Propagator A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanPropagatorAImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanPropagatorA()
		 * @generated
		 */
		EClass BOOLEAN_PROPAGATOR_A = eINSTANCE.getBooleanPropagatorA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.ConversionAImpl <em>Conversion A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.ConversionAImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getConversionA()
		 * @generated
		 */
		EClass CONVERSION_A = eINSTANCE.getConversionA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStatePropagatorAImpl <em>Integrity State Propagator A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStatePropagatorAImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getIntegrityStatePropagatorA()
		 * @generated
		 */
		EClass INTEGRITY_STATE_PROPAGATOR_A = eINSTANCE.getIntegrityStatePropagatorA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanGateAImpl <em>Boolean Gate A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanGateAImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanGateA()
		 * @generated
		 */
		EClass BOOLEAN_GATE_A = eINSTANCE.getBooleanGateA();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_GATE_A__INPUTS = eINSTANCE.getBooleanGateA_Inputs();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanAndImpl <em>Boolean And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanAndImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanAnd()
		 * @generated
		 */
		EClass BOOLEAN_AND = eINSTANCE.getBooleanAnd();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanOrImpl <em>Boolean Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanOrImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanOr()
		 * @generated
		 */
		EClass BOOLEAN_OR = eINSTANCE.getBooleanOr();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanXorImpl <em>Boolean Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanXorImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanXor()
		 * @generated
		 */
		EClass BOOLEAN_XOR = eINSTANCE.getBooleanXor();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanNotImpl <em>Boolean Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanNotImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanNot()
		 * @generated
		 */
		EClass BOOLEAN_NOT = eINSTANCE.getBooleanNot();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_NOT__INPUT = eINSTANCE.getBooleanNot_Input();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateBooleanConversionImpl <em>Integrity State Boolean Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateBooleanConversionImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getIntegrityStateBooleanConversion()
		 * @generated
		 */
		EClass INTEGRITY_STATE_BOOLEAN_CONVERSION = eINSTANCE.getIntegrityStateBooleanConversion();

		/**
		 * The meta object literal for the '<em><b>Input Integrity State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT_INTEGRITY_STATE = eINSTANCE.getIntegrityStateBooleanConversion_InputIntegrityState();

		/**
		 * The meta object literal for the '<em><b>Output Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRITY_STATE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE = eINSTANCE.getIntegrityStateBooleanConversion_OutputBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_BOOLEAN_CONVERSION__INPUT = eINSTANCE.getIntegrityStateBooleanConversion_Input();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeBooleanConversionImpl <em>Failure Mode Boolean Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeBooleanConversionImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailureModeBooleanConversion()
		 * @generated
		 */
		EClass FAILURE_MODE_BOOLEAN_CONVERSION = eINSTANCE.getFailureModeBooleanConversion();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_BOOLEAN_CONVERSION__INPUT = eINSTANCE.getFailureModeBooleanConversion_Input();

		/**
		 * The meta object literal for the '<em><b>Output Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE_BOOLEAN_CONVERSION__OUTPUT_BOOLEAN_VALUE = eINSTANCE.getFailureModeBooleanConversion_OutputBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Input Failure Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_BOOLEAN_CONVERSION__INPUT_FAILURE_MODE = eINSTANCE.getFailureModeBooleanConversion_InputFailureMode();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanFailureModeConversionImpl <em>Boolean Failure Mode Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanFailureModeConversionImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanFailureModeConversion()
		 * @generated
		 */
		EClass BOOLEAN_FAILURE_MODE_CONVERSION = eINSTANCE.getBooleanFailureModeConversion();

		/**
		 * The meta object literal for the '<em><b>Input Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_FAILURE_MODE_CONVERSION__INPUT_BOOLEAN_VALUE = eINSTANCE.getBooleanFailureModeConversion_InputBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_FAILURE_MODE_CONVERSION__INPUT = eINSTANCE.getBooleanFailureModeConversion_Input();

		/**
		 * The meta object literal for the '<em><b>Output Failure Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE = eINSTANCE.getBooleanFailureModeConversion_OutputFailureMode();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateFailureModeConversionImpl <em>Integrity State Failure Mode Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.IntegrityStateFailureModeConversionImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getIntegrityStateFailureModeConversion()
		 * @generated
		 */
		EClass INTEGRITY_STATE_FAILURE_MODE_CONVERSION = eINSTANCE.getIntegrityStateFailureModeConversion();

		/**
		 * The meta object literal for the '<em><b>Input Integrity State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT_INTEGRITY_STATE = eINSTANCE.getIntegrityStateFailureModeConversion_InputIntegrityState();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_FAILURE_MODE_CONVERSION__INPUT = eINSTANCE.getIntegrityStateFailureModeConversion_Input();

		/**
		 * The meta object literal for the '<em><b>Output Failure Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY_STATE_FAILURE_MODE_CONVERSION__OUTPUT_FAILURE_MODE = eINSTANCE.getIntegrityStateFailureModeConversion_OutputFailureMode();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeIntegrityStateConversionImpl <em>Failure Mode Integrity State Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailureModeIntegrityStateConversionImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailureModeIntegrityStateConversion()
		 * @generated
		 */
		EClass FAILURE_MODE_INTEGRITY_STATE_CONVERSION = eINSTANCE.getFailureModeIntegrityStateConversion();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT = eINSTANCE.getFailureModeIntegrityStateConversion_Input();

		/**
		 * The meta object literal for the '<em><b>Output Integrity State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE = eINSTANCE.getFailureModeIntegrityStateConversion_OutputIntegrityState();

		/**
		 * The meta object literal for the '<em><b>Input Failure Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE = eINSTANCE.getFailureModeIntegrityStateConversion_InputFailureMode();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.BooleanIntegrityStateConversionImpl <em>Boolean Integrity State Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.BooleanIntegrityStateConversionImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getBooleanIntegrityStateConversion()
		 * @generated
		 */
		EClass BOOLEAN_INTEGRITY_STATE_CONVERSION = eINSTANCE.getBooleanIntegrityStateConversion();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT = eINSTANCE.getBooleanIntegrityStateConversion_Input();

		/**
		 * The meta object literal for the '<em><b>Input Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_INTEGRITY_STATE_CONVERSION__INPUT_BOOLEAN_VALUE = eINSTANCE.getBooleanIntegrityStateConversion_InputBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Output Integrity State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE = eINSTANCE.getBooleanIntegrityStateConversion_OutputIntegrityState();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationInputImpl <em>Propagation Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagationInputImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagationInput()
		 * @generated
		 */
		EClass PROPAGATION_INPUT = eINSTANCE.getPropagationInput();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_INPUT__SOURCE = eINSTANCE.getPropagationInput_Source();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationOutputImpl <em>Propagation Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagationOutputImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagationOutput()
		 * @generated
		 */
		EClass PROPAGATION_OUTPUT = eINSTANCE.getPropagationOutput();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_OUTPUT__TARGET = eINSTANCE.getPropagationOutput_Target();

		/**
		 * The meta object literal for the '<em><b>Propagated Integrity States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_OUTPUT__PROPAGATED_INTEGRITY_STATES = eINSTANCE.getPropagationOutput_PropagatedIntegrityStates();

		/**
		 * The meta object literal for the '<em><b>Propagated Failure Modes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_OUTPUT__PROPAGATED_FAILURE_MODES = eINSTANCE.getPropagationOutput_PropagatedFailureModes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSourceImpl <em>Propagation Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSourceImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagationSource()
		 * @generated
		 */
		EClass PROPAGATION_SOURCE = eINSTANCE.getPropagationSource();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_SOURCE__SOURCE = eINSTANCE.getPropagationSource_Source();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSinkImpl <em>Propagation Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSinkImpl
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getPropagationSink()
		 * @generated
		 */
		EClass PROPAGATION_SINK = eINSTANCE.getPropagationSink();

		/**
		 * The meta object literal for the '<em><b>Propagated Integrity States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_SINK__PROPAGATED_INTEGRITY_STATES = eINSTANCE.getPropagationSink_PropagatedIntegrityStates();

		/**
		 * The meta object literal for the '<em><b>Propagated Failure Modes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_SINK__PROPAGATED_FAILURE_MODES = eINSTANCE.getPropagationSink_PropagatedFailureModes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE <em>Failure Propagation Generic Type E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE
		 * @see de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationsPackageImpl#getFailurePropagationGenericTypeE()
		 * @generated
		 */
		EEnum FAILURE_PROPAGATION_GENERIC_TYPE_E = eINSTANCE.getFailurePropagationGenericTypeE();

	}

} //FailurePropagationsPackage
