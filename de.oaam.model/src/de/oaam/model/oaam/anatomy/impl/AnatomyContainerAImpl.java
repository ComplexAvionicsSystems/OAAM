/**
 */
package de.oaam.model.oaam.anatomy.impl;

import de.oaam.model.oaam.anatomy.AnatomyContainerA;
import de.oaam.model.oaam.anatomy.AnatomyPackage;
import de.oaam.model.oaam.anatomy.Area;
import de.oaam.model.oaam.anatomy.AreaSymmetry;
import de.oaam.model.oaam.anatomy.Duct;
import de.oaam.model.oaam.anatomy.Location;
import de.oaam.model.oaam.anatomy.LocationSymmetry;
import de.oaam.model.oaam.anatomy.Subanatomy;
import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl#getLocationSymmetries <em>Location Symmetries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl#getDucts <em>Ducts</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl#getAreas <em>Areas</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl#getSubanatomies <em>Subanatomies</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.AnatomyContainerAImpl#getAreaSymmetries <em>Area Symmetries</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnatomyContainerAImpl extends OaamBaseElementAImpl implements AnatomyContainerA {
	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getLocationSymmetries() <em>Location Symmetries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSymmetries()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationSymmetry> locationSymmetries;

	/**
	 * The cached value of the '{@link #getDucts() <em>Ducts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDucts()
	 * @generated
	 * @ordered
	 */
	protected EList<Duct> ducts;

	/**
	 * The cached value of the '{@link #getAreas() <em>Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> areas;

	/**
	 * The cached value of the '{@link #getSubanatomies() <em>Subanatomies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubanatomies()
	 * @generated
	 * @ordered
	 */
	protected EList<Subanatomy> subanatomies;

	/**
	 * The cached value of the '{@link #getAreaSymmetries() <em>Area Symmetries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaSymmetries()
	 * @generated
	 * @ordered
	 */
	protected EList<AreaSymmetry> areaSymmetries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnatomyContainerAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnatomyPackage.Literals.ANATOMY_CONTAINER_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, AnatomyPackage.ANATOMY_CONTAINER_A__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationSymmetry> getLocationSymmetries() {
		if (locationSymmetries == null) {
			locationSymmetries = new EObjectContainmentEList<LocationSymmetry>(LocationSymmetry.class, this, AnatomyPackage.ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES);
		}
		return locationSymmetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Duct> getDucts() {
		if (ducts == null) {
			ducts = new EObjectContainmentEList<Duct>(Duct.class, this, AnatomyPackage.ANATOMY_CONTAINER_A__DUCTS);
		}
		return ducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getAreas() {
		if (areas == null) {
			areas = new EObjectContainmentEList<Area>(Area.class, this, AnatomyPackage.ANATOMY_CONTAINER_A__AREAS);
		}
		return areas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subanatomy> getSubanatomies() {
		if (subanatomies == null) {
			subanatomies = new EObjectContainmentEList<Subanatomy>(Subanatomy.class, this, AnatomyPackage.ANATOMY_CONTAINER_A__SUBANATOMIES);
		}
		return subanatomies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AreaSymmetry> getAreaSymmetries() {
		if (areaSymmetries == null) {
			areaSymmetries = new EObjectContainmentEList<AreaSymmetry>(AreaSymmetry.class, this, AnatomyPackage.ANATOMY_CONTAINER_A__AREA_SYMMETRIES);
		}
		return areaSymmetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES:
				return ((InternalEList<?>)getLocationSymmetries()).basicRemove(otherEnd, msgs);
			case AnatomyPackage.ANATOMY_CONTAINER_A__DUCTS:
				return ((InternalEList<?>)getDucts()).basicRemove(otherEnd, msgs);
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREAS:
				return ((InternalEList<?>)getAreas()).basicRemove(otherEnd, msgs);
			case AnatomyPackage.ANATOMY_CONTAINER_A__SUBANATOMIES:
				return ((InternalEList<?>)getSubanatomies()).basicRemove(otherEnd, msgs);
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREA_SYMMETRIES:
				return ((InternalEList<?>)getAreaSymmetries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATIONS:
				return getLocations();
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES:
				return getLocationSymmetries();
			case AnatomyPackage.ANATOMY_CONTAINER_A__DUCTS:
				return getDucts();
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREAS:
				return getAreas();
			case AnatomyPackage.ANATOMY_CONTAINER_A__SUBANATOMIES:
				return getSubanatomies();
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREA_SYMMETRIES:
				return getAreaSymmetries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES:
				getLocationSymmetries().clear();
				getLocationSymmetries().addAll((Collection<? extends LocationSymmetry>)newValue);
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__DUCTS:
				getDucts().clear();
				getDucts().addAll((Collection<? extends Duct>)newValue);
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREAS:
				getAreas().clear();
				getAreas().addAll((Collection<? extends Area>)newValue);
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__SUBANATOMIES:
				getSubanatomies().clear();
				getSubanatomies().addAll((Collection<? extends Subanatomy>)newValue);
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREA_SYMMETRIES:
				getAreaSymmetries().clear();
				getAreaSymmetries().addAll((Collection<? extends AreaSymmetry>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATIONS:
				getLocations().clear();
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES:
				getLocationSymmetries().clear();
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__DUCTS:
				getDucts().clear();
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREAS:
				getAreas().clear();
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__SUBANATOMIES:
				getSubanatomies().clear();
				return;
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREA_SYMMETRIES:
				getAreaSymmetries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES:
				return locationSymmetries != null && !locationSymmetries.isEmpty();
			case AnatomyPackage.ANATOMY_CONTAINER_A__DUCTS:
				return ducts != null && !ducts.isEmpty();
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREAS:
				return areas != null && !areas.isEmpty();
			case AnatomyPackage.ANATOMY_CONTAINER_A__SUBANATOMIES:
				return subanatomies != null && !subanatomies.isEmpty();
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREA_SYMMETRIES:
				return areaSymmetries != null && !areaSymmetries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnatomyContainerAImpl
