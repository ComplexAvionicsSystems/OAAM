/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;
import de.oaam.model.oaam.library.IoDeclaration;
import de.oaam.model.oaam.library.IoGroup;
import de.oaam.model.oaam.library.LibraryPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.IoGroupImpl#getIos <em>Ios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoGroupImpl extends OaamBaseElementAImpl implements IoGroup {
	/**
	 * The cached value of the '{@link #getIos() <em>Ios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIos()
	 * @generated
	 * @ordered
	 */
	protected EList<IoDeclaration> ios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.IO_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IoDeclaration> getIos() {
		if (ios == null) {
			ios = new EObjectResolvingEList<IoDeclaration>(IoDeclaration.class, this, LibraryPackage.IO_GROUP__IOS);
		}
		return ios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.IO_GROUP__IOS:
				return getIos();
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
			case LibraryPackage.IO_GROUP__IOS:
				getIos().clear();
				getIos().addAll((Collection<? extends IoDeclaration>)newValue);
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
			case LibraryPackage.IO_GROUP__IOS:
				getIos().clear();
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
			case LibraryPackage.IO_GROUP__IOS:
				return ios != null && !ios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IoGroupImpl
