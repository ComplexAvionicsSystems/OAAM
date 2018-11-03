/**
 */
package de.oaam.model.oaam.systems;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electric Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This output or input represents elctrical power
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.ElectricPower#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.ElectricPower#getNPhases <em>NPhases</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.ElectricPower#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.ElectricPower#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getElectricPower()
 * @model
 * @generated
 */
public interface ElectricPower extends InformationPower {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency for AC power in [1/s]. =0 -> DC power supply; >0 -> AC power; <0 -> UNKNOWN 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getElectricPower_Frequency()
	 * @model required="true"
	 * @generated
	 */
	double getFrequency();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.ElectricPower#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(double value);

	/**
	 * Returns the value of the '<em><b>NPhases</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of phases in power supply. <0 -> Unknown, Unspecified
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NPhases</em>' attribute.
	 * @see #setNPhases(int)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getElectricPower_NPhases()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNPhases();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.ElectricPower#getNPhases <em>NPhases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NPhases</em>' attribute.
	 * @see #getNPhases()
	 * @generated
	 */
	void setNPhases(int value);

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required or provided voltage in [V] <0 -> Unknown, Unspecified
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #setVoltage(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getElectricPower_Voltage()
	 * @model required="true"
	 * @generated
	 */
	double getVoltage();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.ElectricPower#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required or provided current in [A]; <0 -> Unknown, Unspecified
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getElectricPower_Current()
	 * @model required="true"
	 * @generated
	 */
	double getCurrent();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.ElectricPower#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(double value);

} // ElectricPower
