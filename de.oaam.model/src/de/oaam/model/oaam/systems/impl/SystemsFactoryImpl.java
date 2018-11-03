/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.systems.ElectricPower;
import de.oaam.model.oaam.systems.HydraulicPower;
import de.oaam.model.oaam.systems.InformationFlow;
import de.oaam.model.oaam.systems.InformationMaterial;
import de.oaam.model.oaam.systems.InformationPower;
import de.oaam.model.oaam.systems.InformationSignal;
import de.oaam.model.oaam.systems.InputSegregation;
import de.oaam.model.oaam.systems.LinearPower;
import de.oaam.model.oaam.systems.RotaryPower;
import de.oaam.model.oaam.systems.Subsystem;
import de.oaam.model.oaam.systems.Systems;
import de.oaam.model.oaam.systems.SystemsFactory;
import de.oaam.model.oaam.systems.SystemsPackage;

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
public class SystemsFactoryImpl extends EFactoryImpl implements SystemsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemsFactory init() {
		try {
			SystemsFactory theSystemsFactory = (SystemsFactory)EPackage.Registry.INSTANCE.getEFactory(SystemsPackage.eNS_URI);
			if (theSystemsFactory != null) {
				return theSystemsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemsFactoryImpl() {
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
			case SystemsPackage.SYSTEMS: return createSystems();
			case SystemsPackage.SUBSYSTEM: return createSubsystem();
			case SystemsPackage.SYSTEM: return createSystem();
			case SystemsPackage.INFORMATION_FLOW: return createInformationFlow();
			case SystemsPackage.INFORMATION_SIGNAL: return createInformationSignal();
			case SystemsPackage.INFORMATION_MATERIAL: return createInformationMaterial();
			case SystemsPackage.INFORMATION_POWER: return createInformationPower();
			case SystemsPackage.ELECTRIC_POWER: return createElectricPower();
			case SystemsPackage.HYDRAULIC_POWER: return createHydraulicPower();
			case SystemsPackage.ROTARY_POWER: return createRotaryPower();
			case SystemsPackage.LINEAR_POWER: return createLinearPower();
			case SystemsPackage.INPUT_SEGREGATION: return createInputSegregation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systems createSystems() {
		SystemsImpl systems = new SystemsImpl();
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem createSubsystem() {
		SubsystemImpl subsystem = new SubsystemImpl();
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oaam.model.oaam.systems.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlow createInformationFlow() {
		InformationFlowImpl informationFlow = new InformationFlowImpl();
		return informationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationSignal createInformationSignal() {
		InformationSignalImpl informationSignal = new InformationSignalImpl();
		return informationSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationMaterial createInformationMaterial() {
		InformationMaterialImpl informationMaterial = new InformationMaterialImpl();
		return informationMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationPower createInformationPower() {
		InformationPowerImpl informationPower = new InformationPowerImpl();
		return informationPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricPower createElectricPower() {
		ElectricPowerImpl electricPower = new ElectricPowerImpl();
		return electricPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraulicPower createHydraulicPower() {
		HydraulicPowerImpl hydraulicPower = new HydraulicPowerImpl();
		return hydraulicPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotaryPower createRotaryPower() {
		RotaryPowerImpl rotaryPower = new RotaryPowerImpl();
		return rotaryPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearPower createLinearPower() {
		LinearPowerImpl linearPower = new LinearPowerImpl();
		return linearPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSegregation createInputSegregation() {
		InputSegregationImpl inputSegregation = new InputSegregationImpl();
		return inputSegregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemsPackage getSystemsPackage() {
		return (SystemsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemsPackage getPackage() {
		return SystemsPackage.eINSTANCE;
	}

} //SystemsFactoryImpl
