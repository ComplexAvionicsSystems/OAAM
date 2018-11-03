/**
 */
package de.oaam.model.oaam.anatomy.impl;

import de.oaam.model.oaam.anatomy.*;

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
public class AnatomyFactoryImpl extends EFactoryImpl implements AnatomyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnatomyFactory init() {
		try {
			AnatomyFactory theAnatomyFactory = (AnatomyFactory)EPackage.Registry.INSTANCE.getEFactory(AnatomyPackage.eNS_URI);
			if (theAnatomyFactory != null) {
				return theAnatomyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnatomyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnatomyFactoryImpl() {
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
			case AnatomyPackage.LOCATION: return createLocation();
			case AnatomyPackage.AREA: return createArea();
			case AnatomyPackage.DUCT: return createDuct();
			case AnatomyPackage.DUCT_OPENING: return createDuctOpening();
			case AnatomyPackage.POSITION3_D: return createPosition3D();
			case AnatomyPackage.LOCATION_SYMMETRY: return createLocationSymmetry();
			case AnatomyPackage.AREA_SYMMETRY: return createAreaSymmetry();
			case AnatomyPackage.SUBANATOMY: return createSubanatomy();
			case AnatomyPackage.ANATOMY: return createAnatomy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duct createDuct() {
		DuctImpl duct = new DuctImpl();
		return duct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctOpening createDuctOpening() {
		DuctOpeningImpl ductOpening = new DuctOpeningImpl();
		return ductOpening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position3D createPosition3D() {
		Position3DImpl position3D = new Position3DImpl();
		return position3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationSymmetry createLocationSymmetry() {
		LocationSymmetryImpl locationSymmetry = new LocationSymmetryImpl();
		return locationSymmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaSymmetry createAreaSymmetry() {
		AreaSymmetryImpl areaSymmetry = new AreaSymmetryImpl();
		return areaSymmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anatomy createAnatomy() {
		AnatomyImpl anatomy = new AnatomyImpl();
		return anatomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subanatomy createSubanatomy() {
		SubanatomyImpl subanatomy = new SubanatomyImpl();
		return subanatomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnatomyPackage getAnatomyPackage() {
		return (AnatomyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnatomyPackage getPackage() {
		return AnatomyPackage.eINSTANCE;
	}

} //AnatomyFactoryImpl
