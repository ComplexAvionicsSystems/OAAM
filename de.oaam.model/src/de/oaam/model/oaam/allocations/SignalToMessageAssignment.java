/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.capabilities.SignalInMessageCapability;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.DataTypeA;

import de.oaam.model.oaam.functions.Signal;

import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.Variant;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal To Message Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Assigns a signal to a message and defines the properties for that, e.g. the position end encoding in the message.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getPosition <em>Position</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalToMessageAssignment()
 * @model
 * @generated
 */
public interface SignalToMessageAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalToMessageAssignment_Signal()
	 * @model required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.common.AttributeA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This can be used to append arbitrary additional attributes to every element. The form of additional attributes is always name and value whereas the value type is different for different attribute types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalToMessageAssignment_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeA> getAttributes();

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.scenario.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variants for which this element is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variants</em>' reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalToMessageAssignment_Variants()
	 * @model
	 * @generated
	 */
	EList<Variant> getVariants();

	/**
	 * Returns the value of the '<em><b>Operation Modes</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.scenario.OperationModeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation modes in which the element is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Modes</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalToMessageAssignment_OperationModes()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationModeReference> getOperationModes();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific data type used for this signal on the bus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(DataTypeA)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalToMessageAssignment_DataType()
	 * @model containment="true"
	 * @generated
	 */
	DataTypeA getDataType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataTypeA value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start bit of this signal inside the message. The length of and encoding is defined with the datatype of the signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalToMessageAssignment_Position()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capability, which specifies the resource consumption.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(SignalInMessageCapability)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalToMessageAssignment_Capability()
	 * @model required="true"
	 * @generated
	 */
	SignalInMessageCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SignalToMessageAssignment#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(SignalInMessageCapability value);

} // SignalToMessageAssignment
