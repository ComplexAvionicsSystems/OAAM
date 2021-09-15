/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeInportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailureModeOutportEntry;
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
 * An implementation of the model object '<em><b>Failure Mode Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixRowImpl#getInportEntries <em>Inport Entries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.FailureModeMatrixRowImpl#getOutportEntries <em>Outport Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModeMatrixRowImpl extends OaamBaseElementAImpl implements FailureModeMatrixRow {
	/**
	 * The cached value of the '{@link #getInportEntries() <em>Inport Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInportEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModeInportEntry> inportEntries;

	/**
	 * The cached value of the '{@link #getOutportEntries() <em>Outport Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutportEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModeOutportEntry> outportEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModeMatrixRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.FAILURE_MODE_MATRIX_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModeInportEntry> getInportEntries() {
		if (inportEntries == null) {
			inportEntries = new EObjectContainmentEList<FailureModeInportEntry>(FailureModeInportEntry.class, this, FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__INPORT_ENTRIES);
		}
		return inportEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModeOutportEntry> getOutportEntries() {
		if (outportEntries == null) {
			outportEntries = new EObjectContainmentEList<FailureModeOutportEntry>(FailureModeOutportEntry.class, this, FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__OUTPORT_ENTRIES);
		}
		return outportEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__INPORT_ENTRIES:
				return ((InternalEList<?>)getInportEntries()).basicRemove(otherEnd, msgs);
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__OUTPORT_ENTRIES:
				return ((InternalEList<?>)getOutportEntries()).basicRemove(otherEnd, msgs);
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__INPORT_ENTRIES:
				return getInportEntries();
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__OUTPORT_ENTRIES:
				return getOutportEntries();
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__INPORT_ENTRIES:
				getInportEntries().clear();
				getInportEntries().addAll((Collection<? extends FailureModeInportEntry>)newValue);
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__OUTPORT_ENTRIES:
				getOutportEntries().clear();
				getOutportEntries().addAll((Collection<? extends FailureModeOutportEntry>)newValue);
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__INPORT_ENTRIES:
				getInportEntries().clear();
				return;
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__OUTPORT_ENTRIES:
				getOutportEntries().clear();
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
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__INPORT_ENTRIES:
				return inportEntries != null && !inportEntries.isEmpty();
			case FailurePropagationMatricesPackage.FAILURE_MODE_MATRIX_ROW__OUTPORT_ENTRIES:
				return outportEntries != null && !outportEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FailureModeMatrixRowImpl
