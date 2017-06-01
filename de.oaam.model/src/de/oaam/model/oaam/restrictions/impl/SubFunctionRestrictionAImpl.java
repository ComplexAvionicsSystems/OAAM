/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.functions.Subfunction;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.SubFunctionRestrictionA;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Function Restriction A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SubFunctionRestrictionAImpl#getSubFunctions <em>Sub Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubFunctionRestrictionAImpl extends MinimalEObjectImpl.Container implements SubFunctionRestrictionA {
	/**
	 * The cached value of the '{@link #getSubFunctions() <em>Sub Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subfunction> subFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubFunctionRestrictionAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.SUB_FUNCTION_RESTRICTION_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subfunction> getSubFunctions() {
		if (subFunctions == null) {
			subFunctions = new EObjectResolvingEList<Subfunction>(Subfunction.class, this, RestrictionsPackage.SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS);
		}
		return subFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestrictionsPackage.SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS:
				return getSubFunctions();
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
			case RestrictionsPackage.SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS:
				getSubFunctions().clear();
				getSubFunctions().addAll((Collection<? extends Subfunction>)newValue);
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
			case RestrictionsPackage.SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS:
				getSubFunctions().clear();
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
			case RestrictionsPackage.SUB_FUNCTION_RESTRICTION_A__SUB_FUNCTIONS:
				return subFunctions != null && !subFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubFunctionRestrictionAImpl
