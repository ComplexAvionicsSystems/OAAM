/**
 */
package de.oaam.model.oaam;

import de.oaam.model.oaam.allocations.Allocations;
import de.oaam.model.oaam.anatomy.Anatomy;

import de.oaam.model.oaam.capabilities.Capabilities;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.functions.Functions;

import de.oaam.model.oaam.hardware.Hardware;

import de.oaam.model.oaam.library.Library;
import de.oaam.model.oaam.restrictions.Restrictions;

import de.oaam.model.oaam.scenario.Scenario;

import de.oaam.model.oaam.systems.Systems;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model root element. Only a single instance is allowed. The model content is grouped in sequentially dependent layers for different subdomains. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.Architecture#getInclude <em>Include</em>}</li>
 *   <li>{@link de.oaam.model.oaam.Architecture#getLibrary <em>Library</em>}</li>
 *   <li>{@link de.oaam.model.oaam.Architecture#getScenario <em>Scenario</em>}</li>
 *   <li>{@link de.oaam.model.oaam.Architecture#getSystems <em>Systems</em>}</li>
 *   <li>{@link de.oaam.model.oaam.Architecture#getFunctions <em>Functions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.Architecture#getHardware <em>Hardware</em>}</li>
 *   <li>{@link de.oaam.model.oaam.Architecture#getAnatomy <em>Anatomy</em>}</li>
 *   <li>{@link de.oaam.model.oaam.Architecture#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.Architecture#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.Architecture#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.OaamPackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.Architecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to child architecture models. Elements of included models can be used in this model. Inclusion allows to build up architecuture models in multiple files. The idea is that this model completes the included model. The real model is this model plus all elements of the included models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' reference list.
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Include()
	 * @model
	 * @generated
	 */
	EList<Architecture> getInclude();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a library model (layer 1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' containment reference.
	 * @see #setLibrary(Library)
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Library()
	 * @model containment="true"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.Architecture#getLibrary <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' containment reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a scenario model (layer 2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference.
	 * @see #setScenario(Scenario)
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Scenario()
	 * @model containment="true"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.Architecture#getScenario <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' containment reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a systems model (layer 3)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference.
	 * @see #setSystems(Systems)
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Systems()
	 * @model containment="true"
	 * @generated
	 */
	Systems getSystems();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.Architecture#getSystems <em>Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systems</em>' containment reference.
	 * @see #getSystems()
	 * @generated
	 */
	void setSystems(Systems value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a function model (layer 4)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference.
	 * @see #setFunctions(Functions)
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Functions()
	 * @model containment="true"
	 * @generated
	 */
	Functions getFunctions();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.Architecture#getFunctions <em>Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functions</em>' containment reference.
	 * @see #getFunctions()
	 * @generated
	 */
	void setFunctions(Functions value);

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a hardware model (layer 5)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware</em>' containment reference.
	 * @see #setHardware(Hardware)
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Hardware()
	 * @model containment="true"
	 * @generated
	 */
	Hardware getHardware();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.Architecture#getHardware <em>Hardware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' containment reference.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(Hardware value);

	/**
	 * Returns the value of the '<em><b>Anatomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for an anatomy model (layer 6)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anatomy</em>' containment reference.
	 * @see #setAnatomy(Anatomy)
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Anatomy()
	 * @model containment="true"
	 * @generated
	 */
	Anatomy getAnatomy();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.Architecture#getAnatomy <em>Anatomy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anatomy</em>' containment reference.
	 * @see #getAnatomy()
	 * @generated
	 */
	void setAnatomy(Anatomy value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a capabilities model (layer 7)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(Capabilities)
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	Capabilities getCapabilities();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.Architecture#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(Capabilities value);

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a restriction model (layer 8)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restrictions</em>' containment reference.
	 * @see #setRestrictions(Restrictions)
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Restrictions()
	 * @model containment="true"
	 * @generated
	 */
	Restrictions getRestrictions();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.Architecture#getRestrictions <em>Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restrictions</em>' containment reference.
	 * @see #getRestrictions()
	 * @generated
	 */
	void setRestrictions(Restrictions value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a allocations model (layer 9)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocations</em>' containment reference.
	 * @see #setAllocations(Allocations)
	 * @see de.oaam.model.oaam.OaamPackage#getArchitecture_Allocations()
	 * @model containment="true"
	 * @generated
	 */
	Allocations getAllocations();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.Architecture#getAllocations <em>Allocations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocations</em>' containment reference.
	 * @see #getAllocations()
	 * @generated
	 */
	void setAllocations(Allocations value);

} // Architecture
