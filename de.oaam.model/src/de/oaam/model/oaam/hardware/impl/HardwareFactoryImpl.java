/**
 */
package de.oaam.model.oaam.hardware.impl;

import de.oaam.model.oaam.hardware.*;

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
public class HardwareFactoryImpl extends EFactoryImpl implements HardwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HardwareFactory init() {
		try {
			HardwareFactory theHardwareFactory = (HardwareFactory)EPackage.Registry.INSTANCE.getEFactory(HardwarePackage.eNS_URI);
			if (theHardwareFactory != null) {
				return theHardwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HardwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareFactoryImpl() {
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
			case HardwarePackage.DEVICE: return createDevice();
			case HardwarePackage.CONNECTION: return createConnection();
			case HardwarePackage.IO: return createIo();
			case HardwarePackage.DEVICE_SYMMETRY: return createDeviceSymmetry();
			case HardwarePackage.HARDWARE: return createHardware();
			case HardwarePackage.SUBHARDWARE: return createSubhardware();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Io createIo() {
		IoImpl io = new IoImpl();
		return io;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceSymmetry createDeviceSymmetry() {
		DeviceSymmetryImpl deviceSymmetry = new DeviceSymmetryImpl();
		return deviceSymmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware createHardware() {
		HardwareImpl hardware = new HardwareImpl();
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subhardware createSubhardware() {
		SubhardwareImpl subhardware = new SubhardwareImpl();
		return subhardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePackage getHardwarePackage() {
		return (HardwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HardwarePackage getPackage() {
		return HardwarePackage.eINSTANCE;
	}

} //HardwareFactoryImpl
