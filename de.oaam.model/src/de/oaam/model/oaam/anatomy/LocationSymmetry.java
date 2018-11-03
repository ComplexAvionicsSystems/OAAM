/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Symmetry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Symmetric location can be used to map symmetric functions symmetrically on devices in both locations. For instance, allocations two redundancies on the left and right hand side of the aircraft.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.LocationSymmetry#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getLocationSymmetry()
 * @model
 * @generated
 */
public interface LocationSymmetry extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All locations that are assumed to be symmetric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getLocationSymmetry_Locations()
	 * @model
	 * @generated
	 */
	EList<Location> getLocations();

} // LocationSymmetry
