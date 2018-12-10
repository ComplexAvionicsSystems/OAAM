/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.Resource;
import de.oaam.model.oaam.library.ResourceLink;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceLinkImpl#getIn <em>In</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.ResourceLinkImpl#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceLinkImpl extends OaamBaseElementAImpl implements ResourceLink {
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.RESOURCE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getIn() {
		if (in == null) {
			in = new EObjectResolvingEList<Resource>(Resource.class, this, LibraryPackage.RESOURCE_LINK__IN);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getOut() {
		if (out == null) {
			out = new EObjectResolvingEList<Resource>(Resource.class, this, LibraryPackage.RESOURCE_LINK__OUT);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.RESOURCE_LINK__IN:
				return getIn();
			case LibraryPackage.RESOURCE_LINK__OUT:
				return getOut();
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
			case LibraryPackage.RESOURCE_LINK__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Resource>)newValue);
				return;
			case LibraryPackage.RESOURCE_LINK__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Resource>)newValue);
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
			case LibraryPackage.RESOURCE_LINK__IN:
				getIn().clear();
				return;
			case LibraryPackage.RESOURCE_LINK__OUT:
				getOut().clear();
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
			case LibraryPackage.RESOURCE_LINK__IN:
				return in != null && !in.isEmpty();
			case LibraryPackage.RESOURCE_LINK__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceLinkImpl
