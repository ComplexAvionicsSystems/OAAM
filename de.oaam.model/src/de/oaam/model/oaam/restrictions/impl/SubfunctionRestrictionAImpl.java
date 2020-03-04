/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.functions.Subfunctions;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.SubfunctionRestrictionA;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subfunction Restriction A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SubfunctionRestrictionAImpl#getSubfunctions <em>Subfunctions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubfunctionRestrictionAImpl extends MinimalEObjectImpl.Container implements SubfunctionRestrictionA {
	/**
	 * The cached value of the '{@link #getSubfunctions() <em>Subfunctions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subfunctions> subfunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubfunctionRestrictionAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.SUBFUNCTION_RESTRICTION_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subfunctions> getSubfunctions() {
		if (subfunctions == null) {
			subfunctions = new EObjectResolvingEList<Subfunctions>(Subfunctions.class, this, RestrictionsPackage.SUBFUNCTION_RESTRICTION_A__SUBFUNCTIONS);
		}
		return subfunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestrictionsPackage.SUBFUNCTION_RESTRICTION_A__SUBFUNCTIONS:
				return getSubfunctions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestrictionsPackage.SUBFUNCTION_RESTRICTION_A__SUBFUNCTIONS:
				getSubfunctions().clear();
				getSubfunctions().addAll((Collection<? extends Subfunctions>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RestrictionsPackage.SUBFUNCTION_RESTRICTION_A__SUBFUNCTIONS:
				getSubfunctions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestrictionsPackage.SUBFUNCTION_RESTRICTION_A__SUBFUNCTIONS:
				return subfunctions != null && !subfunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubfunctionRestrictionAImpl
