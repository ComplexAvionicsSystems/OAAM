/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Symmetry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Symmetric areas can be used to map symmetric functions symmetrically on devices in both locations. For instance, allocations two redundancies on the left and right hand side of the aircraft.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.AreaSymmetry#getAreas <em>Areas</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getAreaSymmetry()
 * @model
 * @generated
 */
public interface AreaSymmetry extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Areas</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Area}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All areas that are assumed to be symmetric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Areas</em>' reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getAreaSymmetry_Areas()
	 * @model
	 * @generated
	 */
	EList<Area> getAreas();

} // AreaSymmetry
