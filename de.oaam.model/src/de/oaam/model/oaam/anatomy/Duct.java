/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.library.DuctType;
import de.oaam.model.oaam.library.ResourceProviderInstanceA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

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
 *   <li>{@link de.oaam.model.oaam.anatomy.Duct#getDuctopeningA <em>Ductopening A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.Duct#getDuctopeningB <em>Ductopening B</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuct()
 * @model
 * @generated
 */
public interface Duct extends ResourceProviderInstanceA, _ElementA, _VariantDependentElementA, _ModeDependentElementA {
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
	 * Returns the value of the '<em><b>Ductopening A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting duct opening of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ductopening A</em>' reference.
	 * @see #setDuctopeningA(DuctOpening)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuct_DuctopeningA()
	 * @model required="true"
	 * @generated
	 */
	DuctOpening getDuctopeningA();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Duct#getDuctopeningA <em>Ductopening A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ductopening A</em>' reference.
	 * @see #getDuctopeningA()
	 * @generated
	 */
	void setDuctopeningA(DuctOpening value);

	/**
	 * Returns the value of the '<em><b>Ductopening B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target duct opening of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ductopening B</em>' reference.
	 * @see #setDuctopeningB(DuctOpening)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getDuct_DuctopeningB()
	 * @model required="true"
	 * @generated
	 */
	DuctOpening getDuctopeningB();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Duct#getDuctopeningB <em>Ductopening B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ductopening B</em>' reference.
	 * @see #getDuctopeningB()
	 * @generated
	 */
	void setDuctopeningB(DuctOpening value);

} // Duct
