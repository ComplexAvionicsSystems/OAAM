/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.ResourceTypeModifier;
import de.oaam.model.oaam.library.ResourceTypeModifierLevel;
import de.oaam.model.oaam.library.ResourceTypeModifierReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type Modifier Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierReferenceImpl#getAllowedLevels <em>Allowed Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeModifierReferenceImpl extends OaamBaseElementAImpl implements ResourceTypeModifierReference {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResourceTypeModifier type;

	/**
	 * The cached value of the '{@link #getAllowedLevels() <em>Allowed Levels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceTypeModifierLevel> allowedLevels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeModifierReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.RESOURCE_TYPE_MODIFIER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeModifier getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ResourceTypeModifier)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeModifier basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ResourceTypeModifier newType) {
		ResourceTypeModifier oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceTypeModifierLevel> getAllowedLevels() {
		if (allowedLevels == null) {
			allowedLevels = new EObjectResolvingEList<ResourceTypeModifierLevel>(ResourceTypeModifierLevel.class, this, LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__ALLOWED_LEVELS);
		}
		return allowedLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__ALLOWED_LEVELS:
				return getAllowedLevels();
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
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__TYPE:
				setType((ResourceTypeModifier)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__ALLOWED_LEVELS:
				getAllowedLevels().clear();
				getAllowedLevels().addAll((Collection<? extends ResourceTypeModifierLevel>)newValue);
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
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__TYPE:
				setType((ResourceTypeModifier)null);
				return;
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__ALLOWED_LEVELS:
				getAllowedLevels().clear();
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
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__TYPE:
				return type != null;
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_REFERENCE__ALLOWED_LEVELS:
				return allowedLevels != null && !allowedLevels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceTypeModifierReferenceImpl
