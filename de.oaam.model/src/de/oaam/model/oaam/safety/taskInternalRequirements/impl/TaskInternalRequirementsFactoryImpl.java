/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.impl;

import de.oaam.model.oaam.safety.taskInternalRequirements.*;

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
public class TaskInternalRequirementsFactoryImpl extends EFactoryImpl implements TaskInternalRequirementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskInternalRequirementsFactory init() {
		try {
			TaskInternalRequirementsFactory theTaskInternalRequirementsFactory = (TaskInternalRequirementsFactory)EPackage.Registry.INSTANCE.getEFactory(TaskInternalRequirementsPackage.eNS_URI);
			if (theTaskInternalRequirementsFactory != null) {
				return theTaskInternalRequirementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskInternalRequirementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInternalRequirementsFactoryImpl() {
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
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT: return createTaskInternalRequirement();
			case TaskInternalRequirementsPackage.AGREEMENT: return createAgreement();
			case TaskInternalRequirementsPackage.BELOW: return createBelow();
			case TaskInternalRequirementsPackage.ABOVE: return createAbove();
			case TaskInternalRequirementsPackage.IO_SIGNAL: return createIoSignal();
			case TaskInternalRequirementsPackage.VALUE: return createValue();
			case TaskInternalRequirementsPackage.BOOL_TIMEOUT: return createBoolTimeout();
			case TaskInternalRequirementsPackage.AND: return createAnd();
			case TaskInternalRequirementsPackage.OR: return createOr();
			case TaskInternalRequirementsPackage.NOT: return createNot();
			case TaskInternalRequirementsPackage.CONTRACT: return createContract();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInternalRequirement createTaskInternalRequirement() {
		TaskInternalRequirementImpl taskInternalRequirement = new TaskInternalRequirementImpl();
		return taskInternalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agreement createAgreement() {
		AgreementImpl agreement = new AgreementImpl();
		return agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Below createBelow() {
		BelowImpl below = new BelowImpl();
		return below;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Above createAbove() {
		AboveImpl above = new AboveImpl();
		return above;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoSignal createIoSignal() {
		IoSignalImpl ioSignal = new IoSignalImpl();
		return ioSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolTimeout createBoolTimeout() {
		BoolTimeoutImpl boolTimeout = new BoolTimeoutImpl();
		return boolTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInternalRequirementsPackage getTaskInternalRequirementsPackage() {
		return (TaskInternalRequirementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskInternalRequirementsPackage getPackage() {
		return TaskInternalRequirementsPackage.eINSTANCE;
	}

} //TaskInternalRequirementsFactoryImpl
