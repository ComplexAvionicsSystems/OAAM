/**
 */
package de.oaam.model.oaam.safety;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Failure Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The specification of a part failure mode. With help of the failure mode ratio the failure rate of this mode is specified depending on the failure rate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.PartFailureMode#getFailureModeRatio <em>Failure Mode Ratio</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.PartFailureMode#getFailureEffects <em>Failure Effects</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.SafetyPackage#getPartFailureMode()
 * @model
 * @generated
 */
public interface PartFailureMode extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Failure Mode Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the percentage of the failure mode over all failures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Mode Ratio</em>' attribute.
	 * @see #setFailureModeRatio(double)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getPartFailureMode_FailureModeRatio()
	 * @model
	 * @generated
	 */
	double getFailureModeRatio();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.PartFailureMode#getFailureModeRatio <em>Failure Mode Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Mode Ratio</em>' attribute.
	 * @see #getFailureModeRatio()
	 * @generated
	 */
	void setFailureModeRatio(double value);

	/**
	 * Returns the value of the '<em><b>Failure Effects</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.FailureEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of failure effects that can occur from this failure mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Effects</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getPartFailureMode_FailureEffects()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureEffect> getFailureEffects();

} // PartFailureMode
