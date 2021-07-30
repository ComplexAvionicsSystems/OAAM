/**
 */
package de.oaam.model.oaam.safety;

import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A failure effect that can occur. It is described with a probability (also known as beta-ratio) and the failure mode or integrity state that is propagated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.FailureEffect#getPropagationFailureMode <em>Propagation Failure Mode</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.FailureEffect#getPropagationIntegrityState <em>Propagation Integrity State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.FailureEffect#getFailureEffectProbability <em>Failure Effect Probability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.FailureEffect#getPropagates <em>Propagates</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.SafetyPackage#getFailureEffect()
 * @model
 * @generated
 */
public interface FailureEffect extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Propagation Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The propagated failure mode. There should either a state or a failure mode be defined for propagation, not both. If a failure mode should be propagated the propgates-switch must be set to FAILURE_MODE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagation Failure Mode</em>' reference.
	 * @see #setPropagationFailureMode(FunctionalFailureMode)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFailureEffect_PropagationFailureMode()
	 * @model
	 * @generated
	 */
	FunctionalFailureMode getPropagationFailureMode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.FailureEffect#getPropagationFailureMode <em>Propagation Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation Failure Mode</em>' reference.
	 * @see #getPropagationFailureMode()
	 * @generated
	 */
	void setPropagationFailureMode(FunctionalFailureMode value);

	/**
	 * Returns the value of the '<em><b>Propagation Integrity State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.common.IntegrityStateE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The propagated integrity state. There should either a state or a failure mode be defined for propagation, not both. If an integrity state should be propagated the propagates-switch must be set to INTEGRITY_STATE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagation Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #setPropagationIntegrityState(IntegrityStateE)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFailureEffect_PropagationIntegrityState()
	 * @model
	 * @generated
	 */
	IntegrityStateE getPropagationIntegrityState();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.FailureEffect#getPropagationIntegrityState <em>Propagation Integrity State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation Integrity State</em>' attribute.
	 * @see de.oaam.model.oaam.common.IntegrityStateE
	 * @see #getPropagationIntegrityState()
	 * @generated
	 */
	void setPropagationIntegrityState(IntegrityStateE value);

	/**
	 * Returns the value of the '<em><b>Failure Effect Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The probability of the failure effect also known as beta-ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Effect Probability</em>' attribute.
	 * @see #setFailureEffectProbability(double)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFailureEffect_FailureEffectProbability()
	 * @model
	 * @generated
	 */
	double getFailureEffectProbability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.FailureEffect#getFailureEffectProbability <em>Failure Effect Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Effect Probability</em>' attribute.
	 * @see #getFailureEffectProbability()
	 * @generated
	 */
	void setFailureEffectProbability(double value);

	/**
	 * Returns the value of the '<em><b>Propagates</b></em>' attribute.
	 * The default value is <code>"INTEGRITY_STATE"</code>.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selection if the failure effect propagates an integrity state or a failure mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagates</em>' attribute.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE
	 * @see #setPropagates(FailurePropagationGenericTypeE)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFailureEffect_Propagates()
	 * @model default="INTEGRITY_STATE"
	 * @generated
	 */
	FailurePropagationGenericTypeE getPropagates();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.FailureEffect#getPropagates <em>Propagates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagates</em>' attribute.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationGenericTypeE
	 * @see #getPropagates()
	 * @generated
	 */
	void setPropagates(FailurePropagationGenericTypeE value);

} // FailureEffect
