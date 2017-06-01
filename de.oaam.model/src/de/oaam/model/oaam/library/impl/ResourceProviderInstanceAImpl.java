/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.ModifierLevel;
import de.oaam.model.oaam.library.ResourceProviderInstanceA;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Provider Instance A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceProviderInstanceAImpl#getRequiredModifiers <em>Required Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceProviderInstanceAImpl extends MinimalEObjectImpl.Container implements ResourceProviderInstanceA {
	/**
	 * The cached value of the '{@link #getRequiredModifiers() <em>Required Modifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifierLevel> requiredModifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceProviderInstanceAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.RESOURCE_PROVIDER_INSTANCE_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifierLevel> getRequiredModifiers() {
		if (requiredModifiers == null) {
			requiredModifiers = new EObjectResolvingEList<ModifierLevel>(ModifierLevel.class, this, LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS);
		}
		return requiredModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS:
				return getRequiredModifiers();
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
			case LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS:
				getRequiredModifiers().clear();
				getRequiredModifiers().addAll((Collection<? extends ModifierLevel>)newValue);
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
			case LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS:
				getRequiredModifiers().clear();
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
			case LibraryPackage.RESOURCE_PROVIDER_INSTANCE_A__REQUIRED_MODIFIERS:
				return requiredModifiers != null && !requiredModifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceProviderInstanceAImpl
