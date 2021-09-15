/**
 */
package de.oaam.model.oaam.systems;

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
 * High-level and not executable description of systems including physical informations.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.systems.SystemsFactory
 * @model kind="package"
 * @generated
 */
public interface SystemsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "systems";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v160/systems";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.systems";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemsPackage eINSTANCE = de.oaam.model.oaam.systems.impl.SystemsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.SystemsContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.SystemsContainerAImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getSystemsContainerA()
	 * @generated
	 */
	int SYSTEMS_CONTAINER_A = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__SYSTEMS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Information Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__INFORMATION_FLOWS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Segregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__SUBSYSTEMS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.SystemsImpl <em>Systems</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.SystemsImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getSystems()
	 * @generated
	 */
	int SYSTEMS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__ID = SYSTEMS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__NAME = SYSTEMS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__STYLE = SYSTEMS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__ATTRIBUTES = SYSTEMS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__DOCUMENTATION = SYSTEMS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__MODIFIED = SYSTEMS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__MODIFIER = SYSTEMS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__TRACE_LINK = SYSTEMS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__OPERATION_MODES = SYSTEMS_CONTAINER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__VARIANTS = SYSTEMS_CONTAINER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__SYSTEMS = SYSTEMS_CONTAINER_A__SYSTEMS;

	/**
	 * The feature id for the '<em><b>Information Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__INFORMATION_FLOWS = SYSTEMS_CONTAINER_A__INFORMATION_FLOWS;

	/**
	 * The feature id for the '<em><b>Input Segregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__INPUT_SEGREGATIONS = SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS__SUBSYSTEMS = SYSTEMS_CONTAINER_A__SUBSYSTEMS;

	/**
	 * The number of structural features of the '<em>Systems</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_FEATURE_COUNT = SYSTEMS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Systems</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_OPERATION_COUNT = SYSTEMS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.SubsystemImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ID = SYSTEMS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__NAME = SYSTEMS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__STYLE = SYSTEMS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ATTRIBUTES = SYSTEMS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__DOCUMENTATION = SYSTEMS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__MODIFIED = SYSTEMS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__MODIFIER = SYSTEMS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__TRACE_LINK = SYSTEMS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__OPERATION_MODES = SYSTEMS_CONTAINER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__VARIANTS = SYSTEMS_CONTAINER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__SYSTEMS = SYSTEMS_CONTAINER_A__SYSTEMS;

	/**
	 * The feature id for the '<em><b>Information Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__INFORMATION_FLOWS = SYSTEMS_CONTAINER_A__INFORMATION_FLOWS;

	/**
	 * The feature id for the '<em><b>Input Segregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__INPUT_SEGREGATIONS = SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__SUBSYSTEMS = SYSTEMS_CONTAINER_A__SUBSYSTEMS;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = SYSTEMS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_OPERATION_COUNT = SYSTEMS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.SystemImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = SYSTEMS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = SYSTEMS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STYLE = SYSTEMS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ATTRIBUTES = SYSTEMS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DOCUMENTATION = SYSTEMS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MODIFIED = SYSTEMS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MODIFIER = SYSTEMS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TRACE_LINK = SYSTEMS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OPERATION_MODES = SYSTEMS_CONTAINER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VARIANTS = SYSTEMS_CONTAINER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEMS = SYSTEMS_CONTAINER_A__SYSTEMS;

	/**
	 * The feature id for the '<em><b>Information Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INFORMATION_FLOWS = SYSTEMS_CONTAINER_A__INFORMATION_FLOWS;

	/**
	 * The feature id for the '<em><b>Input Segregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INPUT_SEGREGATIONS = SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUBSYSTEMS = SYSTEMS_CONTAINER_A__SUBSYSTEMS;

	/**
	 * The feature id for the '<em><b>Provided Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDED_OUTPUTS = SYSTEMS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REQUIRED_INPUTS = SYSTEMS_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = SYSTEMS_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = SYSTEMS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.RequiredInformationAImpl <em>Required Information A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.RequiredInformationAImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getRequiredInformationA()
	 * @generated
	 */
	int REQUIRED_INFORMATION_A = 4;

	/**
	 * The number of structural features of the '<em>Required Information A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INFORMATION_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Required Information A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INFORMATION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.ProvidedInformationAImpl <em>Provided Information A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.ProvidedInformationAImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getProvidedInformationA()
	 * @generated
	 */
	int PROVIDED_INFORMATION_A = 5;

	/**
	 * The number of structural features of the '<em>Provided Information A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INFORMATION_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Provided Information A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INFORMATION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.InformationFlowImpl <em>Information Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.InformationFlowImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformationFlow()
	 * @generated
	 */
	int INFORMATION_FLOW = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__OPERATION_MODES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__VARIANTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__FROM = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__TO = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.InformationSignalImpl <em>Information Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.InformationSignalImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformationSignal()
	 * @generated
	 */
	int INFORMATION_SIGNAL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__ID = PROVIDED_INFORMATION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__NAME = PROVIDED_INFORMATION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__STYLE = PROVIDED_INFORMATION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__ATTRIBUTES = PROVIDED_INFORMATION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__DOCUMENTATION = PROVIDED_INFORMATION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__MODIFIED = PROVIDED_INFORMATION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__MODIFIER = PROVIDED_INFORMATION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__TRACE_LINK = PROVIDED_INFORMATION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__OPERATION_MODES = PROVIDED_INFORMATION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__VARIANTS = PROVIDED_INFORMATION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__RATE = PROVIDED_INFORMATION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__LATENCY = PROVIDED_INFORMATION_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__ACCURACY = PROVIDED_INFORMATION_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__RESOLUTION = PROVIDED_INFORMATION_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL__UNIT = PROVIDED_INFORMATION_A_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Information Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL_FEATURE_COUNT = PROVIDED_INFORMATION_A_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Information Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SIGNAL_OPERATION_COUNT = PROVIDED_INFORMATION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl <em>Information Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.InformationMaterialImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformationMaterial()
	 * @generated
	 */
	int INFORMATION_MATERIAL = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__ID = PROVIDED_INFORMATION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__NAME = PROVIDED_INFORMATION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__STYLE = PROVIDED_INFORMATION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__ATTRIBUTES = PROVIDED_INFORMATION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__DOCUMENTATION = PROVIDED_INFORMATION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__MODIFIED = PROVIDED_INFORMATION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__MODIFIER = PROVIDED_INFORMATION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__TRACE_LINK = PROVIDED_INFORMATION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__OPERATION_MODES = PROVIDED_INFORMATION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__VARIANTS = PROVIDED_INFORMATION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__DENSITY = PROVIDED_INFORMATION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL__VELOCITY = PROVIDED_INFORMATION_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Information Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL_FEATURE_COUNT = PROVIDED_INFORMATION_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Information Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MATERIAL_OPERATION_COUNT = PROVIDED_INFORMATION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.InformationPowerImpl <em>Information Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.InformationPowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformationPower()
	 * @generated
	 */
	int INFORMATION_POWER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__ID = PROVIDED_INFORMATION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__NAME = PROVIDED_INFORMATION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__STYLE = PROVIDED_INFORMATION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__ATTRIBUTES = PROVIDED_INFORMATION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__DOCUMENTATION = PROVIDED_INFORMATION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__MODIFIED = PROVIDED_INFORMATION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__MODIFIER = PROVIDED_INFORMATION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__TRACE_LINK = PROVIDED_INFORMATION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__VARIANTS = PROVIDED_INFORMATION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__OPERATION_MODES = PROVIDED_INFORMATION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER__POWER = PROVIDED_INFORMATION_A_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Information Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER_FEATURE_COUNT = PROVIDED_INFORMATION_A_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Information Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_POWER_OPERATION_COUNT = PROVIDED_INFORMATION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.ElectricPowerImpl <em>Electric Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.ElectricPowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getElectricPower()
	 * @generated
	 */
	int ELECTRIC_POWER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__ID = INFORMATION_POWER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__NAME = INFORMATION_POWER__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__STYLE = INFORMATION_POWER__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__ATTRIBUTES = INFORMATION_POWER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__DOCUMENTATION = INFORMATION_POWER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__MODIFIED = INFORMATION_POWER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__MODIFIER = INFORMATION_POWER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__TRACE_LINK = INFORMATION_POWER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__VARIANTS = INFORMATION_POWER__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__OPERATION_MODES = INFORMATION_POWER__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__POWER = INFORMATION_POWER__POWER;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__FREQUENCY = INFORMATION_POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NPhases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__NPHASES = INFORMATION_POWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__VOLTAGE = INFORMATION_POWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__CURRENT = INFORMATION_POWER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Electric Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER_FEATURE_COUNT = INFORMATION_POWER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Electric Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER_OPERATION_COUNT = INFORMATION_POWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.HydraulicPowerImpl <em>Hydraulic Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.HydraulicPowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getHydraulicPower()
	 * @generated
	 */
	int HYDRAULIC_POWER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__ID = INFORMATION_POWER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__NAME = INFORMATION_POWER__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__STYLE = INFORMATION_POWER__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__ATTRIBUTES = INFORMATION_POWER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__DOCUMENTATION = INFORMATION_POWER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__MODIFIED = INFORMATION_POWER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__MODIFIER = INFORMATION_POWER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__TRACE_LINK = INFORMATION_POWER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__VARIANTS = INFORMATION_POWER__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__OPERATION_MODES = INFORMATION_POWER__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__POWER = INFORMATION_POWER__POWER;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__PRESSURE = INFORMATION_POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mass Flow Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__MASS_FLOW_RATE = INFORMATION_POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hydraulic Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER_FEATURE_COUNT = INFORMATION_POWER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hydraulic Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER_OPERATION_COUNT = INFORMATION_POWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.RotaryPowerImpl <em>Rotary Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.RotaryPowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getRotaryPower()
	 * @generated
	 */
	int ROTARY_POWER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__ID = INFORMATION_POWER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__NAME = INFORMATION_POWER__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__STYLE = INFORMATION_POWER__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__ATTRIBUTES = INFORMATION_POWER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__DOCUMENTATION = INFORMATION_POWER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__MODIFIED = INFORMATION_POWER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__MODIFIER = INFORMATION_POWER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__TRACE_LINK = INFORMATION_POWER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__VARIANTS = INFORMATION_POWER__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__OPERATION_MODES = INFORMATION_POWER__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__POWER = INFORMATION_POWER__POWER;

	/**
	 * The feature id for the '<em><b>Momentum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__MOMENTUM = INFORMATION_POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__ANGULAR_VELOCITY = INFORMATION_POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotary Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER_FEATURE_COUNT = INFORMATION_POWER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotary Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER_OPERATION_COUNT = INFORMATION_POWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.LinearPowerImpl <em>Linear Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.LinearPowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getLinearPower()
	 * @generated
	 */
	int LINEAR_POWER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__ID = INFORMATION_POWER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__NAME = INFORMATION_POWER__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__STYLE = INFORMATION_POWER__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__ATTRIBUTES = INFORMATION_POWER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__DOCUMENTATION = INFORMATION_POWER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__MODIFIED = INFORMATION_POWER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__MODIFIER = INFORMATION_POWER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__TRACE_LINK = INFORMATION_POWER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__VARIANTS = INFORMATION_POWER__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__OPERATION_MODES = INFORMATION_POWER__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__POWER = INFORMATION_POWER__POWER;

	/**
	 * The feature id for the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__FORCE = INFORMATION_POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__VELOCITY = INFORMATION_POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linear Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER_FEATURE_COUNT = INFORMATION_POWER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Linear Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER_OPERATION_COUNT = INFORMATION_POWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.InputSegregationImpl <em>Input Segregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.InputSegregationImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInputSegregation()
	 * @generated
	 */
	int INPUT_SEGREGATION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Dissimilar Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__DISSIMILAR_SOURCE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dissimilar Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__DISSIMILAR_ROUTE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dissimilar Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__DISSIMILAR_TECHNOLOGY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__GROUP_A = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__GROUP_B = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Input Segregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Input Segregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.SystemsContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.systems.SystemsContainerA
	 * @generated
	 */
	EClass getSystemsContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.systems.SystemsContainerA#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systems</em>'.
	 * @see de.oaam.model.oaam.systems.SystemsContainerA#getSystems()
	 * @see #getSystemsContainerA()
	 * @generated
	 */
	EReference getSystemsContainerA_Systems();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.systems.SystemsContainerA#getInformationFlows <em>Information Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information Flows</em>'.
	 * @see de.oaam.model.oaam.systems.SystemsContainerA#getInformationFlows()
	 * @see #getSystemsContainerA()
	 * @generated
	 */
	EReference getSystemsContainerA_InformationFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.systems.SystemsContainerA#getInputSegregations <em>Input Segregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Segregations</em>'.
	 * @see de.oaam.model.oaam.systems.SystemsContainerA#getInputSegregations()
	 * @see #getSystemsContainerA()
	 * @generated
	 */
	EReference getSystemsContainerA_InputSegregations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.systems.SystemsContainerA#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsystems</em>'.
	 * @see de.oaam.model.oaam.systems.SystemsContainerA#getSubsystems()
	 * @see #getSystemsContainerA()
	 * @generated
	 */
	EReference getSystemsContainerA_Subsystems();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.Systems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systems</em>'.
	 * @see de.oaam.model.oaam.systems.Systems
	 * @generated
	 */
	EClass getSystems();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see de.oaam.model.oaam.systems.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see de.oaam.model.oaam.systems.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.systems.System#getProvidedOutputs <em>Provided Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Outputs</em>'.
	 * @see de.oaam.model.oaam.systems.System#getProvidedOutputs()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ProvidedOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.systems.System#getRequiredInputs <em>Required Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Inputs</em>'.
	 * @see de.oaam.model.oaam.systems.System#getRequiredInputs()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_RequiredInputs();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.RequiredInformationA <em>Required Information A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Information A</em>'.
	 * @see de.oaam.model.oaam.systems.RequiredInformationA
	 * @generated
	 */
	EClass getRequiredInformationA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.ProvidedInformationA <em>Provided Information A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Information A</em>'.
	 * @see de.oaam.model.oaam.systems.ProvidedInformationA
	 * @generated
	 */
	EClass getProvidedInformationA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.InformationFlow <em>Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow</em>'.
	 * @see de.oaam.model.oaam.systems.InformationFlow
	 * @generated
	 */
	EClass getInformationFlow();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.systems.InformationFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see de.oaam.model.oaam.systems.InformationFlow#getFrom()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_From();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.systems.InformationFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see de.oaam.model.oaam.systems.InformationFlow#getTo()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_To();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.InformationSignal <em>Information Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Signal</em>'.
	 * @see de.oaam.model.oaam.systems.InformationSignal
	 * @generated
	 */
	EClass getInformationSignal();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InformationSignal#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see de.oaam.model.oaam.systems.InformationSignal#getRate()
	 * @see #getInformationSignal()
	 * @generated
	 */
	EAttribute getInformationSignal_Rate();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InformationSignal#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see de.oaam.model.oaam.systems.InformationSignal#getLatency()
	 * @see #getInformationSignal()
	 * @generated
	 */
	EAttribute getInformationSignal_Latency();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InformationSignal#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see de.oaam.model.oaam.systems.InformationSignal#getAccuracy()
	 * @see #getInformationSignal()
	 * @generated
	 */
	EAttribute getInformationSignal_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InformationSignal#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see de.oaam.model.oaam.systems.InformationSignal#getResolution()
	 * @see #getInformationSignal()
	 * @generated
	 */
	EAttribute getInformationSignal_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InformationSignal#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.oaam.model.oaam.systems.InformationSignal#getUnit()
	 * @see #getInformationSignal()
	 * @generated
	 */
	EAttribute getInformationSignal_Unit();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.InformationMaterial <em>Information Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Material</em>'.
	 * @see de.oaam.model.oaam.systems.InformationMaterial
	 * @generated
	 */
	EClass getInformationMaterial();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InformationMaterial#getDensity <em>Density</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Density</em>'.
	 * @see de.oaam.model.oaam.systems.InformationMaterial#getDensity()
	 * @see #getInformationMaterial()
	 * @generated
	 */
	EAttribute getInformationMaterial_Density();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InformationMaterial#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see de.oaam.model.oaam.systems.InformationMaterial#getVelocity()
	 * @see #getInformationMaterial()
	 * @generated
	 */
	EAttribute getInformationMaterial_Velocity();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.InformationPower <em>Information Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Power</em>'.
	 * @see de.oaam.model.oaam.systems.InformationPower
	 * @generated
	 */
	EClass getInformationPower();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InformationPower#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see de.oaam.model.oaam.systems.InformationPower#getPower()
	 * @see #getInformationPower()
	 * @generated
	 */
	EAttribute getInformationPower_Power();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.ElectricPower <em>Electric Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electric Power</em>'.
	 * @see de.oaam.model.oaam.systems.ElectricPower
	 * @generated
	 */
	EClass getElectricPower();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.ElectricPower#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see de.oaam.model.oaam.systems.ElectricPower#getFrequency()
	 * @see #getElectricPower()
	 * @generated
	 */
	EAttribute getElectricPower_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.ElectricPower#getNPhases <em>NPhases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NPhases</em>'.
	 * @see de.oaam.model.oaam.systems.ElectricPower#getNPhases()
	 * @see #getElectricPower()
	 * @generated
	 */
	EAttribute getElectricPower_NPhases();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.ElectricPower#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see de.oaam.model.oaam.systems.ElectricPower#getVoltage()
	 * @see #getElectricPower()
	 * @generated
	 */
	EAttribute getElectricPower_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.ElectricPower#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see de.oaam.model.oaam.systems.ElectricPower#getCurrent()
	 * @see #getElectricPower()
	 * @generated
	 */
	EAttribute getElectricPower_Current();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.HydraulicPower <em>Hydraulic Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydraulic Power</em>'.
	 * @see de.oaam.model.oaam.systems.HydraulicPower
	 * @generated
	 */
	EClass getHydraulicPower();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.HydraulicPower#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see de.oaam.model.oaam.systems.HydraulicPower#getPressure()
	 * @see #getHydraulicPower()
	 * @generated
	 */
	EAttribute getHydraulicPower_Pressure();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.HydraulicPower#getMassFlowRate <em>Mass Flow Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass Flow Rate</em>'.
	 * @see de.oaam.model.oaam.systems.HydraulicPower#getMassFlowRate()
	 * @see #getHydraulicPower()
	 * @generated
	 */
	EAttribute getHydraulicPower_MassFlowRate();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.RotaryPower <em>Rotary Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotary Power</em>'.
	 * @see de.oaam.model.oaam.systems.RotaryPower
	 * @generated
	 */
	EClass getRotaryPower();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.RotaryPower#getMomentum <em>Momentum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Momentum</em>'.
	 * @see de.oaam.model.oaam.systems.RotaryPower#getMomentum()
	 * @see #getRotaryPower()
	 * @generated
	 */
	EAttribute getRotaryPower_Momentum();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.RotaryPower#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Velocity</em>'.
	 * @see de.oaam.model.oaam.systems.RotaryPower#getAngularVelocity()
	 * @see #getRotaryPower()
	 * @generated
	 */
	EAttribute getRotaryPower_AngularVelocity();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.LinearPower <em>Linear Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Power</em>'.
	 * @see de.oaam.model.oaam.systems.LinearPower
	 * @generated
	 */
	EClass getLinearPower();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.LinearPower#getForce <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force</em>'.
	 * @see de.oaam.model.oaam.systems.LinearPower#getForce()
	 * @see #getLinearPower()
	 * @generated
	 */
	EAttribute getLinearPower_Force();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.LinearPower#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see de.oaam.model.oaam.systems.LinearPower#getVelocity()
	 * @see #getLinearPower()
	 * @generated
	 */
	EAttribute getLinearPower_Velocity();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.InputSegregation <em>Input Segregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Segregation</em>'.
	 * @see de.oaam.model.oaam.systems.InputSegregation
	 * @generated
	 */
	EClass getInputSegregation();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InputSegregation#isDissimilarSource <em>Dissimilar Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dissimilar Source</em>'.
	 * @see de.oaam.model.oaam.systems.InputSegregation#isDissimilarSource()
	 * @see #getInputSegregation()
	 * @generated
	 */
	EAttribute getInputSegregation_DissimilarSource();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InputSegregation#isDissimilarRoute <em>Dissimilar Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dissimilar Route</em>'.
	 * @see de.oaam.model.oaam.systems.InputSegregation#isDissimilarRoute()
	 * @see #getInputSegregation()
	 * @generated
	 */
	EAttribute getInputSegregation_DissimilarRoute();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InputSegregation#isDissimilarTechnology <em>Dissimilar Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dissimilar Technology</em>'.
	 * @see de.oaam.model.oaam.systems.InputSegregation#isDissimilarTechnology()
	 * @see #getInputSegregation()
	 * @generated
	 */
	EAttribute getInputSegregation_DissimilarTechnology();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.systems.InputSegregation#getGroupA <em>Group A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group A</em>'.
	 * @see de.oaam.model.oaam.systems.InputSegregation#getGroupA()
	 * @see #getInputSegregation()
	 * @generated
	 */
	EReference getInputSegregation_GroupA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.systems.InputSegregation#getGroupB <em>Group B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group B</em>'.
	 * @see de.oaam.model.oaam.systems.InputSegregation#getGroupB()
	 * @see #getInputSegregation()
	 * @generated
	 */
	EReference getInputSegregation_GroupB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemsFactory getSystemsFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.SystemsContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.SystemsContainerAImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getSystemsContainerA()
		 * @generated
		 */
		EClass SYSTEMS_CONTAINER_A = eINSTANCE.getSystemsContainerA();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMS_CONTAINER_A__SYSTEMS = eINSTANCE.getSystemsContainerA_Systems();

		/**
		 * The meta object literal for the '<em><b>Information Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMS_CONTAINER_A__INFORMATION_FLOWS = eINSTANCE.getSystemsContainerA_InformationFlows();

		/**
		 * The meta object literal for the '<em><b>Input Segregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS = eINSTANCE.getSystemsContainerA_InputSegregations();

		/**
		 * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMS_CONTAINER_A__SUBSYSTEMS = eINSTANCE.getSystemsContainerA_Subsystems();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.SystemsImpl <em>Systems</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.SystemsImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getSystems()
		 * @generated
		 */
		EClass SYSTEMS = eINSTANCE.getSystems();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.SubsystemImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getSubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.SystemImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Provided Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROVIDED_OUTPUTS = eINSTANCE.getSystem_ProvidedOutputs();

		/**
		 * The meta object literal for the '<em><b>Required Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__REQUIRED_INPUTS = eINSTANCE.getSystem_RequiredInputs();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.RequiredInformationAImpl <em>Required Information A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.RequiredInformationAImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getRequiredInformationA()
		 * @generated
		 */
		EClass REQUIRED_INFORMATION_A = eINSTANCE.getRequiredInformationA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.ProvidedInformationAImpl <em>Provided Information A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.ProvidedInformationAImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getProvidedInformationA()
		 * @generated
		 */
		EClass PROVIDED_INFORMATION_A = eINSTANCE.getProvidedInformationA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.InformationFlowImpl <em>Information Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.InformationFlowImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformationFlow()
		 * @generated
		 */
		EClass INFORMATION_FLOW = eINSTANCE.getInformationFlow();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__FROM = eINSTANCE.getInformationFlow_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__TO = eINSTANCE.getInformationFlow_To();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.InformationSignalImpl <em>Information Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.InformationSignalImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformationSignal()
		 * @generated
		 */
		EClass INFORMATION_SIGNAL = eINSTANCE.getInformationSignal();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_SIGNAL__RATE = eINSTANCE.getInformationSignal_Rate();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_SIGNAL__LATENCY = eINSTANCE.getInformationSignal_Latency();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_SIGNAL__ACCURACY = eINSTANCE.getInformationSignal_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_SIGNAL__RESOLUTION = eINSTANCE.getInformationSignal_Resolution();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_SIGNAL__UNIT = eINSTANCE.getInformationSignal_Unit();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.InformationMaterialImpl <em>Information Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.InformationMaterialImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformationMaterial()
		 * @generated
		 */
		EClass INFORMATION_MATERIAL = eINSTANCE.getInformationMaterial();

		/**
		 * The meta object literal for the '<em><b>Density</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_MATERIAL__DENSITY = eINSTANCE.getInformationMaterial_Density();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_MATERIAL__VELOCITY = eINSTANCE.getInformationMaterial_Velocity();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.InformationPowerImpl <em>Information Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.InformationPowerImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformationPower()
		 * @generated
		 */
		EClass INFORMATION_POWER = eINSTANCE.getInformationPower();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_POWER__POWER = eINSTANCE.getInformationPower_Power();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.ElectricPowerImpl <em>Electric Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.ElectricPowerImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getElectricPower()
		 * @generated
		 */
		EClass ELECTRIC_POWER = eINSTANCE.getElectricPower();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_POWER__FREQUENCY = eINSTANCE.getElectricPower_Frequency();

		/**
		 * The meta object literal for the '<em><b>NPhases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_POWER__NPHASES = eINSTANCE.getElectricPower_NPhases();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_POWER__VOLTAGE = eINSTANCE.getElectricPower_Voltage();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_POWER__CURRENT = eINSTANCE.getElectricPower_Current();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.HydraulicPowerImpl <em>Hydraulic Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.HydraulicPowerImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getHydraulicPower()
		 * @generated
		 */
		EClass HYDRAULIC_POWER = eINSTANCE.getHydraulicPower();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRAULIC_POWER__PRESSURE = eINSTANCE.getHydraulicPower_Pressure();

		/**
		 * The meta object literal for the '<em><b>Mass Flow Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRAULIC_POWER__MASS_FLOW_RATE = eINSTANCE.getHydraulicPower_MassFlowRate();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.RotaryPowerImpl <em>Rotary Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.RotaryPowerImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getRotaryPower()
		 * @generated
		 */
		EClass ROTARY_POWER = eINSTANCE.getRotaryPower();

		/**
		 * The meta object literal for the '<em><b>Momentum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_POWER__MOMENTUM = eINSTANCE.getRotaryPower_Momentum();

		/**
		 * The meta object literal for the '<em><b>Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_POWER__ANGULAR_VELOCITY = eINSTANCE.getRotaryPower_AngularVelocity();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.LinearPowerImpl <em>Linear Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.LinearPowerImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getLinearPower()
		 * @generated
		 */
		EClass LINEAR_POWER = eINSTANCE.getLinearPower();

		/**
		 * The meta object literal for the '<em><b>Force</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_POWER__FORCE = eINSTANCE.getLinearPower_Force();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_POWER__VELOCITY = eINSTANCE.getLinearPower_Velocity();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.InputSegregationImpl <em>Input Segregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.InputSegregationImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInputSegregation()
		 * @generated
		 */
		EClass INPUT_SEGREGATION = eINSTANCE.getInputSegregation();

		/**
		 * The meta object literal for the '<em><b>Dissimilar Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SEGREGATION__DISSIMILAR_SOURCE = eINSTANCE.getInputSegregation_DissimilarSource();

		/**
		 * The meta object literal for the '<em><b>Dissimilar Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SEGREGATION__DISSIMILAR_ROUTE = eINSTANCE.getInputSegregation_DissimilarRoute();

		/**
		 * The meta object literal for the '<em><b>Dissimilar Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SEGREGATION__DISSIMILAR_TECHNOLOGY = eINSTANCE.getInputSegregation_DissimilarTechnology();

		/**
		 * The meta object literal for the '<em><b>Group A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SEGREGATION__GROUP_A = eINSTANCE.getInputSegregation_GroupA();

		/**
		 * The meta object literal for the '<em><b>Group B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SEGREGATION__GROUP_B = eINSTANCE.getInputSegregation_GroupB();

	}

} //SystemsPackage
