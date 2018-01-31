/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.functions.FunctionsPackage;
import de.oaam.model.oaam.functions.Input;
import de.oaam.model.oaam.functions.Output;
import de.oaam.model.oaam.functions.Signal;

import de.oaam.model.oaam.library.SignalType;

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
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SignalImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SignalImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SignalImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SignalImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SignalImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SignalImpl#getInIndex <em>In Index</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.SignalImpl#getOutIndex <em>Out Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalImpl extends ElementAImpl implements Signal {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Output source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Input target;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SignalType type;

	/**
	 * The default value of the '{@link #getInIndex() <em>In Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int IN_INDEX_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getInIndex() <em>In Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInIndex()
	 * @generated
	 * @ordered
	 */
	protected int inIndex = IN_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutIndex() <em>Out Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int OUT_INDEX_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getOutIndex() <em>Out Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutIndex()
	 * @generated
	 * @ordered
	 */
	protected int outIndex = OUT_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, FunctionsPackage.SIGNAL__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, FunctionsPackage.SIGNAL__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Output)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.SIGNAL__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Output newSource) {
		Output oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SIGNAL__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Input)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.SIGNAL__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Input newTarget) {
		Input oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SIGNAL__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (SignalType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.SIGNAL__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SignalType newType) {
		SignalType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SIGNAL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInIndex() {
		return inIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInIndex(int newInIndex) {
		int oldInIndex = inIndex;
		inIndex = newInIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SIGNAL__IN_INDEX, oldInIndex, inIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutIndex() {
		return outIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutIndex(int newOutIndex) {
		int oldOutIndex = outIndex;
		outIndex = newOutIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SIGNAL__OUT_INDEX, oldOutIndex, outIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.SIGNAL__OPERATION_MODES:
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
			case FunctionsPackage.SIGNAL__VARIANTS:
				return getVariants();
			case FunctionsPackage.SIGNAL__OPERATION_MODES:
				return getOperationModes();
			case FunctionsPackage.SIGNAL__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FunctionsPackage.SIGNAL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FunctionsPackage.SIGNAL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FunctionsPackage.SIGNAL__IN_INDEX:
				return getInIndex();
			case FunctionsPackage.SIGNAL__OUT_INDEX:
				return getOutIndex();
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
			case FunctionsPackage.SIGNAL__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case FunctionsPackage.SIGNAL__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case FunctionsPackage.SIGNAL__SOURCE:
				setSource((Output)newValue);
				return;
			case FunctionsPackage.SIGNAL__TARGET:
				setTarget((Input)newValue);
				return;
			case FunctionsPackage.SIGNAL__TYPE:
				setType((SignalType)newValue);
				return;
			case FunctionsPackage.SIGNAL__IN_INDEX:
				setInIndex((Integer)newValue);
				return;
			case FunctionsPackage.SIGNAL__OUT_INDEX:
				setOutIndex((Integer)newValue);
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
			case FunctionsPackage.SIGNAL__VARIANTS:
				getVariants().clear();
				return;
			case FunctionsPackage.SIGNAL__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case FunctionsPackage.SIGNAL__SOURCE:
				setSource((Output)null);
				return;
			case FunctionsPackage.SIGNAL__TARGET:
				setTarget((Input)null);
				return;
			case FunctionsPackage.SIGNAL__TYPE:
				setType((SignalType)null);
				return;
			case FunctionsPackage.SIGNAL__IN_INDEX:
				setInIndex(IN_INDEX_EDEFAULT);
				return;
			case FunctionsPackage.SIGNAL__OUT_INDEX:
				setOutIndex(OUT_INDEX_EDEFAULT);
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
			case FunctionsPackage.SIGNAL__VARIANTS:
				return variants != null && !variants.isEmpty();
			case FunctionsPackage.SIGNAL__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case FunctionsPackage.SIGNAL__SOURCE:
				return source != null;
			case FunctionsPackage.SIGNAL__TARGET:
				return target != null;
			case FunctionsPackage.SIGNAL__TYPE:
				return type != null;
			case FunctionsPackage.SIGNAL__IN_INDEX:
				return inIndex != IN_INDEX_EDEFAULT;
			case FunctionsPackage.SIGNAL__OUT_INDEX:
				return outIndex != OUT_INDEX_EDEFAULT;
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
				case FunctionsPackage.SIGNAL__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.SIGNAL__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return FunctionsPackage.SIGNAL__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return FunctionsPackage.SIGNAL__OPERATION_MODES;
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
		result.append(" (inIndex: ");
		result.append(inIndex);
		result.append(", outIndex: ");
		result.append(outIndex);
		result.append(')');
		return result.toString();
	}

} //SignalImpl
