/**
 */
package de.oaam.model.oaam.physical.impl;

import de.oaam.model.oaam.physical.*;

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
public class PhysicalFactoryImpl extends EFactoryImpl implements PhysicalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhysicalFactory init() {
		try {
			PhysicalFactory thePhysicalFactory = (PhysicalFactory)EPackage.Registry.INSTANCE.getEFactory(PhysicalPackage.eNS_URI);
			if (thePhysicalFactory != null) {
				return thePhysicalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhysicalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFactoryImpl() {
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
			case PhysicalPackage.SENSOR: return createSensor();
			case PhysicalPackage.EFFECTOR: return createEffector();
			case PhysicalPackage.PHYSICAL_INTERACTION: return createPhysicalInteraction();
			case PhysicalPackage.SUBPHYSICAL_INTERACTION: return createSubphysicalInteraction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effector createEffector() {
		EffectorImpl effector = new EffectorImpl();
		return effector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalInteraction createPhysicalInteraction() {
		PhysicalInteractionImpl physicalInteraction = new PhysicalInteractionImpl();
		return physicalInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubphysicalInteraction createSubphysicalInteraction() {
		SubphysicalInteractionImpl subphysicalInteraction = new SubphysicalInteractionImpl();
		return subphysicalInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPackage getPhysicalPackage() {
		return (PhysicalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhysicalPackage getPackage() {
		return PhysicalPackage.eINSTANCE;
	}

} //PhysicalFactoryImpl
