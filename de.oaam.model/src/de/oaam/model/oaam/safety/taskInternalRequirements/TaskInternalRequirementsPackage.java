/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements;

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
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface TaskInternalRequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taskInternalRequirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v160/safety/taskInternalRequirements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.safety.taskInternalRequirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskInternalRequirementsPackage eINSTANCE = de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementImpl <em>Task Internal Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getTaskInternalRequirement()
	 * @generated
	 */
	int TASK_INTERNAL_REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__COMPONENTS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT__REQUIRES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Internal Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Internal Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INTERNAL_REQUIREMENT_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.RequirementComponentAImpl <em>Requirement Component A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.RequirementComponentAImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getRequirementComponentA()
	 * @generated
	 */
	int REQUIREMENT_COMPONENT_A = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The number of structural features of the '<em>Requirement Component A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement Component A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComparatorAImpl <em>Comparator A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComparatorAImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getComparatorA()
	 * @generated
	 */
	int COMPARATOR_A = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__ID = REQUIREMENT_COMPONENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__NAME = REQUIREMENT_COMPONENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__STYLE = REQUIREMENT_COMPONENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__ATTRIBUTES = REQUIREMENT_COMPONENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__DOCUMENTATION = REQUIREMENT_COMPONENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__MODIFIED = REQUIREMENT_COMPONENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__MODIFIER = REQUIREMENT_COMPONENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__TRACE_LINK = REQUIREMENT_COMPONENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Comp A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__COMP_A = REQUIREMENT_COMPONENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comp B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A__COMP_B = REQUIREMENT_COMPONENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A_FEATURE_COUNT = REQUIREMENT_COMPONENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comparator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_A_OPERATION_COUNT = REQUIREMENT_COMPONENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.AgreementImpl <em>Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.AgreementImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getAgreement()
	 * @generated
	 */
	int AGREEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ID = COMPARATOR_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__NAME = COMPARATOR_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__STYLE = COMPARATOR_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ATTRIBUTES = COMPARATOR_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__DOCUMENTATION = COMPARATOR_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__MODIFIED = COMPARATOR_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__MODIFIER = COMPARATOR_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__TRACE_LINK = COMPARATOR_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Comp A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__COMP_A = COMPARATOR_A__COMP_A;

	/**
	 * The feature id for the '<em><b>Comp B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__COMP_B = COMPARATOR_A__COMP_B;

	/**
	 * The number of structural features of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FEATURE_COUNT = COMPARATOR_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_OPERATION_COUNT = COMPARATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.BelowImpl <em>Below</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.BelowImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getBelow()
	 * @generated
	 */
	int BELOW = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__ID = COMPARATOR_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__NAME = COMPARATOR_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__STYLE = COMPARATOR_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__ATTRIBUTES = COMPARATOR_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__DOCUMENTATION = COMPARATOR_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__MODIFIED = COMPARATOR_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__MODIFIER = COMPARATOR_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__TRACE_LINK = COMPARATOR_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Comp A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__COMP_A = COMPARATOR_A__COMP_A;

	/**
	 * The feature id for the '<em><b>Comp B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW__COMP_B = COMPARATOR_A__COMP_B;

	/**
	 * The number of structural features of the '<em>Below</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW_FEATURE_COUNT = COMPARATOR_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Below</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELOW_OPERATION_COUNT = COMPARATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.AboveImpl <em>Above</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.AboveImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getAbove()
	 * @generated
	 */
	int ABOVE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__ID = COMPARATOR_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__NAME = COMPARATOR_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__STYLE = COMPARATOR_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__ATTRIBUTES = COMPARATOR_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__DOCUMENTATION = COMPARATOR_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__MODIFIED = COMPARATOR_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__MODIFIER = COMPARATOR_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__TRACE_LINK = COMPARATOR_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Comp A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__COMP_A = COMPARATOR_A__COMP_A;

	/**
	 * The feature id for the '<em><b>Comp B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE__COMP_B = COMPARATOR_A__COMP_B;

	/**
	 * The number of structural features of the '<em>Above</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE_FEATURE_COUNT = COMPARATOR_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Above</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOVE_OPERATION_COUNT = COMPARATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.SourceAImpl <em>Source A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.SourceAImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getSourceA()
	 * @generated
	 */
	int SOURCE_A = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A__ID = REQUIREMENT_COMPONENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A__NAME = REQUIREMENT_COMPONENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A__STYLE = REQUIREMENT_COMPONENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A__ATTRIBUTES = REQUIREMENT_COMPONENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A__DOCUMENTATION = REQUIREMENT_COMPONENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A__MODIFIED = REQUIREMENT_COMPONENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A__MODIFIER = REQUIREMENT_COMPONENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A__TRACE_LINK = REQUIREMENT_COMPONENT_A__TRACE_LINK;

	/**
	 * The number of structural features of the '<em>Source A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A_FEATURE_COUNT = REQUIREMENT_COMPONENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_A_OPERATION_COUNT = REQUIREMENT_COMPONENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.IoSignalImpl <em>Io Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.IoSignalImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getIoSignal()
	 * @generated
	 */
	int IO_SIGNAL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__ID = SOURCE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__NAME = SOURCE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__STYLE = SOURCE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__ATTRIBUTES = SOURCE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__DOCUMENTATION = SOURCE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__MODIFIED = SOURCE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__MODIFIER = SOURCE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__TRACE_LINK = SOURCE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Declared Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__DECLARED_INPUT = SOURCE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declared Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL__DECLARED_OUTPUT = SOURCE_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Io Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL_FEATURE_COUNT = SOURCE_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Io Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SIGNAL_OPERATION_COUNT = SOURCE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.ValueImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = SOURCE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = SOURCE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STYLE = SOURCE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ATTRIBUTES = SOURCE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DOCUMENTATION = SOURCE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__MODIFIED = SOURCE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__MODIFIER = SOURCE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TRACE_LINK = SOURCE_A__TRACE_LINK;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = SOURCE_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = SOURCE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComplexOperatorAImpl <em>Complex Operator A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComplexOperatorAImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getComplexOperatorA()
	 * @generated
	 */
	int COMPLEX_OPERATOR_A = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A__ID = REQUIREMENT_COMPONENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A__NAME = REQUIREMENT_COMPONENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A__STYLE = REQUIREMENT_COMPONENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A__ATTRIBUTES = REQUIREMENT_COMPONENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A__DOCUMENTATION = REQUIREMENT_COMPONENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A__MODIFIED = REQUIREMENT_COMPONENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A__MODIFIER = REQUIREMENT_COMPONENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A__TRACE_LINK = REQUIREMENT_COMPONENT_A__TRACE_LINK;

	/**
	 * The number of structural features of the '<em>Complex Operator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A_FEATURE_COUNT = REQUIREMENT_COMPONENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Operator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATOR_A_OPERATION_COUNT = REQUIREMENT_COMPONENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.BoolTimeoutImpl <em>Bool Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.BoolTimeoutImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getBoolTimeout()
	 * @generated
	 */
	int BOOL_TIMEOUT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__ID = COMPLEX_OPERATOR_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__NAME = COMPLEX_OPERATOR_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__STYLE = COMPLEX_OPERATOR_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__ATTRIBUTES = COMPLEX_OPERATOR_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__DOCUMENTATION = COMPLEX_OPERATOR_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__MODIFIED = COMPLEX_OPERATOR_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__MODIFIER = COMPLEX_OPERATOR_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__TRACE_LINK = COMPLEX_OPERATOR_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__EXPR = COMPLEX_OPERATOR_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT__TIMEOUT = COMPLEX_OPERATOR_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bool Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT_FEATURE_COUNT = COMPLEX_OPERATOR_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bool Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TIMEOUT_OPERATION_COUNT = COMPLEX_OPERATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.BooleanOperatorAImpl <em>Boolean Operator A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.BooleanOperatorAImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getBooleanOperatorA()
	 * @generated
	 */
	int BOOLEAN_OPERATOR_A = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A__ID = REQUIREMENT_COMPONENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A__NAME = REQUIREMENT_COMPONENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A__STYLE = REQUIREMENT_COMPONENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A__ATTRIBUTES = REQUIREMENT_COMPONENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A__DOCUMENTATION = REQUIREMENT_COMPONENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A__MODIFIED = REQUIREMENT_COMPONENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A__MODIFIER = REQUIREMENT_COMPONENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A__TRACE_LINK = REQUIREMENT_COMPONENT_A__TRACE_LINK;

	/**
	 * The number of structural features of the '<em>Boolean Operator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A_FEATURE_COUNT = REQUIREMENT_COMPONENT_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Operator A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_A_OPERATION_COUNT = REQUIREMENT_COMPONENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.AndImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ID = BOOLEAN_OPERATOR_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = BOOLEAN_OPERATOR_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__STYLE = BOOLEAN_OPERATOR_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ATTRIBUTES = BOOLEAN_OPERATOR_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__DOCUMENTATION = BOOLEAN_OPERATOR_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__MODIFIED = BOOLEAN_OPERATOR_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__MODIFIER = BOOLEAN_OPERATOR_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__TRACE_LINK = BOOLEAN_OPERATOR_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Expr B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXPR_B = BOOLEAN_OPERATOR_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXPR_A = BOOLEAN_OPERATOR_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_OPERATOR_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOLEAN_OPERATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.OrImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getOr()
	 * @generated
	 */
	int OR = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ID = BOOLEAN_OPERATOR_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = BOOLEAN_OPERATOR_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__STYLE = BOOLEAN_OPERATOR_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ATTRIBUTES = BOOLEAN_OPERATOR_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__DOCUMENTATION = BOOLEAN_OPERATOR_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__MODIFIED = BOOLEAN_OPERATOR_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__MODIFIER = BOOLEAN_OPERATOR_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__TRACE_LINK = BOOLEAN_OPERATOR_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Expr B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXPR_B = BOOLEAN_OPERATOR_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXPR_A = BOOLEAN_OPERATOR_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_OPERATOR_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BOOLEAN_OPERATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.NotImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ID = BOOLEAN_OPERATOR_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__NAME = BOOLEAN_OPERATOR_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__STYLE = BOOLEAN_OPERATOR_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ATTRIBUTES = BOOLEAN_OPERATOR_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__DOCUMENTATION = BOOLEAN_OPERATOR_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__MODIFIED = BOOLEAN_OPERATOR_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__MODIFIER = BOOLEAN_OPERATOR_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__TRACE_LINK = BOOLEAN_OPERATOR_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPR = BOOLEAN_OPERATOR_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_OPERATOR_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = BOOLEAN_OPERATOR_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.ContractImpl
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ID = COMPLEX_OPERATOR_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAME = COMPLEX_OPERATOR_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__STYLE = COMPLEX_OPERATOR_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ATTRIBUTES = COMPLEX_OPERATOR_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DOCUMENTATION = COMPLEX_OPERATOR_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__MODIFIED = COMPLEX_OPERATOR_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__MODIFIER = COMPLEX_OPERATOR_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__TRACE_LINK = COMPLEX_OPERATOR_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PRE_CONDITION = COMPLEX_OPERATOR_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__POST_CONDITION = COMPLEX_OPERATOR_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INVARIANT = COMPLEX_OPERATOR_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = COMPLEX_OPERATOR_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = COMPLEX_OPERATOR_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement <em>Task Internal Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Internal Requirement</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement
	 * @generated
	 */
	EClass getTaskInternalRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement#getComponents()
	 * @see #getTaskInternalRequirement()
	 * @generated
	 */
	EReference getTaskInternalRequirement_Components();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requires</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement#getRequires()
	 * @see #getTaskInternalRequirement()
	 * @generated
	 */
	EReference getTaskInternalRequirement_Requires();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA <em>Requirement Component A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Component A</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA
	 * @generated
	 */
	EClass getRequirementComponentA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA <em>Comparator A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparator A</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA
	 * @generated
	 */
	EClass getComparatorA();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA#getCompA <em>Comp A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp A</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA#getCompA()
	 * @see #getComparatorA()
	 * @generated
	 */
	EReference getComparatorA_CompA();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA#getCompB <em>Comp B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp B</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA#getCompB()
	 * @see #getComparatorA()
	 * @generated
	 */
	EReference getComparatorA_CompB();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Agreement
	 * @generated
	 */
	EClass getAgreement();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Below <em>Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Below</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Below
	 * @generated
	 */
	EClass getBelow();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Above <em>Above</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Above</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Above
	 * @generated
	 */
	EClass getAbove();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.SourceA <em>Source A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source A</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.SourceA
	 * @generated
	 */
	EClass getSourceA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal <em>Io Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io Signal</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal
	 * @generated
	 */
	EClass getIoSignal();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal#getDeclaredInput <em>Declared Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Input</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal#getDeclaredInput()
	 * @see #getIoSignal()
	 * @generated
	 */
	EReference getIoSignal_DeclaredInput();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal#getDeclaredOutput <em>Declared Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Output</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal#getDeclaredOutput()
	 * @see #getIoSignal()
	 * @generated
	 */
	EReference getIoSignal_DeclaredOutput();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComplexOperatorA <em>Complex Operator A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Operator A</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.ComplexOperatorA
	 * @generated
	 */
	EClass getComplexOperatorA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout <em>Bool Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Timeout</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout
	 * @generated
	 */
	EClass getBoolTimeout();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout#getExpr()
	 * @see #getBoolTimeout()
	 * @generated
	 */
	EReference getBoolTimeout_Expr();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout#getTimeout()
	 * @see #getBoolTimeout()
	 * @generated
	 */
	EAttribute getBoolTimeout_Timeout();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.BooleanOperatorA <em>Boolean Operator A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operator A</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.BooleanOperatorA
	 * @generated
	 */
	EClass getBooleanOperatorA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.And#getExprB <em>Expr B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr B</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.And#getExprB()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_ExprB();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.And#getExprA <em>Expr A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr A</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.And#getExprA()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_ExprA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Or#getExprB <em>Expr B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr B</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Or#getExprB()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_ExprB();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Or#getExprA <em>Expr A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr A</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Or#getExprA()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_ExprA();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Not#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Not#getExpr()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Expr();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Condition</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getPreCondition()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_PreCondition();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Condition</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getPostCondition()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_PostCondition();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invariant</em>'.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Contract#getInvariant()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Invariant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskInternalRequirementsFactory getTaskInternalRequirementsFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementImpl <em>Task Internal Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getTaskInternalRequirement()
		 * @generated
		 */
		EClass TASK_INTERNAL_REQUIREMENT = eINSTANCE.getTaskInternalRequirement();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INTERNAL_REQUIREMENT__COMPONENTS = eINSTANCE.getTaskInternalRequirement_Components();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INTERNAL_REQUIREMENT__REQUIRES = eINSTANCE.getTaskInternalRequirement_Requires();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.RequirementComponentAImpl <em>Requirement Component A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.RequirementComponentAImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getRequirementComponentA()
		 * @generated
		 */
		EClass REQUIREMENT_COMPONENT_A = eINSTANCE.getRequirementComponentA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComparatorAImpl <em>Comparator A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComparatorAImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getComparatorA()
		 * @generated
		 */
		EClass COMPARATOR_A = eINSTANCE.getComparatorA();

		/**
		 * The meta object literal for the '<em><b>Comp A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATOR_A__COMP_A = eINSTANCE.getComparatorA_CompA();

		/**
		 * The meta object literal for the '<em><b>Comp B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATOR_A__COMP_B = eINSTANCE.getComparatorA_CompB();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.AgreementImpl <em>Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.AgreementImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getAgreement()
		 * @generated
		 */
		EClass AGREEMENT = eINSTANCE.getAgreement();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.BelowImpl <em>Below</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.BelowImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getBelow()
		 * @generated
		 */
		EClass BELOW = eINSTANCE.getBelow();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.AboveImpl <em>Above</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.AboveImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getAbove()
		 * @generated
		 */
		EClass ABOVE = eINSTANCE.getAbove();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.SourceAImpl <em>Source A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.SourceAImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getSourceA()
		 * @generated
		 */
		EClass SOURCE_A = eINSTANCE.getSourceA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.IoSignalImpl <em>Io Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.IoSignalImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getIoSignal()
		 * @generated
		 */
		EClass IO_SIGNAL = eINSTANCE.getIoSignal();

		/**
		 * The meta object literal for the '<em><b>Declared Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_SIGNAL__DECLARED_INPUT = eINSTANCE.getIoSignal_DeclaredInput();

		/**
		 * The meta object literal for the '<em><b>Declared Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_SIGNAL__DECLARED_OUTPUT = eINSTANCE.getIoSignal_DeclaredOutput();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.ValueImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComplexOperatorAImpl <em>Complex Operator A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComplexOperatorAImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getComplexOperatorA()
		 * @generated
		 */
		EClass COMPLEX_OPERATOR_A = eINSTANCE.getComplexOperatorA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.BoolTimeoutImpl <em>Bool Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.BoolTimeoutImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getBoolTimeout()
		 * @generated
		 */
		EClass BOOL_TIMEOUT = eINSTANCE.getBoolTimeout();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_TIMEOUT__EXPR = eINSTANCE.getBoolTimeout_Expr();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_TIMEOUT__TIMEOUT = eINSTANCE.getBoolTimeout_Timeout();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.BooleanOperatorAImpl <em>Boolean Operator A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.BooleanOperatorAImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getBooleanOperatorA()
		 * @generated
		 */
		EClass BOOLEAN_OPERATOR_A = eINSTANCE.getBooleanOperatorA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.AndImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Expr B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__EXPR_B = eINSTANCE.getAnd_ExprB();

		/**
		 * The meta object literal for the '<em><b>Expr A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__EXPR_A = eINSTANCE.getAnd_ExprA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.OrImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Expr B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__EXPR_B = eINSTANCE.getOr_ExprB();

		/**
		 * The meta object literal for the '<em><b>Expr A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__EXPR_A = eINSTANCE.getOr_ExprA();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.NotImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXPR = eINSTANCE.getNot_Expr();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.ContractImpl
		 * @see de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementsPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__PRE_CONDITION = eINSTANCE.getContract_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__POST_CONDITION = eINSTANCE.getContract_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__INVARIANT = eINSTANCE.getContract_Invariant();

	}

} //TaskInternalRequirementsPackage
