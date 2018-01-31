/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.ElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible instance of a modifier, e.g. 250mA for a current level modifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.ModifierLevel#getEqualAlternatives <em>Equal Alternatives</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.ModifierLevel#getBetterAlternative <em>Better Alternative</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getModifierLevel()
 * @model
 * @generated
 */
public interface ModifierLevel extends ElementA, ResourceConsumerA {
	/**
	 * Returns the value of the '<em><b>Equal Alternatives</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.ModifierLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this modifier is not available is there another modifiere that can be used?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Equal Alternatives</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getModifierLevel_EqualAlternatives()
	 * @model
	 * @generated
	 */
	EList<ModifierLevel> getEqualAlternatives();

	/**
	 * Returns the value of the '<em><b>Better Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the next higher modifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Better Alternative</em>' reference.
	 * @see #setBetterAlternative(ModifierLevel)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getModifierLevel_BetterAlternative()
	 * @model
	 * @generated
	 */
	ModifierLevel getBetterAlternative();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.ModifierLevel#getBetterAlternative <em>Better Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Better Alternative</em>' reference.
	 * @see #getBetterAlternative()
	 * @generated
	 */
	void setBetterAlternative(ModifierLevel value);

} // ModifierLevel
