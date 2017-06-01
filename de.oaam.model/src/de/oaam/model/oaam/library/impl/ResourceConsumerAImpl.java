/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.Resource;
import de.oaam.model.oaam.library.ResourceConsumerA;
import de.oaam.model.oaam.library.ResourceGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Consumer A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceConsumerAImpl#getRequiredResources <em>Required Resources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceConsumerAImpl#getConsumedGroups <em>Consumed Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceConsumerAImpl extends MinimalEObjectImpl.Container implements ResourceConsumerA {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceConsumerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.RESOURCE_CONSUMER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequiredResources() {
		if (requiredResources == null) {
			requiredResources = new EObjectContainmentEList<Resource>(Resource.class, this, LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES);
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
			consumedGroups = new EObjectContainmentEList<ResourceGroup>(ResourceGroup.class, this, LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS);
		}
		return consumedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES:
				return ((InternalEList<?>)getRequiredResources()).basicRemove(otherEnd, msgs);
			case LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS:
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
			case LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES:
				return getRequiredResources();
			case LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS:
				return getConsumedGroups();
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
			case LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES:
				getRequiredResources().clear();
				getRequiredResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS:
				getConsumedGroups().clear();
				getConsumedGroups().addAll((Collection<? extends ResourceGroup>)newValue);
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
			case LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES:
				getRequiredResources().clear();
				return;
			case LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS:
				getConsumedGroups().clear();
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
			case LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES:
				return requiredResources != null && !requiredResources.isEmpty();
			case LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS:
				return consumedGroups != null && !consumedGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceConsumerAImpl
