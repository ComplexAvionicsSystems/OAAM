/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.impl;

import de.oaam.model.oaam.safety.taskInternalRequirements.ComparatorA;
import de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparator A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComparatorAImpl#getCompA <em>Comp A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.ComparatorAImpl#getCompB <em>Comp B</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComparatorAImpl extends RequirementComponentAImpl implements ComparatorA {
	/**
	 * The cached value of the '{@link #getCompA() <em>Comp A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompA()
	 * @generated
	 * @ordered
	 */
	protected RequirementComponentA compA;

	/**
	 * The cached value of the '{@link #getCompB() <em>Comp B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompB()
	 * @generated
	 * @ordered
	 */
	protected RequirementComponentA compB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparatorAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskInternalRequirementsPackage.Literals.COMPARATOR_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA getCompA() {
		if (compA != null && compA.eIsProxy()) {
			InternalEObject oldCompA = (InternalEObject)compA;
			compA = (RequirementComponentA)eResolveProxy(oldCompA);
			if (compA != oldCompA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.COMPARATOR_A__COMP_A, oldCompA, compA));
			}
		}
		return compA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA basicGetCompA() {
		return compA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompA(RequirementComponentA newCompA) {
		RequirementComponentA oldCompA = compA;
		compA = newCompA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.COMPARATOR_A__COMP_A, oldCompA, compA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA getCompB() {
		if (compB != null && compB.eIsProxy()) {
			InternalEObject oldCompB = (InternalEObject)compB;
			compB = (RequirementComponentA)eResolveProxy(oldCompB);
			if (compB != oldCompB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.COMPARATOR_A__COMP_B, oldCompB, compB));
			}
		}
		return compB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA basicGetCompB() {
		return compB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompB(RequirementComponentA newCompB) {
		RequirementComponentA oldCompB = compB;
		compB = newCompB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.COMPARATOR_A__COMP_B, oldCompB, compB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskInternalRequirementsPackage.COMPARATOR_A__COMP_A:
				if (resolve) return getCompA();
				return basicGetCompA();
			case TaskInternalRequirementsPackage.COMPARATOR_A__COMP_B:
				if (resolve) return getCompB();
				return basicGetCompB();
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
			case TaskInternalRequirementsPackage.COMPARATOR_A__COMP_A:
				setCompA((RequirementComponentA)newValue);
				return;
			case TaskInternalRequirementsPackage.COMPARATOR_A__COMP_B:
				setCompB((RequirementComponentA)newValue);
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
			case TaskInternalRequirementsPackage.COMPARATOR_A__COMP_A:
				setCompA((RequirementComponentA)null);
				return;
			case TaskInternalRequirementsPackage.COMPARATOR_A__COMP_B:
				setCompB((RequirementComponentA)null);
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
			case TaskInternalRequirementsPackage.COMPARATOR_A__COMP_A:
				return compA != null;
			case TaskInternalRequirementsPackage.COMPARATOR_A__COMP_B:
				return compB != null;
		}
		return super.eIsSet(featureID);
	}

} //ComparatorAImpl
