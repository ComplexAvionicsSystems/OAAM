/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.DataTypeA;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.AttributeDefinition;
import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.DeviceTypeDissimilarity;
import de.oaam.model.oaam.library.DeviceTypeSymmetry;
import de.oaam.model.oaam.library.DuctType;
import de.oaam.model.oaam.library.LibraryContainerA;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.LocationType;
import de.oaam.model.oaam.library.PowerSource;
import de.oaam.model.oaam.library.ResourceBundle;
import de.oaam.model.oaam.library.ResourceType;
import de.oaam.model.oaam.library.ResourceTypeDissimilarity;
import de.oaam.model.oaam.library.ResourceTypeModifier;
import de.oaam.model.oaam.library.SignalType;
import de.oaam.model.oaam.library.Sublibrary;
import de.oaam.model.oaam.library.TaskType;
import de.oaam.model.oaam.library.TaskTypeDissimilarity;
import de.oaam.model.oaam.library.WireType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getResourceBundles <em>Resource Bundles</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getResourceModifiers <em>Resource Modifiers</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getResourceTypeDissimilarities <em>Resource Type Dissimilarities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getTaskTypes <em>Task Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getTaskTypeDissimilarity <em>Task Type Dissimilarity</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getSignalTypes <em>Signal Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getDeviceTypes <em>Device Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getDeviceTypeSymmetries <em>Device Type Symmetries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getDeviceTypeDissimilarities <em>Device Type Dissimilarities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getConnectionTypes <em>Connection Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getWireTypes <em>Wire Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getLocationTypes <em>Location Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getDuctTypes <em>Duct Types</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getGenericAttributes <em>Generic Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getPowerSources <em>Power Sources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.LibraryContainerAImpl#getSublibraries <em>Sublibraries</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LibraryContainerAImpl extends OaamBaseElementAImpl implements LibraryContainerA {
	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeA> dataTypes;

	/**
	 * The cached value of the '{@link #getResourceTypes() <em>Resource Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> resourceTypes;

	/**
	 * The cached value of the '{@link #getResourceBundles() <em>Resource Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceBundle> resourceBundles;

	/**
	 * The cached value of the '{@link #getResourceModifiers() <em>Resource Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceTypeModifier> resourceModifiers;

	/**
	 * The cached value of the '{@link #getResourceTypeDissimilarities() <em>Resource Type Dissimilarities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypeDissimilarities()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceTypeDissimilarity> resourceTypeDissimilarities;

	/**
	 * The cached value of the '{@link #getTaskTypes() <em>Task Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskType> taskTypes;

	/**
	 * The cached value of the '{@link #getTaskTypeDissimilarity() <em>Task Type Dissimilarity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTypeDissimilarity()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskTypeDissimilarity> taskTypeDissimilarity;

	/**
	 * The cached value of the '{@link #getSignalTypes() <em>Signal Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalType> signalTypes;

	/**
	 * The cached value of the '{@link #getDeviceTypes() <em>Device Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> deviceTypes;

	/**
	 * The cached value of the '{@link #getDeviceTypeSymmetries() <em>Device Type Symmetries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypeSymmetries()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceTypeSymmetry> deviceTypeSymmetries;

	/**
	 * The cached value of the '{@link #getDeviceTypeDissimilarities() <em>Device Type Dissimilarities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypeDissimilarities()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceTypeDissimilarity> deviceTypeDissimilarities;

	/**
	 * The cached value of the '{@link #getConnectionTypes() <em>Connection Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionType> connectionTypes;

	/**
	 * The cached value of the '{@link #getWireTypes() <em>Wire Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<WireType> wireTypes;

	/**
	 * The cached value of the '{@link #getLocationTypes() <em>Location Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> locationTypes;

	/**
	 * The cached value of the '{@link #getDuctTypes() <em>Duct Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuctTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DuctType> ductTypes;

	/**
	 * The cached value of the '{@link #getGenericAttributes() <em>Generic Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinition> genericAttributes;

	/**
	 * The cached value of the '{@link #getPowerSources() <em>Power Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSource> powerSources;

	/**
	 * The cached value of the '{@link #getSublibraries() <em>Sublibraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSublibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Sublibrary> sublibraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.LIBRARY_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeA> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataTypeA>(DataTypeA.class, this, LibraryPackage.LIBRARY_CONTAINER_A__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getResourceTypes() {
		if (resourceTypes == null) {
			resourceTypes = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPES);
		}
		return resourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceBundle> getResourceBundles() {
		if (resourceBundles == null) {
			resourceBundles = new EObjectContainmentEList<ResourceBundle>(ResourceBundle.class, this, LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_BUNDLES);
		}
		return resourceBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceTypeModifier> getResourceModifiers() {
		if (resourceModifiers == null) {
			resourceModifiers = new EObjectContainmentEList<ResourceTypeModifier>(ResourceTypeModifier.class, this, LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS);
		}
		return resourceModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceTypeDissimilarity> getResourceTypeDissimilarities() {
		if (resourceTypeDissimilarities == null) {
			resourceTypeDissimilarities = new EObjectContainmentEList<ResourceTypeDissimilarity>(ResourceTypeDissimilarity.class, this, LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES);
		}
		return resourceTypeDissimilarities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskType> getTaskTypes() {
		if (taskTypes == null) {
			taskTypes = new EObjectContainmentEList<TaskType>(TaskType.class, this, LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPES);
		}
		return taskTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskTypeDissimilarity> getTaskTypeDissimilarity() {
		if (taskTypeDissimilarity == null) {
			taskTypeDissimilarity = new EObjectContainmentEList<TaskTypeDissimilarity>(TaskTypeDissimilarity.class, this, LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY);
		}
		return taskTypeDissimilarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalType> getSignalTypes() {
		if (signalTypes == null) {
			signalTypes = new EObjectContainmentEList<SignalType>(SignalType.class, this, LibraryPackage.LIBRARY_CONTAINER_A__SIGNAL_TYPES);
		}
		return signalTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getDeviceTypes() {
		if (deviceTypes == null) {
			deviceTypes = new EObjectContainmentEList<DeviceType>(DeviceType.class, this, LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPES);
		}
		return deviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceTypeSymmetry> getDeviceTypeSymmetries() {
		if (deviceTypeSymmetries == null) {
			deviceTypeSymmetries = new EObjectContainmentEList<DeviceTypeSymmetry>(DeviceTypeSymmetry.class, this, LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES);
		}
		return deviceTypeSymmetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceTypeDissimilarity> getDeviceTypeDissimilarities() {
		if (deviceTypeDissimilarities == null) {
			deviceTypeDissimilarities = new EObjectContainmentEList<DeviceTypeDissimilarity>(DeviceTypeDissimilarity.class, this, LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES);
		}
		return deviceTypeDissimilarities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionType> getConnectionTypes() {
		if (connectionTypes == null) {
			connectionTypes = new EObjectContainmentEList<ConnectionType>(ConnectionType.class, this, LibraryPackage.LIBRARY_CONTAINER_A__CONNECTION_TYPES);
		}
		return connectionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireType> getWireTypes() {
		if (wireTypes == null) {
			wireTypes = new EObjectContainmentEList<WireType>(WireType.class, this, LibraryPackage.LIBRARY_CONTAINER_A__WIRE_TYPES);
		}
		return wireTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getLocationTypes() {
		if (locationTypes == null) {
			locationTypes = new EObjectContainmentEList<LocationType>(LocationType.class, this, LibraryPackage.LIBRARY_CONTAINER_A__LOCATION_TYPES);
		}
		return locationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DuctType> getDuctTypes() {
		if (ductTypes == null) {
			ductTypes = new EObjectContainmentEList<DuctType>(DuctType.class, this, LibraryPackage.LIBRARY_CONTAINER_A__DUCT_TYPES);
		}
		return ductTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinition> getGenericAttributes() {
		if (genericAttributes == null) {
			genericAttributes = new EObjectContainmentEList<AttributeDefinition>(AttributeDefinition.class, this, LibraryPackage.LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES);
		}
		return genericAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSource> getPowerSources() {
		if (powerSources == null) {
			powerSources = new EObjectContainmentEList<PowerSource>(PowerSource.class, this, LibraryPackage.LIBRARY_CONTAINER_A__POWER_SOURCES);
		}
		return powerSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sublibrary> getSublibraries() {
		if (sublibraries == null) {
			sublibraries = new EObjectContainmentEList<Sublibrary>(Sublibrary.class, this, LibraryPackage.LIBRARY_CONTAINER_A__SUBLIBRARIES);
		}
		return sublibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.LIBRARY_CONTAINER_A__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPES:
				return ((InternalEList<?>)getResourceTypes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_BUNDLES:
				return ((InternalEList<?>)getResourceBundles()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS:
				return ((InternalEList<?>)getResourceModifiers()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES:
				return ((InternalEList<?>)getResourceTypeDissimilarities()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPES:
				return ((InternalEList<?>)getTaskTypes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY:
				return ((InternalEList<?>)getTaskTypeDissimilarity()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__SIGNAL_TYPES:
				return ((InternalEList<?>)getSignalTypes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPES:
				return ((InternalEList<?>)getDeviceTypes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES:
				return ((InternalEList<?>)getDeviceTypeSymmetries()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES:
				return ((InternalEList<?>)getDeviceTypeDissimilarities()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__CONNECTION_TYPES:
				return ((InternalEList<?>)getConnectionTypes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__WIRE_TYPES:
				return ((InternalEList<?>)getWireTypes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__LOCATION_TYPES:
				return ((InternalEList<?>)getLocationTypes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__DUCT_TYPES:
				return ((InternalEList<?>)getDuctTypes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES:
				return ((InternalEList<?>)getGenericAttributes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__POWER_SOURCES:
				return ((InternalEList<?>)getPowerSources()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY_CONTAINER_A__SUBLIBRARIES:
				return ((InternalEList<?>)getSublibraries()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.LIBRARY_CONTAINER_A__DATA_TYPES:
				return getDataTypes();
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPES:
				return getResourceTypes();
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_BUNDLES:
				return getResourceBundles();
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS:
				return getResourceModifiers();
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES:
				return getResourceTypeDissimilarities();
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPES:
				return getTaskTypes();
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY:
				return getTaskTypeDissimilarity();
			case LibraryPackage.LIBRARY_CONTAINER_A__SIGNAL_TYPES:
				return getSignalTypes();
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPES:
				return getDeviceTypes();
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES:
				return getDeviceTypeSymmetries();
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES:
				return getDeviceTypeDissimilarities();
			case LibraryPackage.LIBRARY_CONTAINER_A__CONNECTION_TYPES:
				return getConnectionTypes();
			case LibraryPackage.LIBRARY_CONTAINER_A__WIRE_TYPES:
				return getWireTypes();
			case LibraryPackage.LIBRARY_CONTAINER_A__LOCATION_TYPES:
				return getLocationTypes();
			case LibraryPackage.LIBRARY_CONTAINER_A__DUCT_TYPES:
				return getDuctTypes();
			case LibraryPackage.LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES:
				return getGenericAttributes();
			case LibraryPackage.LIBRARY_CONTAINER_A__POWER_SOURCES:
				return getPowerSources();
			case LibraryPackage.LIBRARY_CONTAINER_A__SUBLIBRARIES:
				return getSublibraries();
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
			case LibraryPackage.LIBRARY_CONTAINER_A__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataTypeA>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPES:
				getResourceTypes().clear();
				getResourceTypes().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_BUNDLES:
				getResourceBundles().clear();
				getResourceBundles().addAll((Collection<? extends ResourceBundle>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS:
				getResourceModifiers().clear();
				getResourceModifiers().addAll((Collection<? extends ResourceTypeModifier>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES:
				getResourceTypeDissimilarities().clear();
				getResourceTypeDissimilarities().addAll((Collection<? extends ResourceTypeDissimilarity>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPES:
				getTaskTypes().clear();
				getTaskTypes().addAll((Collection<? extends TaskType>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY:
				getTaskTypeDissimilarity().clear();
				getTaskTypeDissimilarity().addAll((Collection<? extends TaskTypeDissimilarity>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__SIGNAL_TYPES:
				getSignalTypes().clear();
				getSignalTypes().addAll((Collection<? extends SignalType>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPES:
				getDeviceTypes().clear();
				getDeviceTypes().addAll((Collection<? extends DeviceType>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES:
				getDeviceTypeSymmetries().clear();
				getDeviceTypeSymmetries().addAll((Collection<? extends DeviceTypeSymmetry>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES:
				getDeviceTypeDissimilarities().clear();
				getDeviceTypeDissimilarities().addAll((Collection<? extends DeviceTypeDissimilarity>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__CONNECTION_TYPES:
				getConnectionTypes().clear();
				getConnectionTypes().addAll((Collection<? extends ConnectionType>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__WIRE_TYPES:
				getWireTypes().clear();
				getWireTypes().addAll((Collection<? extends WireType>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__LOCATION_TYPES:
				getLocationTypes().clear();
				getLocationTypes().addAll((Collection<? extends LocationType>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__DUCT_TYPES:
				getDuctTypes().clear();
				getDuctTypes().addAll((Collection<? extends DuctType>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES:
				getGenericAttributes().clear();
				getGenericAttributes().addAll((Collection<? extends AttributeDefinition>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__POWER_SOURCES:
				getPowerSources().clear();
				getPowerSources().addAll((Collection<? extends PowerSource>)newValue);
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__SUBLIBRARIES:
				getSublibraries().clear();
				getSublibraries().addAll((Collection<? extends Sublibrary>)newValue);
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
			case LibraryPackage.LIBRARY_CONTAINER_A__DATA_TYPES:
				getDataTypes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPES:
				getResourceTypes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_BUNDLES:
				getResourceBundles().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS:
				getResourceModifiers().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES:
				getResourceTypeDissimilarities().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPES:
				getTaskTypes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY:
				getTaskTypeDissimilarity().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__SIGNAL_TYPES:
				getSignalTypes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPES:
				getDeviceTypes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES:
				getDeviceTypeSymmetries().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES:
				getDeviceTypeDissimilarities().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__CONNECTION_TYPES:
				getConnectionTypes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__WIRE_TYPES:
				getWireTypes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__LOCATION_TYPES:
				getLocationTypes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__DUCT_TYPES:
				getDuctTypes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES:
				getGenericAttributes().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__POWER_SOURCES:
				getPowerSources().clear();
				return;
			case LibraryPackage.LIBRARY_CONTAINER_A__SUBLIBRARIES:
				getSublibraries().clear();
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
			case LibraryPackage.LIBRARY_CONTAINER_A__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPES:
				return resourceTypes != null && !resourceTypes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_BUNDLES:
				return resourceBundles != null && !resourceBundles.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS:
				return resourceModifiers != null && !resourceModifiers.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES:
				return resourceTypeDissimilarities != null && !resourceTypeDissimilarities.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPES:
				return taskTypes != null && !taskTypes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY:
				return taskTypeDissimilarity != null && !taskTypeDissimilarity.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__SIGNAL_TYPES:
				return signalTypes != null && !signalTypes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPES:
				return deviceTypes != null && !deviceTypes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES:
				return deviceTypeSymmetries != null && !deviceTypeSymmetries.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES:
				return deviceTypeDissimilarities != null && !deviceTypeDissimilarities.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__CONNECTION_TYPES:
				return connectionTypes != null && !connectionTypes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__WIRE_TYPES:
				return wireTypes != null && !wireTypes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__LOCATION_TYPES:
				return locationTypes != null && !locationTypes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__DUCT_TYPES:
				return ductTypes != null && !ductTypes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES:
				return genericAttributes != null && !genericAttributes.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__POWER_SOURCES:
				return powerSources != null && !powerSources.isEmpty();
			case LibraryPackage.LIBRARY_CONTAINER_A__SUBLIBRARIES:
				return sublibraries != null && !sublibraries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibraryContainerAImpl
