/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.impl;

import de.oaam.model.oaam.safety.taskInternalRequirements.Contract;
import de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ContractImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ContractImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ContractImpl#getInvariant <em>Invariant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends ComplexOperatorAImpl implements Contract {
	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected RequirementComponentA preCondition;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected RequirementComponentA postCondition;

	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected RequirementComponentA invariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskInternalRequirementsPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA getPreCondition() {
		if (preCondition != null && preCondition.eIsProxy()) {
			InternalEObject oldPreCondition = (InternalEObject)preCondition;
			preCondition = (RequirementComponentA)eResolveProxy(oldPreCondition);
			if (preCondition != oldPreCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.CONTRACT__PRE_CONDITION, oldPreCondition, preCondition));
			}
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA basicGetPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(RequirementComponentA newPreCondition) {
		RequirementComponentA oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.CONTRACT__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA getPostCondition() {
		if (postCondition != null && postCondition.eIsProxy()) {
			InternalEObject oldPostCondition = (InternalEObject)postCondition;
			postCondition = (RequirementComponentA)eResolveProxy(oldPostCondition);
			if (postCondition != oldPostCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.CONTRACT__POST_CONDITION, oldPostCondition, postCondition));
			}
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA basicGetPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(RequirementComponentA newPostCondition) {
		RequirementComponentA oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.CONTRACT__POST_CONDITION, oldPostCondition, postCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA getInvariant() {
		if (invariant != null && invariant.eIsProxy()) {
			InternalEObject oldInvariant = (InternalEObject)invariant;
			invariant = (RequirementComponentA)eResolveProxy(oldInvariant);
			if (invariant != oldInvariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.CONTRACT__INVARIANT, oldInvariant, invariant));
			}
		}
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA basicGetInvariant() {
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariant(RequirementComponentA newInvariant) {
		RequirementComponentA oldInvariant = invariant;
		invariant = newInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.CONTRACT__INVARIANT, oldInvariant, invariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskInternalRequirementsPackage.CONTRACT__PRE_CONDITION:
				if (resolve) return getPreCondition();
				return basicGetPreCondition();
			case TaskInternalRequirementsPackage.CONTRACT__POST_CONDITION:
				if (resolve) return getPostCondition();
				return basicGetPostCondition();
			case TaskInternalRequirementsPackage.CONTRACT__INVARIANT:
				if (resolve) return getInvariant();
				return basicGetInvariant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskInternalRequirementsPackage.CONTRACT__PRE_CONDITION:
				setPreCondition((RequirementComponentA)newValue);
				return;
			case TaskInternalRequirementsPackage.CONTRACT__POST_CONDITION:
				setPostCondition((RequirementComponentA)newValue);
				return;
			case TaskInternalRequirementsPackage.CONTRACT__INVARIANT:
				setInvariant((RequirementComponentA)newValue);
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
			case TaskInternalRequirementsPackage.CONTRACT__PRE_CONDITION:
				setPreCondition((RequirementComponentA)null);
				return;
			case TaskInternalRequirementsPackage.CONTRACT__POST_CONDITION:
				setPostCondition((RequirementComponentA)null);
				return;
			case TaskInternalRequirementsPackage.CONTRACT__INVARIANT:
				setInvariant((RequirementComponentA)null);
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
			case TaskInternalRequirementsPackage.CONTRACT__PRE_CONDITION:
				return preCondition != null;
			case TaskInternalRequirementsPackage.CONTRACT__POST_CONDITION:
				return postCondition != null;
			case TaskInternalRequirementsPackage.CONTRACT__INVARIANT:
				return invariant != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
