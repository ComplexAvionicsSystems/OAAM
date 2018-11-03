/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.anatomy.Area;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An area restriction forces devices, connection, tasks or signals to use or aviod location and ducts of a certain area.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.AreaRestriction#getAreaName <em>Area Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.AreaRestriction#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.AreaRestriction#getAreas <em>Areas</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getAreaRestriction()
 * @model
 * @generated
 */
public interface AreaRestriction extends TaskRestrictionA, TaskGroupRestrictionA, SignalRestrictionA, SignalGroupRestrictionA, SubfunctionRestrictionA, DeviceRestrictionA, ConnectionRestrinctionA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Area Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the area model is not available this can be used as a textual reference to the area to be avoided. This can be resolved later.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Name</em>' attribute.
	 * @see #setAreaName(String)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getAreaRestriction_AreaName()
	 * @model
	 * @generated
	 */
	String getAreaName();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.AreaRestriction#getAreaName <em>Area Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Name</em>' attribute.
	 * @see #getAreaName()
	 * @generated
	 */
	void setAreaName(String value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * false = use only this area. true = aviod this area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getAreaRestriction_IsForbidden()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.AreaRestriction#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Areas</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.anatomy.Area}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The areas to be used or avoided. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Areas</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getAreaRestriction_Areas()
	 * @model
	 * @generated
	 */
	EList<Area> getAreas();

} // AreaRestriction
