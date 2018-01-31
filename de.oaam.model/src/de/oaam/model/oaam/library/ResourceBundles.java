/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.ElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Bundles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This are installable portions of resources
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceBundles#getResources <em>Resources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceBundles#getMtbf <em>Mtbf</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceBundles#getCost <em>Cost</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ResourceBundles#getMass <em>Mass</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceBundles()
 * @model
 * @generated
 */
public interface ResourceBundles extends ResourceConsumerA, ElementA {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number and type(s) of resources in this bundle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceBundles_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Mtbf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mean time between failure in [h]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mtbf</em>' attribute.
	 * @see #setMtbf(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceBundles_Mtbf()
	 * @model required="true"
	 * @generated
	 */
	double getMtbf();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ResourceBundles#getMtbf <em>Mtbf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtbf</em>' attribute.
	 * @see #getMtbf()
	 * @generated
	 */
	void setMtbf(double value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The costs of one instance of this bundle in [$]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceBundles_Cost()
	 * @model required="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ResourceBundles#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mass of the resource bundle in [kg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see #setMass(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceBundles_Mass()
	 * @model required="true"
	 * @generated
	 */
	double getMass();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ResourceBundles#getMass <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' attribute.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(double value);

} // ResourceBundles
