/**
 */
package de.oaam.model.oaam.systems;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotary Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This output or input represents rotary mechanical power
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.RotaryPower#getMomentum <em>Momentum</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.RotaryPower#getAngularVelocity <em>Angular Velocity</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getRotaryPower()
 * @model
 * @generated
 */
public interface RotaryPower extends Power {
	/**
	 * Returns the value of the '<em><b>Momentum</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required or provided momentum in [N*m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Momentum</em>' attribute.
	 * @see #setMomentum(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getRotaryPower_Momentum()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getMomentum();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.RotaryPower#getMomentum <em>Momentum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Momentum</em>' attribute.
	 * @see #getMomentum()
	 * @generated
	 */
	void setMomentum(double value);

	/**
	 * Returns the value of the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required or provided angular velocity in [rad/s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Velocity</em>' attribute.
	 * @see #setAngularVelocity(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getRotaryPower_AngularVelocity()
	 * @model required="true"
	 * @generated
	 */
	double getAngularVelocity();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.RotaryPower#getAngularVelocity <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Velocity</em>' attribute.
	 * @see #getAngularVelocity()
	 * @generated
	 */
	void setAngularVelocity(double value);

} // RotaryPower
