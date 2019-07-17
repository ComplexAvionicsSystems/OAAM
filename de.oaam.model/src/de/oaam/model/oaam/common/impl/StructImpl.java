/**
 */
package de.oaam.model.oaam.common.impl;

import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.DataTypeA;
import de.oaam.model.oaam.common.Struct;

import java.lang.Boolean;
import java.lang.Integer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.impl.StructImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.impl.StructImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.impl.StructImpl#getInheritsFrom <em>Inherits From</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.impl.StructImpl#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructImpl extends DataTypeAImpl implements Struct {
	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final int ALIGNMENT_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected int alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeA> fields;

	/**
	 * The cached value of the '{@link #getInheritsFrom() <em>Inherits From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritsFrom()
	 * @generated
	 * @ordered
	 */
	protected Struct inheritsFrom;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.STRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(int newAlignment) {
		int oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STRUCT__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeA> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<DataTypeA>(DataTypeA.class, this, CommonPackage.STRUCT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct getInheritsFrom() {
		if (inheritsFrom != null && inheritsFrom.eIsProxy()) {
			InternalEObject oldInheritsFrom = (InternalEObject)inheritsFrom;
			inheritsFrom = (Struct)eResolveProxy(oldInheritsFrom);
			if (inheritsFrom != oldInheritsFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.STRUCT__INHERITS_FROM, oldInheritsFrom, inheritsFrom));
			}
		}
		return inheritsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct basicGetInheritsFrom() {
		return inheritsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritsFrom(Struct newInheritsFrom) {
		Struct oldInheritsFrom = inheritsFrom;
		inheritsFrom = newInheritsFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STRUCT__INHERITS_FROM, oldInheritsFrom, inheritsFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STRUCT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.STRUCT__ALIGNMENT:
				return getAlignment();
			case CommonPackage.STRUCT__FIELDS:
				return getFields();
			case CommonPackage.STRUCT__INHERITS_FROM:
				if (resolve) return getInheritsFrom();
				return basicGetInheritsFrom();
			case CommonPackage.STRUCT__IS_ABSTRACT:
				return isIsAbstract();
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
			case CommonPackage.STRUCT__ALIGNMENT:
				setAlignment((Integer)newValue);
				return;
			case CommonPackage.STRUCT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends DataTypeA>)newValue);
				return;
			case CommonPackage.STRUCT__INHERITS_FROM:
				setInheritsFrom((Struct)newValue);
				return;
			case CommonPackage.STRUCT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
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
			case CommonPackage.STRUCT__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case CommonPackage.STRUCT__FIELDS:
				getFields().clear();
				return;
			case CommonPackage.STRUCT__INHERITS_FROM:
				setInheritsFrom((Struct)null);
				return;
			case CommonPackage.STRUCT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
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
			case CommonPackage.STRUCT__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case CommonPackage.STRUCT__FIELDS:
				return fields != null && !fields.isEmpty();
			case CommonPackage.STRUCT__INHERITS_FROM:
				return inheritsFrom != null;
			case CommonPackage.STRUCT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
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
		result.append(" (alignment: ");
		result.append(alignment);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //StructImpl
