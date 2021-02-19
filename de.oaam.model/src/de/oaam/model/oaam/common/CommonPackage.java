/**
 */
package de.oaam.model.oaam.common;

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
 * The definition of common abstract classes and enumerations. This is not visible in the user model.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v140/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = de.oaam.model.oaam.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.OaamBaseElementAImpl <em>Oaam Base Element A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.OaamBaseElementAImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getOaamBaseElementA()
	 * @generated
	 */
	int OAAM_BASE_ELEMENT_A = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A__NAME = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A__MODIFIED = 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A__MODIFIER = 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A__TRACE_LINK = 7;

	/**
	 * The number of structural features of the '<em>Oaam Base Element A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Oaam Base Element A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAAM_BASE_ELEMENT_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.BoolAImpl <em>Bool A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.BoolAImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolA()
	 * @generated
	 */
	int BOOL_A = 1;

	/**
	 * The number of structural features of the '<em>Bool A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bool A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.AttributeAImpl <em>Attribute A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.AttributeAImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeA()
	 * @generated
	 */
	int ATTRIBUTE_A = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A__ID = OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A__NAME = OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A__STYLE = OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A__ATTRIBUTES = OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A__DOCUMENTATION = OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A__MODIFIED = OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A__MODIFIER = OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A__TRACE_LINK = OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The number of structural features of the '<em>Attribute A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A_FEATURE_COUNT = OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_A_OPERATION_COUNT = OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.AttributeStringImpl <em>Attribute String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.AttributeStringImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeString()
	 * @generated
	 */
	int ATTRIBUTE_STRING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING__ID = ATTRIBUTE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING__NAME = ATTRIBUTE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING__STYLE = ATTRIBUTE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING__ATTRIBUTES = ATTRIBUTE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING__DOCUMENTATION = ATTRIBUTE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING__MODIFIED = ATTRIBUTE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING__MODIFIER = ATTRIBUTE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING__TRACE_LINK = ATTRIBUTE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING__VALUE = ATTRIBUTE_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING_FEATURE_COUNT = ATTRIBUTE_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STRING_OPERATION_COUNT = ATTRIBUTE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.AttributeNumericImpl <em>Attribute Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.AttributeNumericImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeNumeric()
	 * @generated
	 */
	int ATTRIBUTE_NUMERIC = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC__ID = ATTRIBUTE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC__NAME = ATTRIBUTE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC__STYLE = ATTRIBUTE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC__ATTRIBUTES = ATTRIBUTE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC__DOCUMENTATION = ATTRIBUTE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC__MODIFIED = ATTRIBUTE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC__MODIFIER = ATTRIBUTE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC__TRACE_LINK = ATTRIBUTE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC__VALUE = ATTRIBUTE_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC_FEATURE_COUNT = ATTRIBUTE_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NUMERIC_OPERATION_COUNT = ATTRIBUTE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.AttributeContainmentImpl <em>Attribute Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.AttributeContainmentImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeContainment()
	 * @generated
	 */
	int ATTRIBUTE_CONTAINMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT__ID = ATTRIBUTE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT__NAME = ATTRIBUTE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT__STYLE = ATTRIBUTE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT__ATTRIBUTES = ATTRIBUTE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT__DOCUMENTATION = ATTRIBUTE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT__MODIFIED = ATTRIBUTE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT__MODIFIER = ATTRIBUTE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT__TRACE_LINK = ATTRIBUTE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT__VALUE = ATTRIBUTE_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT_FEATURE_COUNT = ATTRIBUTE_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONTAINMENT_OPERATION_COUNT = ATTRIBUTE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.AttributeReferenceImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeReference()
	 * @generated
	 */
	int ATTRIBUTE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__ID = ATTRIBUTE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__NAME = ATTRIBUTE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__STYLE = ATTRIBUTE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__ATTRIBUTES = ATTRIBUTE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__DOCUMENTATION = ATTRIBUTE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__MODIFIED = ATTRIBUTE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__MODIFIER = ATTRIBUTE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__TRACE_LINK = ATTRIBUTE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__VALUE = ATTRIBUTE_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE_FEATURE_COUNT = ATTRIBUTE_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE_OPERATION_COUNT = ATTRIBUTE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.BoolOperationImpl <em>Bool Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.BoolOperationImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolOperation()
	 * @generated
	 */
	int BOOL_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__ID = BOOL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__NAME = BOOL_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__STYLE = BOOL_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__ATTRIBUTES = BOOL_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__DOCUMENTATION = BOOL_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__MODIFIED = BOOL_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__MODIFIER = BOOL_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__TRACE_LINK = BOOL_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__TYPE = BOOL_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__LEFT = BOOL_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION__RIGHT = BOOL_A_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Bool Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION_FEATURE_COUNT = BOOL_A_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Bool Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION_OPERATION_COUNT = BOOL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.BoolNotImpl <em>Bool Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.BoolNotImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolNot()
	 * @generated
	 */
	int BOOL_NOT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT__ID = BOOL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT__NAME = BOOL_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT__STYLE = BOOL_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT__ATTRIBUTES = BOOL_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT__DOCUMENTATION = BOOL_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT__MODIFIED = BOOL_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT__MODIFIER = BOOL_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT__TRACE_LINK = BOOL_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT__IN = BOOL_A_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Bool Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT_FEATURE_COUNT = BOOL_A_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Bool Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_NOT_OPERATION_COUNT = BOOL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.DataTypeAImpl <em>Data Type A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.DataTypeAImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getDataTypeA()
	 * @generated
	 */
	int DATA_TYPE_A = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A__ID = OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A__NAME = OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A__STYLE = OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A__ATTRIBUTES = OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A__DOCUMENTATION = OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A__MODIFIED = OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A__MODIFIER = OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A__TRACE_LINK = OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The number of structural features of the '<em>Data Type A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A_FEATURE_COUNT = OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_A_OPERATION_COUNT = OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.IntegerImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ID = DATA_TYPE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NAME = DATA_TYPE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__STYLE = DATA_TYPE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ATTRIBUTES = DATA_TYPE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__DOCUMENTATION = DATA_TYPE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__MODIFIED = DATA_TYPE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__MODIFIER = DATA_TYPE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__TRACE_LINK = DATA_TYPE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__SIGNED = DATA_TYPE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NBits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NBITS = DATA_TYPE_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Endianess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ENDIANESS = DATA_TYPE_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = DATA_TYPE_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = DATA_TYPE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.ArrayImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ID = DATA_TYPE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = DATA_TYPE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__STYLE = DATA_TYPE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ATTRIBUTES = DATA_TYPE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DOCUMENTATION = DATA_TYPE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__MODIFIED = DATA_TYPE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__MODIFIER = DATA_TYPE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TRACE_LINK = DATA_TYPE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>NElements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NELEMENTS = DATA_TYPE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TYPE = DATA_TYPE_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ALIGNMENT = DATA_TYPE_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = DATA_TYPE_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = DATA_TYPE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.StructImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__ID = DATA_TYPE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__NAME = DATA_TYPE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__STYLE = DATA_TYPE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__ATTRIBUTES = DATA_TYPE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__DOCUMENTATION = DATA_TYPE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__MODIFIED = DATA_TYPE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__MODIFIER = DATA_TYPE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__TRACE_LINK = DATA_TYPE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__ALIGNMENT = DATA_TYPE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__FIELDS = DATA_TYPE_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inherits From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__INHERITS_FROM = DATA_TYPE_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__IS_ABSTRACT = DATA_TYPE_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = DATA_TYPE_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_OPERATION_COUNT = DATA_TYPE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.FloatingPointImpl <em>Floating Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.FloatingPointImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getFloatingPoint()
	 * @generated
	 */
	int FLOATING_POINT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__ID = DATA_TYPE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__NAME = DATA_TYPE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__STYLE = DATA_TYPE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__ATTRIBUTES = DATA_TYPE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__DOCUMENTATION = DATA_TYPE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__MODIFIED = DATA_TYPE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__MODIFIER = DATA_TYPE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__TRACE_LINK = DATA_TYPE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>NBits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__NBITS = DATA_TYPE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endianess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT__ENDIANESS = DATA_TYPE_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floating Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_FEATURE_COUNT = DATA_TYPE_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Floating Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_OPERATION_COUNT = DATA_TYPE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.ByteImpl <em>Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.ByteImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getByte()
	 * @generated
	 */
	int BYTE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__ID = DATA_TYPE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__NAME = DATA_TYPE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__STYLE = DATA_TYPE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__ATTRIBUTES = DATA_TYPE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__DOCUMENTATION = DATA_TYPE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__MODIFIED = DATA_TYPE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__MODIFIER = DATA_TYPE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__TRACE_LINK = DATA_TYPE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>NBits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__NBITS = DATA_TYPE_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_FEATURE_COUNT = DATA_TYPE_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_OPERATION_COUNT = DATA_TYPE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.CharacterImpl <em>Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.CharacterImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__ID = DATA_TYPE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__NAME = DATA_TYPE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__STYLE = DATA_TYPE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__ATTRIBUTES = DATA_TYPE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__DOCUMENTATION = DATA_TYPE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__MODIFIED = DATA_TYPE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__MODIFIER = DATA_TYPE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__TRACE_LINK = DATA_TYPE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__ENCODING = DATA_TYPE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NBits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__NBITS = DATA_TYPE_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = DATA_TYPE_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OPERATION_COUNT = DATA_TYPE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.BooleanImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ID = DATA_TYPE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = DATA_TYPE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__STYLE = DATA_TYPE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ATTRIBUTES = DATA_TYPE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DOCUMENTATION = DATA_TYPE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__MODIFIED = DATA_TYPE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__MODIFIER = DATA_TYPE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__TRACE_LINK = DATA_TYPE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>NBits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NBITS = DATA_TYPE_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATA_TYPE_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = DATA_TYPE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.impl.SystemBelongingElementAImpl <em>System Belonging Element A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.impl.SystemBelongingElementAImpl
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getSystemBelongingElementA()
	 * @generated
	 */
	int SYSTEM_BELONGING_ELEMENT_A = 17;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BELONGING_ELEMENT_A__BELONGS_TO = 0;

	/**
	 * The number of structural features of the '<em>System Belonging Element A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BELONGING_ELEMENT_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Belonging Element A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BELONGING_ELEMENT_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.BoolOperationTypesE <em>Bool Operation Types E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.BoolOperationTypesE
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolOperationTypesE()
	 * @generated
	 */
	int BOOL_OPERATION_TYPES_E = 18;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.IntegretyStateE <em>Integrety State E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getIntegretyStateE()
	 * @generated
	 */
	int INTEGRETY_STATE_E = 19;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.common.EndianessE <em>Endianess E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.common.EndianessE
	 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getEndianessE()
	 * @generated
	 */
	int ENDIANESS_E = 20;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.OaamBaseElementA <em>Oaam Base Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oaam Base Element A</em>'.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA
	 * @generated
	 */
	EClass getOaamBaseElementA();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.OaamBaseElementA#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA#getId()
	 * @see #getOaamBaseElementA()
	 * @generated
	 */
	EAttribute getOaamBaseElementA_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.OaamBaseElementA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA#getName()
	 * @see #getOaamBaseElementA()
	 * @generated
	 */
	EAttribute getOaamBaseElementA_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.OaamBaseElementA#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA#getStyle()
	 * @see #getOaamBaseElementA()
	 * @generated
	 */
	EAttribute getOaamBaseElementA_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.common.OaamBaseElementA#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA#getAttributes()
	 * @see #getOaamBaseElementA()
	 * @generated
	 */
	EReference getOaamBaseElementA_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.OaamBaseElementA#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA#getDocumentation()
	 * @see #getOaamBaseElementA()
	 * @generated
	 */
	EAttribute getOaamBaseElementA_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.OaamBaseElementA#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA#getModified()
	 * @see #getOaamBaseElementA()
	 * @generated
	 */
	EAttribute getOaamBaseElementA_Modified();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.OaamBaseElementA#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA#getModifier()
	 * @see #getOaamBaseElementA()
	 * @generated
	 */
	EAttribute getOaamBaseElementA_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.OaamBaseElementA#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Link</em>'.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA#getTraceLink()
	 * @see #getOaamBaseElementA()
	 * @generated
	 */
	EAttribute getOaamBaseElementA_TraceLink();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.BoolA <em>Bool A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool A</em>'.
	 * @see de.oaam.model.oaam.common.BoolA
	 * @generated
	 */
	EClass getBoolA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.AttributeA <em>Attribute A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute A</em>'.
	 * @see de.oaam.model.oaam.common.AttributeA
	 * @generated
	 */
	EClass getAttributeA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.AttributeString <em>Attribute String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute String</em>'.
	 * @see de.oaam.model.oaam.common.AttributeString
	 * @generated
	 */
	EClass getAttributeString();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.AttributeString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.oaam.model.oaam.common.AttributeString#getValue()
	 * @see #getAttributeString()
	 * @generated
	 */
	EAttribute getAttributeString_Value();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.AttributeNumeric <em>Attribute Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Numeric</em>'.
	 * @see de.oaam.model.oaam.common.AttributeNumeric
	 * @generated
	 */
	EClass getAttributeNumeric();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.AttributeNumeric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.oaam.model.oaam.common.AttributeNumeric#getValue()
	 * @see #getAttributeNumeric()
	 * @generated
	 */
	EAttribute getAttributeNumeric_Value();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.AttributeContainment <em>Attribute Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Containment</em>'.
	 * @see de.oaam.model.oaam.common.AttributeContainment
	 * @generated
	 */
	EClass getAttributeContainment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.common.AttributeContainment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see de.oaam.model.oaam.common.AttributeContainment#getValue()
	 * @see #getAttributeContainment()
	 * @generated
	 */
	EReference getAttributeContainment_Value();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.AttributeReference <em>Attribute Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Reference</em>'.
	 * @see de.oaam.model.oaam.common.AttributeReference
	 * @generated
	 */
	EClass getAttributeReference();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.common.AttributeReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see de.oaam.model.oaam.common.AttributeReference#getValue()
	 * @see #getAttributeReference()
	 * @generated
	 */
	EReference getAttributeReference_Value();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.BoolOperation <em>Bool Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Operation</em>'.
	 * @see de.oaam.model.oaam.common.BoolOperation
	 * @generated
	 */
	EClass getBoolOperation();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.BoolOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oaam.model.oaam.common.BoolOperation#getType()
	 * @see #getBoolOperation()
	 * @generated
	 */
	EAttribute getBoolOperation_Type();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.common.BoolOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see de.oaam.model.oaam.common.BoolOperation#getLeft()
	 * @see #getBoolOperation()
	 * @generated
	 */
	EReference getBoolOperation_Left();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.common.BoolOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see de.oaam.model.oaam.common.BoolOperation#getRight()
	 * @see #getBoolOperation()
	 * @generated
	 */
	EReference getBoolOperation_Right();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.BoolNot <em>Bool Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Not</em>'.
	 * @see de.oaam.model.oaam.common.BoolNot
	 * @generated
	 */
	EClass getBoolNot();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.common.BoolNot#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see de.oaam.model.oaam.common.BoolNot#getIn()
	 * @see #getBoolNot()
	 * @generated
	 */
	EReference getBoolNot_In();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.DataTypeA <em>Data Type A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type A</em>'.
	 * @see de.oaam.model.oaam.common.DataTypeA
	 * @generated
	 */
	EClass getDataTypeA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see de.oaam.model.oaam.common.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Integer#isSigned <em>Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signed</em>'.
	 * @see de.oaam.model.oaam.common.Integer#isSigned()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Signed();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Integer#getNBits <em>NBits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NBits</em>'.
	 * @see de.oaam.model.oaam.common.Integer#getNBits()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_NBits();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Integer#getEndianess <em>Endianess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endianess</em>'.
	 * @see de.oaam.model.oaam.common.Integer#getEndianess()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Endianess();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see de.oaam.model.oaam.common.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Array#getNElements <em>NElements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NElements</em>'.
	 * @see de.oaam.model.oaam.common.Array#getNElements()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_NElements();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.common.Array#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.common.Array#getType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Array#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see de.oaam.model.oaam.common.Array#getAlignment()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Alignment();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see de.oaam.model.oaam.common.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Struct#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see de.oaam.model.oaam.common.Struct#getAlignment()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_Alignment();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.common.Struct#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see de.oaam.model.oaam.common.Struct#getFields()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Fields();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.common.Struct#getInheritsFrom <em>Inherits From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inherits From</em>'.
	 * @see de.oaam.model.oaam.common.Struct#getInheritsFrom()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_InheritsFrom();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Struct#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see de.oaam.model.oaam.common.Struct#isIsAbstract()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_IsAbstract();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.FloatingPoint <em>Floating Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Point</em>'.
	 * @see de.oaam.model.oaam.common.FloatingPoint
	 * @generated
	 */
	EClass getFloatingPoint();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.FloatingPoint#getNBits <em>NBits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NBits</em>'.
	 * @see de.oaam.model.oaam.common.FloatingPoint#getNBits()
	 * @see #getFloatingPoint()
	 * @generated
	 */
	EAttribute getFloatingPoint_NBits();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.FloatingPoint#getEndianess <em>Endianess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endianess</em>'.
	 * @see de.oaam.model.oaam.common.FloatingPoint#getEndianess()
	 * @see #getFloatingPoint()
	 * @generated
	 */
	EAttribute getFloatingPoint_Endianess();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.Byte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte</em>'.
	 * @see de.oaam.model.oaam.common.Byte
	 * @generated
	 */
	EClass getByte();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Byte#getNBits <em>NBits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NBits</em>'.
	 * @see de.oaam.model.oaam.common.Byte#getNBits()
	 * @see #getByte()
	 * @generated
	 */
	EAttribute getByte_NBits();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character</em>'.
	 * @see de.oaam.model.oaam.common.Character
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Character#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see de.oaam.model.oaam.common.Character#getEncoding()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Character#getNBits <em>NBits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NBits</em>'.
	 * @see de.oaam.model.oaam.common.Character#getNBits()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_NBits();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see de.oaam.model.oaam.common.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.common.Boolean#getNBits <em>NBits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NBits</em>'.
	 * @see de.oaam.model.oaam.common.Boolean#getNBits()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_NBits();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.common.SystemBelongingElementA <em>System Belonging Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Belonging Element A</em>'.
	 * @see de.oaam.model.oaam.common.SystemBelongingElementA
	 * @generated
	 */
	EClass getSystemBelongingElementA();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.common.SystemBelongingElementA#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see de.oaam.model.oaam.common.SystemBelongingElementA#getBelongsTo()
	 * @see #getSystemBelongingElementA()
	 * @generated
	 */
	EReference getSystemBelongingElementA_BelongsTo();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.common.BoolOperationTypesE <em>Bool Operation Types E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bool Operation Types E</em>'.
	 * @see de.oaam.model.oaam.common.BoolOperationTypesE
	 * @generated
	 */
	EEnum getBoolOperationTypesE();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.common.IntegretyStateE <em>Integrety State E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integrety State E</em>'.
	 * @see de.oaam.model.oaam.common.IntegretyStateE
	 * @generated
	 */
	EEnum getIntegretyStateE();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.common.EndianessE <em>Endianess E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endianess E</em>'.
	 * @see de.oaam.model.oaam.common.EndianessE
	 * @generated
	 */
	EEnum getEndianessE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.OaamBaseElementAImpl <em>Oaam Base Element A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.OaamBaseElementAImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getOaamBaseElementA()
		 * @generated
		 */
		EClass OAAM_BASE_ELEMENT_A = eINSTANCE.getOaamBaseElementA();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAAM_BASE_ELEMENT_A__ID = eINSTANCE.getOaamBaseElementA_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAAM_BASE_ELEMENT_A__NAME = eINSTANCE.getOaamBaseElementA_Name();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAAM_BASE_ELEMENT_A__STYLE = eINSTANCE.getOaamBaseElementA_Style();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAAM_BASE_ELEMENT_A__ATTRIBUTES = eINSTANCE.getOaamBaseElementA_Attributes();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAAM_BASE_ELEMENT_A__DOCUMENTATION = eINSTANCE.getOaamBaseElementA_Documentation();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAAM_BASE_ELEMENT_A__MODIFIED = eINSTANCE.getOaamBaseElementA_Modified();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAAM_BASE_ELEMENT_A__MODIFIER = eINSTANCE.getOaamBaseElementA_Modifier();

		/**
		 * The meta object literal for the '<em><b>Trace Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAAM_BASE_ELEMENT_A__TRACE_LINK = eINSTANCE.getOaamBaseElementA_TraceLink();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.BoolAImpl <em>Bool A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.BoolAImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolA()
		 * @generated
		 */
		EClass BOOL_A = eINSTANCE.getBoolA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.AttributeAImpl <em>Attribute A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.AttributeAImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeA()
		 * @generated
		 */
		EClass ATTRIBUTE_A = eINSTANCE.getAttributeA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.AttributeStringImpl <em>Attribute String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.AttributeStringImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeString()
		 * @generated
		 */
		EClass ATTRIBUTE_STRING = eINSTANCE.getAttributeString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_STRING__VALUE = eINSTANCE.getAttributeString_Value();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.AttributeNumericImpl <em>Attribute Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.AttributeNumericImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeNumeric()
		 * @generated
		 */
		EClass ATTRIBUTE_NUMERIC = eINSTANCE.getAttributeNumeric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NUMERIC__VALUE = eINSTANCE.getAttributeNumeric_Value();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.AttributeContainmentImpl <em>Attribute Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.AttributeContainmentImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeContainment()
		 * @generated
		 */
		EClass ATTRIBUTE_CONTAINMENT = eINSTANCE.getAttributeContainment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONTAINMENT__VALUE = eINSTANCE.getAttributeContainment_Value();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.AttributeReferenceImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getAttributeReference()
		 * @generated
		 */
		EClass ATTRIBUTE_REFERENCE = eINSTANCE.getAttributeReference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REFERENCE__VALUE = eINSTANCE.getAttributeReference_Value();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.BoolOperationImpl <em>Bool Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.BoolOperationImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolOperation()
		 * @generated
		 */
		EClass BOOL_OPERATION = eINSTANCE.getBoolOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_OPERATION__TYPE = eINSTANCE.getBoolOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_OPERATION__LEFT = eINSTANCE.getBoolOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_OPERATION__RIGHT = eINSTANCE.getBoolOperation_Right();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.BoolNotImpl <em>Bool Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.BoolNotImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolNot()
		 * @generated
		 */
		EClass BOOL_NOT = eINSTANCE.getBoolNot();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_NOT__IN = eINSTANCE.getBoolNot_In();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.DataTypeAImpl <em>Data Type A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.DataTypeAImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getDataTypeA()
		 * @generated
		 */
		EClass DATA_TYPE_A = eINSTANCE.getDataTypeA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.IntegerImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Signed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__SIGNED = eINSTANCE.getInteger_Signed();

		/**
		 * The meta object literal for the '<em><b>NBits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__NBITS = eINSTANCE.getInteger_NBits();

		/**
		 * The meta object literal for the '<em><b>Endianess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__ENDIANESS = eINSTANCE.getInteger_Endianess();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.ArrayImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>NElements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__NELEMENTS = eINSTANCE.getArray_NElements();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__TYPE = eINSTANCE.getArray_Type();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__ALIGNMENT = eINSTANCE.getArray_Alignment();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.StructImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__ALIGNMENT = eINSTANCE.getStruct_Alignment();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__FIELDS = eINSTANCE.getStruct_Fields();

		/**
		 * The meta object literal for the '<em><b>Inherits From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__INHERITS_FROM = eINSTANCE.getStruct_InheritsFrom();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__IS_ABSTRACT = eINSTANCE.getStruct_IsAbstract();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.FloatingPointImpl <em>Floating Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.FloatingPointImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getFloatingPoint()
		 * @generated
		 */
		EClass FLOATING_POINT = eINSTANCE.getFloatingPoint();

		/**
		 * The meta object literal for the '<em><b>NBits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_POINT__NBITS = eINSTANCE.getFloatingPoint_NBits();

		/**
		 * The meta object literal for the '<em><b>Endianess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_POINT__ENDIANESS = eINSTANCE.getFloatingPoint_Endianess();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.ByteImpl <em>Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.ByteImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getByte()
		 * @generated
		 */
		EClass BYTE = eINSTANCE.getByte();

		/**
		 * The meta object literal for the '<em><b>NBits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BYTE__NBITS = eINSTANCE.getByte_NBits();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.CharacterImpl <em>Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.CharacterImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__ENCODING = eINSTANCE.getCharacter_Encoding();

		/**
		 * The meta object literal for the '<em><b>NBits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__NBITS = eINSTANCE.getCharacter_NBits();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.BooleanImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>NBits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__NBITS = eINSTANCE.getBoolean_NBits();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.impl.SystemBelongingElementAImpl <em>System Belonging Element A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.impl.SystemBelongingElementAImpl
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getSystemBelongingElementA()
		 * @generated
		 */
		EClass SYSTEM_BELONGING_ELEMENT_A = eINSTANCE.getSystemBelongingElementA();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BELONGING_ELEMENT_A__BELONGS_TO = eINSTANCE.getSystemBelongingElementA_BelongsTo();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.BoolOperationTypesE <em>Bool Operation Types E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.BoolOperationTypesE
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getBoolOperationTypesE()
		 * @generated
		 */
		EEnum BOOL_OPERATION_TYPES_E = eINSTANCE.getBoolOperationTypesE();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.IntegretyStateE <em>Integrety State E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.IntegretyStateE
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getIntegretyStateE()
		 * @generated
		 */
		EEnum INTEGRETY_STATE_E = eINSTANCE.getIntegretyStateE();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.common.EndianessE <em>Endianess E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.common.EndianessE
		 * @see de.oaam.model.oaam.common.impl.CommonPackageImpl#getEndianessE()
		 * @generated
		 */
		EEnum ENDIANESS_E = eINSTANCE.getEndianessE();

	}

} //CommonPackage
