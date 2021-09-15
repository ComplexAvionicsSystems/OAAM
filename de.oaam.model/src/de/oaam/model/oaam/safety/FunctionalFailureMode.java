/**
 */
package de.oaam.model.oaam.safety;

import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Failure Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A functional failure mode describes a failure mode that can possibly interfere with or prevent the proper function of a task. The functional failure modes are propagated through the failure propagation defined for each TaskType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.FunctionalFailureMode#getRequirementFailureEffects <em>Requirement Failure Effects</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.FunctionalFailureMode#getIntegrityState <em>Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.FunctionalFailureMode#getShortNotation <em>Short Notation</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.SafetyPackage#getFunctionalFailureMode()
 * @model
 * @generated
 */
public interface FunctionalFailureMode extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Requirement Failure Effects</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.RequirementFailureEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effects that this failure mode has on requirement components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement Failure Effects</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFunctionalFailureMode_RequirementFailureEffects()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementFailureEffect> getRequirementFailureEffects();

	/**
	 * Returns the value of the '<em><b>Integrity State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The integrity state associated with the failure mode. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setIntegrityState(IntegrityStateE)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFunctionalFailureMode_IntegrityState()
	 * @model required="true"
	 * @generated
	 */
	IntegrityStateE getIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.FunctionalFailureMode#getIntegrityState <em>Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getIntegrityState()
	 * @generated
	 */
	void setIntegrityState(IntegrityStateE value);

	/**
	 * Returns the value of the '<em><b>Short Notation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short notation (2-4 letters) for the failure mode. (e.g. erroneously high --> HI)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Notation</em>' attribute.
	 * @see #setShortNotation(String)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFunctionalFailureMode_ShortNotation()
	 * @model
	 * @generated
	 */
	String getShortNotation();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.FunctionalFailureMode#getShortNotation <em>Short Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Notation</em>' attribute.
	 * @see #getShortNotation()
	 * @generated
	 */
	void setShortNotation(String value);

} // FunctionalFailureMode
