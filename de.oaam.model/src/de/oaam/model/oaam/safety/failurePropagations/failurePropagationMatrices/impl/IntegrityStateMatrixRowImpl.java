/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesPackage;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateInportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.IntegrityStateOutportEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integrity State Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixRowImpl#getInportEntries <em>Inport Entries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.IntegrityStateMatrixRowImpl#getOutportEntries <em>Outport Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrityStateMatrixRowImpl extends OaamBaseElementAImpl implements IntegrityStateMatrixRow {
	/**
	 * The cached value of the '{@link #getInportEntries() <em>Inport Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInportEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrityStateInportEntry> inportEntries;

	/**
	 * The cached value of the '{@link #getOutportEntries() <em>Outport Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutportEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrityStateOutportEntry> outportEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrityStateMatrixRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.INTEGRITY_STATE_MATRIX_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrityStateInportEntry> getInportEntries() {
		if (inportEntries == null) {
			inportEntries = new EObjectContainmentEList<IntegrityStateInportEntry>(IntegrityStateInportEntry.class, this, FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__INPORT_ENTRIES);
		}
		return inportEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrityStateOutportEntry> getOutportEntries() {
		if (outportEntries == null) {
			outportEntries = new EObjectContainmentEList<IntegrityStateOutportEntry>(IntegrityStateOutportEntry.class, this, FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__OUTPORT_ENTRIES);
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__INPORT_ENTRIES:
				return ((InternalEList<?>)getInportEntries()).basicRemove(otherEnd, msgs);
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__OUTPORT_ENTRIES:
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__INPORT_ENTRIES:
				return getInportEntries();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__OUTPORT_ENTRIES:
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__INPORT_ENTRIES:
				getInportEntries().clear();
				getInportEntries().addAll((Collection<? extends IntegrityStateInportEntry>)newValue);
				return;
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__OUTPORT_ENTRIES:
				getOutportEntries().clear();
				getOutportEntries().addAll((Collection<? extends IntegrityStateOutportEntry>)newValue);
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__INPORT_ENTRIES:
				getInportEntries().clear();
				return;
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__OUTPORT_ENTRIES:
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
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__INPORT_ENTRIES:
				return inportEntries != null && !inportEntries.isEmpty();
			case FailurePropagationMatricesPackage.INTEGRITY_STATE_MATRIX_ROW__OUTPORT_ENTRIES:
				return outportEntries != null && !outportEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegrityStateMatrixRowImpl
