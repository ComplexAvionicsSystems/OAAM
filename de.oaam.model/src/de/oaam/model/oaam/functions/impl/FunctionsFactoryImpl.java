/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.functions.*;

import org.eclipse.emf.ecore.EClass;
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
public class FunctionsFactoryImpl extends EFactoryImpl implements FunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionsFactory init() {
		try {
			FunctionsFactory theFunctionsFactory = (FunctionsFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionsPackage.eNS_URI);
			if (theFunctionsFactory != null) {
				return theFunctionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsFactoryImpl() {
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
			case FunctionsPackage.FUNCTIONS: return createFunctions();
			case FunctionsPackage.TASK: return createTask();
			case FunctionsPackage.EXTERNAL_TASK_LINK: return createExternalTaskLink();
			case FunctionsPackage.TASK_GROUP: return createTaskGroup();
			case FunctionsPackage.TASK_SYMMETRY: return createTaskSymmetry();
			case FunctionsPackage.TASK_REDUNDANCY: return createTaskRedundancy();
			case FunctionsPackage.FAILURE_CONDITION: return createFailureCondition();
			case FunctionsPackage.SYSTEM_INPUT_STATE: return createSystemInputState();
			case FunctionsPackage.SIGNAL: return createSignal();
			case FunctionsPackage.SIGNAL_GROUP: return createSignalGroup();
			case FunctionsPackage.INPUT: return createInput();
			case FunctionsPackage.OUTPUT: return createOutput();
			case FunctionsPackage.EXTERNAL_OUTPUT_LINK: return createExternalOutputLink();
			case FunctionsPackage.SUBFUNCTION: return createSubfunction();
			case FunctionsPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functions createFunctions() {
		FunctionsImpl functions = new FunctionsImpl();
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalTaskLink createExternalTaskLink() {
		ExternalTaskLinkImpl externalTaskLink = new ExternalTaskLinkImpl();
		return externalTaskLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskGroup createTaskGroup() {
		TaskGroupImpl taskGroup = new TaskGroupImpl();
		return taskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSymmetry createTaskSymmetry() {
		TaskSymmetryImpl taskSymmetry = new TaskSymmetryImpl();
		return taskSymmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRedundancy createTaskRedundancy() {
		TaskRedundancyImpl taskRedundancy = new TaskRedundancyImpl();
		return taskRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureCondition createFailureCondition() {
		FailureConditionImpl failureCondition = new FailureConditionImpl();
		return failureCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInputState createSystemInputState() {
		SystemInputStateImpl systemInputState = new SystemInputStateImpl();
		return systemInputState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalGroup createSignalGroup() {
		SignalGroupImpl signalGroup = new SignalGroupImpl();
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalOutputLink createExternalOutputLink() {
		ExternalOutputLinkImpl externalOutputLink = new ExternalOutputLinkImpl();
		return externalOutputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subfunction createSubfunction() {
		SubfunctionImpl subfunction = new SubfunctionImpl();
		return subfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsPackage getFunctionsPackage() {
		return (FunctionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionsPackage getPackage() {
		return FunctionsPackage.eINSTANCE;
	}

} //FunctionsFactoryImpl
