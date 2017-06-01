/**
 */
package de.oaam.model.oaam.systems;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydraulic Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This output or input represents hydraulic power
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.HydraulicPower#getPressure <em>Pressure</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.HydraulicPower#getMassFlowRate <em>Mass Flow Rate</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getHydraulicPower()
 * @model
 * @generated
 */
public interface HydraulicPower extends Power {
	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required or provided pressure in [Pa = N/m^2]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute.
	 * @see #setPressure(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getHydraulicPower_Pressure()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getPressure();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.HydraulicPower#getPressure <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' attribute.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(double value);

	/**
	 * Returns the value of the '<em><b>Mass Flow Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required or provided mass flow rate in [kg/s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Flow Rate</em>' attribute.
	 * @see #setMassFlowRate(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getHydraulicPower_MassFlowRate()
	 * @model required="true"
	 * @generated
	 */
	double getMassFlowRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.HydraulicPower#getMassFlowRate <em>Mass Flow Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Flow Rate</em>' attribute.
	 * @see #getMassFlowRate()
	 * @generated
	 */
	void setMassFlowRate(double value);

} // HydraulicPower
