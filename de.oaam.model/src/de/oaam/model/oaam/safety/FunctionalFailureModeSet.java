/**
 */
package de.oaam.model.oaam.safety;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Failure Mode Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of function functional failure modes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.FunctionalFailureModeSet#getFailureModes <em>Failure Modes</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.SafetyPackage#getFunctionalFailureModeSet()
 * @model
 * @generated
 */
public interface FunctionalFailureModeSet extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Failure Modes</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.safety.FunctionalFailureMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The failure modes contained in this set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Modes</em>' containment reference list.
	 * @see de.oaam.model.oaam.safety.SafetyPackage#getFunctionalFailureModeSet_FailureModes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalFailureMode> getFailureModes();

} // FunctionalFailureModeSet
