/**
 */
package de.oaam.model.oaam.physical.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.functions.Task;

import de.oaam.model.oaam.physical.PhysicalInterfaceA;
import de.oaam.model.oaam.physical.PhysicalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.physical.impl.PhysicalInterfaceAImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.impl.PhysicalInterfaceAImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link de.oaam.model.oaam.physical.impl.PhysicalInterfaceAImpl#getImplementedBy <em>Implemented By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PhysicalInterfaceAImpl extends OaamBaseElementAImpl implements PhysicalInterfaceA {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected String dimension = DIMENSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementedBy() <em>Implemented By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> implementedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalInterfaceAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalPackage.Literals.PHYSICAL_INTERFACE_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalPackage.PHYSICAL_INTERFACE_A__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(String newDimension) {
		String oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalPackage.PHYSICAL_INTERFACE_A__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getImplementedBy() {
		if (implementedBy == null) {
			implementedBy = new EObjectResolvingEList<Task>(Task.class, this, PhysicalPackage.PHYSICAL_INTERFACE_A__IMPLEMENTED_BY);
		}
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhysicalPackage.PHYSICAL_INTERFACE_A__UNIT:
				return getUnit();
			case PhysicalPackage.PHYSICAL_INTERFACE_A__DIMENSION:
				return getDimension();
			case PhysicalPackage.PHYSICAL_INTERFACE_A__IMPLEMENTED_BY:
				return getImplementedBy();
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
			case PhysicalPackage.PHYSICAL_INTERFACE_A__UNIT:
				setUnit((String)newValue);
				return;
			case PhysicalPackage.PHYSICAL_INTERFACE_A__DIMENSION:
				setDimension((String)newValue);
				return;
			case PhysicalPackage.PHYSICAL_INTERFACE_A__IMPLEMENTED_BY:
				getImplementedBy().clear();
				getImplementedBy().addAll((Collection<? extends Task>)newValue);
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
			case PhysicalPackage.PHYSICAL_INTERFACE_A__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case PhysicalPackage.PHYSICAL_INTERFACE_A__DIMENSION:
				setDimension(DIMENSION_EDEFAULT);
				return;
			case PhysicalPackage.PHYSICAL_INTERFACE_A__IMPLEMENTED_BY:
				getImplementedBy().clear();
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
			case PhysicalPackage.PHYSICAL_INTERFACE_A__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case PhysicalPackage.PHYSICAL_INTERFACE_A__DIMENSION:
				return DIMENSION_EDEFAULT == null ? dimension != null : !DIMENSION_EDEFAULT.equals(dimension);
			case PhysicalPackage.PHYSICAL_INTERFACE_A__IMPLEMENTED_BY:
				return implementedBy != null && !implementedBy.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (unit: ");
		result.append(unit);
		result.append(", dimension: ");
		result.append(dimension);
		result.append(')');
		return result.toString();
	}

} //PhysicalInterfaceAImpl
