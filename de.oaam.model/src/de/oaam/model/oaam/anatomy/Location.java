/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.library.LocationType;
import de.oaam.model.oaam.library.ResourceProviderInstanceA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A location is a place to install devices or cables. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.Location#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.Location#getPosition <em>Position</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.Location#getDuctOpenings <em>Duct Openings</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends ResourceProviderInstanceA, ElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the type of a location. This primarily defines the available resources and possible duct openings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(LocationType)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getLocation_Type()
	 * @model required="true"
	 * @generated
	 */
	LocationType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Location#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(LocationType value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical position of the location
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position3D)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getLocation_Position()
	 * @model containment="true"
	 * @generated
	 */
	Position3D getPosition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Location#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position3D value);

	/**
	 * Returns the value of the '<em><b>Duct Openings</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.DuctOpening}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All duct openings of this location
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duct Openings</em>' containment reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getLocation_DuctOpenings()
	 * @model containment="true"
	 * @generated
	 */
	EList<DuctOpening> getDuctOpenings();

} // Location
