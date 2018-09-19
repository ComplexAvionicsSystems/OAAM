/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.restrictions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestrictionsFactoryImpl extends EFactoryImpl implements RestrictionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestrictionsFactory init() {
		try {
			RestrictionsFactory theRestrictionsFactory = (RestrictionsFactory)EPackage.Registry.INSTANCE.getEFactory(RestrictionsPackage.eNS_URI);
			if (theRestrictionsFactory != null) {
				return theRestrictionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestrictionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RestrictionsPackage.RESTRICTIONS: return createRestrictions();
			case RestrictionsPackage.LOCATION_RESTRICTION: return createLocationRestriction();
			case RestrictionsPackage.AREA_RESTRICTION: return createAreaRestriction();
			case RestrictionsPackage.POWER_SOURCE_RESTRICTION: return createPowerSourceRestriction();
			case RestrictionsPackage.DEVICE_RESTRICTION: return createDeviceRestriction();
			case RestrictionsPackage.DEVICE_TYPE_RESTRICTION: return createDeviceTypeRestriction();
			case RestrictionsPackage.CONECTION_TYPE_RESTRICTION: return createConectionTypeRestriction();
			case RestrictionsPackage.CONNECTION_RESTRICTION: return createConnectionRestriction();
			case RestrictionsPackage.SEGREGATION_RESTRICTION: return createSegregationRestriction();
			case RestrictionsPackage.SYNCHRONICITY_RESTRICTION: return createSynchronicityRestriction();
			case RestrictionsPackage.TASK_ATOMIC_RESTRICTION: return createTaskAtomicRestriction();
			case RestrictionsPackage.TASK_SYMMETRY_RESTRICTION: return createTaskSymmetryRestriction();
			case RestrictionsPackage.TIME_DELAY_RESTRICTION: return createTimeDelayRestriction();
			case RestrictionsPackage.SUBRESTRICTIONS: return createSubrestrictions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RestrictionsPackage.SYMMETRY_TYPES_E:
				return createSymmetryTypesEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RestrictionsPackage.SYMMETRY_TYPES_E:
				return convertSymmetryTypesEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restrictions createRestrictions() {
		RestrictionsImpl restrictions = new RestrictionsImpl();
		return restrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationRestriction createLocationRestriction() {
		LocationRestrictionImpl locationRestriction = new LocationRestrictionImpl();
		return locationRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaRestriction createAreaRestriction() {
		AreaRestrictionImpl areaRestriction = new AreaRestrictionImpl();
		return areaRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSourceRestriction createPowerSourceRestriction() {
		PowerSourceRestrictionImpl powerSourceRestriction = new PowerSourceRestrictionImpl();
		return powerSourceRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRestriction createDeviceRestriction() {
		DeviceRestrictionImpl deviceRestriction = new DeviceRestrictionImpl();
		return deviceRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTypeRestriction createDeviceTypeRestriction() {
		DeviceTypeRestrictionImpl deviceTypeRestriction = new DeviceTypeRestrictionImpl();
		return deviceTypeRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConectionTypeRestriction createConectionTypeRestriction() {
		ConectionTypeRestrictionImpl conectionTypeRestriction = new ConectionTypeRestrictionImpl();
		return conectionTypeRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionRestriction createConnectionRestriction() {
		ConnectionRestrictionImpl connectionRestriction = new ConnectionRestrictionImpl();
		return connectionRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegregationRestriction createSegregationRestriction() {
		SegregationRestrictionImpl segregationRestriction = new SegregationRestrictionImpl();
		return segregationRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronicityRestriction createSynchronicityRestriction() {
		SynchronicityRestrictionImpl synchronicityRestriction = new SynchronicityRestrictionImpl();
		return synchronicityRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAtomicRestriction createTaskAtomicRestriction() {
		TaskAtomicRestrictionImpl taskAtomicRestriction = new TaskAtomicRestrictionImpl();
		return taskAtomicRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSymmetryRestriction createTaskSymmetryRestriction() {
		TaskSymmetryRestrictionImpl taskSymmetryRestriction = new TaskSymmetryRestrictionImpl();
		return taskSymmetryRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDelayRestriction createTimeDelayRestriction() {
		TimeDelayRestrictionImpl timeDelayRestriction = new TimeDelayRestrictionImpl();
		return timeDelayRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subrestrictions createSubrestrictions() {
		SubrestrictionsImpl subrestrictions = new SubrestrictionsImpl();
		return subrestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryTypesE createSymmetryTypesEFromString(EDataType eDataType, String initialValue) {
		SymmetryTypesE result = SymmetryTypesE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypesEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsPackage getRestrictionsPackage() {
		return (RestrictionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RestrictionsPackage getPackage() {
		return RestrictionsPackage.eINSTANCE;
	}

} //RestrictionsFactoryImpl
