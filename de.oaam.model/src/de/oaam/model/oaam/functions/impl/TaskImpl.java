/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.common.impl._ElementAImpl;

import de.oaam.model.oaam.functions.FunctionsPackage;
import de.oaam.model.oaam.functions.Input;
import de.oaam.model.oaam.functions.Output;
import de.oaam.model.oaam.functions.Parameter;
import de.oaam.model.oaam.functions.Task;

import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.library.TaskType;

import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getDeviceBinding <em>Device Binding</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getNParallels <em>NParallels</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.TaskImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends _ElementAImpl implements Task {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TaskType type;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected de.oaam.model.oaam.systems.System implements_;

	/**
	 * The cached value of the '{@link #getDeviceBinding() <em>Device Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceBinding()
	 * @generated
	 * @ordered
	 */
	protected Device deviceBinding;

	/**
	 * The default value of the '{@link #getNParallels() <em>NParallels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNParallels()
	 * @generated
	 * @ordered
	 */
	protected static final int NPARALLELS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNParallels() <em>NParallels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNParallels()
	 * @generated
	 * @ordered
	 */
	protected int nParallels = NPARALLELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedRate() <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRate()
	 * @generated
	 * @ordered
	 */
	protected static final double FIXED_RATE_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getFixedRate() <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRate()
	 * @generated
	 * @ordered
	 */
	protected double fixedRate = FIXED_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, FunctionsPackage.TASK__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, FunctionsPackage.TASK__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TaskType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.TASK__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TaskType newType) {
		TaskType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, FunctionsPackage.TASK__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, FunctionsPackage.TASK__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oaam.model.oaam.systems.System getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject)implements_;
			implements_ = (de.oaam.model.oaam.systems.System)eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.TASK__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oaam.model.oaam.systems.System basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(de.oaam.model.oaam.systems.System newImplements) {
		de.oaam.model.oaam.systems.System oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDeviceBinding() {
		if (deviceBinding != null && deviceBinding.eIsProxy()) {
			InternalEObject oldDeviceBinding = (InternalEObject)deviceBinding;
			deviceBinding = (Device)eResolveProxy(oldDeviceBinding);
			if (deviceBinding != oldDeviceBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.TASK__DEVICE_BINDING, oldDeviceBinding, deviceBinding));
			}
		}
		return deviceBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDeviceBinding() {
		return deviceBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceBinding(Device newDeviceBinding) {
		Device oldDeviceBinding = deviceBinding;
		deviceBinding = newDeviceBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK__DEVICE_BINDING, oldDeviceBinding, deviceBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNParallels() {
		return nParallels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNParallels(int newNParallels) {
		int oldNParallels = nParallels;
		nParallels = newNParallels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK__NPARALLELS, oldNParallels, nParallels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFixedRate() {
		return fixedRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedRate(double newFixedRate) {
		double oldFixedRate = fixedRate;
		fixedRate = newFixedRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.TASK__FIXED_RATE, oldFixedRate, fixedRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, FunctionsPackage.TASK__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.TASK__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.TASK__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.TASK__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.TASK__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case FunctionsPackage.TASK__VARIANTS:
				return getVariants();
			case FunctionsPackage.TASK__OPERATION_MODES:
				return getOperationModes();
			case FunctionsPackage.TASK__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FunctionsPackage.TASK__INPUTS:
				return getInputs();
			case FunctionsPackage.TASK__OUTPUTS:
				return getOutputs();
			case FunctionsPackage.TASK__IMPLEMENTS:
				if (resolve) return getImplements();
				return basicGetImplements();
			case FunctionsPackage.TASK__DEVICE_BINDING:
				if (resolve) return getDeviceBinding();
				return basicGetDeviceBinding();
			case FunctionsPackage.TASK__NPARALLELS:
				return getNParallels();
			case FunctionsPackage.TASK__FIXED_RATE:
				return getFixedRate();
			case FunctionsPackage.TASK__PARAMETERS:
				return getParameters();
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
			case FunctionsPackage.TASK__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case FunctionsPackage.TASK__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case FunctionsPackage.TASK__TYPE:
				setType((TaskType)newValue);
				return;
			case FunctionsPackage.TASK__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Input>)newValue);
				return;
			case FunctionsPackage.TASK__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Output>)newValue);
				return;
			case FunctionsPackage.TASK__IMPLEMENTS:
				setImplements((de.oaam.model.oaam.systems.System)newValue);
				return;
			case FunctionsPackage.TASK__DEVICE_BINDING:
				setDeviceBinding((Device)newValue);
				return;
			case FunctionsPackage.TASK__NPARALLELS:
				setNParallels((Integer)newValue);
				return;
			case FunctionsPackage.TASK__FIXED_RATE:
				setFixedRate((Double)newValue);
				return;
			case FunctionsPackage.TASK__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case FunctionsPackage.TASK__VARIANTS:
				getVariants().clear();
				return;
			case FunctionsPackage.TASK__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case FunctionsPackage.TASK__TYPE:
				setType((TaskType)null);
				return;
			case FunctionsPackage.TASK__INPUTS:
				getInputs().clear();
				return;
			case FunctionsPackage.TASK__OUTPUTS:
				getOutputs().clear();
				return;
			case FunctionsPackage.TASK__IMPLEMENTS:
				setImplements((de.oaam.model.oaam.systems.System)null);
				return;
			case FunctionsPackage.TASK__DEVICE_BINDING:
				setDeviceBinding((Device)null);
				return;
			case FunctionsPackage.TASK__NPARALLELS:
				setNParallels(NPARALLELS_EDEFAULT);
				return;
			case FunctionsPackage.TASK__FIXED_RATE:
				setFixedRate(FIXED_RATE_EDEFAULT);
				return;
			case FunctionsPackage.TASK__PARAMETERS:
				getParameters().clear();
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
			case FunctionsPackage.TASK__VARIANTS:
				return variants != null && !variants.isEmpty();
			case FunctionsPackage.TASK__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case FunctionsPackage.TASK__TYPE:
				return type != null;
			case FunctionsPackage.TASK__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case FunctionsPackage.TASK__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case FunctionsPackage.TASK__IMPLEMENTS:
				return implements_ != null;
			case FunctionsPackage.TASK__DEVICE_BINDING:
				return deviceBinding != null;
			case FunctionsPackage.TASK__NPARALLELS:
				return nParallels != NPARALLELS_EDEFAULT;
			case FunctionsPackage.TASK__FIXED_RATE:
				return fixedRate != FIXED_RATE_EDEFAULT;
			case FunctionsPackage.TASK__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		if (baseClass == _VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.TASK__VARIANTS: return ScenarioPackage._VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == _ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.TASK__OPERATION_MODES: return ScenarioPackage._MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
		if (baseClass == _VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage._VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return FunctionsPackage.TASK__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == _ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage._MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return FunctionsPackage.TASK__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nParallels: ");
		result.append(nParallels);
		result.append(", fixedRate: ");
		result.append(fixedRate);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
