/**
 */
package de.oaam.model.oaam.systems;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This output or input represents linear mechanical power
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.LinearPower#getForce <em>Force</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.LinearPower#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getLinearPower()
 * @model
 * @generated
 */
public interface LinearPower extends Power {
	/**
	 * Returns the value of the '<em><b>Force</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provided or required force in [N]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Force</em>' attribute.
	 * @see #setForce(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getLinearPower_Force()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getForce();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.LinearPower#getForce <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force</em>' attribute.
	 * @see #getForce()
	 * @generated
	 */
	void setForce(double value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provided or required velocity in [m/s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Velocity</em>' attribute.
	 * @see #setVelocity(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getLinearPower_Velocity()
	 * @model required="true"
	 * @generated
	 */
	double getVelocity();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.LinearPower#getVelocity <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' attribute.
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(double value);

} // LinearPower
