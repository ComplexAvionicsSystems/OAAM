/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrix;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Mode Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixImpl#getInports <em>Inports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixImpl#getOutports <em>Outports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModeMatrixImpl extends OaamBaseElementAImpl implements FailureModeMatrix {
	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModeMatrixRow> rows;

	/**
	 * The cached value of the '{@link #getInports() <em>Inports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInports()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModeInport> inports;

	/**
	 * The cached value of the '{@link #getOutports() <em>Outports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutports()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModeOutport> outports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModeMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.FAILURE_MODE_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModeMatrixRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<FailureModeMatrixRow>(FailureModeMatrixRow.class, this, FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModeInport> getInports() {
		if (inports == null) {
			inports = new EObjectContainmentEList<FailureModeInport>(FailureModeInport.class, this, FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__INPORTS);
		}
		return inports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModeOutport> getOutports() {
		if (outports == null) {
			outports = new EObjectContainmentEList<FailureModeOutport>(FailureModeOutport.class, this, FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__OUTPORTS);
		}
		return outports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__INPORTS:
				return ((InternalEList<?>)getInports()).basicRemove(otherEnd, msgs);
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__OUTPORTS:
				return ((InternalEList<?>)getOutports()).basicRemove(otherEnd, msgs);
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__ROWS:
				return getRows();
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__INPORTS:
				return getInports();
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__OUTPORTS:
				return getOutports();
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends FailureModeMatrixRow>)newValue);
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__INPORTS:
				getInports().clear();
				getInports().addAll((Collection<? extends FailureModeInport>)newValue);
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__OUTPORTS:
				getOutports().clear();
				getOutports().addAll((Collection<? extends FailureModeOutport>)newValue);
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__ROWS:
				getRows().clear();
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__INPORTS:
				getInports().clear();
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__OUTPORTS:
				getOutports().clear();
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__ROWS:
				return rows != null && !rows.isEmpty();
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__INPORTS:
				return inports != null && !inports.isEmpty();
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX__OUTPORTS:
				return outports != null && !outports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FailureModeMatrixImpl
