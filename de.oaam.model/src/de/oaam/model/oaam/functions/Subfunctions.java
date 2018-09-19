/**
 */
package de.oaam.model.oaam.functions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subfunctions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subfunction can be used to logically group tasks and signals. If the multiplicity is used, the subfunction can be instantiated multiple times.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.Subfunctions#getMultiplicityMin <em>Multiplicity Min</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Subfunctions#getMultiplicityMax <em>Multiplicity Max</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSubfunctions()
 * @model
 * @generated
 */
public interface Subfunctions extends FunctionsContainerA {
	/**
	 * Returns the value of the '<em><b>Multiplicity Min</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound of the multiplicity of the subfunction. The content of the subfunction is instanced for every connected input signal. Every output signal holds the content of all instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiplicity Min</em>' attribute.
	 * @see #setMultiplicityMin(int)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSubfunctions_MultiplicityMin()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMultiplicityMin();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Subfunctions#getMultiplicityMin <em>Multiplicity Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Min</em>' attribute.
	 * @see #getMultiplicityMin()
	 * @generated
	 */
	void setMultiplicityMin(int value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Max</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound of the multiplicity of the subfunction. The content of the subfunction is instanced for every connected input signal. Every output signal holds the content of all instaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiplicity Max</em>' attribute.
	 * @see #setMultiplicityMax(int)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSubfunctions_MultiplicityMax()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMultiplicityMax();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Subfunctions#getMultiplicityMax <em>Multiplicity Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Max</em>' attribute.
	 * @see #getMultiplicityMax()
	 * @generated
	 */
	void setMultiplicityMax(int value);

} // Subfunctions
