/**
 */
package de.oaam.model.oaam.systems;

import de.oaam.model.oaam.common.OaamBaseElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Segregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An input segregation defines that two inputs or a system or multiple systems must be from segregated sources. The meaning of segregation can be refined with the attributes. Setting two inputs as segregated is only the information that the inputs needs to be segregated. If segregation is ensured, cannot be verified in the systems model. This requires the real implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.InputSegregation#isDissimilarSource <em>Dissimilar Source</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.InputSegregation#isDissimilarRoute <em>Dissimilar Route</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.InputSegregation#isDissimilarTechnology <em>Dissimilar Technology</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.InputSegregation#getGroupA <em>Group A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.InputSegregation#getGroupB <em>Group B</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getInputSegregation()
 * @model
 * @generated
 */
public interface InputSegregation extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Dissimilar Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sources of information must be dissimilar, e.g. dissimilar hardware
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dissimilar Source</em>' attribute.
	 * @see #setDissimilarSource(boolean)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInputSegregation_DissimilarSource()
	 * @model required="true"
	 * @generated
	 */
	boolean isDissimilarSource();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.InputSegregation#isDissimilarSource <em>Dissimilar Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissimilar Source</em>' attribute.
	 * @see #isDissimilarSource()
	 * @generated
	 */
	void setDissimilarSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Dissimilar Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input flow to the system must take dissimilar routes, e.g. AFDX and CAN bus
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dissimilar Route</em>' attribute.
	 * @see #setDissimilarRoute(boolean)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInputSegregation_DissimilarRoute()
	 * @model required="true"
	 * @generated
	 */
	boolean isDissimilarRoute();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.InputSegregation#isDissimilarRoute <em>Dissimilar Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissimilar Route</em>' attribute.
	 * @see #isDissimilarRoute()
	 * @generated
	 */
	void setDissimilarRoute(boolean value);

	/**
	 * Returns the value of the '<em><b>Dissimilar Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The information must be acquired by dissimilar technology. E.g. resistive and capacitive temperature sensors, or electric and mechanical power supply
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dissimilar Technology</em>' attribute.
	 * @see #setDissimilarTechnology(boolean)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInputSegregation_DissimilarTechnology()
	 * @model required="true"
	 * @generated
	 */
	boolean isDissimilarTechnology();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.InputSegregation#isDissimilarTechnology <em>Dissimilar Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissimilar Technology</em>' attribute.
	 * @see #isDissimilarTechnology()
	 * @generated
	 */
	void setDissimilarTechnology(boolean value);

	/**
	 * Returns the value of the '<em><b>Group A</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.systems.RequiredInformationA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inputs in group A must be segregated to from inputs of class B
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group A</em>' reference list.
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInputSegregation_GroupA()
	 * @model required="true"
	 * @generated
	 */
	EList<RequiredInformationA> getGroupA();

	/**
	 * Returns the value of the '<em><b>Group B</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.systems.RequiredInformationA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inputs in group A must be segregated to from inputs of class B
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group B</em>' reference list.
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInputSegregation_GroupB()
	 * @model required="true"
	 * @generated
	 */
	EList<RequiredInformationA> getGroupB();

} // InputSegregation
