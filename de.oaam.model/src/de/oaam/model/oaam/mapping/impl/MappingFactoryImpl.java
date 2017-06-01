/**
 */
package de.oaam.model.oaam.mapping.impl;

import de.oaam.model.oaam.mapping.*;

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
public class MappingFactoryImpl extends EFactoryImpl implements MappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingFactory init() {
		try {
			MappingFactory theMappingFactory = (MappingFactory)EPackage.Registry.INSTANCE.getEFactory(MappingPackage.eNS_URI);
			if (theMappingFactory != null) {
				return theMappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactoryImpl() {
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
			case MappingPackage.TASK_ASSIGNMENT: return createTaskAssignment();
			case MappingPackage.SIGNAL_ASSIGNMENT: return createSignalAssignment();
			case MappingPackage.CONNECTION_ASSIGNMENT: return createConnectionAssignment();
			case MappingPackage.SIGNAL_ASSIGNMENT_SEGMENT: return createSignalAssignmentSegment();
			case MappingPackage.DEVICE_ASSIGNMENT: return createDeviceAssignment();
			case MappingPackage.CONNECTION_ASSIGNMENT_SEGMENT: return createConnectionAssignmentSegment();
			case MappingPackage.SUB_DEVICE_ASSIGNMENT: return createSubDeviceAssignment();
			case MappingPackage.MAPPING: return createMapping();
			case MappingPackage.SUPMAPPING: return createSupmapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAssignment createTaskAssignment() {
		TaskAssignmentImpl taskAssignment = new TaskAssignmentImpl();
		return taskAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalAssignment createSignalAssignment() {
		SignalAssignmentImpl signalAssignment = new SignalAssignmentImpl();
		return signalAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionAssignment createConnectionAssignment() {
		ConnectionAssignmentImpl connectionAssignment = new ConnectionAssignmentImpl();
		return connectionAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalAssignmentSegment createSignalAssignmentSegment() {
		SignalAssignmentSegmentImpl signalAssignmentSegment = new SignalAssignmentSegmentImpl();
		return signalAssignmentSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAssignment createDeviceAssignment() {
		DeviceAssignmentImpl deviceAssignment = new DeviceAssignmentImpl();
		return deviceAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionAssignmentSegment createConnectionAssignmentSegment() {
		ConnectionAssignmentSegmentImpl connectionAssignmentSegment = new ConnectionAssignmentSegmentImpl();
		return connectionAssignmentSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubDeviceAssignment createSubDeviceAssignment() {
		SubDeviceAssignmentImpl subDeviceAssignment = new SubDeviceAssignmentImpl();
		return subDeviceAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supmapping createSupmapping() {
		SupmappingImpl supmapping = new SupmappingImpl();
		return supmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingPackage getMappingPackage() {
		return (MappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MappingPackage getPackage() {
		return MappingPackage.eINSTANCE;
	}

} //MappingFactoryImpl
