/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.SubconnectionAssignment;

import de.oaam.model.oaam.capabilities.SubconnectionInDeviceCapability;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.Device;

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
 * An implementation of the model object '<em><b>Subconnection Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubconnectionAssignmentImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubconnectionAssignmentImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubconnectionAssignmentImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubconnectionAssignmentImpl#getSubconnection <em>Subconnection</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubconnectionAssignmentImpl#getTargetDevice <em>Target Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubconnectionAssignmentImpl extends OaamBaseElementAImpl implements SubconnectionAssignment {
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
	protected SubconnectionInDeviceCapability capability;

	/**
	 * The cached value of the '{@link #getSubconnection() <em>Subconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubconnection()
	 * @generated
	 * @ordered
	 */
	protected Connection subconnection;

	/**
	 * The cached value of the '{@link #getTargetDevice() <em>Target Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDevice()
	 * @generated
	 * @ordered
	 */
	protected Device targetDevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubconnectionAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.SUBCONNECTION_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AllocationsPackage.SUBCONNECTION_ASSIGNMENT__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, AllocationsPackage.SUBCONNECTION_ASSIGNMENT__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubconnectionInDeviceCapability getCapability() {
		if (capability != null && capability.eIsProxy()) {
			InternalEObject oldCapability = (InternalEObject)capability;
			capability = (SubconnectionInDeviceCapability)eResolveProxy(oldCapability);
			if (capability != oldCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SUBCONNECTION_ASSIGNMENT__CAPABILITY, oldCapability, capability));
			}
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubconnectionInDeviceCapability basicGetCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(SubconnectionInDeviceCapability newCapability) {
		SubconnectionInDeviceCapability oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBCONNECTION_ASSIGNMENT__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getSubconnection() {
		if (subconnection != null && subconnection.eIsProxy()) {
			InternalEObject oldSubconnection = (InternalEObject)subconnection;
			subconnection = (Connection)eResolveProxy(oldSubconnection);
			if (subconnection != oldSubconnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SUBCONNECTION_ASSIGNMENT__SUBCONNECTION, oldSubconnection, subconnection));
			}
		}
		return subconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetSubconnection() {
		return subconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubconnection(Connection newSubconnection) {
		Connection oldSubconnection = subconnection;
		subconnection = newSubconnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBCONNECTION_ASSIGNMENT__SUBCONNECTION, oldSubconnection, subconnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getTargetDevice() {
		if (targetDevice != null && targetDevice.eIsProxy()) {
			InternalEObject oldTargetDevice = (InternalEObject)targetDevice;
			targetDevice = (Device)eResolveProxy(oldTargetDevice);
			if (targetDevice != oldTargetDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SUBCONNECTION_ASSIGNMENT__TARGET_DEVICE, oldTargetDevice, targetDevice));
			}
		}
		return targetDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetTargetDevice() {
		return targetDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDevice(Device newTargetDevice) {
		Device oldTargetDevice = targetDevice;
		targetDevice = newTargetDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBCONNECTION_ASSIGNMENT__TARGET_DEVICE, oldTargetDevice, targetDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__OPERATION_MODES:
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
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__VARIANTS:
				return getVariants();
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__OPERATION_MODES:
				return getOperationModes();
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__SUBCONNECTION:
				if (resolve) return getSubconnection();
				return basicGetSubconnection();
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__TARGET_DEVICE:
				if (resolve) return getTargetDevice();
				return basicGetTargetDevice();
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
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__CAPABILITY:
				setCapability((SubconnectionInDeviceCapability)newValue);
				return;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__SUBCONNECTION:
				setSubconnection((Connection)newValue);
				return;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__TARGET_DEVICE:
				setTargetDevice((Device)newValue);
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
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__VARIANTS:
				getVariants().clear();
				return;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__CAPABILITY:
				setCapability((SubconnectionInDeviceCapability)null);
				return;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__SUBCONNECTION:
				setSubconnection((Connection)null);
				return;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__TARGET_DEVICE:
				setTargetDevice((Device)null);
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
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__CAPABILITY:
				return capability != null;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__SUBCONNECTION:
				return subconnection != null;
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__TARGET_DEVICE:
				return targetDevice != null;
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
				case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.SUBCONNECTION_ASSIGNMENT__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return AllocationsPackage.SUBCONNECTION_ASSIGNMENT__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return AllocationsPackage.SUBCONNECTION_ASSIGNMENT__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubconnectionAssignmentImpl
