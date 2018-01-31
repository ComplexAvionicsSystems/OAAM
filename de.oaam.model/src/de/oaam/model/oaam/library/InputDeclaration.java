/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.DataTypeA;
import de.oaam.model.oaam.common.ElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The declaration of an input for a function type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.InputDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.InputDeclaration#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.InputDeclaration#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.InputDeclaration#getRange <em>Range</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.InputDeclaration#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.InputDeclaration#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getInputDeclaration()
 * @model
 * @generated
 */
public interface InputDeclaration extends ElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the data type of the input
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataTypeA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getInputDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
	DataTypeA getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.InputDeclaration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypeA value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical unit of the signal, e.g. s for seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getInputDeclaration_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.InputDeclaration#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of logical or arithmetical precondition, which the input signal must comply to in order to use the function and get an reasonable result, e.g. x != 0
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #setPrecondition(String)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getInputDeclaration_Precondition()
	 * @model
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.InputDeclaration#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An valid interval which can be used to restrict numerical signals e.g. [1,100]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getInputDeclaration_Range()
	 * @model
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.InputDeclaration#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum multiplicity of a multiple input. Lowest allowed value is 1. If an input is defined to have a multiplicity greater than one. The task is informed on the number of connected senders and can work on each input individually.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getInputDeclaration_LowerBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.InputDeclaration#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum multiplicity of a multiple input. A valid value must be greater or equal to the lower bound. If an input is defined to have a multiplicity greater than one. The task is informed on the number of connected senders and can work on each input individually.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getInputDeclaration_UpperBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.InputDeclaration#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

} // InputDeclaration
