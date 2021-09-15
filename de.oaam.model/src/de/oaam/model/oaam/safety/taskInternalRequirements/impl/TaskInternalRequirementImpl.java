/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.taskInternalRequirements.RequirementComponentA;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Internal Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.TaskInternalRequirementImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskInternalRequirementImpl extends OaamBaseElementAImpl implements TaskInternalRequirement {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementComponentA> components;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected RequirementComponentA requires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInternalRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementComponentA> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<RequirementComponentA>(RequirementComponentA.class, this, TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA getRequires() {
		if (requires != null && requires.eIsProxy()) {
			InternalEObject oldRequires = (InternalEObject)requires;
			requires = (RequirementComponentA)eResolveProxy(oldRequires);
			if (requires != oldRequires) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__REQUIRES, oldRequires, requires));
			}
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementComponentA basicGetRequires() {
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequires(RequirementComponentA newRequires) {
		RequirementComponentA oldRequires = requires;
		requires = newRequires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__REQUIRES, oldRequires, requires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__COMPONENTS:
				return getComponents();
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__REQUIRES:
				if (resolve) return getRequires();
				return basicGetRequires();
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
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends RequirementComponentA>)newValue);
				return;
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__REQUIRES:
				setRequires((RequirementComponentA)newValue);
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
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__COMPONENTS:
				getComponents().clear();
				return;
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__REQUIRES:
				setRequires((RequirementComponentA)null);
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
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__COMPONENTS:
				return components != null && !components.isEmpty();
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__REQUIRES:
				return requires != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskInternalRequirementImpl
