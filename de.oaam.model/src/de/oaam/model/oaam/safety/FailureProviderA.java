/**
 */
package de.oaam.model.oaam.safety;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Provider A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A (hardware) part for which probabilistic failures can be described.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.FailureProviderA#isCanFail <em>Can Fail</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.FailureProviderA#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.FailureProviderA#getPartFailureModes <em>Part Failure Modes</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.SafetyPackage#getFailureProviderA()
 * @model abstract="true"
 * @generated
 */
public interface FailureProviderA extends EObject {
	/**
	 * Returns the value of the '<em><b>Can Fail</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes whether the component can fail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Fail</em>' attribute.
	 * @see #setCanFail(boolean)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFailureProviderA_CanFail()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isCanFail();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.FailureProviderA#isCanFail <em>Can Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Fail</em>' attribute.
	 * @see #isCanFail()
	 * @generated
	 */
	void setCanFail(boolean value);

	/**
	 * Returns the value of the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The failure rate of the component given in 1/h.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Rate</em>' attribute.
	 * @see #setFailureRate(double)
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFailureProviderA_FailureRate()
	 * @model required="true"
	 * @generated
	 */
	double getFailureRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.FailureProviderA#getFailureRate <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Rate</em>' attribute.
	 * @see #getFailureRate()
	 * @generated
	 */
	void setFailureRate(double value);

	/**
	 * Returns the value of the '<em><b>Part Failure Modes</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.PartFailureMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of failure modes that can occur for this hardware part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Failure Modes</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFailureProviderA_PartFailureModes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartFailureMode> getPartFailureModes();

} // FailureProviderA
