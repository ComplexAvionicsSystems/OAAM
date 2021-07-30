/**
 */
package de.oaam.model.oaam.physical;

import de.oaam.model.oaam.functions.Output;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.physical.Sensor#getSignalledBy <em>Signalled By</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.physical.PhysicalPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends PhysicalInterfaceA {
	/**
	 * Returns the value of the '<em><b>Signalled By</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalled By</em>' reference list.
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getSensor_SignalledBy()
	 * @model
	 * @generated
	 */
	EList<Output> getSignalledBy();

} // Sensor
