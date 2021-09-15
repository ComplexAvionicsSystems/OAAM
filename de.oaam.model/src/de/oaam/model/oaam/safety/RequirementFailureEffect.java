/**
 */
package de.oaam.model.oaam.safety;

import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Failure Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A failure effect on a requirements component. Specified per failure mode in the failure mode set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.RequirementFailureEffect#getEffect <em>Effect</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.RequirementFailureEffect#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.SafetyPackage#getRequirementFailureEffect()
 * @model
 * @generated
 */
public interface RequirementFailureEffect extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.safety.RequirementFailureEffectTypesE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The generic failure effect to the requirement component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTypesE
	 * @see #setEffect(RequirementFailureEffectTypesE)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getRequirementFailureEffect_Effect()
	 * @model
	 * @generated
	 */
	RequirementFailureEffectTypesE getEffect();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.RequirementFailureEffect#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTypesE
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(RequirementFailureEffectTypesE value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requirement component affect by the failure effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE
	 * @see #setTarget(RequirementFailureEffectTargetsE)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getRequirementFailureEffect_Target()
	 * @model
	 * @generated
	 */
	RequirementFailureEffectTargetsE getTarget();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.RequirementFailureEffect#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see de.oaam.model.oaam.safety.RequirementFailureEffectTargetsE
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RequirementFailureEffectTargetsE value);

} // RequirementFailureEffect
