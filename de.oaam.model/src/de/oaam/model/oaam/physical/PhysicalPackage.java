/**
 */
package de.oaam.model.oaam.physical;

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
 * The description of physical interactions of functions.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.physical.PhysicalFactory
 * @model kind="package"
 * @generated
 */
public interface PhysicalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "physical";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v160/physical";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.physical";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhysicalPackage eINSTANCE = de.oaam.model.oaam.physical.impl.PhysicalPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.physical.impl.PhysicalInteractionContainerAImpl <em>Interaction Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.physical.impl.PhysicalInteractionContainerAImpl
	 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getPhysicalInteractionContainerA()
	 * @generated
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subphysical Interactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__SENSORS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interaction Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interaction Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_CONTAINER_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.physical.impl.PhysicalInterfaceAImpl <em>Interface A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.physical.impl.PhysicalInterfaceAImpl
	 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getPhysicalInterfaceA()
	 * @generated
	 */
	int PHYSICAL_INTERFACE_A = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__UNIT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__DIMENSION = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A__IMPLEMENTED_BY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interface A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERFACE_A_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.physical.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.physical.impl.SensorImpl
	 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = PHYSICAL_INTERFACE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = PHYSICAL_INTERFACE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__STYLE = PHYSICAL_INTERFACE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ATTRIBUTES = PHYSICAL_INTERFACE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DOCUMENTATION = PHYSICAL_INTERFACE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MODIFIED = PHYSICAL_INTERFACE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MODIFIER = PHYSICAL_INTERFACE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TRACE_LINK = PHYSICAL_INTERFACE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__UNIT = PHYSICAL_INTERFACE_A__UNIT;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DIMENSION = PHYSICAL_INTERFACE_A__DIMENSION;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IMPLEMENTED_BY = PHYSICAL_INTERFACE_A__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Signalled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SIGNALLED_BY = PHYSICAL_INTERFACE_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = PHYSICAL_INTERFACE_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = PHYSICAL_INTERFACE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.physical.impl.EffectorImpl <em>Effector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.physical.impl.EffectorImpl
	 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getEffector()
	 * @generated
	 */
	int EFFECTOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__ID = PHYSICAL_INTERFACE_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__NAME = PHYSICAL_INTERFACE_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__STYLE = PHYSICAL_INTERFACE_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__ATTRIBUTES = PHYSICAL_INTERFACE_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__DOCUMENTATION = PHYSICAL_INTERFACE_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__MODIFIED = PHYSICAL_INTERFACE_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__MODIFIER = PHYSICAL_INTERFACE_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__TRACE_LINK = PHYSICAL_INTERFACE_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__UNIT = PHYSICAL_INTERFACE_A__UNIT;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__DIMENSION = PHYSICAL_INTERFACE_A__DIMENSION;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__IMPLEMENTED_BY = PHYSICAL_INTERFACE_A__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Observable By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__OBSERVABLE_BY = PHYSICAL_INTERFACE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR__SIGNALLED_BY = PHYSICAL_INTERFACE_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Effector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR_FEATURE_COUNT = PHYSICAL_INTERFACE_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Effector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR_OPERATION_COUNT = PHYSICAL_INTERFACE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.physical.impl.PhysicalInteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.physical.impl.PhysicalInteractionImpl
	 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getPhysicalInteraction()
	 * @generated
	 */
	int PHYSICAL_INTERACTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__ID = PHYSICAL_INTERACTION_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__NAME = PHYSICAL_INTERACTION_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__STYLE = PHYSICAL_INTERACTION_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__ATTRIBUTES = PHYSICAL_INTERACTION_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__DOCUMENTATION = PHYSICAL_INTERACTION_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__MODIFIED = PHYSICAL_INTERACTION_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__MODIFIER = PHYSICAL_INTERACTION_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__TRACE_LINK = PHYSICAL_INTERACTION_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__FUNCTION = PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION;

	/**
	 * The feature id for the '<em><b>Subphysical Interactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__SUBPHYSICAL_INTERACTIONS = PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__SENSORS = PHYSICAL_INTERACTION_CONTAINER_A__SENSORS;

	/**
	 * The feature id for the '<em><b>Effectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION__EFFECTORS = PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_FEATURE_COUNT = PHYSICAL_INTERACTION_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INTERACTION_OPERATION_COUNT = PHYSICAL_INTERACTION_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.physical.impl.SubphysicalInteractionImpl <em>Subphysical Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.physical.impl.SubphysicalInteractionImpl
	 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getSubphysicalInteraction()
	 * @generated
	 */
	int SUBPHYSICAL_INTERACTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__ID = PHYSICAL_INTERACTION_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__NAME = PHYSICAL_INTERACTION_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__STYLE = PHYSICAL_INTERACTION_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__ATTRIBUTES = PHYSICAL_INTERACTION_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__DOCUMENTATION = PHYSICAL_INTERACTION_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__MODIFIED = PHYSICAL_INTERACTION_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__MODIFIER = PHYSICAL_INTERACTION_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__TRACE_LINK = PHYSICAL_INTERACTION_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__FUNCTION = PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION;

	/**
	 * The feature id for the '<em><b>Subphysical Interactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__SUBPHYSICAL_INTERACTIONS = PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__SENSORS = PHYSICAL_INTERACTION_CONTAINER_A__SENSORS;

	/**
	 * The feature id for the '<em><b>Effectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION__EFFECTORS = PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS;

	/**
	 * The number of structural features of the '<em>Subphysical Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION_FEATURE_COUNT = PHYSICAL_INTERACTION_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subphysical Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPHYSICAL_INTERACTION_OPERATION_COUNT = PHYSICAL_INTERACTION_CONTAINER_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA <em>Interaction Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Container A</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInteractionContainerA
	 * @generated
	 */
	EClass getPhysicalInteractionContainerA();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getFunction()
	 * @see #getPhysicalInteractionContainerA()
	 * @generated
	 */
	EReference getPhysicalInteractionContainerA_Function();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getSubphysicalInteractions <em>Subphysical Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subphysical Interactions</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getSubphysicalInteractions()
	 * @see #getPhysicalInteractionContainerA()
	 * @generated
	 */
	EReference getPhysicalInteractionContainerA_SubphysicalInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getSensors()
	 * @see #getPhysicalInteractionContainerA()
	 * @generated
	 */
	EReference getPhysicalInteractionContainerA_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getEffectors <em>Effectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effectors</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getEffectors()
	 * @see #getPhysicalInteractionContainerA()
	 * @generated
	 */
	EReference getPhysicalInteractionContainerA_Effectors();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.physical.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see de.oaam.model.oaam.physical.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.physical.Sensor#getSignalledBy <em>Signalled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signalled By</em>'.
	 * @see de.oaam.model.oaam.physical.Sensor#getSignalledBy()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_SignalledBy();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.physical.Effector <em>Effector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effector</em>'.
	 * @see de.oaam.model.oaam.physical.Effector
	 * @generated
	 */
	EClass getEffector();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.physical.Effector#getObservableBy <em>Observable By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observable By</em>'.
	 * @see de.oaam.model.oaam.physical.Effector#getObservableBy()
	 * @see #getEffector()
	 * @generated
	 */
	EReference getEffector_ObservableBy();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.physical.Effector#getSignalledBy <em>Signalled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signalled By</em>'.
	 * @see de.oaam.model.oaam.physical.Effector#getSignalledBy()
	 * @see #getEffector()
	 * @generated
	 */
	EReference getEffector_SignalledBy();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.physical.PhysicalInterfaceA <em>Interface A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface A</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInterfaceA
	 * @generated
	 */
	EClass getPhysicalInterfaceA();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.physical.PhysicalInterfaceA#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInterfaceA#getUnit()
	 * @see #getPhysicalInterfaceA()
	 * @generated
	 */
	EAttribute getPhysicalInterfaceA_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.physical.PhysicalInterfaceA#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInterfaceA#getDimension()
	 * @see #getPhysicalInterfaceA()
	 * @generated
	 */
	EAttribute getPhysicalInterfaceA_Dimension();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.physical.PhysicalInterfaceA#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented By</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInterfaceA#getImplementedBy()
	 * @see #getPhysicalInterfaceA()
	 * @generated
	 */
	EReference getPhysicalInterfaceA_ImplementedBy();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.physical.PhysicalInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see de.oaam.model.oaam.physical.PhysicalInteraction
	 * @generated
	 */
	EClass getPhysicalInteraction();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.physical.SubphysicalInteraction <em>Subphysical Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subphysical Interaction</em>'.
	 * @see de.oaam.model.oaam.physical.SubphysicalInteraction
	 * @generated
	 */
	EClass getSubphysicalInteraction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhysicalFactory getPhysicalFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.physical.impl.PhysicalInteractionContainerAImpl <em>Interaction Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.physical.impl.PhysicalInteractionContainerAImpl
		 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getPhysicalInteractionContainerA()
		 * @generated
		 */
		EClass PHYSICAL_INTERACTION_CONTAINER_A = eINSTANCE.getPhysicalInteractionContainerA();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION = eINSTANCE.getPhysicalInteractionContainerA_Function();

		/**
		 * The meta object literal for the '<em><b>Subphysical Interactions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS = eINSTANCE.getPhysicalInteractionContainerA_SubphysicalInteractions();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_INTERACTION_CONTAINER_A__SENSORS = eINSTANCE.getPhysicalInteractionContainerA_Sensors();

		/**
		 * The meta object literal for the '<em><b>Effectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS = eINSTANCE.getPhysicalInteractionContainerA_Effectors();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.physical.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.physical.impl.SensorImpl
		 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Signalled By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SIGNALLED_BY = eINSTANCE.getSensor_SignalledBy();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.physical.impl.EffectorImpl <em>Effector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.physical.impl.EffectorImpl
		 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getEffector()
		 * @generated
		 */
		EClass EFFECTOR = eINSTANCE.getEffector();

		/**
		 * The meta object literal for the '<em><b>Observable By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTOR__OBSERVABLE_BY = eINSTANCE.getEffector_ObservableBy();

		/**
		 * The meta object literal for the '<em><b>Signalled By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTOR__SIGNALLED_BY = eINSTANCE.getEffector_SignalledBy();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.physical.impl.PhysicalInterfaceAImpl <em>Interface A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.physical.impl.PhysicalInterfaceAImpl
		 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getPhysicalInterfaceA()
		 * @generated
		 */
		EClass PHYSICAL_INTERFACE_A = eINSTANCE.getPhysicalInterfaceA();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_INTERFACE_A__UNIT = eINSTANCE.getPhysicalInterfaceA_Unit();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_INTERFACE_A__DIMENSION = eINSTANCE.getPhysicalInterfaceA_Dimension();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_INTERFACE_A__IMPLEMENTED_BY = eINSTANCE.getPhysicalInterfaceA_ImplementedBy();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.physical.impl.PhysicalInteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.physical.impl.PhysicalInteractionImpl
		 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getPhysicalInteraction()
		 * @generated
		 */
		EClass PHYSICAL_INTERACTION = eINSTANCE.getPhysicalInteraction();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.physical.impl.SubphysicalInteractionImpl <em>Subphysical Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.physical.impl.SubphysicalInteractionImpl
		 * @see de.oaam.model.oaam.physical.impl.PhysicalPackageImpl#getSubphysicalInteraction()
		 * @generated
		 */
		EClass SUBPHYSICAL_INTERACTION = eINSTANCE.getSubphysicalInteraction();

	}

} //PhysicalPackage
