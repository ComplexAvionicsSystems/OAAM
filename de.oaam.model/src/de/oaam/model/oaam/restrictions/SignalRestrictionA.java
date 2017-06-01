/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.functions.Signal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Restriction A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for signal restrictions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.SignalRestrictionA#getSignals <em>Signals</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSignalRestrictionA()
 * @model abstract="true"
 * @generated
 */
public interface SignalRestrictionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Signals</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signals this constraint applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signals</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSignalRestrictionA_Signals()
	 * @model
	 * @generated
	 */
	EList<Signal> getSignals();

} // SignalRestrictionA
