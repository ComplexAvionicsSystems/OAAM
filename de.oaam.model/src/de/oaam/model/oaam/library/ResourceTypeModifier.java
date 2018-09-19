/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A general definition of a resource modifier. For instance a discrete output resource could appear in 100 and 250 mA output current levels. In this case  the modifier is "current level" and the levels are 100 and 250.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ResourceTypeModifier#getLevels <em>Levels</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceTypeModifier()
 * @model
 * @generated
 */
public interface ResourceTypeModifier extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ResourceTypeModifierLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of levels allowed for this modifier type. This can be restricted for a certain resource type in the modifier definition. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getResourceTypeModifier_Levels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceTypeModifierLevel> getLevels();

} // ResourceTypeModifier
