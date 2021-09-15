/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.safety.failurePropagations.*;

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
public class FailurePropagationsFactoryImpl extends EFactoryImpl implements FailurePropagationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailurePropagationsFactory init() {
		try {
			FailurePropagationsFactory theFailurePropagationsFactory = (FailurePropagationsFactory)EPackage.Registry.INSTANCE.getEFactory(FailurePropagationsPackage.eNS_URI);
			if (theFailurePropagationsFactory != null) {
				return theFailurePropagationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FailurePropagationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationsFactoryImpl() {
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
			case FailurePropagationsPackage.FAILURE_PROPAGATION: return createFailurePropagation();
			case FailurePropagationsPackage.BOOLEAN_AND: return createBooleanAnd();
			case FailurePropagationsPackage.BOOLEAN_OR: return createBooleanOr();
			case FailurePropagationsPackage.BOOLEAN_XOR: return createBooleanXor();
			case FailurePropagationsPackage.BOOLEAN_NOT: return createBooleanNot();
			case FailurePropagationsPackage.INTEGRITY_STATE_BOOLEAN_CONVERSION: return createIntegrityStateBooleanConversion();
			case FailurePropagationsPackage.FAILURE_MODE_BOOLEAN_CONVERSION: return createFailureModeBooleanConversion();
			case FailurePropagationsPackage.BOOLEAN_FAILURE_MODE_CONVERSION: return createBooleanFailureModeConversion();
			case FailurePropagationsPackage.INTEGRITY_STATE_FAILURE_MODE_CONVERSION: return createIntegrityStateFailureModeConversion();
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION: return createFailureModeIntegrityStateConversion();
			case FailurePropagationsPackage.BOOLEAN_INTEGRITY_STATE_CONVERSION: return createBooleanIntegrityStateConversion();
			case FailurePropagationsPackage.PROPAGATION_INPUT: return createPropagationInput();
			case FailurePropagationsPackage.PROPAGATION_OUTPUT: return createPropagationOutput();
			case FailurePropagationsPackage.PROPAGATION_SOURCE: return createPropagationSource();
			case FailurePropagationsPackage.PROPAGATION_SINK: return createPropagationSink();
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
			case FailurePropagationsPackage.FAILURE_PROPAGATION_GENERIC_TYPE_E:
				return createFailurePropagationGenericTypeEFromString(eDataType, initialValue);
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
			case FailurePropagationsPackage.FAILURE_PROPAGATION_GENERIC_TYPE_E:
				return convertFailurePropagationGenericTypeEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagation createFailurePropagation() {
		FailurePropagationImpl failurePropagation = new FailurePropagationImpl();
		return failurePropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAnd createBooleanAnd() {
		BooleanAndImpl booleanAnd = new BooleanAndImpl();
		return booleanAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOr createBooleanOr() {
		BooleanOrImpl booleanOr = new BooleanOrImpl();
		return booleanOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanXor createBooleanXor() {
		BooleanXorImpl booleanXor = new BooleanXorImpl();
		return booleanXor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanNot createBooleanNot() {
		BooleanNotImpl booleanNot = new BooleanNotImpl();
		return booleanNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateBooleanConversion createIntegrityStateBooleanConversion() {
		IntegrityStateBooleanConversionImpl integrityStateBooleanConversion = new IntegrityStateBooleanConversionImpl();
		return integrityStateBooleanConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeBooleanConversion createFailureModeBooleanConversion() {
		FailureModeBooleanConversionImpl failureModeBooleanConversion = new FailureModeBooleanConversionImpl();
		return failureModeBooleanConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanFailureModeConversion createBooleanFailureModeConversion() {
		BooleanFailureModeConversionImpl booleanFailureModeConversion = new BooleanFailureModeConversionImpl();
		return booleanFailureModeConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateFailureModeConversion createIntegrityStateFailureModeConversion() {
		IntegrityStateFailureModeConversionImpl integrityStateFailureModeConversion = new IntegrityStateFailureModeConversionImpl();
		return integrityStateFailureModeConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeIntegrityStateConversion createFailureModeIntegrityStateConversion() {
		FailureModeIntegrityStateConversionImpl failureModeIntegrityStateConversion = new FailureModeIntegrityStateConversionImpl();
		return failureModeIntegrityStateConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanIntegrityStateConversion createBooleanIntegrityStateConversion() {
		BooleanIntegrityStateConversionImpl booleanIntegrityStateConversion = new BooleanIntegrityStateConversionImpl();
		return booleanIntegrityStateConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagationInput createPropagationInput() {
		PropagationInputImpl propagationInput = new PropagationInputImpl();
		return propagationInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagationOutput createPropagationOutput() {
		PropagationOutputImpl propagationOutput = new PropagationOutputImpl();
		return propagationOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagationSource createPropagationSource() {
		PropagationSourceImpl propagationSource = new PropagationSourceImpl();
		return propagationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagationSink createPropagationSink() {
		PropagationSinkImpl propagationSink = new PropagationSinkImpl();
		return propagationSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationGenericTypeE createFailurePropagationGenericTypeEFromString(EDataType eDataType, String initialValue) {
		FailurePropagationGenericTypeE result = FailurePropagationGenericTypeE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailurePropagationGenericTypeEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationsPackage getFailurePropagationsPackage() {
		return (FailurePropagationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FailurePropagationsPackage getPackage() {
		return FailurePropagationsPackage.eINSTANCE;
	}

} //FailurePropagationsFactoryImpl
