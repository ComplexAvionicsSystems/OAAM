/**
 */
package de.oaam.model.oaam.physical;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.functions.Task;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.physical.PhysicalInterfaceA#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.PhysicalInterfaceA#getDimension <em>Dimension</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.PhysicalInterfaceA#getImplementedBy <em>Implemented By</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.physical.PhysicalPackage#getPhysicalInterfaceA()
 * @model abstract="true"
 * @generated
 */
public interface PhysicalInterfaceA extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical unit of the signal, e.g. s for seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getPhysicalInterfaceA_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.physical.PhysicalInterfaceA#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical unit of the signal, e.g. s for seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(String)
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getPhysicalInterfaceA_Dimension()
	 * @model
	 * @generated
	 */
	String getDimension();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.physical.PhysicalInterfaceA#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(String value);

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference list.
	 * @see de.oaam.model.oaam.physical.PhysicalPackage#getPhysicalInterfaceA_ImplementedBy()
	 * @model
	 * @generated
	 */
	EList<Task> getImplementedBy();

} // PhysicalInterfaceA
