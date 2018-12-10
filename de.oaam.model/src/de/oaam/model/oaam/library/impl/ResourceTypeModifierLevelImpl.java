/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.Resource;
import de.oaam.model.oaam.library.ResourceConsumerA;
import de.oaam.model.oaam.library.ResourceGroup;
import de.oaam.model.oaam.library.ResourceTypeModifierLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type Modifier Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierLevelImpl#getRequiredResources <em>Required Resources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierLevelImpl#getConsumedGroups <em>Consumed Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierLevelImpl#getEqualAlternatives <em>Equal Alternatives</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeModifierLevelImpl#getBetterAlternative <em>Better Alternative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeModifierLevelImpl extends OaamBaseElementAImpl implements ResourceTypeModifierLevel {
	/**
	 * The cached value of the '{@link #getRequiredResources() <em>Required Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> requiredResources;

	/**
	 * The cached value of the '{@link #getConsumedGroups() <em>Consumed Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroup> consumedGroups;

	/**
	 * The cached value of the '{@link #getEqualAlternatives() <em>Equal Alternatives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceTypeModifierLevel> equalAlternatives;

	/**
	 * The cached value of the '{@link #getBetterAlternative() <em>Better Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetterAlternative()
	 * @generated
	 * @ordered
	 */
	protected ResourceTypeModifierLevel betterAlternative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeModifierLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.RESOURCE_TYPE_MODIFIER_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequiredResources() {
		if (requiredResources == null) {
			requiredResources = new EObjectContainmentEList<Resource>(Resource.class, this, LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__REQUIRED_RESOURCES);
		}
		return requiredResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceGroup> getConsumedGroups() {
		if (consumedGroups == null) {
			consumedGroups = new EObjectContainmentEList<ResourceGroup>(ResourceGroup.class, this, LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__CONSUMED_GROUPS);
		}
		return consumedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceTypeModifierLevel> getEqualAlternatives() {
		if (equalAlternatives == null) {
			equalAlternatives = new EObjectResolvingEList<ResourceTypeModifierLevel>(ResourceTypeModifierLevel.class, this, LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__EQUAL_ALTERNATIVES);
		}
		return equalAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeModifierLevel getBetterAlternative() {
		if (betterAlternative != null && betterAlternative.eIsProxy()) {
			InternalEObject oldBetterAlternative = (InternalEObject)betterAlternative;
			betterAlternative = (ResourceTypeModifierLevel)eResolveProxy(oldBetterAlternative);
			if (betterAlternative != oldBetterAlternative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__BETTER_ALTERNATIVE, oldBetterAlternative, betterAlternative));
			}
		}
		return betterAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeModifierLevel basicGetBetterAlternative() {
		return betterAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBetterAlternative(ResourceTypeModifierLevel newBetterAlternative) {
		ResourceTypeModifierLevel oldBetterAlternative = betterAlternative;
		betterAlternative = newBetterAlternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__BETTER_ALTERNATIVE, oldBetterAlternative, betterAlternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__REQUIRED_RESOURCES:
				return ((InternalEList<?>)getRequiredResources()).basicRemove(otherEnd, msgs);
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__CONSUMED_GROUPS:
				return ((InternalEList<?>)getConsumedGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__REQUIRED_RESOURCES:
				return getRequiredResources();
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__CONSUMED_GROUPS:
				return getConsumedGroups();
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__EQUAL_ALTERNATIVES:
				return getEqualAlternatives();
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__BETTER_ALTERNATIVE:
				if (resolve) return getBetterAlternative();
				return basicGetBetterAlternative();
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
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__REQUIRED_RESOURCES:
				getRequiredResources().clear();
				getRequiredResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__CONSUMED_GROUPS:
				getConsumedGroups().clear();
				getConsumedGroups().addAll((Collection<? extends ResourceGroup>)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__EQUAL_ALTERNATIVES:
				getEqualAlternatives().clear();
				getEqualAlternatives().addAll((Collection<? extends ResourceTypeModifierLevel>)newValue);
				return;
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__BETTER_ALTERNATIVE:
				setBetterAlternative((ResourceTypeModifierLevel)newValue);
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
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__REQUIRED_RESOURCES:
				getRequiredResources().clear();
				return;
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__CONSUMED_GROUPS:
				getConsumedGroups().clear();
				return;
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__EQUAL_ALTERNATIVES:
				getEqualAlternatives().clear();
				return;
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__BETTER_ALTERNATIVE:
				setBetterAlternative((ResourceTypeModifierLevel)null);
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
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__REQUIRED_RESOURCES:
				return requiredResources != null && !requiredResources.isEmpty();
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__CONSUMED_GROUPS:
				return consumedGroups != null && !consumedGroups.isEmpty();
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__EQUAL_ALTERNATIVES:
				return equalAlternatives != null && !equalAlternatives.isEmpty();
			case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__BETTER_ALTERNATIVE:
				return betterAlternative != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceConsumerA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__REQUIRED_RESOURCES: return LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES;
				case LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__CONSUMED_GROUPS: return LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceConsumerA.class) {
			switch (baseFeatureID) {
				case LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES: return LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__REQUIRED_RESOURCES;
				case LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS: return LibraryPackage.RESOURCE_TYPE_MODIFIER_LEVEL__CONSUMED_GROUPS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ResourceTypeModifierLevelImpl
