/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrix;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutport;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integrity State Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixImpl#getOutports <em>Outports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixImpl#getInports <em>Inports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrityStateMatrixImpl extends OaamBaseElementAImpl implements IntegrityStateMatrix {
	/**
	 * The cached value of the '{@link #getOutports() <em>Outports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutports()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrityStateOutport> outports;

	/**
	 * The cached value of the '{@link #getInports() <em>Inports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInports()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrityStateInport> inports;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrityStateMatrixRow> rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrityStateMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.INTEGRITY_STATE_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrityStateOutport> getOutports() {
		if (outports == null) {
			outports = new EObjectContainmentEList<IntegrityStateOutport>(IntegrityStateOutport.class, this, FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__OUTPORTS);
		}
		return outports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrityStateInport> getInports() {
		if (inports == null) {
			inports = new EObjectContainmentEList<IntegrityStateInport>(IntegrityStateInport.class, this, FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__INPORTS);
		}
		return inports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrityStateMatrixRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<IntegrityStateMatrixRow>(IntegrityStateMatrixRow.class, this, FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__OUTPORTS:
				return ((InternalEList<?>)getOutports()).basicRemove(otherEnd, msgs);
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__INPORTS:
				return ((InternalEList<?>)getInports()).basicRemove(otherEnd, msgs);
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__OUTPORTS:
				return getOutports();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__INPORTS:
				return getInports();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__ROWS:
				return getRows();
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__OUTPORTS:
				getOutports().clear();
				getOutports().addAll((Collection<? extends IntegrityStateOutport>)newValue);
				return;
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__INPORTS:
				getInports().clear();
				getInports().addAll((Collection<? extends IntegrityStateInport>)newValue);
				return;
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends IntegrityStateMatrixRow>)newValue);
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__OUTPORTS:
				getOutports().clear();
				return;
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__INPORTS:
				getInports().clear();
				return;
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__ROWS:
				getRows().clear();
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__OUTPORTS:
				return outports != null && !outports.isEmpty();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__INPORTS:
				return inports != null && !inports.isEmpty();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX__ROWS:
				return rows != null && !rows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegrityStateMatrixImpl
