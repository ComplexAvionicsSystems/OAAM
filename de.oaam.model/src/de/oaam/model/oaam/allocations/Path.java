/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.hardware.Device;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A path indicates the path a signal/message may take on the real hardware
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.Path#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.Path#getSource <em>Source</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.Path#getDestination <em>Destination</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.Path#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends PathA {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.Segment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path for this segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPath_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Segment> getSegments();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source device for this path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Device)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPath_Source()
	 * @model
	 * @generated
	 */
	Device getSource();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.Path#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Device value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Destination device for this path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(DeviceAssignment)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPath_Destination()
	 * @model
	 * @generated
	 */
	DeviceAssignment getDestination();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.Path#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(DeviceAssignment value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message that realizes this path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(MessageA)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPath_Message()
	 * @model
	 * @generated
	 */
	MessageA getMessage();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.Path#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(MessageA value);

} // Path
