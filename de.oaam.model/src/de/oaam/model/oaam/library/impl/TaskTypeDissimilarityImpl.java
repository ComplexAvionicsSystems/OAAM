/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.TaskType;
import de.oaam.model.oaam.library.TaskTypeDissimilarity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Type Dissimilarity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeDissimilarityImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.TaskTypeDissimilarityImpl#getPercentageOfCommonCode <em>Percentage Of Common Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskTypeDissimilarityImpl extends OaamBaseElementAImpl implements TaskTypeDissimilarity {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskType> tasks;

	/**
	 * The default value of the '{@link #getPercentageOfCommonCode() <em>Percentage Of Common Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfCommonCode()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_COMMON_CODE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfCommonCode() <em>Percentage Of Common Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfCommonCode()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfCommonCode = PERCENTAGE_OF_COMMON_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTypeDissimilarityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.TASK_TYPE_DISSIMILARITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskType> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<TaskType>(TaskType.class, this, LibraryPackage.TASK_TYPE_DISSIMILARITY__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfCommonCode() {
		return percentageOfCommonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfCommonCode(double newPercentageOfCommonCode) {
		double oldPercentageOfCommonCode = percentageOfCommonCode;
		percentageOfCommonCode = newPercentageOfCommonCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TASK_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_CODE, oldPercentageOfCommonCode, percentageOfCommonCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.TASK_TYPE_DISSIMILARITY__TASKS:
				return getTasks();
			case LibraryPackage.TASK_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_CODE:
				return getPercentageOfCommonCode();
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
			case LibraryPackage.TASK_TYPE_DISSIMILARITY__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends TaskType>)newValue);
				return;
			case LibraryPackage.TASK_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_CODE:
				setPercentageOfCommonCode((Double)newValue);
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
			case LibraryPackage.TASK_TYPE_DISSIMILARITY__TASKS:
				getTasks().clear();
				return;
			case LibraryPackage.TASK_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_CODE:
				setPercentageOfCommonCode(PERCENTAGE_OF_COMMON_CODE_EDEFAULT);
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
			case LibraryPackage.TASK_TYPE_DISSIMILARITY__TASKS:
				return tasks != null && !tasks.isEmpty();
			case LibraryPackage.TASK_TYPE_DISSIMILARITY__PERCENTAGE_OF_COMMON_CODE:
				return percentageOfCommonCode != PERCENTAGE_OF_COMMON_CODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (percentageOfCommonCode: ");
		result.append(percentageOfCommonCode);
		result.append(')');
		return result.toString();
	}

} //TaskTypeDissimilarityImpl
