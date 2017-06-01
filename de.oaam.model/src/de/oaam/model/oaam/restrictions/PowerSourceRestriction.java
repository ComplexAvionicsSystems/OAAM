/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.library.PowerSource;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Source Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A power restriction forces functions or signals to be mapped or not mapped to devices with a certain power supply.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction#getPowerSourceName <em>Power Source Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction#getPowerSources <em>Power Sources</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPowerSourceRestriction()
 * @model
 * @generated
 */
public interface PowerSourceRestriction extends TaskRestrictionA, DeviceRestrictionA, SignalRestrictionA, SubFunctionRestrictionA, _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Power Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual definition of the considered power source, of the power source model is not available by now. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Source Name</em>' attribute.
	 * @see #setPowerSourceName(String)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPowerSourceRestriction_PowerSourceName()
	 * @model
	 * @generated
	 */
	String getPowerSourceName();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction#getPowerSourceName <em>Power Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Source Name</em>' attribute.
	 * @see #getPowerSourceName()
	 * @generated
	 */
	void setPowerSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * false = use the given power supply. true = not use the given power supply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPowerSourceRestriction_IsForbidden()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Power Sources</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.PowerSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The power source(s) to be used or avoided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Sources</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPowerSourceRestriction_PowerSources()
	 * @model
	 * @generated
	 */
	EList<PowerSource> getPowerSources();

} // PowerSourceRestriction
