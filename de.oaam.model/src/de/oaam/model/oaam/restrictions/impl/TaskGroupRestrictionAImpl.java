/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.functions.TaskGroup;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.TaskGroupRestrictionA;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Group Restriction A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.TaskGroupRestrictionAImpl#getTaskGroups <em>Task Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskGroupRestrictionAImpl extends MinimalEObjectImpl.Container implements TaskGroupRestrictionA {
	/**
	 * The cached value of the '{@link #getTaskGroups() <em>Task Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskGroup> taskGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskGroupRestrictionAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.TASK_GROUP_RESTRICTION_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskGroup> getTaskGroups() {
		if (taskGroups == null) {
			taskGroups = new EObjectResolvingEList<TaskGroup>(TaskGroup.class, this, RestrictionsPackage.TASK_GROUP_RESTRICTION_A__TASK_GROUPS);
		}
		return taskGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestrictionsPackage.TASK_GROUP_RESTRICTION_A__TASK_GROUPS:
				return getTaskGroups();
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
			case RestrictionsPackage.TASK_GROUP_RESTRICTION_A__TASK_GROUPS:
				getTaskGroups().clear();
				getTaskGroups().addAll((Collection<? extends TaskGroup>)newValue);
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
			case RestrictionsPackage.TASK_GROUP_RESTRICTION_A__TASK_GROUPS:
				getTaskGroups().clear();
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
			case RestrictionsPackage.TASK_GROUP_RESTRICTION_A__TASK_GROUPS:
				return taskGroups != null && !taskGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskGroupRestrictionAImpl
