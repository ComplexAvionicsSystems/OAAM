/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.ResourceType;
import de.oaam.model.oaam.library.ResourceTypeDissimilarity;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type Dissimilarity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceTypeDissimilarityImpl#getResourceTypes <em>Resource Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeDissimilarityImpl extends OaamBaseElementAImpl implements ResourceTypeDissimilarity {
	/**
	 * The cached value of the '{@link #getResourceTypes() <em>Resource Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> resourceTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeDissimilarityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.RESOURCE_TYPE_DISSIMILARITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getResourceTypes() {
		if (resourceTypes == null) {
			resourceTypes = new EObjectResolvingEList<ResourceType>(ResourceType.class, this, LibraryPackage.RESOURCE_TYPE_DISSIMILARITY__RESOURCE_TYPES);
		}
		return resourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.RESOURCE_TYPE_DISSIMILARITY__RESOURCE_TYPES:
				return getResourceTypes();
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
			case LibraryPackage.RESOURCE_TYPE_DISSIMILARITY__RESOURCE_TYPES:
				getResourceTypes().clear();
				getResourceTypes().addAll((Collection<? extends ResourceType>)newValue);
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
			case LibraryPackage.RESOURCE_TYPE_DISSIMILARITY__RESOURCE_TYPES:
				getResourceTypes().clear();
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
			case LibraryPackage.RESOURCE_TYPE_DISSIMILARITY__RESOURCE_TYPES:
				return resourceTypes != null && !resourceTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceTypeDissimilarityImpl
