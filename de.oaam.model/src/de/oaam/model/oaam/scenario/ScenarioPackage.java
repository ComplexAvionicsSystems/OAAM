/**
 */
package de.oaam.model.oaam.scenario;

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
 * Architecture wide properties, as well as variants and operation mode definitions.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.scenario.ScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface ScenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v140/scenario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.scenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioPackage eINSTANCE = de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.ModeDependentElementAImpl <em>Mode Dependent Element A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.ModeDependentElementAImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getModeDependentElementA()
	 * @generated
	 */
	int MODE_DEPENDENT_ELEMENT_A = 1;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES = 0;

	/**
	 * The number of structural features of the '<em>Mode Dependent Element A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DEPENDENT_ELEMENT_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mode Dependent Element A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DEPENDENT_ELEMENT_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.ParameterAImpl <em>Parameter A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.ParameterAImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getParameterA()
	 * @generated
	 */
	int PARAMETER_A = 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_A__OPERATION_MODES = MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_A__VARIANTS = MODE_DEPENDENT_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_A_FEATURE_COUNT = MODE_DEPENDENT_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_A_OPERATION_COUNT = MODE_DEPENDENT_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.VariantDependentElementAImpl <em>Variant Dependent Element A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.VariantDependentElementAImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getVariantDependentElementA()
	 * @generated
	 */
	int VARIANT_DEPENDENT_ELEMENT_A = 2;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_DEPENDENT_ELEMENT_A__VARIANTS = 0;

	/**
	 * The number of structural features of the '<em>Variant Dependent Element A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_DEPENDENT_ELEMENT_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variant Dependent Element A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_DEPENDENT_ELEMENT_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.ScenarioContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioContainerAImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getScenarioContainerA()
	 * @generated
	 */
	int SCENARIO_CONTAINER_A = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__PARAMETERS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subscenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A__SUBSCENARIOS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_CONTAINER_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.OperationModeImpl <em>Operation Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.OperationModeImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getOperationMode()
	 * @generated
	 */
	int OPERATION_MODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.ParameterNumericImpl <em>Parameter Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.ParameterNumericImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getParameterNumeric()
	 * @generated
	 */
	int PARAMETER_NUMERIC = 5;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__OPERATION_MODES = PARAMETER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__VARIANTS = PARAMETER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__ID = PARAMETER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__NAME = PARAMETER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__STYLE = PARAMETER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__ATTRIBUTES = PARAMETER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__DOCUMENTATION = PARAMETER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__MODIFIED = PARAMETER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__MODIFIER = PARAMETER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__TRACE_LINK = PARAMETER_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC__VALUE = PARAMETER_A_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Parameter Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC_FEATURE_COUNT = PARAMETER_A_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Parameter Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NUMERIC_OPERATION_COUNT = PARAMETER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl <em>Parameter Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.ParameterBoolImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getParameterBool()
	 * @generated
	 */
	int PARAMETER_BOOL = 6;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__OPERATION_MODES = PARAMETER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__VARIANTS = PARAMETER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__ID = PARAMETER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__NAME = PARAMETER_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__STYLE = PARAMETER_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__ATTRIBUTES = PARAMETER_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__DOCUMENTATION = PARAMETER_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__MODIFIED = PARAMETER_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__MODIFIER = PARAMETER_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__TRACE_LINK = PARAMETER_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL__VALUE = PARAMETER_A_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Parameter Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL_FEATURE_COUNT = PARAMETER_A_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Parameter Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOL_OPERATION_COUNT = PARAMETER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.VariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.VariantImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getVariant()
	 * @generated
	 */
	int VARIANT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.OperationModeReferenceImpl <em>Operation Mode Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.OperationModeReferenceImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getOperationModeReference()
	 * @generated
	 */
	int OPERATION_MODE_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__OPERATION_MODE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE__ACTIVE_PROBABILITY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Mode Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Mode Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REFERENCE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ID = SCENARIO_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = SCENARIO_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STYLE = SCENARIO_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ATTRIBUTES = SCENARIO_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DOCUMENTATION = SCENARIO_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MODIFIED = SCENARIO_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MODIFIER = SCENARIO_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TRACE_LINK = SCENARIO_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PARAMETERS = SCENARIO_CONTAINER_A__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VARIANTS = SCENARIO_CONTAINER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OPERATION_MODES = SCENARIO_CONTAINER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Subscenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SUBSCENARIOS = SCENARIO_CONTAINER_A__SUBSCENARIOS;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = SCENARIO_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = SCENARIO_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.scenario.impl.SubscenarioImpl <em>Subscenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.scenario.impl.SubscenarioImpl
	 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getSubscenario()
	 * @generated
	 */
	int SUBSCENARIO = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__ID = SCENARIO_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__NAME = SCENARIO_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__STYLE = SCENARIO_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__ATTRIBUTES = SCENARIO_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__DOCUMENTATION = SCENARIO_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__MODIFIED = SCENARIO_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__MODIFIER = SCENARIO_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__TRACE_LINK = SCENARIO_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__PARAMETERS = SCENARIO_CONTAINER_A__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__VARIANTS = SCENARIO_CONTAINER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__OPERATION_MODES = SCENARIO_CONTAINER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Subscenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO__SUBSCENARIOS = SCENARIO_CONTAINER_A__SUBSCENARIOS;

	/**
	 * The number of structural features of the '<em>Subscenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO_FEATURE_COUNT = SCENARIO_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subscenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCENARIO_OPERATION_COUNT = SCENARIO_CONTAINER_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.ParameterA <em>Parameter A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter A</em>'.
	 * @see de.oaam.model.oaam.scenario.ParameterA
	 * @generated
	 */
	EClass getParameterA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.ModeDependentElementA <em>Mode Dependent Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Dependent Element A</em>'.
	 * @see de.oaam.model.oaam.scenario.ModeDependentElementA
	 * @generated
	 */
	EClass getModeDependentElementA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.scenario.ModeDependentElementA#getOperationModes <em>Operation Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Modes</em>'.
	 * @see de.oaam.model.oaam.scenario.ModeDependentElementA#getOperationModes()
	 * @see #getModeDependentElementA()
	 * @generated
	 */
	EReference getModeDependentElementA_OperationModes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.VariantDependentElementA <em>Variant Dependent Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Dependent Element A</em>'.
	 * @see de.oaam.model.oaam.scenario.VariantDependentElementA
	 * @generated
	 */
	EClass getVariantDependentElementA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.scenario.VariantDependentElementA#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variants</em>'.
	 * @see de.oaam.model.oaam.scenario.VariantDependentElementA#getVariants()
	 * @see #getVariantDependentElementA()
	 * @generated
	 */
	EReference getVariantDependentElementA_Variants();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.ScenarioContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.scenario.ScenarioContainerA
	 * @generated
	 */
	EClass getScenarioContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.scenario.ScenarioContainerA#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.oaam.model.oaam.scenario.ScenarioContainerA#getParameters()
	 * @see #getScenarioContainerA()
	 * @generated
	 */
	EReference getScenarioContainerA_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.scenario.ScenarioContainerA#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see de.oaam.model.oaam.scenario.ScenarioContainerA#getVariants()
	 * @see #getScenarioContainerA()
	 * @generated
	 */
	EReference getScenarioContainerA_Variants();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.scenario.ScenarioContainerA#getOperationModes <em>Operation Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Modes</em>'.
	 * @see de.oaam.model.oaam.scenario.ScenarioContainerA#getOperationModes()
	 * @see #getScenarioContainerA()
	 * @generated
	 */
	EReference getScenarioContainerA_OperationModes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.scenario.ScenarioContainerA#getSubscenarios <em>Subscenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscenarios</em>'.
	 * @see de.oaam.model.oaam.scenario.ScenarioContainerA#getSubscenarios()
	 * @see #getScenarioContainerA()
	 * @generated
	 */
	EReference getScenarioContainerA_Subscenarios();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.OperationMode <em>Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Mode</em>'.
	 * @see de.oaam.model.oaam.scenario.OperationMode
	 * @generated
	 */
	EClass getOperationMode();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.ParameterNumeric <em>Parameter Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Numeric</em>'.
	 * @see de.oaam.model.oaam.scenario.ParameterNumeric
	 * @generated
	 */
	EClass getParameterNumeric();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.scenario.ParameterNumeric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.oaam.model.oaam.scenario.ParameterNumeric#getValue()
	 * @see #getParameterNumeric()
	 * @generated
	 */
	EAttribute getParameterNumeric_Value();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.ParameterBool <em>Parameter Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Bool</em>'.
	 * @see de.oaam.model.oaam.scenario.ParameterBool
	 * @generated
	 */
	EClass getParameterBool();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.scenario.ParameterBool#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.oaam.model.oaam.scenario.ParameterBool#isValue()
	 * @see #getParameterBool()
	 * @generated
	 */
	EAttribute getParameterBool_Value();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see de.oaam.model.oaam.scenario.Variant
	 * @generated
	 */
	EClass getVariant();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.OperationModeReference <em>Operation Mode Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Mode Reference</em>'.
	 * @see de.oaam.model.oaam.scenario.OperationModeReference
	 * @generated
	 */
	EClass getOperationModeReference();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.scenario.OperationModeReference#getOperationMode <em>Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Mode</em>'.
	 * @see de.oaam.model.oaam.scenario.OperationModeReference#getOperationMode()
	 * @see #getOperationModeReference()
	 * @generated
	 */
	EReference getOperationModeReference_OperationMode();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.scenario.OperationModeReference#getActiveProbability <em>Active Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Probability</em>'.
	 * @see de.oaam.model.oaam.scenario.OperationModeReference#getActiveProbability()
	 * @see #getOperationModeReference()
	 * @generated
	 */
	EAttribute getOperationModeReference_ActiveProbability();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see de.oaam.model.oaam.scenario.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.scenario.Subscenario <em>Subscenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscenario</em>'.
	 * @see de.oaam.model.oaam.scenario.Subscenario
	 * @generated
	 */
	EClass getSubscenario();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScenarioFactory getScenarioFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.ParameterAImpl <em>Parameter A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.ParameterAImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getParameterA()
		 * @generated
		 */
		EClass PARAMETER_A = eINSTANCE.getParameterA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.ModeDependentElementAImpl <em>Mode Dependent Element A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.ModeDependentElementAImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getModeDependentElementA()
		 * @generated
		 */
		EClass MODE_DEPENDENT_ELEMENT_A = eINSTANCE.getModeDependentElementA();

		/**
		 * The meta object literal for the '<em><b>Operation Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES = eINSTANCE.getModeDependentElementA_OperationModes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.VariantDependentElementAImpl <em>Variant Dependent Element A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.VariantDependentElementAImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getVariantDependentElementA()
		 * @generated
		 */
		EClass VARIANT_DEPENDENT_ELEMENT_A = eINSTANCE.getVariantDependentElementA();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_DEPENDENT_ELEMENT_A__VARIANTS = eINSTANCE.getVariantDependentElementA_Variants();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.ScenarioContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioContainerAImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getScenarioContainerA()
		 * @generated
		 */
		EClass SCENARIO_CONTAINER_A = eINSTANCE.getScenarioContainerA();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_CONTAINER_A__PARAMETERS = eINSTANCE.getScenarioContainerA_Parameters();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_CONTAINER_A__VARIANTS = eINSTANCE.getScenarioContainerA_Variants();

		/**
		 * The meta object literal for the '<em><b>Operation Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_CONTAINER_A__OPERATION_MODES = eINSTANCE.getScenarioContainerA_OperationModes();

		/**
		 * The meta object literal for the '<em><b>Subscenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_CONTAINER_A__SUBSCENARIOS = eINSTANCE.getScenarioContainerA_Subscenarios();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.OperationModeImpl <em>Operation Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.OperationModeImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getOperationMode()
		 * @generated
		 */
		EClass OPERATION_MODE = eINSTANCE.getOperationMode();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.ParameterNumericImpl <em>Parameter Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.ParameterNumericImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getParameterNumeric()
		 * @generated
		 */
		EClass PARAMETER_NUMERIC = eINSTANCE.getParameterNumeric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_NUMERIC__VALUE = eINSTANCE.getParameterNumeric_Value();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.ParameterBoolImpl <em>Parameter Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.ParameterBoolImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getParameterBool()
		 * @generated
		 */
		EClass PARAMETER_BOOL = eINSTANCE.getParameterBool();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_BOOL__VALUE = eINSTANCE.getParameterBool_Value();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.VariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.VariantImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getVariant()
		 * @generated
		 */
		EClass VARIANT = eINSTANCE.getVariant();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.OperationModeReferenceImpl <em>Operation Mode Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.OperationModeReferenceImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getOperationModeReference()
		 * @generated
		 */
		EClass OPERATION_MODE_REFERENCE = eINSTANCE.getOperationModeReference();

		/**
		 * The meta object literal for the '<em><b>Operation Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_MODE_REFERENCE__OPERATION_MODE = eINSTANCE.getOperationModeReference_OperationMode();

		/**
		 * The meta object literal for the '<em><b>Active Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_MODE_REFERENCE__ACTIVE_PROBABILITY = eINSTANCE.getOperationModeReference_ActiveProbability();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.scenario.impl.SubscenarioImpl <em>Subscenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.scenario.impl.SubscenarioImpl
		 * @see de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl#getSubscenario()
		 * @generated
		 */
		EClass SUBSCENARIO = eINSTANCE.getSubscenario();

	}

} //ScenarioPackage
