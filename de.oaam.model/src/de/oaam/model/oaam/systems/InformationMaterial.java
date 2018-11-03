/**
 */
package de.oaam.model.oaam.systems;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An information is an abstract definition of any kind of data flow between systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.InformationMaterial#getDensity <em>Density</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.InformationMaterial#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformationMaterial()
 * @model
 * @generated
 */
public interface InformationMaterial extends ProvidedInformationA, RequiredInformationA, OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The density of the material flow
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Density</em>' attribute.
	 * @see #setDensity(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformationMaterial_Density()
	 * @model required="true"
	 * @generated
	 */
	double getDensity();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.InformationMaterial#getDensity <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Density</em>' attribute.
	 * @see #getDensity()
	 * @generated
	 */
	void setDensity(double value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The velocity of the material flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Velocity</em>' attribute.
	 * @see #setVelocity(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformationMaterial_Velocity()
	 * @model required="true"
	 * @generated
	 */
	double getVelocity();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.InformationMaterial#getVelocity <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' attribute.
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(double value);

} // InformationMaterial
