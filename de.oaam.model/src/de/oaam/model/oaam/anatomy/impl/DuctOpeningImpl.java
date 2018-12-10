/**
 */
package de.oaam.model.oaam.anatomy.impl;

import de.oaam.model.oaam.anatomy.AnatomyPackage;
import de.oaam.model.oaam.anatomy.DuctOpening;
import de.oaam.model.oaam.anatomy.Position3D;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.DuctOpeningDeclaration;

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
 * An implementation of the model object '<em><b>Duct Opening</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctOpeningImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctOpeningImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctOpeningImpl#getRelativPosition <em>Relativ Position</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctOpeningImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DuctOpeningImpl extends OaamBaseElementAImpl implements DuctOpening {
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
	 * The cached value of the '{@link #getRelativPosition() <em>Relativ Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativPosition()
	 * @generated
	 * @ordered
	 */
	protected Position3D relativPosition;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected DuctOpeningDeclaration declaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DuctOpeningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnatomyPackage.Literals.DUCT_OPENING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AnatomyPackage.DUCT_OPENING__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, AnatomyPackage.DUCT_OPENING__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position3D getRelativPosition() {
		return relativPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativPosition(Position3D newRelativPosition, NotificationChain msgs) {
		Position3D oldRelativPosition = relativPosition;
		relativPosition = newRelativPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT_OPENING__RELATIV_POSITION, oldRelativPosition, newRelativPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativPosition(Position3D newRelativPosition) {
		if (newRelativPosition != relativPosition) {
			NotificationChain msgs = null;
			if (relativPosition != null)
				msgs = ((InternalEObject)relativPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnatomyPackage.DUCT_OPENING__RELATIV_POSITION, null, msgs);
			if (newRelativPosition != null)
				msgs = ((InternalEObject)newRelativPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnatomyPackage.DUCT_OPENING__RELATIV_POSITION, null, msgs);
			msgs = basicSetRelativPosition(newRelativPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT_OPENING__RELATIV_POSITION, newRelativPosition, newRelativPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctOpeningDeclaration getDeclaration() {
		if (declaration != null && declaration.eIsProxy()) {
			InternalEObject oldDeclaration = (InternalEObject)declaration;
			declaration = (DuctOpeningDeclaration)eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnatomyPackage.DUCT_OPENING__DECLARATION, oldDeclaration, declaration));
			}
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctOpeningDeclaration basicGetDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(DuctOpeningDeclaration newDeclaration) {
		DuctOpeningDeclaration oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT_OPENING__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnatomyPackage.DUCT_OPENING__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case AnatomyPackage.DUCT_OPENING__RELATIV_POSITION:
				return basicSetRelativPosition(null, msgs);
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
			case AnatomyPackage.DUCT_OPENING__VARIANTS:
				return getVariants();
			case AnatomyPackage.DUCT_OPENING__OPERATION_MODES:
				return getOperationModes();
			case AnatomyPackage.DUCT_OPENING__RELATIV_POSITION:
				return getRelativPosition();
			case AnatomyPackage.DUCT_OPENING__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
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
			case AnatomyPackage.DUCT_OPENING__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AnatomyPackage.DUCT_OPENING__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case AnatomyPackage.DUCT_OPENING__RELATIV_POSITION:
				setRelativPosition((Position3D)newValue);
				return;
			case AnatomyPackage.DUCT_OPENING__DECLARATION:
				setDeclaration((DuctOpeningDeclaration)newValue);
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
			case AnatomyPackage.DUCT_OPENING__VARIANTS:
				getVariants().clear();
				return;
			case AnatomyPackage.DUCT_OPENING__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case AnatomyPackage.DUCT_OPENING__RELATIV_POSITION:
				setRelativPosition((Position3D)null);
				return;
			case AnatomyPackage.DUCT_OPENING__DECLARATION:
				setDeclaration((DuctOpeningDeclaration)null);
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
			case AnatomyPackage.DUCT_OPENING__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AnatomyPackage.DUCT_OPENING__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case AnatomyPackage.DUCT_OPENING__RELATIV_POSITION:
				return relativPosition != null;
			case AnatomyPackage.DUCT_OPENING__DECLARATION:
				return declaration != null;
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
				case AnatomyPackage.DUCT_OPENING__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case AnatomyPackage.DUCT_OPENING__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return AnatomyPackage.DUCT_OPENING__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return AnatomyPackage.DUCT_OPENING__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DuctOpeningImpl
