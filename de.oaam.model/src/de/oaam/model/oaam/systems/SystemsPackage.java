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
	String eNS_URI = "http://www.oaam.de/oaam/model/v100/systems";

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
	int SYSTEMS_CONTAINER_A__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__SYSTEMS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Information Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__INFORMATION_FLOWS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Segregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A__SUBSYSTEMS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMS_CONTAINER_A_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__OPERATION_MODES = SYSTEMS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__VARIANTS = SYSTEMS_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = SYSTEMS_CONTAINER_A_FEATURE_COUNT + 2;

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
	int SYSTEM__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDED_OUTPUTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REQUIRED_INPUTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.RequiredInputAImpl <em>Required Input A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.RequiredInputAImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getRequiredInputA()
	 * @generated
	 */
	int REQUIRED_INPUT_A = 4;

	/**
	 * The number of structural features of the '<em>Required Input A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INPUT_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Required Input A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INPUT_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.ProvidedOutputAImpl <em>Provided Output A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.ProvidedOutputAImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getProvidedOutputA()
	 * @generated
	 */
	int PROVIDED_OUTPUT_A = 5;

	/**
	 * The number of structural features of the '<em>Provided Output A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OUTPUT_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Provided Output A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OUTPUT_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.InformationImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID = PROVIDED_OUTPUT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__NAME = PROVIDED_OUTPUT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__STYLE = PROVIDED_OUTPUT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ATTRIBUTES = PROVIDED_OUTPUT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__DOCUMENTATION = PROVIDED_OUTPUT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__MODIFIED = PROVIDED_OUTPUT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__MODIFIER = PROVIDED_OUTPUT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TRACE_LINK = PROVIDED_OUTPUT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__OPERATION_MODES = PROVIDED_OUTPUT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__VARIANTS = PROVIDED_OUTPUT_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__RATE = PROVIDED_OUTPUT_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__LATENCY = PROVIDED_OUTPUT_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ACCURACY = PROVIDED_OUTPUT_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__RESOLUTION = PROVIDED_OUTPUT_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__UNIT = PROVIDED_OUTPUT_A_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = PROVIDED_OUTPUT_A_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = PROVIDED_OUTPUT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.InformationFlowImpl <em>Information Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.InformationFlowImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformationFlow()
	 * @generated
	 */
	int INFORMATION_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__FROM = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__TO = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.PowerImpl <em>Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.PowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getPower()
	 * @generated
	 */
	int POWER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__ID = PROVIDED_OUTPUT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__NAME = PROVIDED_OUTPUT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__STYLE = PROVIDED_OUTPUT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__ATTRIBUTES = PROVIDED_OUTPUT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__DOCUMENTATION = PROVIDED_OUTPUT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__MODIFIED = PROVIDED_OUTPUT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__MODIFIER = PROVIDED_OUTPUT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__TRACE_LINK = PROVIDED_OUTPUT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__VARIANTS = PROVIDED_OUTPUT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__OPERATION_MODES = PROVIDED_OUTPUT_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__POWER = PROVIDED_OUTPUT_A_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FEATURE_COUNT = PROVIDED_OUTPUT_A_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_OPERATION_COUNT = PROVIDED_OUTPUT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.ElectricPowerImpl <em>Electric Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.ElectricPowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getElectricPower()
	 * @generated
	 */
	int ELECTRIC_POWER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__ID = POWER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__NAME = POWER__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__STYLE = POWER__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__ATTRIBUTES = POWER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__DOCUMENTATION = POWER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__MODIFIED = POWER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__MODIFIER = POWER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__TRACE_LINK = POWER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__VARIANTS = POWER__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__OPERATION_MODES = POWER__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__POWER = POWER__POWER;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__FREQUENCY = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NPhases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__NPHASES = POWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__VOLTAGE = POWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER__CURRENT = POWER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Electric Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER_FEATURE_COUNT = POWER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Electric Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_POWER_OPERATION_COUNT = POWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.HydraulicPowerImpl <em>Hydraulic Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.HydraulicPowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getHydraulicPower()
	 * @generated
	 */
	int HYDRAULIC_POWER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__ID = POWER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__NAME = POWER__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__STYLE = POWER__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__ATTRIBUTES = POWER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__DOCUMENTATION = POWER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__MODIFIED = POWER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__MODIFIER = POWER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__TRACE_LINK = POWER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__VARIANTS = POWER__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__OPERATION_MODES = POWER__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__POWER = POWER__POWER;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__PRESSURE = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mass Flow Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER__MASS_FLOW_RATE = POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hydraulic Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hydraulic Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_POWER_OPERATION_COUNT = POWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.RotaryPowerImpl <em>Rotary Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.RotaryPowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getRotaryPower()
	 * @generated
	 */
	int ROTARY_POWER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__ID = POWER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__NAME = POWER__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__STYLE = POWER__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__ATTRIBUTES = POWER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__DOCUMENTATION = POWER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__MODIFIED = POWER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__MODIFIER = POWER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__TRACE_LINK = POWER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__VARIANTS = POWER__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__OPERATION_MODES = POWER__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__POWER = POWER__POWER;

	/**
	 * The feature id for the '<em><b>Momentum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__MOMENTUM = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER__ANGULAR_VELOCITY = POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotary Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotary Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_POWER_OPERATION_COUNT = POWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.LinearPowerImpl <em>Linear Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.LinearPowerImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getLinearPower()
	 * @generated
	 */
	int LINEAR_POWER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__ID = POWER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__NAME = POWER__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__STYLE = POWER__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__ATTRIBUTES = POWER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__DOCUMENTATION = POWER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__MODIFIED = POWER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__MODIFIER = POWER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__TRACE_LINK = POWER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__VARIANTS = POWER__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__OPERATION_MODES = POWER__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__POWER = POWER__POWER;

	/**
	 * The feature id for the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__FORCE = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER__VELOCITY = POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linear Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Linear Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_POWER_OPERATION_COUNT = POWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.systems.impl.InputSegregationImpl <em>Input Segregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.systems.impl.InputSegregationImpl
	 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInputSegregation()
	 * @generated
	 */
	int INPUT_SEGREGATION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Dissimilar Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__DISSIMILAR_SOURCE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dissimilar Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__DISSIMILAR_ROUTE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dissimilar Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__DISSIMILAR_TECHNOLOGY = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__GROUP_A = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION__GROUP_B = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Input Segregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Input Segregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SEGREGATION_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.RequiredInputA <em>Required Input A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Input A</em>'.
	 * @see de.oaam.model.oaam.systems.RequiredInputA
	 * @generated
	 */
	EClass getRequiredInputA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.ProvidedOutputA <em>Provided Output A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Output A</em>'.
	 * @see de.oaam.model.oaam.systems.ProvidedOutputA
	 * @generated
	 */
	EClass getProvidedOutputA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see de.oaam.model.oaam.systems.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.Information#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see de.oaam.model.oaam.systems.Information#getRate()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Rate();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.Information#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see de.oaam.model.oaam.systems.Information#getLatency()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Latency();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.Information#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see de.oaam.model.oaam.systems.Information#getAccuracy()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.Information#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see de.oaam.model.oaam.systems.Information#getResolution()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.Information#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.oaam.model.oaam.systems.Information#getUnit()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Unit();

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
	 * Returns the meta object for class '{@link de.oaam.model.oaam.systems.Power <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power</em>'.
	 * @see de.oaam.model.oaam.systems.Power
	 * @generated
	 */
	EClass getPower();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.Power#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see de.oaam.model.oaam.systems.Power#getPower()
	 * @see #getPower()
	 * @generated
	 */
	EAttribute getPower_Power();

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
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.systems.InputSegregation#getDissimilarTechnology <em>Dissimilar Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dissimilar Technology</em>'.
	 * @see de.oaam.model.oaam.systems.InputSegregation#getDissimilarTechnology()
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
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.RequiredInputAImpl <em>Required Input A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.RequiredInputAImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getRequiredInputA()
		 * @generated
		 */
		EClass REQUIRED_INPUT_A = eINSTANCE.getRequiredInputA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.ProvidedOutputAImpl <em>Provided Output A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.ProvidedOutputAImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getProvidedOutputA()
		 * @generated
		 */
		EClass PROVIDED_OUTPUT_A = eINSTANCE.getProvidedOutputA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.InformationImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__RATE = eINSTANCE.getInformation_Rate();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__LATENCY = eINSTANCE.getInformation_Latency();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__ACCURACY = eINSTANCE.getInformation_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__RESOLUTION = eINSTANCE.getInformation_Resolution();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__UNIT = eINSTANCE.getInformation_Unit();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.systems.impl.PowerImpl <em>Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.systems.impl.PowerImpl
		 * @see de.oaam.model.oaam.systems.impl.SystemsPackageImpl#getPower()
		 * @generated
		 */
		EClass POWER = eINSTANCE.getPower();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER__POWER = eINSTANCE.getPower_Power();

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
