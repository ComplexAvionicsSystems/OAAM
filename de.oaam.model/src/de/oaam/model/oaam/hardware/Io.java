/**
 */
package de.oaam.model.oaam.hardware;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.library.IoDeclaration;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An I/O is a physical connection point for connections.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.hardware.Io#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.hardware.HardwarePackage#getIo()
 * @model
 * @generated
 */
public interface Io extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to the I/O declaration of the device type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(IoDeclaration)
	 * @see de.oaam.model.oaam.hardware.HardwarePackage#getIo_Declaration()
	 * @model required="true"
	 * @generated
	 */
	IoDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.hardware.Io#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(IoDeclaration value);

} // Io
