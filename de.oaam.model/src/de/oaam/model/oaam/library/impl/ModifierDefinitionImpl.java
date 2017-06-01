/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl._ElementAImpl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.ModifierDefinition;
import de.oaam.model.oaam.library.ModifierLevel;
import de.oaam.model.oaam.library.ResourceModifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ModifierDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ModifierDefinitionImpl#getAllowedLevels <em>Allowed Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifierDefinitionImpl extends _ElementAImpl implements ModifierDefinition {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResourceModifier type;

	/**
	 * The cached value of the '{@link #getAllowedLevels() <em>Allowed Levels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifierLevel> allowedLevels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.MODIFIER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModifier getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ResourceModifier)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.MODIFIER_DEFINITION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModifier basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ResourceModifier newType) {
		ResourceModifier oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.MODIFIER_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifierLevel> getAllowedLevels() {
		if (allowedLevels == null) {
			allowedLevels = new EObjectResolvingEList<ModifierLevel>(ModifierLevel.class, this, LibraryPackage.MODIFIER_DEFINITION__ALLOWED_LEVELS);
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
			case LibraryPackage.MODIFIER_DEFINITION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case LibraryPackage.MODIFIER_DEFINITION__ALLOWED_LEVELS:
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
			case LibraryPackage.MODIFIER_DEFINITION__TYPE:
				setType((ResourceModifier)newValue);
				return;
			case LibraryPackage.MODIFIER_DEFINITION__ALLOWED_LEVELS:
				getAllowedLevels().clear();
				getAllowedLevels().addAll((Collection<? extends ModifierLevel>)newValue);
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
			case LibraryPackage.MODIFIER_DEFINITION__TYPE:
				setType((ResourceModifier)null);
				return;
			case LibraryPackage.MODIFIER_DEFINITION__ALLOWED_LEVELS:
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
			case LibraryPackage.MODIFIER_DEFINITION__TYPE:
				return type != null;
			case LibraryPackage.MODIFIER_DEFINITION__ALLOWED_LEVELS:
				return allowedLevels != null && !allowedLevels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModifierDefinitionImpl
