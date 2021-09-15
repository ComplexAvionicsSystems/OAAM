/**
 */
package de.oaam.model.oaam.safety.failurePropagations.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.FailureModePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;
import de.oaam.model.oaam.safety.failurePropagations.IntegrityStatePropagatorA;
import de.oaam.model.oaam.safety.failurePropagations.PropagationSink;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagation Sink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSinkImpl#getPropagatedIntegrityStates <em>Propagated Integrity States</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.impl.PropagationSinkImpl#getPropagatedFailureModes <em>Propagated Failure Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagationSinkImpl extends OaamBaseElementAImpl implements PropagationSink {
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
	protected PropagationSinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationsPackage.Literals.PROPAGATION_SINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrityStatePropagatorA> getPropagatedIntegrityStates() {
		if (propagatedIntegrityStates == null) {
			propagatedIntegrityStates = new EObjectResolvingEList<IntegrityStatePropagatorA>(IntegrityStatePropagatorA.class, this, FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_INTEGRITY_STATES);
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
			propagatedFailureModes = new EObjectResolvingEList<FailureModePropagatorA>(FailureModePropagatorA.class, this, FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_FAILURE_MODES);
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
			case FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_INTEGRITY_STATES:
				return getPropagatedIntegrityStates();
			case FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_FAILURE_MODES:
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
			case FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_INTEGRITY_STATES:
				getPropagatedIntegrityStates().clear();
				getPropagatedIntegrityStates().addAll((Collection<? extends IntegrityStatePropagatorA>)newValue);
				return;
			case FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_FAILURE_MODES:
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
			case FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_INTEGRITY_STATES:
				getPropagatedIntegrityStates().clear();
				return;
			case FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_FAILURE_MODES:
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
			case FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_INTEGRITY_STATES:
				return propagatedIntegrityStates != null && !propagatedIntegrityStates.isEmpty();
			case FailurePropagationsPackage.PROPAGATION_SINK__PROPAGATED_FAILURE_MODES:
				return propagatedFailureModes != null && !propagatedFailureModes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropagationSinkImpl
