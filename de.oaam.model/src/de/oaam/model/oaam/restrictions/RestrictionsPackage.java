/**
 */
package de.oaam.model.oaam.restrictions;

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
 * <!-- begin-model-doc -->
 * Constraints on system functions including the presented safety and timing restrictions.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.restrictions.RestrictionsFactory
 * @model kind="package"
 * @generated
 */
public interface RestrictionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "restrictions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v100/restrictions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestrictionsPackage eINSTANCE = de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getRestrictionsContainerA()
	 * @generated
	 */
	int RESTRICTIONS_CONTAINER_A = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Type Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Area Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Power Source Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task Atomic Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Task Symmetry Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Task Rate Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__TASK_RATE_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Input Synchronicity Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION = CommonPackage._ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Connection Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Connection Type Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Segregations Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Signal Delay Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__SIGNAL_DELAY_RESTRICTION = CommonPackage._ELEMENT_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Subrestrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_CONTAINER_A_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.RestrictionsImpl <em>Restrictions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getRestrictions()
	 * @generated
	 */
	int RESTRICTIONS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__ID = RESTRICTIONS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__NAME = RESTRICTIONS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__STYLE = RESTRICTIONS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__ATTRIBUTES = RESTRICTIONS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__DOCUMENTATION = RESTRICTIONS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__MODIFIED = RESTRICTIONS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__MODIFIER = RESTRICTIONS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__TRACE_LINK = RESTRICTIONS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Type Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__DEVICE_TYPE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Device Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__DEVICE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Location Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__LOCATION_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Area Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__AREA_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Power Source Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__POWER_SOURCE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Task Atomic Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__TASK_ATOMIC_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Task Symmetry Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__TASK_SYMMETRY_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Task Rate Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__TASK_RATE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__TASK_RATE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Input Synchronicity Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__INPUT_SYNCHRONICITY_RESTRICTION = RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Connection Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__CONNECTION_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Connection Type Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__CONNECTION_TYPE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Segregations Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__SEGREGATIONS_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Signal Delay Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__SIGNAL_DELAY_RESTRICTION = RESTRICTIONS_CONTAINER_A__SIGNAL_DELAY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Subrestrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS__SUBRESTRICTIONS = RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS;

	/**
	 * The number of structural features of the '<em>Restrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_FEATURE_COUNT = RESTRICTIONS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Restrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_OPERATION_COUNT = RESTRICTIONS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.SubrestrictionsImpl <em>Subrestrictions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.SubrestrictionsImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSubrestrictions()
	 * @generated
	 */
	int SUBRESTRICTIONS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__ID = RESTRICTIONS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__NAME = RESTRICTIONS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__STYLE = RESTRICTIONS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__ATTRIBUTES = RESTRICTIONS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__DOCUMENTATION = RESTRICTIONS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__MODIFIED = RESTRICTIONS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__MODIFIER = RESTRICTIONS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__TRACE_LINK = RESTRICTIONS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Device Type Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__DEVICE_TYPE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Device Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__DEVICE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Location Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__LOCATION_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Area Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__AREA_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Power Source Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__POWER_SOURCE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Task Atomic Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__TASK_ATOMIC_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Task Symmetry Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__TASK_SYMMETRY_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Task Rate Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__TASK_RATE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__TASK_RATE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Input Synchronicity Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__INPUT_SYNCHRONICITY_RESTRICTION = RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Connection Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__CONNECTION_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Connection Type Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__CONNECTION_TYPE_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Segregations Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__SEGREGATIONS_RESTRICTIONS = RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Signal Delay Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__SIGNAL_DELAY_RESTRICTION = RESTRICTIONS_CONTAINER_A__SIGNAL_DELAY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Subrestrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__SUBRESTRICTIONS = RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__VARIANTS = RESTRICTIONS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS__OPERATION_MODES = RESTRICTIONS_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subrestrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS_FEATURE_COUNT = RESTRICTIONS_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subrestrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESTRICTIONS_OPERATION_COUNT = RESTRICTIONS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionAImpl <em>Device Restriction A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.DeviceRestrictionAImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getDeviceRestrictionA()
	 * @generated
	 */
	int DEVICE_RESTRICTION_A = 3;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION_A__DEVICES = 0;

	/**
	 * The number of structural features of the '<em>Device Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.ConnectionRestrinctionAImpl <em>Connection Restrinction A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.ConnectionRestrinctionAImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getConnectionRestrinctionA()
	 * @generated
	 */
	int CONNECTION_RESTRINCTION_A = 4;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRINCTION_A__CONNECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Connection Restrinction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRINCTION_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connection Restrinction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRINCTION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.TaskRestrictionAImpl <em>Task Restriction A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.TaskRestrictionAImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskRestrictionA()
	 * @generated
	 */
	int TASK_RESTRICTION_A = 5;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESTRICTION_A__TASKS = 0;

	/**
	 * The number of structural features of the '<em>Task Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESTRICTION_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESTRICTION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.SignalRestrictionAImpl <em>Signal Restriction A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.SignalRestrictionAImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSignalRestrictionA()
	 * @generated
	 */
	int SIGNAL_RESTRICTION_A = 6;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RESTRICTION_A__SIGNALS = 0;

	/**
	 * The number of structural features of the '<em>Signal Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RESTRICTION_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signal Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RESTRICTION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.SubFunctionRestrictionAImpl <em>Sub Function Restriction A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.SubFunctionRestrictionAImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSubFunctionRestrictionA()
	 * @generated
	 */
	int SUB_FUNCTION_RESTRICTION_A = 7;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Sub Function Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FUNCTION_RESTRICTION_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sub Function Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FUNCTION_RESTRICTION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.PathRestrictionAImpl <em>Path Restriction A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.PathRestrictionAImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getPathRestrictionA()
	 * @generated
	 */
	int PATH_RESTRICTION_A = 8;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESTRICTION_A__SEGMENTS = 0;

	/**
	 * The number of structural features of the '<em>Path Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESTRICTION_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESTRICTION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.PathSegmentImpl <em>Path Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.PathSegmentImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getPathSegment()
	 * @generated
	 */
	int PATH_SEGMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__TASK = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT__SIGNAL = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Path Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEGMENT_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.TaskGroupRestrictionAImpl <em>Task Group Restriction A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.TaskGroupRestrictionAImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskGroupRestrictionA()
	 * @generated
	 */
	int TASK_GROUP_RESTRICTION_A = 10;

	/**
	 * The feature id for the '<em><b>Task Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_RESTRICTION_A__TASK_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Task Group Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_RESTRICTION_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task Group Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_RESTRICTION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.InputRestrictionAImpl <em>Input Restriction A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.InputRestrictionAImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getInputRestrictionA()
	 * @generated
	 */
	int INPUT_RESTRICTION_A = 11;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RESTRICTION_A__INPUTS = 0;

	/**
	 * The number of structural features of the '<em>Input Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RESTRICTION_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Restriction A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RESTRICTION_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl <em>Location Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getLocationRestriction()
	 * @generated
	 */
	int LOCATION_RESTRICTION = 12;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__TASKS = TASK_RESTRICTION_A__TASKS;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__SIGNALS = TASK_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__SUB_FUNCTIONS = TASK_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__DEVICES = TASK_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__CONNECTIONS = TASK_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__ID = TASK_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__STYLE = TASK_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__ATTRIBUTES = TASK_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__DOCUMENTATION = TASK_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__MODIFIED = TASK_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__MODIFIER = TASK_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__TRACE_LINK = TASK_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__VARIANTS = TASK_RESTRICTION_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__OPERATION_MODES = TASK_RESTRICTION_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__LOCATION_NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__IS_FORBIDDEN = TASK_RESTRICTION_A_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION__LOCATIONS = TASK_RESTRICTION_A_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Location Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION_FEATURE_COUNT = TASK_RESTRICTION_A_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Location Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESTRICTION_OPERATION_COUNT = TASK_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.AreaRestrictionImpl <em>Area Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.AreaRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getAreaRestriction()
	 * @generated
	 */
	int AREA_RESTRICTION = 13;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__TASKS = TASK_RESTRICTION_A__TASKS;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__SIGNALS = TASK_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__SUB_FUNCTIONS = TASK_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__DEVICES = TASK_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__CONNECTIONS = TASK_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__ID = TASK_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__STYLE = TASK_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__ATTRIBUTES = TASK_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__DOCUMENTATION = TASK_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__MODIFIED = TASK_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__MODIFIER = TASK_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__TRACE_LINK = TASK_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__VARIANTS = TASK_RESTRICTION_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__OPERATION_MODES = TASK_RESTRICTION_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Area Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__AREA_NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__IS_FORBIDDEN = TASK_RESTRICTION_A_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION__AREAS = TASK_RESTRICTION_A_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Area Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION_FEATURE_COUNT = TASK_RESTRICTION_A_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Area Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_RESTRICTION_OPERATION_COUNT = TASK_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.PowerSourceRestrictionImpl <em>Power Source Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.PowerSourceRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getPowerSourceRestriction()
	 * @generated
	 */
	int POWER_SOURCE_RESTRICTION = 14;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__TASKS = TASK_RESTRICTION_A__TASKS;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__DEVICES = TASK_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__SIGNALS = TASK_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__SUB_FUNCTIONS = TASK_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__ID = TASK_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__STYLE = TASK_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__ATTRIBUTES = TASK_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__DOCUMENTATION = TASK_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__MODIFIED = TASK_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__MODIFIER = TASK_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__TRACE_LINK = TASK_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__VARIANTS = TASK_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__OPERATION_MODES = TASK_RESTRICTION_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Power Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__POWER_SOURCE_NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__IS_FORBIDDEN = TASK_RESTRICTION_A_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Power Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION__POWER_SOURCES = TASK_RESTRICTION_A_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Power Source Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION_FEATURE_COUNT = TASK_RESTRICTION_A_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Power Source Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_RESTRICTION_OPERATION_COUNT = TASK_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl <em>Device Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getDeviceRestriction()
	 * @generated
	 */
	int DEVICE_RESTRICTION = 15;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__TASKS = TASK_RESTRICTION_A__TASKS;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__SIGNALS = TASK_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__SUB_FUNCTIONS = TASK_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__ID = TASK_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__STYLE = TASK_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__ATTRIBUTES = TASK_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__DOCUMENTATION = TASK_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__MODIFIED = TASK_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__MODIFIER = TASK_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__TRACE_LINK = TASK_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__VARIANTS = TASK_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__OPERATION_MODES = TASK_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__DEVICE_NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__IS_FORBIDDEN = TASK_RESTRICTION_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION__DEVICES = TASK_RESTRICTION_A_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Device Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION_FEATURE_COUNT = TASK_RESTRICTION_A_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Device Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESTRICTION_OPERATION_COUNT = TASK_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.DeviceTypeRestrictionImpl <em>Device Type Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.DeviceTypeRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getDeviceTypeRestriction()
	 * @generated
	 */
	int DEVICE_TYPE_RESTRICTION = 16;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__TASKS = TASK_RESTRICTION_A__TASKS;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__SIGNALS = TASK_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__SUB_FUNCTIONS = TASK_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__ID = TASK_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__STYLE = TASK_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__ATTRIBUTES = TASK_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__DOCUMENTATION = TASK_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__MODIFIED = TASK_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__MODIFIER = TASK_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__TRACE_LINK = TASK_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__VARIANTS = TASK_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__OPERATION_MODES = TASK_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Device Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__DEVICE_TYPE_NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__IS_FORBIDDEN = TASK_RESTRICTION_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Device Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION__DEVICE_TYPES = TASK_RESTRICTION_A_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Device Type Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION_FEATURE_COUNT = TASK_RESTRICTION_A_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Device Type Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_RESTRICTION_OPERATION_COUNT = TASK_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.ConectionTypeRestrictionImpl <em>Conection Type Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.ConectionTypeRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getConectionTypeRestriction()
	 * @generated
	 */
	int CONECTION_TYPE_RESTRICTION = 17;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__SIGNALS = SIGNAL_RESTRICTION_A__SIGNALS;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__SUB_FUNCTIONS = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__ID = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__NAME = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__STYLE = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__ATTRIBUTES = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__DOCUMENTATION = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__MODIFIED = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__MODIFIER = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__TRACE_LINK = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__VARIANTS = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__OPERATION_MODES = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Connection Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__CONNECTION_TYPE_NAME = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__IS_FORBIDDEN = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Connection Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION__CONNECTION_TYPES = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Conection Type Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION_FEATURE_COUNT = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Conection Type Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTION_TYPE_RESTRICTION_OPERATION_COUNT = SIGNAL_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.ConnectionRestrictionImpl <em>Connection Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.ConnectionRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getConnectionRestriction()
	 * @generated
	 */
	int CONNECTION_RESTRICTION = 18;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__SIGNALS = SIGNAL_RESTRICTION_A__SIGNALS;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__SUB_FUNCTIONS = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__ID = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__NAME = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__STYLE = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__ATTRIBUTES = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__DOCUMENTATION = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__MODIFIED = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__MODIFIER = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__TRACE_LINK = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__VARIANTS = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__OPERATION_MODES = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Connection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__CONNECTION_NAME = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__IS_FORBIDDEN = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__CONNECTIONS = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Connection Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION_FEATURE_COUNT = SIGNAL_RESTRICTION_A_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Connection Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION_OPERATION_COUNT = SIGNAL_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl <em>Segregation Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSegregationRestriction()
	 * @generated
	 */
	int SEGREGATION_RESTRICTION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__ID = CommonPackage._ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__NAME = CommonPackage._ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__STYLE = CommonPackage._ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__ATTRIBUTES = CommonPackage._ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__DOCUMENTATION = CommonPackage._ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__MODIFIED = CommonPackage._ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__MODIFIER = CommonPackage._ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__TRACE_LINK = CommonPackage._ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__OPERATION_MODES = CommonPackage._ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__VARIANTS = CommonPackage._ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__TASKS_A = CommonPackage._ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tasks B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__TASKS_B = CommonPackage._ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dissimilar Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY = CommonPackage._ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dissimilar Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION = CommonPackage._ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Functions A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__SUB_FUNCTIONS_A = CommonPackage._ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub Functions B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__SUB_FUNCTIONS_B = CommonPackage._ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dissimilar Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__DISSIMILAR_AREA = CommonPackage._ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dissimilar Power Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE = CommonPackage._ELEMENT_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Signals A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__SIGNALS_A = CommonPackage._ELEMENT_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Signals B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__SIGNALS_B = CommonPackage._ELEMENT_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Task Groups A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__TASK_GROUPS_A = CommonPackage._ELEMENT_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Task Groups B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__TASK_GROUPS_B = CommonPackage._ELEMENT_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Signal Groups B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__SIGNAL_GROUPS_B = CommonPackage._ELEMENT_A_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Signal Groups A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__SIGNAL_GROUPS_A = CommonPackage._ELEMENT_A_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Devices A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__DEVICES_A = CommonPackage._ELEMENT_A_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Devices B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__DEVICES_B = CommonPackage._ELEMENT_A_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Connections A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__CONNECTIONS_A = CommonPackage._ELEMENT_A_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Connections B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION__CONNECTIONS_B = CommonPackage._ELEMENT_A_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Segregation Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION_FEATURE_COUNT = CommonPackage._ELEMENT_A_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Segregation Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGREGATION_RESTRICTION_OPERATION_COUNT = CommonPackage._ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.TaskRateRestrictionImpl <em>Task Rate Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.TaskRateRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskRateRestriction()
	 * @generated
	 */
	int TASK_RATE_RESTRICTION = 20;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__TASKS = TASK_RESTRICTION_A__TASKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__ID = TASK_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__STYLE = TASK_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__ATTRIBUTES = TASK_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__DOCUMENTATION = TASK_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__MODIFIED = TASK_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__MODIFIER = TASK_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__TRACE_LINK = TASK_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__OPERATION_MODES = TASK_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__VARIANTS = TASK_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__RATE = TASK_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION__MAX_DEVIATION = TASK_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Task Rate Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION_FEATURE_COUNT = TASK_RESTRICTION_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Task Rate Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RATE_RESTRICTION_OPERATION_COUNT = TASK_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.InputSynchronicityRestrictionImpl <em>Input Synchronicity Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.InputSynchronicityRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getInputSynchronicityRestriction()
	 * @generated
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION = 21;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__INPUTS = INPUT_RESTRICTION_A__INPUTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__ID = INPUT_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__NAME = INPUT_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__STYLE = INPUT_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__ATTRIBUTES = INPUT_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__DOCUMENTATION = INPUT_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__MODIFIED = INPUT_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__MODIFIER = INPUT_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__TRACE_LINK = INPUT_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__OPERATION_MODES = INPUT_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__VARIANTS = INPUT_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION__MAX_JITTER = INPUT_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Input Synchronicity Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION_FEATURE_COUNT = INPUT_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Input Synchronicity Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONICITY_RESTRICTION_OPERATION_COUNT = INPUT_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.PathDelayRestrictionImpl <em>Path Delay Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.PathDelayRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getPathDelayRestriction()
	 * @generated
	 */
	int PATH_DELAY_RESTRICTION = 22;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__SEGMENTS = PATH_RESTRICTION_A__SEGMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__ID = PATH_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__NAME = PATH_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__STYLE = PATH_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__ATTRIBUTES = PATH_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__DOCUMENTATION = PATH_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__MODIFIED = PATH_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__MODIFIER = PATH_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__TRACE_LINK = PATH_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__OPERATION_MODES = PATH_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__VARIANTS = PATH_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION__DELAY = PATH_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Path Delay Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION_FEATURE_COUNT = PATH_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Path Delay Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DELAY_RESTRICTION_OPERATION_COUNT = PATH_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.TaskAtomicRestrictionImpl <em>Task Atomic Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.TaskAtomicRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskAtomicRestriction()
	 * @generated
	 */
	int TASK_ATOMIC_RESTRICTION = 23;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__TASKS = TASK_RESTRICTION_A__TASKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__ID = TASK_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__STYLE = TASK_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__ATTRIBUTES = TASK_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__DOCUMENTATION = TASK_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__MODIFIED = TASK_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__MODIFIER = TASK_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__TRACE_LINK = TASK_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__OPERATION_MODES = TASK_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION__VARIANTS = TASK_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Task Atomic Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION_FEATURE_COUNT = TASK_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Task Atomic Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ATOMIC_RESTRICTION_OPERATION_COUNT = TASK_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.impl.TaskSymmetryRestrictionImpl <em>Task Symmetry Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.impl.TaskSymmetryRestrictionImpl
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskSymmetryRestriction()
	 * @generated
	 */
	int TASK_SYMMETRY_RESTRICTION = 24;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__TASKS = TASK_RESTRICTION_A__TASKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__ID = TASK_RESTRICTION_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__NAME = TASK_RESTRICTION_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__STYLE = TASK_RESTRICTION_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__ATTRIBUTES = TASK_RESTRICTION_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__DOCUMENTATION = TASK_RESTRICTION_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__MODIFIED = TASK_RESTRICTION_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__MODIFIER = TASK_RESTRICTION_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__TRACE_LINK = TASK_RESTRICTION_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__OPERATION_MODES = TASK_RESTRICTION_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__VARIANTS = TASK_RESTRICTION_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION__TYPE = TASK_RESTRICTION_A_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Task Symmetry Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION_FEATURE_COUNT = TASK_RESTRICTION_A_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Task Symmetry Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_RESTRICTION_OPERATION_COUNT = TASK_RESTRICTION_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.restrictions.SymmetryTypesE <em>Symmetry Types E</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.restrictions.SymmetryTypesE
	 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSymmetryTypesE()
	 * @generated
	 */
	int SYMMETRY_TYPES_E = 25;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA
	 * @generated
	 */
	EClass getRestrictionsContainerA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getDeviceTypeRestrictions <em>Device Type Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Type Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getDeviceTypeRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_DeviceTypeRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getDeviceRestrictions <em>Device Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getDeviceRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_DeviceRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getLocationRestrictions <em>Location Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getLocationRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_LocationRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getAreaRestrictions <em>Area Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getAreaRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_AreaRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getPowerSourceRestrictions <em>Power Source Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Source Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getPowerSourceRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_PowerSourceRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getTaskAtomicRestrictions <em>Task Atomic Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Atomic Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getTaskAtomicRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_TaskAtomicRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getTaskSymmetryRestrictions <em>Task Symmetry Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Symmetry Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getTaskSymmetryRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_TaskSymmetryRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getTaskRateRestrictions <em>Task Rate Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Rate Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getTaskRateRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_TaskRateRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getInputSynchronicityRestriction <em>Input Synchronicity Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Synchronicity Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getInputSynchronicityRestriction()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_InputSynchronicityRestriction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getConnectionRestrictions <em>Connection Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getConnectionRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_ConnectionRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getConnectionTypeRestrictions <em>Connection Type Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Type Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getConnectionTypeRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_ConnectionTypeRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getSegregationsRestrictions <em>Segregations Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segregations Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getSegregationsRestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_SegregationsRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getSignalDelayRestriction <em>Signal Delay Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Delay Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getSignalDelayRestriction()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_SignalDelayRestriction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA#getSubrestrictions <em>Subrestrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subrestrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA#getSubrestrictions()
	 * @see #getRestrictionsContainerA()
	 * @generated
	 */
	EReference getRestrictionsContainerA_Subrestrictions();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.Restrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.Restrictions
	 * @generated
	 */
	EClass getRestrictions();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.Subrestrictions <em>Subrestrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrestrictions</em>'.
	 * @see de.oaam.model.oaam.restrictions.Subrestrictions
	 * @generated
	 */
	EClass getSubrestrictions();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.DeviceRestrictionA <em>Device Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Restriction A</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceRestrictionA
	 * @generated
	 */
	EClass getDeviceRestrictionA();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.restrictions.DeviceRestrictionA#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Devices</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceRestrictionA#getDevices()
	 * @see #getDeviceRestrictionA()
	 * @generated
	 */
	EReference getDeviceRestrictionA_Devices();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.ConnectionRestrinctionA <em>Connection Restrinction A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Restrinction A</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConnectionRestrinctionA
	 * @generated
	 */
	EClass getConnectionRestrinctionA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.ConnectionRestrinctionA#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConnectionRestrinctionA#getConnections()
	 * @see #getConnectionRestrinctionA()
	 * @generated
	 */
	EReference getConnectionRestrinctionA_Connections();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.TaskRestrictionA <em>Task Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Restriction A</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskRestrictionA
	 * @generated
	 */
	EClass getTaskRestrictionA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.TaskRestrictionA#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskRestrictionA#getTasks()
	 * @see #getTaskRestrictionA()
	 * @generated
	 */
	EReference getTaskRestrictionA_Tasks();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.SignalRestrictionA <em>Signal Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Restriction A</em>'.
	 * @see de.oaam.model.oaam.restrictions.SignalRestrictionA
	 * @generated
	 */
	EClass getSignalRestrictionA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SignalRestrictionA#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signals</em>'.
	 * @see de.oaam.model.oaam.restrictions.SignalRestrictionA#getSignals()
	 * @see #getSignalRestrictionA()
	 * @generated
	 */
	EReference getSignalRestrictionA_Signals();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.SubFunctionRestrictionA <em>Sub Function Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Function Restriction A</em>'.
	 * @see de.oaam.model.oaam.restrictions.SubFunctionRestrictionA
	 * @generated
	 */
	EClass getSubFunctionRestrictionA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SubFunctionRestrictionA#getSubFunctions <em>Sub Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Functions</em>'.
	 * @see de.oaam.model.oaam.restrictions.SubFunctionRestrictionA#getSubFunctions()
	 * @see #getSubFunctionRestrictionA()
	 * @generated
	 */
	EReference getSubFunctionRestrictionA_SubFunctions();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.PathRestrictionA <em>Path Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Restriction A</em>'.
	 * @see de.oaam.model.oaam.restrictions.PathRestrictionA
	 * @generated
	 */
	EClass getPathRestrictionA();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.restrictions.PathRestrictionA#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see de.oaam.model.oaam.restrictions.PathRestrictionA#getSegments()
	 * @see #getPathRestrictionA()
	 * @generated
	 */
	EReference getPathRestrictionA_Segments();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.PathSegment <em>Path Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Segment</em>'.
	 * @see de.oaam.model.oaam.restrictions.PathSegment
	 * @generated
	 */
	EClass getPathSegment();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.restrictions.PathSegment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see de.oaam.model.oaam.restrictions.PathSegment#getTask()
	 * @see #getPathSegment()
	 * @generated
	 */
	EReference getPathSegment_Task();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.restrictions.PathSegment#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see de.oaam.model.oaam.restrictions.PathSegment#getSignal()
	 * @see #getPathSegment()
	 * @generated
	 */
	EReference getPathSegment_Signal();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.TaskGroupRestrictionA <em>Task Group Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Group Restriction A</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskGroupRestrictionA
	 * @generated
	 */
	EClass getTaskGroupRestrictionA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.TaskGroupRestrictionA#getTaskGroups <em>Task Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Groups</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskGroupRestrictionA#getTaskGroups()
	 * @see #getTaskGroupRestrictionA()
	 * @generated
	 */
	EReference getTaskGroupRestrictionA_TaskGroups();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.InputRestrictionA <em>Input Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Restriction A</em>'.
	 * @see de.oaam.model.oaam.restrictions.InputRestrictionA
	 * @generated
	 */
	EClass getInputRestrictionA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.InputRestrictionA#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see de.oaam.model.oaam.restrictions.InputRestrictionA#getInputs()
	 * @see #getInputRestrictionA()
	 * @generated
	 */
	EReference getInputRestrictionA_Inputs();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.LocationRestriction <em>Location Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.LocationRestriction
	 * @generated
	 */
	EClass getLocationRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.LocationRestriction#getLocationName <em>Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Name</em>'.
	 * @see de.oaam.model.oaam.restrictions.LocationRestriction#getLocationName()
	 * @see #getLocationRestriction()
	 * @generated
	 */
	EAttribute getLocationRestriction_LocationName();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.LocationRestriction#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see de.oaam.model.oaam.restrictions.LocationRestriction#isIsForbidden()
	 * @see #getLocationRestriction()
	 * @generated
	 */
	EAttribute getLocationRestriction_IsForbidden();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.LocationRestriction#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see de.oaam.model.oaam.restrictions.LocationRestriction#getLocations()
	 * @see #getLocationRestriction()
	 * @generated
	 */
	EReference getLocationRestriction_Locations();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.AreaRestriction <em>Area Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.AreaRestriction
	 * @generated
	 */
	EClass getAreaRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.AreaRestriction#getAreaName <em>Area Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Name</em>'.
	 * @see de.oaam.model.oaam.restrictions.AreaRestriction#getAreaName()
	 * @see #getAreaRestriction()
	 * @generated
	 */
	EAttribute getAreaRestriction_AreaName();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.AreaRestriction#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see de.oaam.model.oaam.restrictions.AreaRestriction#isIsForbidden()
	 * @see #getAreaRestriction()
	 * @generated
	 */
	EAttribute getAreaRestriction_IsForbidden();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.AreaRestriction#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Areas</em>'.
	 * @see de.oaam.model.oaam.restrictions.AreaRestriction#getAreas()
	 * @see #getAreaRestriction()
	 * @generated
	 */
	EReference getAreaRestriction_Areas();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction <em>Power Source Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Source Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.PowerSourceRestriction
	 * @generated
	 */
	EClass getPowerSourceRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction#getPowerSourceName <em>Power Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Source Name</em>'.
	 * @see de.oaam.model.oaam.restrictions.PowerSourceRestriction#getPowerSourceName()
	 * @see #getPowerSourceRestriction()
	 * @generated
	 */
	EAttribute getPowerSourceRestriction_PowerSourceName();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see de.oaam.model.oaam.restrictions.PowerSourceRestriction#isIsForbidden()
	 * @see #getPowerSourceRestriction()
	 * @generated
	 */
	EAttribute getPowerSourceRestriction_IsForbidden();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction#getPowerSources <em>Power Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Sources</em>'.
	 * @see de.oaam.model.oaam.restrictions.PowerSourceRestriction#getPowerSources()
	 * @see #getPowerSourceRestriction()
	 * @generated
	 */
	EReference getPowerSourceRestriction_PowerSources();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.DeviceRestriction <em>Device Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceRestriction
	 * @generated
	 */
	EClass getDeviceRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.DeviceRestriction#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceRestriction#getDeviceName()
	 * @see #getDeviceRestriction()
	 * @generated
	 */
	EAttribute getDeviceRestriction_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.DeviceRestriction#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceRestriction#isIsForbidden()
	 * @see #getDeviceRestriction()
	 * @generated
	 */
	EAttribute getDeviceRestriction_IsForbidden();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.DeviceRestriction#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceRestriction#getDevices()
	 * @see #getDeviceRestriction()
	 * @generated
	 */
	EReference getDeviceRestriction_Devices();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction <em>Device Type Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceTypeRestriction
	 * @generated
	 */
	EClass getDeviceTypeRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction#getDeviceTypeName <em>Device Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type Name</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceTypeRestriction#getDeviceTypeName()
	 * @see #getDeviceTypeRestriction()
	 * @generated
	 */
	EAttribute getDeviceTypeRestriction_DeviceTypeName();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceTypeRestriction#isIsForbidden()
	 * @see #getDeviceTypeRestriction()
	 * @generated
	 */
	EAttribute getDeviceTypeRestriction_IsForbidden();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction#getDeviceTypes <em>Device Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Device Types</em>'.
	 * @see de.oaam.model.oaam.restrictions.DeviceTypeRestriction#getDeviceTypes()
	 * @see #getDeviceTypeRestriction()
	 * @generated
	 */
	EReference getDeviceTypeRestriction_DeviceTypes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.ConectionTypeRestriction <em>Conection Type Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conection Type Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConectionTypeRestriction
	 * @generated
	 */
	EClass getConectionTypeRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.ConectionTypeRestriction#getConnectionTypeName <em>Connection Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type Name</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConectionTypeRestriction#getConnectionTypeName()
	 * @see #getConectionTypeRestriction()
	 * @generated
	 */
	EAttribute getConectionTypeRestriction_ConnectionTypeName();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.ConectionTypeRestriction#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConectionTypeRestriction#isIsForbidden()
	 * @see #getConectionTypeRestriction()
	 * @generated
	 */
	EAttribute getConectionTypeRestriction_IsForbidden();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.ConectionTypeRestriction#getConnectionTypes <em>Connection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection Types</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConectionTypeRestriction#getConnectionTypes()
	 * @see #getConectionTypeRestriction()
	 * @generated
	 */
	EReference getConectionTypeRestriction_ConnectionTypes();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.ConnectionRestriction <em>Connection Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConnectionRestriction
	 * @generated
	 */
	EClass getConnectionRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.ConnectionRestriction#getConnectionName <em>Connection Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Name</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConnectionRestriction#getConnectionName()
	 * @see #getConnectionRestriction()
	 * @generated
	 */
	EAttribute getConnectionRestriction_ConnectionName();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.ConnectionRestriction#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConnectionRestriction#isIsForbidden()
	 * @see #getConnectionRestriction()
	 * @generated
	 */
	EAttribute getConnectionRestriction_IsForbidden();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.ConnectionRestriction#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see de.oaam.model.oaam.restrictions.ConnectionRestriction#getConnections()
	 * @see #getConnectionRestriction()
	 * @generated
	 */
	EReference getConnectionRestriction_Connections();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.SegregationRestriction <em>Segregation Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segregation Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction
	 * @generated
	 */
	EClass getSegregationRestriction();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getTasksA <em>Tasks A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks A</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getTasksA()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_TasksA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getTasksB <em>Tasks B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks B</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getTasksB()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_TasksB();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarTechnology <em>Dissimilar Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dissimilar Technology</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarTechnology()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EAttribute getSegregationRestriction_DissimilarTechnology();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarLocation <em>Dissimilar Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dissimilar Location</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarLocation()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EAttribute getSegregationRestriction_DissimilarLocation();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSubFunctionsA <em>Sub Functions A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Functions A</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getSubFunctionsA()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_SubFunctionsA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSubFunctionsB <em>Sub Functions B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Functions B</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getSubFunctionsB()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_SubFunctionsB();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarArea <em>Dissimilar Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dissimilar Area</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarArea()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EAttribute getSegregationRestriction_DissimilarArea();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarPowerSource <em>Dissimilar Power Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dissimilar Power Source</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarPowerSource()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EAttribute getSegregationRestriction_DissimilarPowerSource();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalsA <em>Signals A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signals A</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalsA()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_SignalsA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalsB <em>Signals B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signals B</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalsB()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_SignalsB();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getTaskGroupsA <em>Task Groups A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Groups A</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getTaskGroupsA()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_TaskGroupsA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getTaskGroupsB <em>Task Groups B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Groups B</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getTaskGroupsB()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_TaskGroupsB();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalGroupsB <em>Signal Groups B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signal Groups B</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalGroupsB()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_SignalGroupsB();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalGroupsA <em>Signal Groups A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signal Groups A</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalGroupsA()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_SignalGroupsA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getDevicesA <em>Devices A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices A</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getDevicesA()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_DevicesA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getDevicesB <em>Devices B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices B</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getDevicesB()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_DevicesB();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getConnectionsA <em>Connections A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections A</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getConnectionsA()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_ConnectionsA();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getConnectionsB <em>Connections B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections B</em>'.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction#getConnectionsB()
	 * @see #getSegregationRestriction()
	 * @generated
	 */
	EReference getSegregationRestriction_ConnectionsB();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.TaskRateRestriction <em>Task Rate Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Rate Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskRateRestriction
	 * @generated
	 */
	EClass getTaskRateRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.TaskRateRestriction#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskRateRestriction#getRate()
	 * @see #getTaskRateRestriction()
	 * @generated
	 */
	EAttribute getTaskRateRestriction_Rate();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.TaskRateRestriction#getMaxDeviation <em>Max Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Deviation</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskRateRestriction#getMaxDeviation()
	 * @see #getTaskRateRestriction()
	 * @generated
	 */
	EAttribute getTaskRateRestriction_MaxDeviation();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.InputSynchronicityRestriction <em>Input Synchronicity Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Synchronicity Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.InputSynchronicityRestriction
	 * @generated
	 */
	EClass getInputSynchronicityRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.InputSynchronicityRestriction#getMaxJitter <em>Max Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Jitter</em>'.
	 * @see de.oaam.model.oaam.restrictions.InputSynchronicityRestriction#getMaxJitter()
	 * @see #getInputSynchronicityRestriction()
	 * @generated
	 */
	EAttribute getInputSynchronicityRestriction_MaxJitter();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.PathDelayRestriction <em>Path Delay Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Delay Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.PathDelayRestriction
	 * @generated
	 */
	EClass getPathDelayRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.PathDelayRestriction#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see de.oaam.model.oaam.restrictions.PathDelayRestriction#getDelay()
	 * @see #getPathDelayRestriction()
	 * @generated
	 */
	EAttribute getPathDelayRestriction_Delay();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.TaskAtomicRestriction <em>Task Atomic Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Atomic Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskAtomicRestriction
	 * @generated
	 */
	EClass getTaskAtomicRestriction();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.restrictions.TaskSymmetryRestriction <em>Task Symmetry Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Symmetry Restriction</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskSymmetryRestriction
	 * @generated
	 */
	EClass getTaskSymmetryRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.restrictions.TaskSymmetryRestriction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oaam.model.oaam.restrictions.TaskSymmetryRestriction#getType()
	 * @see #getTaskSymmetryRestriction()
	 * @generated
	 */
	EAttribute getTaskSymmetryRestriction_Type();

	/**
	 * Returns the meta object for enum '{@link de.oaam.model.oaam.restrictions.SymmetryTypesE <em>Symmetry Types E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symmetry Types E</em>'.
	 * @see de.oaam.model.oaam.restrictions.SymmetryTypesE
	 * @generated
	 */
	EEnum getSymmetryTypesE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestrictionsFactory getRestrictionsFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getRestrictionsContainerA()
		 * @generated
		 */
		EClass RESTRICTIONS_CONTAINER_A = eINSTANCE.getRestrictionsContainerA();

		/**
		 * The meta object literal for the '<em><b>Device Type Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_DeviceTypeRestrictions();

		/**
		 * The meta object literal for the '<em><b>Device Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_DeviceRestrictions();

		/**
		 * The meta object literal for the '<em><b>Location Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_LocationRestrictions();

		/**
		 * The meta object literal for the '<em><b>Area Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_AreaRestrictions();

		/**
		 * The meta object literal for the '<em><b>Power Source Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_PowerSourceRestrictions();

		/**
		 * The meta object literal for the '<em><b>Task Atomic Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_TaskAtomicRestrictions();

		/**
		 * The meta object literal for the '<em><b>Task Symmetry Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_TaskSymmetryRestrictions();

		/**
		 * The meta object literal for the '<em><b>Task Rate Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__TASK_RATE_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_TaskRateRestrictions();

		/**
		 * The meta object literal for the '<em><b>Input Synchronicity Restriction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION = eINSTANCE.getRestrictionsContainerA_InputSynchronicityRestriction();

		/**
		 * The meta object literal for the '<em><b>Connection Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_ConnectionRestrictions();

		/**
		 * The meta object literal for the '<em><b>Connection Type Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_ConnectionTypeRestrictions();

		/**
		 * The meta object literal for the '<em><b>Segregations Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS = eINSTANCE.getRestrictionsContainerA_SegregationsRestrictions();

		/**
		 * The meta object literal for the '<em><b>Signal Delay Restriction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__SIGNAL_DELAY_RESTRICTION = eINSTANCE.getRestrictionsContainerA_SignalDelayRestriction();

		/**
		 * The meta object literal for the '<em><b>Subrestrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS = eINSTANCE.getRestrictionsContainerA_Subrestrictions();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.RestrictionsImpl <em>Restrictions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getRestrictions()
		 * @generated
		 */
		EClass RESTRICTIONS = eINSTANCE.getRestrictions();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.SubrestrictionsImpl <em>Subrestrictions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.SubrestrictionsImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSubrestrictions()
		 * @generated
		 */
		EClass SUBRESTRICTIONS = eINSTANCE.getSubrestrictions();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionAImpl <em>Device Restriction A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.DeviceRestrictionAImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getDeviceRestrictionA()
		 * @generated
		 */
		EClass DEVICE_RESTRICTION_A = eINSTANCE.getDeviceRestrictionA();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_RESTRICTION_A__DEVICES = eINSTANCE.getDeviceRestrictionA_Devices();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.ConnectionRestrinctionAImpl <em>Connection Restrinction A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.ConnectionRestrinctionAImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getConnectionRestrinctionA()
		 * @generated
		 */
		EClass CONNECTION_RESTRINCTION_A = eINSTANCE.getConnectionRestrinctionA();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_RESTRINCTION_A__CONNECTIONS = eINSTANCE.getConnectionRestrinctionA_Connections();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.TaskRestrictionAImpl <em>Task Restriction A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.TaskRestrictionAImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskRestrictionA()
		 * @generated
		 */
		EClass TASK_RESTRICTION_A = eINSTANCE.getTaskRestrictionA();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_RESTRICTION_A__TASKS = eINSTANCE.getTaskRestrictionA_Tasks();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.SignalRestrictionAImpl <em>Signal Restriction A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.SignalRestrictionAImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSignalRestrictionA()
		 * @generated
		 */
		EClass SIGNAL_RESTRICTION_A = eINSTANCE.getSignalRestrictionA();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_RESTRICTION_A__SIGNALS = eINSTANCE.getSignalRestrictionA_Signals();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.SubFunctionRestrictionAImpl <em>Sub Function Restriction A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.SubFunctionRestrictionAImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSubFunctionRestrictionA()
		 * @generated
		 */
		EClass SUB_FUNCTION_RESTRICTION_A = eINSTANCE.getSubFunctionRestrictionA();

		/**
		 * The meta object literal for the '<em><b>Sub Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS = eINSTANCE.getSubFunctionRestrictionA_SubFunctions();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.PathRestrictionAImpl <em>Path Restriction A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.PathRestrictionAImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getPathRestrictionA()
		 * @generated
		 */
		EClass PATH_RESTRICTION_A = eINSTANCE.getPathRestrictionA();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RESTRICTION_A__SEGMENTS = eINSTANCE.getPathRestrictionA_Segments();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.PathSegmentImpl <em>Path Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.PathSegmentImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getPathSegment()
		 * @generated
		 */
		EClass PATH_SEGMENT = eINSTANCE.getPathSegment();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_SEGMENT__TASK = eINSTANCE.getPathSegment_Task();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_SEGMENT__SIGNAL = eINSTANCE.getPathSegment_Signal();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.TaskGroupRestrictionAImpl <em>Task Group Restriction A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.TaskGroupRestrictionAImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskGroupRestrictionA()
		 * @generated
		 */
		EClass TASK_GROUP_RESTRICTION_A = eINSTANCE.getTaskGroupRestrictionA();

		/**
		 * The meta object literal for the '<em><b>Task Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_GROUP_RESTRICTION_A__TASK_GROUPS = eINSTANCE.getTaskGroupRestrictionA_TaskGroups();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.InputRestrictionAImpl <em>Input Restriction A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.InputRestrictionAImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getInputRestrictionA()
		 * @generated
		 */
		EClass INPUT_RESTRICTION_A = eINSTANCE.getInputRestrictionA();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_RESTRICTION_A__INPUTS = eINSTANCE.getInputRestrictionA_Inputs();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl <em>Location Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.LocationRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getLocationRestriction()
		 * @generated
		 */
		EClass LOCATION_RESTRICTION = eINSTANCE.getLocationRestriction();

		/**
		 * The meta object literal for the '<em><b>Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_RESTRICTION__LOCATION_NAME = eINSTANCE.getLocationRestriction_LocationName();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_RESTRICTION__IS_FORBIDDEN = eINSTANCE.getLocationRestriction_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_RESTRICTION__LOCATIONS = eINSTANCE.getLocationRestriction_Locations();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.AreaRestrictionImpl <em>Area Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.AreaRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getAreaRestriction()
		 * @generated
		 */
		EClass AREA_RESTRICTION = eINSTANCE.getAreaRestriction();

		/**
		 * The meta object literal for the '<em><b>Area Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_RESTRICTION__AREA_NAME = eINSTANCE.getAreaRestriction_AreaName();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_RESTRICTION__IS_FORBIDDEN = eINSTANCE.getAreaRestriction_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_RESTRICTION__AREAS = eINSTANCE.getAreaRestriction_Areas();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.PowerSourceRestrictionImpl <em>Power Source Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.PowerSourceRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getPowerSourceRestriction()
		 * @generated
		 */
		EClass POWER_SOURCE_RESTRICTION = eINSTANCE.getPowerSourceRestriction();

		/**
		 * The meta object literal for the '<em><b>Power Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_SOURCE_RESTRICTION__POWER_SOURCE_NAME = eINSTANCE.getPowerSourceRestriction_PowerSourceName();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_SOURCE_RESTRICTION__IS_FORBIDDEN = eINSTANCE.getPowerSourceRestriction_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Power Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SOURCE_RESTRICTION__POWER_SOURCES = eINSTANCE.getPowerSourceRestriction_PowerSources();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl <em>Device Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getDeviceRestriction()
		 * @generated
		 */
		EClass DEVICE_RESTRICTION = eINSTANCE.getDeviceRestriction();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_RESTRICTION__DEVICE_NAME = eINSTANCE.getDeviceRestriction_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_RESTRICTION__IS_FORBIDDEN = eINSTANCE.getDeviceRestriction_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_RESTRICTION__DEVICES = eINSTANCE.getDeviceRestriction_Devices();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.DeviceTypeRestrictionImpl <em>Device Type Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.DeviceTypeRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getDeviceTypeRestriction()
		 * @generated
		 */
		EClass DEVICE_TYPE_RESTRICTION = eINSTANCE.getDeviceTypeRestriction();

		/**
		 * The meta object literal for the '<em><b>Device Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE_RESTRICTION__DEVICE_TYPE_NAME = eINSTANCE.getDeviceTypeRestriction_DeviceTypeName();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE_RESTRICTION__IS_FORBIDDEN = eINSTANCE.getDeviceTypeRestriction_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Device Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TYPE_RESTRICTION__DEVICE_TYPES = eINSTANCE.getDeviceTypeRestriction_DeviceTypes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.ConectionTypeRestrictionImpl <em>Conection Type Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.ConectionTypeRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getConectionTypeRestriction()
		 * @generated
		 */
		EClass CONECTION_TYPE_RESTRICTION = eINSTANCE.getConectionTypeRestriction();

		/**
		 * The meta object literal for the '<em><b>Connection Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTION_TYPE_RESTRICTION__CONNECTION_TYPE_NAME = eINSTANCE.getConectionTypeRestriction_ConnectionTypeName();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTION_TYPE_RESTRICTION__IS_FORBIDDEN = eINSTANCE.getConectionTypeRestriction_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Connection Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONECTION_TYPE_RESTRICTION__CONNECTION_TYPES = eINSTANCE.getConectionTypeRestriction_ConnectionTypes();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.ConnectionRestrictionImpl <em>Connection Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.ConnectionRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getConnectionRestriction()
		 * @generated
		 */
		EClass CONNECTION_RESTRICTION = eINSTANCE.getConnectionRestriction();

		/**
		 * The meta object literal for the '<em><b>Connection Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RESTRICTION__CONNECTION_NAME = eINSTANCE.getConnectionRestriction_ConnectionName();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RESTRICTION__IS_FORBIDDEN = eINSTANCE.getConnectionRestriction_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_RESTRICTION__CONNECTIONS = eINSTANCE.getConnectionRestriction_Connections();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl <em>Segregation Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSegregationRestriction()
		 * @generated
		 */
		EClass SEGREGATION_RESTRICTION = eINSTANCE.getSegregationRestriction();

		/**
		 * The meta object literal for the '<em><b>Tasks A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__TASKS_A = eINSTANCE.getSegregationRestriction_TasksA();

		/**
		 * The meta object literal for the '<em><b>Tasks B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__TASKS_B = eINSTANCE.getSegregationRestriction_TasksB();

		/**
		 * The meta object literal for the '<em><b>Dissimilar Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY = eINSTANCE.getSegregationRestriction_DissimilarTechnology();

		/**
		 * The meta object literal for the '<em><b>Dissimilar Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION = eINSTANCE.getSegregationRestriction_DissimilarLocation();

		/**
		 * The meta object literal for the '<em><b>Sub Functions A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__SUB_FUNCTIONS_A = eINSTANCE.getSegregationRestriction_SubFunctionsA();

		/**
		 * The meta object literal for the '<em><b>Sub Functions B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__SUB_FUNCTIONS_B = eINSTANCE.getSegregationRestriction_SubFunctionsB();

		/**
		 * The meta object literal for the '<em><b>Dissimilar Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGREGATION_RESTRICTION__DISSIMILAR_AREA = eINSTANCE.getSegregationRestriction_DissimilarArea();

		/**
		 * The meta object literal for the '<em><b>Dissimilar Power Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE = eINSTANCE.getSegregationRestriction_DissimilarPowerSource();

		/**
		 * The meta object literal for the '<em><b>Signals A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__SIGNALS_A = eINSTANCE.getSegregationRestriction_SignalsA();

		/**
		 * The meta object literal for the '<em><b>Signals B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__SIGNALS_B = eINSTANCE.getSegregationRestriction_SignalsB();

		/**
		 * The meta object literal for the '<em><b>Task Groups A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__TASK_GROUPS_A = eINSTANCE.getSegregationRestriction_TaskGroupsA();

		/**
		 * The meta object literal for the '<em><b>Task Groups B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__TASK_GROUPS_B = eINSTANCE.getSegregationRestriction_TaskGroupsB();

		/**
		 * The meta object literal for the '<em><b>Signal Groups B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__SIGNAL_GROUPS_B = eINSTANCE.getSegregationRestriction_SignalGroupsB();

		/**
		 * The meta object literal for the '<em><b>Signal Groups A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__SIGNAL_GROUPS_A = eINSTANCE.getSegregationRestriction_SignalGroupsA();

		/**
		 * The meta object literal for the '<em><b>Devices A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__DEVICES_A = eINSTANCE.getSegregationRestriction_DevicesA();

		/**
		 * The meta object literal for the '<em><b>Devices B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__DEVICES_B = eINSTANCE.getSegregationRestriction_DevicesB();

		/**
		 * The meta object literal for the '<em><b>Connections A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__CONNECTIONS_A = eINSTANCE.getSegregationRestriction_ConnectionsA();

		/**
		 * The meta object literal for the '<em><b>Connections B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGREGATION_RESTRICTION__CONNECTIONS_B = eINSTANCE.getSegregationRestriction_ConnectionsB();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.TaskRateRestrictionImpl <em>Task Rate Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.TaskRateRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskRateRestriction()
		 * @generated
		 */
		EClass TASK_RATE_RESTRICTION = eINSTANCE.getTaskRateRestriction();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RATE_RESTRICTION__RATE = eINSTANCE.getTaskRateRestriction_Rate();

		/**
		 * The meta object literal for the '<em><b>Max Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RATE_RESTRICTION__MAX_DEVIATION = eINSTANCE.getTaskRateRestriction_MaxDeviation();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.InputSynchronicityRestrictionImpl <em>Input Synchronicity Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.InputSynchronicityRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getInputSynchronicityRestriction()
		 * @generated
		 */
		EClass INPUT_SYNCHRONICITY_RESTRICTION = eINSTANCE.getInputSynchronicityRestriction();

		/**
		 * The meta object literal for the '<em><b>Max Jitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SYNCHRONICITY_RESTRICTION__MAX_JITTER = eINSTANCE.getInputSynchronicityRestriction_MaxJitter();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.PathDelayRestrictionImpl <em>Path Delay Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.PathDelayRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getPathDelayRestriction()
		 * @generated
		 */
		EClass PATH_DELAY_RESTRICTION = eINSTANCE.getPathDelayRestriction();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_DELAY_RESTRICTION__DELAY = eINSTANCE.getPathDelayRestriction_Delay();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.TaskAtomicRestrictionImpl <em>Task Atomic Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.TaskAtomicRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskAtomicRestriction()
		 * @generated
		 */
		EClass TASK_ATOMIC_RESTRICTION = eINSTANCE.getTaskAtomicRestriction();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.impl.TaskSymmetryRestrictionImpl <em>Task Symmetry Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.impl.TaskSymmetryRestrictionImpl
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getTaskSymmetryRestriction()
		 * @generated
		 */
		EClass TASK_SYMMETRY_RESTRICTION = eINSTANCE.getTaskSymmetryRestriction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SYMMETRY_RESTRICTION__TYPE = eINSTANCE.getTaskSymmetryRestriction_Type();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.restrictions.SymmetryTypesE <em>Symmetry Types E</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.restrictions.SymmetryTypesE
		 * @see de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl#getSymmetryTypesE()
		 * @generated
		 */
		EEnum SYMMETRY_TYPES_E = eINSTANCE.getSymmetryTypesE();

	}

} //RestrictionsPackage
