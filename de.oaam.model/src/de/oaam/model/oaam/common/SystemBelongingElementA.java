/**
 */
package de.oaam.model.oaam.common;

import de.oaam.model.oaam.systems.SystemsContainerA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Belonging Element A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.SystemBelongingElementA#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getSystemBelongingElementA()
 * @model
 * @generated
 */
public interface SystemBelongingElementA extends EObject {
	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference a (sub)system here to show this (sub)function is part of that system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(SystemsContainerA)
	 * @see de.oaam.model.oaam.common.CommonPackage#getSystemBelongingElementA_BelongsTo()
	 * @model
	 * @generated
	 */
	SystemsContainerA getBelongsTo();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.SystemBelongingElementA#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(SystemsContainerA value);

} // SystemBelongingElementA
