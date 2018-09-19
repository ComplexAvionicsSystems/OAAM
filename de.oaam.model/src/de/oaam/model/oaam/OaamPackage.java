/**
 */
package de.oaam.model.oaam;

import de.oaam.model.oaam.common.CommonPackage;

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
 * The Open Avionics Architecture Model (OAAM) is inteded for describing an avionics architecture in software, hardware and spaces. It contains nine layers (library, scenarios, systems, functions, hardware, anatomy, capabilities, restrictions, allocationss), which add up to the final architecture. It is intended to be the information store and system function description language for a plug&fly avioncis system, but also for offline architecture analysis and optimization. It is allowed to distribute architecture information over multiple oaam files.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.OaamFactory
 * @model kind="package"
 * @generated
 */
public interface OaamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oaam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v140";

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
	OaamPackage eINSTANCE = de.oaam.model.oaam.impl.OaamPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.impl.ArchitectureImpl
	 * @see de.oaam.model.oaam.impl.OaamPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ID = CommonPackage.OAAM_BASE_ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = CommonPackage.OAAM_BASE_ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__STYLE = CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ATTRIBUTES = CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__DOCUMENTATION = CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__MODIFIED = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__MODIFIER = CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__TRACE_LINK = CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__INCLUDE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__LIBRARY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__SCENARIO = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__SYSTEMS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__FUNCTIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__HARDWARE = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Anatomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ANATOMY = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__CAPABILITIES = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__RESTRICTIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ALLOCATIONS = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_OPERATION_COUNT = CommonPackage.OAAM_BASE_ELEMENT_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see de.oaam.model.oaam.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.Architecture#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Include</em>'.
	 * @see de.oaam.model.oaam.Architecture#getInclude()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Include();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.Architecture#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library</em>'.
	 * @see de.oaam.model.oaam.Architecture#getLibrary()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Library();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.Architecture#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see de.oaam.model.oaam.Architecture#getScenario()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Scenario();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.Architecture#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systems</em>'.
	 * @see de.oaam.model.oaam.Architecture#getSystems()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Systems();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.Architecture#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functions</em>'.
	 * @see de.oaam.model.oaam.Architecture#getFunctions()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Functions();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.Architecture#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hardware</em>'.
	 * @see de.oaam.model.oaam.Architecture#getHardware()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Hardware();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.Architecture#getAnatomy <em>Anatomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anatomy</em>'.
	 * @see de.oaam.model.oaam.Architecture#getAnatomy()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Anatomy();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.Architecture#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see de.oaam.model.oaam.Architecture#getCapabilities()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.Architecture#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restrictions</em>'.
	 * @see de.oaam.model.oaam.Architecture#getRestrictions()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Restrictions();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.Architecture#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocations</em>'.
	 * @see de.oaam.model.oaam.Architecture#getAllocations()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Allocations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OaamFactory getOaamFactory();

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
		 * The meta object literal for the '{@link de.oaam.model.oaam.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.impl.ArchitectureImpl
		 * @see de.oaam.model.oaam.impl.OaamPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__INCLUDE = eINSTANCE.getArchitecture_Include();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__LIBRARY = eINSTANCE.getArchitecture_Library();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__SCENARIO = eINSTANCE.getArchitecture_Scenario();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__SYSTEMS = eINSTANCE.getArchitecture_Systems();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__FUNCTIONS = eINSTANCE.getArchitecture_Functions();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__HARDWARE = eINSTANCE.getArchitecture_Hardware();

		/**
		 * The meta object literal for the '<em><b>Anatomy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__ANATOMY = eINSTANCE.getArchitecture_Anatomy();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__CAPABILITIES = eINSTANCE.getArchitecture_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__RESTRICTIONS = eINSTANCE.getArchitecture_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__ALLOCATIONS = eINSTANCE.getArchitecture_Allocations();

	}

} //OaamPackage
