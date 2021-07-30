/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.safety.taskInternalRequirements.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage
 * @generated
 */
public class TaskInternalRequirementsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaskInternalRequirementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInternalRequirementsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TaskInternalRequirementsPackage.eINSTANCE;
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
	protected TaskInternalRequirementsSwitch<Adapter> modelSwitch =
		new TaskInternalRequirementsSwitch<Adapter>() {
			@Override
			public Adapter caseTaskInternalRequirement(TaskInternalRequirement object) {
				return createTaskInternalRequirementAdapter();
			}
			@Override
			public Adapter caseRequirementComponentA(RequirementComponentA object) {
				return createRequirementComponentAAdapter();
			}
			@Override
			public Adapter caseComparatorA(ComparatorA object) {
				return createComparatorAAdapter();
			}
			@Override
			public Adapter caseAgreement(Agreement object) {
				return createAgreementAdapter();
			}
			@Override
			public Adapter caseBelow(Below object) {
				return createBelowAdapter();
			}
			@Override
			public Adapter caseAbove(Above object) {
				return createAboveAdapter();
			}
			@Override
			public Adapter caseSourceA(SourceA object) {
				return createSourceAAdapter();
			}
			@Override
			public Adapter caseIoSignal(IoSignal object) {
				return createIoSignalAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseComplexOperatorA(ComplexOperatorA object) {
				return createComplexOperatorAAdapter();
			}
			@Override
			public Adapter caseBoolTimeout(BoolTimeout object) {
				return createBoolTimeoutAdapter();
			}
			@Override
			public Adapter caseBooleanOperatorA(BooleanOperatorA object) {
				return createBooleanOperatorAAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement <em>Task Internal Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement
	 * @generated
	 */
	public Adapter createTaskInternalRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA <em>Requirement Component A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA
	 * @generated
	 */
	public Adapter createRequirementComponentAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA <em>Comparator A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA
	 * @generated
	 */
	public Adapter createComparatorAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Agreement
	 * @generated
	 */
	public Adapter createAgreementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Below <em>Below</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Below
	 * @generated
	 */
	public Adapter createBelowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Above <em>Above</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Above
	 * @generated
	 */
	public Adapter createAboveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.SourceA <em>Source A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.SourceA
	 * @generated
	 */
	public Adapter createSourceAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal <em>Io Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal
	 * @generated
	 */
	public Adapter createIoSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.ComplexOperatorA <em>Complex Operator A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.ComplexOperatorA
	 * @generated
	 */
	public Adapter createComplexOperatorAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout <em>Bool Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.BoolTimeout
	 * @generated
	 */
	public Adapter createBoolTimeoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.BooleanOperatorA <em>Boolean Operator A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.BooleanOperatorA
	 * @generated
	 */
	public Adapter createBooleanOperatorAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.safety.taskInternalRequirements.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
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

} //TaskInternalRequirementsAdapterFactory
