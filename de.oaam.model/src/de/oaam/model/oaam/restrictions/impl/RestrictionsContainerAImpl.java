/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.restrictions.AreaRestriction;
import de.oaam.model.oaam.restrictions.ConectionTypeRestriction;
import de.oaam.model.oaam.restrictions.ConnectionRestriction;
import de.oaam.model.oaam.restrictions.DeviceRestriction;
import de.oaam.model.oaam.restrictions.DeviceTypeRestriction;
import de.oaam.model.oaam.restrictions.LocationRestriction;
import de.oaam.model.oaam.restrictions.PowerSourceRestriction;
import de.oaam.model.oaam.restrictions.RestrictionsContainerA;
import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.SegregationRestriction;
import de.oaam.model.oaam.restrictions.Subrestrictions;
import de.oaam.model.oaam.restrictions.SynchronicityRestriction;
import de.oaam.model.oaam.restrictions.TaskAtomicRestriction;
import de.oaam.model.oaam.restrictions.TaskSymmetryRestriction;

import de.oaam.model.oaam.restrictions.TimeDelayRestriction;
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
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getDeviceTypeRestrictions <em>Device Type Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getDeviceRestrictions <em>Device Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getLocationRestrictions <em>Location Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getAreaRestrictions <em>Area Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getPowerSourceRestrictions <em>Power Source Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getTaskAtomicRestrictions <em>Task Atomic Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getTaskSymmetryRestrictions <em>Task Symmetry Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getInputSynchronicityRestriction <em>Input Synchronicity Restriction</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getConnectionRestrictions <em>Connection Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getConnectionTypeRestrictions <em>Connection Type Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getSegregationsRestrictions <em>Segregations Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getSubrestrictions <em>Subrestrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.RestrictionsContainerAImpl#getTimedelayrestrictions <em>Timedelayrestrictions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RestrictionsContainerAImpl extends ElementAImpl implements RestrictionsContainerA {
	/**
	 * The cached value of the '{@link #getDeviceTypeRestrictions() <em>Device Type Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypeRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceTypeRestriction> deviceTypeRestrictions;

	/**
	 * The cached value of the '{@link #getDeviceRestrictions() <em>Device Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceRestriction> deviceRestrictions;

	/**
	 * The cached value of the '{@link #getLocationRestrictions() <em>Location Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationRestriction> locationRestrictions;

	/**
	 * The cached value of the '{@link #getAreaRestrictions() <em>Area Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<AreaRestriction> areaRestrictions;

	/**
	 * The cached value of the '{@link #getPowerSourceRestrictions() <em>Power Source Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSourceRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSourceRestriction> powerSourceRestrictions;

	/**
	 * The cached value of the '{@link #getTaskAtomicRestrictions() <em>Task Atomic Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskAtomicRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskAtomicRestriction> taskAtomicRestrictions;

	/**
	 * The cached value of the '{@link #getTaskSymmetryRestrictions() <em>Task Symmetry Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSymmetryRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskSymmetryRestriction> taskSymmetryRestrictions;

	/**
	 * The cached value of the '{@link #getInputSynchronicityRestriction() <em>Input Synchronicity Restriction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSynchronicityRestriction()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronicityRestriction> inputSynchronicityRestriction;

	/**
	 * The cached value of the '{@link #getConnectionRestrictions() <em>Connection Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionRestriction> connectionRestrictions;

	/**
	 * The cached value of the '{@link #getConnectionTypeRestrictions() <em>Connection Type Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTypeRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConectionTypeRestriction> connectionTypeRestrictions;

	/**
	 * The cached value of the '{@link #getSegregationsRestrictions() <em>Segregations Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegregationsRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<SegregationRestriction> segregationsRestrictions;

	/**
	 * The cached value of the '{@link #getSubrestrictions() <em>Subrestrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subrestrictions> subrestrictions;

	/**
	 * The cached value of the '{@link #getTimedelayrestrictions() <em>Timedelayrestrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimedelayrestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeDelayRestriction> timedelayrestrictions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionsContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceTypeRestriction> getDeviceTypeRestrictions() {
		if (deviceTypeRestrictions == null) {
			deviceTypeRestrictions = new EObjectContainmentEList<DeviceTypeRestriction>(DeviceTypeRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS);
		}
		return deviceTypeRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceRestriction> getDeviceRestrictions() {
		if (deviceRestrictions == null) {
			deviceRestrictions = new EObjectContainmentEList<DeviceRestriction>(DeviceRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS);
		}
		return deviceRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationRestriction> getLocationRestrictions() {
		if (locationRestrictions == null) {
			locationRestrictions = new EObjectContainmentEList<LocationRestriction>(LocationRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS);
		}
		return locationRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AreaRestriction> getAreaRestrictions() {
		if (areaRestrictions == null) {
			areaRestrictions = new EObjectContainmentEList<AreaRestriction>(AreaRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS);
		}
		return areaRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSourceRestriction> getPowerSourceRestrictions() {
		if (powerSourceRestrictions == null) {
			powerSourceRestrictions = new EObjectContainmentEList<PowerSourceRestriction>(PowerSourceRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS);
		}
		return powerSourceRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskAtomicRestriction> getTaskAtomicRestrictions() {
		if (taskAtomicRestrictions == null) {
			taskAtomicRestrictions = new EObjectContainmentEList<TaskAtomicRestriction>(TaskAtomicRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS);
		}
		return taskAtomicRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskSymmetryRestriction> getTaskSymmetryRestrictions() {
		if (taskSymmetryRestrictions == null) {
			taskSymmetryRestrictions = new EObjectContainmentEList<TaskSymmetryRestriction>(TaskSymmetryRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS);
		}
		return taskSymmetryRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronicityRestriction> getInputSynchronicityRestriction() {
		if (inputSynchronicityRestriction == null) {
			inputSynchronicityRestriction = new EObjectContainmentEList<SynchronicityRestriction>(SynchronicityRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION);
		}
		return inputSynchronicityRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionRestriction> getConnectionRestrictions() {
		if (connectionRestrictions == null) {
			connectionRestrictions = new EObjectContainmentEList<ConnectionRestriction>(ConnectionRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS);
		}
		return connectionRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConectionTypeRestriction> getConnectionTypeRestrictions() {
		if (connectionTypeRestrictions == null) {
			connectionTypeRestrictions = new EObjectContainmentEList<ConectionTypeRestriction>(ConectionTypeRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS);
		}
		return connectionTypeRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SegregationRestriction> getSegregationsRestrictions() {
		if (segregationsRestrictions == null) {
			segregationsRestrictions = new EObjectContainmentEList<SegregationRestriction>(SegregationRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS);
		}
		return segregationsRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subrestrictions> getSubrestrictions() {
		if (subrestrictions == null) {
			subrestrictions = new EObjectContainmentEList<Subrestrictions>(Subrestrictions.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS);
		}
		return subrestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeDelayRestriction> getTimedelayrestrictions() {
		if (timedelayrestrictions == null) {
			timedelayrestrictions = new EObjectContainmentEList<TimeDelayRestriction>(TimeDelayRestriction.class, this, RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TIMEDELAYRESTRICTIONS);
		}
		return timedelayrestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS:
				return ((InternalEList<?>)getDeviceTypeRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS:
				return ((InternalEList<?>)getDeviceRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS:
				return ((InternalEList<?>)getLocationRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS:
				return ((InternalEList<?>)getAreaRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS:
				return ((InternalEList<?>)getPowerSourceRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS:
				return ((InternalEList<?>)getTaskAtomicRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS:
				return ((InternalEList<?>)getTaskSymmetryRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION:
				return ((InternalEList<?>)getInputSynchronicityRestriction()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS:
				return ((InternalEList<?>)getConnectionRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS:
				return ((InternalEList<?>)getConnectionTypeRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS:
				return ((InternalEList<?>)getSegregationsRestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS:
				return ((InternalEList<?>)getSubrestrictions()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TIMEDELAYRESTRICTIONS:
				return ((InternalEList<?>)getTimedelayrestrictions()).basicRemove(otherEnd, msgs);
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
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS:
				return getDeviceTypeRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS:
				return getDeviceRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS:
				return getLocationRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS:
				return getAreaRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS:
				return getPowerSourceRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS:
				return getTaskAtomicRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS:
				return getTaskSymmetryRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION:
				return getInputSynchronicityRestriction();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS:
				return getConnectionRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS:
				return getConnectionTypeRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS:
				return getSegregationsRestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS:
				return getSubrestrictions();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TIMEDELAYRESTRICTIONS:
				return getTimedelayrestrictions();
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
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS:
				getDeviceTypeRestrictions().clear();
				getDeviceTypeRestrictions().addAll((Collection<? extends DeviceTypeRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS:
				getDeviceRestrictions().clear();
				getDeviceRestrictions().addAll((Collection<? extends DeviceRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS:
				getLocationRestrictions().clear();
				getLocationRestrictions().addAll((Collection<? extends LocationRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS:
				getAreaRestrictions().clear();
				getAreaRestrictions().addAll((Collection<? extends AreaRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS:
				getPowerSourceRestrictions().clear();
				getPowerSourceRestrictions().addAll((Collection<? extends PowerSourceRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS:
				getTaskAtomicRestrictions().clear();
				getTaskAtomicRestrictions().addAll((Collection<? extends TaskAtomicRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS:
				getTaskSymmetryRestrictions().clear();
				getTaskSymmetryRestrictions().addAll((Collection<? extends TaskSymmetryRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION:
				getInputSynchronicityRestriction().clear();
				getInputSynchronicityRestriction().addAll((Collection<? extends SynchronicityRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS:
				getConnectionRestrictions().clear();
				getConnectionRestrictions().addAll((Collection<? extends ConnectionRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS:
				getConnectionTypeRestrictions().clear();
				getConnectionTypeRestrictions().addAll((Collection<? extends ConectionTypeRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS:
				getSegregationsRestrictions().clear();
				getSegregationsRestrictions().addAll((Collection<? extends SegregationRestriction>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS:
				getSubrestrictions().clear();
				getSubrestrictions().addAll((Collection<? extends Subrestrictions>)newValue);
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TIMEDELAYRESTRICTIONS:
				getTimedelayrestrictions().clear();
				getTimedelayrestrictions().addAll((Collection<? extends TimeDelayRestriction>)newValue);
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
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS:
				getDeviceTypeRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS:
				getDeviceRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS:
				getLocationRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS:
				getAreaRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS:
				getPowerSourceRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS:
				getTaskAtomicRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS:
				getTaskSymmetryRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION:
				getInputSynchronicityRestriction().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS:
				getConnectionRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS:
				getConnectionTypeRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS:
				getSegregationsRestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS:
				getSubrestrictions().clear();
				return;
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TIMEDELAYRESTRICTIONS:
				getTimedelayrestrictions().clear();
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
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS:
				return deviceTypeRestrictions != null && !deviceTypeRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS:
				return deviceRestrictions != null && !deviceRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS:
				return locationRestrictions != null && !locationRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS:
				return areaRestrictions != null && !areaRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS:
				return powerSourceRestrictions != null && !powerSourceRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS:
				return taskAtomicRestrictions != null && !taskAtomicRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS:
				return taskSymmetryRestrictions != null && !taskSymmetryRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION:
				return inputSynchronicityRestriction != null && !inputSynchronicityRestriction.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS:
				return connectionRestrictions != null && !connectionRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS:
				return connectionTypeRestrictions != null && !connectionTypeRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS:
				return segregationsRestrictions != null && !segregationsRestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS:
				return subrestrictions != null && !subrestrictions.isEmpty();
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TIMEDELAYRESTRICTIONS:
				return timedelayrestrictions != null && !timedelayrestrictions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RestrictionsContainerAImpl
