/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.library.DuctOpeningDeclaration;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duct Opening</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A duct opening is the point where cable can leave or enter a location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.DuctOpening#getRelativPosition <em>Relativ Position</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.DuctOpening#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuctOpening()
 * @model
 * @generated
 */
public interface DuctOpening extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Relativ Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative position of the duct opening in relation to the installation locations position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relativ Position</em>' containment reference.
	 * @see #setRelativPosition(Position3D)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuctOpening_RelativPosition()
	 * @model containment="true"
	 * @generated
	 */
	Position3D getRelativPosition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.DuctOpening#getRelativPosition <em>Relativ Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relativ Position</em>' containment reference.
	 * @see #getRelativPosition()
	 * @generated
	 */
	void setRelativPosition(Position3D value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the duct opening declaration of the location type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(DuctOpeningDeclaration)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuctOpening_Declaration()
	 * @model required="true"
	 * @generated
	 */
	DuctOpeningDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.DuctOpening#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(DuctOpeningDeclaration value);

} // DuctOpening
