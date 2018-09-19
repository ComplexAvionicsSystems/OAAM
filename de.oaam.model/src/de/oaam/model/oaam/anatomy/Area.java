/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An area is set of location and ducts that have something in common, e.g. they belong to the same structure. Areas are useful to express constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.Area#getLocations <em>Locations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.Area#getDucts <em>Ducts</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All locations belonging to this area
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getArea_Locations()
	 * @model
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Ducts</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Duct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All ducts belonging to this area
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ducts</em>' reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getArea_Ducts()
	 * @model
	 * @generated
	 */
	EList<Duct> getDucts();

} // Area
