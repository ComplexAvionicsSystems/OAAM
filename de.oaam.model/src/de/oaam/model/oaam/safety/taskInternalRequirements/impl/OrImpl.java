/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.impl;

import de.oaam.model.oaam.safety.taskInternalRequirements.Or;
import de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.OrImpl#getExprB <em>Expr B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.OrImpl#getExprA <em>Expr A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrImpl extends BooleanOperatorAImpl implements Or {
	/**
	 * The cached value of the '{@link #getExprB() <em>Expr B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprB()
	 * @generated
	 * @ordered
	 */
	protected RequirementComponentA exprB;

	/**
	 * The cached value of the '{@link #getExprA() <em>Expr A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprA()
	 * @generated
	 * @ordered
	 */
	protected RequirementComponentA exprA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskInternalRequirementsPackage.Literals.OR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA getExprB() {
		if (exprB != null && exprB.eIsProxy()) {
			InternalEObject oldExprB = (InternalEObject)exprB;
			exprB = (RequirementComponentA)eResolveProxy(oldExprB);
			if (exprB != oldExprB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.OR__EXPR_B, oldExprB, exprB));
			}
		}
		return exprB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA basicGetExprB() {
		return exprB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExprB(RequirementComponentA newExprB) {
		RequirementComponentA oldExprB = exprB;
		exprB = newExprB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.OR__EXPR_B, oldExprB, exprB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA getExprA() {
		if (exprA != null && exprA.eIsProxy()) {
			InternalEObject oldExprA = (InternalEObject)exprA;
			exprA = (RequirementComponentA)eResolveProxy(oldExprA);
			if (exprA != oldExprA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.OR__EXPR_A, oldExprA, exprA));
			}
		}
		return exprA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA basicGetExprA() {
		return exprA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExprA(RequirementComponentA newExprA) {
		RequirementComponentA oldExprA = exprA;
		exprA = newExprA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.OR__EXPR_A, oldExprA, exprA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskInternalRequirementsPackage.OR__EXPR_B:
				if (resolve) return getExprB();
				return basicGetExprB();
			case TaskInternalRequirementsPackage.OR__EXPR_A:
				if (resolve) return getExprA();
				return basicGetExprA();
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
			case TaskInternalRequirementsPackage.OR__EXPR_B:
				setExprB((RequirementComponentA)newValue);
				return;
			case TaskInternalRequirementsPackage.OR__EXPR_A:
				setExprA((RequirementComponentA)newValue);
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
			case TaskInternalRequirementsPackage.OR__EXPR_B:
				setExprB((RequirementComponentA)null);
				return;
			case TaskInternalRequirementsPackage.OR__EXPR_A:
				setExprA((RequirementComponentA)null);
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
			case TaskInternalRequirementsPackage.OR__EXPR_B:
				return exprB != null;
			case TaskInternalRequirementsPackage.OR__EXPR_A:
				return exprA != null;
		}
		return super.eIsSet(featureID);
	}

} //OrImpl
