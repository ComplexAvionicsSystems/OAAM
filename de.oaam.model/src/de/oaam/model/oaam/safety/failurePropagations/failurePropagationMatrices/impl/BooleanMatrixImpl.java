/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInport;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrix;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutport;
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
 * An implementation of the model object '<em><b>Boolean Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixImpl#getOutports <em>Outports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixImpl#getInports <em>Inports</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanMatrixImpl extends OaamBaseElementAImpl implements BooleanMatrix {
	/**
	 * The cached value of the '{@link #getOutports() <em>Outports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutports()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOutport> outports;

	/**
	 * The cached value of the '{@link #getInports() <em>Inports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInports()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanInport> inports;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanMatrixRow> rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.BOOLEAN_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanOutport> getOutports() {
		if (outports == null) {
			outports = new EObjectContainmentEList<BooleanOutport>(BooleanOutport.class, this, FailurePropagationMatricesPackage.BOOLEAN_MATRIX__OUTPORTS);
		}
		return outports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanInport> getInports() {
		if (inports == null) {
			inports = new EObjectContainmentEList<BooleanInport>(BooleanInport.class, this, FailurePropagationMatricesPackage.BOOLEAN_MATRIX__INPORTS);
		}
		return inports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanMatrixRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<BooleanMatrixRow>(BooleanMatrixRow.class, this, FailurePropagationMatricesPackage.BOOLEAN_MATRIX__ROWS);
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__OUTPORTS:
				return ((InternalEList<?>)getOutports()).basicRemove(otherEnd, msgs);
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__INPORTS:
				return ((InternalEList<?>)getInports()).basicRemove(otherEnd, msgs);
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__ROWS:
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__OUTPORTS:
				return getOutports();
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__INPORTS:
				return getInports();
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__ROWS:
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__OUTPORTS:
				getOutports().clear();
				getOutports().addAll((Collection<? extends BooleanOutport>)newValue);
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__INPORTS:
				getInports().clear();
				getInports().addAll((Collection<? extends BooleanInport>)newValue);
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends BooleanMatrixRow>)newValue);
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__OUTPORTS:
				getOutports().clear();
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__INPORTS:
				getInports().clear();
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__ROWS:
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__OUTPORTS:
				return outports != null && !outports.isEmpty();
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__INPORTS:
				return inports != null && !inports.isEmpty();
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX__ROWS:
				return rows != null && !rows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BooleanMatrixImpl
