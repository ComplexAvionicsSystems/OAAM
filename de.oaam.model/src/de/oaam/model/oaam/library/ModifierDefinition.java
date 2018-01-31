/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.ElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The modifier definition relates modifier types and modifier levels to modifiers that can be assigned to resource types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ModifierDefinition#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ModifierDefinition#getAllowedLevels <em>Allowed Levels</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getModifierDefinition()
 * @model
 * @generated
 */
public interface ModifierDefinition extends ElementA {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modifier type. There can be more than one modifier definitions for one type, e.g. if different levels are allowed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ResourceModifier)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getModifierDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	ResourceModifier getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ModifierDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceModifier value);

	/**
	 * Returns the value of the '<em><b>Allowed Levels</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ModifierLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of modifier levels allowed for this modifier. For instance a lightning protection modifier could allow L1,L2,L4,L5,L6,L8.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed Levels</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getModifierDefinition_AllowedLevels()
	 * @model required="true"
	 * @generated
	 */
	EList<ModifierLevel> getAllowedLevels();

} // ModifierDefinition
