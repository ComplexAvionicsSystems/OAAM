/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The properties common to all instance of a wire type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.WireType#getSpecificWeight <em>Specific Weight</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.WireType#getSpecificPrice <em>Specific Price</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.WireType#getNConductors <em>NConductors</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.WireType#getMinBendingRadius <em>Min Bending Radius</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.WireType#getNShields <em>NShields</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.WireType#getMtbf <em>Mtbf</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getWireType()
 * @model
 * @generated
 */
public interface WireType extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Specific Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Weight per meter in [kg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Weight</em>' attribute.
	 * @see #setSpecificWeight(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getWireType_SpecificWeight()
	 * @model required="true"
	 * @generated
	 */
	double getSpecificWeight();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.WireType#getSpecificWeight <em>Specific Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Weight</em>' attribute.
	 * @see #getSpecificWeight()
	 * @generated
	 */
	void setSpecificWeight(double value);

	/**
	 * Returns the value of the '<em><b>Specific Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cost per meter in [$/m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Price</em>' attribute.
	 * @see #setSpecificPrice(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getWireType_SpecificPrice()
	 * @model required="true"
	 * @generated
	 */
	double getSpecificPrice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.WireType#getSpecificPrice <em>Specific Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Price</em>' attribute.
	 * @see #getSpecificPrice()
	 * @generated
	 */
	void setSpecificPrice(double value);

	/**
	 * Returns the value of the '<em><b>NConductors</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many conductors are within the wire type?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NConductors</em>' attribute.
	 * @see #setNConductors(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getWireType_NConductors()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNConductors();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.WireType#getNConductors <em>NConductors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NConductors</em>' attribute.
	 * @see #getNConductors()
	 * @generated
	 */
	void setNConductors(int value);

	/**
	 * Returns the value of the '<em><b>Min Bending Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum bending radius the wire type can be used for in [m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Bending Radius</em>' attribute.
	 * @see #setMinBendingRadius(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getWireType_MinBendingRadius()
	 * @model required="true"
	 * @generated
	 */
	double getMinBendingRadius();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.WireType#getMinBendingRadius <em>Min Bending Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Bending Radius</em>' attribute.
	 * @see #getMinBendingRadius()
	 * @generated
	 */
	void setMinBendingRadius(double value);

	/**
	 * Returns the value of the '<em><b>NShields</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many shielding conductors are used?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NShields</em>' attribute.
	 * @see #setNShields(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getWireType_NShields()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNShields();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.WireType#getNShields <em>NShields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NShields</em>' attribute.
	 * @see #getNShields()
	 * @generated
	 */
	void setNShields(int value);

	/**
	 * Returns the value of the '<em><b>Mtbf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mean time between failure in [h]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mtbf</em>' attribute.
	 * @see #setMtbf(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getWireType_Mtbf()
	 * @model required="true"
	 * @generated
	 */
	double getMtbf();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.WireType#getMtbf <em>Mtbf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtbf</em>' attribute.
	 * @see #getMtbf()
	 * @generated
	 */
	void setMtbf(double value);

} // WireType
