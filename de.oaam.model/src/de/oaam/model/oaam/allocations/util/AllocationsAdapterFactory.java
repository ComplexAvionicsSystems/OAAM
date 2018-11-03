/**
 */
package de.oaam.model.oaam.allocations.util;

import de.oaam.model.oaam.allocations.*;
import de.oaam.model.oaam.common.OaamBaseElementA;
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
 * @see de.oaam.model.oaam.allocations.AllocationsPackage
 * @generated
 */
public class AllocationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AllocationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AllocationsPackage.eINSTANCE;
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
	protected AllocationsSwitch<Adapter> modelSwitch =
		new AllocationsSwitch<Adapter>() {
			@Override
			public Adapter caseAllocationsContainerA(AllocationsContainerA object) {
				return createAllocationsContainerAAdapter();
			}
			@Override
			public Adapter caseTaskAssignment(TaskAssignment object) {
				return createTaskAssignmentAdapter();
			}
			@Override
			public Adapter caseSignalAssignment(SignalAssignment object) {
				return createSignalAssignmentAdapter();
			}
			@Override
			public Adapter caseConnectionAssignment(ConnectionAssignment object) {
				return createConnectionAssignmentAdapter();
			}
			@Override
			public Adapter caseSignalAssignmentSegment(SignalAssignmentSegment object) {
				return createSignalAssignmentSegmentAdapter();
			}
			@Override
			public Adapter caseDeviceAssignment(DeviceAssignment object) {
				return createDeviceAssignmentAdapter();
			}
			@Override
			public Adapter caseConnectionAssignmentSegment(ConnectionAssignmentSegment object) {
				return createConnectionAssignmentSegmentAdapter();
			}
			@Override
			public Adapter caseSubdeviceAssignment(SubdeviceAssignment object) {
				return createSubdeviceAssignmentAdapter();
			}
			@Override
			public Adapter caseSubconnectionAssignment(SubconnectionAssignment object) {
				return createSubconnectionAssignmentAdapter();
			}
			@Override
			public Adapter caseAllocations(Allocations object) {
				return createAllocationsAdapter();
			}
			@Override
			public Adapter caseSuballocations(Suballocations object) {
				return createSuballocationsAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseScheduledTime(ScheduledTime object) {
				return createScheduledTimeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.AllocationsContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.AllocationsContainerA
	 * @generated
	 */
	public Adapter createAllocationsContainerAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.TaskAssignment <em>Task Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.TaskAssignment
	 * @generated
	 */
	public Adapter createTaskAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.SignalAssignment <em>Signal Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.SignalAssignment
	 * @generated
	 */
	public Adapter createSignalAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.ConnectionAssignment <em>Connection Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.ConnectionAssignment
	 * @generated
	 */
	public Adapter createConnectionAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment <em>Signal Assignment Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.SignalAssignmentSegment
	 * @generated
	 */
	public Adapter createSignalAssignmentSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.DeviceAssignment <em>Device Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.DeviceAssignment
	 * @generated
	 */
	public Adapter createDeviceAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.ConnectionAssignmentSegment <em>Connection Assignment Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.ConnectionAssignmentSegment
	 * @generated
	 */
	public Adapter createConnectionAssignmentSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.SubdeviceAssignment <em>Subdevice Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.SubdeviceAssignment
	 * @generated
	 */
	public Adapter createSubdeviceAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.SubconnectionAssignment <em>Subconnection Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.SubconnectionAssignment
	 * @generated
	 */
	public Adapter createSubconnectionAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.Allocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.Allocations
	 * @generated
	 */
	public Adapter createAllocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.Suballocations <em>Suballocations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.Suballocations
	 * @generated
	 */
	public Adapter createSuballocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.Schedule
	 * @generated
	 */
	public Adapter createScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.allocations.ScheduledTime <em>Scheduled Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.allocations.ScheduledTime
	 * @generated
	 */
	public Adapter createScheduledTimeAdapter() {
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

} //AllocationsAdapterFactory
