/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.anatomy.Location;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A location restriction forces devices, connections, tasks or signals to use or avoid certain locations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.LocationRestriction#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.LocationRestriction#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.LocationRestriction#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getLocationRestriction()
 * @model
 * @generated
 */
public interface LocationRestriction extends TaskRestrictionA, SignalRestrictionA, SubfunctionRestrictionA, DeviceRestrictionA, ConnectionRestrinctionA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a textual reference to the location, which is not allowed in the case that no anatomy model is defined at the time of modeling the functions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Name</em>' attribute.
	 * @see #setLocationName(String)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getLocationRestriction_LocationName()
	 * @model
	 * @generated
	 */
	String getLocationName();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.LocationRestriction#getLocationName <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Name</em>' attribute.
	 * @see #getLocationName()
	 * @generated
	 */
	void setLocationName(String value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * false = location must be used. true = location must not be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getLocationRestriction_IsForbidden()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.LocationRestriction#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location(s) to be used or avoided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getLocationRestriction_Locations()
	 * @model
	 * @generated
	 */
	EList<Location> getLocations();

} // LocationRestriction
