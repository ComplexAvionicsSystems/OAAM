/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.functions.Signal;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A allocations of a signal to a chain of devices and connections.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalAssignment#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalAssignment#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalAssignment()
 * @model
 * @generated
 */
public interface SignalAssignment extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.SignalAssignmentSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The segment of this allocations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalAssignment_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalAssignmentSegment> getSegments();

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalAssignment_Signal()
	 * @model required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SignalAssignment#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // SignalAssignment
