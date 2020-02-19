/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The type of an IO
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.IoType#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getIoType()
 * @model
 * @generated
 */
public interface IoType extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link de.oaam.model.oaam.library.IoDirectionE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The direction of the IO, e.g. IN, OUT, BOTH
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see de.oaam.model.oaam.library.IoDirectionE
	 * @see #setDirection(IoDirectionE)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getIoType_Direction()
	 * @model default="NONE" required="true"
	 * @generated
	 */
	IoDirectionE getDirection();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.IoType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.oaam.model.oaam.library.IoDirectionE
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(IoDirectionE value);

} // IoType
