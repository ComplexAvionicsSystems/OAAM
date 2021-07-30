/**
 */
package de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanInportEntry;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanMatrixRow;
import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.BooleanOutportEntry;
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
 * An implementation of the model object '<em><b>Boolean Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixRowImpl#getInportEntries <em>Inport Entries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.impl.BooleanMatrixRowImpl#getOutportEntries <em>Outport Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanMatrixRowImpl extends OaamBaseElementAImpl implements BooleanMatrixRow {
	/**
	 * The cached value of the '{@link #getInportEntries() <em>Inport Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInportEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanInportEntry> inportEntries;

	/**
	 * The cached value of the '{@link #getOutportEntries() <em>Outport Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutportEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOutportEntry> outportEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanMatrixRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailurePropagationMatricesPackage.Literals.BOOLEAN_MATRIX_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanInportEntry> getInportEntries() {
		if (inportEntries == null) {
			inportEntries = new EObjectContainmentEList<BooleanInportEntry>(BooleanInportEntry.class, this, FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__INPORT_ENTRIES);
		}
		return inportEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanOutportEntry> getOutportEntries() {
		if (outportEntries == null) {
			outportEntries = new EObjectContainmentEList<BooleanOutportEntry>(BooleanOutportEntry.class, this, FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__OUTPORT_ENTRIES);
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__INPORT_ENTRIES:
				return ((InternalEList<?>)getInportEntries()).basicRemove(otherEnd, msgs);
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__OUTPORT_ENTRIES:
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__INPORT_ENTRIES:
				return getInportEntries();
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__OUTPORT_ENTRIES:
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__INPORT_ENTRIES:
				getInportEntries().clear();
				getInportEntries().addAll((Collection<? extends BooleanInportEntry>)newValue);
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__OUTPORT_ENTRIES:
				getOutportEntries().clear();
				getOutportEntries().addAll((Collection<? extends BooleanOutportEntry>)newValue);
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__INPORT_ENTRIES:
				getInportEntries().clear();
				return;
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__OUTPORT_ENTRIES:
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
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__INPORT_ENTRIES:
				return inportEntries != null && !inportEntries.isEmpty();
			case FailurePropagationMatricesPackage.BOOLEAN_MATRIX_ROW__OUTPORT_ENTRIES:
				return outportEntries != null && !outportEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BooleanMatrixRowImpl
