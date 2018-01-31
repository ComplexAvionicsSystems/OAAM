/**
 */
package de.oaam.model.oaam.capabilities.impl;

import de.oaam.model.oaam.capabilities.CapabilitiesPackage;
import de.oaam.model.oaam.capabilities.ResourceConsumption;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.library.Resource;
import de.oaam.model.oaam.library.ResourceType;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Consumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.ResourceConsumptionImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.ResourceConsumptionImpl#getOriginalResource <em>Original Resource</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.ResourceConsumptionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceConsumptionImpl extends ElementAImpl implements ResourceConsumption {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final double COUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected double count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOriginalResource() <em>Original Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> originalResource;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceConsumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilitiesPackage.Literals.RESOURCE_CONSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(double newCount) {
		double oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.RESOURCE_CONSUMPTION__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getOriginalResource() {
		if (originalResource == null) {
			originalResource = new EObjectResolvingEList<Resource>(Resource.class, this, CapabilitiesPackage.RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE);
		}
		return originalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ResourceType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapabilitiesPackage.RESOURCE_CONSUMPTION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ResourceType newType) {
		ResourceType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.RESOURCE_CONSUMPTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__COUNT:
				return getCount();
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE:
				return getOriginalResource();
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__COUNT:
				setCount((Double)newValue);
				return;
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE:
				getOriginalResource().clear();
				getOriginalResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__TYPE:
				setType((ResourceType)newValue);
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
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE:
				getOriginalResource().clear();
				return;
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__TYPE:
				setType((ResourceType)null);
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
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__COUNT:
				return count != COUNT_EDEFAULT;
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE:
				return originalResource != null && !originalResource.isEmpty();
			case CapabilitiesPackage.RESOURCE_CONSUMPTION__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //ResourceConsumptionImpl
