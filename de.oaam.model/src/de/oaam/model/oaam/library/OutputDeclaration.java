/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.DataTypeA;
import de.oaam.model.oaam.common.ElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The declaration of an output for a function type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.OutputDeclaration#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.OutputDeclaration#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.OutputDeclaration#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.OutputDeclaration#getRange <em>Range</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.OutputDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.OutputDeclaration#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.OutputDeclaration#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.OutputDeclaration#getFaultPropagations <em>Fault Propagations</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputDeclaration()
 * @model
 * @generated
 */
public interface OutputDeclaration extends ElementA {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical unit of the signal, e.g. s for seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputDeclaration_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputDeclaration#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A logical or arithmetical postcondition, which is true for the output, if the precondition of all inputs was fulfilled, e.g. 5 < x < 7
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postcondition</em>' attribute.
	 * @see #setPostcondition(String)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputDeclaration_Postcondition()
	 * @model
	 * @generated
	 */
	String getPostcondition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputDeclaration#getPostcondition <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' attribute.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger condition which causes the output to be calculated. This can be a Boolean logic of available inputs, or a fixed rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(OutputTrigger)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputDeclaration_Trigger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputTrigger getTrigger();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputDeclaration#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(OutputTrigger value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An valid interval which can be used to restrict numerical signals e.g. [1,100]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputDeclaration_Range()
	 * @model
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputDeclaration#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of the output
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataTypeA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
	DataTypeA getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputDeclaration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypeA value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum multiplicity of a multiple output. Lowest allowed value is 1. If an output is defined to have a multiplicity greater than one. The task is informed on the number of connected receivers and can contact each receiver individually.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputDeclaration_LowerBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputDeclaration#getLowerBound <em>Lower Bound</em>}' attribute.
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
	 * The maximum multiplicity of a multiple output. A valid value must be greater or equal to the lower bound. If an output is defined to have a multiplicity greater than one. The task is informed on the number of connected receivers and can contact each receiver individually.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputDeclaration_UpperBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputDeclaration#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Fault Propagations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.FaultPropagation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fault propagation conditions for this output
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fault Propagations</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputDeclaration_FaultPropagations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FaultPropagation> getFaultPropagations();

} // OutputDeclaration
