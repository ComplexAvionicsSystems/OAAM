/**
 */
package de.oaam.model.oaam.common.impl;

import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.SystemBelongingElementA;

import de.oaam.model.oaam.systems.SystemsContainerA;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Belonging Element A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.impl.SystemBelongingElementAImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemBelongingElementAImpl extends MinimalEObjectImpl.Container implements SystemBelongingElementA {
	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemsContainerA> belongsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemBelongingElementAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.SYSTEM_BELONGING_ELEMENT_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemsContainerA> getBelongsTo() {
		if (belongsTo == null) {
			belongsTo = new EObjectResolvingEList<SystemsContainerA>(SystemsContainerA.class, this, CommonPackage.SYSTEM_BELONGING_ELEMENT_A__BELONGS_TO);
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.SYSTEM_BELONGING_ELEMENT_A__BELONGS_TO:
				return getBelongsTo();
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
			case CommonPackage.SYSTEM_BELONGING_ELEMENT_A__BELONGS_TO:
				getBelongsTo().clear();
				getBelongsTo().addAll((Collection<? extends SystemsContainerA>)newValue);
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
			case CommonPackage.SYSTEM_BELONGING_ELEMENT_A__BELONGS_TO:
				getBelongsTo().clear();
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
			case CommonPackage.SYSTEM_BELONGING_ELEMENT_A__BELONGS_TO:
				return belongsTo != null && !belongsTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemBelongingElementAImpl
