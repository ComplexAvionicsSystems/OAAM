/**
 */
package de.oaam.model.oaam.restrictions.util;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.restrictions.*;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage
 * @generated
 */
public class RestrictionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestrictionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RestrictionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionsSwitch<Adapter> modelSwitch =
		new RestrictionsSwitch<Adapter>() {
			@Override
			public Adapter caseRestrictionsContainerA(RestrictionsContainerA object) {
				return createRestrictionsContainerAAdapter();
			}
			@Override
			public Adapter caseRestrictions(Restrictions object) {
				return createRestrictionsAdapter();
			}
			@Override
			public Adapter caseDeviceRestrictionA(DeviceRestrictionA object) {
				return createDeviceRestrictionAAdapter();
			}
			@Override
			public Adapter caseConnectionRestrinctionA(ConnectionRestrinctionA object) {
				return createConnectionRestrinctionAAdapter();
			}
			@Override
			public Adapter caseTaskRestrictionA(TaskRestrictionA object) {
				return createTaskRestrictionAAdapter();
			}
			@Override
			public Adapter caseSignalRestrictionA(SignalRestrictionA object) {
				return createSignalRestrictionAAdapter();
			}
			@Override
			public Adapter caseSubfunctionRestrictionA(SubfunctionRestrictionA object) {
				return createSubfunctionRestrictionAAdapter();
			}
			@Override
			public Adapter caseTaskGroupRestrictionA(TaskGroupRestrictionA object) {
				return createTaskGroupRestrictionAAdapter();
			}
			@Override
			public Adapter caseSignalGroupRestrictionA(SignalGroupRestrictionA object) {
				return createSignalGroupRestrictionAAdapter();
			}
			@Override
			public Adapter caseLocationRestriction(LocationRestriction object) {
				return createLocationRestrictionAdapter();
			}
			@Override
			public Adapter caseAreaRestriction(AreaRestriction object) {
				return createAreaRestrictionAdapter();
			}
			@Override
			public Adapter casePowerSourceRestriction(PowerSourceRestriction object) {
				return createPowerSourceRestrictionAdapter();
			}
			@Override
			public Adapter caseDeviceRestriction(DeviceRestriction object) {
				return createDeviceRestrictionAdapter();
			}
			@Override
			public Adapter caseDeviceTypeRestriction(DeviceTypeRestriction object) {
				return createDeviceTypeRestrictionAdapter();
			}
			@Override
			public Adapter caseConnectionTypeRestriction(ConnectionTypeRestriction object) {
				return createConnectionTypeRestrictionAdapter();
			}
			@Override
			public Adapter caseConnectionRestriction(ConnectionRestriction object) {
				return createConnectionRestrictionAdapter();
			}
			@Override
			public Adapter caseSegregationRestriction(SegregationRestriction object) {
				return createSegregationRestrictionAdapter();
			}
			@Override
			public Adapter caseSynchronicityRestriction(SynchronicityRestriction object) {
				return createSynchronicityRestrictionAdapter();
			}
			@Override
			public Adapter caseTaskAtomicRestriction(TaskAtomicRestriction object) {
				return createTaskAtomicRestrictionAdapter();
			}
			@Override
			public Adapter caseTaskSymmetryRestriction(TaskSymmetryRestriction object) {
				return createTaskSymmetryRestrictionAdapter();
			}
			@Override
			public Adapter caseTimeDelayRestriction(TimeDelayRestriction object) {
				return createTimeDelayRestrictionAdapter();
			}
			@Override
			public Adapter caseSubrestrictions(Subrestrictions object) {
				return createSubrestrictionsAdapter();
			}
			@Override
			public Adapter caseOaamBaseElementA(OaamBaseElementA object) {
				return createOaamBaseElementAAdapter();
			}
			@Override
			public Adapter caseVariantDependentElementA(VariantDependentElementA object) {
				return createVariantDependentElementAAdapter();
			}
			@Override
			public Adapter caseModeDependentElementA(ModeDependentElementA object) {
				return createModeDependentElementAAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.RestrictionsContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsContainerA
	 * @generated
	 */
	public Adapter createRestrictionsContainerAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.Restrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.Restrictions
	 * @generated
	 */
	public Adapter createRestrictionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.DeviceRestrictionA <em>Device Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.DeviceRestrictionA
	 * @generated
	 */
	public Adapter createDeviceRestrictionAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.ConnectionRestrinctionA <em>Connection Restrinction A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.ConnectionRestrinctionA
	 * @generated
	 */
	public Adapter createConnectionRestrinctionAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.TaskRestrictionA <em>Task Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.TaskRestrictionA
	 * @generated
	 */
	public Adapter createTaskRestrictionAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.SignalRestrictionA <em>Signal Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.SignalRestrictionA
	 * @generated
	 */
	public Adapter createSignalRestrictionAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.SubfunctionRestrictionA <em>Subfunction Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.SubfunctionRestrictionA
	 * @generated
	 */
	public Adapter createSubfunctionRestrictionAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.TaskGroupRestrictionA <em>Task Group Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.TaskGroupRestrictionA
	 * @generated
	 */
	public Adapter createTaskGroupRestrictionAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.SignalGroupRestrictionA <em>Signal Group Restriction A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.SignalGroupRestrictionA
	 * @generated
	 */
	public Adapter createSignalGroupRestrictionAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.LocationRestriction <em>Location Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.LocationRestriction
	 * @generated
	 */
	public Adapter createLocationRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.AreaRestriction <em>Area Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.AreaRestriction
	 * @generated
	 */
	public Adapter createAreaRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.PowerSourceRestriction <em>Power Source Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.PowerSourceRestriction
	 * @generated
	 */
	public Adapter createPowerSourceRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.DeviceRestriction <em>Device Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.DeviceRestriction
	 * @generated
	 */
	public Adapter createDeviceRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.DeviceTypeRestriction <em>Device Type Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.DeviceTypeRestriction
	 * @generated
	 */
	public Adapter createDeviceTypeRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.ConnectionTypeRestriction <em>Connection Type Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.ConnectionTypeRestriction
	 * @generated
	 */
	public Adapter createConnectionTypeRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.ConnectionRestriction <em>Connection Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.ConnectionRestriction
	 * @generated
	 */
	public Adapter createConnectionRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.SegregationRestriction <em>Segregation Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.SegregationRestriction
	 * @generated
	 */
	public Adapter createSegregationRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.SynchronicityRestriction <em>Synchronicity Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.SynchronicityRestriction
	 * @generated
	 */
	public Adapter createSynchronicityRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.TaskAtomicRestriction <em>Task Atomic Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.TaskAtomicRestriction
	 * @generated
	 */
	public Adapter createTaskAtomicRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.TaskSymmetryRestriction <em>Task Symmetry Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.TaskSymmetryRestriction
	 * @generated
	 */
	public Adapter createTaskSymmetryRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.TimeDelayRestriction <em>Time Delay Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.TimeDelayRestriction
	 * @generated
	 */
	public Adapter createTimeDelayRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.restrictions.Subrestrictions <em>Subrestrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.restrictions.Subrestrictions
	 * @generated
	 */
	public Adapter createSubrestrictionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.common.OaamBaseElementA <em>Oaam Base Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA
	 * @generated
	 */
	public Adapter createOaamBaseElementAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.scenario.VariantDependentElementA <em>Variant Dependent Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.scenario.VariantDependentElementA
	 * @generated
	 */
	public Adapter createVariantDependentElementAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.scenario.ModeDependentElementA <em>Mode Dependent Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.scenario.ModeDependentElementA
	 * @generated
	 */
	public Adapter createModeDependentElementAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RestrictionsAdapterFactory
