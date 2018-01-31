/**
 */
package de.oaam.model.oaam.functions.impl;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.functions.FunctionsPackage;
import de.oaam.model.oaam.functions.Input;
import de.oaam.model.oaam.functions.OutputLink;

import de.oaam.model.oaam.hardware.Io;

import de.oaam.model.oaam.library.InputDeclaration;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import de.oaam.model.oaam.systems.RequiredInputA;

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
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.impl.InputImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.InputImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.InputImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.InputImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.InputImpl#getIoBindings <em>Io Bindings</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.InputImpl#getQueueLength <em>Queue Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.impl.InputImpl#getOutputLink <em>Output Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends ElementAImpl implements Input {
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
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected InputDeclaration declaration;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected RequiredInputA implements_;

	/**
	 * The cached value of the '{@link #getIoBindings() <em>Io Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Io> ioBindings;

	/**
	 * The default value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected int queueLength = QUEUE_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputLink() <em>Output Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLink()
	 * @generated
	 * @ordered
	 */
	protected OutputLink outputLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, FunctionsPackage.INPUT__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, FunctionsPackage.INPUT__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDeclaration getDeclaration() {
		if (declaration != null && declaration.eIsProxy()) {
			InternalEObject oldDeclaration = (InternalEObject)declaration;
			declaration = (InputDeclaration)eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.INPUT__DECLARATION, oldDeclaration, declaration));
			}
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDeclaration basicGetDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(InputDeclaration newDeclaration) {
		InputDeclaration oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.INPUT__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInputA getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject)implements_;
			implements_ = (RequiredInputA)eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.INPUT__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInputA basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(RequiredInputA newImplements) {
		RequiredInputA oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.INPUT__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Io> getIoBindings() {
		if (ioBindings == null) {
			ioBindings = new EObjectResolvingEList<Io>(Io.class, this, FunctionsPackage.INPUT__IO_BINDINGS);
		}
		return ioBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueLength() {
		return queueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueLength(int newQueueLength) {
		int oldQueueLength = queueLength;
		queueLength = newQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.INPUT__QUEUE_LENGTH, oldQueueLength, queueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputLink getOutputLink() {
		return outputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputLink(OutputLink newOutputLink, NotificationChain msgs) {
		OutputLink oldOutputLink = outputLink;
		outputLink = newOutputLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.INPUT__OUTPUT_LINK, oldOutputLink, newOutputLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputLink(OutputLink newOutputLink) {
		if (newOutputLink != outputLink) {
			NotificationChain msgs = null;
			if (outputLink != null)
				msgs = ((InternalEObject)outputLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.INPUT__OUTPUT_LINK, null, msgs);
			if (newOutputLink != null)
				msgs = ((InternalEObject)newOutputLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.INPUT__OUTPUT_LINK, null, msgs);
			msgs = basicSetOutputLink(newOutputLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.INPUT__OUTPUT_LINK, newOutputLink, newOutputLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.INPUT__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.INPUT__OUTPUT_LINK:
				return basicSetOutputLink(null, msgs);
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
			case FunctionsPackage.INPUT__VARIANTS:
				return getVariants();
			case FunctionsPackage.INPUT__OPERATION_MODES:
				return getOperationModes();
			case FunctionsPackage.INPUT__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
			case FunctionsPackage.INPUT__IMPLEMENTS:
				if (resolve) return getImplements();
				return basicGetImplements();
			case FunctionsPackage.INPUT__IO_BINDINGS:
				return getIoBindings();
			case FunctionsPackage.INPUT__QUEUE_LENGTH:
				return getQueueLength();
			case FunctionsPackage.INPUT__OUTPUT_LINK:
				return getOutputLink();
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
			case FunctionsPackage.INPUT__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case FunctionsPackage.INPUT__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case FunctionsPackage.INPUT__DECLARATION:
				setDeclaration((InputDeclaration)newValue);
				return;
			case FunctionsPackage.INPUT__IMPLEMENTS:
				setImplements((RequiredInputA)newValue);
				return;
			case FunctionsPackage.INPUT__IO_BINDINGS:
				getIoBindings().clear();
				getIoBindings().addAll((Collection<? extends Io>)newValue);
				return;
			case FunctionsPackage.INPUT__QUEUE_LENGTH:
				setQueueLength((Integer)newValue);
				return;
			case FunctionsPackage.INPUT__OUTPUT_LINK:
				setOutputLink((OutputLink)newValue);
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
			case FunctionsPackage.INPUT__VARIANTS:
				getVariants().clear();
				return;
			case FunctionsPackage.INPUT__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case FunctionsPackage.INPUT__DECLARATION:
				setDeclaration((InputDeclaration)null);
				return;
			case FunctionsPackage.INPUT__IMPLEMENTS:
				setImplements((RequiredInputA)null);
				return;
			case FunctionsPackage.INPUT__IO_BINDINGS:
				getIoBindings().clear();
				return;
			case FunctionsPackage.INPUT__QUEUE_LENGTH:
				setQueueLength(QUEUE_LENGTH_EDEFAULT);
				return;
			case FunctionsPackage.INPUT__OUTPUT_LINK:
				setOutputLink((OutputLink)null);
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
			case FunctionsPackage.INPUT__VARIANTS:
				return variants != null && !variants.isEmpty();
			case FunctionsPackage.INPUT__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case FunctionsPackage.INPUT__DECLARATION:
				return declaration != null;
			case FunctionsPackage.INPUT__IMPLEMENTS:
				return implements_ != null;
			case FunctionsPackage.INPUT__IO_BINDINGS:
				return ioBindings != null && !ioBindings.isEmpty();
			case FunctionsPackage.INPUT__QUEUE_LENGTH:
				return queueLength != QUEUE_LENGTH_EDEFAULT;
			case FunctionsPackage.INPUT__OUTPUT_LINK:
				return outputLink != null;
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
				case FunctionsPackage.INPUT__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.INPUT__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return FunctionsPackage.INPUT__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return FunctionsPackage.INPUT__OPERATION_MODES;
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
		result.append(" (queueLength: ");
		result.append(queueLength);
		result.append(')');
		return result.toString();
	}

} //InputImpl
