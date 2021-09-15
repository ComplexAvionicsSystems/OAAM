/**
 */
package de.oaam.model.oaam.safety.failurePropagations.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.failurePropagations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage
 * @generated
 */
public class FailurePropagationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FailurePropagationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FailurePropagationsPackage.eINSTANCE;
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
	protected FailurePropagationsSwitch<Adapter> modelSwitch =
		new FailurePropagationsSwitch<Adapter>() {
			@Override
			public Adapter caseFailurePropagation(FailurePropagation object) {
				return createFailurePropagationAdapter();
			}
			@Override
			public Adapter casePropagatorA(PropagatorA object) {
				return createPropagatorAAdapter();
			}
			@Override
			public Adapter caseFailureModePropagatorA(FailureModePropagatorA object) {
				return createFailureModePropagatorAAdapter();
			}
			@Override
			public Adapter caseBooleanPropagatorA(BooleanPropagatorA object) {
				return createBooleanPropagatorAAdapter();
			}
			@Override
			public Adapter caseConversionA(ConversionA object) {
				return createConversionAAdapter();
			}
			@Override
			public Adapter caseIntegrityStatePropagatorA(IntegrityStatePropagatorA object) {
				return createIntegrityStatePropagatorAAdapter();
			}
			@Override
			public Adapter caseBooleanGateA(BooleanGateA object) {
				return createBooleanGateAAdapter();
			}
			@Override
			public Adapter caseBooleanAnd(BooleanAnd object) {
				return createBooleanAndAdapter();
			}
			@Override
			public Adapter caseBooleanOr(BooleanOr object) {
				return createBooleanOrAdapter();
			}
			@Override
			public Adapter caseBooleanXor(BooleanXor object) {
				return createBooleanXorAdapter();
			}
			@Override
			public Adapter caseBooleanNot(BooleanNot object) {
				return createBooleanNotAdapter();
			}
			@Override
			public Adapter caseIntegrityStateBooleanConversion(IntegrityStateBooleanConversion object) {
				return createIntegrityStateBooleanConversionAdapter();
			}
			@Override
			public Adapter caseFailureModeBooleanConversion(FailureModeBooleanConversion object) {
				return createFailureModeBooleanConversionAdapter();
			}
			@Override
			public Adapter caseBooleanFailureModeConversion(BooleanFailureModeConversion object) {
				return createBooleanFailureModeConversionAdapter();
			}
			@Override
			public Adapter caseIntegrityStateFailureModeConversion(IntegrityStateFailureModeConversion object) {
				return createIntegrityStateFailureModeConversionAdapter();
			}
			@Override
			public Adapter caseFailureModeIntegrityStateConversion(FailureModeIntegrityStateConversion object) {
				return createFailureModeIntegrityStateConversionAdapter();
			}
			@Override
			public Adapter caseBooleanIntegrityStateConversion(BooleanIntegrityStateConversion object) {
				return createBooleanIntegrityStateConversionAdapter();
			}
			@Override
			public Adapter casePropagationInput(PropagationInput object) {
				return createPropagationInputAdapter();
			}
			@Override
			public Adapter casePropagationOutput(PropagationOutput object) {
				return createPropagationOutputAdapter();
			}
			@Override
			public Adapter casePropagationSource(PropagationSource object) {
				return createPropagationSourceAdapter();
			}
			@Override
			public Adapter casePropagationSink(PropagationSink object) {
				return createPropagationSinkAdapter();
			}
			@Override
			public Adapter caseOaamBaseElementA(OaamBaseElementA object) {
				return createOaamBaseElementAAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagation <em>Failure Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagation
	 * @generated
	 */
	public Adapter createFailurePropagationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.ConversionA <em>Conversion A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.ConversionA
	 * @generated
	 */
	public Adapter createConversionAAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanGateA <em>Boolean Gate A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanGateA
	 * @generated
	 */
	public Adapter createBooleanGateAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanAnd <em>Boolean And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanAnd
	 * @generated
	 */
	public Adapter createBooleanAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanOr <em>Boolean Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanOr
	 * @generated
	 */
	public Adapter createBooleanOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanXor <em>Boolean Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanXor
	 * @generated
	 */
	public Adapter createBooleanXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanNot <em>Boolean Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanNot
	 * @generated
	 */
	public Adapter createBooleanNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion <em>Integrity State Boolean Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion
	 * @generated
	 */
	public Adapter createIntegrityStateBooleanConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion <em>Failure Mode Boolean Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion
	 * @generated
	 */
	public Adapter createFailureModeBooleanConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion <em>Boolean Failure Mode Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion
	 * @generated
	 */
	public Adapter createBooleanFailureModeConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion <em>Integrity State Failure Mode Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion
	 * @generated
	 */
	public Adapter createIntegrityStateFailureModeConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion <em>Failure Mode Integrity State Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion
	 * @generated
	 */
	public Adapter createFailureModeIntegrityStateConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion <em>Boolean Integrity State Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion
	 * @generated
	 */
	public Adapter createBooleanIntegrityStateConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationInput <em>Propagation Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationInput
	 * @generated
	 */
	public Adapter createPropagationInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput <em>Propagation Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationOutput
	 * @generated
	 */
	public Adapter createPropagationOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSource <em>Propagation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationSource
	 * @generated
	 */
	public Adapter createPropagationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.failurePropagations.PropagationSink <em>Propagation Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.failurePropagations.PropagationSink
	 * @generated
	 */
	public Adapter createPropagationSinkAdapter() {
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

} //FailurePropagationsAdapterFactory
