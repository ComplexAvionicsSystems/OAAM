/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.OutputDeclaration;

import de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.PropagationOutput;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagation Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationOutputImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationOutputImpl#getPropagatedIntegrityStates <em>Propagated Integrity States</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationOutputImpl#getPropagatedFailureModes <em>Propagated Failure Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagationOutputImpl extends OaamBaseElementAImpl implements PropagationOutput {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected OutputDeclaration target;

	/**
	 * The cached value of the '{@link #getPropagatedIntegrityStates() <em>Propagated Integrity States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagatedIntegrityStates()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrityStatePropagatorA> propagatedIntegrityStates;

	/**
	 * The cached value of the '{@link #getPropagatedFailureModes() <em>Propagated Failure Modes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagatedFailureModes()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModePropagatorA> propagatedFailureModes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagationOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationsPackage.Literals.PROPAGATION_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDeclaration getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (OutputDeclaration)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailurePropagationsPackage.PROPAGATION_OUTPUT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDeclaration basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(OutputDeclaration newTarget) {
		OutputDeclaration oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailurePropagationsPackage.PROPAGATION_OUTPUT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrityStatePropagatorA> getPropagatedIntegrityStates() {
		if (propagatedIntegrityStates == null) {
			propagatedIntegrityStates = new EObjectResolvingEList<IntegrityStatePropagatorA>(IntegrityStatePropagatorA.class, this, FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_INTEGRITY_STATES);
		}
		return propagatedIntegrityStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModePropagatorA> getPropagatedFailureModes() {
		if (propagatedFailureModes == null) {
			propagatedFailureModes = new EObjectResolvingEList<FailureModePropagatorA>(FailureModePropagatorA.class, this, FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_FAILURE_MODES);
		}
		return propagatedFailureModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_INTEGRITY_STATES:
				return getPropagatedIntegrityStates();
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_FAILURE_MODES:
				return getPropagatedFailureModes();
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
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__TARGET:
				setTarget((OutputDeclaration)newValue);
				return;
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_INTEGRITY_STATES:
				getPropagatedIntegrityStates().clear();
				getPropagatedIntegrityStates().addAll((Collection<? extends IntegrityStatePropagatorA>)newValue);
				return;
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_FAILURE_MODES:
				getPropagatedFailureModes().clear();
				getPropagatedFailureModes().addAll((Collection<? extends FailureModePropagatorA>)newValue);
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
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__TARGET:
				setTarget((OutputDeclaration)null);
				return;
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_INTEGRITY_STATES:
				getPropagatedIntegrityStates().clear();
				return;
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_FAILURE_MODES:
				getPropagatedFailureModes().clear();
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
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__TARGET:
				return target != null;
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_INTEGRITY_STATES:
				return propagatedIntegrityStates != null && !propagatedIntegrityStates.isEmpty();
			case FailurePropagationsPackage.PROPAGATION_OUTPUT__PROPAGATED_FAILURE_MODES:
				return propagatedFailureModes != null && !propagatedFailureModes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropagationOutputImpl
