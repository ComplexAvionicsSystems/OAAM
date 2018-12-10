/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.SubdeviceAssignment;

import de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

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
 * An implementation of the model object '<em><b>Subdevice Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubdeviceAssignmentImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubdeviceAssignmentImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubdeviceAssignmentImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubdeviceAssignmentImpl#getSubdevice <em>Subdevice</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubdeviceAssignmentImpl#getTargetDevice <em>Target Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubdeviceAssignmentImpl extends OaamBaseElementAImpl implements SubdeviceAssignment {
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
	protected SubdeviceInDeviceCapability capability;

	/**
	 * The cached value of the '{@link #getSubdevice() <em>Subdevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdevice()
	 * @generated
	 * @ordered
	 */
	protected Device subdevice;

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
	protected SubdeviceAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.SUBDEVICE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AllocationsPackage.SUBDEVICE_ASSIGNMENT__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, AllocationsPackage.SUBDEVICE_ASSIGNMENT__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubdeviceInDeviceCapability getCapability() {
		if (capability != null && capability.eIsProxy()) {
			InternalEObject oldCapability = (InternalEObject)capability;
			capability = (SubdeviceInDeviceCapability)eResolveProxy(oldCapability);
			if (capability != oldCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SUBDEVICE_ASSIGNMENT__CAPABILITY, oldCapability, capability));
			}
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubdeviceInDeviceCapability basicGetCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(SubdeviceInDeviceCapability newCapability) {
		SubdeviceInDeviceCapability oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBDEVICE_ASSIGNMENT__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getSubdevice() {
		if (subdevice != null && subdevice.eIsProxy()) {
			InternalEObject oldSubdevice = (InternalEObject)subdevice;
			subdevice = (Device)eResolveProxy(oldSubdevice);
			if (subdevice != oldSubdevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SUBDEVICE_ASSIGNMENT__SUBDEVICE, oldSubdevice, subdevice));
			}
		}
		return subdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetSubdevice() {
		return subdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubdevice(Device newSubdevice) {
		Device oldSubdevice = subdevice;
		subdevice = newSubdevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBDEVICE_ASSIGNMENT__SUBDEVICE, oldSubdevice, subdevice));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SUBDEVICE_ASSIGNMENT__TARGET_DEVICE, oldTargetDevice, targetDevice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBDEVICE_ASSIGNMENT__TARGET_DEVICE, oldTargetDevice, targetDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__OPERATION_MODES:
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
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__VARIANTS:
				return getVariants();
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__OPERATION_MODES:
				return getOperationModes();
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__SUBDEVICE:
				if (resolve) return getSubdevice();
				return basicGetSubdevice();
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__TARGET_DEVICE:
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
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__CAPABILITY:
				setCapability((SubdeviceInDeviceCapability)newValue);
				return;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__SUBDEVICE:
				setSubdevice((Device)newValue);
				return;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__TARGET_DEVICE:
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
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__VARIANTS:
				getVariants().clear();
				return;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__CAPABILITY:
				setCapability((SubdeviceInDeviceCapability)null);
				return;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__SUBDEVICE:
				setSubdevice((Device)null);
				return;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__TARGET_DEVICE:
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
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__CAPABILITY:
				return capability != null;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__SUBDEVICE:
				return subdevice != null;
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT__TARGET_DEVICE:
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
				case AllocationsPackage.SUBDEVICE_ASSIGNMENT__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.SUBDEVICE_ASSIGNMENT__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return AllocationsPackage.SUBDEVICE_ASSIGNMENT__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return AllocationsPackage.SUBDEVICE_ASSIGNMENT__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubdeviceAssignmentImpl
