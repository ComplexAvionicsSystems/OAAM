/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common.OaamBaseElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root class of the anatomy model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getLocations <em>Locations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getLocationSymmetries <em>Location Symmetries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getDucts <em>Ducts</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getAreas <em>Areas</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getSubanatomies <em>Subanatomies</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.AnatomyContainerA#getAreaSymmetries <em>Area Symmetries</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getAnatomyContainerA()
 * @model abstract="true"
 * @generated
 */
public interface AnatomyContainerA extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All locations in the anatomy model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getAnatomyContainerA_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Location Symmetries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.LocationSymmetry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All location symmetries in the anatomy model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Symmetries</em>' containment reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getAnatomyContainerA_LocationSymmetries()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocationSymmetry> getLocationSymmetries();

	/**
	 * Returns the value of the '<em><b>Ducts</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Duct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All ducts in the anatomy model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ducts</em>' containment reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getAnatomyContainerA_Ducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Duct> getDucts();

	/**
	 * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Area}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All areas in the anatomy model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Areas</em>' containment reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getAnatomyContainerA_Areas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getAreas();

	/**
	 * Returns the value of the '<em><b>Subanatomies</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Subanatomy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All subanatomies of the anatomy
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subanatomies</em>' containment reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getAnatomyContainerA_Subanatomies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subanatomy> getSubanatomies();

	/**
	 * Returns the value of the '<em><b>Area Symmetries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.AreaSymmetry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All area symmetries in the anatomy model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Symmetries</em>' containment reference list.
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getAnatomyContainerA_AreaSymmetries()
	 * @model containment="true"
	 * @generated
	 */
	EList<AreaSymmetry> getAreaSymmetries();

} // AnatomyContainerA
