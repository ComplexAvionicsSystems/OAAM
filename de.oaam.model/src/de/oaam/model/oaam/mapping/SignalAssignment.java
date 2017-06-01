/**
 */
package de.oaam.model.oaam.mapping;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.functions.Signal;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A mapping of a signal to a chain of devices and connections.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.SignalAssignment#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.SignalAssignment#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.mapping.MappingPackage#getSignalAssignment()
 * @model
 * @generated
 */
public interface SignalAssignment extends _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.mapping.SignalAssignmentSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The segment of this mapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSignalAssignment_Segments()
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
	 * @see de.oaam.model.oaam.mapping.MappingPackage#getSignalAssignment_Signal()
	 * @model required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.mapping.SignalAssignment#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // SignalAssignment
