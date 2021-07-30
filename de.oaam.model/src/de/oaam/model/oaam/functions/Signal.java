/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.hardware.Connection;

import de.oaam.model.oaam.library.SignalType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A signal is information that is exchanged unidirectional from one function to another.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.Signal#getSource <em>Source</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Signal#getTargets <em>Targets</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Signal#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Signal#getInIndex <em>In Index</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Signal#getOutIndex <em>Out Index</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Signal#getConnectionBinding <em>Connection Binding</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source output the signal comes from
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Output)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSignal_Source()
	 * @model required="true"
	 * @generated
	 */
	Output getSource();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Signal#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Output value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target input the signal goes to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSignal_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<Input> getTargets();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the signal type, which defines the required resources
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SignalType)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSignal_Type()
	 * @model required="true"
	 * @generated
	 */
	SignalType getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Signal#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SignalType value);

	/**
	 * Returns the value of the '<em><b>In Index</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a multiple input is connected with the signal this index gives index of the multi-input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Index</em>' attribute.
	 * @see #setInIndex(int)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSignal_InIndex()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getInIndex();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Signal#getInIndex <em>In Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Index</em>' attribute.
	 * @see #getInIndex()
	 * @generated
	 */
	void setInIndex(int value);

	/**
	 * Returns the value of the '<em><b>Out Index</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a multiple output is connected with the signal this index gives index of the multi-output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Index</em>' attribute.
	 * @see #setOutIndex(int)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSignal_OutIndex()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getOutIndex();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Signal#getOutIndex <em>Out Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Index</em>' attribute.
	 * @see #getOutIndex()
	 * @generated
	 */
	void setOutIndex(int value);

	/**
	 * Returns the value of the '<em><b>Connection Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This references a unique connection if this signal is strictly bound to one a wire i.e. an atomic block of hardware and funtion, e.g a sensor. This is a so called hardware task. If a device is specified. Also the function outputs should be bound to device connectors. Do not specify a device here if this is a freely assignable function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Binding</em>' reference.
	 * @see #setConnectionBinding(Connection)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSignal_ConnectionBinding()
	 * @model
	 * @generated
	 */
	Connection getConnectionBinding();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Signal#getConnectionBinding <em>Connection Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Binding</em>' reference.
	 * @see #getConnectionBinding()
	 * @generated
	 */
	void setConnectionBinding(Connection value);

} // Signal
