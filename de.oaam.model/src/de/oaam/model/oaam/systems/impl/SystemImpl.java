/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.systems.ProvidedInformationA;
import de.oaam.model.oaam.systems.RequiredInformationA;
import de.oaam.model.oaam.systems.SystemsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemImpl#getProvidedOutputs <em>Provided Outputs</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.SystemImpl#getRequiredInputs <em>Required Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends SystemsContainerAImpl implements de.oaam.model.oaam.systems.System {
	/**
	 * The cached value of the '{@link #getProvidedOutputs() <em>Provided Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedInformationA> providedOutputs;

	/**
	 * The cached value of the '{@link #getRequiredInputs() <em>Required Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredInformationA> requiredInputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemsPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedInformationA> getProvidedOutputs() {
		if (providedOutputs == null) {
			providedOutputs = new EObjectContainmentEList<ProvidedInformationA>(ProvidedInformationA.class, this, SystemsPackage.SYSTEM__PROVIDED_OUTPUTS);
		}
		return providedOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredInformationA> getRequiredInputs() {
		if (requiredInputs == null) {
			requiredInputs = new EObjectContainmentEList<RequiredInformationA>(RequiredInformationA.class, this, SystemsPackage.SYSTEM__REQUIRED_INPUTS);
		}
		return requiredInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				return ((InternalEList<?>)getProvidedOutputs()).basicRemove(otherEnd, msgs);
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				return ((InternalEList<?>)getRequiredInputs()).basicRemove(otherEnd, msgs);
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
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				return getProvidedOutputs();
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				return getRequiredInputs();
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
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				getProvidedOutputs().clear();
				getProvidedOutputs().addAll((Collection<? extends ProvidedInformationA>)newValue);
				return;
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				getRequiredInputs().clear();
				getRequiredInputs().addAll((Collection<? extends RequiredInformationA>)newValue);
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
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				getProvidedOutputs().clear();
				return;
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				getRequiredInputs().clear();
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
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
				return providedOutputs != null && !providedOutputs.isEmpty();
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
				return requiredInputs != null && !requiredInputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
