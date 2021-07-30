/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagation;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;
import de.oaam.model.oaam.safety.failurePropagations.PropagatorA;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.FailurePropagationImpl#getPropagators <em>Propagators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailurePropagationImpl extends OaamBaseElementAImpl implements FailurePropagation {
	/**
	 * The cached value of the '{@link #getPropagators() <em>Propagators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagators()
	 * @generated
	 * @ordered
	 */
	protected EList<PropagatorA> propagators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailurePropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationsPackage.Literals.FAILURE_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropagatorA> getPropagators() {
		if (propagators == null) {
			propagators = new EObjectContainmentEList<PropagatorA>(PropagatorA.class, this, FailurePropagationsPackage.FAILURE_PROPAGATION__PROPAGATORS);
		}
		return propagators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailurePropagationsPackage.FAILURE_PROPAGATION__PROPAGATORS:
				return ((InternalEList<?>)getPropagators()).basicRemove(otherEnd, msgs);
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
			case FailurePropagationsPackage.FAILURE_PROPAGATION__PROPAGATORS:
				return getPropagators();
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
			case FailurePropagationsPackage.FAILURE_PROPAGATION__PROPAGATORS:
				getPropagators().clear();
				getPropagators().addAll((Collection<? extends PropagatorA>)newValue);
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
			case FailurePropagationsPackage.FAILURE_PROPAGATION__PROPAGATORS:
				getPropagators().clear();
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
			case FailurePropagationsPackage.FAILURE_PROPAGATION__PROPAGATORS:
				return propagators != null && !propagators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FailurePropagationImpl
