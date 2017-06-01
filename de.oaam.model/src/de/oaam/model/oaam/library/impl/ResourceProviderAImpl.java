/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.ResourceBundles;
import de.oaam.model.oaam.library.ResourceGroup;
import de.oaam.model.oaam.library.ResourceLink;
import de.oaam.model.oaam.library.ResourceProviderA;
import de.oaam.model.oaam.library.ResourceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Provider A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceProviderAImpl#getProvidedBundles <em>Provided Bundles</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceProviderAImpl#getPossibleResourceProvisions <em>Possible Resource Provisions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceProviderAImpl#getProvidedGroups <em>Provided Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceProviderAImpl#getResourceLinks <em>Resource Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceProviderAImpl extends MinimalEObjectImpl.Container implements ResourceProviderA {
	/**
	 * The cached value of the '{@link #getProvidedBundles() <em>Provided Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceBundles> providedBundles;

	/**
	 * The cached value of the '{@link #getPossibleResourceProvisions() <em>Possible Resource Provisions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleResourceProvisions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> possibleResourceProvisions;

	/**
	 * The cached value of the '{@link #getProvidedGroups() <em>Provided Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroup> providedGroups;

	/**
	 * The cached value of the '{@link #getResourceLinks() <em>Resource Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceLink> resourceLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceProviderAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.RESOURCE_PROVIDER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceBundles> getProvidedBundles() {
		if (providedBundles == null) {
			providedBundles = new EObjectContainmentEList<ResourceBundles>(ResourceBundles.class, this, LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES);
		}
		return providedBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getPossibleResourceProvisions() {
		if (possibleResourceProvisions == null) {
			possibleResourceProvisions = new EObjectResolvingEList<ResourceType>(ResourceType.class, this, LibraryPackage.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS);
		}
		return possibleResourceProvisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceGroup> getProvidedGroups() {
		if (providedGroups == null) {
			providedGroups = new EObjectContainmentEList<ResourceGroup>(ResourceGroup.class, this, LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS);
		}
		return providedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceLink> getResourceLinks() {
		if (resourceLinks == null) {
			resourceLinks = new EObjectContainmentEList<ResourceLink>(ResourceLink.class, this, LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS);
		}
		return resourceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES:
				return ((InternalEList<?>)getProvidedBundles()).basicRemove(otherEnd, msgs);
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS:
				return ((InternalEList<?>)getProvidedGroups()).basicRemove(otherEnd, msgs);
			case LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS:
				return ((InternalEList<?>)getResourceLinks()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES:
				return getProvidedBundles();
			case LibraryPackage.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS:
				return getPossibleResourceProvisions();
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS:
				return getProvidedGroups();
			case LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS:
				return getResourceLinks();
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
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES:
				getProvidedBundles().clear();
				getProvidedBundles().addAll((Collection<? extends ResourceBundles>)newValue);
				return;
			case LibraryPackage.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS:
				getPossibleResourceProvisions().clear();
				getPossibleResourceProvisions().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS:
				getProvidedGroups().clear();
				getProvidedGroups().addAll((Collection<? extends ResourceGroup>)newValue);
				return;
			case LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS:
				getResourceLinks().clear();
				getResourceLinks().addAll((Collection<? extends ResourceLink>)newValue);
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
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES:
				getProvidedBundles().clear();
				return;
			case LibraryPackage.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS:
				getPossibleResourceProvisions().clear();
				return;
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS:
				getProvidedGroups().clear();
				return;
			case LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS:
				getResourceLinks().clear();
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
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES:
				return providedBundles != null && !providedBundles.isEmpty();
			case LibraryPackage.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS:
				return possibleResourceProvisions != null && !possibleResourceProvisions.isEmpty();
			case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS:
				return providedGroups != null && !providedGroups.isEmpty();
			case LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS:
				return resourceLinks != null && !resourceLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceProviderAImpl
