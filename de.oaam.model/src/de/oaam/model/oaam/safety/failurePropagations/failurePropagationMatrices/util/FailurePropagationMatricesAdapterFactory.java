/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.PropagatorA;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage
 * @generated
 */
public class FailurePropagationMatricesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FailurePropagationMatricesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationMatricesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FailurePropagationMatricesPackage.eINSTANCE;
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
	protected FailurePropagationMatricesSwitch<Adapter> modelSwitch =
		new FailurePropagationMatricesSwitch<Adapter>() {
			@Override
			public Adapter caseFailurePropagationMatrixA(FailurePropagationMatrixA object) {
				return createFailurePropagationMatrixAAdapter();
			}
			@Override
			public Adapter caseFailureModeMatrix(FailureModeMatrix object) {
				return createFailureModeMatrixAdapter();
			}
			@Override
			public Adapter caseIntegrityStateMatrix(IntegrityStateMatrix object) {
				return createIntegrityStateMatrixAdapter();
			}
			@Override
			public Adapter caseBooleanMatrix(BooleanMatrix object) {
				return createBooleanMatrixAdapter();
			}
			@Override
			public Adapter caseFailureModeInport(FailureModeInport object) {
				return createFailureModeInportAdapter();
			}
			@Override
			public Adapter caseFailureModeOutport(FailureModeOutport object) {
				return createFailureModeOutportAdapter();
			}
			@Override
			public Adapter caseFailureModeMatrixRow(FailureModeMatrixRow object) {
				return createFailureModeMatrixRowAdapter();
			}
			@Override
			public Adapter caseFailureModeInportEntry(FailureModeInportEntry object) {
				return createFailureModeInportEntryAdapter();
			}
			@Override
			public Adapter caseFailureModeOutportEntry(FailureModeOutportEntry object) {
				return createFailureModeOutportEntryAdapter();
			}
			@Override
			public Adapter caseIntegrityStateOutport(IntegrityStateOutport object) {
				return createIntegrityStateOutportAdapter();
			}
			@Override
			public Adapter caseIntegrityStateInport(IntegrityStateInport object) {
				return createIntegrityStateInportAdapter();
			}
			@Override
			public Adapter caseIntegrityStateMatrixRow(IntegrityStateMatrixRow object) {
				return createIntegrityStateMatrixRowAdapter();
			}
			@Override
			public Adapter caseIntegrityStateInportEntry(IntegrityStateInportEntry object) {
				return createIntegrityStateInportEntryAdapter();
			}
			@Override
			public Adapter caseIntegrityStateOutportEntry(IntegrityStateOutportEntry object) {
				return createIntegrityStateOutportEntryAdapter();
			}
			@Override
			public Adapter caseBooleanInport(BooleanInport object) {
				return createBooleanInportAdapter();
			}
			@Override
			public Adapter caseBooleanOutport(BooleanOutport object) {
				return createBooleanOutportAdapter();
			}
			@Override
			public Adapter caseBooleanMatrixRow(BooleanMatrixRow object) {
				return createBooleanMatrixRowAdapter();
			}
			@Override
			public Adapter caseBooleanInportEntry(BooleanInportEntry object) {
				return createBooleanInportEntryAdapter();
			}
			@Override
			public Adapter caseBooleanOutportEntry(BooleanOutportEntry object) {
				return createBooleanOutportEntryAdapter();
			}
			@Override
			public Adapter casePropagatorA(PropagatorA object) {
				return createPropagatorAAdapter();
			}
			@Override
			public Adapter caseOaamBaseElementA(OaamBaseElementA object) {
				return createOaamBaseElementAAdapter();
			}
			@Override
			public Adapter caseFailureModePropagatorA(FailureModePropagatorA object) {
				return createFailureModePropagatorAAdapter();
			}
			@Override
			public Adapter caseIntegrityStatePropagatorA(IntegrityStatePropagatorA object) {
				return createIntegrityStatePropagatorAAdapter();
			}
			@Override
			public Adapter caseBooleanPropagatorA(BooleanPropagatorA object) {
				return createBooleanPropagatorAAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatrixA <em>Failure Propagation Matrix A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatrixA
	 * @generated
	 */
	public Adapter createFailurePropagationMatrixAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix <em>Failure Mode Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix
	 * @generated
	 */
	public Adapter createFailureModeMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix <em>Integrity State Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix
	 * @generated
	 */
	public Adapter createIntegrityStateMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix <em>Boolean Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix
	 * @generated
	 */
	public Adapter createBooleanMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport <em>Failure Mode Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport
	 * @generated
	 */
	public Adapter createFailureModeInportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport <em>Failure Mode Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport
	 * @generated
	 */
	public Adapter createFailureModeOutportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow <em>Failure Mode Matrix Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow
	 * @generated
	 */
	public Adapter createFailureModeMatrixRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry <em>Failure Mode Inport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry
	 * @generated
	 */
	public Adapter createFailureModeInportEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry <em>Failure Mode Outport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry
	 * @generated
	 */
	public Adapter createFailureModeOutportEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport <em>Integrity State Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport
	 * @generated
	 */
	public Adapter createIntegrityStateOutportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInport <em>Integrity State Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInport
	 * @generated
	 */
	public Adapter createIntegrityStateInportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow <em>Integrity State Matrix Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow
	 * @generated
	 */
	public Adapter createIntegrityStateMatrixRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry <em>Integrity State Inport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry
	 * @generated
	 */
	public Adapter createIntegrityStateInportEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry <em>Integrity State Outport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry
	 * @generated
	 */
	public Adapter createIntegrityStateOutportEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport <em>Boolean Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport
	 * @generated
	 */
	public Adapter createBooleanInportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport <em>Boolean Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport
	 * @generated
	 */
	public Adapter createBooleanOutportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow <em>Boolean Matrix Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow
	 * @generated
	 */
	public Adapter createBooleanMatrixRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry <em>Boolean Inport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry
	 * @generated
	 */
	public Adapter createBooleanInportEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry <em>Boolean Outport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry
	 * @generated
	 */
	public Adapter createBooleanOutportEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagatorA <em>Propagator A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagatorA
	 * @generated
	 */
	public Adapter createPropagatorAAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA <em>Failure Mode Propagator A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA
	 * @generated
	 */
	public Adapter createFailureModePropagatorAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA <em>Integrity State Propagator A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA
	 * @generated
	 */
	public Adapter createIntegrityStatePropagatorAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA <em>Boolean Propagator A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanPropagatorA
	 * @generated
	 */
	public Adapter createBooleanPropagatorAAdapter() {
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

} //FailurePropagationMatricesAdapterFactory
