/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.*;

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
public class FailurePropagationMatricesFactoryImpl extends EFactoryImpl implements FailurePropagationMatricesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailurePropagationMatricesFactory init() {
		try {
			FailurePropagationMatricesFactory theFailurePropagationMatricesFactory = (FailurePropagationMatricesFactory)EPackage.Registry.INSTANCE.getEFactory(FailurePropagationMatricesPackage.eNS_URI);
			if (theFailurePropagationMatricesFactory != null) {
				return theFailurePropagationMatricesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FailurePropagationMatricesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationMatricesFactoryImpl() {
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX: return createFailureModeMatrix();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX: return createIntegrityStateMatrix();
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX: return createBooleanMatrix();
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT: return createFailureModeInport();
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT: return createFailureModeOutport();
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW: return createFailureModeMatrixRow();
			case FailurePropagationMatricesPackage.FAILURE_MODE_INPORT_ENTRY: return createFailureModeInportEntry();
			case FailurePropagationMatricesPackage.FAILURE_MODE_OUTPORT_ENTRY: return createFailureModeOutportEntry();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT: return createIntegrityStateOutport();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_INPORT: return createIntegrityStateInport();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW: return createIntegrityStateMatrixRow();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_INPORT_ENTRY: return createIntegrityStateInportEntry();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_OUTPORT_ENTRY: return createIntegrityStateOutportEntry();
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT: return createBooleanInport();
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT: return createBooleanOutport();
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW: return createBooleanMatrixRow();
			case FailurePropagationMatricesPackage.BOOLEAN_INPORT_ENTRY: return createBooleanInportEntry();
			case FailurePropagationMatricesPackage.BOOLEAN_OUTPORT_ENTRY: return createBooleanOutportEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeMatrix createFailureModeMatrix() {
		FailureModeMatrixImpl failureModeMatrix = new FailureModeMatrixImpl();
		return failureModeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateMatrix createIntegrityStateMatrix() {
		IntegrityStateMatrixImpl integrityStateMatrix = new IntegrityStateMatrixImpl();
		return integrityStateMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanMatrix createBooleanMatrix() {
		BooleanMatrixImpl booleanMatrix = new BooleanMatrixImpl();
		return booleanMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeInport createFailureModeInport() {
		FailureModeInportImpl failureModeInport = new FailureModeInportImpl();
		return failureModeInport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeOutport createFailureModeOutport() {
		FailureModeOutportImpl failureModeOutport = new FailureModeOutportImpl();
		return failureModeOutport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeMatrixRow createFailureModeMatrixRow() {
		FailureModeMatrixRowImpl failureModeMatrixRow = new FailureModeMatrixRowImpl();
		return failureModeMatrixRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeInportEntry createFailureModeInportEntry() {
		FailureModeInportEntryImpl failureModeInportEntry = new FailureModeInportEntryImpl();
		return failureModeInportEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeOutportEntry createFailureModeOutportEntry() {
		FailureModeOutportEntryImpl failureModeOutportEntry = new FailureModeOutportEntryImpl();
		return failureModeOutportEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateOutport createIntegrityStateOutport() {
		IntegrityStateOutportImpl integrityStateOutport = new IntegrityStateOutportImpl();
		return integrityStateOutport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateInport createIntegrityStateInport() {
		IntegrityStateInportImpl integrityStateInport = new IntegrityStateInportImpl();
		return integrityStateInport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateMatrixRow createIntegrityStateMatrixRow() {
		IntegrityStateMatrixRowImpl integrityStateMatrixRow = new IntegrityStateMatrixRowImpl();
		return integrityStateMatrixRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateInportEntry createIntegrityStateInportEntry() {
		IntegrityStateInportEntryImpl integrityStateInportEntry = new IntegrityStateInportEntryImpl();
		return integrityStateInportEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateOutportEntry createIntegrityStateOutportEntry() {
		IntegrityStateOutportEntryImpl integrityStateOutportEntry = new IntegrityStateOutportEntryImpl();
		return integrityStateOutportEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanInport createBooleanInport() {
		BooleanInportImpl booleanInport = new BooleanInportImpl();
		return booleanInport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOutport createBooleanOutport() {
		BooleanOutportImpl booleanOutport = new BooleanOutportImpl();
		return booleanOutport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanMatrixRow createBooleanMatrixRow() {
		BooleanMatrixRowImpl booleanMatrixRow = new BooleanMatrixRowImpl();
		return booleanMatrixRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanInportEntry createBooleanInportEntry() {
		BooleanInportEntryImpl booleanInportEntry = new BooleanInportEntryImpl();
		return booleanInportEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOutportEntry createBooleanOutportEntry() {
		BooleanOutportEntryImpl booleanOutportEntry = new BooleanOutportEntryImpl();
		return booleanOutportEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationMatricesPackage getFailurePropagationMatricesPackage() {
		return (FailurePropagationMatricesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FailurePropagationMatricesPackage getPackage() {
		return FailurePropagationMatricesPackage.eINSTANCE;
	}

} //FailurePropagationMatricesFactoryImpl
