/**
 */
package de.oaam.model.oaam.common;

import de.oaam.model.oaam.systems.SystemsContainerA;

import org.eclipse.emf.common.util.EList;
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
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.systems.SystemsContainerA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference a (sub)system here to show this (sub)function is part of that system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference list.
	 * @see de.oaam.model.oaam.common.CommonPackage#getSystemBelongingElementA_BelongsTo()
	 * @model
	 * @generated
	 */
	EList<SystemsContainerA> getBelongsTo();

} // SystemBelongingElementA
