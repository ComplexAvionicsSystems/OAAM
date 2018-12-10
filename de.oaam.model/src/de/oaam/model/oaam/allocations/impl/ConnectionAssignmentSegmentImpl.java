/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.ConnectionAssignmentSegment;

import de.oaam.model.oaam.anatomy.Duct;
import de.oaam.model.oaam.anatomy.Location;

import de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Assignment Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.ConnectionAssignmentSegmentImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.ConnectionAssignmentSegmentImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.ConnectionAssignmentSegmentImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.ConnectionAssignmentSegmentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.ConnectionAssignmentSegmentImpl#getDuct <em>Duct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionAssignmentSegmentImpl extends OaamBaseElementAImpl implements ConnectionAssignmentSegment {
	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variants;

	/**
	 * The cached value of the '{@link #getOperationModes() <em>Operation Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationModes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationModeReference> operationModes;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected ConnectionInDuctOrLocationCapability capability;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getDuct() <em>Duct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuct()
	 * @generated
	 * @ordered
	 */
	protected Duct duct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionAssignmentSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.CONNECTION_ASSIGNMENT_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInDuctOrLocationCapability getCapability() {
		if (capability != null && capability.eIsProxy()) {
			InternalEObject oldCapability = (InternalEObject)capability;
			capability = (ConnectionInDuctOrLocationCapability)eResolveProxy(oldCapability);
			if (capability != oldCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY, oldCapability, capability));
			}
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInDuctOrLocationCapability basicGetCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(ConnectionInDuctOrLocationCapability newCapability) {
		ConnectionInDuctOrLocationCapability oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duct getDuct() {
		if (duct != null && duct.eIsProxy()) {
			InternalEObject oldDuct = (InternalEObject)duct;
			duct = (Duct)eResolveProxy(oldDuct);
			if (duct != oldDuct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__DUCT, oldDuct, duct));
			}
		}
		return duct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duct basicGetDuct() {
		return duct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuct(Duct newDuct) {
		Duct oldDuct = duct;
		duct = newDuct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__DUCT, oldDuct, duct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
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
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__VARIANTS:
				return getVariants();
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES:
				return getOperationModes();
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__DUCT:
				if (resolve) return getDuct();
				return basicGetDuct();
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
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY:
				setCapability((ConnectionInDuctOrLocationCapability)newValue);
				return;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__LOCATION:
				setLocation((Location)newValue);
				return;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__DUCT:
				setDuct((Duct)newValue);
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
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__VARIANTS:
				getVariants().clear();
				return;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY:
				setCapability((ConnectionInDuctOrLocationCapability)null);
				return;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__LOCATION:
				setLocation((Location)null);
				return;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__DUCT:
				setDuct((Duct)null);
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
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY:
				return capability != null;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__LOCATION:
				return location != null;
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__DUCT:
				return duct != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectionAssignmentSegmentImpl
