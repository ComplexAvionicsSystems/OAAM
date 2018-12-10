/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.DuctType;
import de.oaam.model.oaam.library.ResourceProviderInstanceA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A duct is a route between two installation locations in which cables are placed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.Duct#getLength <em>Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.Duct#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.Duct#getStartingPoint <em>Starting Point</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.Duct#getEndPoint <em>End Point</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuct()
 * @model
 * @generated
 */
public interface Duct extends ResourceProviderInstanceA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical length of the duct segment in [m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuct_Length()
	 * @model required="true"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Duct#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A refernce to the duct type which defines provided resources
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DuctType)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuct_Type()
	 * @model required="true"
	 * @generated
	 */
	DuctType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Duct#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DuctType value);

	/**
	 * Returns the value of the '<em><b>Starting Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source duct opening of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Point</em>' reference.
	 * @see #setStartingPoint(DuctOpening)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuct_StartingPoint()
	 * @model required="true"
	 * @generated
	 */
	DuctOpening getStartingPoint();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Duct#getStartingPoint <em>Starting Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Point</em>' reference.
	 * @see #getStartingPoint()
	 * @generated
	 */
	void setStartingPoint(DuctOpening value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target duct opening of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Point</em>' reference.
	 * @see #setEndPoint(DuctOpening)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuct_EndPoint()
	 * @model required="true"
	 * @generated
	 */
	DuctOpening getEndPoint();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Duct#getEndPoint <em>End Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' reference.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(DuctOpening value);

} // Duct
