/**
 */
package de.oaam.model.oaam.physical;

import de.oaam.model.oaam.functions.Input;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.physical.Effector#getObservableBy <em>Observable By</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.Effector#getSignalledBy <em>Signalled By</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.physical.PhysicalPackage#getEffector()
 * @model
 * @generated
 */
public interface Effector extends PhysicalInterfaceA {
	/**
	 * Returns the value of the '<em><b>Observable By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observable By</em>' reference.
	 * @see #setObservableBy(Sensor)
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getEffector_ObservableBy()
	 * @model
	 * @generated
	 */
	Sensor getObservableBy();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.physical.Effector#getObservableBy <em>Observable By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observable By</em>' reference.
	 * @see #getObservableBy()
	 * @generated
	 */
	void setObservableBy(Sensor value);

	/**
	 * Returns the value of the '<em><b>Signalled By</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalled By</em>' reference list.
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getEffector_SignalledBy()
	 * @model
	 * @generated
	 */
	EList<Input> getSignalledBy();

} // Effector
