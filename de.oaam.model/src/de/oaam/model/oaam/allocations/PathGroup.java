/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.hardware.Device;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A path group can be used to identify path variants, e.g., for redundancy
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.PathGroup#getSubpaths <em>Subpaths</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.PathGroup#isChildrenRedundant <em>Children Redundant</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.PathGroup#getSources <em>Sources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.PathGroup#getDestinations <em>Destinations</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPathGroup()
 * @model
 * @generated
 */
public interface PathGroup extends PathA {
	/**
	 * Returns the value of the '<em><b>Subpaths</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.SegmentA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subpaths for this group, can be used to show redundancy
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subpaths</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPathGroup_Subpaths()
	 * @model containment="true"
	 * @generated
	 */
	EList<SegmentA> getSubpaths();

	/**
	 * Returns the value of the '<em><b>Children Redundant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, all children are recognized as being redundant to each other
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children Redundant</em>' attribute.
	 * @see #setChildrenRedundant(boolean)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPathGroup_ChildrenRedundant()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isChildrenRedundant();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.PathGroup#isChildrenRedundant <em>Children Redundant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children Redundant</em>' attribute.
	 * @see #isChildrenRedundant()
	 * @generated
	 */
	void setChildrenRedundant(boolean value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source devices for this path group
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPathGroup_Sources()
	 * @model
	 * @generated
	 */
	EList<Device> getSources();

	/**
	 * Returns the value of the '<em><b>Destinations</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Destination devices for this path group
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destinations</em>' reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getPathGroup_Destinations()
	 * @model
	 * @generated
	 */
	EList<Device> getDestinations();

} // PathGroup
