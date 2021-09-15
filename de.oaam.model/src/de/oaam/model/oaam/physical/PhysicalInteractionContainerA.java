/**
 */
package de.oaam.model.oaam.physical;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.functions.FunctionsContainerA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getFunction <em>Function</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getSubphysicalInteractions <em>Subphysical Interactions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getSensors <em>Sensors</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getEffectors <em>Effectors</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.physical.PhysicalPackage#getPhysicalInteractionContainerA()
 * @model abstract="true"
 * @generated
 */
public interface PhysicalInteractionContainerA extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FunctionsContainerA)
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getPhysicalInteractionContainerA_Function()
	 * @model
	 * @generated
	 */
	FunctionsContainerA getFunction();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionsContainerA value);

	/**
	 * Returns the value of the '<em><b>Subphysical Interactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subphysical Interactions</em>' containment reference.
	 * @see #setSubphysicalInteractions(SubphysicalInteraction)
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getPhysicalInteractionContainerA_SubphysicalInteractions()
	 * @model containment="true"
	 * @generated
	 */
	SubphysicalInteraction getSubphysicalInteractions();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA#getSubphysicalInteractions <em>Subphysical Interactions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subphysical Interactions</em>' containment reference.
	 * @see #getSubphysicalInteractions()
	 * @generated
	 */
	void setSubphysicalInteractions(SubphysicalInteraction value);

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.physical.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getPhysicalInteractionContainerA_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Effectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.physical.Effector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectors</em>' containment reference list.
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getPhysicalInteractionContainerA_Effectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effector> getEffectors();

} // PhysicalInteractionContainerA
